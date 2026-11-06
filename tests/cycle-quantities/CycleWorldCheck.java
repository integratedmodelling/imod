package org.integratedmodelling.klab.services.reasoner.internal;

import java.nio.file.*;
import java.security.*;
import java.util.*;
import org.integratedmodelling.common.data.jackson.JacksonConfiguration;
import org.integratedmodelling.klab.api.knowledge.*;
import org.integratedmodelling.klab.services.resources.storage.M49CompositionSourceLoader;
import org.integratedmodelling.klab.services.reasoner.owl.ObservationalContainmentSupport;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

/** Whole-source replay with frozen authority captures and owned, exact ODO bytes. */
public class CycleWorldCheck {
  static final Map<String, Boolean> checks = new LinkedHashMap<>();
  static void check(String name, boolean ok) { checks.put(name, ok); }
  static OWLClass cls(org.integratedmodelling.klab.services.reasoner.owl.OWL owl, Concept c) throws Exception {
    var m = owl.getClass().getDeclaredMethod("getOWLClass", Concept.class);
    m.setAccessible(true); return (OWLClass)m.invoke(owl, c);
  }
  @SuppressWarnings("removal") public static void main(String[] args) throws Exception {
    var network = new ArrayList<String>();
    System.setSecurityManager(new SecurityManager() {
      public void checkPermission(Permission p) {}
      public void checkConnect(String host, int port) {
        if (port == -1) return;
        if ((host.equals("127.0.0.1") || host.equals("::1") || host.equals("0:0:0:0:0:0:0:1"))
            && StackWalker.getInstance().walk(s -> s.anyMatch(f -> f.getClassName().equals("sun.nio.ch.PipeImpl$Initializer$LoopbackConnector")))) return;
        network.add(host + ":" + port); throw new SecurityException("Network disabled in offline replay");
      }
    });
    var root = Path.of(args[0]); boolean fixture = args[3].equals("fixture"); boolean candidate = !args[3].equals("baseline");
    var results = new LinkedHashMap<String, Object>();
    try {
      var catalog = fixture ? CapturedAuthorityCatalog.empty() : AuthorityCaptureCompatibility.read(Path.of(args[1]));
      var world = M49CompositionSourceLoader.load(root.resolve("flat-source"), catalog.components());
      check("all expected documents adapted", world.getOntologies().size() == (fixture ? 4 : 26) && world.getObservationStrategies().size() == (fixture ? 0 : 2));
      results.put("sourceNotifications", world.getOntologies().stream().flatMap(o -> o.getNotifications().stream()).toList());
      var core = new LinkedHashMap<>(CoreOntologyCatalog.bundledCore());
      byte[] odo = Files.readAllBytes(Path.of(args[2])); core.put("odo.owl", odo);
      String locator = world.getOntologies().stream().flatMap(o -> o.getOwlImports().stream())
          .filter(p -> p.getFirst().equals("odo")).map(p -> p.getSecond()).findFirst().orElseThrow();
      String hash = HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(odo));
      results.put("odoLocator", locator); results.put("odoSha256", hash);
      var factory = new SemanticEnvironmentFactory(root.resolve("assets"), core, Map.of("odo", locator), Map.of("odo", hash), catalog);
      var input = factory.capture(world); var built = factory.build(input, () -> false);
      results.put("beanStatus", input.beanStatus()); results.put("logicalStatus", built.logicalStatus());
      results.put("diagnostics", built.diagnostics());
      check("bean VALID", input.beanStatus().toString().equals("VALID"));
      check("logical VALID", built.logicalStatus().toString().equals("VALID"));
      if (built.state() == null) throw new AssertionError("No accepted semantic state");
      try (var state = built.state()) {
        var actor = state.actor(); var owl = actor.owl();
        check("OWL consistent", owl.isConsistent());
        var unsat = owl.getUnsatisfiableClasses().entities().filter(c -> !c.isOWLNothing()).map(Object::toString).toList();
        results.put("unsatisfiable", unsat); check("zero unsatisfiable named classes", unsat.isEmpty());
        var frequency = actor.resolveConcept("physical:Frequency");
        var period = actor.resolveConcept("physical:Period");
        var cyclic = actor.resolveConcept("physical:CyclicProcess");
        var event = actor.resolveConcept("imod:Event");
        check("Frequency numerical quality, not count", frequency.is(SemanticType.QUALITY) && frequency.is(SemanticType.QUANTIFIABLE) && !frequency.is(SemanticType.NUMEROSITY));
        results.put("frequencyType", frequency.getType());
        results.put("periodType", period.getType());
        check("Period duration", period.is(SemanticType.DURATION));
        for (var quality : List.of("Frequency", "Period")) {
          var valid = actor.resolveConcept("physical:" + quality + " of physical:CyclicProcess");
          check(quality + " valid cyclic bearer", valid != null && !valid.is(SemanticType.NOTHING));
          for (var invalid : List.of("imod:Event", "imod:Subject", "imod:Process")) {
            var rejected = actor.resolveConcept("physical:" + quality + " of " + invalid);
            check(quality + " rejects " + invalid, rejected == null || rejected.is(SemanticType.NOTHING));
          }
        }
        check("Frequency cyclic-process bearer", actor.inherent(frequency) != null && actor.inherent(frequency).getUrn().equals(cyclic.getUrn()));
        check("Period same cyclic-process bearer", actor.inherent(period) != null && actor.inherent(period).getUrn().equals(cyclic.getUrn()));
        check("CyclicProcess specializes Process", actor.is(cyclic, actor.resolveConcept("imod:Process")));
        check("Event does not imply CyclicProcess", !actor.is(event, cyclic));
        var cycleUnits = new org.integratedmodelling.klab.data.mediation.UnitServiceImpl();
        var hz = actor.resolveObservable("physical:Frequency in Hz");
        var seconds = actor.resolveObservable("physical:Period in s");
        check("Frequency Hz inverse seconds", hz != null && cycleUnits.isCompatible(hz.getUnit(), cycleUnits.getUnit("s^-1")));
        check("Period seconds", seconds != null && cycleUnits.isCompatible(seconds.getUnit(), cycleUnits.getUnit("s")));
        check("Frequency and Period dimensions distinct", hz != null && seconds != null && !cycleUnits.isCompatible(hz.getUnit(), seconds.getUnit()));
        check("Period description bearer settled", built.diagnostics().stream().noneMatch(d -> d.contains("DESCRIPTION_BEARER") && d.contains("physical:Period")));
        var subject = actor.resolveConcept("imod:Subject"); var agent = actor.resolveConcept("imod:Agent");
        if (candidate) {
          var energy = actor.resolveConcept("imod:Energy");
          results.put("energyConsumerType",energy.getType());
          results.put("energyConsumerUrn",energy.getUrn());
          results.put("energyOwlType",owl.getConcept("odo:Energy").getType());
          check("Energy extensive in current consumer", energy.is(SemanticType.ENERGY) && energy.is(SemanticType.EXTENSIVE) && !energy.is(SemanticType.INTENSIVE));
          var units = new org.integratedmodelling.klab.data.mediation.UnitServiceImpl();
          var energyMetadata = new org.integratedmodelling.klab.services.reasoner.owl.OWLMetadata(cls(owl,energy),owl.getOntology("odo").getOWLOntology());
          var unitDefinition = energyMetadata.get("odo:unit");
          results.put("energyCoreUnit",unitDefinition);
          var joule = unitDefinition == null ? null : units.getUnit(unitDefinition.toString());
          check("Energy core joule unit retained", "J".equals(unitDefinition) && units.isCompatible(joule, units.getUnit("J")));
          check("kilojoule to joule conversion", joule != null && Math.abs(joule.convert(1, units.getUnit("kJ")).doubleValue() - 1000) < 1e-9);
          check("Energy dimension distinct from power", joule != null && !units.isCompatible(joule, units.getUnit("W")));
          var energyRate = owl.makeRate(energy); owl.flushReasoner();
          check("Energy rate preserves extensive nature", energyRate.is(SemanticType.EXTENSIVE) && !energyRate.is(SemanticType.INTENSIVE));
          check("Energy rate has power dimensions", units.isCompatible(units.getUnit(energyRate.getMetadata().get("odo:unit").toString()), units.getUnit("J/s")));
          check("Energy and rate satisfiable", actor.satisfiable(energy) && actor.satisfiable(energyRate));
        }
        for (var name : List.of("life:Assemblage", "life:AnatomicalAssemblage", "life:CellAssemblage")) {
          var c = actor.resolveConcept(name);
          check(name + " remains Subject", c.is(SemanticType.SUBJECT) && !c.is(SemanticType.AGENT) && actor.is(c, subject));
          if (candidate) check(name + " inherits CollectiveSubject", actor.is(c, actor.resolveConcept("imod:CollectiveSubject")));
        }
        for (var name : List.of("life:CollectiveAgent", "life:SocialGroup", "ecology:Population", "ecology:Community", "society:Organization")) {
          var c = actor.resolveConcept(name);
          check(name + " remains Agent", c.is(SemanticType.AGENT) && !c.is(SemanticType.SUBJECT) && actor.is(c, agent));
          if (candidate) {
            check(name + " inherits CollectiveAgent", actor.is(c, actor.resolveConcept("imod:CollectiveAgent")));
            check(name + " not a Subject assemblage", !actor.is(c, actor.resolveConcept("life:Assemblage")));
          }
        }
        if (candidate) {
          for (var name : List.of("life:SocialGroup", "ecology:Population", "ecology:Community"))
            check(name + " biological collective lineage", actor.is(actor.resolveConcept(name), actor.resolveConcept("life:CollectiveAgent")));
          check("Organization has no biological collective parent", !actor.is(actor.resolveConcept("society:Organization"), actor.resolveConcept("life:CollectiveAgent")));
          check("Individual not made collective", !actor.is(actor.resolveConcept("life:Individual"), actor.resolveConcept("imod:CollectiveAgent")));
          for (var name : List.of("imod:CollectiveSubject", "imod:CollectiveAgent", "life:Assemblage", "life:CollectiveAgent", "life:SocialGroup", "ecology:Population", "ecology:Community", "society:Organization")) {
            var c = actor.resolveConcept(name);
            check(name + " not observational collection", !c.isCollective());
            check(name + " no implicit containment", ObservationalContainmentSupport.declarationsForContainer(owl, c).isEmpty());
            check(name + " no native bearer", actor.inherent(c) == null);
            check(name + " no created observables", actor.created(c).isEmpty());
          }
          var field = owl.getClass().getDeclaredField("reasoner"); field.setAccessible(true);
          var dl = (OWLReasoner)field.get(owl); var df = dl.getRootOntology().getOWLOntologyManager().getOWLDataFactory();
          check("collective Subject and Agent intersection unsatisfiable", !dl.isSatisfiable(df.getOWLObjectIntersectionOf(cls(owl, actor.resolveConcept("imod:CollectiveSubject")), cls(owl, actor.resolveConcept("imod:CollectiveAgent")))));
        }
      }
    } catch (Throwable error) { results.put("failure", error.toString()); error.printStackTrace(); }
    check("zero network attempts", network.isEmpty()); results.put("networkAttempts", network); results.put("checks", checks);
    Files.write(root.resolve("RESULTS.json"), JacksonConfiguration.newObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsBytes(results));
    System.out.println("CHECKS " + checks);
    if (results.containsKey("failure") || checks.containsValue(false)) System.exit(1);
  }
}
