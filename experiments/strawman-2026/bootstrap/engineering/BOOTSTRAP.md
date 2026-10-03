# engineering: domain bootstrap dossier

> Draft research evidence and semantic design. No candidate declaration is executable or approved. Read QUESTIONS_FIRST.md for the preserved source-led question order.

Physical engineered products, their transformations and bounded realisation or failure episodes; design software, verification reports, equations and workflow machinery excluded.

## What the evidence supports, and what this dossier proposes

All five device subjects propose infrastructure:Artifact, which is present but has unresolved goal/intentionality comments. They are illustrative specialisations, possibly Tier-2 rather than common engineering Tier-1; do not promote the list wholesale. Broad current root parents allow candidate categorisation but do not settle a coherent engineering gateway. CorrosionDamage requires chemistry/material articulation; mechanical deformation/fracture need physics sources before expansion. Requirements and test records are outside physical domain articulation. AcceptanceTestEpisode means physical episode, never epistemic evidence validity.

NASA process terminology is management-heavy. Physical manufacturing, fatigue, fracture and thermal engineering are insufficiently researched. Five narrow device examples do not demonstrate disciplinary coverage.

The linked sources establish disciplinary examples and distinctions. All named candidate intensions, endpoints, parent choices and test cases below are author proposals for review, not quotations or an assertion that the source authors endorsed this ontology. Primary-source confidence and scientific validity are separate from grammar acceptance. No domain experts have been interviewed.

## Sources and scope

- **NASA** [Systems Engineering Handbook](https://www.nasa.gov/reference/systems-engineering-handbook/). 2024 web edition; section 5 Product Realization. Product integration, verification/validation distinctions and lifecycle; aerospace scope. Retrieved 2026-10-03; limited primary-source screening.
- **FHWA** [Bridge Preservation Guide](https://www.fhwa.dot.gov/bridge/preservation/guide/guide.pdf). Preservation, rehabilitation, replacement. Maintenance versus new-product identity; bridge scope. Retrieved 2026-10-03; limited primary-source screening.
- **DOE** [Electric Transmission & Distribution and Protective Measures](https://www.energy.gov/sites/default/files/2023-11/FINAL_CESER%20Electricity%20Grid%20Backgrounder_508.pdf). Substation equipment. Transformer, switch and protective equipment examples. Retrieved 2026-10-03; limited primary-source screening.
- **EPA** [Drinking Water Distribution System Tools and Resources](https://www.epa.gov/dwreginfo/drinking-water-distribution-system-tools-and-resources). Pumps, valves and corrosion. Water component examples and degradation concerns. Retrieved 2026-10-03; limited primary-source screening.

## Source-led questions and extracted observables

### engineering-q01: Which pump can deliver water against the pressure required at the fire ground?

Source: EPA. Preserved source-question order 1; no independent holdout claim.

**Expression gap:** pump performance relation and specified duty; nominal capacity alone insufficient. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: identified water pump. Negative boundary: a pumping schedule.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### engineering-q02: Which valve isolates the damaged pipe without cutting off the clinic?

Source: EPA. Preserved source-question order 2; no independent holdout claim.

**Expression gap:** topology and valve state intervention model. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: one installed isolation valve. Negative boundary: administrative water allocation rule.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### engineering-q03: Which transformer changed the supply voltage?

Source: DOE. Preserved source-question order 3; no independent holdout claim.

Draft expression: `engineering:Transformer`. Expected category: subject.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: identified substation transformer. Negative boundary: a voltage conversion formula.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### engineering-q04: Which circuit breaker interrupted current during the fault?

Source: DOE. Preserved source-question order 4; no independent holdout claim.

**Expression gap:** device participation in a bounded switching episode. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: installed feeder breaker. Negative boundary: a software alert alone.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### engineering-q05: Which bridge bearing is transferring the deck's load?

Source: FHWA. Preserved source-question order 5; no independent holdout claim.

Draft expression: `engineering:TransfersLoad`. Expected category: subject.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: bridge support bearing. Negative boundary: a compass bearing.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### engineering-q06: Has the repaired component recovered its required load capacity?

Source: FHWA. Preserved source-question order 6; no independent holdout claim.

Draft expression: `engineering:LoadCapacity of engineering:Bearing`. Expected category: quality.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: A value observed for the named bearer and stated convention.. Negative boundary: An unqualified score, missing observation or value from another bearer treated as equivalent..
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### engineering-q07: Did the test demonstrate specified performance or suitability for the intended use?

Source: NASA. Preserved source-question order 7; no independent holdout claim.

**Expression gap:** verification versus validation evidence; not a new physical property. Expected hidden category: event.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: one controlled loading test. Negative boundary: a generic testing method.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### engineering-q08: Which connected parts are joined into this assembly?

Source: NASA. Preserved source-question order 8; no independent holdout claim.

Draft expression: `engineering:JoinsComponent linking engineering:Bearing to imod:Subject`. Expected category: relationship.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: bearing attached to support. Negative boundary: two components listed together but unconnected.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### engineering-q09: What changed when the valve was opened?

Source: EPA. Preserved source-question order 9; no independent holdout claim.

Draft expression: `change in engineering:OpeningFraction of engineering:Valve`. Expected category: process (unary change); requires parser and active type validation.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: turning a valve toward closed. Negative boundary: changing only the displayed command.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### engineering-q10: Did corrosion reduce the component's remaining section?

Source: EPA. Preserved source-question order 10; no independent holdout claim.

**Expression gap:** chemistry process plus material and geometry qualities. Expected hidden category: process.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: measurable metal loss. Negative boundary: surface staining without established loss.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### engineering-q11: Was the product replaced or only one component repaired?

Source: FHWA. Preserved source-question order 11; no independent holdout claim.

Draft expression: `engineering:ComponentReplacement`. Expected category: event.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: replacement of a bearing. Negative boundary: adjustment of existing bearing.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### engineering-q12: Which pump overheated during operation?

Source: EPA. Preserved source-question order 12; no independent holdout claim.

Draft expression: `engineering:OperatingTemperature of engineering:Pump`. Expected category: subject.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: identified water pump. Negative boundary: a pumping schedule.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### engineering-q13: Can the same intact component fail the intended service without breaking?

Source: NASA. Preserved source-question order 13; no independent holdout claim.

**Expression gap:** mismatch of requirement and delivered function, not fracture entailment. Expected hidden category: event.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: pump stops delivering during a duty episode. Negative boundary: product lacks a function never required.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### engineering-q14: Which assembly operation produced this unit?

Source: NASA. Preserved source-question order 14; no independent holdout claim.

Draft expression: `engineering:ProductAssembly`. Expected category: process.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: physical assembly of pump components. Negative boundary: editing a bill of materials.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### engineering-q15: Does a passed inspection guarantee safe operation under every wildfire exposure?

Source: NASA. Preserved source-question order 15; no independent holdout claim.

**Expression gap:** invalid generalisation beyond tested envelope. Expected hidden category: event.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: one controlled loading test. Negative boundary: a generic testing method.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

## Candidate register

Every parent below names an existing imported root/domain declaration. Its presence is verified; its scientific adequacy is proposed, not validated. Local candidate references are not installed declarations. Types follow the context-pack observational perspective; records with unresolved unity, institutional or endpoint meaning remain blocked.

### engineering:Pump — subject (provisional)

A bounded manufactured device that transfers energy to move fluid.
Proposed imported parent: `infrastructure:Artifact`. Evidence: EPA.
Positive: identified water pump. Negative: a pumping schedule.
Bearer qualities: `engineering:DeliveryCapacity`, `engineering:OperatingTemperature`.

Question incidence: engineering-q01, engineering-q12.

### engineering:Valve — subject (provisional)

A bounded manufactured flow-control device.
Proposed imported parent: `infrastructure:Artifact`. Evidence: EPA.
Positive: one installed isolation valve. Negative: administrative water allocation rule.
Bearer qualities: `engineering:OpeningFraction`.

Question incidence: engineering-q02, engineering-q09.

### engineering:Transformer — subject (provisional)

An individual electromagnetic electrical device used to alter alternating voltage.
Proposed imported parent: `infrastructure:Artifact`. Evidence: DOE.
Positive: identified substation transformer. Negative: a voltage conversion formula.
Bearer qualities: `engineering:VoltageRatio`, `engineering:OperatingTemperature`.

Question incidence: engineering-q03.

### engineering:CircuitBreaker — subject (provisional)

A bounded protective switching device capable of interrupting electrical current.
Proposed imported parent: `infrastructure:Artifact`. Evidence: DOE.
Positive: installed feeder breaker. Negative: a software alert alone.
Bearer qualities: `engineering:BreakingCapacity`.

Question incidence: engineering-q04.

### engineering:Bearing — subject (provisional)

A manufactured load-transmitting support component with identity in an assembly.
Proposed imported parent: `infrastructure:Artifact`. Evidence: FHWA.
Positive: bridge support bearing. Negative: a compass bearing.
Bearer qualities: `engineering:LoadCapacity`.

Question incidence: engineering-q05, engineering-q06, engineering-q08.

### engineering:ProductAssembly — process (provisional)

Joining separately identified components into a physical product.
Proposed imported parent: `imod:Process`. Evidence: NASA.
Positive: physical assembly of pump components. Negative: editing a bill of materials.
Relevant quality parameters (no equations): `engineering:AlignmentDeviation`.
Proposed affects: none asserted; creates: infrastructure:Artifact; confers: none asserted. Assembly can produce a bounded artifact if unity/identity criteria are met; merely collecting parts or updating a document does not create a product.
Question incidence: engineering-q14.

### engineering:ValveActuation — process (provisional)

Movement of a valve closure element altering its opening.
Proposed imported parent: `imod:Process`. Evidence: EPA.
Positive: turning a valve toward closed. Negative: changing only the displayed command.
Relevant quality parameters (no equations): `engineering:OpeningFraction`.
Proposed affects: engineering:OpeningFraction; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: engineering-q09.

### engineering:ElectricalSwitching — process (provisional)

Physical change of a conductive connection by switch operation.
Proposed imported parent: `imod:Process`. Evidence: DOE.
Positive: breaker contacts separating. Negative: a predicted switch operation.
Relevant quality parameters (no equations): `engineering:ContactResistance`.
Proposed affects: engineering:ContactResistance; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:ComponentRepair — process (provisional)

Material intervention on an existing component restoring a stated function.
Proposed imported parent: `imod:Process`. Evidence: FHWA.
Positive: repair retaining component identity. Negative: replacement with a new component.
Relevant quality parameters (no equations): `engineering:LoadCapacity`, `engineering:AlignmentDeviation`.
Proposed affects: engineering:LoadCapacity; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:CorrosionDamage — process (blocked)

Material degradation through a corrosion process in an engineered component.
Proposed imported parent: `imod:Process`. Evidence: EPA.
Positive: measurable metal loss. Negative: surface staining without established loss.
Relevant quality parameters (no equations): `engineering:RemainingSection`.
Proposed affects: engineering:RemainingSection; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: engineering-q10.

### engineering:JoinsComponent — relationship (provisional)

Directed connection from one component to another at an identified physical interface.
Proposed imported parent: `imod:Relationship`. Evidence: NASA.
Positive: bearing attached to support. Negative: two components listed together but unconnected.

Endpoints: `engineering:Bearing` → `imod:Subject`; structural.
Question incidence: engineering-q08.

### engineering:TransfersLoad — relationship (provisional)

Directed mechanical transmission between source and receiving components.
Proposed imported parent: `imod:Relationship`. Evidence: FHWA.
Positive: bearing transmitting load to pier. Negative: co-location without load path.

Endpoints: `engineering:Bearing` → `imod:Subject`; functional.
Question incidence: engineering-q05.

### engineering:ControlsFlow — relationship (blocked)

Valve-to-conduit functional relationship under stated fluid service.
Proposed imported parent: `imod:Relationship`. Evidence: EPA.
Positive: valve regulating connected pipe flow. Negative: remote valve in unrelated pipe.

Endpoints: `engineering:Valve` → `imod:Subject`; functional.
Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:TransformsSupply — relationship (blocked)

Transformer-to-receiving-installation functional connection.
Proposed imported parent: `imod:Relationship`. Evidence: DOE.
Positive: transformer supplying downstream bus. Negative: unused spare transformer nearby.

Endpoints: `engineering:Transformer` → `imod:Subject`; functional.
Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:ProtectsCircuit — relationship (blocked)

Breaker-to-circuit protective arrangement within a specified duty envelope.
Proposed imported parent: `imod:Relationship`. Evidence: DOE.
Positive: breaker protecting its assigned feeder. Negative: claim of protection against every hazard.

Endpoints: `engineering:CircuitBreaker` → `imod:Subject`; functional.
Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:AcceptanceTestEpisode — event (provisional)

A bounded physical test of a product against stated criteria; record/report separate.
Proposed imported parent: `imod:Event`. Evidence: NASA.
Positive: one controlled loading test. Negative: a generic testing method.
Relevant quality parameters (no equations): `engineering:LoadCapacity`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: engineering-q07, engineering-q15.

### engineering:ComponentReplacement — event (provisional)

Bounded substitution of a separately identified new component for an old one.
Proposed imported parent: `imod:Event`. Evidence: FHWA.
Positive: replacement of a bearing. Negative: adjustment of existing bearing.
Relevant quality parameters (no equations): `engineering:AlignmentDeviation`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: engineering-q11.

### engineering:BreakerTrip — event (provisional)

Bounded opening episode of a protective circuit breaker.
Proposed imported parent: `imod:Event`. Evidence: DOE.
Positive: recorded trip operation. Negative: permanently open contact with no episode.
Relevant quality parameters (no equations): `engineering:ContactResistance`.
Proposed affects: engineering:ContactResistance; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:FunctionalFailureEpisode — event (blocked)

Bounded episode of failure to deliver a specified function under a stated demand.
Proposed imported parent: `imod:Event`. Evidence: NASA.
Positive: pump stops delivering during a duty episode. Negative: product lacks a function never required.
Relevant quality parameters (no equations): `engineering:DeliveryCapacity`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: engineering-q13.

### engineering:RepairCompletionEpisode — event (provisional)

Bounded final physical repair operation whose completion is observed, not only signed off.
Proposed imported parent: `imod:Event`. Evidence: FHWA.
Positive: completion of structural bearing repair. Negative: certificate issuance without intervention.
Relevant quality parameters (no equations): `engineering:LoadCapacity`.
Proposed affects: engineering:LoadCapacity; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:DeliveryCapacity — quality (provisional)

Deliverable amount per stated service interval and operating conditions; actual and rated capacity separate.
Proposed imported parent: `imod:Quality`. Evidence: EPA, NASA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `engineering:Pump`. Parameter of: `engineering:FunctionalFailureEpisode`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:OperatingTemperature — quality (provisional)

Temperature of a named device component during stated operating conditions.
Proposed imported parent: `imod:Temperature`. Evidence: EPA, DOE.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `engineering:Pump`, `engineering:Transformer`. Parameter of: none recorded. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: engineering-q12.

### engineering:OpeningFraction — quality (provisional)

Geometric fraction of valve opening under its declared design convention.
Proposed imported parent: `imod:Proportion`. Evidence: EPA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `engineering:Valve`. Parameter of: `engineering:ValveActuation`. Affected by: `engineering:ValveActuation`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: engineering-q09.

### engineering:VoltageRatio — quality (provisional)

Ratio of specified terminal voltages under stated operating conditions.
Proposed imported parent: `imod:Quality`. Evidence: DOE.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `engineering:Transformer`. Parameter of: none recorded. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:BreakingCapacity — quality (blocked)

Current-interruption capability at stated electrical duty; threshold/design conditions mandatory.
Proposed imported parent: `imod:Quality`. Evidence: DOE.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `engineering:CircuitBreaker`. Parameter of: none recorded. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:LoadCapacity — quality (blocked)

Load a specified component can sustain within a declared limit state and loading mode.
Proposed imported parent: `imod:Quality`. Evidence: FHWA, NASA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `engineering:Bearing`. Parameter of: `engineering:ComponentRepair`, `engineering:AcceptanceTestEpisode`, `engineering:RepairCompletionEpisode`. Affected by: `engineering:ComponentRepair`, `engineering:RepairCompletionEpisode`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: engineering-q06.

### engineering:AlignmentDeviation — quality (provisional)

Deviation of an assembled interface from specified reference alignment.
Proposed imported parent: `imod:Quality`. Evidence: NASA, FHWA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `engineering:ProductAssembly`, `engineering:ComponentRepair`, `engineering:ComponentReplacement`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:ContactResistance — quality (provisional)

Resistance across an identified electrical contact under stated measurement conditions.
Proposed imported parent: `imod:Quality`. Evidence: DOE.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `engineering:ElectricalSwitching`, `engineering:BreakerTrip`. Affected by: `engineering:ElectricalSwitching`, `engineering:BreakerTrip`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### engineering:RemainingSection — quality (provisional)

Remaining load-bearing material section at an identified cross-section.
Proposed imported parent: `imod:Quality`. Evidence: EPA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `engineering:CorrosionDamage`. Affected by: `engineering:CorrosionDamage`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

## Quality summaries, not unexplained labels

- **fit for specified duty** summarises `engineering:LoadCapacity`: Comparison with declared demand, loading mode and environment; not intrinsic universal safe/unsafe. Status: provisional_no_predicate_declaration.
- **within assembly tolerance** summarises `engineering:AlignmentDeviation`: Ordered deviation with criterion supplied by a named design; no tolerance invented. Status: provisional_no_predicate_declaration.
- **open/partly open/closed** summarises `engineering:OpeningFraction`: Named observation of closure geometry, not inferred leakage or hydraulic isolation; overlap rules depend on valve design. Status: provisional_no_predicate_declaration.

Evidence states such as unknown, unmeasured and disputed are not new predicates. No thresholds were invented, and no listed scheme is an exhaustive classification of the world.

## Dependency and review gates

Proposed import order is root imod → infrastructure → engineering. Cross-domain source examples are not reverse ontology imports. Missing meanings generate upstream issues instead of local workarounds.

Before review-ready: settle blocking identity and parent choices; obtain fresh source-first probes from a reviewer who has not seen candidate vocabulary; prune unused candidates; compare authority scopes and preserve dissent; freeze exact artifact/import revisions; parse expressions and declarations separately; run adaptation and loaded semantic validation; obtain human scientific and ontology review. A syntax pass cannot approve a source interpretation.

Suggested stage attachments remain proposals for backend discussion: source-review ledger, question-semantic result matrix, ambiguity decisions, exact tested artifact hashes and approval bindings to revision/action/base. They are not a replacement for context-pack 1.3 proposal schema or a new API contract.

All change and cessation require occurrents. Changes in qualities are separately resolved at context transitions; unresolved changes remain open-world unknown. Implication/detection are syntax-only. No process-to-role-to-configuration runtime was built. Jargon, if approved later, belongs in alias-only equals modules; tier policy remains unresolved.

## Current checks and coverage

Recorded counts: {"subject":5,"process":5,"relationship":5,"event":5,"quality":9}; 15 narrative questions. 8 draft expressions, 7 explicit gaps.

JSON and incidence are locally checkable. Actual parser results will be supplied by the parent validation runner; this dossier does not claim a pass. No subject/process/relationship/event list is approved simply because it reaches five. Every unused candidate remains exposed in dossier.json coverage.
