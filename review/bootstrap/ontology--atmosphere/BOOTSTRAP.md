# Atmosphere bootstrap dossier

Atmospheric bodies, bearer-specific qualities and weather occurrences. Climate statistics, smoke transport and forecasting strategies are models.

Status: research draft. No candidate ontology is installed, and no human expert discussion or approval is claimed. This document and dossier.json are local research artifacts, not a new proposal API.

## Source review and scope

- **A1** [NOAA Weather systems and patterns](https://www.noaa.gov/education/resource-collections/weather-atmosphere/weather-systems-patterns). Locator: Global winds; air masses; fronts; jet streams. Scope: Interactions and atmospheric movement; no single-factor deterministic forecast. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **A2** [NOAA JetStream Air Masses](https://www.noaa.gov/jetstream/synoptic/air-masses). Locator: Definition; source regions; boundaries. Scope: Temperature/moisture coherence, modification and front types. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **A3** [NOAA Reading Surface Weather Maps](https://www.noaa.gov/jetstream/wxmaps). Locator: Front and pressure symbols. Scope: Interpretation of maps; symbols not physical entities. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **A4** [NOAA Layers of the Atmosphere](https://www.noaa.gov/jetstream/atmosphere/layers-of-atmosphere). Locator: Layer criteria; troposphere; stratosphere. Scope: Variable thermal boundaries, not universal fixed altitudes. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.

## Imported ancestry and unresolved meanings

Imports: imod, earth. References checked against the current sandbox source inherited from base 608bef150ced0a109db98a5aad64ba4461beaa54; exact final source hashes are to be pinned by the root validation manifest. Parent existence is not approval of specialization.

- atmosphere:Air is a chemical identity, not an air subject/bearer.
- earth:Location is geostationary and feature-derived: mobile AirMass cannot silently specialize it. Root Subject is broad verified ancestry pending material-body parent.
- Existing Atmosphere realm excludes layers inconsistently with source: rewrite instead of preserving text.
- Air-mass source-region classes bundle origin/temperature/moisture; separate dimensions or authority categories.
- Frontal zone subject versus boundary/configuration remains blocked; exact host and identity matter.

## Questions before vocabulary

The saved questions-source-first.json was written before candidate records and keeps the original order/source. The author had already read legacy namespaces; this is not blind testing. No independent held-out probes were obtained. The mappings below came later. Each expression is a component observable, not an executable answer to an entire narrative question. Grammar remains untested here until the root parser report supersedes it.

### atmosphere-q01: How warm is the air around the village rather than the sunlit ground?

Source: A1; source-led order 1. Incidence: atmosphere:AirTemperature, atmosphere:AirBody.

Expression: `atmosphere:AirTemperature of atmosphere:AirBody`
Expected expression-result category: quality. Ambient air bearer distinct from ground; observed height/context external.
Positive case: Ambient air bearer distinct from ground; observed height/context external. Negative case: ground radiant temperature substituted.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### atmosphere-q02: How much moisture is in this air mass?

Source: A2; source-led order 2. Incidence: atmosphere:SpecificHumidity, atmosphere:AirMass.

Expression: `atmosphere:SpecificHumidity of atmosphere:AirMass`
Expected expression-result category: quality. Vapor mass fraction convention needed; relative humidity not synonym.
Positive case: Vapor mass fraction convention needed; relative humidity not synonym. Negative case: humidity percentage used without meaning.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### atmosphere-q03: Which way and how fast is the air moving above the trees?

Source: A1; source-led order 3. Incidence: atmosphere:WindSpeed, atmosphere:WindDirection, atmosphere:AirBody.

Expression: `atmosphere:WindSpeed of atmosphere:AirBody`
Expected expression-result category: quality. Speed component; direction requires separate WindDirection resolution with from/to convention.
Positive case: Speed component; direction requires separate WindDirection resolution with from/to convention. Negative case: single scalar answers both speed and direction.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### atmosphere-q04: Is the approaching boundary separating warmer and colder air?

Source: A3; source-led order 4. Incidence: atmosphere:FrontalZone, atmosphere:FrontSeparatesAirMass.

Expression: `atmosphere:FrontalZone`
Expected expression-result category: subject. Transition-zone and air-mass thermal comparison; blocked subject/configuration choice.
Positive case: Transition-zone and air-mass thermal comparison; blocked subject/configuration choice. Negative case: symbol interpreted as physical wall.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### atmosphere-q05: Did the front passing the village change its temperature?

Source: A3; source-led order 5. Incidence: atmosphere:FrontalPassage, atmosphere:AirTemperature.

Expression: `change in atmosphere:AirTemperature of atmosphere:AirBody`
Expected expression-result category: process. Contextual temperature change resolved separately with passage evidence.
Positive case: Contextual temperature change resolved separately with passage evidence. Negative case: front universally causes same signed change.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### atmosphere-q06: Is rising air forming cloud droplets or only moving existing cloud?

Source: A1; source-led order 6. Incidence: atmosphere:CloudCondensation, atmosphere:AirAdvection.

Expression: `atmosphere:CloudCondensation`
Expected expression-result category: process. Condensation occurrence versus transport; dedicated microphysics evidence still needed.
Positive case: Condensation occurrence versus transport; dedicated microphysics evidence still needed. Negative case: cloud motion implies new condensation.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### atmosphere-q07: Which air mass lies on each side of this front?

Source: A3; source-led order 7. Incidence: atmosphere:FrontSeparatesAirMass, atmosphere:AirMass.

Expression: `atmosphere:FrontSeparatesAirMass`
Expected expression-result category: relationship. Two endpoint assertions attach air masses to identified front.
Positive case: Two endpoint assertions attach air masses to identified front. Negative case: two endpoints compressed into unsupported ternary syntax.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### atmosphere-q08: How much rain reached the ground during this storm?

Source: A1; source-led order 8. Incidence: atmosphere:RainfallEpisode.

Expression: `earth:RainfallVolume`
Expected expression-result category: quality. Ground-reaching liquid precipitation amount for event context; not rain aloft.
Positive case: Ground-reaching liquid precipitation amount for event context; not rain aloft. Negative case: virga counted as ground rainfall.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### atmosphere-q09: Could air above the surface move differently from air near the ground?

Source: A1; source-led order 9. Incidence: atmosphere:WindSpeed, atmosphere:WindDirection.

Expression: `atmosphere:WindSpeed of atmosphere:AirBody`
Expected expression-result category: quality. Separate height-specific air bodies; compare their qualities, no universal shared wind.
Positive case: Separate height-specific air bodies; compare their qualities, no universal shared wind. Negative case: surface station used as whole column.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### atmosphere-q10: Which vertical layer contains most of this weather?

Source: A4; source-led order 10. Incidence: atmosphere:TroposphericRegion.

Expression: `atmosphere:TroposphericRegion`
Expected expression-result category: subject. Thermally diagnosed local tropospheric boundary; variable height.
Positive case: Thermally diagnosed local tropospheric boundary; variable height. Negative case: fixed global altitude divides atmosphere.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### atmosphere-q11: Does a dry air mass mean there is no water vapor at all?

Source: A2; source-led order 11. Incidence: atmosphere:SpecificHumidity, atmosphere:AirMass.

Expression: `atmosphere:SpecificHumidity of atmosphere:AirMass`
Expected expression-result category: quality. Dry relative/source-region characterization does not entail vapor absence.
Positive case: Dry relative/source-region characterization does not entail vapor absence. Negative case: dry is zero water.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### atmosphere-q12: Can a surface pressure reading alone tell us where smoke will go?

Source: A1; source-led order 12. Incidence: atmosphere:AirAdvection, atmosphere:WindDirection.

Expression: **gap; no faithful complete expression proposed**.
Expected expression-result category: unresolved. Smoke transport needs pressure-gradient/velocity/turbulence and chemistry aerosols; no single pressure solution.
Positive case: Smoke transport needs pressure-gradient/velocity/turbulence and chemistry aerosols; no single pressure solution. Negative case: pressure alone predicts plume route.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### atmosphere-q13: Has a wind shift occurred since the last observation?

Source: A3; source-led order 13. Incidence: atmosphere:WindDirection, atmosphere:WindShiftEpisode.

Expression: `change in atmosphere:WindDirection of atmosphere:AirBody`
Expected expression-result category: process. Observed direction transition with circular-angle handling in model.
Positive case: Observed direction transition with circular-angle handling in model. Negative case: 359 to 1 degree treated as huge physical reversal.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### atmosphere-q14: Does a front symbol on the map constitute a physical wall?

Source: A3; source-led order 14. Incidence: atmosphere:FrontalZone.

Expression: **gap; no faithful complete expression proposed**.
Expected expression-result category: unresolved. Representation question: map symbol is not a domain front subject; no impermeability binding.
Positive case: Representation question: map symbol is not a domain front subject; no impermeability binding. Negative case: front is physical wall.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### atmosphere-q15: If humidity is unmeasured should we treat the air as dry?

Source: A2; source-led order 15. Incidence: atmosphere:SpecificHumidity.

Expression: **gap; no faithful complete expression proposed**.
Expected expression-result category: unresolved. Unknown humidity is an evidence state and cannot confer Dry.
Positive case: Unknown humidity is an evidence state and cannot confer Dry. Negative case: unmeasured means dry.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

## Candidate records

Exact names are provisional. Category/type and dependency arity are proposal coordinates; source evidence is not an ontology specification. Subject qualities and process parameters below identify meanings, not variables or equations.

### atmosphere:AirBody (subject; provisional)

Individuated physical portion of atmospheric air.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: A1, A2, A4.
Qualities: atmosphere:AirTemperature, atmosphere:SpecificHumidity. Parameters: none proposed.
Bindings: {}
Positive: tracked coherent air volume. Negative: air mixture identity.
Question incidence: atmosphere-q01, atmosphere-q03.

### atmosphere:AirMass (subject; provisional)

Large air body with relative thermal/moisture coherence.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: A1, A2, A4.
Qualities: atmosphere:AirTemperature, atmosphere:SpecificHumidity. Parameters: none proposed.
Bindings: {}
Positive: continental air mass. Negative: arbitrary map rectangle.
Question incidence: atmosphere-q02, atmosphere-q07, atmosphere-q11.

### atmosphere:CloudBody (subject; provisional)

Individuated suspended condensed-water assemblage.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: A1, A2, A4.
Qualities: atmosphere:CloudWaterContent. Parameters: none proposed.
Bindings: {}
Positive: cumulus body. Negative: invisible vapor alone.
Question incidence: unused; needs fresh justification or removal.

### atmosphere:FrontalZone (subject; blocked)

Finite atmospheric transition separating distinguishable air masses.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: A1, A2, A4.
Qualities: atmosphere:AirTemperature, atmosphere:WindSpeed. Parameters: none proposed.
Bindings: {}
Positive: resolved transition volume. Negative: colored map line.
Question incidence: atmosphere-q04, atmosphere-q14.

### atmosphere:TroposphericRegion (subject; blocked)

Contextually delimited tropospheric atmospheric portion.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: A1, A2, A4.
Qualities: atmosphere:AirTemperature. Parameters: none proposed.
Bindings: {}
Positive: column under local tropopause. Negative: universal altitude cutoff.
Question incidence: atmosphere-q10.

### atmosphere:AirTemperature (quality; provisional)

Thermal quality of air body.
Parent: `imod:Temperature` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "atmosphere:AirBody"}
Positive: shielded ambient air reading. Negative: sunlit soil temperature.
Question incidence: atmosphere-q01, atmosphere-q05.

### atmosphere:SpecificHumidity (quality; blocked)

Vapor mass share of moist air.
Parent: `imod:Proportion` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "atmosphere:AirBody"}
Positive: vapor per moist-air mass. Negative: relative humidity treated as same.
Question incidence: atmosphere-q02, atmosphere-q11, atmosphere-q15.

### atmosphere:WindSpeed (quality; provisional)

Air-velocity magnitude relative to reference.
Parent: `imod:Velocity` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "atmosphere:AirBody"}
Positive: air movement above canopy. Negative: particle settling speed.
Question incidence: atmosphere-q03, atmosphere-q09.

### atmosphere:WindDirection (quality; provisional)

Horizontal air-motion orientation with stated from/to convention.
Parent: `imod:Angle` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "atmosphere:AirBody"}
Positive: meteorological from-direction. Negative: to-direction silently substituted.
Question incidence: atmosphere-q03, atmosphere-q09, atmosphere-q12, atmosphere-q13.

### atmosphere:CloudWaterContent (quality; blocked)

Condensed water amount per selected cloud-body basis.
Parent: `imod:Quantity` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "atmosphere:CloudBody"}
Positive: liquid-water mass per volume. Negative: vapor content substituted.
Question incidence: unused; needs fresh justification or removal.

### atmosphere:AirAdvection (process; blocked)

Transport of atmospheric air and carried properties.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: atmosphere:WindSpeed, atmosphere:WindDirection.
Bindings: {"participants": ["atmosphere:AirBody", "atmosphere:AirMass"], "affects": ["atmosphere:AirTemperature", "atmosphere:SpecificHumidity"], "creates": [], "confers": [], "rationale": "Conditional recipient-body effects; mechanisms/rates are models. Dedicated phase-change source and parameter conventions needed for condensation/evaporation.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: different air reaches site. Negative: instrument recalibration.
Question incidence: atmosphere-q06, atmosphere-q12.

### atmosphere:AtmosphericConvection (process; provisional)

Buoyancy-associated atmospheric vertical transport.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: atmosphere:AirTemperature.
Bindings: {"participants": ["atmosphere:AirBody", "atmosphere:AirMass"], "affects": ["atmosphere:AirTemperature"], "creates": [], "confers": [], "rationale": "Conditional recipient-body effects; mechanisms/rates are models. Dedicated phase-change source and parameter conventions needed for condensation/evaporation.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: buoyant ascent. Negative: all upward air assumed buoyant.
Question incidence: unused; needs fresh justification or removal.

### atmosphere:CloudCondensation (process; blocked)

Conversion of atmospheric vapor to cloud liquid.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: atmosphere:AirTemperature, atmosphere:SpecificHumidity.
Bindings: {"participants": ["atmosphere:AirBody", "atmosphere:AirMass"], "affects": ["atmosphere:CloudWaterContent"], "creates": ["atmosphere:CloudBody"], "confers": [], "rationale": "Conditional recipient-body effects; mechanisms/rates are models. Dedicated phase-change source and parameter conventions needed for condensation/evaporation.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: new droplet assemblage. Negative: existing cloud transported.
Question incidence: atmosphere-q06.

### atmosphere:CloudEvaporation (process; blocked)

Transfer of cloud liquid to vapor.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: atmosphere:AirTemperature, atmosphere:SpecificHumidity.
Bindings: {"participants": ["atmosphere:AirBody", "atmosphere:AirMass"], "affects": ["atmosphere:CloudWaterContent"], "creates": [], "confers": [], "rationale": "Conditional recipient-body effects; mechanisms/rates are models. Dedicated phase-change source and parameter conventions needed for condensation/evaporation.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: droplets evaporate. Negative: cloud leaves camera view.
Question incidence: unused; needs fresh justification or removal.

### atmosphere:AirMassModification (process; provisional)

Thermal/moisture alteration through exchanges.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: A1, A2.
Qualities: not applicable. Parameters: atmosphere:AirTemperature, atmosphere:SpecificHumidity.
Bindings: {"participants": ["atmosphere:AirBody", "atmosphere:AirMass"], "affects": ["atmosphere:AirTemperature", "atmosphere:SpecificHumidity"], "creates": [], "confers": [], "rationale": "Conditional recipient-body effects; mechanisms/rates are models. Dedicated phase-change source and parameter conventions needed for condensation/evaporation.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: dry air warms over ocean. Negative: weather map relabeling.
Question incidence: unused; needs fresh justification or removal.

### atmosphere:FrontSeparatesAirMass (relationship; provisional)

Frontal zone bounds an identified air-mass side.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: A1, A2, A3.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "atmosphere:FrontalZone", "target": "atmosphere:AirMass", "rationale": "Represent two sides by two assertions, not a disguised ternary relation."}
Positive: warm side of identified front. Negative: map line associated with arbitrary station.
Question incidence: atmosphere-q04, atmosphere-q07.

### atmosphere:CloudContainedInAir (relationship; provisional)

Cloud body is hosted by surrounding air body.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: A1, A2, A3.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "atmosphere:CloudBody", "target": "atmosphere:AirBody", "rationale": "Contextual hosting, not permanent identity."}
Positive: cloud embedded in air mass. Negative: projection overlap at different altitude.
Question incidence: unused; needs fresh justification or removal.

### atmosphere:AirMassOriginRegion (relationship; provisional)

Air mass acquired initial source-region character over a region.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: A1, A2, A3.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "atmosphere:AirMass", "target": "earth:Region", "rationale": "Historical origin does not force present properties."}
Positive: documented origin trajectory. Negative: present location treated as origin.
Question incidence: unused; needs fresh justification or removal.

### atmosphere:FrontalPassage (event; provisional)

Bounded passage of front across contextual site.
Parent: `earth:MeteorologicalEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: A1, A2, A3.
Qualities: not applicable. Parameters: atmosphere:WindSpeed.
Bindings: {"participants": ["atmosphere:AirBody", "earth:Location"], "affects": ["atmosphere:AirTemperature", "atmosphere:WindDirection"], "creates": [], "confers": [], "rationale": "No front-to-rain universal implication. Geostationary inherited event parent requires review for moving storms; site occurrence is scoped.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: observed front crosses village. Negative: forecast never arrives.
Question incidence: atmosphere-q05.

### atmosphere:WindShiftEpisode (event; provisional)

Bounded air-motion direction transition at site.
Parent: `earth:MeteorologicalEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: A1, A2, A3.
Qualities: not applicable. Parameters: atmosphere:WindSpeed.
Bindings: {"participants": ["atmosphere:AirBody", "earth:Location"], "affects": ["atmosphere:WindDirection"], "creates": [], "confers": [], "rationale": "No front-to-rain universal implication. Geostationary inherited event parent requires review for moving storms; site occurrence is scoped.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: observed wind turns. Negative: direction convention changes.
Question incidence: atmosphere-q13.

### atmosphere:RainfallEpisode (event; provisional)

Bounded liquid precipitation reaching ground.
Parent: `earth:MeteorologicalEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: A1, A2, A3.
Qualities: not applicable. Parameters: atmosphere:WindSpeed.
Bindings: {"participants": ["atmosphere:AirBody", "earth:Location"], "affects": ["earth:RainfallVolume"], "creates": [], "confers": [], "rationale": "No front-to-rain universal implication. Geostationary inherited event parent requires review for moving storms; site occurrence is scoped.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: rain reaches surface. Negative: virga evaporates aloft.
Question incidence: atmosphere-q08.

## Quality summaries and evidence states

Proposed RelativelyDry summarizes `atmosphere:SpecificHumidity`. Ordered comparison within comparable temperature/air-mass context; not zero vapor, not source-region identity, no invented cutoff.

This is blocked until comparison conventions and observations exist. Unknown, unmeasured and disputed describe evidence, not domain predicates. Nominal identity, ordering and overlap must be reviewed separately. No exhaustive classification or universal thresholds are invented.

## Coverage and next revision

Counts: {"subject": 5, "quality": 5, "process": 5, "relationship": 3, "event": 3}. The five/category objective has two unfilled relationship and two unfilled event slots. Counts include explicitly blocked candidates; they are not a readiness score.

Unused candidates: atmosphere:CloudBody, atmosphere:CloudWaterContent, atmosphere:AtmosphericConvection, atmosphere:CloudEvaporation, atmosphere:AirMassModification, atmosphere:CloudContainedInAir, atmosphere:AirMassOriginRegion.

Agency primary materials are bounded starting evidence, often educational/descriptive. Sources do not endorse ontological categories, exact inferred bindings or exhaustive coverage. Retrieval failures are recorded per source.

Request fresh independent questions from domain experts after this revision is frozen. Broaden beyond the agency educational sources, reconcile contested meanings and upstream parents, and retire unsupported candidates rather than preserving legacy comments by default. Do not promote speculative alternatives into executable src.

## Validation, stage handoff and stop condition

Local checks cover field presence, 15 question IDs, referenced candidate/source IDs and incidence only. Actual syntax, adaptation, scientific validity and model execution are separate. A qualified missing concept may parse and still fail resolution. The deliberately malformed expression in dossier.json must be rejected by the real parser.

Freeze dossier/import hashes, resolve blocking ambiguity/source gaps, human domain and ontology review, actual candidate parser/adaptation/reasoner checks, separate exact-revision approval; no self-approval.

Map stable concept/question/source IDs into existing context-pack evidence/assets/alignment/open_questions fields; keep schema1.3 unchanged. Suggested future source-review ledger, question-semantic tests and exact hash approval bindings need backend discussion, not unilateral API invention.

All change/cessation requires an occurrent. At time transitions resolve change in each quality separately. Unresolved change permits operation with available knowledge; it does not imply no real change or a retention rule. Implication/detection remain syntax-only. No role-conferral binding is asserted without evidence, and no consequence engine is implemented.

## Final author audit: upstream prerequisites and transport caveat

- **atm-material**: Mobile physical gas body/mixture identity. Cannot inherit mobile AirMass from geostationary Location. Root/physics/chemistry issue.
- **atm-parameters**: Pressure, density, buoyancy, heat exchange and vapor saturation. Convection/advection/phase-change parameter set incomplete; dedicated primary meteorology definitions required.
- **atm-humidity**: Specific versus relative humidity and phase-specific cloud water content. Split convention-dependent meanings before review-ready proposal.

Process parameters are incomplete and include response qualities. This dossier does not claim a complete governing-parameter set. The JSON import_evidence records exact local imported file hashes. Resolve the listed prerequisites instead of using a local invented parent or pretending a missing force/flux quality exists.

**Binding correction before review:** material advection does not necessarily change temperature/composition of a tracked parcel. It can change those qualities at a fixed receiving region. AirAdvection/OceanWaterAdvection/Upwelling affects bindings are therefore blocked pending the material-versus-fixed-region bearer choice. This final audit and dossier.json supersede any earlier provisional label in the candidate catalogue.

No source disagreement was resolved by majority vote. Differences in operational perspective (including freshwater versus marine estuary, field landform schemes versus universal types, or material parcel versus fixed region) are preserved as scoped alternatives. Human expert review and independent probes remain outstanding.
