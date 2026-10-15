# Community strawman decisions — 2026-10-15

This record describes the reviewed local source change on `worldview/strawman-2026`.
It updates the earlier provisional domain/root proposals in the decision register
within the scope below. It does not merge or publish the branch to master.

## Root and ownership

System is an abstract Configuration. The universal PhysicalSystem specializes it;
EarthSystem supplies the Earth-specific intermediate for the six existing sphere
configurations. Life, Society and BuiltEnvironment remain universal physical anchors.
The spheres may overlap and are neither exhaustive nor disjoint.

Domain, Physical, Knowledge and Normative are pure aliases of their distinct ODO
classes. Ordinary physical anchors carry system qualifications. Named Knowledge
domains identify physical subject matter through `about`. Subject matter,
description targets and bearer inherency remain independent relations.

Geography is Knowledge about Earth. Valuation is Knowledge about Society and
includes economic, ethical, aesthetic, health and other preference contexts;
describing a preference does not prescribe what ought to be valued. Data selects
generic Knowledge; calendar selects generic Physical. MarketValue is explicitly
abstract; no authority identifiers or concretization procedure are invented.

## Geography and physical descriptions

Elevation and Aspect describe terrestrial Terrain. LidarElevation and Heading
were removed in earlier local commits. StreambedGradient and WaterSurfaceGradient
are ratios describing distinct bed/water-surface profiles, with their Stream
bearers preserved. Bed geometry can be recognized when a reach is dry.

ErosionSlopeLength ends at first deposition caused by flattening or channel entry.
OverlandFlowPathLength continues through depositional portions to concentrated
flow. Both follow the horizontal projection along a delineated runoff route,
including bends. The route bearer represents the extent known for an assessment;
a classic prefix does not require knowing the downstream continuation. Profile
targets distinguish the endpoint conventions. No equality, exhaustive partition,
numerical addition or routing computation follows from these declarations.

BathymetricSlope remains an Angle of Location describing qualified Bathymetry:
submerged ground inclination relative to local horizontal. Wetland is a general
ecological Region shaped by persistent/recurrent inundation or near-surface
saturation. Littoral retains its separate lake-shore scope; no universal legal
criteria or Ramsar equivalence are asserted.

PrecipitationVolume and its rain/snow/hail specializations use liquid-water-equivalent
volume over specified horizontal area and interval. Bulk snow/ice volume, depth
and rate remain distinct measurements. Existing caused-by and creates clauses
are preserved; inheritance is not upgraded to a partition or sum formula.

TemporalOccurrencePattern is an abstract Attribute family, retaining Sporadic,
Intermittent and Continuous without ordinal, disjoint or exhaustive assumptions.
The unsupported Period description and obsolete sealed-ordering TODO are removed;
the retired annotation is preserved in the review archive.

## Documentation and provenance

Literate source explains adopted meanings; engineering backlogs, obsolete personal
taxonomy proposals and migration issues are retained here, outside worldview source.
The [review archive](2026-10-15-community-strawman/relocated-notes.json) preserves exact
removed/reworded material and [original snapshots](2026-10-15-community-strawman/source-pins.json).
Those `.kwv.txt` files are historical evidence, not source modules.

Thirty-one drafted definitions received independent source review. The final three
wording corrections include exposed Bedrock, Earth surface morphology for
LandformingProcess, and the intransitive wording for SpatialIntransitiveProcess.
All remaining authoring-quality, deprecation and functional annotations are retained.
Only the explicitly obsolete temporal TODO is retired. Open scientific questions
and the unresolved partitive-inheritance design remain in the separate review records.

## Validation boundary

The exact 26-file proposal passed all 55 independent captured-worldview checks:
all documents loaded, beans/logical validation VALID, consistency, no unsatisfiable
named classes and no Knowledge-grounding errors. All 37 reviewed documentation
slots and the intended annotation/deprecation changes were checked. The inputs,
core pin and source hashes are in [source-pins.json](2026-10-15-community-strawman/source-pins.json).

The baseline had 33 diagnostic messages and the candidate 35; the
[unaltered validation summary](2026-10-15-community-strawman/validation-summary.json)
records the exact delta. Services separately passed 11 targeted checks confirming
canonical domain-alias lookup/dispatch. Three alias-reassignment notices are checker
false positives. Two independent-target notices conservatively retain unknown
evidence from ODO's unmarked Countable existential; no bearer transfer or contradiction
was found. These messages are not hidden or presented as a DL inconsistency.

The services owner is preparing the checker-only correction separately. This source
commit does not claim a full stack build, live service/IDE acceptance, execution of
observation strategies, or resolution of unrelated baseline technical debt.

The frozen source retains whitespace-style findings (mixed indentation, trailing
spaces and a blank EOF line), recorded in the accompanying source-whitespace report.
They are not reformatted after semantic validation: installed source bytes must
match the reviewed 26-file hashes. Historical source snapshots also preserve their
original bytes, with scoped Git text normalization disabled only for that archive.
The original review diff had a concatenated-unified-diff packaging defect detected
before application. A canonical Git diff was regenerated from the identical frozen
source tree; both hashes are recorded separately. All 26 installed source hashes,
rather than a diff serialization, determine identity with the validated proposal.

See [migration notes](2026-10-15-community-strawman/migration.md) before updating
legacy consumers. No remote push or master merge is part of this source integration.
