# Seed assembly irrigation and tillage activities - 2026-10-17

## Scope and source trail

ProductAssembly is narrowed to intentional production of a new artifact
entity. It specializes infrastructure:ArtifactProduction, whose independent
explicit abstract flag remains intact. Reassembly or joining parts of a
continuing artifact does not necessarily fall under this production reading.
No device taxonomy, functional disposition or automatic creates assertion is
introduced. The bootstrap engineering-ProductAssembly entry and its NASA trail
distinguish physical assembly from editing a bill of materials.

Irrigation and Tillage specialize physical:Activity, following the direct named
operation pattern already used by Sowing. No generic AgriculturalProcessIdentity
or mandatory process classification is introduced. Irrigation is deliberate
water application for crop cultivation, not rainfall, plant uptake or an implied
yield. Tillage is agricultural mechanical soil disturbance, not a land-use
label. Equipment, size and method are left open. The bootstrap land-Irrigation
and land-Tillage entries retain their FAO-WATER/FAO-CA source trail.

The wider water-application family, cross-sector Harvesting, holdings and field
unity, crop/group bearers and the ICC identity contract remain undecided. Existing
Cultivated and Harvested provenance attributes and Resource role are unchanged;
no provenance attribute is replaced with a participation role.

## Declaration contract

These are owner-authorized local strawman additions for subsequent namespace
review, not a claim of complete domain articulation or independent expert
acceptance. The corresponding BOOTSTRAP.md and dossier.json files are preserved
as research history; their earlier readiness labels are not rewritten.

Each named process is concrete without an explicit abstract keyword. Independent
explicit abstractness of Process, Activity and the artifact activity heads is
retained. The process keyword supplies upper ancestry; redundant root-parent
clauses are omitted. A narrower parent is used only where its meaning is intended.
A concrete concept is still a universal, not an instantiated occurrence or model.

No new identity requirement, authority binding, creates/affects/confers clause,
emergence trigger, formal part-of relation or exhaustive/disjoint partition is
introduced. Occurrence, participants, numerical behavior and outcomes remain
separate observational and modeling commitments. ENVO/SWEET axioms are not imported.

## Process names

- `engineering:ProductAssembly` specializes `infrastructure:ArtifactProduction`.
- `agriculture:Irrigation` specializes `physical:Activity`.
- `agriculture:Tillage` specializes `physical:Activity`.

## Validation boundary

The full corpus (26 ontology and two strategy documents) is checked as an exact
private cumulative snapshot with the current packaged production compiler, build
1.0.0-alpha1.202610171913 and language revision e1e4e90bdb37c61b15302e4b7d4a483a440d8659.
Services source HEAD is d8e16b277a616b63165b857018722bba658c0007; the reasoner
source last changed at 99b41ef6475491d93453ad4543413ddd1ddb85af. The later HEAD
changes other storage/template/observer files; the exact packaged artifacts,
rather than an assumed rebuild of all HEAD sources, are hashed in provenance.
Core OWL is captured from that reasoner package; odo.owl matches numbered ODO
0.1.1 exactly. No live models or services are exercised.

The unchanged aa5e709215e5984acd6938b5c5bac2b25a40bb33 baseline is bean VALID
and OWL-consistent but logical INVALID in this isolated route:
`Predicate earth:Terrestrial cannot qualify earth:Terrestrial earth:EarthCover: outside its applies to domain`.
The owner-authored Earth constraint is preserved. Differential validation requires
the same diagnostics, no unsatisfiable named classes, concrete satisfiable new
processes with intended ancestry, retained abstract parent flags and unchanged
Life/group/artifact/cultivation/harvest/Sowing checks. It does not certify a fully
valid complete worldview or the reported live service state.

Exact source, compiler and frozen authority evidence is task-local in
`namespace-seeds-20261017/validation-retry`. No provider configuration or lookup,
service operation, live model test, merge or remote push is included.
