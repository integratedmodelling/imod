# Soil bootstrap dossier

Pedogenic material, horizons and bearer-specific qualities. Soil map units, classification entries and suitability ratings are authorities/model outputs.

Status: research draft. No candidate ontology is installed, and no human expert discussion or approval is claimed. This document and dossier.json are local research artifacts, not a new proposal API.

## Source review and scope

- **S1** [USDA Soil Survey Manual 2017 chapter 3](https://www.nrcs.usda.gov/sites/default/files/2022-09/SSM-ch3.pdf). Locator: Pedon/profile/horizon/solum definitions; observing pedons. Scope: Indexed primary passages distinguish pedogenic horizon from inherited layer; fresh litter excluded from O horizon. Direct fetch failed. Status: indexed primary passages reviewed; full PDF blocked. Retrieved 2026-10-03.
- **S2** [NRCS From the Surface Down, second edition](https://www.nrcs.usda.gov/publications/Soil%20Health%20Training/Soil%20Health%20and%20Sustainability%20for%20Field%20Staff%20SHASFS%203.0/In-person%20Training/Supporting%20Documents/Intro%20to%20Soil%20Health%20Resources/From-the-Surface-Down.pdf). Locator: Horizons; section 4 soil properties. Scope: Indexed descriptions of leaching, soil properties and contextual suitability; direct PDF unavailable. Status: indexed primary excerpts reviewed; full retrieval blocked. Retrieved 2026-10-03.
- **S3** [NRCS Soil Tech Note 16A: Compacted Zone in Soil](https://www.nrcs.usda.gov/sites/default/files/2022-09/SoilTechNote16A.pdf). Locator: Two pages; compaction and possible solutions. Scope: Bulk density/pore-space and management context. Numeric examples not universal thresholds. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **S4** [NRCS Field Book 4.0 November 2024](https://www.nrcs.usda.gov/sites/default/files/2025-05/Field-Book-for-Describing-and-Sampling-Soils-Ver4.pdf). Locator: Chapter 2: horizon depth/boundary and profile/pedon description. Scope: Observational conventions; no automatic taxonomy or health inference. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.

## Imported ancestry and unresolved meanings

Imports: imod, earth. References checked against the current sandbox source inherited from base 608bef150ced0a109db98a5aad64ba4461beaa54; exact final source hashes are to be pinned by the root validation manifest. Parent existence is not approval of specialization.

- Soil body differs from selected pedon; a profile description is not another material subject.
- Organic matter fraction differs from organic carbon; no universal conversion.
- Plant-available water is conditioned by plant/root/retention conditions, not total water.
- Compaction process differs from Compacted predicate, which needs comparative baseline and texture.
- Material/porous-body parent is upstream issue; broad verified Subject does not settle specialization.

## Questions before vocabulary

The saved questions-source-first.json was written before candidate records and keeps the original order/source. The author had already read legacy namespaces; this is not blind testing. No independent held-out probes were obtained. The mappings below came later. Each expression is a component observable, not an executable answer to an entire narrative question. Grammar remains untested here until the root parser report supersedes it.

### soil-q01: How thick is the dark surface soil above the next horizon?

Source: S1; source-led order 1. Incidence: soil:HorizonThickness, soil:SoilHorizon.

Expression: `soil:HorizonThickness of soil:SoilHorizon`
Expected: quality. Top-to-base separation; darkness does not define identity by itself.
Positive case: Top-to-base separation; darkness does not define identity by itself. Negative case: depth to top treated as thickness.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### soil-q02: Does this soil have more clay or sand?

Source: S2; source-led order 2. Incidence: soil:ClayFraction, soil:SoilHorizon.

Expression: `soil:ClayFraction of soil:SoilHorizon`
Expected: quality. Clay component only; sand fraction is missing upstream/domain candidate and must be separately articulated.
Positive case: Clay component only; sand fraction is missing upstream/domain candidate and must be separately articulated. Negative case: clay mineralogy confused with particle size.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### soil-q03: How tightly packed is soil under the wheel track compared with nearby ground?

Source: S3; source-led order 3. Incidence: soil:BulkDensity, soil:SoilCompaction.

Expression: `soil:BulkDensity of soil:SoilBody`
Expected: quality. Comparable dry bulk densities at track/reference; compaction attribution needs occurrence and particle context.
Positive case: Comparable dry bulk densities at track/reference; compaction attribution needs occurrence and particle context. Negative case: high particle density proves compaction.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### soil-q04: Is the wet layer storing water or passing it downward?

Source: S2; source-led order 4. Incidence: soil:SoilLeaching.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Water content, retention and throughflow meanings absent; hydrology imports required, no local workaround.
Positive case: Water content, retention and throughflow meanings absent; hydrology imports required, no local workaround. Negative case: wet appearance means no drainage.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### soil-q05: How much organic matter is present in this horizon?

Source: S2; source-led order 5. Incidence: soil:OrganicMatterFraction, soil:SoilHorizon.

Expression: `soil:OrganicMatterFraction of soil:SoilHorizon`
Expected: quality. Declared mass basis/method, organic carbon is distinct.
Positive case: Declared mass basis/method, organic carbon is distinct. Negative case: fixed carbon-to-matter conversion assumed.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### soil-q06: Which horizon lies immediately above the restrictive layer?

Source: S1; source-led order 6. Incidence: soil:HorizonOverlies, soil:RestrictiveSoilLayer.

Expression: `soil:HorizonOverlies`
Expected: relationship. Endpoint relation for horizons; restrictive nonpedogenic layer requires generalized Layer endpoint upstream.
Positive case: Endpoint relation for horizons; restrictive nonpedogenic layer requires generalized Layer endpoint upstream. Negative case: all layers forced into pedogenic Horizon.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### soil-q07: Is water washing material out of this horizon into the one below?

Source: S2; source-led order 7. Incidence: soil:SoilLeaching.

Expression: `soil:SoilLeaching`
Expected: process. Solute removal with receiving-layer evidence; content/flux bindings missing.
Positive case: Solute removal with receiving-layer evidence; content/flux bindings missing. Negative case: visible stain alone proves transfer.
Semantic status: blocked; grammar: untested. Model/resolution not executed.

### soil-q08: Has erosion removed the former surface horizon?

Source: S2; source-led order 8. Incidence: soil:HorizonRemovalEpisode, soil:HorizonThickness.

Expression: `change in soil:HorizonThickness of soil:SoilHorizon`
Expected: change quality. Thinning while identity persists; complete removal needs cessation event and separate dependent handling.
Positive case: Thinning while identity persists; complete removal needs cessation event and separate dependent handling. Negative case: vanished horizon assigned zero as retained subject.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### soil-q09: Did machinery compress the soil during the wet harvest?

Source: S3; source-led order 9. Incidence: soil:CompactionEpisode, soil:BulkDensity.

Expression: `change in soil:BulkDensity of soil:SoilBody`
Expected: change quality. Change plus machinery-loading evidence; no deterministic all-harvest compaction.
Positive case: Change plus machinery-loading evidence; no deterministic all-harvest compaction. Negative case: different sample location looks like change.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### soil-q10: Are these stable aggregates or loose mineral grains?

Source: S3; source-led order 10. Incidence: soil:SoilAggregate, soil:AggregateDiameter.

Expression: `soil:SoilAggregate`
Expected: subject. Aggregate individuation plus stability test/model; stability quality missing.
Positive case: Aggregate individuation plus stability test/model; stability quality missing. Negative case: any particle cluster assumed stable.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### soil-q11: Does a darker soil necessarily contain more organic carbon?

Source: S1; source-led order 11. Incidence: soil:OrganicMatterFraction.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Color observation and carbon/organic matter relationship require qualified model; no universal implication.
Positive case: Color observation and carbon/organic matter relationship require qualified model; no universal implication. Negative case: darker guarantees more carbon.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### soil-q12: Does the soil have enough water available for these plants?

Source: S2; source-led order 12. Incidence: soil:SoilBody.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Plant-available water requires species/root context, water-retention quantities and hydrology models.
Positive case: Plant-available water requires species/root context, water-retention quantities and hydrology models. Negative case: total moisture equals plant-available water.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### soil-q13: Can one sample stand for every soil horizon in the field?

Source: S1; source-led order 13. Incidence: soil:SoilPedon, soil:SoilHorizon.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Sampling representativeness is evidence/provenance work, not universal domain relation.
Positive case: Sampling representativeness is evidence/provenance work, not universal domain relation. Negative case: one sample represents every horizon.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### soil-q14: Does a soil survey texture class by itself establish crop suitability?

Source: S2; source-led order 14. Incidence: soil:ClayFraction.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Texture authority cannot imply crop suitability; additional plant/management/model dependencies.
Positive case: Texture authority cannot imply crop suitability; additional plant/management/model dependencies. Negative case: texture class guarantees suitability.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### soil-q15: If bulk density has not been measured can we call the soil uncompacted?

Source: S3; source-led order 15. Incidence: soil:BulkDensity.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Unmeasured density leaves compaction status unresolved; no Uncompacted inference.
Positive case: Unmeasured density leaves compaction status unresolved; no Uncompacted inference. Negative case: missing data establishes no compaction.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

## Candidate records

Exact names are provisional. Category/type and dependency arity are proposal coordinates; source evidence is not an ontology specification. Subject qualities and process parameters below identify meanings, not variables or equations.

### soil:SoilBody (subject; provisional)

Individuated pedogenic material body.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: S1, S2, S3.
Qualities: soil:BulkDensity. Parameters: none proposed.
Bindings: {}
Positive: contiguous pedogenic body. Negative: taxonomic class.
Question incidence: soil-q12.

Blocked quality uses (SOIL-R01):

- `soil:OrganicMatterFraction` on `soil:SoilBody`: Whole-body summary would require identified constituent horizons, compatible organic-matter mass basis and an explicit aggregation model. No SoilBody-to-SoilHorizon specialization exists; a whole-body fraction is not automatically the horizon-borne quality.

### soil:SoilHorizon (subject; provisional)

Pedogenic layer distinguished by its properties.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: S1, S2, S3.
Qualities: soil:HorizonThickness, soil:ClayFraction. Parameters: none proposed.
Bindings: {}
Positive: illuvial horizon. Negative: unmodified sedimentary layer.
Question incidence: soil-q01, soil-q02, soil-q05, soil-q13.

### soil:SoilAggregate (subject; provisional)

Soil particle assemblage with stronger internal binding.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: S1, S2, S3.
Qualities: soil:AggregateDiameter. Parameters: none proposed.
Bindings: {}
Positive: coherent ped. Negative: loose sieve fraction.
Question incidence: soil-q10.

### soil:SoilPedon (subject; blocked)

Bounded soil volume selected to characterize a soil individual.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: S1, S2, S3.
Qualities: none with proved bearer path. Parameters: none proposed.
Bindings: {}
Positive: described 3D pedon. Negative: laboratory vial extrapolated to whole field.
Question incidence: soil-q13.

Blocked quality uses (SOIL-R01):

- `soil:BulkDensity` on `soil:SoilPedon`: A selected pedon may define measurement support for material soil, but no inheritance or material-body identity path is established here. Resolve the pedon/body relation and represented volume before applying the body-borne quality.

### soil:RestrictiveSoilLayer (subject; blocked)

Layer restricting specified root/water movement in stated conditions.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: S1, S2, S3.
Qualities: none with proved bearer path. Parameters: none proposed.
Bindings: {}
Positive: cemented root-restricting layer. Negative: any dense horizon assumed impermeable.
Question incidence: soil-q06.

Blocked quality uses (SOIL-R01):

- `soil:HorizonThickness` on `soil:RestrictiveSoilLayer`: A restrictive layer can be nonpedogenic. HorizonThickness cannot be applied merely because the layer has thickness. Request a general layer-thickness distinction or prove a particular layer is a horizon; do not invent that inheritance.
- `soil:BulkDensity` on `soil:RestrictiveSoilLayer`: Restriction does not establish SoilBody specialization. A material-volume support and body relation must be supplied before this bearer use is valid.

### soil:BulkDensity (quality; provisional)

Dry soil mass per specified bulk volume including pores.
Parent: `imod:Quantity` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: S1, S2, S3, S4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "soil:SoilBody"}
Positive: dry mass per intact-core volume. Negative: particle density.
Question incidence: soil-q03, soil-q09, soil-q15.

### soil:HorizonThickness (quality; provisional)

Vertical separation of identified horizon boundaries.
Parent: `imod:Length` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: S1, S2, S3, S4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "soil:SoilHorizon"}
Positive: top to base thickness. Negative: depth to top.
Question incidence: soil-q01, soil-q08.

### soil:ClayFraction (quality; provisional)

Clay-size particle share with declared size convention/basis.
Parent: `imod:Proportion` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: S1, S2, S3, S4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "soil:SoilHorizon"}
Positive: fine-earth clay fraction. Negative: clay-mineral content.
Question incidence: soil-q02, soil-q14.

### soil:OrganicMatterFraction (quality; provisional)

Organic matter share on declared mass basis.
Parent: `imod:Proportion` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: S1, S2, S3, S4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "soil:SoilHorizon"}
Positive: organic matter mass fraction. Negative: organic carbon treated as identical.
Question incidence: soil-q05, soil-q11.

### soil:AggregateDiameter (quality; provisional)

Aggregate size under stated geometric convention.
Parent: `imod:Length` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: S1, S2, S3, S4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "soil:SoilAggregate"}
Positive: equivalent ped diameter. Negative: mineral grain diameter.
Question incidence: soil-q10.

### soil:SoilCompaction (process; provisional)

Compression reducing soil bulk pore space.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: S3.
Qualities: not applicable. Parameters: soil:BulkDensity.
Bindings: {"participants": ["soil:SoilBody"], "affects": ["soil:BulkDensity"], "creates": [], "confers": [], "rationale": "S3 describes compaction in terms of pore-space reduction and dry bulk-density change. The proposed affects targets BulkDensity of the compressed SoilBody, not an unproved horizon/pedon bearer. It expresses potential change under loading; density differences alone do not establish an occurrence or its cause. Applied stress, initial water state and particle composition remain missing governing quantities; no fixed density threshold is licensed.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: wheel loading compresses soil. Negative: naturally dense mineral particles.
Question incidence: soil-q03.

### soil:SoilAggregation (process; blocked)

Binding particles into soil aggregates.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: S3.
Qualities: not applicable. Parameters: soil:OrganicMatterFraction.
Bindings: {"participants": ["soil:SoilBody", "soil:SoilAggregate"], "affects": ["soil:AggregateDiameter"], "creates": ["soil:SoilAggregate"], "confers": [], "rationale": "S3 discusses binding of particles and organic inputs in aggregate formation. OrganicMatterFraction is a contextual quality of an identified SoilHorizon, not inherent in the process or automatically in SoilBody. Creates SoilAggregate is conditional on individuation of a newly bound assemblage. Potential AggregateDiameter change concerns an existing identified aggregate only; the source does not establish a universal monotonic size effect. Formation versus growth, aggregate identity and claim-specific evidence remain blockers.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: stable ped develops. Negative: sieve label assigned.
Question incidence: unused; needs fresh justification or removal.

### soil:SoilLeaching (process; blocked)

Soluble-constituent removal by moving water.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: S2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"participants": ["soil:SoilHorizon"], "affects": [], "creates": [], "confers": [], "rationale": "S2 indexed passages describe dissolved constituents moving out of an upper horizon with percolating water. The candidate needs solute-specific content of donor/receiver horizons and water-flow qualities from chemistry/hydrology before affects can be specified. Their absence is an upstream gap, not an inferred zero transfer. Full publication retrieval failed; retain source-review blocker.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: solute leaves upper horizon. Negative: horizon excavated.
Question incidence: soil-q04, soil-q07.

### soil:SoilMaterialErosion (process; blocked)

Detachment and transport of soil material.
Parent: `earth:Erosion` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: S2, S4.
Qualities: not applicable. Parameters: soil:HorizonThickness.
Bindings: {"participants": ["soil:SoilHorizon"], "affects": ["soil:HorizonThickness"], "creates": [], "confers": [], "rationale": "Removal can potentially alter HorizonThickness of the particular source SoilHorizon while it remains identifiable. Local detachment or lateral export does not guarantee a measured thickness decrease at every observation support. Complete removal is a cessation event, not continuing a nonexistent horizon with zero thickness. S4 supplies description conventions, not a causal erosion law; S2 is only indexed evidence. Event attribution and claim-level source review remain blocked.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: surface horizon eroded. Negative: color fades without removal.
Question incidence: unused; needs fresh justification or removal.

### soil:HorizonDevelopment (process; blocked)

Pedogenic differentiation forming a horizon.
Parent: `imod:Process` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: S1, S4.
Qualities: not applicable. Parameters: soil:ClayFraction, soil:OrganicMatterFraction.
Bindings: {"participants": ["soil:SoilBody", "soil:SoilHorizon"], "affects": ["soil:HorizonThickness"], "creates": ["soil:SoilHorizon"], "confers": [], "rationale": "S1 distinguishes a pedogenically differentiated horizon from an inherited layer. Creates SoilHorizon is a proposed individuation consequence when a distinct horizon becomes identifiable, not when an observer merely changes its designation. HorizonThickness may change for an existing horizon but is not guaranteed to increase. ClayFraction and OrganicMatterFraction are horizon-borne diagnostic/context qualities, not sufficient governing causes. S4 gives observation conventions; full S1 source retrieval and process-specific evidence are still missing.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: illuvial layer develops. Negative: inherited strata relabeled.
Question incidence: unused; needs fresh justification or removal.

### soil:HorizonOverlies (relationship; provisional)

One horizon immediately overlies another in same soil body.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: S1, S4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "soil:SoilHorizon", "target": "soil:SoilHorizon", "rationale": "No intervening horizon; not chronological sequence."}
Positive: A directly above B. Negative: labels from separate profiles.
Question incidence: soil-q06.

### soil:AggregateConstituentOf (relationship; provisional)

Aggregate is physically part of soil body.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: S1, S4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "soil:SoilAggregate", "target": "soil:SoilBody", "rationale": "Extraction can end membership through an occurrence; no automatic cascade."}
Positive: ped in intact horizon. Negative: similar ped from another field.
Question incidence: unused; needs fresh justification or removal.

### soil:PedonCharacterizesBody (relationship; blocked)

A selected pedon is representative evidence for a soil body.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: S1, S4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "soil:SoilPedon", "target": "soil:SoilBody", "rationale": "Sampling/provenance relation belongs outside domain articulation; blocked boundary example, not proposed promotion."}
Positive: documented sampling design. Negative: nearby sample assumed representative.
Question incidence: unused; needs fresh justification or removal.

### soil:CompactionEpisode (event; provisional)

Bounded loading occurrence compressing soil.
Parent: `earth:GeolocatedEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: S2, S3.
Qualities: not applicable. Parameters: soil:BulkDensity.
Bindings: {"participants": ["soil:SoilBody", "soil:SoilHorizon", "soil:SoilAggregate"], "affects": ["soil:BulkDensity"], "creates": [], "confers": [], "rationale": "Identity loss and dependent-relation cessation require occurrence; no implicit state retention or implemented cascade.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: wet-soil vehicle pass with compression. Negative: vehicle pass with no demonstrated change.
Question incidence: soil-q09.

### soil:HorizonRemovalEpisode (event; provisional)

Bounded removal of an identified horizon.
Parent: `earth:GeolocatedEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: S2, S3.
Qualities: not applicable. Parameters: soil:BulkDensity.
Bindings: {"participants": ["soil:SoilBody", "soil:SoilHorizon", "soil:SoilAggregate"], "affects": ["soil:HorizonThickness"], "creates": [], "confers": [], "rationale": "Identity loss and dependent-relation cessation require occurrence; no implicit state retention or implemented cascade.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: erosion removes former A horizon. Negative: horizon invisible in photograph.
Question incidence: soil-q08.

### soil:AggregateDisruptionEpisode (event; provisional)

Bounded disaggregation of an identified soil aggregate.
Parent: `earth:GeolocatedEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: S2, S3.
Qualities: not applicable. Parameters: soil:BulkDensity.
Bindings: {"participants": ["soil:SoilBody", "soil:SoilHorizon", "soil:SoilAggregate"], "affects": ["soil:AggregateDiameter"], "creates": [], "confers": [], "rationale": "Identity loss and dependent-relation cessation require occurrence; no implicit state retention or implemented cascade.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: ped breaks under disturbance. Negative: sieving convention differs.
Question incidence: unused; needs fresh justification or removal.

## Quality summaries and evidence states

Proposed ClayRich summarizes `soil:ClayFraction`. Ordered comparison to declared fine-earth reference; official texture classes require sand/silt/clay authority boundaries, not this single quality.

This is blocked until comparison conventions and observations exist. Unknown, unmeasured and disputed describe evidence, not domain predicates. Nominal identity, ordering and overlap must be reviewed separately. No exhaustive classification or universal thresholds are invented.

## Coverage and next revision

Counts: {"subject": 5, "quality": 5, "process": 5, "relationship": 3, "event": 3}. The five/category objective has two unfilled relationship and two unfilled event slots. Counts include explicitly blocked candidates; they are not a readiness score.

Unused candidates: soil:SoilAggregation, soil:SoilMaterialErosion, soil:HorizonDevelopment, soil:AggregateConstituentOf, soil:PedonCharacterizesBody, soil:AggregateDisruptionEpisode.

Agency primary materials are bounded starting evidence, often educational/descriptive. Sources do not endorse ontological categories, exact inferred bindings or exhaustive coverage. Retrieval failures are recorded per source.

Request fresh independent questions from domain experts after this revision is frozen. Broaden beyond the agency educational sources, reconcile contested meanings and upstream parents, and retire unsupported candidates rather than preserving legacy comments by default. Do not promote speculative alternatives into executable src.

## Validation, stage handoff and stop condition

Local checks cover field presence, 15 question IDs, referenced candidate/source IDs and incidence only. Actual syntax, adaptation, scientific validity and model execution are separate. A qualified missing concept may parse and still fail resolution. The deliberately malformed expression in dossier.json must be rejected by the real parser.

Freeze dossier/import hashes, resolve blocking ambiguity/source gaps, human domain and ontology review, actual candidate parser/adaptation/reasoner checks, separate exact-revision approval; no self-approval.

Map stable concept/question/source IDs into existing context-pack evidence/assets/alignment/open_questions fields; keep schema1.3 unchanged. Suggested future source-review ledger, question-semantic tests and exact hash approval bindings need backend discussion, not unilateral API invention.

All change/cessation requires an occurrent. At time transitions resolve change in each quality separately. Unresolved change permits operation with available knowledge; it does not imply no real change or a retention rule. Implication/detection remain syntax-only. No role-conferral binding is asserted without evidence, and no consequence engine is implemented.

## Final author audit: upstream prerequisites and transport caveat

- **soil-fluid**: Soil water content, retention and throughflow; solute content. Hydrology/chemistry collaboration needed. Leaching bindings deliberately empty.
- **soil-load**: Applied mechanical stress, soil water state, particle density. Compaction governing conditions missing; bulk density is response quality, not sufficient causal parameter.
- **soil-layer**: General material layer and root-restricting relation. RestrictiveSoilLayer bundles a function; must compose against specified plant/water endpoint rather than universal impermeability.

Process parameters are incomplete and include response qualities. This dossier does not claim a complete governing-parameter set. The JSON import_evidence records exact local imported file hashes. Resolve the listed prerequisites instead of using a local invented parent or pretending a missing force/flux quality exists.

No source disagreement was resolved by majority vote. Differences in operational perspective (including freshwater versus marine estuary, field landform schemes versus universal types, or material parcel versus fixed region) are preserved as scoped alternatives. Human expert review and independent probes remain outstanding.

## Reviewer corrections SOIL-R01 and SOIL-R02

Four unproved bearer uses are now separated from direct subject qualities in dossier.json. No SoilBody/Horizon/Pedon/RestrictiveLayer inheritance was invented. Whole-body organic-matter summaries need explicit constituent support and aggregation; restrictive layers need not be pedogenic horizons.

Each process now has its own participant-specific potential-effect rationale and narrower source list. Compaction uses body-borne density; aggregation separates formation from existing-aggregate growth; leaching remains upstream-blocked; erosion does not guarantee thickness loss at every support; horizon development does not equate relabeling with material creation. Weak-source and incomplete-parameter blockers remain. These author corrections do not constitute expert approval. Question strings, parser results, alignment coordinates and import hashes are preserved.
