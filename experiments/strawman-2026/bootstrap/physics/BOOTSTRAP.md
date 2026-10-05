# Physics bootstrap dossier

Classical mechanics and macroscopic thermal transfer as a narrow cross-domain physics seed; quantum, electromagnetic field individuation and nuclear processes are intentionally not covered.

**Status:** local draft, no human approval, no executable ontology. Requested Tier1; imported root context is recorded without mechanically emitting redundant `is` clauses. A reference that exists is not a scientifically accepted parent. Proposed imported MaterialBody remains blocked until upstream review.

## Question-first evidence and method

The fifteen questions were saved before the local candidate table in QUESTIONS_FIRST.json (SHA256 `4cfc43b3177996cd6ef971309e90491f7244689ffdadf52e66d9b78b2d5ca0cf`). The author had seen the legacy and previous packet, so this is not blind testing. Questions were not retroactively renamed to fit concepts. No independent expert discussion has occurred.

## Sources and limits

- **LOCAL** [Pinned ontology/context pack and user change commitments](../METHOD.md), METHOD change boundary; src/imod.kwv:289-447; src/physical.kwv; src/earth.kwv. Local design evidence, not external science; current comments not automatically accepted. Retrieved2026-10-03.
- **NASA-HEAT** [NASA Glenn Heat Transfer](https://www.grc.nasa.gov/www/k-12/airplane/heat.html), Updated2021-05-13; thermodynamic equilibrium and gas state paragraphs. Macroscopic thermodynamics; simplified constant heat capacity example is not universal. Retrieved2026-10-03.
- **NASA-MOTION** [NASA Glenn Newton second law](https://www.grc.nasa.gov/WWW/K-12/BGP/newton2.html), Momentum and vector-quantity paragraphs. Classical mechanical scope; momentum, force and velocity directional; no relativistic extension. Retrieved2026-10-03.
- **NASA-THERMAL** [NASA STEMonstrations Thermal Energy](https://www.nasa.gov/stem-content/stemonstrations-thermal-energy/), 2024; three transfer modes and classroom connection. Teaching evidence for mode distinctions; not exhaustive physics or universal causal law. Retrieved2026-10-03.

## Scope and dependency argument

The most useful questions concern energy transfer, body state and mechanical interaction. There are three justified subject perspectives and five processes, but only two binary relationships and three episode types. ThermalBody and MechanicalBody overlap as perspectives on the same body; do not declare disjoint subclasses or create two twins by fiat. They may become role/perspective compositions after review. FluidParcel is material-following: a fixed map cell is not the same bearer. No laws or equations are encoded. Temperature response to transfer depends on phase and constraints, so affects internal energy does not license universal temperature increase. NASA classroom distinctions support a starting vocabulary, not a comprehensive disciplinary consensus.

Proposed dependency order: imod → physical → physics/chemistry/earth; earth does not import its downstream disciplinary consumers. These are alternative packet decisions, not changed source imports. Generic coordinate, temporal, unit, model and execution infrastructure stays outside.

## Questions before vocabulary

### physics-q01: Why does a metal spoon warm in a hot drink?

Contact heat transfer and temperature are distinct observables.
- Source/provenance: NASA-HEAT; original order 1.
- Draft observable: `physics:ThermalConduction`
- Expected expression-result category: process. Positive: spoon heated through contact; specified heated metal sample. Negative: sunlight crossing a vacuum; temperature number.
- Dependencies: Contact heat transfer and temperature are distinct observables. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q02: Can an object gain energy without getting warmer?

Energy transfer does not universally imply temperature rise.
- Source/provenance: NASA-HEAT; original order 2.
- Draft observable: `physics:TransferredThermalEnergy`
- Expected expression-result category: quality. Positive: specified heated metal sample; energy transferred during the heating pulse. Negative: temperature number; stored temperature.
- Dependencies: Energy transfer does not universally imply temperature rise. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q03: Why does heated water circulate?

Fluid circulation and heat transport, without equating all convection with buoyancy.
- Source/provenance: NASA-THERMAL; original order 3.
- Draft observable: `physics:ConvectiveHeatTransport`
- Expected expression-result category: process. Positive: heat redistributed by circulating water; marked parcel followed through circulation. Negative: conduction through stationary solid; fixed Eulerian grid cell without material identity.
- Dependencies: Fluid circulation and heat transport, without equating all convection with buoyancy. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q04: How can a campfire warm a face without contact?

Radiative transfer rather than contact-only relation.
- Source/provenance: NASA-THERMAL; original order 4.
- Draft observable: `physics:RadiativeEnergyTransfer`
- Expected expression-result category: process. Positive: campfire radiation absorbed by skin. Negative: contact conduction alone.
- Dependencies: Radiative transfer rather than contact-only relation. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physics-q05: How does an unbalanced push change motion?

Net force and vector acceleration require frame and classical regime.
- Source/provenance: NASA-MOTION; original order 5.
- Draft observable: `physics:MechanicalAcceleration`
- Expected expression-result category: process. Positive: turning motion at constant speed; stone subject to a push. Negative: constant straight-line motion; a force vector.
- Dependencies: Net force and vector acceleration require frame and classical regime. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q06: Can motion change while speed stays the same?

Direction vs speed; root Velocity/Speed mismatch blocks mapping.
- Source/provenance: NASA-MOTION; original order 6.
- Explicit gap: gap: vector velocity versus scalar speed upstream distinction.
- Expected expression-result category: unresolved. Positive: turning motion at constant speed. Negative: constant straight-line motion.
- Dependencies: Direction vs speed; root Velocity/Speed mismatch blocks mapping. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: vector velocity versus scalar speed upstream distinction
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q07: What changes when a gas is squeezed?

Pressure, volume, temperature and process conditions.
- Source/provenance: NASA-HEAT; original order 7.
- Draft observable: `imod:Volume of physics:FluidParcel`
- Expected expression-result category: quality. Positive: piston compresses gas; marked parcel followed through circulation. Negative: gas moved without volume change; fixed Eulerian grid cell without material identity.
- Dependencies: Pressure, volume, temperature and process conditions. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q08: Do two touching objects eventually reach the same temperature?

Equilibrium under suitable isolation, not unconditional law in ontology.
- Source/provenance: NASA-HEAT; original order 8.
- Draft observable: `physics:ThermallyContacts linking physics:ThermalBody to physics:ThermalBody`
- Expected expression-result category: relationship. Positive: spoon touches drink; specified heated metal sample. Negative: radiation across vacuum; temperature number.
- Dependencies: Equilibrium under suitable isolation, not unconditional law in ontology. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q09: Why do equal pushes affect heavy and light objects differently?

Inertial mass vs amount of substance.
- Source/provenance: NASA-MOTION; original order 9.
- Draft observable: `imod:Mass of physics:MechanicalBody`
- Expected expression-result category: quality. Positive: stone subject to a push. Negative: a force vector.
- Dependencies: Inertial mass vs amount of substance. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q10: Is warmth a property or something transferred?

Temperature vs heat transfer, avoid heat as stored substance.
- Source/provenance: NASA-HEAT; original order 10.
- Draft observable: `imod:Temperature of physics:ThermalBody`
- Expected expression-result category: quality. Positive: specified heated metal sample; energy transferred during the heating pulse. Negative: temperature number; stored temperature.
- Dependencies: Temperature vs heat transfer, avoid heat as stored substance. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q11: When does heating begin and end in this experiment?

Bounded episode vs ongoing heat-transfer process.
- Source/provenance: NASA-HEAT; original order 11.
- Draft observable: `physics:HeatingEpisode`
- Expected expression-result category: event. Positive: one pulse of heating. Negative: unbounded generic conduction.
- Dependencies: Bounded episode vs ongoing heat-transfer process. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physics-q12: Does an insulating layer stop all energy transfer?

Restricted conductance not absolute absence of radiation.
- Source/provenance: NASA-THERMAL; original order 12.
- Explicit gap: gap: conductance and boundary conditions; cannot infer absence.
- Expected expression-result category: unresolved. Positive: spoon heated through contact; campfire radiation absorbed by skin. Negative: sunlight crossing a vacuum; contact conduction alone.
- Dependencies: Restricted conductance not absolute absence of radiation. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: conductance and boundary conditions; cannot infer absence
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physics-q13: Can a stationary object exert a force?

Force interaction vs motion; no velocity predicate from interaction alone.
- Source/provenance: NASA-MOTION; original order 13.
- Draft observable: `physics:ExertsForceOn linking physics:MechanicalBody to physics:MechanicalBody`
- Expected expression-result category: relationship. Positive: hand pushes stone. Negative: stone appears in photograph.
- Dependencies: Force interaction vs motion; no velocity predicate from interaction alone. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physics-q14: How much thermal energy passes between the two bodies?

Transfer quantity requires a process interval, not stored energy alias.
- Source/provenance: NASA-HEAT; original order 14.
- Draft observable: `physics:TransferredThermalEnergy`
- Expected expression-result category: quality. Positive: energy transferred during the heating pulse; one pulse of heating. Negative: stored temperature; unbounded generic conduction.
- Dependencies: Transfer quantity requires a process interval, not stored energy alias. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physics-q15: Does a missing temperature reading prove cooling stopped?

Open-world evidence state, not physical stasis.
- Source/provenance: LOCAL; original order 15.
- Explicit gap: gap: no-reading is evidence state, no stop-event inference.
- Expected expression-result category: unresolved. Positive: one pulse of heating. Negative: unbounded generic conduction.
- Dependencies: Open-world evidence state, not physical stasis. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: no-reading is evidence state, no stop-event inference
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

## Candidate corpus and scoped bindings

### ThermalBody — subject

Material body delimited for a thermodynamic observation; not necessarily isothermal.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: imod:Temperature; imod:Energy; imod:Mass. Parameters: none proposed.
- Bindings: {}
- Positive: specified heated metal sample. Negative: temperature number.
- Evidence: NASA-HEAT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### FluidParcel — subject

Bounded portion of fluid tracked by a stated material-following identity convention.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: imod:Temperature; imod:Volume; pressure quality missing. Parameters: none proposed.
- Bindings: {}
- Positive: marked parcel followed through circulation. Negative: fixed Eulerian grid cell without material identity.
- Evidence: NASA-THERMAL; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### MechanicalBody — subject

Material body followed under a classical mechanical identity and reference frame.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: imod:Mass; vector velocity upstream gap. Parameters: none proposed.
- Bindings: {}
- Positive: stone subject to a push. Negative: a force vector.
- Evidence: NASA-MOTION; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### ThermalConduction — process

Heat transfer through material/contact under a temperature gradient.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: imod:Temperature; thermal conductivity missing.
- Bindings: {"affects": "internal energy of specified participating bodies; temperature need not increase during phase change", "creates": [], "confers": []}
- Positive: spoon heated through contact. Negative: sunlight crossing a vacuum.
- Evidence: NASA-THERMAL; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### ConvectiveHeatTransport — process

Thermal energy transport accompanying bulk fluid motion.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: fluid velocity upstream gap; imod:Temperature; density missing.
- Bindings: {"affects": "spatial distribution of internal energy in participating fluid", "creates": [], "confers": []}
- Positive: heat redistributed by circulating water. Negative: conduction through stationary solid.
- Evidence: NASA-THERMAL; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### RadiativeEnergyTransfer — process

Energy transfer by electromagnetic radiation between participating systems.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: radiant power missing; absorptivity missing; imod:Temperature.
- Bindings: {"affects": "energy of emitting/absorbing bodies in specified interaction", "creates": [], "confers": []}
- Positive: campfire radiation absorbed by skin. Negative: contact conduction alone.
- Evidence: NASA-THERMAL; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### MechanicalAcceleration — process

Change in vector velocity of a mechanical body during an interaction.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: net force missing; imod:Mass; vector velocity upstream gap.
- Bindings: {"affects": "vector velocity under classical scope; equations belong in model", "creates": [], "confers": []}
- Positive: turning motion at constant speed. Negative: constant straight-line motion.
- Evidence: NASA-MOTION; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### GasCompression — process

Decrease of occupied gas volume under mechanical compression.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: pressure missing; imod:Volume; imod:Temperature.
- Bindings: {"affects": "gas volume; temperature response depends on thermal exchange and model", "creates": [], "confers": []}
- Positive: piston compresses gas. Negative: gas moved without volume change.
- Evidence: NASA-HEAT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### ThermallyContacts — relationship

Material contact between two thermal bodies permitting conductive transfer in the chosen regime.
- Imported parent/context: `imod:Relationship` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: thermal conductance missing.
- Bindings: {"source": "physics:ThermalBody", "target": "physics:ThermalBody", "rationale": "Symmetric contact vs directed current; bond/relationship unresolved. Does not assert nonzero net transfer."}
- Positive: spoon touches drink. Negative: radiation across vacuum.
- Evidence: NASA-HEAT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### ExertsForceOn — relationship

Directed mechanical interaction with an identified source body and target body.
- Imported parent/context: `imod:Relationship` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: force vector missing.
- Bindings: {"source": "physics:MechanicalBody", "target": "physics:MechanicalBody", "rationale": "Counterforce on other bearer is a separate directed interaction, not same observation."}
- Positive: hand pushes stone. Negative: stone appears in photograph.
- Evidence: NASA-MOTION; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### HeatingEpisode — event

Bounded experimental or naturally individuated interval of energy transfer into a specified body.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: transferred energy missing; imod:Temperature.
- Bindings: {"affects": "body energy; no universal temperature increase", "creates": [], "confers": []}
- Positive: one pulse of heating. Negative: unbounded generic conduction.
- Evidence: NASA-HEAT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### CompressionEpisode — event

Bounded compression of an identified gas body with declared start and end.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: imod:Volume; pressure missing.
- Bindings: {"affects": "gas volume", "creates": [], "confers": []}
- Positive: one piston stroke. Negative: small gas volume observed once.
- Evidence: NASA-HEAT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### ImpulseEpisode — event

Bounded mechanical interaction changing momentum of the specified body.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: momentum missing; force missing; imod:Mass.
- Bindings: {"affects": "body momentum in classical regime", "creates": [], "confers": []}
- Positive: one short push. Negative: force balance without net impulse.
- Evidence: NASA-MOTION; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### TransferredThermalEnergy — quality

Energy transferred as heat during a specified thermal process interval.
- Imported parent/context: `imod:Energy` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: bearer thermal transfer process.
- Bindings: {}
- Positive: energy transferred during the heating pulse. Negative: stored temperature.
- Evidence: NASA-HEAT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

## Quality summaries, not generic properties

- **ThermalEquilibriumWithinConvention** summarizes temperature difference between named bodies. Nominal summary of compatible thermodynamic temperatures and allowed tolerance, with regime/context specified. No literal equality inferred from missing readings. blocked: tolerance and scope unsupplied.
- **AdiabaticWithinConvention** summarizes heat exchange across specified process boundary. Nominal process summary about heat transfer, not body temperature or energy constancy; ordered near-adiabatic variants need a quantitative convention. blocked: transfer quality and boundary convention required.

Unknown, unmeasured and disputed are evidence states. They do not themselves license attributes, realms or identity classes. No thresholds, disjointness or exhaustiveness are invented.

## Coverage and iteration ledger

Counts: {'subject': 3, 'process': 5, 'relationship': 2, 'event': 3, 'quality': 1}. Fifteen questions; 3 explicitly retain gaps. No candidate was added solely to fill five/category. Incidence and unused candidates are in dossier.json; unused entries require usefulness review, not automatic deletion.

The first mapping exposed the upstream issues below. They remain unresolved; the vocabulary was not declared valid by circularly narrowing the questions. Models for explanations and runtime consequences for changes remain separate from vocabulary gaps.

- UPSTREAM-MATERIAL: physical:MaterialBody is proposed in neighboring dossier, absent from executable src. All subject specialization paths blocked.
- ROOT-VECTOR: imod:Velocity aliases odo:Speed; vector change and force relations cannot use it as if direction were represented.
- ROOT-MASS: distinguish inertial mass and amount of substance before interpreting mechanical questions.
- PHYS-QUALITY: force, momentum, pressure, conductivity, heat capacity and radiant power need separate upper-derived quality proposals; do not manufacture generic Quantity declarations here.
- PHYS-EQUILIBRIUM: thermal contact does not guarantee equilibration in an open driven system; episode and boundary conditions belong in observations/models.

## Negative cases and review gate

physics:ThermalBody of imod:Temperature intentionally reverses bearer/quality; no semantic acceptance expected. Using imod:Velocity for vector direction is also a semantic negative, not a parser-negative claim.

This is a semantic negative expectation, not a claim that the current parser rejects it. An actual syntax negative control must be run by the parent against the current grammar. Null expressions are gaps, not successful tests.

Decide whether thermal/mechanical body labels add domain meaning or should be compositions over MaterialBody. Prioritize transfer-energy vs stored-energy inherency, force interaction endpoints and vector upstream distinction. Seek fresh probes involving latent heat, forced convection and noncontact forces.

Human source review, ontology category/ancestry review and exact artifact approval are separate gates. Ready-for-review means these exact dossier files, QUESTIONS_FIRST provenance hash and imported revision are available, not ready-to-apply. Blocking gaps must be closed or candidates explicitly excluded. Extension ideas for workflow stages are source-review outcomes, question-semantic test coverage, ambiguity decisions and approved revision/artifact hashes; the existing proposal schema is unchanged.

At an occurrent-driven transition resolve change in relevant qualities separately. No reading means unknown, not zero change. Cessation requires an occurrence. No process, role or configuration consequences are executed here.
