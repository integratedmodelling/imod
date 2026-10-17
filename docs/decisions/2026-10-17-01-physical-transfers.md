# Seed physics with three energy-transfer processes - 2026-10-17

## Scope and source trail

Conduction, convective heat transport and radiative energy transfer name three
mechanisms rather than body classes or numerical transfer laws. They are not
declared disjoint: more than one can occur in the same observation. Contact is
not an assertion of nonzero net transfer. Temperature, stored energy and energy
transferred remain different descriptions; no universal temperature increase or
equilibration follows. The examples are contact heating, heat carried by fluid
motion and radiation across a vacuum.

The bootstrap physics-ThermalConduction, physics-ConvectiveHeatTransport and
physics-RadiativeEnergyTransfer entries provide the starting meanings and
NASA-THERMAL source trail. Their proposed effects and incomplete parameter lists
are not promoted. Mechanical/vector quantities, thermal-body individuation and
transferred-energy inherency remain review items.

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

- `physics:ThermalConduction` uses implicit Process ancestry.
- `physics:ConvectiveHeatTransport` uses implicit Process ancestry.
- `physics:RadiativeEnergyTransfer` uses implicit Process ancestry.

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
