# Oceanography bootstrap dossier

Marine water bodies and physical/chemical ocean occurrences; ecosystems, fisheries and transport equations are outside.

Status: research draft. No candidate ontology is installed, and no human expert discussion or approval is claimed. This document and dossier.json are local research artifacts, not a new proposal API.

## Source review and scope

- **O1** [NOAA What is an estuary?](https://oceanservice.noaa.gov/facts/estuary.html). Locator: Opening definition and freshwater counterexample; September 23 2026 update. Scope: Estuary includes freshwater systems; MarineEstuary intentionally narrower. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **O2** [NOAA Ocean currents](https://www.noaa.gov/education/resource-collections/ocean-coasts/ocean-currents). Locator: Surface/deep currents; density; biological influence. Scope: Water movement and temperature/salinity forcing; no guaranteed fisheries outcome. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **O3** [NOAA What is upwelling?](https://oceanservice.noaa.gov/facts/upwelling.html). Locator: Definition and coastal example. Scope: Upward transport; nutrient-rich water is common, not defining universal consequence. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **O4** [NOAA What are tides?](https://oceanservice.noaa.gov/facts/tides.html). Locator: High/low water and range; September 23 2026 update. Scope: Astronomical tides distinct from all water-level variations. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **O5** [NOAA Ocean acidification](https://www.noaa.gov/education/resource-collections/ocean-coasts/ocean-acidification). Locator: pH scale; carbon dioxide/seawater. Scope: Declining pH need not cross neutral; detailed pH conventions require dedicated primary standard. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.

## Imported ancestry and unresolved meanings

Imports: imod, earth. References checked against the current sandbox source inherited from base 608bef150ced0a109db98a5aad64ba4461beaa54; exact final source hashes are to be pinned by the root validation manifest. Parent existence is not approval of specialization.

- Ocean current process differs from persistent flow configuration; no subject Current invented for quota.
- MarineEstuary excludes freshwater estuaries; jargon alias must not equate all estuaries.
- Mobile water mass cannot derive from geostationary Location; fluid-body upstream distinction needed.
- Practical and absolute salinity not equivalent: chemistry/physics upstream issue.
- Tidal stage is contextual cyclic distinction, not generic calendar machinery.

## Questions before vocabulary

The saved questions-source-first.json was written before candidate records and keeps the original order/source. The author had already read legacy namespaces; this is not blind testing. No independent held-out probes were obtained. The mappings below came later. Each expression is a component observable, not an executable answer to an entire narrative question. Grammar remains untested here until the root parser report supersedes it.

### oceanography-q01: How salty is the water in this inlet compared with the offshore sea?

Source: O1; source-led order 1. Incidence: oceanography:Salinity, oceanography:MarineEstuary.

Expression: `oceanography:Salinity of oceanography:MarineEstuary`
Expected: quality. Comparable salinity conventions and sample context at inlet/offshore.
Positive case: Comparable salinity conventions and sample context at inlet/offshore. Negative case: different salinity scales compared directly.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### oceanography-q02: Is this estuary always salty?

Source: O1; source-led order 2. Incidence: oceanography:MarineEstuary.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Unqualified estuary includes freshwater systems; narrowing must be explicit.
Positive case: Unqualified estuary includes freshwater systems; narrowing must be explicit. Negative case: all estuaries marine.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### oceanography-q03: Where is the surface water moving and how fast?

Source: O2; source-led order 3. Incidence: oceanography:CurrentSpeed, oceanography:MarineSurfaceLayer.

Expression: `oceanography:CurrentSpeed of oceanography:MarineSurfaceLayer`
Expected: quality. Speed component only; direction missing and upstream fluid velocity convention needed.
Positive case: Speed component only; direction missing and upstream fluid velocity convention needed. Negative case: wave propagation equals water current.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### oceanography-q04: Is deeper water rising toward the coast today?

Source: O3; source-led order 4. Incidence: oceanography:Upwelling.

Expression: `oceanography:Upwelling`
Expected: process. Resolve upward bulk water transport, not infer from cold surface alone.
Positive case: Resolve upward bulk water transport, not infer from cold surface alone. Negative case: surface cooling guarantees upwelling.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### oceanography-q05: How much does water level rise between low and high tide here?

Source: O4; source-led order 5. Incidence: oceanography:SeaSurfaceHeight, oceanography:TidalOscillation.

Expression: `oceanography:SeaSurfaceHeight of oceanography:MarineWaterBody`
Expected: quality. Multiple contextual resolutions plus range comparison model, not one height sufficient.
Positive case: Multiple contextual resolutions plus range comparison model, not one height sufficient. Negative case: single height equals tidal range.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### oceanography-q06: Did the high water result from the tide alone?

Source: O4; source-led order 6. Incidence: oceanography:TidalOscillation.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Tidal/non-tidal decomposition needs model and atmospheric forcing evidence.
Positive case: Tidal/non-tidal decomposition needs model and atmospheric forcing evidence. Negative case: all high water is astronomical tide.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### oceanography-q07: Is the colder water also denser after accounting for its salt content?

Source: O2; source-led order 7. Incidence: oceanography:WaterTemperature, oceanography:Salinity.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Density definition and thermodynamic convention missing; temperature alone insufficient.
Positive case: Density definition and thermodynamic convention missing; temperature alone insufficient. Negative case: cold necessarily denser without composition context.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### oceanography-q08: Which coastal water receives water from this river mouth?

Source: O1; source-led order 8. Incidence: oceanography:RiverReceivesInto, oceanography:MarineWaterBody.

Expression: `oceanography:RiverReceivesInto`
Expected: relationship. Endpoint relation; no automatic freshwater flux magnitude or fixed flow direction.
Positive case: Endpoint relation; no automatic freshwater flux magnitude or fixed flow direction. Negative case: nearby coast assumed receiving.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### oceanography-q09: Does a decrease in ocean pH mean the water has become acidic below neutral?

Source: O5; source-led order 9. Incidence: oceanography:SeawaterPH, oceanography:MarineAcidification.

Expression: `change in oceanography:SeawaterPH of oceanography:MarineWaterBody`
Expected: change quality. Decreasing pH can remain alkaline; scale and event attribution needed.
Positive case: Decreasing pH can remain alkaline; scale and event attribution needed. Negative case: acidification means pH below seven.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### oceanography-q10: How does the surface temperature differ from deeper water?

Source: O2; source-led order 10. Incidence: oceanography:WaterTemperature, oceanography:MarineSurfaceLayer, oceanography:OceanWaterMass.

Expression: `oceanography:WaterTemperature of oceanography:MarineSurfaceLayer`
Expected: quality. Surface component; deeper water separately resolved with same thermal convention.
Positive case: Surface component; deeper water separately resolved with same thermal convention. Negative case: in-situ/potential temperature silently equated.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### oceanography-q11: Which way does water cross the inlet during this tidal exchange?

Source: O4; source-led order 11. Incidence: oceanography:OceanWaterAdvection, oceanography:CoastalInlet.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Directional cross-section flux quality is missing; connection and speed alone do not answer.
Positive case: Directional cross-section flux quality is missing; connection and speed alone do not answer. Negative case: open passage implies one-way flow.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### oceanography-q12: Is nutrient-rich deep water reaching the surface without assuming fish production increased?

Source: O3; source-led order 12. Incidence: oceanography:Upwelling.

Expression: `oceanography:Upwelling`
Expected: process. Need separate nutrient concentration and ecology observations; no creates fish binding.
Positive case: Need separate nutrient concentration and ecology observations; no creates fish binding. Negative case: upwelling necessarily increases catch.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### oceanography-q13: Did a particular upwelling episode change coastal surface temperature?

Source: O3; source-led order 13. Incidence: oceanography:UpwellingEpisode, oceanography:WaterTemperature.

Expression: `change in oceanography:WaterTemperature of oceanography:MarineWaterBody`
Expected: change quality. Change and bounded upwelling evidence separately; attribution remains model.
Positive case: Change and bounded upwelling evidence separately; attribution remains model. Negative case: coincident cooling proves unique cause.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### oceanography-q14: Does the mapped boundary of a current form an impermeable barrier?

Source: O2; source-led order 14. Incidence: oceanography:OceanWaterAdvection.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Flow-feature boundary and mixing need configuration/physical models; map line not impermeability.
Positive case: Flow-feature boundary and mixing need configuration/physical models; map line not impermeability. Negative case: current border is wall.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### oceanography-q15: If no current observation is available can we assume the sea is motionless?

Source: O2; source-led order 15. Incidence: oceanography:CurrentSpeed.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Unobserved current remains unknown; no zero-motion inference.
Positive case: Unobserved current remains unknown; no zero-motion inference. Negative case: missing observation means still sea.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

## Candidate records

Exact names are provisional. Category/type and dependency arity are proposal coordinates; source evidence is not an ontology specification. Subject qualities and process parameters below identify meanings, not variables or equations.

### oceanography:MarineEstuary (subject; provisional)

Coastal water body with marine connection and freshwater mixing.
Parent: `earth:WaterBody` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: O1, O2, O4.
Qualities: oceanography:Salinity, oceanography:WaterTemperature. Parameters: none proposed.
Bindings: {}
Positive: river-sea mixing estuary. Negative: freshwater Great Lakes estuary.
Question incidence: oceanography-q01, oceanography-q02.

### oceanography:MarineWaterBody (subject; provisional)

Individuated marine water body.
Parent: `earth:WaterBody` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: O1, O2, O4.
Qualities: oceanography:Salinity, oceanography:WaterTemperature. Parameters: none proposed.
Bindings: {}
Positive: coastal sea body. Negative: temperature raster.
Question incidence: oceanography-q08.

### oceanography:OceanWaterMass (subject; provisional)

Mobile water body distinguished by coherent properties/history.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: O1, O2, O4.
Qualities: oceanography:Salinity, oceanography:WaterTemperature. Parameters: none proposed.
Bindings: {}
Positive: identified deep water mass. Negative: fixed grid cell.
Question incidence: oceanography-q10.

### oceanography:CoastalInlet (subject; provisional)

Passage connecting coastal water bodies.
Parent: `earth:Waterway` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: O1, O2, O4.
Qualities: oceanography:CurrentSpeed. Parameters: none proposed.
Bindings: {}
Positive: tidal inlet. Negative: arbitrary line through ocean.
Question incidence: oceanography-q11.

### oceanography:MarineSurfaceLayer (subject; blocked)

Contextually delimited near-surface marine body.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: O1, O2, O4.
Qualities: oceanography:WaterTemperature. Parameters: none proposed.
Bindings: {}
Positive: surface mixed layer. Negative: universal fixed depth.
Question incidence: oceanography-q03, oceanography-q10.

### oceanography:Salinity (quality; blocked)

Marine salt content under selected convention.
Parent: `imod:Quantity` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: O1, O2, O4, O5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "oceanography:MarineWaterBody"}
Positive: absolute salinity specified. Negative: practical salinity silently mass fraction.
Question incidence: oceanography-q01, oceanography-q07.

### oceanography:WaterTemperature (quality; provisional)

Thermal quality of marine water.
Parent: `imod:Temperature` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: O1, O2, O4, O5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "oceanography:MarineWaterBody"}
Positive: in-situ water temperature. Negative: potential temperature substituted.
Question incidence: oceanography-q07, oceanography-q10, oceanography-q13.

### oceanography:CurrentSpeed (quality; provisional)

Water-motion magnitude relative to reference.
Parent: `imod:Velocity` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: O1, O2, O4, O5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "oceanography:MarineWaterBody"}
Positive: measured current. Negative: wave crest speed.
Question incidence: oceanography-q03, oceanography-q15.

### oceanography:SeawaterPH (quality; blocked)

Hydrogen-ion activity-related quality on specified seawater pH scale.
Parent: `imod:Quantity` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: O1, O2, O4, O5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "oceanography:MarineWaterBody"}
Positive: total-scale pH. Negative: alkalinity substituted.
Question incidence: oceanography-q09.

### oceanography:SeaSurfaceHeight (quality; provisional)

Water surface height relative to stated vertical reference.
Parent: `imod:Length` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: O1, O2, O4, O5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "oceanography:MarineWaterBody"}
Positive: gauge datum height. Negative: bathymetric depth.
Question incidence: oceanography-q05.

### oceanography:OceanWaterAdvection (process; blocked)

Directed transport of marine water.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: O2, O3, O4, O5.
Qualities: not applicable. Parameters: oceanography:CurrentSpeed.
Bindings: {"participants": ["oceanography:MarineWaterBody"], "affects": ["oceanography:WaterTemperature", "oceanography:Salinity"], "creates": [], "confers": [], "rationale": "Affects recipient contextual water body; direction/magnitude need models. No productive-role conferral or biological guarantee.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: inlet water flow. Negative: wave passage equated to net flow.
Question incidence: oceanography-q11, oceanography-q14.

### oceanography:Upwelling (process; blocked)

Deeper marine water transported toward surface.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: O2, O3, O4, O5.
Qualities: not applicable. Parameters: oceanography:CurrentSpeed.
Bindings: {"participants": ["oceanography:MarineWaterBody"], "affects": ["oceanography:WaterTemperature", "oceanography:Salinity"], "creates": [], "confers": [], "rationale": "Affects recipient contextual water body; direction/magnitude need models. No productive-role conferral or biological guarantee.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: deep water reaches surface. Negative: surface cools through heat loss only.
Question incidence: oceanography-q04, oceanography-q12.

### oceanography:Downwelling (process; provisional)

Surface marine water transported downward.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: O2, O3, O4, O5.
Qualities: not applicable. Parameters: oceanography:WaterTemperature, oceanography:Salinity.
Bindings: {"participants": ["oceanography:MarineWaterBody"], "affects": [], "creates": [], "confers": [], "rationale": "Affects recipient contextual water body; direction/magnitude need models. No productive-role conferral or biological guarantee.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: surface water descends. Negative: particles sink without bulk water.
Question incidence: unused; needs fresh justification or removal.

### oceanography:TidalOscillation (process; provisional)

Astronomically forced water-level/motion oscillation.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: O2, O3, O4, O5.
Qualities: not applicable. Parameters: oceanography:SeaSurfaceHeight.
Bindings: {"participants": ["oceanography:MarineWaterBody"], "affects": ["oceanography:SeaSurfaceHeight"], "creates": [], "confers": [], "rationale": "Affects recipient contextual water body; direction/magnitude need models. No productive-role conferral or biological guarantee.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: tidal rise/fall. Negative: storm surge called tide.
Question incidence: oceanography-q05, oceanography-q06.

### oceanography:MarineAcidification (process; provisional)

Process lowering seawater pH.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: O2, O3, O4, O5.
Qualities: not applicable. Parameters: oceanography:SeawaterPH.
Bindings: {"participants": ["oceanography:MarineWaterBody"], "affects": ["oceanography:SeawaterPH"], "creates": [], "confers": [], "rationale": "Affects recipient contextual water body; direction/magnitude need models. No productive-role conferral or biological guarantee.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: pH drops but remains alkaline. Negative: constant low pH called ongoing decline.
Question incidence: oceanography-q09.

### oceanography:MarineConnection (relationship; provisional)

Marine bodies connected by an identified water passage.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: O1, O2, O3.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "oceanography:MarineWaterBody", "target": "oceanography:MarineWaterBody", "rationale": "Potential connection not flux; symmetric inverse pending."}
Positive: lagoon linked by inlet. Negative: nearby isolated pond.
Question incidence: unused; needs fresh justification or removal.

### oceanography:RiverReceivesInto (relationship; provisional)

River waterway terminates into coastal water body.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: O1, O2, O3.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "earth:Waterway", "target": "oceanography:MarineWaterBody", "rationale": "Endpoint connection; actual flow may reverse tidally."}
Positive: river mouth opens to estuary. Negative: current passes near river.
Question incidence: oceanography-q08.

### oceanography:SurfaceOverDeepWater (relationship; provisional)

Surface water overlies a deeper water body.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: O1, O2, O3.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "oceanography:MarineSurfaceLayer", "target": "oceanography:OceanWaterMass", "rationale": "Arrangement not impermeable separation."}
Positive: surface above deep mass. Negative: remote masses compared on graph.
Question incidence: unused; needs fresh justification or removal.

### oceanography:UpwellingEpisode (event; provisional)

Bounded upward marine-transport occurrence.
Parent: `earth:GeolocatedEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: O3, O4, O5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"participants": ["oceanography:MarineWaterBody"], "affects": ["oceanography:WaterTemperature"], "creates": [], "confers": [], "rationale": "Occurrence requires contextual identity/evidence. High water is diagnostic phase, not autonomous cause; event individuation remains blocked.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: observed coastal interval. Negative: seasonal probability.
Question incidence: oceanography-q13.

### oceanography:TidalHighWaterOccurrence (event; blocked)

Local high water in identified tidal cycle.
Parent: `earth:GeolocatedEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: O3, O4, O5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"participants": ["oceanography:MarineWaterBody"], "affects": ["oceanography:SeaSurfaceHeight"], "creates": [], "confers": [], "rationale": "Occurrence requires contextual identity/evidence. High water is diagnostic phase, not autonomous cause; event individuation remains blocked.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: tidal crest at gauge. Negative: highest storm water called purely tidal.
Question incidence: unused; needs fresh justification or removal.

### oceanography:AcidificationEpisode (event; provisional)

Bounded seawater pH decline occurrence.
Parent: `earth:GeolocatedEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: O3, O4, O5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"participants": ["oceanography:MarineWaterBody"], "affects": ["oceanography:SeawaterPH"], "creates": [], "confers": [], "rationale": "Occurrence requires contextual identity/evidence. High water is diagnostic phase, not autonomous cause; event individuation remains blocked.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: documented decline. Negative: sensor offset mimics decline.
Question incidence: unused; needs fresh justification or removal.

## Quality summaries and evidence states

Proposed RelativelySaline summarizes `oceanography:Salinity`. Ordered comparison under same salinity convention and reference waters; brackish categories require named authority, no universal cutoff.

This is blocked until comparison conventions and observations exist. Unknown, unmeasured and disputed describe evidence, not domain predicates. Nominal identity, ordering and overlap must be reviewed separately. No exhaustive classification or universal thresholds are invented.

## Coverage and next revision

Counts: {"subject": 5, "quality": 5, "process": 5, "relationship": 3, "event": 3}. The five/category objective has two unfilled relationship and two unfilled event slots. Counts include explicitly blocked candidates; they are not a readiness score.

Unused candidates: oceanography:Downwelling, oceanography:MarineConnection, oceanography:SurfaceOverDeepWater, oceanography:TidalHighWaterOccurrence, oceanography:AcidificationEpisode.

Agency primary materials are bounded starting evidence, often educational/descriptive. Sources do not endorse ontological categories, exact inferred bindings or exhaustive coverage. Retrieval failures are recorded per source.

Request fresh independent questions from domain experts after this revision is frozen. Broaden beyond the agency educational sources, reconcile contested meanings and upstream parents, and retire unsupported candidates rather than preserving legacy comments by default. Do not promote speculative alternatives into executable src.

## Validation, stage handoff and stop condition

Local checks cover field presence, 15 question IDs, referenced candidate/source IDs and incidence only. Actual syntax, adaptation, scientific validity and model execution are separate. A qualified missing concept may parse and still fail resolution. The deliberately malformed expression in dossier.json must be rejected by the real parser.

Freeze dossier/import hashes, resolve blocking ambiguity/source gaps, human domain and ontology review, actual candidate parser/adaptation/reasoner checks, separate exact-revision approval; no self-approval.

Map stable concept/question/source IDs into existing context-pack evidence/assets/alignment/open_questions fields; keep schema1.3 unchanged. Suggested future source-review ledger, question-semantic tests and exact hash approval bindings need backend discussion, not unilateral API invention.

All change/cessation requires an occurrent. At time transitions resolve change in each quality separately. Unresolved change permits operation with available knowledge; it does not imply no real change or a retention rule. Implication/detection remain syntax-only. No role-conferral binding is asserted without evidence, and no consequence engine is implemented.

## Final author audit: upstream prerequisites and transport caveat

- **ocean-fluid**: Mobile fluid bodies, directional velocity, density and volume flux. Physics upstream, marine specialization later; speeds alone cannot answer inlet transfer.
- **ocean-chemistry**: Absolute/practical salinity and seawater pH scales. Chemistry/thermodynamic conventions required; do not equate without evidence.
- **ocean-forcing**: Wind stress, pressure, density gradients, buoyancy and vertical transport. Process parameter coverage currently incomplete; no asserted equation or deterministic local effect.

Process parameters are incomplete and include response qualities. This dossier does not claim a complete governing-parameter set. The JSON import_evidence records exact local imported file hashes. Resolve the listed prerequisites instead of using a local invented parent or pretending a missing force/flux quality exists.

**Binding correction before review:** material advection does not necessarily change temperature/composition of a tracked parcel. It can change those qualities at a fixed receiving region. AirAdvection/OceanWaterAdvection/Upwelling affects bindings are therefore blocked pending the material-versus-fixed-region bearer choice. This final audit and dossier.json supersede any earlier provisional label in the candidate catalogue.

No source disagreement was resolved by majority vote. Differences in operational perspective (including freshwater versus marine estuary, field landform schemes versus universal types, or material parcel versus fixed region) are preserved as scoped alternatives. Human expert review and independent probes remain outstanding.
