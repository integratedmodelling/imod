# Seed water soil and geological process vocabulary - 2026-10-17

## Scope and source trail

Hydrology names channel flow, overland flow and infiltration. Oceanography
names marine-water advection, with Upwelling and Downwelling as directional
specializations. Geology names sediment transport and lithification; Soil names
compaction and leaching. These are process meanings without an asserted
universal effect, new material individual, episode, body hierarchy or participant
restriction.

The geology bootstrap proposes LandformingProcess as a parent for transport and
lithification. That parent requires Earth-surface morphological change, which
is not part of every occurrence covered here. The seed therefore uses implicit
Process ancestry. Sediment movement is distinct from deposition, and
consolidation is distinct from recognizing a new rock-body identity.

Marine directional transport specializes the locally declared advection process.
Neither nutrient enrichment nor a parcel's changed temperature or composition
is asserted. A moving material parcel and a fixed recipient region remain
different supports. Infiltration does not imply groundwater recharge; channel
identity is not water-body identity. Leaching is distinct from excavation and
does not imply removal of all solute. Compaction is distinct from a comparative
Compacted predicate or a density reading alone.

Bootstrap source trails: hydrology streamflow/runoff/infiltration, oceanography
O2/O3/O4/O5, geology L1, soil S3/S2. The SoilLeaching dossier records incomplete
retrieval of its full source and unresolved solute/horizon bindings. Only the
basic process meaning is seeded here; source adequacy and those bindings remain
explicit review items. Downwelling had no direct question incidence in the old
packet; its current justification is the downward-transport distinction and
the counterexample of particles sinking without bulk water movement. Retention
in the minimal Tier 1 gateway remains open to review.

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

- `hydrology:ChannelFlow` uses implicit Process ancestry.
- `hydrology:OverlandFlow` uses implicit Process ancestry.
- `hydrology:Infiltration` uses implicit Process ancestry.
- `oceanography:OceanWaterAdvection` uses implicit Process ancestry.
- `oceanography:Upwelling` specializes `oceanography:OceanWaterAdvection`.
- `oceanography:Downwelling` specializes `oceanography:OceanWaterAdvection`.
- `geology:SedimentTransport` uses implicit Process ancestry.
- `geology:Lithification` uses implicit Process ancestry.
- `soil:SoilCompaction` uses implicit Process ancestry.
- `soil:SoilLeaching` uses implicit Process ancestry.

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
