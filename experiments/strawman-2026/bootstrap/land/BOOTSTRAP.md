# Land research bootstrap

Cross-sector actual land use, management, occupation, conversion, specified rights/disputes and condition. Cover, use, plan, permission, tenure and condition remain distinct.

All candidate meanings remain blocked/provisional. Boundary organization is authorized; semantic approval is not. No executable namespace or declaration is added.

15 active candidate records; 15 research questions. Stable `land-` IDs on moved agriculture records preserve history, not domain ownership. See [27-entry dispositions](../LAND_AGRICULTURE_REVISION.md).

## Dependencies and boundaries

- **imod**: Keyword type context only
- **earth**: Surface versus volumetric region remains unresolved
- **geography**: Spatial position/topology, not duplicate land primitives
- **society**: Actors and institutional rights; detailed rights meaning still missing
- **agency**: Action and authorization context
- **ecology**: Organism-relative connectivity and vegetation
- **soil**: Physical soil condition
- **hydrology**: Water conditions

## Source evidence

- **EEA-FRAGMENT** [Landscape fragmentation pressure in Europe](https://www.eea.europa.eu/en/analysis/indicators/landscape-fragmentation-pressure-in-europe): Indicator definition and methodology. Barrier geometry supports structural fragmentation; organism-specific permeability needs separate evidence.
- **EEA-LAND** [Land use and land take](https://www.eea.europa.eu/en/europe-environment-2025/thematic-briefings/biodiversity-and-ecosystems/land-use-and-land-take): 2025 briefing: introduction, multifunctional land use and changing demand. Cross-sector uses and conversion; settlement reporting is a proxy, not universal land-take identity.
- **EEA-SOIL** [Soil resources](https://www.eea.europa.eu/en/europe-environment-2025/thematic-briefings/biodiversity-and-ecosystems/soil-resources): 2025 briefing: key messages and soil sealing. Soil condition spans sectors. Intervention does not prove recovery.
- **FAO-CA** [Conservation Agriculture principles](https://www.fao.org/conservation-agriculture/overview/conservation-agriculture-principles/en/): Three principles and scheme thresholds. Specific conservation agriculture criteria; no universal good/bad land predicate.
- **FAO-EVAL** [A Framework for Land Evaluation: Basic concepts](https://www.fao.org/4/X5310E/x5310e03.htm): Sections 2.1ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“2.5. Land use-specific suitability, qualities and characteristics; older framework retained with scope.
- **FAO-LCCS** [Land Cover Classification System](https://www.fao.org/4/x0596e/x0596e00.htm): 2000; Part A definitions and mixed mapping units. Land cover classification structure; a specific authority version, not universal equivalence.
- **FAO-SEED** [Minimum mechanical soil disturbance](https://www.fao.org/conservation-agriculture/in-practice/minimum-mechanical-soil-disturbance/en/): Direct seeding or planting. Practical seeding and residue treatment examples; not universal yield response.
- **FAO-TENURE** [Voluntary Guidelines on Tenure](https://www.fao.org/tenure/resources/publication/vggt/en): Guidelines overview: tenure of land, fisheries and forests. Distinguish rights, management, occupation and claims; jurisdiction and evidence required, no legal determination.
- **FAO-WCA** [World Programme for the Census of Agriculture 2010: definitions](https://www.fao.org/4/a0135e/A0135E07.htm): 11.151-11.153: animals raised, responsibility and pastoral systems; 11.44 communal grazing. Historical statistical evidence: animals raised need not be owned or on holding land. Reporting conventions are not ontology axioms.
- **UNCCD-SO1** [PRAIS4 2026 strategic objective 1](https://prais4-reporting-manual.unccd.int/en/2026/SO1.html): SO1 baseline and degradation interpretation. Reference-relative condition; stable degraded state and productivity/condition disagreement are possible. Reporting algorithms stay outside vocabulary.

## Candidate meanings

### land:LandUseConversion

Stable ID: `land-LandUseConversion`. Category: event; status: blocked; proposed parent: `imod:Event`.
Bounded actual transition between specified uses of a surface; a plan, permission change or relabeling alone is not this event.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: actual change from cultivation to another managed use. Counterexample: a zoning proposal alone.
Sources: FAO-EVAL. Bindings and prior blockers are retained in dossier.json.

### land:CoverChangeEpisode

Stable ID: `land-CoverChangeEpisode`. Category: event; status: blocked; proposed parent: `imod:Event`.
Bounded physical change in specified surface covering; two different maps alone do not establish an event.
Parent gate: src/imod.kwv; exact root keyword declaration verified, scientific specialisation unapproved
Positive: documented vegetation removal episode. Counterexample: different map legend applied without real change.
Sources: FAO-LCCS. Bindings and prior blockers are retained in dossier.json.

### land:SurfaceCoverFraction

Stable ID: `land-SurfaceCoverFraction`. Category: quality; status: blocked; proposed parent: `imod:Proportion`.
Fraction of an explicitly bounded surface covered by a specified material, with denominator, overlap and observation support stated.
Parent gate: Root keyword context only; specialization and bearer remain blocked.
Positive: A value observed for the named bearer and stated convention.. Counterexample: An unqualified score, missing observation or value from another bearer treated as equivalent..
Sources: FAO-EVAL, FAO-LCCS, FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### land:DisturbedAreaFraction

Stable ID: `land-DisturbedAreaFraction`. Category: quality; status: blocked; proposed parent: `imod:Proportion`.
Fraction of a stated reference surface physically disturbed under a specified operation and interval; not restricted to tillage.
Parent gate: Root keyword context only; specialization and bearer remain blocked.
Positive: A value observed for the named bearer and stated convention.. Counterexample: An unqualified score, missing observation or value from another bearer treated as equivalent..
Sources: FAO-EVAL, FAO-CA, FAO-SEED. Bindings and prior blockers are retained in dossier.json.

### land:ManagedArea

Stable ID: `land-ManagedArea`. Category: quality; status: blocked; proposed parent: `imod:Area`.
Extent of surface under a specified actual management relation; neither owned nor occupied area by implication.
Parent gate: Root keyword context only; specialization and bearer remain blocked.
Positive: A value observed for the named bearer and stated convention.. Counterexample: An unqualified score, missing observation or value from another bearer treated as equivalent..
Sources: FAO-EVAL. Bindings and prior blockers are retained in dossier.json.

### land:LandSurfaceUnit

Stable ID: `land-LandSurfaceUnit`. Category: subject; status: blocked; proposed parent: `unresolved upstream parent`.
An actual bounded terrestrial surface considered as a physical bearer, independent of map or assessment identity.
Parent gate: Upstream surface identity missing; earth:Region is volumetric. No fabricated parent.
Positive: specified site surface. Counterexample: arbitrary evaluation record.
Sources: FAO-LCCS, EEA-LAND. Bindings and prior blockers are retained in dossier.json.

### land:SurfaceSealing

Stable ID: `land-SurfaceSealing`. Category: process; status: blocked; proposed parent: `imod:Process`.
Placing impermeable covering on a specified soil surface.
Parent gate: Root process is keyword type context; soil/physical intervention specialization pending.
Positive: paving an exposed surface. Counterexample: new housing permission.
Sources: EEA-SOIL. Bindings and prior blockers are retained in dossier.json.

### land:SurfaceUnsealing

Stable ID: `land-SurfaceUnsealing`. Category: process; status: blocked; proposed parent: `imod:Process`.
Physically removing impermeable covering from a specified surface.
Parent gate: Root process is keyword type context; soil/physical intervention specialization pending.
Positive: removing pavement. Counterexample: assumed recovery from a restoration plan.
Sources: EEA-SOIL. Bindings and prior blockers are retained in dossier.json.

### land:ActualLandUse

Stable ID: `land-ActualLandUse`. Category: relationship; status: blocked; proposed parent: `unresolved upstream parent`.
An actual activity uses a specified surface during a stated interval.
Parent gate: Imported actor/activity/claim/rights parents require review; a binary name does not resolve n-ary structure.
Positive: concurrent grazing and solar production. Counterexample: one exclusive identity inferred from cover.
Sources: EEA-LAND. Bindings and prior blockers are retained in dossier.json.

### land:ManagesLand

Stable ID: `land-ManagesLand`. Category: relationship; status: blocked; proposed parent: `unresolved upstream parent`.
An identified actor actually directs management of a specified surface.
Parent gate: Imported actor/activity/claim/rights parents require review; a binary name does not resolve n-ary structure.
Positive: management responsibility with evidence. Counterexample: ownership inferred from management.
Sources: FAO-TENURE. Bindings and prior blockers are retained in dossier.json.

### land:OccupiesLand

Stable ID: `land-OccupiesLand`. Category: relationship; status: blocked; proposed parent: `unresolved upstream parent`.
An identified occupant uses physical space on a specified surface.
Parent gate: Imported actor/activity/claim/rights parents require review; a binary name does not resolve n-ary structure.
Positive: observed occupation. Counterexample: automatic ownership.
Sources: FAO-TENURE. Bindings and prior blockers are retained in dossier.json.

### land:HoldsLandUseRight

Stable ID: `land-HoldsLandUseRight`. Category: relationship; status: blocked; proposed parent: `unresolved upstream parent`.
An identified holder has a specified use right concerning a surface in a stated institutional context.
Parent gate: Imported actor/activity/claim/rights parents require review; a binary name does not resolve n-ary structure.
Positive: documented time-scoped right. Counterexample: right inferred from occupancy.
Sources: FAO-TENURE. Bindings and prior blockers are retained in dossier.json.

### land:DisputesLandUseRight

Stable ID: `land-DisputesLandUseRight`. Category: relationship; status: blocked; proposed parent: `unresolved upstream parent`.
Identified claimants actually dispute a specified use or right over land.
Parent gate: Imported actor/activity/claim/rights parents require review; a binary name does not resolve n-ary structure.
Positive: evidenced dispute with claimants and contested right. Counterexample: overlapping polygons alone.
Sources: FAO-TENURE. Bindings and prior blockers are retained in dossier.json.

### land:LandUseCessation

Stable ID: `land-LandUseCessation`. Category: event; status: blocked; proposed parent: `imod:Event`.
Bounded cessation of a specified actual use, with termination evidence.
Parent gate: Event keyword context only; actual use relation and occurrence bounds pending.
Positive: use ends while title remains unchanged. Counterexample: fallow automatically treated as abandonment.
Sources: EEA-LAND, FAO-WCA. Bindings and prior blockers are retained in dossier.json.

### land:SealedSurfaceFraction

Stable ID: `land-SealedSurfaceFraction`. Category: quality; status: blocked; proposed parent: `imod:Proportion`.
Fraction of a specified surface covered by impermeable material.
Parent gate: Proportion root verified as type context; impermeability criterion and surface bearer pending.
Positive: measured sealed fraction. Counterexample: settlement class equals fully sealed.
Sources: EEA-SOIL. Bindings and prior blockers are retained in dossier.json.

## Questions and observable gaps

### land-q10: Do two maps calling an area forest use the same definition?

Sources: FAO-LCCS. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: one mapped vegetation patch. Counterexample: land legally zoned forest without vegetation.
Dependencies: authority/version criteria; reject automatic equivalence No observation/resolution means open-world unknown, not zero or absence. Deferred old candidate land-VegetationPatch: Reuse an agreed ecology/biology assemblage; delineation alone does not establish subject unity.

### land-q11: Did fire change land cover while the intended farming use remained unchanged?

Sources: FAO-LCCS. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: documented vegetation removal episode. Counterexample: different map legend applied without real change.
Dependencies: distinguish observed cover change from land-use conversion; fire event upstream No observation/resolution means open-world unknown, not zero or absence.

### land-q15: Which land-use change is observed, and which is only planned?

Sources: FAO-EVAL. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: actual change from cultivation to another managed use. Counterexample: a zoning proposal alone.
Dependencies: bounded implemented management transition versus plan; observation evidence required No observation/resolution means open-world unknown, not zero or absence.

### land-q16: Which parts of a site support grazing and solar generation concurrently?

Sources: EEA-LAND. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: two evidenced uses. Counterexample: one exclusive cover label.
Dependencies: Time-scoped activity participants and common support required. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q17: Did housing replace an actual use, increase sealing, both or neither?

Sources: EEA-LAND. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: independent use and cover changes. Counterexample: settlement reporting as universal land take.
Dependencies: Two changes and comparable support; no universal conversion-to-sealing implication. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q18: Was pavement removed, and which soil properties changed afterwards?

Sources: EEA-SOIL. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: removal followed by separately observed conditions. Counterexample: restoration intent proves recovery.
Dependencies: Reuse soil observables; temporal sequence does not establish causal success. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q19: Who manages, occupies or holds a specified use right over this site?

Sources: FAO-TENURE. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: different actors and extents. Counterexample: ownership equated with management.
Dependencies: Actor endpoints, right scope, jurisdiction and interval remain unresolved. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q20: Which claimants actually dispute which rights or uses?

Sources: FAO-TENURE. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: evidenced competing claims. Counterexample: polygon overlap proves dispute.
Dependencies: N-ary social configuration and evidence of dispute required. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q21: Which planned uses cannot coexist under stated constraints?

Sources: EEA-LAND. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: external compatibility assessment. Counterexample: analytical incompatibility treated as actual conflict.
Dependencies: Methods, scenarios and constraints belong outside worldview; planned use is not actual use. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q22: Did a road split continuous surface, and does it obstruct the specified organism?

Sources: EEA-FRAGMENT. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: geometry plus organism evidence. Counterexample: structural and functional connectivity equated.
Dependencies: Reuse topology and ecology; specify barriers, organism and support. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q23: Which land qualities declined relative to which baseline and interval?

Sources: UNCCD-SO1. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: quality-specific change with reference. Counterexample: stable degraded land called healthy.
Dependencies: Resolve soil/ecology qualities individually; reporting rule not an axiom. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q24: Did an actual use cease while tenure persisted and vegetation changed later?

Sources: EEA-LAND. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: separate occurrence and observations. Counterexample: fallow automatically abandoned.
Dependencies: Cessation, rights and succession need independent evidence, no inferred retention. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q25: What fraction of this surface is sealed by impermeable material?

Sources: EEA-SOIL. Expression: `land:SealedSurfaceFraction of land:LandSurfaceUnit`.
Result category: quality; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: specified denominator. Counterexample: all urban area assumed sealed.
Dependencies: Surface parent and impermeability criterion remain blocked. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q26: What is the extent actually managed for forestry, recreation or extraction here?

Sources: FAO-TENURE. Expression: `land:ManagedArea of land:LandSurfaceUnit`.
Result category: quality; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: management-specific extent. Counterexample: owned area substituted.
Dependencies: Sector activities remain external; manager, surface and relation scope required. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

### land-q27: Did conservation management achieve recovery under the stated reference?

Sources: UNCCD-SO1. Full formulation: missing.
Result category: unresolved; semantic status blocked. Actual syntax results are recorded in question-parser-results.json.
Positive: observed reference-relative recovery. Counterexample: intervention intention as achieved state.
Dependencies: Compare appropriate qualities; authority scope, baseline and lag require models/evidence. Unresolved is unknown, not absence. No implicit persistence or runtime consequence engine.

## Predicates and authorities

- **degraded**: State relative to specified reference and qualities; stability does not imply undegraded. Reporting rules are external. Status: blocked_no_predicate_declaration. Sources: UNCCD-SO1.
- **restored**: Achieved recovery against stated reference, not merely restoration activity. Status: blocked_no_predicate_declaration. Sources: UNCCD-SO1.
- **fragmented**: Structural barrier geometry and support must be specified; functional connectivity is organism-relative. Status: blocked_no_predicate_declaration. Sources: EEA-FRAGMENT.
- **suitable**: Suitability for a specified use and evaluation criteria, not intrinsic universal goodness. Status: blocked_no_predicate_declaration. Sources: FAO-EVAL.

Mixed-purpose labels retain authority/version and mapping conventions. No automatic equivalence; aliases require exact meaning. No-till or pastoral labels do not imply sustainability. Unknown/unmeasured/disputed are evidence states.

## Coverage and unresolved choices

No quota padding. Only one blocked surface bearer; few processes/events. Rights/claims and cross-sector specialized activities need upstream work; forestry, extraction and recreation appear as use contexts, not fully articulated sectors.

Hypotheses, compatibility and suitability algorithms, units, observation protocols and causal models remain outside domain articulation. Implication/detection are syntactic only; no consequence execution, implicit change, persistence rule or inference of no real change is added.
