# Shared interfaces and arbitration

This is the cross-domain contract for the nine packets in [PROPOSALS.md](PROPOSALS.md). Recorded owner discussion establishes direction where cited; it is not community acceptance of every concept. The steering board coordinates core and inter-domain coherence; community acceptance, editorial maturity, controversy, technical validation and software-action permission are separate facts. No voting rule, consensus threshold or editor power is inferred.

## Foundation contracts retained

- Neutral abstract `imod:Relationship`; directed/bond and structural/functional axes independently inherited. Both must be known for a concrete effective connection, with no silent default. A bond is unordered, not automatically transitive or an OWL property declaration. Generic `physical:Dependence` does not settle all asset-dependency meanings.
- Only genuine observable relationships qualify. Coordinate overlap, physical parthood, authority hierarchy, provenance bookkeeping and workflow links do not become relationships to fill a quota. A proposed spatial/contact relation needs its own observable justification.
- Quality/process native dependence, `describes` target, disciplinary `about`, configuration `applies to`, and observational containment are distinct. `contains`, `contained into` and declaration `within` are observational admissibility contracts, not enclosure, temporal coverage, mereology or existential guarantees. Successful empty discovery differs from failure.
- Realm qualification requires the effective bearer to be within the realm. A crustal measurement source does not place a Region within Crust; marine subject matter does not place every observer or instrument in the sea.
- Explicit `observed as` is semantic restriction. Runtime default observer preference is separate and cannot waive explicit query compatibility. Multiple actual observers and semantic observer classes are not interchangeable. These packets add no observer taxonomy.
- Configurations emerge through detection, never `model each Configuration`. Configuration `of` means emergence shorthand under the current contract, not native inherency. Relationship-triggered Network emergence is distinct from the region to which it applies. Declared triggers and validation are not implemented detection/placement/network construction.
- Models establish mechanisms, rates, references, outcomes and occurrence continuity. Missing observations remain unknown. State change and stock are distinct from transfer; compensating fluxes may preserve a state. No hidden erosion inside Elevation, automatic productivity from upwelling, recovery from unsealing or cascading service failure is licensed.

## Interface allocations to discuss

| Interface | Reuse now | Arbitration / unresolved contract |
|---|---|---|
| Root → all | `imod` category aliases, physical/knowledge domains, System/Network | Do not reopen axes implicitly; root annotations still contain an old relationship TODO |
| Physical/physics → air/water/materials | MaterialBody; `physics:FluidParcel`; general quality/transfer meanings | Fixed support versus material-following identity; pressure, concentration, density and rate dimensions |
| Earth → disciplines | Location, Region, Site, environment/layer realms, common material/landform processes | Areal/volumetric prose conflict; physical surface and channel identity; common water/frozen-water gateway |
| Geology ↔ soil/hydrology | RockBody, SedimentBody, Grain; water-bearing host distinct from water | Aquifer, horizon/pedon/stratum unity; no generic part-of workaround |
| Geography ↔ hydrology | Separate bed/water-surface profiles and gradients, runoff-profile/path lengths | Native section/support for discharge; dry channel vs flow; no rating model encoded as taxonomy |
| Atmosphere ↔ ocean/hydrology | Common temperature/water/phase/transport meaning | Meteorology stays in Earth until explicit ownership decision; avoid duplicate evaporation/precipitation families |
| Soil ↔ ecology/agriculture | SoilBody and depth-specific water/chemistry | Organisms remain living entities; total water is not plant-available water; no automatic crop suitability |
| Land ↔ ecology | LAND mediation mechanism; separate ecosystem classification proposal | Cover family and ecosystem typology remain distinct. Ecosystem head/identity/continuity and ecological landscape head remain open |
| Land ↔ agriculture/society | Cross-sector surface/use/management; sector activities in agriculture | Actual management versus title/permission/use; no under-specified rights/dispute binary relation |
| Infrastructure ↔ engineering | Artifact, production/modification, ProductAssembly | Physical asset versus organized installation; operation knowledge ownership; rated versus actual functioning |
| Built ↔ landscape/water | Dam/road/pipe material; water stock and land/ecological support | A reservoir region/ecosystem is not the dam Artifact; geometry alone proves neither connectivity nor service |

Dependencies above are semantic needs, not a proposal for mutual imports. Retain an acyclic upstream-to-downstream graph. A bridge can specialize/import both sides without forcing Earth to import every discipline. Temporary review namespaces in `kwv/` demonstrate that approach and do not select production ownership.

## Joint validation scenarios for the workshop

1. **Dry stream:** bed profile/gradient and structural channel identity may exist; continuous water-surface profile and actual supply are not established. Decide what live functional StreamConnection denotes before recognizing a network.
2. **Air over village:** land-surface temperature, air-portion temperature and an instrument observation at a location have different supports. Domain-about links and a realm qualifier cannot substitute for a native bearer.
3. **Storm → sediment:** rain, flow, concentration, sediment throughput and deposition are separately observed. Lower concentration can coexist with more transported sediment; no universal creates/affects chain follows.
4. **Coastal reservoir:** distinguish dam material, impounded water, water region, basin, shore wetland, actual service and ecosystem coupling. LAND cover and ecosystem authority outputs may coexist without equivalence.
5. **Same canopy, new use:** unchanged forest cover with changed recreation/production use does not necessarily change ecosystem identity; a tenure change proves neither physical modification nor new use.
6. **Shut valve:** structural physical connection persists while functional delivery ceases. A relationship-based network can change under a stated connection meaning without becoming a quality inhering in a valve or tank.
7. **Soil core:** intact aggregate diameter, dispersed grain diameter, texture distribution, horizon thickness and sampled chemistry retain distinct support and preparation. A WRB classification does not instantiate/install its authority or prove sample representativeness.
8. **Two observers:** explicit observed-as restrictions remain hard semantic constraints; a default observer preference is not permission to substitute incompatible observations. These scenarios are semantic probes; none was executed here.

## Annotation audit and validation limits

Active source uses bare `@experimental`, `@deprecated`, `@todo`, parameterized `@todo("...")`, `@fixme("...")`, `@check("...")`, `@example("...")` and `@colormap(...)`. Worldview grammar permits Annotation records before declarations/children, and `metadata` maps. Generic parse acceptance alone does not assign governance semantics or prove every annotation name is registered.

No `@approved` or `@suggested` idiom was found in active worldview source. `@experimental` appears on Geography's TopographicHeterogeneity; it does not establish a community-process state machine. The `.kwv` drafts therefore use ordinary comments with row IDs, rationale, controversy, and untested status while awaiting the parent's shared convention. No bespoke governance annotation schema was introduced. A future minimal convention should point to provenance/rationale/review records, keeping community acceptance distinct from discussion with Ferd and software execution authorization.

Inspected grammar: `klab-languages/org.integratedmodelling.languages.worldview/src/org/integratedmodelling/languages/Worldview.xtext`, plus inherited Observable grammar for annotation idioms and Worldview's category productions. Clauses present include `links`, `emerges from`, `applies to`, `describes`, `requires`, observational containment and affects/creates. No active `confers` clause was used. The live source confirms `functional directed relationship`; native draft quantities use existing typed quality heads. Annotation audit is read-only.
