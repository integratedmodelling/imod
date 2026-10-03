# land: domain bootstrap dossier

> Draft research evidence and semantic design. No candidate declaration is executable or approved. Read QUESTIONS_FIRST.md for the preserved source-led question order.

Land management and agricultural use as observable practices on specified land units; biophysical cover, intended use, tenure and suitability are different axes.

## What the evidence supports, and what this dossier proposes

ManagedField and LandEvaluationUnit cannot quietly specialise earth:Region's volumetric meaning if their identity is a surface polygon: parent remains proposed with an explicit upstream footprint distinction. CropStand and VegetationPatch may be configurations rather than things; unity criteria need biology/ecology review. AgriculturalHolding has an operational/institutional boundary and may belong under society. Do not retain land:LandCover as a universal identity merely because the old file declares it. FAO classifications are versioned authorities; LCCS categories, use labels and conservation agriculture rules are not mutually equivalent or automatically exhaustive. AdjacentField is symmetric and may be better a bond rather than a directed relationship; keep it blocked pending relationship/bond decision. ResidueRetention may be a practice/state description rather than homogeneous process: intervention bounds and evidence are required.

FAO focus gives useful agricultural examples but weak urban land use, pastoral tenure, forestry management and land rights. Five relationships include cross-domain topology placeholders rather than five demonstrated domain-essential intensions.

The linked sources establish disciplinary examples and distinctions. All named candidate intensions, endpoints, parent choices and test cases below are author proposals for review, not quotations or an assertion that the source authors endorsed this ontology. Primary-source confidence and scientific validity are separate from grammar acceptance. No domain experts have been interviewed.

## Sources and scope

- **FAO-LCCS** [Land Cover Classification System](https://www.fao.org/4/x0596e/x0596e00.htm). 2000; Part A definitions and mixed mapping units. Land cover classification structure; a specific authority version, not universal equivalence. Retrieved 2026-10-03; limited primary-source screening.
- **FAO-EVAL** [A Framework for Land Evaluation: Basic concepts](https://www.fao.org/4/X5310E/x5310e03.htm). Sections 2.1–2.5. Land use-specific suitability, qualities and characteristics; older framework retained with scope. Retrieved 2026-10-03; limited primary-source screening.
- **FAO-CA** [Conservation Agriculture principles](https://www.fao.org/conservation-agriculture/overview/conservation-agriculture-principles/en/). Three principles and scheme thresholds. Specific conservation agriculture criteria; no universal good/bad land predicate. Retrieved 2026-10-03; limited primary-source screening.
- **FAO-SEED** [Minimum mechanical soil disturbance](https://www.fao.org/conservation-agriculture/in-practice/minimum-mechanical-soil-disturbance/en/). Direct seeding or planting. Practical seeding and residue treatment examples; not universal yield response. Retrieved 2026-10-03; limited primary-source screening.
- **FAO-WATER** [Crop evapotranspiration guidelines](https://www.fao.org/4/s8376e/s8376e.pdf). Crop water requirements; historical edition. Water requirement distinction; models excluded, updated 2025 revision needs full audit. Retrieved 2026-10-03; limited primary-source screening.

## Source-led questions and extracted observables

### land-q01: Which fields are being used for food crops rather than merely covered by green vegetation?

Source: FAO-LCCS. Preserved source-question order 1; no independent holdout claim.

**Expression gap:** observed cover plus management purpose; greenness does not establish use. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: one delineated field. Negative boundary: every polygon from a satellite classification.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### land-q02: Which land units can support the specified crop without irrigation?

Source: FAO-EVAL. Preserved source-question order 2; no independent holdout claim.

**Expression gap:** crop-specific requirements and land qualities; generic suitable is ambiguous. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: one declared evaluation unit. Negative boundary: an abstract suitability class.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### land-q03: How much soil surface remains covered after sowing?

Source: FAO-CA. Preserved source-question order 3; no independent holdout claim.

Draft expression: `land:SurfaceCoverFraction of land:ManagedField`. Expected expression-result category: quality.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: A value observed for the named bearer and stated convention.. Negative boundary: An unqualified score, missing observation or value from another bearer treated as equivalent..
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### land-q04: Where did irrigation add water during this dry spell?

Source: FAO-WATER. Preserved source-question order 4; no independent holdout claim.

Draft expression: `land:Irrigation`. Expected expression-result category: process.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: water applied to field. Negative boundary: natural rainfall.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### land-q05: Which field was planted in this sowing episode?

Source: FAO-SEED. Preserved source-question order 5; no independent holdout claim.

Draft expression: `land:SowingEpisode`. Expected expression-result category: event.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: one completed field sowing. Negative boundary: unbounded sowing practice.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### land-q06: How much of the field was mechanically disturbed?

Source: FAO-CA. Preserved source-question order 6; no independent holdout claim.

Draft expression: `land:DisturbedAreaFraction of land:ManagedField`. Expected expression-result category: quality.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: A value observed for the named bearer and stated convention.. Negative boundary: An unqualified score, missing observation or value from another bearer treated as equivalent..
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### land-q07: Which land is managed as part of the same agricultural holding?

Source: FAO-EVAL. Preserved source-question order 7; no independent holdout claim.

**Expression gap:** holding/operator identity and management records; adjacency insufficient. Expected hidden category: relationship.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: field managed in the holding. Negative boundary: field nearby but managed elsewhere.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### land-q08: Did residue retention change surface cover without changing crop species?

Source: FAO-SEED. Preserved source-question order 8; no independent holdout claim.

Draft expression: `change in land:SurfaceCoverFraction of land:ManagedField`. Expected expression-result category: process.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: residue deliberately left after harvest. Negative boundary: claim all residue is retained without evidence.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### land-q09: Which harvest removed products from this crop stand?

Source: FAO-SEED. Preserved source-question order 9; no independent holdout claim.

Draft expression: `land:HarvestEpisode`. Expected expression-result category: event.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: one harvest operation. Negative boundary: annual harvest statistic.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### land-q10: Do two maps calling an area forest use the same definition?

Source: FAO-LCCS. Preserved source-question order 10; no independent holdout claim.

**Expression gap:** authority/version criteria; reject automatic equivalence. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: one mapped vegetation patch. Negative boundary: land legally zoned forest without vegetation.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### land-q11: Did fire change land cover while the intended farming use remained unchanged?

Source: FAO-LCCS. Preserved source-question order 11; no independent holdout claim.

**Expression gap:** distinguish observed cover change from land-use conversion; fire event upstream. Expected hidden category: event.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: documented vegetation removal episode. Negative boundary: different map legend applied without real change.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### land-q12: Is poor crop performance due to water shortage or an unsuitable soil condition?

Source: FAO-EVAL. Preserved source-question order 12; no independent holdout claim.

**Expression gap:** distinct soil/root-zone qualities and causal models. Expected hidden category: quality.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: A value observed for the named bearer and stated convention.. Negative boundary: An unqualified score, missing observation or value from another bearer treated as equivalent..
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### land-q13: Does no-till automatically make this farm sustainable?

Source: FAO-CA. Preserved source-question order 13; no independent holdout claim.

**Expression gap:** invalid implication; one practice is not comprehensive sustainability. Expected hidden category: process.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: cultivation disturbing soil. Negative boundary: undisturbed land merely classified cropland.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### land-q14: Which crop stand occupies this field now?

Source: FAO-SEED. Preserved source-question order 14; no independent holdout claim.

Draft expression: `land:OccupiesField linking land:CropStand to land:ManagedField`. Expected expression-result category: relationship.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: crop stand located in field. Negative boundary: crop name listed in a future plan.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### land-q15: Which land-use change is observed, and which is only planned?

Source: FAO-EVAL. Preserved source-question order 15; no independent holdout claim.

**Expression gap:** bounded implemented management transition versus plan; observation evidence required. Expected hidden category: event.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: actual change from cultivation to another managed use. Negative boundary: a zoning proposal alone.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

## Candidate register

Every parent below names an existing imported root/domain declaration. Its presence is verified; its scientific adequacy is proposed, not validated. Local candidate references are not installed declarations. Types follow the context-pack observational perspective; records with unresolved unity, institutional or endpoint meaning remain blocked.

### land:ManagedField — subject (blocked)

A land management unit delimited by an explicit cultivation boundary.
Proposed imported parent: `earth:Region`. Evidence: FAO-EVAL.
Positive: one delineated field. Negative: every polygon from a satellite classification.
Bearer qualities: `land:SurfaceCoverFraction`, `land:DisturbedAreaFraction`.

Question incidence: land-q01, land-q03, land-q06, land-q08, land-q14.

### land:LandEvaluationUnit — subject (blocked)

A bounded land unit selected for evaluating a stated use.
Proposed imported parent: `earth:Region`. Evidence: FAO-EVAL.
Positive: one declared evaluation unit. Negative: an abstract suitability class.
Bearer qualities: `land:PlantAvailableWater`.

Question incidence: land-q02.

### land:CropStand — subject (blocked)

A bounded cultivated plant population treated as an observational whole.
Proposed imported parent: `imod:Subject`. Evidence: FAO-SEED.
Positive: standing cereal crop in one field. Negative: stored grain after harvest.
Bearer qualities: `land:HarvestableBiomass`.

Question incidence: land-q14.

### land:VegetationPatch — subject (blocked)

A bounded observed vegetation assemblage with declared delineation criteria.
Proposed imported parent: `imod:Subject`. Evidence: FAO-LCCS.
Positive: one mapped vegetation patch. Negative: land legally zoned forest without vegetation.
Bearer qualities: `land:SurfaceCoverFraction`.

Question incidence: land-q10.

### land:AgriculturalHolding — subject (blocked)

An operational land-management unit under a specified management convention.
Proposed imported parent: `imod:Subject`. Evidence: FAO-EVAL.
Positive: holding with documented management boundary. Negative: any contiguous agricultural cover polygon.
Bearer qualities: `land:ManagedArea`.

Question incidence: none: coverage candidate needs a fresh question or removal.

### land:Irrigation — process (provisional)

Deliberate water application to a managed growing area.
Proposed imported parent: `imod:Process`. Evidence: FAO-WATER.
Positive: water applied to field. Negative: natural rainfall.
Relevant quality parameters (no equations): `land:PlantAvailableWater`, `land:AppliedWaterAmount`.
Proposed affects: land:PlantAvailableWater; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: land-q04.

### land:Tillage — process (provisional)

Mechanical disturbance of soil during land management.
Proposed imported parent: `imod:Process`. Evidence: FAO-CA.
Positive: cultivation disturbing soil. Negative: undisturbed land merely classified cropland.
Relevant quality parameters (no equations): `land:DisturbedAreaFraction`.
Proposed affects: land:DisturbedAreaFraction; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: land-q13.

### land:Sowing — process (provisional)

Placement of seed into the growing substrate as a management activity.
Proposed imported parent: `imod:Process`. Evidence: FAO-SEED.
Positive: direct drill placing seed. Negative: spontaneous seed dispersal.
Relevant quality parameters (no equations): `land:SeedPlacementDepth`, `land:DisturbedAreaFraction`.
Proposed affects: land:DisturbedAreaFraction; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### land:Harvesting — process (provisional)

Removal of cultivated biological production in a management operation.
Proposed imported parent: `imod:Process`. Evidence: FAO-SEED.
Positive: cutting mature crop. Negative: uncollected wildfire consumption.
Relevant quality parameters (no equations): `land:HarvestableBiomass`.
Proposed affects: land:HarvestableBiomass; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### land:ResidueRetention — process (blocked)

Management leaving specified crop residue at the soil surface.
Proposed imported parent: `imod:Process`. Evidence: FAO-SEED.
Positive: residue deliberately left after harvest. Negative: claim all residue is retained without evidence.
Relevant quality parameters (no equations): `land:SurfaceCoverFraction`.
Proposed affects: land:SurfaceCoverFraction; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: land-q08.

### land:OccupiesField — relationship (provisional)

Spatial occupancy of a managed field by a stated crop stand.
Proposed imported parent: `imod:Relationship`. Evidence: FAO-SEED.
Positive: crop stand located in field. Negative: crop name listed in a future plan.

Endpoints: `land:CropStand` → `land:ManagedField`; structural.
Question incidence: land-q14.

### land:ManagesField — relationship (provisional)

Holding-level management assignment of a field within declared operational scope.
Proposed imported parent: `imod:Relationship`. Evidence: FAO-EVAL.
Positive: field managed in the holding. Negative: field nearby but managed elsewhere.

Endpoints: `land:AgriculturalHolding` → `land:ManagedField`; structural.
Question incidence: land-q07.

### land:OverlapsEvaluationUnit — relationship (provisional)

Declared spatial overlap between a field and an evaluation unit.
Proposed imported parent: `imod:Relationship`. Evidence: FAO-EVAL.
Positive: field intersects evaluation unit. Negative: same suitability label without overlap.

Endpoints: `land:ManagedField` → `land:LandEvaluationUnit`; structural.
Question incidence: none: coverage candidate needs a fresh question or removal.

### land:AdjacentField — relationship (blocked)

Field-to-field boundary adjacency under stated topology.
Proposed imported parent: `imod:Relationship`. Evidence: FAO-LCCS.
Positive: fields sharing a declared boundary. Negative: fields separated by an intervening road.

Endpoints: `land:ManagedField` → `land:ManagedField`; undecided_relationship_or_bond.
Question incidence: none: coverage candidate needs a fresh question or removal.

### land:SupportsCropStand — relationship (blocked)

Land evaluation unit providing the rooting setting of a crop stand; no productivity guarantee.
Proposed imported parent: `imod:Relationship`. Evidence: FAO-EVAL.
Positive: stand rooted in unit. Negative: suitability predicted without any crop present.

Endpoints: `land:LandEvaluationUnit` → `land:CropStand`; functional.
Question incidence: none: coverage candidate needs a fresh question or removal.

### land:SowingEpisode — event (provisional)

A bounded planting operation on a specified field.
Proposed imported parent: `imod:Event`. Evidence: FAO-SEED.
Positive: one completed field sowing. Negative: unbounded sowing practice.
Relevant quality parameters (no equations): `land:SeedPlacementDepth`.
Proposed affects: land:DisturbedAreaFraction; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: land-q05.

### land:HarvestEpisode — event (provisional)

A bounded product-removal operation on an identified crop stand.
Proposed imported parent: `imod:Event`. Evidence: FAO-SEED.
Positive: one harvest operation. Negative: annual harvest statistic.
Relevant quality parameters (no equations): `land:HarvestableBiomass`.
Proposed affects: land:HarvestableBiomass; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: land-q09.

### land:IrrigationEpisode — event (provisional)

A bounded water-application operation with identified area and start/end.
Proposed imported parent: `imod:Event`. Evidence: FAO-WATER.
Positive: one irrigation application. Negative: irrigation capability only.
Relevant quality parameters (no equations): `land:AppliedWaterAmount`.
Proposed affects: land:PlantAvailableWater; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### land:LandUseConversion — event (blocked)

A bounded implemented transition between specified land management uses.
Proposed imported parent: `imod:Event`. Evidence: FAO-EVAL.
Positive: actual change from cultivation to another managed use. Negative: a zoning proposal alone.
Relevant quality parameters (no equations): `land:ManagedArea`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: land-q15.

### land:CoverChangeEpisode — event (blocked)

A bounded occurrence producing a stated change in biophysical cover.
Proposed imported parent: `imod:Event`. Evidence: FAO-LCCS.
Positive: documented vegetation removal episode. Negative: different map legend applied without real change.
Relevant quality parameters (no equations): `land:SurfaceCoverFraction`.
Proposed affects: land:SurfaceCoverFraction; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: land-q11.

### land:SurfaceCoverFraction — quality (provisional)

Fraction of declared land surface covered by the identified material/vegetation at an observation stage.
Proposed imported parent: `imod:Proportion`. Evidence: FAO-EVAL, FAO-LCCS, FAO-SEED.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `land:ManagedField`, `land:VegetationPatch`. Parameter of: `land:ResidueRetention`, `land:CoverChangeEpisode`. Affected by: `land:ResidueRetention`, `land:CoverChangeEpisode`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: land-q03, land-q08.

### land:DisturbedAreaFraction — quality (provisional)

Fraction of the specified managed surface mechanically disturbed by a declared operation.
Proposed imported parent: `imod:Proportion`. Evidence: FAO-EVAL, FAO-CA, FAO-SEED.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `land:ManagedField`. Parameter of: `land:Tillage`, `land:Sowing`. Affected by: `land:Tillage`, `land:Sowing`, `land:SowingEpisode`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: land-q06.

### land:PlantAvailableWater — quality (blocked)

Water available to a specified rooted crop in a stated soil profile; requires soil and crop conventions.
Proposed imported parent: `imod:Quality`. Evidence: FAO-EVAL, FAO-WATER.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `land:LandEvaluationUnit`. Parameter of: `land:Irrigation`. Affected by: `land:Irrigation`, `land:IrrigationEpisode`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: land-q12.

### land:HarvestableBiomass — quality (provisional)

Biological material of a stated crop and product that meets a specified harvest criterion.
Proposed imported parent: `imod:Quality`. Evidence: FAO-SEED.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `land:CropStand`. Parameter of: `land:Harvesting`, `land:HarvestEpisode`. Affected by: `land:Harvesting`, `land:HarvestEpisode`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### land:ManagedArea — quality (provisional)

Area within a declared operational land-management boundary, distinct from ownership.
Proposed imported parent: `imod:Area`. Evidence: FAO-EVAL.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `land:AgriculturalHolding`. Parameter of: `land:LandUseConversion`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### land:AppliedWaterAmount — quality (provisional)

Amount of water applied in a named irrigation operation.
Proposed imported parent: `imod:Quality`. Evidence: FAO-WATER.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `land:Irrigation`, `land:IrrigationEpisode`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### land:SeedPlacementDepth — quality (provisional)

Depth of placed seed relative to the specified soil surface.
Proposed imported parent: `imod:Quality`. Evidence: FAO-SEED.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `land:Sowing`, `land:SowingEpisode`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

## Quality summaries, not unexplained labels

- **conservation agriculture cover class** summarises `land:SurfaceCoverFraction`: Ordered FAO-CA scheme-specific ranges at its prescribed observation stage; authority attachment, no universal ecosystem-health ordering. Status: provisional_no_predicate_declaration.
- **water-limited for a specified crop** summarises `land:PlantAvailableWater`: Comparison with crop/rooting and environmental context; multiple limitations may coexist, no exhaustive partition. Status: provisional_no_predicate_declaration.
- **minimum disturbance** summarises `land:DisturbedAreaFraction`: Scheme-relative combination of disturbance width/area and timing; not synonym for zero disturbance. Status: provisional_no_predicate_declaration.
- **high-yielding** summarises `land:HarvestableBiomass`: Comparison to specified crop, area and reference conditions; cannot infer sustainable from high output. Status: provisional_no_predicate_declaration.

Evidence states such as unknown, unmeasured and disputed are not new predicates. No thresholds were invented, and no listed scheme is an exhaustive classification of the world.

## Dependency and review gates

Proposed import order is root imod → earth → land. Cross-domain source examples are not reverse ontology imports. Missing meanings generate upstream issues instead of local workarounds.

Before review-ready: settle blocking identity and parent choices; obtain fresh source-first probes from a reviewer who has not seen candidate vocabulary; prune unused candidates; compare authority scopes and preserve dissent; freeze exact artifact/import revisions; parse expressions and declarations separately; run adaptation and loaded semantic validation; obtain human scientific and ontology review. A syntax pass cannot approve a source interpretation.

Suggested stage attachments remain proposals for backend discussion: source-review ledger, question-semantic result matrix, ambiguity decisions, exact tested artifact hashes and approval bindings to revision/action/base. They are not a replacement for context-pack 1.3 proposal schema or a new API contract.

All change and cessation require occurrents. Changes in qualities are separately resolved at context transitions; unresolved changes remain open-world unknown. Implication/detection are syntax-only. No process-to-role-to-configuration runtime was built. Jargon, if approved later, belongs in alias-only equals modules; tier policy remains unresolved.

## Current checks and coverage

Recorded counts: {"subject":5,"process":5,"relationship":5,"event":5,"quality":7}; 15 narrative questions. 7 draft expressions, 8 explicit gaps.

JSON and incidence are locally checkable. Actual parser results will be supplied by the parent validation runner; this dossier does not claim a pass. No subject/process/relationship/event list is approved simply because it reaches five. Every unused candidate remains exposed in dossier.json coverage.

Predicate-specific evidence correction: the conservation-agriculture cover summary directly cites [FAO-CA, Permanent soil organic cover](https://www.fao.org/conservation-agriculture/overview/conservation-agriculture-principles/en/), including its post-direct-seeding observation scope. This is a scheme-specific classification, not a universal ecosystem-health predicate.
