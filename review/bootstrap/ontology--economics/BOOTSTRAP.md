# economics: domain bootstrap dossier

> Draft research evidence and semantic design. No candidate declaration is executable or approved. Read QUESTIONS_FIRST.md for the preserved source-led question order.

Observable economic units, production/use and transfers, with explicit accounting boundaries; welfare, legal title and market institutions must not be conflated with price.

## What the evidence supports, and what this dossier proposes

The source search found SNA2025 is now adopted: SNA2008 must not be labelled current. HouseholdUnit, EnterpriseUnit and EstablishmentUnit remain blocked on agency/identity review: root Subject is a candidate structural perspective, not denial of agency. ProducedAsset may be better a role composition over an infrastructure artifact; keep this alternative open rather than duplicate economics:EconomicAsset. ControlsAsset and OwesPayment are institution-dependent: normative scope, regime, party and instrument cannot be silently erased. Compensation needs a person/employee distinction upstream; imod:Agent is only a placeholder endpoint bound. Monetary qualities propose imod:MonetaryValue, not a claim that market price measures welfare. Accounting identities/equations and models stay outside ontology.

Insufficient current SNA2025 chapter-level audit, informal/non-market activity, ecosystem accounting, finance and distribution. All institutional bindings blocked until governance/legal scope and unit identity resolved; source review is not economic consensus.

The linked sources establish disciplinary examples and distinctions. All named candidate intensions, endpoints, parent choices and test cases below are author proposals for review, not quotations or an assertion that the source authors endorsed this ontology. Primary-source confidence and scientific validity are separate from grammar acceptance. No domain experts have been interviewed.

## Sources and scope

- **SNA2025** [System of National Accounts 2025](https://unstats.un.org/unsd/nationalaccount/sna2025.asp). Adoption and scope statement, accessed 2026-10-03. Current international framework; detailed changed definitions not yet audited. Retrieved 2026-10-03; limited primary-source screening.
- **SNA2008** [System of National Accounts 2008](https://unstats.un.org/unsd/nationalaccount/docs/SNA2008.pdf). Chapters 3–6, 10–13. Historical conceptual scaffold for units, flows and assets; current-edition comparison required. Retrieved 2026-10-03; limited primary-source screening.
- **BEA** [BEA Glossary](https://www.bea.gov/index.php/help/glossary). Consumption of fixed capital, capital expenditure and transfers entries. US operational accounting usage, not a universal ontology. Retrieved 2026-10-03; limited primary-source screening.
- **GDP** [Gross domestic product](https://www.bea.gov/help/glossary/gross-domestic-product-gdp). Definition, updated 2023-08-11. Aggregate production value; does not establish wellbeing or wildfire loss. Retrieved 2026-10-03; limited primary-source screening.

## Source-led questions and extracted observables

### economics-q01: Which households lost income while businesses were closed by wildfire?

Source: SNA2008. Preserved source-question order 1; no independent holdout claim.

Draft expression: `economics:DisposableIncome of economics:HouseholdUnit`. Expected expression-result category: quality.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: identified household unit. Negative boundary: everyone living within one wildfire perimeter.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q02: Which businesses stopped producing because electricity was unavailable?

Source: SNA2008. Preserved source-question order 2; no independent holdout claim.

**Expression gap:** production interruption plus infrastructure dependency and causal attribution. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: one enterprise unit. Negative boundary: an industry aggregate.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q03: How much output did the affected plant produce before and after the fire?

Source: GDP. Preserved source-question order 3; no independent holdout claim.

Draft expression: `economics:OutputValue of economics:EstablishmentUnit`. Expected expression-result category: quality.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: observed factory production. Negative boundary: asset price appreciation alone.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### economics-q04: How much of the plant's purchases was used up in production?

Source: SNA2008. Preserved source-question order 4; no independent holdout claim.

Draft expression: `economics:IntermediateConsumption`. Expected expression-result category: process.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: fuel consumed by a plant. Negative boundary: purchase of an enduring machine.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### economics-q05: Which damaged machines remain economic assets rather than scrap?

Source: SNA2008. Preserved source-question order 5; no independent holdout claim.

**Expression gap:** benefit/control criteria plus physical condition; price alone insufficient. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: machine controlled for economic benefits. Negative boundary: every physical object irrespective of benefit/control.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q06: Did the insurance payment compensate damage or create new output?

Source: BEA. Preserved source-question order 6; no independent holdout claim.

**Expression gap:** classify the transaction under applicable accounting treatment; payment is not automatically production. Expected hidden category: relationship.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: eligible emergency cash transfer. Negative boundary: purchase of household labour.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q07: Who owes the repair contractor payment?

Source: SNA2008. Preserved source-question order 7; no independent holdout claim.

Draft expression: `economics:OwesPayment linking economics:EnterpriseUnit to economics:EnterpriseUnit`. Expected expression-result category: relationship.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: accepted contractor payable. Negative boundary: unaccepted quotation.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q08: Which workers received wages while operations were suspended?

Source: SNA2008. Preserved source-question order 8; no independent holdout claim.

**Expression gap:** worker/employee distinction upstream and observed payment. Expected hidden category: relationship.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: compensation for employment. Negative boundary: gift unrelated to employment.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q09: Did the reconstruction spending restore wealth or increase it?

Source: BEA. Preserved source-question order 9; no independent holdout claim.

**Expression gap:** opening stock, destruction and additions; spending is not net wealth change. Expected hidden category: process.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: new productive installation. Negative boundary: pure transfer of cash.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q10: Did an increase in timber price mean more timber was produced?

Source: GDP. Preserved source-question order 10; no independent holdout claim.

**Expression gap:** invalid inference; separate price and physical output. Expected hidden category: quality.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: A value observed for the named bearer and stated convention.. Negative boundary: An unqualified score, missing observation or value from another bearer treated as equivalent..
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q11: Which asset changed hands in this sale?

Source: SNA2008. Preserved source-question order 11; no independent holdout claim.

Draft expression: `economics:AssetSale`. Expected expression-result category: event.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: completed machine sale. Negative boundary: offer not accepted.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### economics-q12: Which households received emergency cash transfers?

Source: BEA. Preserved source-question order 12; no independent holdout claim.

Draft expression: `economics:TransferReceipt`. Expected expression-result category: event.

This expression is one hidden observable, not a complete query or sufficient answer to the narrative question.
Positive boundary: household receives emergency transfer. Negative boundary: announcement of future support.
Checks: grammar untested; semantic provisional; adapter, reasoner and execution untested.

### economics-q13: Was the loss due to wear during use or to sudden wildfire destruction?

Source: SNA2008. Preserved source-question order 13; no independent holdout claim.

**Expression gap:** separate consumption of fixed capital and catastrophic asset change. Expected hidden category: event.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: machine destroyed by wildfire. Negative boundary: market repricing without physical destruction.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q14: Are unpaid household care and purchased care counted in the same production boundary?

Source: SNA2025. Preserved source-question order 14; no independent holdout claim.

**Expression gap:** current accounting boundary must be specified; no equivalence inferred. Expected hidden category: subject.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: identified household unit. Negative boundary: everyone living within one wildfire perimeter.
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

### economics-q15: Would higher local GDP prove that recovery improved everyone's wellbeing?

Source: GDP. Preserved source-question order 15; no independent holdout claim.

**Expression gap:** invalid welfare inference; distribution, environment and welfare concepts needed. Expected hidden category: quality.

Explicit gap; do not substitute a narrative paraphrase and call it grammar-valid.
Positive boundary: A value observed for the named bearer and stated convention.. Negative boundary: An unqualified score, missing observation or value from another bearer treated as equivalent..
Checks: grammar untested; semantic blocked; adapter, reasoner and execution untested.

## Candidate register

Every parent below names an existing imported root/domain declaration. Its presence is verified; its scientific adequacy is proposed, not validated. Local candidate references are not installed declarations. Types follow the context-pack observational perspective; records with unresolved unity, institutional or endpoint meaning remain blocked.

### economics:HouseholdUnit — subject (blocked)

A bounded group treated as a household economic unit under an explicit statistical convention.
Proposed imported parent: `imod:Subject`. Evidence: SNA2008.
Positive: identified household unit. Negative: everyone living within one wildfire perimeter.
Bearer qualities: `economics:DisposableIncome`.

Question incidence: economics-q01, economics-q14.

### economics:EnterpriseUnit — subject (blocked)

An identified economic producer unit under a named accounting convention.
Proposed imported parent: `imod:Subject`. Evidence: SNA2008.
Positive: one enterprise unit. Negative: an industry aggregate.
Bearer qualities: `economics:OutputValue`.

Question incidence: economics-q02, economics-q07.

### economics:EstablishmentUnit — subject (blocked)

A producer unit distinguished by location and activity within the chosen convention.
Proposed imported parent: `imod:Subject`. Evidence: SNA2008.
Positive: one plant establishment. Negative: all sites of an enterprise automatically.
Bearer qualities: `economics:OutputValue`.

Question incidence: economics-q03.

### economics:ProducedAsset — subject (blocked)

An individually identified produced item within an explicit economic asset boundary.
Proposed imported parent: `imod:Subject`. Evidence: SNA2008.
Positive: machine controlled for economic benefits. Negative: every physical object irrespective of benefit/control.
Bearer qualities: `economics:AssetValue`.

Question incidence: economics-q05.

### economics:InventoryLot — subject (provisional)

An identifiable stock lot held within production or distribution.
Proposed imported parent: `imod:Subject`. Evidence: BEA.
Positive: finished goods held for sale. Negative: the sales revenue itself.
Bearer qualities: `economics:InventoryValue`.

Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:Production — process (provisional)

Economic transformation or service provision within a stated production boundary.
Proposed imported parent: `imod:Process`. Evidence: SNA2008.
Positive: observed factory production. Negative: asset price appreciation alone.
Relevant quality parameters (no equations): `economics:OutputValue`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: economics-q03.

### economics:IntermediateConsumption — process (provisional)

Use of goods or services as inputs in a production activity within an accounting boundary.
Proposed imported parent: `imod:Process`. Evidence: SNA2008.
Positive: fuel consumed by a plant. Negative: purchase of an enduring machine.
Relevant quality parameters (no equations): `economics:InputValue`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: economics-q04.

### economics:FinalConsumption — process (provisional)

Use of goods or services to meet needs within a specified accounting scope.
Proposed imported parent: `imod:Process`. Evidence: SNA2008.
Positive: household consumption service. Negative: industrial intermediate input.
Relevant quality parameters (no equations): `economics:ConsumptionValue`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:CapitalFormation — process (provisional)

Acquisition or production adding to produced assets under a declared convention.
Proposed imported parent: `imod:Process`. Evidence: BEA.
Positive: new productive installation. Negative: pure transfer of cash.
Relevant quality parameters (no equations): `economics:AssetValue`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: economics-q09.

### economics:ConsumptionOfFixedCapital — process (provisional)

Decline of fixed asset value attributable to ordinary use/ageing within accounting scope.
Proposed imported parent: `imod:Process`. Evidence: BEA.
Positive: normal use-related loss. Negative: catastrophic wildfire destruction.
Relevant quality parameters (no equations): `economics:AssetValue`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:ControlsAsset — relationship (blocked)

Unit-to-asset economic control in a stated institutional regime.
Proposed imported parent: `imod:Relationship`. Evidence: SNA2008.
Positive: unit exercising specified economic control. Negative: physical possession alone.

Endpoints: `economics:EnterpriseUnit` → `economics:ProducedAsset`; functional.
Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:OwesPayment — relationship (blocked)

Debtor-to-creditor obligation tied to an identified payable.
Proposed imported parent: `imod:Relationship`. Evidence: SNA2008.
Positive: accepted contractor payable. Negative: unaccepted quotation.

Endpoints: `economics:EnterpriseUnit` → `economics:EnterpriseUnit`; functional.
Question incidence: economics-q07.

### economics:SuppliesProducer — relationship (provisional)

Directed actual supply from one producer unit to another.
Proposed imported parent: `imod:Relationship`. Evidence: SNA2008.
Positive: supplier delivering inputs. Negative: firms in same sector without exchange.

Endpoints: `economics:EnterpriseUnit` → `economics:EstablishmentUnit`; functional.
Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:PaysCompensation — relationship (blocked)

Employer-unit to person compensation relationship over a specified engagement.
Proposed imported parent: `imod:Relationship`. Evidence: SNA2008.
Positive: compensation for employment. Negative: gift unrelated to employment.

Endpoints: `economics:EnterpriseUnit` → `imod:Agent`; functional.
Question incidence: economics-q08.

### economics:TransfersTo — relationship (blocked)

Directed unrequited transfer between identified units under a stated convention.
Proposed imported parent: `imod:Relationship`. Evidence: BEA.
Positive: eligible emergency cash transfer. Negative: purchase of household labour.

Endpoints: `economics:EnterpriseUnit` → `economics:HouseholdUnit`; functional.
Question incidence: economics-q06.

### economics:AssetSale — event (provisional)

Bounded exchange episode transferring one identified asset under specified terms.
Proposed imported parent: `imod:Event`. Evidence: SNA2008.
Positive: completed machine sale. Negative: offer not accepted.
Relevant quality parameters (no equations): `economics:TransactionValue`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: economics-q11.

### economics:TransferReceipt — event (provisional)

Bounded receipt of an identified transfer by a unit.
Proposed imported parent: `imod:Event`. Evidence: BEA.
Positive: household receives emergency transfer. Negative: announcement of future support.
Relevant quality parameters (no equations): `economics:TransactionValue`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: economics-q12.

### economics:AssetDestruction — event (provisional)

Bounded catastrophic physical loss of an identified economic asset.
Proposed imported parent: `imod:Event`. Evidence: SNA2008.
Positive: machine destroyed by wildfire. Negative: market repricing without physical destruction.
Relevant quality parameters (no equations): `economics:AssetValue`.
Proposed affects: economics:AssetValue; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: economics-q13.

### economics:ProductionInterruption — event (blocked)

Bounded episode in which a specified production activity ceases and may resume.
Proposed imported parent: `imod:Event`. Evidence: SNA2008.
Positive: plant stops through outage episode. Negative: planned non-production outside operating period.
Relevant quality parameters (no equations): `economics:OutputValue`.
Proposed affects: economics:OutputValue; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:PaymentSettlement — event (provisional)

Bounded discharge of an identified payable through an actual settlement.
Proposed imported parent: `imod:Event`. Evidence: SNA2008.
Positive: invoice settled by transfer. Negative: invoice issued but unpaid.
Relevant quality parameters (no equations): `economics:TransactionValue`.
Proposed affects: none asserted; creates: none asserted; confers: none asserted. Author-proposed binding; only a potential at explicitly participating bearers, no runtime consequence or invariant effect claimed. Empty lists mean no justified binding asserted.
Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:DisposableIncome — quality (provisional)

Income available to the defined unit under a specified accounting boundary and period.
Proposed imported parent: `imod:MonetaryValue`. Evidence: SNA2008.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `economics:HouseholdUnit`. Parameter of: none recorded. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: economics-q01.

### economics:OutputValue — quality (provisional)

Value of a producer's output under explicit prices and production boundary.
Proposed imported parent: `imod:MonetaryValue`. Evidence: SNA2008.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `economics:EnterpriseUnit`, `economics:EstablishmentUnit`. Parameter of: `economics:Production`, `economics:ProductionInterruption`. Affected by: `economics:ProductionInterruption`. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: economics-q03, economics-q10, economics-q15.

### economics:AssetValue — quality (provisional)

Value of an identified asset under a declared valuation basis; not physical condition.
Proposed imported parent: `imod:MonetaryValue`. Evidence: SNA2008, BEA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `economics:ProducedAsset`. Parameter of: `economics:CapitalFormation`, `economics:ConsumptionOfFixedCapital`, `economics:AssetDestruction`. Affected by: `economics:AssetDestruction`. These fields are distinct; occurrence parameters do not establish inherency.

Existing-role alignment alternative: `economics:EconomicAsset imod:Subject`; EconomicAsset is a role, so the bare role cannot bear AssetValue. `economics:ProducedAsset` remains the narrower provisional subject while role-composition and asset-boundary review are blocked.

Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:InventoryValue — quality (provisional)

Value of a bounded inventory stock under stated accounting valuation.
Proposed imported parent: `imod:MonetaryValue`. Evidence: BEA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: `economics:InventoryLot`. Parameter of: none recorded. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:InputValue — quality (provisional)

Value of inputs used within a stated production boundary.
Proposed imported parent: `imod:MonetaryValue`. Evidence: SNA2008.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `economics:IntermediateConsumption`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:ConsumptionValue — quality (provisional)

Value attributed to consumption within a stated accounting scope.
Proposed imported parent: `imod:MonetaryValue`. Evidence: SNA2008.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `economics:FinalConsumption`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

### economics:TransactionValue — quality (provisional)

Value assigned to a specified exchange or transfer under stated valuation.
Proposed imported parent: `imod:MonetaryValue`. Evidence: SNA2008, BEA.
Positive: A value observed for the named bearer and stated convention.. Negative: An unqualified score, missing observation or value from another bearer treated as equivalent..


Proposed substantial bearers: **blocked: no bearer articulated**. Parameter of: `economics:AssetSale`, `economics:TransferReceipt`, `economics:PaymentSettlement`. Affected by: none asserted. These fields are distinct; occurrence parameters do not establish inherency.

Question incidence: none: coverage candidate needs a fresh question or removal.

## Quality summaries, not unexplained labels

- **low-income** summarises `economics:DisposableIncome`: Ordered relative to a declared household definition, equivalisation and reference population; no universal poverty line. Status: provisional_no_predicate_declaration.
- **impaired** summarises `economics:AssetValue`: Comparison against named valuation basis; physical damage and expected benefits can diverge. Status: provisional_no_predicate_declaration.
- **growth/decline** summarises `economics:OutputValue`: Ordered comparison under same price/accounting basis; price inflation is not physical output growth. Status: provisional_no_predicate_declaration.

Evidence states such as unknown, unmeasured and disputed are not new predicates. No thresholds were invented, and no listed scheme is an exhaustive classification of the world.

## Dependency and review gates

Proposed import order is root imod → economics. Cross-domain source examples are not reverse ontology imports. Missing meanings generate upstream issues instead of local workarounds.

Before review-ready: settle blocking identity and parent choices; obtain fresh source-first probes from a reviewer who has not seen candidate vocabulary; prune unused candidates; compare authority scopes and preserve dissent; freeze exact artifact/import revisions; parse expressions and declarations separately; run adaptation and loaded semantic validation; obtain human scientific and ontology review. A syntax pass cannot approve a source interpretation.

Suggested stage attachments remain proposals for backend discussion: source-review ledger, question-semantic result matrix, ambiguity decisions, exact tested artifact hashes and approval bindings to revision/action/base. They are not a replacement for context-pack 1.3 proposal schema or a new API contract.

All change and cessation require occurrents. Changes in qualities are separately resolved at context transitions; unresolved changes remain open-world unknown. Implication/detection are syntax-only. No process-to-role-to-configuration runtime was built. Jargon, if approved later, belongs in alias-only equals modules; tier policy remains unresolved.

## Current checks and coverage

Recorded counts: {"subject":5,"process":5,"relationship":5,"event":5,"quality":7}; 15 narrative questions. 6 draft expressions, 9 explicit gaps.

JSON and incidence are locally checkable. Actual parser results will be supplied by the parent validation runner; this dossier does not claim a pass. No subject/process/relationship/event list is approved simply because it reaches five. Every unused candidate remains exposed in dossier.json coverage.
