# Organization, agency and minimal-strawman scope — 2026-10-16

## Approved Organization meaning

The user approved replacing the underspecified society:Institution Agent with
abstract society:Organization: "A collective agent capable of acting as a unit,
including determining aspects of its own observable evolution."

Capacity to act on self or others is the relevant distinction; merely undergoing
change or sharing opinions does not alone establish collective agency. Recognizable
collective unity supports interaction with the entity as a unit. Continuity,
collapse and spatial/temporal reach are examples where applicable, not mandatory
behaviors of every specialization. Deliberation, intentionality, human likeness,
legal status and formal constitution are not prerequisites of the general kind.

## Approved migration and SocialAgent retirement

Replace agent Institution with abstract agent Organization in src/society.kwv.
Institution is left out until a distinct meaning is agreed; no equivalence alias
or formally constituted subclass is asserted. Formal constitution and its possible
predicate remain unimplemented discussion items.

The user separately approved retiring agency:SocialAgent. Remove that declaration
and its attached review annotation, without adding a replacement alias or a reverse
Agency-to-Society dependency. Life SocialGroup and the unrelated SocialObject
source and annotations are unchanged. Older SocialObject wording remains a separate
review matter; removal of SocialAgent does not settle its meaning.

Before these edits, active src/ and strategies/ had no dependent Institution or
SocialAgent references requiring rewriting. SocialAgent remains in historical
snapshots, bootstrap/review material and the separate ~/git/imod/src/decision.kwv
checkout; those sources were not rewritten. Broader local search could not inspect
~/git/klab-modeler because access was denied. External consumers need meaning
review; no global absence or automatic equivalence migration is claimed.

The Human identity, exact TAXA identifier, HumanIndividual composition, namespace
imports and domains are preserved. Organization does not inherit MaterialBody.
Core Agent–Subject disjointness remains unchanged.

## General Agent prose alignment

The user approved replacing generic Agent's intentionality-only gloss with capacity
for action on others or self. Root Agent commentary and the generic Agency domain
and namespace introductions now reflect that clarification. Non-prose tokens in the
prose-only packet match the base. The core Agent alias, domains and optional
characterizations are unchanged. Explicitly narrower Intentional, Decision, Planned
and Achievement meanings are untouched.

The practical scope is creating agent observations and managing roles in knowledge
graphs. No comprehensive philosophical agency contract, new characterization,
permission rule, constitution semantics, PROV mapping or runtime mechanism is added.
Intentionality remains relevant to deliberative agency without being required of
all agents. Historical documentation and external ODO files are not rewritten.

## Dispositions and formal part-of relations deferred

The user approved leaving dispositions and formal part-of relations out of the
minimal coherent community strawman. This is a scope decision, not a rejection of
ordinary scientific descriptions of components, constituents or parts.

Remove the unused imod:Capability Attribute stub and its artifact-philosophy
citation. A fresh exact-name check of active src/ and strategies/ found only its
declaration and docstring, with no consumers. Capability was not itself mapped to
an ODO Disposition. Remove "and dispositions" from the Agency introduction.

Retain physical:Coupling and physical:Decoupling as processes meaning building
and destruction of interactions. Remove only their speculative sentences about
changing mereological identity by creating or destroying groups. Preserve
physical:Dissipation and its ordinary parts prose.

Relocate the Mantle review annotation from src/earth.kwv here:
"unsure of the mereological relationships here". The unresolved review question
is deferred; Mantle and its rocky-interior-layer definition are preserved.

The following historical BOOTSTRAP proposals are excluded from implementation
pending separate approval and relation design. The dossiers are not rewritten:

- life/BOOTSTRAP.md:245 CellPart and :255 OrganPart;
- genetics/BOOTSTRAP.md:235 GenePart and :255 ChromosomeInCell;
- geology/BOOTSTRAP.md:336 GrainConstituentOf;
- soil/BOOTSTRAP.md:340 AggregateConstituentOf;
- infrastructure/BOOTSTRAP.md:286 ContainsComponent (already blocked).

All paths above are under experiments/strawman-2026/bootstrap/. Ordinary component
and constituent descriptions remain allowed without implementing these relations.
Core ODO isPartOf and isConstituentOf properties, runtime/spatial containment
operators and agency:Potential are untouched. Root System parts prose,
MaterialBody constituents, Sea's ocean description and ordinary Agent/Organization
capacity-to-act wording remain intact.

## Validation boundary and exact final capture

Base: 5c509e7c4e74cbf9591c8768006a040bb4d7f130 on
worldview/strawman-2026. These changes are uncommitted. The initial Society corpus
was captured before the later Agent-prose alignment and SocialAgent retirement;
its validation must not be presented as covering these final bytes. A fresh combined
capture is required before integration. No builds, tests or service operations were
performed by this editing task.

Final combined source SHA256 (source edits now held for validation capture):

- src/society.kwv: 31ea4832c263d3507fdd64c9e1708c9fa1aeec8a2659af97f4b2f6b2b90fa308
- src/imod.kwv: 7a56d12629f2206d9f3771d290137f244356ba52f023247d9dcd787f7e07f113
- src/agency.kwv: eea208ac56ee5a10c798ffcca403780f33cb56d71fa53daf921bf03c60d3150e
- src/physical.kwv: bb6ca602b337250d01ca35e62017370fa0dc816dc27974ed91a0ec40b2ad39eb
- src/earth.kwv: 0bfc94d495ea87d81ff48bc0a384ea0dfc035131f2cee68f7a1ec8e93ff77945
