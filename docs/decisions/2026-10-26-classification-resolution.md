# Classification resolution contract candidate - 2026-10-26

This isolated candidate accompanies Services develop 402c13723b292486a69be7bf01e33b2c9d981fca.
It changes no ontology declarations.

`observing P of each R` ensures native members exist and classifies them. A dependency
`observing each P R`, with an abstract predicate or a concrete predicate selected by `any`,
uses the same member plan and exposes the dependency's observations. CLASSIFICATION remains
an effect-only operation with observation ID zero; only dependencies create observations.
Ordinary concrete qualification without `any` retains its observation semantics.

Classification requires nonempty geometry from the explicit request, context, or observer.
It does not require an already observed singular native context. Accordingly the runtime-essential
strategy change removes `ensure context.exists()` only from `classification.members`.
`characterization.direct` retains its context requirement. No new strategy-language feature is needed.

Already admissibly classified members succeed without classifier invocation or identity/predicate
mutation. Bookkeeping can still be recorded. If no classifier is usable, Services can compile an
explicit satisfaction check: unknown, missing and nonmatching classifications fail. A completed
empty cohort differs from unknown membership. The intrinsic check and partial completed-cohort
view validate captured members/contributors and root-commit guards. Existing classifier-selected
reuse retains its prior read-stability behavior.

Partial qualified inputs expose the existing completed-cohort query view over reused plus newly
generated members, certified after dependency execution. The bounded normalization handles one
selected predicate on a bare native subject/agent collective. Multiple selected predicates are
rejected; unsupported residual qualifications and generic/pattern/observer/value wrappers are
left to existing resolution, not silently erased. Full spatial/temporal slabs are supported;
arbitrary multidimensional tilings and repeated equivalent aliases are not claimed. Direct root
semantic-update submissions remain rejected by Runtime's operation/observation boundary.

## Coordinated publication requirements

Verified baselines: imod master 556f3562aad44ead96d2b1e646a67664901e1fc5 and
worldview/strawman-2026 b9834b519ea805016ddbc510091a3fdec6573d21. Their original
observations.obs files share blob acccacc3e61c05e170a65cfd7e634e8956f9e731, including both
classification.members and characterization.direct. The older git/imod checkout is not evidence
that published master lacks these strategies.

Carry the same small strategy delta and this contract note to both branches, together with the
compatible Services build; do not sweep experimental strawman ontology changes into master.
Services corrects the reflexive semantic-closure boundary: a satisfiable concept belongs to its own semantic closure. Abstract self remains there and is excluded only by concrete filtering. The generator is unchanged; its concrete-closure filter now receives the contractual reflexive set.
Canonical predicate expression status is projected in Services hierarchy responses; missing syntax
fails closed. Strict model admission must retain selected collective-classification obligations,
including concrete any. Native persisted member snapshots preserve immutable binary property values.

Recheck remote heads and publish only after approval. No commits, pushes or deployment are authorized
by this note. Staging's separate candidate adds only tentative query definitions and usage notes;
it does not add an actor runner, inspector assertions or a Maven test harness.

## Acceptance record

The untouched Services baseline reproduced the original staging rejection at the singular-context
classifier guard. The candidate completed the original source with explicit geometry and no initial
context observation. Separate original-form and qualified-form no-op runs preserved prior member
identities and predicates without instantiation. A settled-revision fresh qualified run also completed.

Final mixed-support acceptance reused 21 committed Region members and added 12 newly generated
members through one additional native producer, exposing a 34-member cohort including the new qualified consumer root. Both native producer
identities were retained, all prior member IDs/predicates stayed unchanged, and classification recorded
12 CLASSIFIER plus 22 EXISTING members. An original-form no-op over this completed cohort recorded
35 EXISTING members (including its new source-qualified root), with no producer or instantiation added.
The concrete-any probe on the final Runtime succeeded with the unchanged generator and selected the
concrete predicate itself. These are real local stack results, distinct from controlled consumer fixtures.

The broader test union retains documented baseline assertion failures; it is not a fully green build.
A separate existing job polling/cache race produced missing client results, including one setup whose
successful durable commit was independently checked before reuse. No job-transport fix is included.
Exact contexts, activities, tests, limitations and patch identities are in the task's final handoff.
The live audit verifies union and identities; native observation geometry describes the full request.
Execution exclusively over the missing spatial fragment was not separately asserted in the audit.
