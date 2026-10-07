# Land/agriculture boundary revision

Research base: `28ee04c25829684aa0e78127d694564bbc94194d`. Approved organizational note: klab-services behavior-docs commit `64754ea2b4d7207d51db454506f51b4b18741817`, exact file hash in land-agriculture-dispositions.json. Scientific approval remains outstanding.

Existing proposals are revised in place; Git history retains earlier meanings. No source ontology, service or backend implementation changed. Agriculture remains research-only because surface, population/configuration, holding and rights parents are unresolved. A namespace scaffold would suggest an executable commitment this evidence does not support.

## Disposition of every original candidate

| Stable ID | Current home | Action / open issue |
|---|---|---|
| land-ManagedField | agriculture:ManagedField | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-LandEvaluationUnit | upstream/composition gap | Use the actual bounded surface and, where needed, an evaluation role. Assessment units are not domain primitives. |
| land-CropStand | agriculture:CropStand | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-VegetationPatch | upstream/composition gap | Reuse an agreed ecology/biology assemblage; delineation alone does not establish subject unity. |
| land-AgriculturalHolding | agriculture:AgriculturalHolding | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-Irrigation | agriculture:Irrigation | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-Tillage | agriculture:Tillage | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-Sowing | agriculture:Sowing | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-Harvesting | agriculture:Harvesting | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-ResidueRetention | agriculture:ResidueRetention | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-OccupiesField | agriculture:OccupiesField | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-ManagesField | agriculture:ManagesField | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-OverlapsEvaluationUnit | upstream/composition gap | Compose upstream topology with actual bearers; assessment workflow does not justify a land relation. |
| land-AdjacentField | upstream/composition gap | Reuse upstream symmetric adjacency with agricultural endpoints; relationship/bond choice remains blocked. |
| land-SupportsCropStand | upstream/composition gap | Resolve rooting/location in soil/ecology; ambiguous support must not imply yield. |
| land-SowingEpisode | agriculture:SowingEpisode | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-HarvestEpisode | agriculture:HarvestEpisode | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-IrrigationEpisode | agriculture:IrrigationEpisode | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-LandUseConversion | land:LandUseConversion | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-CoverChangeEpisode | land:CoverChangeEpisode | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-SurfaceCoverFraction | land:SurfaceCoverFraction | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-DisturbedAreaFraction | land:DisturbedAreaFraction | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-PlantAvailableWater | upstream/composition gap | Request soil/hydrology water availability with plant and root-zone context, not total stock. |
| land-HarvestableBiomass | agriculture:HarvestableBiomass | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-ManagedArea | land:ManagedArea | Preserve original ID and blockers; revise scope as approved boundary proposal. |
| land-AppliedWaterAmount | upstream/composition gap | Reuse a dimensional water quantity with identified water bearer/application context; process parameters are not bearers. |
| land-SeedPlacementDepth | agriculture:SeedPlacementDepth | Preserve original ID and blockers; revise scope as approved boundary proposal. |

15 candidates moved with original IDs; five generalized in land; seven deferred and excluded from active coverage. No retired candidate is counted twice. All 15 inherited question IDs/texts survive once: 12 in agriculture and three in land. Twelve new land questions and six livestock/grazing questions broaden the corpus to 348 slots. Agriculture has 18 questions so the local schema now permits additions beyond the initial 15; the production context-pack schema is unchanged.

## Review gates and test scope

Agriculture imports shared land meanings; land has no agriculture dependency. Detailed activity meanings remain with their sectors. Process parameters do not become quality bearers. The responsible agent is distinct from an operational holding. Predicate scope remains authority/reference dependent, with direct evidence. Structural fragmentation does not imply organism-specific blockage; use conflict is not polygon overlap; unsealing does not prove recovery; an intervention label does not imply sustainability.

Hydrology projection and the earlier catchment proposal chain do not reference moved names and remain byte-identical. Historical audit and validation artifacts retain their named earlier snapshot; current counts are in COVERAGE_DASHBOARD.md and current revision checks. No new backend structural or reactor/adaptation test is claimed for this research-only revision.

The existing preservation baseline predates user merge 28ee04c and is not silently overwritten. A separate land-agriculture-preservation.json captures and checks the current original checkout, legacy sources, master and the two staged Java blobs.

## Wildfire review path

Observe a fire/cover-change occurrence separately from intended use, rights and management. A later grazing episode or residue-retention intervention must have its own occurrence evidence. Resolve changes in soil, surface cover and livestock/vegetation observables without inferring no real change from missing models. Postfire degradation/recovery classification requires its own baseline and authority scope; no consequence engine or state-retention rule is introduced.


## Current validation

32 bounded tests pass, including eight boundary regression checks. All 213 supplied question expressions, five explicitly insufficient components and 12 reviewer-probe components pass the actual ObservableSequence parser; four controls behave as expected. Invalid category and missing namespace still parse, demonstrating that this is not semantic validation. The corpus has 135 full-formulation gaps. Local schema/reference/import-DAG and documentation checks pass. See land-agriculture-validation.json for exact scope.
