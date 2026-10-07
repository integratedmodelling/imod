# Agriculture research bootstrap

Deliberate cultivation and livestock husbandry, operational holdings, managed organisms/populations and bounded interventions. Forestry, aquaculture and downstream processing are adjacent domains, not silently included.

All candidate meanings remain blocked/provisional. Boundary organization is authorized; semantic approval is not. No executable namespace or declaration is added.

22 active candidate records; 18 research questions. Stable `land-` IDs on moved agriculture records preserve history, not domain ownership. See [27-entry dispositions](../LAND_AGRICULTURE_REVISION.md).

## Dependencies and boundaries

- **imod**: Keyword type context only
- **land**: Shared surface/use and management qualities; research dependency, no agriculture.kwv installed
- **life**: Organism individuality
- **ecology**: Population and herbivory context; herd unity unresolved
- **society**: Responsible agents and institutional organization
- **economics**: Operational production unit; holding not assumed establishment-equivalent
- **soil**: Soil bearer/disturbance and root-zone availability gaps
- **hydrology**: Water quantity and application context

## Source evidence

- **FAO-CA** [Conservation Agriculture principles](https://www.fao.org/conservation-agriculture/overview/conservation-agriculture-principles/en/): Three principles and scheme thresholds. Specific conservation agriculture criteria; no universal good/bad land predicate.
- **FAO-EVAL** [A Framework for Land Evaluation: Basic concepts](https://www.fao.org/4/X5310E/x5310e03.htm): Sections 2.1Ã¢â‚¬â€œ2.5. Land use-specific suitability, qualities and characteristics; older framework retained with scope.
- **FAO-HOLDING** [WCA 2010 scope and units](https://www.fao.org/4/a0135e/A0135E04.htm): Chapter 3: agricultural holding and agricultural holder. Operational unit distinct from manager and parcel; historical framework, not asserted current standard.
- **FAO-LCCS** [Land Cover Classification System](https://www.fao.org/4/x0596e/x0596e00.htm): 2000; Part A definitions and mixed mapping units. Land cover classification structure; a specific authority version, not universal equivalence.
- **FAO-SEED** [Minimum mechanical soil disturbance](https://www.fao.org/conservation-agriculture/in-practice/minimum-mechanical-soil-disturbance/en/): Direct seeding or planting. Practical seeding and residue treatment examples; not universal yield response.
- **FAO-WATER** [Crop evapotranspiration guidelines](https://www.fao.org/4/s8376e/s8376e.pdf): Crop water requirements; historical edition. Water requirement distinction; models excluded, updated 2025 revision needs full audit.
- **FAO-WCA** [World Programme for the Census of Agriculture 2010: definitions](https://www.fao.org/4/a0135e/A0135E07.htm): 11.151-11.153: animals raised, responsibility and pastoral systems; 11.44 communal grazing. Historical statistical evidence: animals raised need not be owned or on holding land. Reporting conventions are not ontology axioms.

## Candidate meanings

### agriculture:ManagedField

Stable ID: `land-ManagedField`. Category: subject; status: blocked; proposed parent: `unresolved upstream parent`.
A land management unit delimited by an explicit cultivation boundary.
Parent gate: Pending upstream surface bearer, not volumetric earth:Region.
Positive: one delineated field. Counterexample: every polygon from a satellite classification.
Sources: FAO-EVAL. Bindings and prior blockers are retained in dossier.json.

### agriculture:CropStand

Stable ID: `land-CropStand`. Category: subject; status: blocked; proposed parent: `ecology:Population`.
A bounded cultivated plant population treated as an observational whole.
Parent gate: Research ecology dossier Population; cultivation/population unity unresolved, no accepted declaration.
Positive: standing cereal crop in one field. Counterexample: stored grain after harvest.
Sources: FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### agriculture:AgriculturalHolding

Stable ID: `land-AgriculturalHolding`. Category: subject; status: blocked; proposed parent: `unresolved upstream parent`.
Agricultural operational production unit under unified management, distinct from its manager, enterprise and any land parcels; may be landless.
Parent gate: Society/economics operational-unit parent missing; no automatic Organization or terrestrial Region inheritance.
Positive: holding with documented management boundary. Counterexample: any contiguous agricultural cover polygon.
Sources: FAO-HOLDING. Bindings and prior blockers are retained in dossier.json.

### agriculture:Irrigation

Stable ID: `land-Irrigation`. Category: process; status: blocked; proposed parent: `imod:Process`.
Deliberate water application for cultivated production; agricultural specialization of a broader water-application meaning still to be agreed.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: water applied to field. Counterexample: natural rainfall.
Sources: FAO-WATER. Bindings and prior blockers are retained in dossier.json.

### agriculture:Tillage

Stable ID: `land-Tillage`. Category: process; status: blocked; proposed parent: `imod:Process`.
Mechanical disturbance of soil during land management.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: cultivation disturbing soil. Counterexample: undisturbed land merely classified cropland.
Sources: FAO-CA. Bindings and prior blockers are retained in dossier.json.

### agriculture:Sowing

Stable ID: `land-Sowing`. Category: process; status: blocked; proposed parent: `imod:Process`.
Placement of seed into the growing substrate as a management activity.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: direct drill placing seed. Counterexample: spontaneous seed dispersal.
Sources: FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### agriculture:Harvesting

Stable ID: `land-Harvesting`. Category: process; status: blocked; proposed parent: `imod:Process`.
Removal of products from cultivated production; does not silently include forestry or wild harvesting.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: cutting mature crop. Counterexample: uncollected wildfire consumption.
Sources: FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### agriculture:ResidueRetention

Stable ID: `land-ResidueRetention`. Category: process; status: blocked; proposed parent: `imod:Process`.
An actual intervention retaining crop residues at a specified site; residue presence alone is not evidence of this process.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: residue deliberately left after harvest. Counterexample: claim all residue is retained without evidence.
Sources: FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### agriculture:OccupiesField

Stable ID: `land-OccupiesField`. Category: relationship; status: blocked; proposed parent: `unresolved upstream parent`.
Spatial occupancy of a managed field by a stated crop stand.
Parent gate: Needs an upstream occupancy meaning and evidence that field endpoints add a domain distinction.
Positive: crop stand located in field. Counterexample: crop name listed in a future plan.
Sources: FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### agriculture:ManagesField

Stable ID: `land-ManagesField`. Category: relationship; status: blocked; proposed parent: `imod:Relationship`.
An identified responsible actor actually manages a cultivated field within a specified holding context; the holding is not the actor.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: field managed in the holding. Counterexample: field nearby but managed elsewhere.
Sources: FAO-EVAL. Bindings and prior blockers are retained in dossier.json.

### agriculture:SowingEpisode

Stable ID: `land-SowingEpisode`. Category: event; status: blocked; proposed parent: `imod:Event`.
A bounded planting operation on a specified field.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: one completed field sowing. Counterexample: unbounded sowing practice.
Sources: FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### agriculture:HarvestEpisode

Stable ID: `land-HarvestEpisode`. Category: event; status: blocked; proposed parent: `imod:Event`.
A bounded product-removal operation on an identified crop stand.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: one harvest operation. Counterexample: annual harvest statistic.
Sources: FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### agriculture:IrrigationEpisode

Stable ID: `land-IrrigationEpisode`. Category: event; status: blocked; proposed parent: `imod:Event`.
A bounded water-application operation with identified area and start/end.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: one irrigation application. Counterexample: irrigation capability only.
Sources: FAO-WATER. Bindings and prior blockers are retained in dossier.json.

### agriculture:HarvestableBiomass

Stable ID: `land-HarvestableBiomass`. Category: quality; status: blocked; proposed parent: `imod:Quality`.
Biological material of a stated crop and product that meets a specified harvest criterion.
Parent gate: Root keyword context only; specialization and bearer remain blocked.
Positive: A value observed for the named bearer and stated convention.. Counterexample: An unqualified score, missing observation or value from another bearer treated as equivalent..
Sources: FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### agriculture:SeedPlacementDepth

Stable ID: `land-SeedPlacementDepth`. Category: quality; status: blocked; proposed parent: `unresolved upstream parent`.
Depth of placed seed relative to the specified soil surface.
Parent gate: Pending positional-depth specialization and seed/placement bearer; no dimension-only parent substitution.
Positive: A value observed for the named bearer and stated convention.. Counterexample: An unqualified score, missing observation or value from another bearer treated as equivalent..
Sources: FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### agriculture:ManagedLivestock

Stable ID: `agriculture-ManagedLivestock`. Category: subject; status: blocked; proposed parent: `life:Organism`.
An animal raised under identified husbandry responsibility.
Parent gate: Organism specialization versus managed role remains unresolved; reuse upstream individuality, do not recreate species taxonomy.
Positive: animal raised by a holder. Counterexample: ownership alone.
Sources: FAO-WCA. Bindings and prior blockers are retained in dossier.json.

### agriculture:ManagedHerd

Stable ID: `agriculture-ManagedHerd`. Category: subject; status: blocked; proposed parent: `ecology:Population`.
A livestock group with explicit membership and management unity.
Parent gate: Population specialization is only an alternative: mixed species and changing membership may require configuration; blocked.
Positive: managed group with tracked membership. Counterexample: all animals inside a map polygon.
Sources: FAO-WCA. Bindings and prior blockers are retained in dossier.json.

### agriculture:AnimalHusbandry

Stable ID: `agriculture-AnimalHusbandry`. Category: process; status: blocked; proposed parent: `imod:Process`.
Ongoing deliberate care and management of raised animals.
Parent gate: Process keyword context; agency action/organism participants pending.
Positive: actual care under responsibility. Counterexample: passive ownership.
Sources: FAO-WCA. Bindings and prior blockers are retained in dossier.json.

### agriculture:LivestockGrazing

Stable ID: `agriculture-LivestockGrazing`. Category: process; status: blocked; proposed parent: `ecology:Herbivory`.
Raised animals feed on vegetation in place.
Parent gate: Research Herbivory specialization; managed participants do not prove grazing occurrence.
Positive: observed feeding at a site. Counterexample: animals merely standing there.
Sources: FAO-WCA. Bindings and prior blockers are retained in dossier.json.

### agriculture:RaisesLivestock

Stable ID: `agriculture-RaisesLivestock`. Category: relationship; status: blocked; proposed parent: `unresolved upstream parent`.
An identified responsible actor raises specified livestock.
Parent gate: Specialization of upstream responsibility relation missing; ownership remains separate.
Positive: care responsibility despite another owner. Counterexample: owned but raised by another actor.
Sources: FAO-WCA. Bindings and prior blockers are retained in dossier.json.

### agriculture:GrazingEpisode

Stable ID: `agriculture-GrazingEpisode`. Category: event; status: blocked; proposed parent: `imod:Event`.
A bounded occurrence of livestock feeding on vegetation at a specified site.
Parent gate: Event keyword context; participants and occurrence bounds must be evidenced.
Positive: feeding interval with evidence. Counterexample: grazing permission only.
Sources: FAO-WCA. Bindings and prior blockers are retained in dossier.json.

### agriculture:LivestockCount

Stable ID: `agriculture-LivestockCount`. Category: quality; status: blocked; proposed parent: `imod:Numerosity`.
Number of specified raised animals at a reference instant.
Parent gate: src/imod.kwv Numerosity declaration verified; domain specialization and herd bearer blocked. count-of composition remains an alternative.
Positive: membership-qualified count. Counterexample: mixed-unit aggregation including hive counts.
Sources: FAO-WCA. Bindings and prior blockers are retained in dossier.json.

## Questions and observable gaps

### land-q01: Which fields are being used for food crops rather than merely covered by green vegetation?

Sources: FAO-LCCS. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: one delineated field. Counterexample: every polygon from a satellite classification.
Dependencies: observed cover plus management purpose; greenness does not establish use No observation/resolution means open-world unknown, not zero or absence.

### land-q02: Which land units can support the specified crop without irrigation?

Sources: FAO-EVAL. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: one declared evaluation unit. Counterexample: an abstract suitability class.
Dependencies: crop-specific requirements and land qualities; generic suitable is ambiguous No observation/resolution means open-world unknown, not zero or absence. Deferred old candidate land-LandEvaluationUnit: Use the actual bounded surface and, where needed, an evaluation role. Assessment units are not domain primitives.

### land-q03: How much soil surface remains covered after sowing?

Sources: FAO-CA. Expression: `land:SurfaceCoverFraction of agriculture:ManagedField`.
Result category: quality; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: A value observed for the named bearer and stated convention.. Counterexample: An unqualified score, missing observation or value from another bearer treated as equivalent..
Dependencies: Resolve candidate namespace, imported ancestry, bearer/endpoints and an observation strategy; expression alone does not answer the full question. No observation/resolution means open-world unknown, not zero or absence.

### land-q04: Where did irrigation add water during this dry spell?

Sources: FAO-WATER. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: water applied to field. Counterexample: natural rainfall.
Dependencies: Resolve candidate namespace, imported ancestry, bearer/endpoints and an observation strategy; expression alone does not answer the full question. No observation/resolution means open-world unknown, not zero or absence.
Insufficient component: `agriculture:Irrigation` (process). Occurrence/bearer/participant or comparison resolutions remain missing; this component does not answer the complete narrative.

### land-q05: Which field was planted in this sowing episode?

Sources: FAO-SEED. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: one completed field sowing. Counterexample: unbounded sowing practice.
Dependencies: Resolve candidate namespace, imported ancestry, bearer/endpoints and an observation strategy; expression alone does not answer the full question. No observation/resolution means open-world unknown, not zero or absence.
Insufficient component: `agriculture:SowingEpisode` (event). Occurrence/bearer/participant or comparison resolutions remain missing; this component does not answer the complete narrative.

### land-q06: How much of the field was mechanically disturbed?

Sources: FAO-CA. Expression: `land:DisturbedAreaFraction of agriculture:ManagedField`.
Result category: quality; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: A value observed for the named bearer and stated convention.. Counterexample: An unqualified score, missing observation or value from another bearer treated as equivalent..
Dependencies: Resolve candidate namespace, imported ancestry, bearer/endpoints and an observation strategy; expression alone does not answer the full question. No observation/resolution means open-world unknown, not zero or absence.

### land-q07: Which land is managed as part of the same agricultural holding?

Sources: FAO-EVAL. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: field managed in the holding. Counterexample: field nearby but managed elsewhere.
Dependencies: holding/operator identity and management records; adjacency insufficient No observation/resolution means open-world unknown, not zero or absence.

### land-q08: Did residue retention change surface cover without changing crop species?

Sources: FAO-SEED. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: residue deliberately left after harvest. Counterexample: claim all residue is retained without evidence.
Dependencies: Resolve candidate namespace, imported ancestry, bearer/endpoints and an observation strategy; expression alone does not answer the full question. No observation/resolution means open-world unknown, not zero or absence.
Insufficient component: `change in land:SurfaceCoverFraction of agriculture:ManagedField` (process). Occurrence/bearer/participant or comparison resolutions remain missing; this component does not answer the complete narrative.

### land-q09: Which harvest removed products from this crop stand?

Sources: FAO-SEED. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: one harvest operation. Counterexample: annual harvest statistic.
Dependencies: Resolve candidate namespace, imported ancestry, bearer/endpoints and an observation strategy; expression alone does not answer the full question. No observation/resolution means open-world unknown, not zero or absence.
Insufficient component: `agriculture:HarvestEpisode` (event). Occurrence/bearer/participant or comparison resolutions remain missing; this component does not answer the complete narrative.

### land-q12: Is poor crop performance due to water shortage or an unsuitable soil condition?

Sources: FAO-EVAL. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: A value observed for the named bearer and stated convention.. Counterexample: An unqualified score, missing observation or value from another bearer treated as equivalent..
Dependencies: distinct soil/root-zone qualities and causal models No observation/resolution means open-world unknown, not zero or absence. Deferred old candidate land-PlantAvailableWater: Request soil/hydrology water availability with plant and root-zone context, not total stock.

### land-q13: Does no-till automatically make this farm sustainable?

Sources: FAO-CA. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: cultivation disturbing soil. Counterexample: undisturbed land merely classified cropland.
Dependencies: invalid implication; one practice is not comprehensive sustainability No observation/resolution means open-world unknown, not zero or absence.

### land-q14: Which crop stand occupies this field now?

Sources: FAO-SEED. Expression: `agriculture:OccupiesField linking agriculture:CropStand to agriculture:ManagedField`.
Result category: relationship; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: crop stand located in field. Counterexample: crop name listed in a future plan.
Dependencies: Resolve candidate namespace, imported ancestry, bearer/endpoints and an observation strategy; expression alone does not answer the full question. No observation/resolution means open-world unknown, not zero or absence.

### agriculture-q01: Which animals are raised by this holding even when owned by others?

Sources: FAO-WCA. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: raising and ownership distinguished. Counterexample: owner assumed carer.
Dependencies: Responsible actor versus holding context; time-scoped membership required. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### agriculture-q02: How many raised animals belong to this specified herd at the reference instant?

Sources: FAO-WCA. Expression: `agriculture:LivestockCount of agriculture:ManagedHerd`.
Result category: quality; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: membership-qualified animal count. Counterexample: head count mixed with hive units.
Dependencies: Herd unity and species/counting basis unresolved. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### agriculture-q03: Are livestock actually grazing here rather than merely present?

Sources: FAO-WCA. Expression: `agriculture:LivestockGrazing`.
Result category: process; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: feeding observed. Counterexample: presence or permission substituted.
Dependencies: Herbivory parent and managed participant definitions remain blocked. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### agriculture-q04: Which grazing episode occurred on communal land outside the holding parcels?

Sources: FAO-WCA. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: bounded feeding occurrence on shared land. Counterexample: parcel ownership as grazing evidence.
Dependencies: Land access/use relation, location and event bounds; no tenure inferred. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### agriculture-q05: Can this landless livestock holding be distinguished from its manager and premises?

Sources: FAO-HOLDING. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: operational identity independent of parcel. Counterexample: holding assumed terrestrial region.
Dependencies: Institutional operational-unit parent remains missing. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### agriculture-q06: Does a grazing-system label alone establish sustainable land condition?

Sources: FAO-WCA. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: condition assessed separately. Counterexample: pastoral label implies sustainable.
Dependencies: Negative probe: system classification is scoped authority; condition requires reference-relative evidence. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

## Predicates and authorities

- **conservation agriculture cover class**: Ordered FAO-CA scheme-specific ranges at its prescribed observation stage; authority attachment, no universal ecosystem-health ordering. Status: provisional_no_predicate_declaration. Sources: FAO-CA, FAO-EVAL, FAO-LCCS, FAO-SEED.
- **water-limited for a specified crop**: Comparison with crop/rooting and environmental context; multiple limitations may coexist, no exhaustive partition. Status: blocked_upstream_quality_missing. Sources: FAO-EVAL, FAO-WATER.
- **minimum disturbance**: Scheme-relative combination of disturbance width/area and timing; not synonym for zero disturbance. Status: provisional_no_predicate_declaration. Sources: FAO-EVAL, FAO-CA, FAO-SEED.
- **high-yielding**: Comparison to specified crop, area and reference conditions; cannot infer sustainable from high output. Status: provisional_no_predicate_declaration. Sources: FAO-SEED.

Mixed-purpose labels retain authority/version and mapping conventions. No automatic equivalence; aliases require exact meaning. No-till or pastoral labels do not imply sustainability. Unknown/unmeasured/disputed are evidence states.

## Coverage and unresolved choices

No quota padding. Agriculture retains crop/livestock gaps in husbandry diversity, animal health, breeding, products and landless systems; forestry/aquaculture/processing remain adjacent.

Hypotheses, compatibility and suitability algorithms, units, observation protocols and causal models remain outside domain articulation. Implication/detection are syntactic only; no consequence execution, implicit change, persistence rule or inference of no real change is added.
