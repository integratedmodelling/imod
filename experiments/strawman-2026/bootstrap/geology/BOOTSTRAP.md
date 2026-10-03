# Geology bootstrap dossier

Earth materials, their arrangement and geological occurrences. Material identity is distinct from economic usefulness; geological-history mechanisms are models.

Status: research draft. No candidate ontology is installed, and no human expert discussion or approval is claimed. This document and dossier.json are local research artifacts, not a new proposal API.

## Source review and scope

- **L1** [USGS GIP 17 (2005), mineral deposits and contaminants](https://pubs.usgs.gov/gip/2005/17/gip-17.pdf). Locator: Rock cycle; occurrence/deposit/ore distinction. Scope: Rock formation and economic distinctions from indexed primary excerpts. Direct PDF returned 403. Status: indexed primary excerpts reviewed; full retrieval blocked. Retrieved 2026-10-03.
- **L2** [USGS Science of Earthquakes](https://www.usgs.gov/programs/earthquake-hazards/science-earthquakes). Locator: Earthquake definition; causes; magnitude/intensity; prediction. Scope: Fault slip/shaking and prediction limits; educational simplifications require expert review. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.
- **L3** [USGS landslide FAQ](https://www.usgs.gov/faqs/what-a-landslide-and-what-causes-one). Locator: Opening definition and causes. Scope: Gravity-driven movement, submarine cases, several modes and multiple triggers. Status: primary selected text retrieved and reviewed. Retrieved 2026-10-03.

## Imported ancestry and unresolved meanings

Imports: imod, earth. References checked against the current sandbox source inherited from base 608bef150ced0a109db98a5aad64ba4461beaa54; exact final source hashes are to be pinned by the root validation manifest. Parent existence is not approval of specialization.

- Rock body is a material individual; rock type is identity/classification.
- Fault zone is a finite physical subject; an idealized fault plane is another perspective, and neither is an earthquake event.
- No universal Earthquake affects Landslide binding: triggering is contingent and requires a model.
- Formation can mean formal stratigraphic unit or generic body; avoid unqualified Formation.
- Material/aggregate parent is missing upstream. imod:Subject is verified broad ancestry, not a claim that finer specialization has been settled.

## Questions before vocabulary

The saved questions-source-first.json was written before candidate records and keeps the original order/source. The author had already read legacy namespaces; this is not blind testing. No independent held-out probes were obtained. The mappings below came later. Each expression is a component observable, not an executable answer to an entire narrative question. Grammar remains untested here until the root parser report supersedes it.

### geology-q01: What is the rock beneath the soil here?

Source: L1; source-led order 1. Incidence: geology:RockBody.

Expression: `geology:RockBody`
Expected: subject. Observe underlying rock body; lithological identity and overlying-soil context remain dependencies.
Positive case: Observe underlying rock body; lithological identity and overlying-soil context remain dependencies. Negative case: soil taxon supplies rock identity.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q02: Which rock body contains the mineral grains seen in this sample?

Source: L1; source-led order 2. Incidence: geology:GrainConstituentOf, geology:MineralGrain, geology:RockBody.

Expression: `geology:GrainConstituentOf`
Expected: relationship. Resolve identified grain and containing rock endpoints, not type occurrence alone.
Positive case: Resolve identified grain and containing rock endpoints, not type occurrence alone. Negative case: mineral in handbook proves membership.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q03: Are these loose fragments sediment or a coherent rock body?

Source: L1; source-led order 3. Incidence: geology:SedimentBody, geology:RockBody.

Expression: `geology:SedimentBody`
Expected: subject. Differentiate unconsolidated accumulation from coherent body.
Positive case: Differentiate unconsolidated accumulation from coherent body. Negative case: all small rocks are sediment bodies.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q04: Has an older layer been cut by a fault?

Source: L2; source-led order 4. Incidence: geology:FaultCutsBody, geology:FaultZone, geology:RockStratum.

Expression: `geology:FaultCutsBody`
Expected: relationship. Intersection tested; older chronology requires additional stratigraphic evidence.
Positive case: Intersection tested; older chronology requires additional stratigraphic evidence. Negative case: map line crossing proves chronology.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q05: Which ground moved during the earthquake?

Source: L2; source-led order 5. Incidence: geology:SlipDisplacement, geology:FaultSlipEarthquake.

Expression: `geology:SlipDisplacement of geology:FaultZone`
Expected: quality. Relative fault-side displacement during specific earthquake; shaking motion is separate.
Positive case: Relative fault-side displacement during specific earthquake; shaking motion is separate. Negative case: earthquake magnitude equals local displacement.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q06: Was this slope failure a falling block or a flowing mixture?

Source: L3; source-led order 6. Incidence: geology:LandslideEpisode, geology:RockfallEpisode.

Expression: `geology:RockfallEpisode`
Expected: event. Bounded falling mode versus flow; retain event classification evidence.
Positive case: Bounded falling mode versus flow; retain event classification evidence. Negative case: all downslope motion is rockfall.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q07: Could the slide happen without an earthquake?

Source: L3; source-led order 7. Incidence: geology:LandslideEpisode.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Causal alternatives require model/evidence; landslide meaning does not require earthquake.
Positive case: Causal alternatives require model/evidence; landslide meaning does not require earthquake. Negative case: every slide implies quake.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### geology-q08: Is the rock breaking apart in place or being carried away?

Source: L1; source-led order 8. Incidence: geology:InPlaceWeathering, geology:SedimentTransport.

Expression: `geology:InPlaceWeathering`
Expected: process. Separate in-place alteration from transport; both may co-occur.
Positive case: Separate in-place alteration from transport; both may co-occur. Negative case: weathering necessarily means material moved away.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q09: Did deposited grains become a solid rock?

Source: L1; source-led order 9. Incidence: geology:Lithification, geology:RockBody.

Expression: `geology:Lithification`
Expected: process. Observe consolidation; resulting rock identity needs boundary/continuity judgment.
Positive case: Observe consolidation; resulting rock identity needs boundary/continuity judgment. Negative case: mere settling constitutes rock.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q10: Is this rock changing under heat and pressure without melting?

Source: L1; source-led order 10. Incidence: geology:MetamorphicAlteration.

Expression: `geology:MetamorphicAlteration`
Expected: process. Solid-state alteration; temperature/pressure/composition dependencies incomplete.
Positive case: Solid-state alteration; temperature/pressure/composition dependencies incomplete. Negative case: melting relabeled metamorphism.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q11: How much material was displaced by the landslide?

Source: L3; source-led order 11. Incidence: geology:BodyVolume, geology:LandslideEpisode.

Expression: `geology:BodyVolume of geology:SedimentBody`
Expected: quality. Displaced participating body volume, not affected-map area; rock bodies need parallel observation.
Positive case: Displaced participating body volume, not affected-map area; rock bodies need parallel observation. Negative case: source area treated as volume.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

### geology-q12: Does finding a mineral mean that it can profitably be mined?

Source: L1; source-led order 12. Incidence: geology:MineralFraction.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Profitability requires economic/recoverability models, no Ore predicate inferred from presence.
Positive case: Profitability requires economic/recoverability models, no Ore predicate inferred from presence. Negative case: any mineral grain means viable mine.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### geology-q13: Did the cliff collapse remove the support for a neighboring block?

Source: L3; source-led order 13. Incidence: geology:RockfallEpisode, geology:RockBody.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. Support relation, collapse event and dependent identity consequences need upstream articulation; no engine.
Positive case: Support relation, collapse event and dependent identity consequences need upstream articulation; no engine. Negative case: absence from image ends rock body.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### geology-q14: Can a quiet fault be classified as having no future earthquake hazard?

Source: L2; source-led order 14. Incidence: geology:FaultZone.

Expression: **gap; no faithful complete expression proposed**.
Expected: gap. No earthquake observation does not imply zero hazard; hazard models distinct from fault subject.
Positive case: No earthquake observation does not imply zero hazard; hazard models distinct from fault subject. Negative case: quiet period certifies safety.
Semantic status: blocked; grammar: not_applicable. Model/resolution not executed.

### geology-q15: Are underwater slope failures excluded from landslides?

Source: L3; source-led order 15. Incidence: geology:LandslideEpisode.

Expression: `geology:LandslideEpisode`
Expected: event. Submarine movement remains within scoped landslide meaning; water cover is context.
Positive case: Submarine movement remains within scoped landslide meaning; water cover is context. Negative case: underwater excludes landslide.
Semantic status: provisional; grammar: untested. Model/resolution not executed.

## Candidate records

Exact names are provisional. Category/type and dependency arity are proposal coordinates; source evidence is not an ontology specification. Subject qualities and process parameters below identify meanings, not variables or equations.

### geology:RockBody (subject; provisional)

Individuated coherent geological material body.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: L1, L2.
Qualities: geology:BodyVolume, geology:MineralFraction. Parameters: none proposed.
Bindings: {}
Positive: granite outcrop body. Negative: granite type label.
Question incidence: geology-q01, geology-q02, geology-q03, geology-q09, geology-q13.

### geology:SedimentBody (subject; provisional)

Individuated unconsolidated particle accumulation.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: L1, L2.
Qualities: geology:BodyVolume. Parameters: none proposed.
Bindings: {}
Positive: sand deposit. Negative: grain-size value.
Question incidence: geology-q03.

### geology:MineralGrain (subject; provisional)

Individuated mineral particle.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: L1, L2.
Qualities: geology:GrainDiameter. Parameters: none proposed.
Bindings: {}
Positive: quartz grain. Negative: quartz species.
Question incidence: geology-q02.

### geology:FaultZone (subject; provisional)

Finite fracture zone bearing displacement evidence.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: L1, L2.
Qualities: geology:SlipDisplacement. Parameters: none proposed.
Bindings: {}
Positive: mapped fault zone. Negative: earthquake forecast area.
Question incidence: geology-q04, geology-q14.

### geology:RockStratum (subject; provisional)

Material layer distinguished in a stratified succession.
Parent: `imod:Subject` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 0. Sources: L1, L2.
Qualities: geology:LayerThickness. Parameters: none proposed.
Bindings: {}
Positive: sandstone bed. Negative: age interval.
Question incidence: geology-q04.

### geology:BodyVolume (quality; provisional)

Volume of identified geological material.
Parent: `imod:Volume` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: L1, L2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "geology:RockBody or geology:SedimentBody"}
Positive: displaced debris volume. Negative: hazard-map area.
Question incidence: geology-q11.

### geology:MineralFraction (quality; provisional)

Specified mineral share on declared mass or volume basis.
Parent: `imod:Proportion` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: L1, L2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "geology:RockBody"}
Positive: quartz mass fraction. Negative: ore profitability.
Question incidence: geology-q12.

### geology:GrainDiameter (quality; provisional)

Particle size under chosen geometric convention.
Parent: `imod:Length` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: L1, L2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "geology:MineralGrain"}
Positive: equivalent grain diameter. Negative: diameter of whole rock body.
Question incidence: unused; needs fresh justification or removal.

### geology:SlipDisplacement (quality; provisional)

Relative movement of opposite fault sides during specified occurrence.
Parent: `imod:Length` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: L1, L2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "geology:FaultZone"}
Positive: rupture offset. Negative: earthquake magnitude.
Question incidence: geology-q05.

### geology:LayerThickness (quality; provisional)

Stratum boundary separation in stated normal direction.
Parent: `imod:Length` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 1. Sources: L1, L2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"bearer": "geology:RockStratum"}
Positive: bed thickness. Negative: apparent outcrop width.
Question incidence: unused; needs fresh justification or removal.

### geology:InPlaceWeathering (process; provisional)

Alteration of rock in place.
Parent: `earth:Weathering` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: L1.
Qualities: not applicable. Parameters: geology:MineralFraction.
Bindings: {"participants": ["geology:RockBody", "geology:SedimentBody"], "affects": ["geology:MineralFraction"], "creates": [], "confers": [], "rationale": "Relevant quality parameters only; pressure/composition and transport velocity need upstream articulation. Creates conditional on individuating a new body, not fixed product inference.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: altered stationary outcrop. Negative: unaltered transported particles.
Question incidence: geology-q08.

### geology:SedimentTransport (process; provisional)

Movement of unconsolidated geological particles.
Parent: `earth:LandformingProcess` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: L1.
Qualities: not applicable. Parameters: geology:GrainDiameter.
Bindings: {"participants": ["geology:RockBody", "geology:SedimentBody"], "affects": ["geology:BodyVolume"], "creates": [], "confers": [], "rationale": "Relevant quality parameters only; pressure/composition and transport velocity need upstream articulation. Creates conditional on individuating a new body, not fixed product inference.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: sand transported downstream. Negative: sand only wetted.
Question incidence: geology-q08.

### geology:SedimentDeposition (process; provisional)

Accumulation of transported particles.
Parent: `earth:Sedimentation` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: L1.
Qualities: not applicable. Parameters: geology:GrainDiameter.
Bindings: {"participants": ["geology:RockBody", "geology:SedimentBody"], "affects": ["geology:BodyVolume"], "creates": ["geology:SedimentBody"], "confers": [], "rationale": "Relevant quality parameters only; pressure/composition and transport velocity need upstream articulation. Creates conditional on individuating a new body, not fixed product inference.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: new sand deposit. Negative: particles pass through.
Question incidence: unused; needs fresh justification or removal.

### geology:Lithification (process; provisional)

Consolidation of sediment into coherent rock.
Parent: `earth:LandformingProcess` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: L1.
Qualities: not applicable. Parameters: geology:BodyVolume.
Bindings: {"participants": ["geology:RockBody", "geology:SedimentBody"], "affects": [], "creates": ["geology:RockBody"], "confers": [], "rationale": "Relevant quality parameters only; pressure/composition and transport velocity need upstream articulation. Creates conditional on individuating a new body, not fixed product inference.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: cemented sandstone forms. Negative: compressed but still loose sediment.
Question incidence: geology-q09.

### geology:MetamorphicAlteration (process; provisional)

Solid-state alteration of geological material.
Parent: `earth:LandformingProcess` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 1. Sources: L1.
Qualities: not applicable. Parameters: imod:Temperature.
Bindings: {"participants": ["geology:RockBody", "geology:SedimentBody"], "affects": ["geology:MineralFraction"], "creates": [], "confers": [], "rationale": "Relevant quality parameters only; pressure/composition and transport velocity need upstream articulation. Creates conditional on individuating a new body, not fixed product inference.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: changed minerals without bulk melting. Negative: magma crystallization.
Question incidence: geology-q10.

### geology:StratumSuperposition (relationship; provisional)

One stratum currently overlies another.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: L1, L2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "geology:RockStratum", "target": "geology:RockStratum", "rationale": "Spatial order is not necessarily age order in overturned strata."}
Positive: sandstone over shale. Negative: younger age assumed.
Question incidence: unused; needs fresh justification or removal.

### geology:FaultCutsBody (relationship; provisional)

Fault zone intersects a rock body.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: L1, L2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "geology:FaultZone", "target": "geology:RockBody", "rationale": "Intersection does not assert future rupture."}
Positive: fracture crosses bed. Negative: projected fault merely nearby.
Question incidence: geology-q04.

### geology:GrainConstituentOf (relationship; provisional)

Grain is physically constituent of rock body.
Parent: `imod:Relationship` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: structural; arity: 2. Sources: L1, L2.
Qualities: not applicable. Parameters: none proposed.
Bindings: {"source": "geology:MineralGrain", "target": "geology:RockBody", "rationale": "Membership of individuals, not mineral-type list."}
Positive: grain in rock sample. Negative: mineral in regional handbook.
Question incidence: geology-q02.

### geology:FaultSlipEarthquake (event; provisional)

Bounded earthquake involving sudden fault slip.
Parent: `earth:GeologicalEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: L2, L3.
Qualities: not applicable. Parameters: geology:BodyVolume.
Bindings: {"participants": ["geology:RockBody", "geology:SedimentBody"], "affects": ["geology:SlipDisplacement"], "creates": [], "confers": [], "rationale": "Volume applies to identified source/receiving bodies; material conservation is a model constraint. Separation may change identity, never through implicit inference.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: recorded fault-slip earthquake. Negative: aseismic slow slip.
Question incidence: geology-q05.

### geology:LandslideEpisode (event; provisional)

Bounded gravity-driven downslope mass movement.
Parent: `earth:GeologicalEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: L2, L3.
Qualities: not applicable. Parameters: geology:BodyVolume.
Bindings: {"participants": ["geology:RockBody", "geology:SedimentBody"], "affects": ["geology:BodyVolume"], "creates": [], "confers": [], "rationale": "Volume applies to identified source/receiving bodies; material conservation is a model constraint. Separation may change identity, never through implicit inference.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: submarine slope failure. Negative: susceptibility rating.
Question incidence: geology-q06, geology-q07, geology-q11, geology-q15.

### geology:RockfallEpisode (event; provisional)

Bounded detachment and falling of slope rock.
Parent: `earth:GeologicalEvent` (verified_reference); Parent name verified in imported source; scientific specialization is unapproved. Broad root parent does not resolve narrower material/host distinctions.
Perspective: functional; arity: 0. Sources: L2, L3.
Qualities: not applicable. Parameters: geology:BodyVolume.
Bindings: {"participants": ["geology:RockBody", "geology:SedimentBody"], "affects": ["geology:BodyVolume"], "creates": [], "confers": [], "rationale": "Volume applies to identified source/receiving bodies; material conservation is a model constraint. Separation may change identity, never through implicit inference.", "implementation": "semantic proposal only; no runtime consequences"}
Positive: cliff block falls. Negative: in-place chemical weathering.
Question incidence: geology-q06, geology-q13.

## Quality summaries and evidence states

Proposed CoarseGrained summarizes `geology:GrainDiameter`. Ordered particle-size summary only after named scheme and measurement population chosen; no universal threshold or rock-type equivalence.

This is blocked until comparison conventions and observations exist. Unknown, unmeasured and disputed describe evidence, not domain predicates. Nominal identity, ordering and overlap must be reviewed separately. No exhaustive classification or universal thresholds are invented.

## Coverage and next revision

Counts: {"subject": 5, "quality": 5, "process": 5, "relationship": 3, "event": 3}. The five/category objective has two unfilled relationship and two unfilled event slots. Counts include explicitly blocked candidates; they are not a readiness score.

Unused candidates: geology:GrainDiameter, geology:LayerThickness, geology:SedimentDeposition, geology:StratumSuperposition.

Agency primary materials are bounded starting evidence, often educational/descriptive. Sources do not endorse ontological categories, exact inferred bindings or exhaustive coverage. Retrieval failures are recorded per source.

Request fresh independent questions from domain experts after this revision is frozen. Broaden beyond the agency educational sources, reconcile contested meanings and upstream parents, and retire unsupported candidates rather than preserving legacy comments by default. Do not promote speculative alternatives into executable src.

## Validation, stage handoff and stop condition

Local checks cover field presence, 15 question IDs, referenced candidate/source IDs and incidence only. Actual syntax, adaptation, scientific validity and model execution are separate. A qualified missing concept may parse and still fail resolution. The deliberately malformed expression in dossier.json must be rejected by the real parser.

Freeze dossier/import hashes, resolve blocking ambiguity/source gaps, human domain and ontology review, actual candidate parser/adaptation/reasoner checks, separate exact-revision approval; no self-approval.

Map stable concept/question/source IDs into existing context-pack evidence/assets/alignment/open_questions fields; keep schema1.3 unchanged. Suggested future source-review ledger, question-semantic tests and exact hash approval bindings need backend discussion, not unilateral API invention.

All change/cessation requires an occurrent. At time transitions resolve change in each quality separately. Unresolved change permits operation with available knowledge; it does not imply no real change or a retention rule. Implication/detection remain syntax-only. No role-conferral binding is asserted without evidence, and no consequence engine is implemented.

## Final author audit: upstream prerequisites and transport caveat

- **geo-material**: Material body/aggregate and mineral identity. Request root/physics/chemistry distinction; broad Subject ancestry not a local invented material parent.
- **geo-parameters**: Pressure, shear strength, stress, fluid transport velocity and composition. Needed for geological process articulation; no local equations or fabricated quality declarations.
- **geo-support**: Mechanical support between rock bodies. Needed for cliff-collapse question; missing relation and consequence machinery explicitly separate.

Process parameters are incomplete and include response qualities. This dossier does not claim a complete governing-parameter set. The JSON import_evidence records exact local imported file hashes. Resolve the listed prerequisites instead of using a local invented parent or pretending a missing force/flux quality exists.

No source disagreement was resolved by majority vote. Differences in operational perspective (including freshwater versus marine estuary, field landform schemes versus universal types, or material parcel versus fixed region) are preserved as scoped alternatives. Human expert review and independent probes remain outstanding.
