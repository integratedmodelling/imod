# Earth bootstrap dossier

Minimal shared physical Earth bearers and earth-surface transformations that other disciplines can import. Not land-cover taxonomy, coordinate infrastructure or a replacement for climate/hydrology/geology.

**Status:** local draft, no human approval, no executable ontology. Requested Tier1; imported root context is recorded without mechanically emitting redundant `is` clauses. A reference that exists is not a scientifically accepted parent. Proposed imported MaterialBody remains blocked until upstream review.

## Question-first evidence and method

The fifteen questions were saved before the local candidate table in QUESTIONS_FIRST.json (SHA256 `7eb48c316709ccd3e682b1952d3509eabb8a955d1fac46aa5387d4a68672de1b`). The author had seen the legacy and previous packet, so this is not blind testing. Questions were not retroactively renamed to fit concepts. No independent expert discussion has occurred.

## Sources and limits

- **LOCAL** [Pinned ontology/context pack and user change commitments](../METHOD.md), METHOD change boundary; src/imod.kwv:289-447; src/physical.kwv; src/earth.kwv. Local design evidence, not external science; current comments not automatically accepted. Retrieved2026-10-03.
- **USGS-DESERT** [USGS Our Dynamic Desert](https://pubs.usgs.gov/of/2004/1007/erosion.html), 2004 report; page updated2009-12-18; Weathering and Erosion. Mojave observations distinguish weathering, erosion, debris transport; regional evidence not universal rates. Retrieved2026-10-03.
- **USGS-INTERIOR** [USGS The Interior of the Earth](https://pubs.usgs.gov/gip/interior/), Crust, mantle and core sections; available search-index text. Earth layering, plate composition and seismic inference; approximate pedagogical model. Retrieved2026-10-03.
- **USGS-TRACER** [Bierman et al. Erosion weathering sedimentation](https://pubs.usgs.gov/publication/70196623), 1998 chapter19 pp647-678; abstract only. Tracer interpretation limitations; historical integration not instantaneous weathering. Retrieved2026-10-03.

## Scope and dependency argument

Five bodies, four processes, two relationships and three events expose the dependencies without making earth import downstream climate, hydrology or ecology. Chemistry is omitted from the proposed minimal dependency map until a particular composition observable needs it; this is a proposal, not a source edit. CrustalBody and LithosphericPlate are not synonyms: a plate includes uppermost mantle. RockBody and SedimentDeposit distinguish coherent source material from accumulated particulate material, but consolidation is a boundary case. Earth remains provisional: geology may own specialized tectonics and debris events, with earth retaining only common parents. Keeping these candidates visible does not prejudge that allocation. WaterBody, Region, Reach and Coast are intentionally gaps because inherited empty/ambiguous definitions should not gain authority through retention.

Proposed dependency order: imod → physical → physics/chemistry/earth; earth does not import its downstream disciplinary consumers. These are alternative packet decisions, not changed source imports. Generic coordinate, temporal, unit, model and execution infrastructure stays outside.

## Questions before vocabulary

### earth-q01: What physical body is meant by the Earth in this observation?

Planet identity vs region vs material sample.
- Source/provenance: USGS-INTERIOR; original order 1.
- Draft observable: `earth:TerrestrialPlanetBody`
- Expected expression-result category: subject. Positive: Earth as planetary body. Negative: administrative country.
- Dependencies: Planet identity vs region vs material sample. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q02: Does a plate contain only crust or also upper mantle?

Lithospheric plate composition vs crust.
- Source/provenance: USGS-INTERIOR; original order 2.
- Draft observable: `earth:LithosphericPlate`
- Expected expression-result category: subject. Positive: identified tectonic plate; continental crustal section. Negative: crust alone or electoral district; whole lithospheric plate.
- Dependencies: Lithospheric plate composition vs crust. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q03: Where does the crust end beneath this place?

Boundary inferred from wave response; not arbitrary map border.
- Source/provenance: USGS-INTERIOR; original order 3.
- Explicit gap: gap: crust-mantle interface quality/identity and inverse model.
- Expected expression-result category: unresolved. Positive: continental crustal section. Negative: whole lithospheric plate.
- Dependencies: Boundary inferred from wave response; not arbitrary map border. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: crust-mantle interface quality/identity and inverse model
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q04: What distinguishes a water body from the region surrounding it?

Material body vs volumetric geographical region.
- Source/provenance: LOCAL; original order 4.
- Explicit gap: gap: earth:WaterBody existing empty definition and Region volumetric/areal conflict.
- Expected expression-result category: unresolved. Positive: Material body vs volumetric geographical region.. Negative: Treating this evidence/representation distinction as an automatically valid domain declaration..
- Dependencies: Material body vs volumetric geographical region. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: earth:WaterBody existing empty definition and Region volumetric/areal conflict
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q05: Can a coastal strip be identified without classifying every land-cover pixel?

Shared geographic bearer vs authority classification.
- Source/provenance: LOCAL; original order 5.
- Explicit gap: gap: Coast bearer definition and shoreline convention; authorities separate.
- Expected expression-result category: unresolved. Positive: Shared geographic bearer vs authority classification.. Negative: Treating this evidence/representation distinction as an automatically valid domain declaration..
- Dependencies: Shared geographic bearer vs authority classification. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: Coast bearer definition and shoreline convention; authorities separate
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q06: Is this hill lower because material left it or because our datum changed?

Erosion-driven elevation change vs representation correction.
- Source/provenance: USGS-DESERT; original order 6.
- Explicit gap: gap: explicit elevation quality/reference; no implicit change model.
- Expected expression-result category: unresolved. Positive: material removed from slope; identified exposed rock mass. Negative: datum correction changes reported elevation; rock-type classification code.
- Dependencies: Erosion-driven elevation change vs representation correction. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: explicit elevation quality/reference; no implicit change model
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q07: Did rock break down in place or move elsewhere?

Weathering vs erosion and transport.
- Source/provenance: USGS-DESERT; original order 7.
- Draft observable: `earth:Weathering`
- Expected expression-result category: process. Positive: rock disintegrates in place; material removed from slope. Negative: unchanged rock transported downstream; datum correction changes reported elevation.
- Dependencies: Weathering vs erosion and transport. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### earth-q08: Where did the sediment on this fan come from?

Material provenance needs transport occurrence, not mere proximity.
- Source/provenance: USGS-DESERT; original order 8.
- Draft observable: `earth:DepositDerivedFrom linking earth:SedimentDeposit to earth:RockBody`
- Expected expression-result category: relationship. Positive: traced sediment source contribution; identified alluvial deposit; identified exposed rock mass. Negative: nearest mountain without transport evidence; particles still transported in fluid; rock-type classification code.
- Dependencies: Material provenance needs transport occurrence, not mere proximity. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q09: Can slow uplift and erosion happen at the same time?

Competing occurrents, not mutually exclusive predicates.
- Source/provenance: USGS-DESERT; original order 9.
- Draft observable: `earth:TectonicUplift`
- Expected expression-result category: process. Positive: tectonic rise of geological body; material removed from slope. Negative: new vertical datum; datum correction changes reported elevation.
- Dependencies: Competing occurrents, not mutually exclusive predicates. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### earth-q10: Was this slope movement one bounded episode?

Landslide/debris event segmentation is contextual.
- Source/provenance: USGS-DESERT; original order 10.
- Draft observable: `earth:DebrisFlowEpisode`
- Expected expression-result category: event. Positive: observed rockfall; one observed debris-flow surge. Negative: slow chemical alteration without movement; clear streamflow without debris-rich moving mass.
- Dependencies: Landslide/debris event segmentation is contextual. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### earth-q11: What changed when a new rock deposit formed?

Deposition, deposited material and bearer extent distinguished.
- Source/provenance: USGS-DESERT; original order 11.
- Draft observable: `earth:SedimentDeposition`
- Expected expression-result category: process. Positive: sediment accumulates on fan; identified alluvial deposit; one bounded depositional pulse. Negative: sediment passes without settling; particles still transported in fluid; an old deposit observed without formation event.
- Dependencies: Deposition, deposited material and bearer extent distinguished. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q12: Is a river reach a body of water or a geographical corridor?

Persistent place vs changing material body needs split.
- Source/provenance: LOCAL; original order 12.
- Explicit gap: gap: Reach place/material split belongs in shared earth/hydrology review.
- Expected expression-result category: unresolved. Positive: Persistent place vs changing material body needs split.. Negative: Treating this evidence/representation distinction as an automatically valid domain declaration..
- Dependencies: Persistent place vs changing material body needs split. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: Reach place/material split belongs in shared earth/hydrology review
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q13: Does every visible land boundary mark a geological difference?

Administrative/land-use authority categories do not entail geology.
- Source/provenance: LOCAL; original order 13.
- Explicit gap: gap: no land-cover-to-geology equivalence.
- Expected expression-result category: unresolved. Positive: continental crustal section. Negative: whole lithospheric plate.
- Dependencies: Administrative/land-use authority categories do not entail geology. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: no land-cover-to-geology equivalence
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q14: Can earthquake measurements tell us about inaccessible layers?

Observable meaning vs observational method/inverse model.
- Source/provenance: USGS-INTERIOR; original order 14.
- Explicit gap: gap: seismic quality and inversion model outside shared earth articulation.
- Expected expression-result category: unresolved. Positive: continental crustal section. Negative: whole lithospheric plate.
- Dependencies: Observable meaning vs observational method/inverse model. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: seismic quality and inversion model outside shared earth articulation
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### earth-q15: If elevation change is unresolved after erosion, may the twin continue?

Unknown change remains unresolved; not zero change or retention rule.
- Source/provenance: LOCAL; original order 15.
- Explicit gap: gap: unresolved change remains open-world; no executable retention machinery.
- Expected expression-result category: unresolved. Positive: material removed from slope. Negative: datum correction changes reported elevation.
- Dependencies: Unknown change remains unresolved; not zero change or retention rule. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: unresolved change remains open-world; no executable retention machinery
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

## Candidate corpus and scoped bindings

### TerrestrialPlanetBody — subject

Earth viewed as one physical planetary body; terrestrial here identifies Earth, not all rocky planets.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: imod:Mass; imod:Volume. Parameters: none proposed.
- Bindings: {}
- Positive: Earth as planetary body. Negative: administrative country.
- Evidence: USGS-INTERIOR; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### CrustalBody — subject

Specified bounded crustal portion, distinguished from mantle by geological evidence.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: physical:Depth; imod:Temperature; composition missing. Parameters: none proposed.
- Bindings: {}
- Positive: continental crustal section. Negative: whole lithospheric plate.
- Evidence: USGS-INTERIOR; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### LithosphericPlate — subject

Coherently moving lithospheric body including crust and uppermost mantle.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: thickness missing; vector velocity upstream gap. Parameters: none proposed.
- Bindings: {}
- Positive: identified tectonic plate. Negative: crust alone or electoral district.
- Evidence: USGS-INTERIOR; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### RockBody — subject

Bounded coherent geological material body under a specified continuity criterion.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: imod:Mass; imod:Volume; composition missing. Parameters: none proposed.
- Bindings: {}
- Positive: identified exposed rock mass. Negative: rock-type classification code.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### SedimentDeposit — subject

Bounded accumulation of deposited geological particulate material.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: imod:Mass; imod:Volume; grain-size distribution missing. Parameters: none proposed.
- Bindings: {}
- Positive: identified alluvial deposit. Negative: particles still transported in fluid.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### Weathering — process

In-place alteration or breakdown of geological material.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: imod:Temperature; water availability missing; composition missing.
- Bindings: {"affects": "rock constitution or fragmentation", "creates": "weathered material only when separately individuated", "confers": []}
- Positive: rock disintegrates in place. Negative: unchanged rock transported downstream.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### Erosion — process

Removal of material from an identified source land/rock body.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: transport forcing missing; material cohesion missing; mass removal rate missing.
- Bindings: {"affects": "source material mass and potentially topographic elevation", "creates": [], "confers": []}
- Positive: material removed from slope. Negative: datum correction changes reported elevation.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### SedimentDeposition — process

Accumulation of previously transported sediment at an identified receiving location.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: transport velocity upstream gap; grain size missing; sediment flux missing.
- Bindings: {"affects": "receiving deposit mass", "creates": "earth:SedimentDeposit only when new body meets individuation rule", "confers": []}
- Positive: sediment accumulates on fan. Negative: sediment passes without settling.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### TectonicUplift — process

Upward displacement of geological material relative to a specified reference under tectonic deformation.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: vertical displacement missing; stress missing.
- Bindings: {"affects": "material elevation relative to declared reference", "creates": [], "confers": []}
- Positive: tectonic rise of geological body. Negative: new vertical datum.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### DepositDerivedFrom — relationship

Directed material provenance of a deposit from a specified source geological body through identified transport.
- Imported parent/context: `imod:Relationship` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: provenance fraction missing.
- Bindings: {"source": "earth:SedimentDeposit", "target": "earth:RockBody", "rationale": "Requires material provenance evidence, not proximity or universal single source."}
- Positive: traced sediment source contribution. Negative: nearest mountain without transport evidence.
- Evidence: USGS-TRACER; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### PlateContactsPlate — relationship

Physical contact of specified lithospheric plate bodies along their interface.
- Imported parent/context: `imod:Relationship` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: relative vector motion missing.
- Bindings: {"source": "earth:LithosphericPlate", "target": "earth:LithosphericPlate", "rationale": "Symmetric physical relation; bond choice pending. Divergent/convergent are kinematic summaries, not disjoint bodies."}
- Positive: identified contacting plate pair. Negative: two distant named plates.
- Evidence: USGS-INTERIOR; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### RockfallEpisode — event

Bounded detachment and downslope fall of rock from a source slope.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: imod:Mass; displacement missing.
- Bindings: {"affects": "source body continuity", "creates": "detached rock bodies when separately individuated", "confers": []}
- Positive: observed rockfall. Negative: slow chemical alteration without movement.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### DebrisFlowEpisode — event

Bounded movement of water and geological debris as a flowing mass with declared initiation and cessation criteria.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: water content missing; sediment concentration missing; velocity upstream gap.
- Bindings: {"affects": "source/receiving material distribution", "creates": "deposit only if deposition occurs; not guaranteed", "confers": []}
- Positive: one observed debris-flow surge. Negative: clear streamflow without debris-rich moving mass.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### DepositionalEpisode — event

Bounded interval of sediment accumulation at a specified receiving body.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: sediment mass flux missing; imod:Mass.
- Bindings: {"affects": "deposit mass and extent", "creates": "new deposit if identity criteria satisfied", "confers": []}
- Positive: one bounded depositional pulse. Negative: an old deposit observed without formation event.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

## Quality summaries, not generic properties

- **ConvergentRelativeMotion** summarizes relative motion of two contacting lithospheric plates. Directional comparison in an explicit frame, not ordinal intensity. Oblique motion may have multiple components; no universal disjoint/exhaustive partition. blocked: vector relative-motion quality upstream.
- **CoarseRelativeToClassification** summarizes grain-size distribution of sediment deposit. Ordered summary only under a cited grain-size convention; no new thresholds supplied. Mixed distributions can overlap classes or require authority classification. blocked: standard and distribution quality not selected.

Unknown, unmeasured and disputed are evidence states. They do not themselves license attributes, realms or identity classes. No thresholds, disjointness or exhaustiveness are invented.

## Coverage and iteration ledger

Counts: {'subject': 5, 'process': 4, 'relationship': 2, 'event': 3}. Fifteen questions; 8 explicitly retain gaps. No candidate was added solely to fill five/category. Incidence and unused candidates are in dossier.json; unused entries require usefulness review, not automatic deletion.

The first mapping exposed the upstream issues below. They remain unresolved; the vocabulary was not declared valid by circularly narrowing the questions. Models for explanations and runtime consequences for changes remain separate from vocabulary gaps.

- UPSTREAM-MATERIAL: all five new body paths depend on absent physical:MaterialBody.
- EARTH-REGION: current Region prose is volumetric while inherited identity is Areal; shared geographical bearer decision is blocking for hydrology.
- EARTH-ELEVATION: relative vertical quality must identify reference; Erosion supplies change separately, never hidden in Elevation model.
- EARTH-PLACEMENT: geological processes/events may migrate to geology; no mutual earth/geology imports allowed.
- EARTH-PROVENANCE: DepositDerivedFrom is many-source scientifically although each relationship observation has one source/target pair; require occurrence/evidence, not adjacency.
- EARTH-WATER: body/place/material meanings in existing WaterBody/Reach not resolved; water classes not copied blindly.

## Negative cases and review gate

earth:SedimentDeposit linking earth:RockBody to earth:RockBody deliberately treats a subject as relationship. Replacing Erosion by a changed elevation datum is a scientific negative even if both are syntactically expressible.

This is a semantic negative expectation, not a claim that the current parser rejects it. An actual syntax negative control must be run by the parent against the current grammar. Null expressions are gaps, not successful tests.

Decide shared body/place distinction before extending hydrology. Ask geoscientists whether earth keeps transformations or delegates them to geology. Seek independent probes for subsidence, chemical weathering without removal, and sediment consolidation. Source evidence is weighted toward USGS introductory material and Mojave examples, not balanced global field coverage.

Human source review, ontology category/ancestry review and exact artifact approval are separate gates. Ready-for-review means these exact dossier files, QUESTIONS_FIRST provenance hash and imported revision are available, not ready-to-apply. Blocking gaps must be closed or candidates explicitly excluded. Extension ideas for workflow stages are source-review outcomes, question-semantic test coverage, ambiguity decisions and approved revision/artifact hashes; the existing proposal schema is unchanged.

At an occurrent-driven transition resolve change in relevant qualities separately. No reading means unknown, not zero change. Cessation requires an occurrence. No process, role or configuration consequences are executed here.
