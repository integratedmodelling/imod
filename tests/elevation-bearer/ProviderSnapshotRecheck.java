package org.integratedmodelling.klab.services.reasoner.internal;

import java.nio.file.*;
import java.util.*;
import static org.mockito.Mockito.*;
import org.integratedmodelling.common.data.jackson.JacksonConfiguration;
import org.integratedmodelling.klab.services.resources.storage.M49CompositionSourceLoader;

/** Current compiler, exact current source, verified historical authority bytes; no live acceptance. */
public class ProviderSnapshotRecheck {
  private static void require(boolean condition, String message) {
    if (!condition) throw new AssertionError(message);
  }

  private static org.semanticweb.owlapi.model.OWLClass owlClass(
      org.integratedmodelling.klab.services.reasoner.ReasonerService actor,
      org.integratedmodelling.klab.api.knowledge.Concept concept) {
    try {
      var method = actor.owl().getClass().getDeclaredMethod("getOWLClass",
          org.integratedmodelling.klab.api.knowledge.Concept.class);
      method.setAccessible(true);
      return (org.semanticweb.owlapi.model.OWLClass) method.invoke(actor.owl(), concept);
    } catch (ReflectiveOperationException failure) { throw new IllegalStateException(failure); }
  }

  private static org.integratedmodelling.klab.api.lang.kim.KimNamespace parseNamespace(String source) throws Exception {
    var manager = M49CompositionSourceLoader.lastManager;
    var parser = org.integratedmodelling.klab.services.resources.storage.WorkspaceManager.class;
    var field = parser.getDeclaredField("namespaceParser"); field.setAccessible(true);
    var parserType = Class.forName(parser.getName() + "$KimParser");
    var constructor = parserType.getDeclaredConstructor(); constructor.setAccessible(true);
    field.set(manager, constructor.newInstance());
    var method = parser.getDeclaredMethod("readNamespace", String.class, long.class, String.class, String.class);
    method.setAccessible(true);
    var namespace = (org.integratedmodelling.klab.api.lang.kim.KimNamespace)
        method.invoke(manager, source, 1L, "klab.staging.vxii", "staging.vxii.basic");
    require(namespace.getNotifications().stream().noneMatch(n -> n.getLevel().severity >= 3),
        "Source parse errors: " + namespace.getNotifications());
    return namespace;
  }

  private static void verifyModelsAndStrategies(org.integratedmodelling.klab.services.reasoner.ReasonerService actor,
      Map<String,Object> report, Path basic, boolean corrected) throws Exception {
    var compatibility = new org.integratedmodelling.klab.services.reasoner.owl.OWLSemanticClauseSupport(actor.owl());
    var modeled = actor.resolveConcept("earth:Terrestrial earth:Region");
    var elevation = actor.resolveConcept("geography:Elevation");
    var relation = compatibility.clauseCompatibility(elevation,
        org.integratedmodelling.klab.api.knowledge.SemanticRole.INHERENT, modeled);
    report.put("cotechinoElevationCompatibility", relation);
    String original = Files.readString(basic);
    report.put("basicSourceSha256", org.integratedmodelling.klab.api.services.reasoner.objects.SemanticValidationRequest.sourceHash(original));
    int start = original.indexOf("private model earth:Terrestrial earth:Region");
    require(start >= 0, "Pinned cotechino model missing");
    int end = original.indexOf(';', start) + 1;
    int headerEnd = original.indexOf(';') + 1;
    var prefix = new StringBuilder(original.substring(0, start).replaceAll("[^\\r\\n]", " "));
    prefix.replace(0, headerEnd, original.substring(0, headerEnd));
    var source = prefix + original.substring(start, end);
    var diagnostics = new DocumentSemanticValidator(actor).validate(parseNamespace(source));
    report.put("cotechinoDiagnostics", diagnostics);
    report.put("cotechinoSourceOffsets", List.of(start, end));
    if (corrected) {
      require(relation == org.integratedmodelling.klab.services.reasoner.owl.OWLSemanticClauseSupport.Compatibility.COMPATIBLE,
          "Corrected Elevation still requires a narrower modeled bearer: " + relation);
      require(diagnostics.stream().noneMatch(n -> n.getLevel().severity >= 3), "Cotechino source rejected: " + diagnostics);
    } else {
      require(diagnostics.stream().anyMatch(n -> n.getLevel().severity >= 3
          && n.getMessage().contains("MODEL_DEPENDENCY_UNRESOLVED") && n.getMessage().contains("geography:Elevation")),
          "Original source unexpectedly lost its bearer obligation");
    }
    var bearers = new LinkedHashMap<String,String>();
    for (var name : List.of("geography:Elevation", "geography:Terrain", "geography:Aspect", "geography:Slope", "geography:TopographicHeterogeneity"))
      bearers.put(name, String.valueOf(actor.inherent(actor.resolveConcept(name))));
    report.put("effectiveBearers", bearers);
    var terrainConcept = actor.resolveConcept("geography:Terrain");
    var terrainBounds = compatibility.bearerConstraints(terrainConcept);
    report.put("completeTerrainBearerBounds", terrainBounds.stream().map(b -> b.filler().toString()).toList());
    var withoutCrust = compatibility.clauseCompatibility(terrainConcept,
        org.integratedmodelling.klab.api.knowledge.SemanticRole.INHERENT, modeled);
    var withCrust = compatibility.clauseCompatibility(terrainConcept,
        org.integratedmodelling.klab.api.knowledge.SemanticRole.INHERENT,
        actor.resolveConcept("earth:Crust earth:Terrestrial earth:Region"));
    report.put("terrainWithoutCrustCompatibility", withoutCrust);
    report.put("terrainWithCrustCompatibility", withCrust);
    require(withoutCrust != org.integratedmodelling.klab.services.reasoner.owl.OWLSemanticClauseSupport.Compatibility.COMPATIBLE
        && withCrust == org.integratedmodelling.klab.services.reasoner.owl.OWLSemanticClauseSupport.Compatibility.COMPATIBLE,
        "Complete Terrain bearer constraint changed: " + withoutCrust + " / " + withCrust);
    require(bearers.get("geography:Aspect").contains("Crust"), "Aspect lost its inherited Terrain restriction");
    if (corrected) require(!bearers.get("geography:Elevation").contains("Crust"), "Elevation still carries Crust");
    var controls = new LinkedHashMap<String,Object>();
    for (var subject : List.of("earth:Location", "earth:Aquatic earth:Region")) {
      var negative = new DocumentSemanticValidator(actor).validate(parseNamespace(
          "namespace staging.vxii.basic version 1.0;\nmodel " + subject + " observing geography:Elevation in m;"));
      controls.put(subject, negative);
      require(negative.stream().anyMatch(n -> n.getLevel().severity >= 3), "Unproved bearer admitted: " + subject);
    }
    report.put("negativeBearerControls", controls);
    var resources = actor.serviceScope().getService(org.integratedmodelling.klab.api.services.ResourcesService.class);
    var context = mock(org.integratedmodelling.klab.api.scope.ContextScope.class);
    when(context.getService(org.integratedmodelling.klab.api.services.Reasoner.class)).thenReturn(actor);
    when(context.getService(org.integratedmodelling.klab.api.services.ResourcesService.class)).thenReturn(resources);
    var observation = new org.integratedmodelling.klab.api.knowledge.observation.impl.ObservationImpl();
    observation.setObservable(actor.resolveObservable("earth:Terrestrial earth:Region"));
    when(context.getContextObservation()).thenReturn(observation);
    var strategies = new LinkedHashMap<String,List<String>>();
    for (var expression : List.of("each earth:Freshwater earth:Region", "geography:Elevation in m", "geography:Slope in degree_angle",
        "earth:PhysicalEnvironment of each earth:Region")) {
      var request = new org.integratedmodelling.klab.api.knowledge.observation.impl.ObservationImpl();
      request.setObservable(actor.resolveObservable(expression));
      var selected = actor.computeObservationStrategies(request, context).stream().map(s -> s.getUrn()).toList();
      strategies.put(expression, selected);
      require(!selected.isEmpty(), "No strategy selected for " + expression);
    }
    var height = new org.integratedmodelling.klab.api.knowledge.observation.impl.ObservationImpl();
    height.setObservable(actor.resolveObservable("physical:Height in m"));
    require(actor.computeObservationStrategies(height, context).isEmpty(), "Explicit abstract Height became executable");
    report.put("strategySelection", strategies);
    report.put("explicitAbstractHeightRejected", true);
  }
  public static void main(String[] args) throws Exception {
    Path output = Path.of(args[0]), captured = Path.of(args[1]), source = Path.of(args[2]);
    Files.createDirectories(output);
    Files.writeString(output.resolve("private-jvm-pid.txt"), Long.toString(ProcessHandle.current().pid()));
    M49FixtureAudit.install();
    System.setProperty("land.audit.phase", "candidate");
    var mapper = JacksonConfiguration.newObjectMapper();
    var report = new LinkedHashMap<String,Object>();
    report.put("servicesCommit", "547c84a1cf06048e0cb8b19eb1ab9e5d0379adc1");
    report.put("scope", "Current full parsed source with verified frozen provider capture; offline private replay, not deployed acceptance");
    report.put("authorityCaptureRoot", captured.toString());
    try {
      var catalog = CapturedAuthorityCatalog.capture(captured);
      var world = M49CompositionSourceLoader.load(source, catalog.components());
      report.put("ontologies", world.getOntologies().size());
      report.put("strategyDocuments", world.getObservationStrategies().size());
      report.put("authorityBindings", world.getAuthorityBindings());
      var terrainDeclaration = world.allConceptStatements().stream()
          .filter(s -> s.getUrn().equals("geography:Terrain")
              || s.getNamespace().equals("geography") && s.getUrn().equals("Terrain"))
          .findFirst().orElseThrow();
      var triggers = terrainDeclaration.getEmergenceTriggers().stream().map(c -> c.getUrn()).toList();
      report.put("declaredTerrainEmergenceTriggers", triggers);
      require(triggers.stream().anyMatch(t -> t.contains("geography:Elevation")), "Terrain lost its Elevation emergence trigger");
      var hashes = new TreeMap<String,String>();
      for (var ontology : world.getOntologies())
        hashes.put(ontology.getUrn(), org.integratedmodelling.klab.api.services.reasoner.objects.SemanticValidationRequest.sourceHash(ontology.getSourceCode()));
      report.put("sourceHashes", hashes);
      var factory = SemanticEnvironmentFactory.fromLocalCatalog(output.resolve("assets"),
          Files.createDirectories(output.resolve("empty-catalog")), captured);
      var input = factory.capture(world);
      report.put("beanStatus", input.beanStatus());
      report.put("captureDiagnostics", input.diagnostics());
      var compiled = factory.build(input, () -> false);
      report.put("logicalStatus", compiled.logicalStatus());
      report.put("candidateDiagnostics", compiled.diagnostics());
      if (compiled.state() != null) try (var state = compiled.state()) {
        var actor = state.actor();
        report.put("consistent", actor.owl().isConsistent());
        report.put("unsatisfiableNamedClasses", actor.owl().getUnsatisfiableClasses().entities()
            .filter(c -> !c.isOWLNothing()).map(c -> c.getIRI().toString()).toList());
        var elevation = actor.resolveConcept("geography:Elevation");
        report.put("elevationAbstract", elevation.isAbstract());
        report.put("effectiveElevationBearer", String.valueOf(actor.inherent(elevation)));
        var terrain = actor.resolveConcept("geography:Terrain");
        var triggerClasses = terrainDeclaration.getEmergenceTriggers().stream()
            .filter(c -> c.getUrn().contains("geography:Elevation"))
            .map(actor::declareConcept).map(c -> owlClass(actor, c)).collect(java.util.stream.Collectors.toSet());
        var triggerAxioms = actor.owl().getOntology("geography").getOWLOntology()
            .subClassAxiomsForSubClass(owlClass(actor, terrain))
            .filter(a -> a.objectPropertiesInSignature().anyMatch(p -> p.getIRI().toString().endsWith("emergesFrom")))
            .filter(a -> a.classesInSignature().anyMatch(triggerClasses::contains))
            .map(Object::toString).toList();
        report.put("compiledTerrainElevationEmergenceAxioms", triggerAxioms);
        require(!triggerAxioms.isEmpty(), "Compiled Terrain/Elevation emergence relation missing");
        if (args.length > 3) verifyModelsAndStrategies(actor, report, Path.of(args[3]),
            args.length > 4 && args[4].equals("corrected"));
      }
      report.put("pass", input.beanStatus() == CandidatePublicationCoordinator.BeanStatus.VALID
          && compiled.logicalStatus() == CandidatePublicationCoordinator.LogicalStatus.VALID
          && world.getOntologies().size() == 26 && world.getObservationStrategies().size() == 2
          && Boolean.TRUE.equals(report.get("consistent"))
          && report.get("unsatisfiableNamedClasses") instanceof List<?> unsatisfiable && unsatisfiable.isEmpty()
          && Integer.parseInt(System.getProperty("land.audit.restoreConfiguration.candidate", "0")) == 1
          && Integer.parseInt(System.getProperty("land.audit.configure.candidate", "0")) == 0
          && M49FixtureAudit.denied.isEmpty());
    } catch (Throwable failure) {
      report.put("pass", false); report.put("error", failure.toString());
      failure.printStackTrace();
    } finally {
      report.put("providerCalls", M49FixtureAudit.counters());
      report.put("networkAttempts", M49FixtureAudit.denied);
      mapper.writerWithDefaultPrettyPrinter().writeValue(output.resolve("result.json").toFile(), report);
    }
    System.exit(Boolean.TRUE.equals(report.get("pass")) ? 0 : 1);
  }
}
