# Geography bootstrap dossier

Terrain form and topographic distinctions; jurisdictions and names belong to authorities. Geomorphology ownership with earth/geology remains provisional.

Status: research draft. No candidate ontology is installed, and no human expert discussion or approval is claimed. This document and dossier.json are local research artifacts, not a new proposal API.

## Source review and scope

- **G1** [USGS National Map data delivery](https://www.usgs.gov/tools/download-data-maps-national-map). Locator: Data Category table. Scope: Elevation, hydrography, names, boundaries and structures are distinct data themes, not universal concept classifications. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **G2** [NRCS Field Book 4.0 (November 2024)](https://www.nrcs.usda.gov/sites/default/files/2025-05/Field-Book-for-Describing-and-Sampling-Soils-Ver4.pdf). Locator: 1-6 slope shape/position; 3-31 to 3-34 landform lists. Scope: Terrain observational descriptors; US field conventions are not universal exhaustive taxonomy. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **G3** [USGS landslide FAQ](https://www.usgs.gov/faqs/what-a-landslide-and-what-causes-one). Locator: Opening definition and causes. Scope: Gravity-driven mass movement with multiple possible triggers, not every elevation difference. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **G4** [USGS coastal lidar morphology release](https://coastal.er.usgs.gov/data-release/doi-F7GF0S0Z/). Locator: Summary; January 15 2026 version. Scope: Dune crest/toe, shoreline, beach width/slope depend on observation conventions. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **G5** [USGS relative topography and elevation uncertainty](https://www.usgs.gov/data/using-relative-topography-and-elevation-uncertainty-delineate-dune-habitat-barrier-islands). Locator: March 19 2019 summary. Scope: Relative position and uncertainty affect dune delineation; no universal thresholds. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.

## Imported ancestry and unresolved meanings

Imports: imod, earth, physical. References checked against the current sandbox source inherited from base 608bef150ced0a109db98a5aad64ba4461beaa54; exact final source hashes are to be pinned by the root validation manifest. Parent existence is not approval of specialization.

- earth:Region has volumetric prose and Areal annotation. LandFormation inherits it; shape/bearer issue blocks implementation.
- Do not preserve earth:GeoFormation geomorphon classification as universal landform subclasses.
- Ground elevation differs from reflecting roof/canopy height; datum belongs in context/model.
- Human geography remains a coverage weakness, not silently reduced to terrain.
- No dependency from earth back to geography is proposed. Shared processes may consolidate in earth/geology.

## Questions before vocabulary

The saved questions-source-first.json was written before candidate records and keeps the original order/source. The author had already read legacy namespaces; this is not blind testing. No independent held-out probes were obtained. The mappings below came later. Each expression is a component observable, not an executable answer to an entire narrative question. Grammar remains untested here until the root parser report supersedes it.

### geography-q01: How high is the ground beside this house relative to the same vertical reference?

Source: G1; source-led order 1. Incidence: geography:GroundElevation.

Expression: `geography:GroundElevation of earth:Location`
Expected expression-result category: quality. Ground-surface height with common datum; home location supplies context.
Positive case: Ground-surface height with common datum; home location supplies context. Negative case: roof height.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q02: Which side of this hillside faces the afternoon sun?

Source: G2; source-led order 2. Incidence: geography:TerrainAspect, geography:Hillslope.

Expression: `geography:TerrainAspect of geography:Hillslope`
Expected expression-result category: quality. Aspect is needed; afternoon insolation additionally needs external solar/terrain model.
Positive case: Aspect is needed; afternoon insolation additionally needs external solar/terrain model. Negative case: aspect alone guarantees sunshine.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q03: Where is the steepest ground along the planned walking route?

Source: G2; source-led order 3. Incidence: geography:TerrainInclination, geography:Hillslope.

Expression: `geography:TerrainInclination of geography:Hillslope`
Expected expression-result category: quality. Resolve inclination across route context, then compare externally.
Positive case: Resolve inclination across route context, then compare externally. Negative case: route slope confused with every adjacent hillside.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q04: Do two places with the same height belong to the same landform?

Source: G2; source-led order 4. Incidence: geography:GroundElevation, geography:ValleyLandform, geography:RidgeLandform.

Expression: **gap; no faithful complete expression proposed**.
Expected expression-result category: unresolved. Equal height does not establish landform identity; form/configuration discrimination missing.
Positive case: Equal height does not establish landform identity; form/configuration discrimination missing. Negative case: same contour means same landform.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### geography-q05: Where does this ridge separate surface drainage directions?

Source: G2; source-led order 5. Incidence: geography:RidgeLandform, geography:SurfaceOutletConnection.

Expression: `geography:RidgeLandform`
Expected expression-result category: subject. Ridge observation contributes; drainage-divide role and flow routing need hydrology.
Positive case: Ridge observation contributes; drainage-divide role and flow routing need hydrology. Negative case: all ridges assumed catchment divides.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q06: Is the low area a valley with an outlet or a closed hollow?

Source: G2; source-led order 6. Incidence: geography:ClosedDepression, geography:ValleyLandform.

Expression: `geography:ClosedDepression`
Expected expression-result category: subject. Test closed surface boundary at stated scale; distinguish outlet cropping.
Positive case: Test closed surface boundary at stated scale; distinguish outlet cropping. Negative case: groundwater exit disproves surface closure.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q07: How much lower did this ground become after the slope failed?

Source: G3; source-led order 7. Incidence: geography:GroundElevation, geography:SlopeFailureEpisode.

Expression: `change in geography:GroundElevation of earth:Location`
Expected expression-result category: process. Separate elevation change tied to slope-failure occurrence; no implicit elevation evolution.
Positive case: Separate elevation change tied to slope-failure occurrence; no implicit elevation evolution. Negative case: survey datum shift treated as erosion.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q08: Did the apparent shoreline move because land was lost or because the tide changed?

Source: G3; source-led order 8. Incidence: geography:CoastalRetreat, geography:GroundElevation.

Expression: **gap; no faithful complete expression proposed**.
Expected expression-result category: unresolved. Requires tide-referenced shoreline geometry and observed removal event; elevation alone insufficient.
Positive case: Requires tide-referenced shoreline geometry and observed removal event; elevation alone insufficient. Negative case: tidal exposure called land loss.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### geography-q09: Is this dune moving toward the road?

Source: G3; source-led order 9. Incidence: geography:CrestDisplacement, geography:CoastalDune.

Expression: `geography:CrestDisplacement of geography:CoastalDune`
Expected expression-result category: quality. Track same dune crest; road proximity is a separate core spatial comparison.
Positive case: Track same dune crest; road proximity is a separate core spatial comparison. Negative case: new crest substituted without identity evidence.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q10: Which mapped boundary is a jurisdiction and which is a natural feature?

Source: G1; source-led order 10. Incidence: geography:TerrainAbutment.

Expression: **gap; no faithful complete expression proposed**.
Expected expression-result category: unresolved. Jurisdictional boundary authority and society/policy imports absent; do not use terrain contact.
Positive case: Jurisdictional boundary authority and society/policy imports absent; do not use terrain contact. Negative case: political boundary assumed natural wall.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### geography-q11: Can a roof height measurement tell us the height of the ground beneath it?

Source: G1; source-led order 11. Incidence: geography:GroundElevation.

Expression: `geography:GroundElevation of earth:Location`
Expected expression-result category: quality. Reject roof returns as ground unless independent ground observation/model exists.
Positive case: Reject roof returns as ground unless independent ground observation/model exists. Negative case: roof equals ground.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q12: Which neighboring slopes share the same ridge?

Source: G2; source-led order 12. Incidence: geography:OppositeFlanks, geography:Hillslope.

Expression: `geography:OppositeFlanks`
Expected expression-result category: relationship. Resolve endpoints and shared ridge; bare relationship expression is only reusable meaning.
Positive case: Resolve endpoints and shared ridge; bare relationship expression is only reusable meaning. Negative case: nearby slopes assumed shared ridge.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q13: Did deposited sediment raise the low ground after the storm?

Source: G3; source-led order 13. Incidence: geography:SurfaceAccumulation, geography:GroundElevation.

Expression: `change in geography:GroundElevation of earth:Location`
Expected expression-result category: process. Change plus deposition evidence; attribution to storm requires model.
Positive case: Change plus deposition evidence; attribution to storm requires model. Negative case: water depth mistaken for new sediment.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geography-q14: Can we infer an unchanged hillside because no new elevation survey exists?

Source: G3; source-led order 14. Incidence: geography:GroundElevation.

Expression: **gap; no faithful complete expression proposed**.
Expected expression-result category: unresolved. Evidence-state question: no new survey leaves change unresolved, not zero.
Positive case: Evidence-state question: no new survey leaves change unresolved, not zero. Negative case: unknown means unchanged.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### geography-q15: Does a map label saying mountain establish a universal minimum height?

Source: G2; source-led order 15. Incidence: geography:RidgeLandform.

Expression: **gap; no faithful complete expression proposed**.
Expected expression-result category: unresolved. Mountain naming authority and chosen landform definition needed; no universal threshold inferred.
Positive case: Mountain naming authority and chosen landform definition needed; no universal threshold inferred. Negative case: map name establishes minimum height.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

## Candidate records

Exact names are provisional. Category/type and dependency arity are proposal coordinates; source evidence is not an ontology specification. Subject qualities and process parameters below identify meanings, not variables or equations.

### geography:Hillslope (subject; provisional)

Inclined terrain portion between contextual upper and lower breaks.
Parent: `earth:LandFormation` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: G2, G4.
Qualities: geography:Slope, geography:Aspect. Parameters: none proposed.
Bindings: {}
Positive: hill flank. Negative: building wall.
Question incidence: geography-q02, geography-q03, geography-q12.

### geography:RidgeLandform (subject; provisional)

Elongated raised landform with lower terrain to either side.
Parent: `earth:LandFormation` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: G2, G4.
Qualities: geography:GroundElevation, geography:LocalRelief. Parameters: none proposed.
Bindings: {}
Positive: divide ridge. Negative: road centerline on flat ground.
Question incidence: geography-q04, geography-q05, geography-q15.

### geography:ValleyLandform (subject; provisional)

Elongated low terrain with adjoining higher ground.
Parent: `earth:LandFormation` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: G2, G4.
Qualities: geography:LocalRelief, geography:TerrainInclination. Parameters: none proposed.
Bindings: {}
Positive: river valley. Negative: circular closed quarry pit.
Question incidence: geography-q04, geography-q06.

### geography:ClosedDepression (subject; provisional)

Terrain hollow without a lower surface outlet at the stated delineation scale.
Parent: `earth:LandFormation` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: G2, G4.
Qualities: geography:LocalRelief. Parameters: none proposed.
Bindings: {}
Positive: internally draining hollow. Negative: outlet cropped off map.
Question incidence: geography-q06.

### geography:CoastalDune (subject; provisional)

Coastal landform built from wind-transported sediment.
Parent: `earth:LandFormation` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: G2, G4.
Qualities: geography:GroundElevation, geography:CrestDisplacement. Parameters: none proposed.
Bindings: {}
Positive: sandy foredune. Negative: bedrock cliff.
Question incidence: geography-q09.

### geography:GroundElevation (quality; provisional)

Ground surface vertical position relative to stated reference.
Parent: `physical:Height` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: G2, G4, G5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "earth:Location"}
Positive: bare-earth height with datum. Negative: roof return substituted.
Question incidence: geography-q01, geography-q04, geography-q07, geography-q08, geography-q11, geography-q13, geography-q14.

### geography:LocalRelief (quality; provisional)

Vertical difference across a specified terrain neighborhood.
Parent: `imod:Length` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: G2, G4, G5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "earth:LandFormation"}
Positive: crest to valley difference. Negative: absolute height alone.
Question incidence: unused; needs fresh justification or removal.

### geography:TerrainInclination (quality; provisional)

Ground-surface inclination relative to horizontal.
Parent: `imod:Angle` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: G2, G4, G5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "earth:LandFormation"}
Positive: hill flank angle. Negative: compass direction.
Question incidence: geography-q03.

### geography:TerrainAspect (quality; provisional)

Downslope orientation relative to geographical north.
Parent: `imod:Angle` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: G2, G4, G5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "earth:LandFormation"}
Positive: west-facing slope. Negative: flat ground assigned arbitrary north.
Question incidence: geography-q02.

### geography:CrestDisplacement (quality; provisional)

Movement magnitude of an identified crest between observations.
Parent: `imod:Length` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: G2, G4, G5.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "geography:CoastalDune"}
Positive: tracked crest moved landward. Negative: new crest mistaken for same identity.
Question incidence: geography-q09.

### geography:SurfaceRemoval (process; provisional)

Removal and transport of surface earth material.
Parent: `earth:Erosion` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: G3, G4.
Qualities: not applicable. Parameters: geography:TerrainInclination.
Bindings: {"participants": ["earth:LandFormation"], "affects": ["geography:GroundElevation"], "creates": [], "confers": [], "rationale": "Affects limited to actual material movement; attribution requires model/evidence. Dune migration/retreat need dedicated process source.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: soil transported off slope. Negative: DEM software revision.
Question incidence: unused; needs fresh justification or removal.

### geography:SurfaceAccumulation (process; provisional)

Deposition building up material at a location.
Parent: `earth:Sedimentation` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: G3, G4.
Qualities: not applicable. Parameters: geography:GroundElevation.
Bindings: {"participants": ["earth:LandFormation"], "affects": ["geography:GroundElevation"], "creates": [], "confers": [], "rationale": "Affects limited to actual material movement; attribution requires model/evidence. Dune migration/retreat need dedicated process source.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: sediment deposited at foot. Negative: water level rises.
Question incidence: geography-q13.

### geography:SlopeMassMovement (process; provisional)

Downslope displacement of a terrain mass.
Parent: `earth:LandformingProcess` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: G3, G4.
Qualities: not applicable. Parameters: geography:TerrainInclination.
Bindings: {"participants": ["earth:LandFormation"], "affects": ["geography:GroundElevation"], "creates": [], "confers": [], "rationale": "Affects limited to actual material movement; attribution requires model/evidence. Dune migration/retreat need dedicated process source.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: sliding earth mass. Negative: steep stationary hillside.
Question incidence: unused; needs fresh justification or removal.

### geography:DuneMigration (process; blocked)

Redistribution moving an identifiable dune form.
Parent: `earth:LandformingProcess` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: G3, G4.
Qualities: not applicable. Parameters: geography:CrestDisplacement.
Bindings: {"participants": ["earth:LandFormation"], "affects": ["geography:CrestDisplacement"], "creates": [], "confers": [], "rationale": "Affects limited to actual material movement; attribution requires model/evidence. Dune migration/retreat need dedicated process source.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: crest moves with sediment. Negative: georeferencing shift.
Question incidence: unused; needs fresh justification or removal.

### geography:CoastalRetreat (process; blocked)

Landward shift of specified shore morphology through erosion.
Parent: `earth:Erosion` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: G3, G4.
Qualities: not applicable. Parameters: geography:GroundElevation.
Bindings: {"participants": ["earth:LandFormation"], "affects": ["geography:GroundElevation"], "creates": [], "confers": [], "rationale": "Affects limited to actual material movement; attribution requires model/evidence. Dune migration/retreat need dedicated process source.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: scarp eroded landward. Negative: tidal wet/dry boundary shift.
Question incidence: geography-q08.

### geography:OppositeFlanks (relationship; provisional)

Hillslopes on opposite sides of the same ridge.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: G2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "geography:Hillslope", "target": "geography:Hillslope", "rationale": "Shared ridge identity required; no inferred water connection."}
Positive: opposite ridge flanks. Negative: slopes on separate mountains.
Question incidence: geography-q12.

### geography:TerrainAbutment (relationship; provisional)

Terrain forms meet along an observed boundary.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: G2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "earth:LandFormation", "target": "earth:LandFormation", "rationale": "Contact tolerance is contextual; symmetric inverse needs review."}
Positive: valley side meets floor. Negative: bounding boxes overlap.
Question incidence: geography-q10.

### geography:SurfaceOutletConnection (relationship; provisional)

Terrain has a surface escape path to receiving terrain.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: G2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "earth:LandFormation", "target": "earth:LandFormation", "rationale": "Potential geometry, not actual flow or groundwater connection."}
Positive: open hollow toward valley. Negative: subsurface connection.
Question incidence: geography-q05.

### geography:SlopeFailureEpisode (event; provisional)

Bounded slope movement episode.
Parent: `earth:GeolocatedEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: G3, G4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"participants": ["earth:LandFormation"], "affects": ["geography:GroundElevation"], "creates": [], "confers": [], "rationale": "Identity changes require an occurrence; no implemented cascade. Overwash source-specific evidence remains missing.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: dated landslide. Negative: susceptibility map cell.
Question incidence: geography-q07.

### geography:DuneOverwashEpisode (event; blocked)

Bounded crossing of dune by storm water and sediment.
Parent: `earth:GeolocatedEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: G3, G4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"participants": ["earth:LandFormation"], "affects": ["geography:GroundElevation"], "creates": [], "confers": [], "rationale": "Identity changes require an occurrence; no implemented cascade. Overwash source-specific evidence remains missing.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: storm overwash deposit. Negative: ordinary seaward tidal wetting.
Question incidence: unused; needs fresh justification or removal.

### geography:ScarpCollapseEpisode (event; provisional)

Bounded loss of identified scarp part through collapse.
Parent: `earth:GeolocatedEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: G3, G4.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"participants": ["earth:LandFormation"], "affects": ["geography:GroundElevation"], "creates": [], "confers": [], "rationale": "Identity changes require an occurrence; no implemented cascade. Overwash source-specific evidence remains missing.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: detached cliff part falls. Negative: cliff hidden by cloud.
Question incidence: unused; needs fresh justification or removal.

## Quality summaries and evidence states

Proposed RelativelySteep summarizes `geography:TerrainInclination`. Ordered comparison to explicit terrain/reference/use, no fixed angle threshold; overlap/context permitted, not exhaustive global bins.

This is blocked until comparison conventions and observations exist. Unknown, unmeasured and disputed describe evidence, not domain predicates. Nominal identity, ordering and overlap must be reviewed separately. No exhaustive classification or universal thresholds are invented.

## Coverage and next revision

Counts: {"subject": 5, "quality": 5, "process": 5, "relationship": 3, "event": 3}. The five/category objective has two unfilled relationship and two unfilled event slots. Counts include explicitly blocked candidates; they are not a readiness score.

Unused candidates: geography:LocalRelief, geography:SurfaceRemoval, geography:SlopeMassMovement, geography:DuneMigration, geography:DuneOverwashEpisode, geography:ScarpCollapseEpisode.

Agency primary materials are bounded starting evidence, often educational/descriptive. Sources do not endorse ontological categories, exact inferred bindings or exhaustive coverage. Retrieval failures are recorded per source.

Request fresh independent questions from domain experts after this revision is frozen. Broaden beyond the agency educational sources, reconcile contested meanings and upstream parents, and retire unsupported candidates rather than preserving legacy comments by default. Do not promote speculative alternatives into executable src.

## Validation, stage handoff and stop condition

Local checks cover field presence, 15 question IDs, referenced candidate/source IDs and incidence only. Actual syntax, adaptation, scientific validity and model execution are separate. A qualified missing concept may parse and still fail resolution. The deliberately malformed expression in dossier.json must be rejected by the real parser.

Freeze dossier/import hashes, resolve blocking ambiguity/source gaps, human domain and ontology review, actual candidate parser/adaptation/reasoner checks, separate exact-revision approval; no self-approval.

Map stable concept/question/source IDs into existing context-pack evidence/assets/alignment/open_questions fields; keep schema1.3 unchanged. Suggested future source-review ledger, question-semantic tests and exact hash approval bindings need backend discussion, not unilateral API invention.

All change/cessation requires an occurrent. At time transitions resolve change in each quality separately. Unresolved change permits operation with available knowledge; it does not imply no real change or a retention rule. Implication/detection remain syntax-only. No role-conferral binding is asserted without evidence, and no consequence engine is implemented.

## Final author audit: upstream prerequisites and transport caveat

- **geo-upper-region**: earth:Region surface/volume and inherited feature dependence. Resolve before any LandFormation specialization is executable.
- **geo-forcing**: Stress, shear resistance, fluid motion and sediment content. Relevant to erosion/mass movement; parameters are incomplete until physical/hydrology/geology definitions exist.
- **geo-overlap**: GroundElevation/TerrainInclination/TerrainAspect versus existing Elevation/Slope/Aspect. Proposed cleaned meanings should revise/reuse existing IDs after review rather than silently duplicate. No equals until meaning is established.

Process parameters are incomplete and include response qualities. This dossier does not claim a complete governing-parameter set. The JSON import_evidence records exact local imported file hashes. Resolve the listed prerequisites instead of using a local invented parent or pretending a missing force/flux quality exists.

No source disagreement was resolved by majority vote. Differences in operational perspective (including freshwater versus marine estuary, field landform schemes versus universal types, or material parcel versus fixed region) are preserved as scoped alternatives. Human expert review and independent probes remain outstanding.
