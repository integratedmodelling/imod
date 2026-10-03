# infrastructure: domain bootstrap dossier

> Draft research evidence and semantic design. No candidate declaration is executable or approved. Read QUESTIONS_FIRST.md for the preserved source-led question order.

Built physical assets that support delivery, shelter and access; distinguish the asset, delivered service, operator and network configuration.

## What the evidence supports, and what this dossier proposes

Infrastructure:Artifact is a real imported candidate parent for engineering, but infrastructure's own subjects derive from imod:Subject rather than self-import. Asset identity and service continuity are orthogonal. ContainsComponent needs a reviewed component parent upstream; using imod:Subject gives only a broad endpoint constraint. SuppliesAsset's tank-to-tank probe is deliberately narrow and does not pretend to cover all delivery endpoints. A network is a configuration, not a fifth asset invented for quota. Functional dependency is contingent, unlike physical connection. Do not retain decision import merely because the historical infrastructure header has it.

Telecommunications, sanitation, transport modes other than roads, and housing occupancy rights lack source depth. NIST supports dependencies but does not itself validate the proposed five relation intensions.

The linked sources establish disciplinary examples and distinctions. All named candidate intensions, endpoints, parent choices and test cases below are author proposals for review, not quotations or an assertion that the source authors endorsed this ontology. Primary-source confidence and scientific validity are separate from grammar acceptance. No domain experts have been interviewed.

## Sources and scope

- **NIST** [Community Resilience Planning Guide](https://www.nist.gov/community-resilience/planning-guide). Volume II description; buildings/infrastructure dependencies. Community function and infrastructure performance; not universal causal laws. Retrieved 2026-10-03; limited primary-source screening.
- **DOE** [Electric Transmission & Distribution and Protective Measures](https://www.energy.gov/sites/default/files/2023-11/FINAL_CESER%20Electricity%20Grid%20Backgrounder_508.pdf). 2023; Substations and Distribution. Electric delivery equipment and connections; US context, not all infrastructure. Retrieved 2026-10-03; limited primary-source screening.
- **EPA** [Drinking Water Distribution System Tools and Resources](https://www.epa.gov/dwreginfo/drinking-water-distribution-system-tools-and-resources). Distribution, storage, pressure and main breaks. Water assets and operational concerns; not engineering thresholds. Retrieved 2026-10-03; limited primary-source screening.
- **FHWA** [Bridge Preservation Guide](https://www.fhwa.dot.gov/bridge/preservation/guide/guide.pdf). Maintenance, rehabilitation and replacement definitions. Bridge-specific lifecycle distinctions; not generic asset health scale. Retrieved 2026-10-03; limited primary-source screening.

## Source-led questions and extracted observables

### infrastructure-q01: Which buildings could shelter people displaced by a wildfire?

Source: NIST. Preserved source-question order 1; no independent holdout claim.

**Expression gap:** shelter suitability needs occupancy purpose, access and capacity; a building count cannot answer. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: an identified school building. Negative boundary: a school organisation.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### infrastructure-q02: Which roads provide a usable route to the evacuation centre?

Source: NIST. Preserved source-question order 2; no independent holdout claim.

**Expression gap:** routing over physical connections plus operational restrictions; no generic route engine. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: paved section between two junctions. Negative boundary: an itinerary.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### infrastructure-q03: Which bridge is restricting emergency vehicle access?

Source: FHWA. Preserved source-question order 3; no independent holdout claim.

**Expression gap:** load and vehicle compatibility plus access relation. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: one identified river crossing. Negative boundary: a statistical bridge inventory record.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### infrastructure-q04: Which water tanks still hold usable firefighting water?

Source: EPA. Preserved source-question order 4; no independent holdout claim.

Draft expression: `infrastructure:StoredWaterVolume of infrastructure:WaterStorageTank`. Expected category: subject.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: finished-water tank. Negative boundary: natural lake.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### infrastructure-q05: Which substations feed the neighbourhood that lost power?

Source: DOE. Preserved source-question order 5; no independent holdout claim.

**Expression gap:** directed electrical topology and actual operating configuration. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: identified distribution substation. Negative boundary: the entire electricity market.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### infrastructure-q06: Where is a water main losing water?

Source: EPA. Preserved source-question order 6; no independent holdout claim.

Draft expression: `infrastructure:WaterLeakage`. Expected category: process.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: escape through a cracked main. Negative boundary: authorised delivery at a tap.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### infrastructure-q07: How much delivery capacity remains after a damaged pump is isolated?

Source: EPA. Preserved source-question order 7; no independent holdout claim.

**Expression gap:** operating system calculation; asset name and nominal rating insufficient. Expected hidden category: quality.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: A value observed for the named bearer and stated convention.. Negative boundary: An unqualified score, missing observation or value from another bearer treated as equivalent..
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### infrastructure-q08: Which customers depend on one upstream electricity supply?

Source: DOE. Preserved source-question order 8; no independent holdout claim.

**Expression gap:** dependency graph and redundancy; not proximity. Expected hidden category: relationship.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: transfer from upper to lower tank. Negative boundary: mere physical connection with valve shut.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### infrastructure-q09: Has a bridge's load-bearing condition changed during the fire?

Source: FHWA. Preserved source-question order 9; no independent holdout claim.

Draft expression: `change in infrastructure:StructuralCondition of infrastructure:Bridge`. Expected category: process (unary change); requires parser and active type validation.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: A value observed for the named bearer and stated convention.. Negative boundary: An unqualified score, missing observation or value from another bearer treated as equivalent..
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### infrastructure-q10: Was the interruption caused by damage or by a deliberate shutdown?

Source: NIST. Preserved source-question order 10; no independent holdout claim.

**Expression gap:** event attribution needs operational records; interruption alone does not identify cause. Expected hidden category: event.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: recorded neighbourhood outage. Negative boundary: permanent absence of a service never supplied.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### infrastructure-q11: Which repairs restored the water connection to the clinic?

Source: EPA. Preserved source-question order 11; no independent holdout claim.

**Expression gap:** physical connection plus clinic functional dependency and intervention records. Expected hidden category: event.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: power restored after feeder repair. Negative boundary: forecast restoration date.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### infrastructure-q12: Did replacement create a new bridge or repair the existing one?

Source: FHWA. Preserved source-question order 12; no independent holdout claim.

Draft expression: `infrastructure:AssetReplacement`. Expected category: event.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: old bridge replaced with new structure. Negative boundary: repainting the existing bridge.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### infrastructure-q13: Which asset supplies this water tank?

Source: EPA. Preserved source-question order 13; no independent holdout claim.

Draft expression: `infrastructure:SuppliesAsset linking infrastructure:WaterStorageTank to infrastructure:WaterStorageTank`. Expected category: relationship.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: transfer from upper to lower tank. Negative boundary: mere physical connection with valve shut.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### infrastructure-q14: Which road section physically connects to this bridge?

Source: NIST. Preserved source-question order 14; no independent holdout claim.

Draft expression: `infrastructure:ConnectsAsset linking infrastructure:RoadSegment to infrastructure:Bridge`. Expected category: relationship.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: road meeting a bridge deck. Negative boundary: two nearby roads with no junction.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### infrastructure-q15: Would a working substation alone ensure recovery of the community?

Source: NIST. Preserved source-question order 15; no independent holdout claim.

**Expression gap:** invalid sufficiency inference; other lifelines/social needs required. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: identified distribution substation. Negative boundary: the entire electricity market.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

## Candidate register

Every parent below names an existing imported root/domain declaration. Its presence is verified; its scientific adequacy is proposed, not validated. Local candidate references are not installed declarations. Types follow the context-pack observational perspective; records with unresolved unity, institutional or endpoint meaning remain blocked.

### infrastructure:Building — subject (provisional)

An individually bounded constructed enclosure; identity follows the physical structure, not its occupants.
Proposed imported parent: `imod:Subject`. Evidence: NIST.
Positive: an identified school building. Negative: a school organisation.
Bearer qualities: `infrastructure:FloorArea`.

Question incidence: infrastructure-q01.

### infrastructure:RoadSegment — subject (provisional)

A physical roadway section with stated junction boundaries.
Proposed imported parent: `imod:Subject`. Evidence: NIST.
Positive: paved section between two junctions. Negative: an itinerary.
Bearer qualities: `infrastructure:StructuralCondition`.

Question incidence: infrastructure-q02, infrastructure-q14.

### infrastructure:Bridge — subject (provisional)

An individual constructed crossing carrying a specified route over an obstacle.
Proposed imported parent: `imod:Subject`. Evidence: FHWA.
Positive: one identified river crossing. Negative: a statistical bridge inventory record.
Bearer qualities: `infrastructure:StructuralCondition`.

Question incidence: infrastructure-q03, infrastructure-q09, infrastructure-q14.

### infrastructure:WaterStorageTank — subject (provisional)

A constructed bounded vessel storing water in a distribution system.
Proposed imported parent: `imod:Subject`. Evidence: EPA.
Positive: finished-water tank. Negative: natural lake.
Bearer qualities: `infrastructure:StoredWaterVolume`.

Question incidence: infrastructure-q04, infrastructure-q13.

### infrastructure:ElectricalSubstation — subject (provisional)

A bounded electrical installation with switching or voltage transformation functions.
Proposed imported parent: `imod:Subject`. Evidence: DOE.
Positive: identified distribution substation. Negative: the entire electricity market.
Bearer qualities: `infrastructure:DeliveryCapacity`.

Question incidence: infrastructure-q05, infrastructure-q15.

### infrastructure:WaterLeakage — process (provisional)

Water escaping a distribution asset through an unintended opening.
Proposed imported parent: `imod:Process`. Evidence: EPA.
Positive: escape through a cracked main. Negative: authorised delivery at a tap.
Relevant quality parameters (no equations): `infrastructure:LeakageRate`, `infrastructure:InternalPressure`.
Proposed affects: infrastructure:StoredWaterVolume; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: infrastructure-q06.

### infrastructure:WaterConveyance — process (provisional)

Water movement through a specified delivery asset.
Proposed imported parent: `imod:Process`. Evidence: EPA.
Positive: flow through an operating supply pipe. Negative: water merely standing in a tank.
Relevant quality parameters (no equations): `infrastructure:InternalPressure`, `infrastructure:DeliveryCapacity`.
Proposed affects: infrastructure:StoredWaterVolume; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:ElectricityDelivery — process (provisional)

Electrical energy transfer through a specified operated installation.
Proposed imported parent: `imod:Process`. Evidence: DOE.
Positive: supply through an energised feeder. Negative: an installed but isolated feeder.
Relevant quality parameters (no equations): `infrastructure:DeliveryCapacity`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:AssetDeterioration — process (provisional)

Progressive loss of a specified physical performance property.
Proposed imported parent: `imod:Process`. Evidence: FHWA.
Positive: bridge element losing section. Negative: change in an inspector's label alone.
Relevant quality parameters (no equations): `infrastructure:StructuralCondition`.
Proposed affects: infrastructure:StructuralCondition; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:AssetRepair — process (provisional)

Work altering a damaged asset to restore a stated physical function.
Proposed imported parent: `imod:Process`. Evidence: FHWA.
Positive: repair of damaged bridge bearing. Negative: administrative approval of future work.
Relevant quality parameters (no equations): `infrastructure:StructuralCondition`, `infrastructure:DeliveryCapacity`.
Proposed affects: infrastructure:StructuralCondition; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:ConnectsAsset — relationship (provisional)

Physical connection between two distinct built assets; operability separate.
Proposed imported parent: `imod:Relationship`. Evidence: NIST.
Positive: road meeting a bridge deck. Negative: two nearby roads with no junction.

Endpoints: `infrastructure:RoadSegment` → `infrastructure:Bridge`; structural.
Question incidence: infrastructure-q14.

### infrastructure:SuppliesAsset — relationship (provisional)

Directed actual delivery from one asset to another for a named service.
Proposed imported parent: `imod:Relationship`. Evidence: EPA.
Positive: transfer from upper to lower tank. Negative: mere physical connection with valve shut.

Endpoints: `infrastructure:WaterStorageTank` → `infrastructure:WaterStorageTank`; functional.
Question incidence: infrastructure-q08, infrastructure-q13.

### infrastructure:ContainsComponent — relationship (blocked)

Physical whole-to-component membership at declared decomposition.
Proposed imported parent: `imod:Relationship`. Evidence: DOE.
Positive: substation containing a transformer. Negative: utility company owning the station.

Endpoints: `infrastructure:ElectricalSubstation` → `imod:Subject`; structural.
Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:ServesBuilding — relationship (provisional)

Asset delivering a stated service to a building in context.
Proposed imported parent: `imod:Relationship`. Evidence: EPA.
Positive: tank supplying a hospital building. Negative: tank closer to hospital but disconnected.

Endpoints: `infrastructure:WaterStorageTank` → `infrastructure:Building`; functional.
Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:DependsOnAsset — relationship (blocked)

Operational asset dependency for a named function under a stated contingency.
Proposed imported parent: `imod:Relationship`. Evidence: NIST.
Positive: pumped delivery dependent on power. Negative: gravity-fed delivery assumed power-dependent.

Endpoints: `infrastructure:WaterStorageTank` → `infrastructure:ElectricalSubstation`; functional.
Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:ServiceInterruption — event (provisional)

Bounded episode from loss to restoration of one named delivery function.
Proposed imported parent: `imod:Event`. Evidence: NIST.
Positive: recorded neighbourhood outage. Negative: permanent absence of a service never supplied.
Relevant quality parameters (no equations): `infrastructure:DeliveryCapacity`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: infrastructure-q10.

### infrastructure:MainBreak — event (provisional)

Bounded pipe rupture episode involving a specified distribution asset.
Proposed imported parent: `imod:Event`. Evidence: EPA.
Positive: identified water main rupture. Negative: routine valve opening.
Relevant quality parameters (no equations): `infrastructure:LeakageRate`, `infrastructure:DeliveryCapacity`.
Proposed affects: infrastructure:DeliveryCapacity; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:ServiceRestoration — event (provisional)

Bounded intervention episode ending when a stated function resumes.
Proposed imported parent: `imod:Event`. Evidence: NIST.
Positive: power restored after feeder repair. Negative: forecast restoration date.
Relevant quality parameters (no equations): `infrastructure:DeliveryCapacity`.
Proposed affects: infrastructure:DeliveryCapacity; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: infrastructure-q11.

### infrastructure:AssetReplacement — event (provisional)

Bounded removal-and-installation episode with separately identified old and new assets.
Proposed imported parent: `imod:Event`. Evidence: FHWA.
Positive: old bridge replaced with new structure. Negative: repainting the existing bridge.
Relevant quality parameters (no equations): `infrastructure:StructuralCondition`.
Proposed affects: none asserted; creates: infrastructure:Bridge; confers: none asserted. Bridge-specific replacement example: new bridge identity may be created; generic replacement requires the actual old/new types. End of old identity requires an explicit removal/destruction occurrent, not automatic forgetting.
Question incidence: infrastructure-q12.

### infrastructure:BridgeRepairEpisode — event (provisional)

Bounded bridge repair operation with start/end work criteria.
Proposed imported parent: `imod:Event`. Evidence: FHWA.
Positive: bearing repair work completed. Negative: ongoing generic repair capability.
Relevant quality parameters (no equations): `infrastructure:StructuralCondition`.
Proposed affects: infrastructure:StructuralCondition; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:FloorArea — quality (provisional)

Area of the declared building floor surfaces; gross/net convention must be supplied.
Proposed imported parent: `imod:Area`. Evidence: NIST.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `infrastructure:Building`. Parameter of: none recorded. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:StructuralCondition — quality (provisional)

Observed physical condition of a specified asset element, with defects and assessment scheme explicit.
Proposed imported parent: `imod:Quality`. Evidence: NIST, FHWA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `infrastructure:RoadSegment`, `infrastructure:Bridge`. Parameter of: `infrastructure:AssetDeterioration`, `infrastructure:AssetRepair`, `infrastructure:AssetReplacement`, `infrastructure:BridgeRepairEpisode`. Affected by: `infrastructure:AssetDeterioration`, `infrastructure:AssetRepair`, `infrastructure:BridgeRepairEpisode`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: infrastructure-q09.

### infrastructure:StoredWaterVolume — quality (provisional)

Water volume within one identified tank, distinct from usable fire reserve.
Proposed imported parent: `imod:Volume`. Evidence: EPA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `infrastructure:WaterStorageTank`. Parameter of: none recorded. Affected by: `infrastructure:WaterLeakage`, `infrastructure:WaterConveyance`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: infrastructure-q04.

### infrastructure:DeliveryCapacity — quality (provisional)

Deliverable amount per stated service interval and operating conditions; actual and rated capacity separate.
Proposed imported parent: `imod:Quality`. Evidence: DOE, EPA, FHWA, NIST.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `infrastructure:ElectricalSubstation`. Parameter of: `infrastructure:WaterConveyance`, `infrastructure:ElectricityDelivery`, `infrastructure:AssetRepair`, `infrastructure:ServiceInterruption`, `infrastructure:MainBreak`, `infrastructure:ServiceRestoration`. Affected by: `infrastructure:MainBreak`, `infrastructure:ServiceRestoration`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: infrastructure-q07.

### infrastructure:LeakageRate — quality (provisional)

Rate of unintended water escape at a specified opening or asset boundary.
Proposed imported parent: `imod:Quality`. Evidence: EPA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `infrastructure:WaterLeakage`, `infrastructure:MainBreak`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### infrastructure:InternalPressure — quality (provisional)

Fluid pressure inside a specified asset and reference frame.
Proposed imported parent: `imod:Quality`. Evidence: EPA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `infrastructure:WaterLeakage`, `infrastructure:WaterConveyance`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

## Quality summaries, not unexplained labels

- **condition grade** summarises `infrastructure:StructuralCondition`: Ordered only within a named inspection scheme and asset component; evidence of defects is the basis, no universal good/fair thresholds. Status: provisional_no_predicate_declaration.
- **operational / restricted** summarises `infrastructure:DeliveryCapacity`: Nominal service-specific comparison against stated demand or permitted operation; a restriction is not necessarily physical damage. Status: provisional_no_predicate_declaration.
- **adequate fire reserve** summarises `infrastructure:StoredWaterVolume`: Contextual range against an explicitly supplied fire-service requirement; no threshold invented. Status: provisional_no_predicate_declaration.

Evidence states such as unknown, unmeasured and disputed are not new predicates. No thresholds were invented, and no listed scheme is an exhaustive classification of the world.

## Dependency and review gates

Proposed import order is root imod → infrastructure. Cross-domain source examples are not reverse ontology imports. Missing meanings generate upstream issues instead of local workarounds.

Before review-ready: settle blocking identity and parent choices; obtain fresh source-first probes from a reviewer who has not seen candidate vocabulary; prune unused candidates; compare authority scopes and preserve dissent; freeze exact artifact/import revisions; parse expressions and declarations separately; run adaptation and loaded semantic validation; obtain human scientific and ontology review. A syntax pass cannot approve a source interpretation.

Suggested stage attachments remain proposals for backend discussion: source-review ledger, question-semantic result matrix, ambiguity decisions, exact tested artifact hashes and approval bindings to revision/action/base. They are not a replacement for context-pack 1.3 proposal schema or a new API contract.

All change and cessation require occurrents. Changes in qualities are separately resolved at context transitions; unresolved changes remain open-world unknown. Implication/detection are syntax-only. No process-to-role-to-configuration runtime was built. Jargon, if approved later, belongs in alias-only equals modules; tier policy remains unresolved.

## Current checks and coverage

Recorded counts: {"subject":5,"process":5,"relationship":5,"event":5,"quality":6}; 15 narrative questions. 6 draft expressions, 9 explicit gaps.

JSON and incidence are locally checkable. Actual parser results will be supplied by the parent validation runner; this dossier does not claim a pass. No subject/process/relationship/event list is approved simply because it reaches five. Every unused candidate remains exposed in dossier.json coverage.
