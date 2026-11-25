package org.integratedmodelling.klab.services.reasoner.internal;

import java.nio.file.*;
import java.util.*;
import org.integratedmodelling.common.data.jackson.JacksonConfiguration;
import org.integratedmodelling.klab.api.knowledge.*;
import org.integratedmodelling.klab.services.resources.storage.M49CompositionSourceLoader;

/** Replay a complete baseline or candidate in a private Resources/Reasoner environment. */
public class AdmissionCheck {
    public static void main(String[] args) throws Exception {
        var output = Path.of(args[0]);
        var catalog = CapturedAuthorityCatalog.readPersistent(Path.of(args[1]));
        var world = M49CompositionSourceLoader.load(output.resolve("sources"), catalog.components());
        var results = new LinkedHashMap<String, Object>();
        var checks = new LinkedHashMap<String, Boolean>();
        results.put("checks", checks);
        try {
            results.put("resourcesNotifications", world.getOntologies().stream()
                    .flatMap(o -> o.getNotifications().stream()).map(Object::toString).toList());
            checks.put("Resources adapted 26 ontologies and two strategies",
                    world.getOntologies().size() == 26 && world.getObservationStrategies().size() == 2);
            var core = new LinkedHashMap<>(CoreOntologyCatalog.bundledCore());
            byte[] odo = Files.readAllBytes(Path.of(args[2]));
            core.put("odo.owl", odo);
            String locator = world.getOntologies().stream().flatMap(o -> o.getOwlImports().stream())
                    .filter(p -> p.getFirst().equals("odo")).findFirst().orElseThrow().getSecond();
            String hash = HexFormat.of().formatHex(java.security.MessageDigest.getInstance("SHA-256").digest(odo));
            results.put("odoSha256", hash);
            var factory = new SemanticEnvironmentFactory(output.resolve("assets"), core,
                    Map.of("odo", locator), Map.of("odo", hash), catalog);
            var input = factory.capture(world);
            var built = factory.build(input, () -> false);
            results.put("beanStatus", input.beanStatus());
            results.put("logicalStatus", built.logicalStatus());
            results.put("diagnostics", built.diagnostics());
            checks.put("bean and logical validation", input.beanStatus().toString().equals("VALID")
                    && built.logicalStatus().toString().equals("VALID"));
            try (var state = Objects.requireNonNull(built.state(), "No accepted candidate state")) {
                var actor = state.actor();
                var owl = actor.owl();
                checks.put("consistent", owl.isConsistent());
                checks.put("all named concepts satisfiable", owl.getUnsatisfiableClasses()
                        .entities().allMatch(c -> c.isOWLNothing()));
                var vote = actor.resolveConcept("agency:ChoiceCommitment");
                var membership = actor.resolveConcept("society:OrganizationMembership");
                var event = actor.resolveConcept("imod:Event");
                checks.put("a decisive vote can be observed as a commitment event",
                        vote.is(SemanticType.EVENT) && actor.is(vote, event));
                checks.put("membership is a directed structural relationship",
                        membership.is(SemanticType.STRUCTURAL) && membership.is(SemanticType.UNIDIRECTIONAL)
                        && membership.is(SemanticType.RELATIONSHIP));
                checks.put("membership endpoints are Agent to Organization",
                        actor.relationshipSource(membership).getUrn().equals(actor.resolveConcept("imod:Agent").getUrn())
                        && actor.relationshipTarget(membership).getUrn().equals(actor.resolveConcept("society:Organization").getUrn()));
                if (args[3].equals("candidate")) {
                    var admission = actor.resolveConcept("society:OrganizationMembershipAdmission");
                    checks.put("effective admission is a satisfiable countable event",
                            actor.satisfiable(admission) && actor.is(admission, event)
                            && admission.is(SemanticType.EVENT) && admission.is(SemanticType.COUNTABLE));
                    var readings = List.of(vote, admission, membership);
                    for (var left : readings) for (var right : readings) {
                        if (left != right) checks.put(left.getUrn() + " does not entail " + right.getUrn(),
                                !actor.is(left, right));
                    }
                    checks.put("a vote has no declared admission or membership creation",
                            actor.created(vote).stream().noneMatch(c -> actor.is(c, admission) || actor.is(c, membership)));
                    checks.put("membership observation supplies no admission event",
                            actor.created(membership).stream().noneMatch(c -> actor.is(c, admission)));
                }
            }
        } finally {
            Files.write(output.resolve("results.json"), JacksonConfiguration.newObjectMapper()
                    .writerWithDefaultPrettyPrinter().writeValueAsBytes(results));
        }
        if (checks.containsValue(false)) throw new AssertionError(checks);
    }
}
