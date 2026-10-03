# Physical bootstrap dossier

Minimal shared articulation of material bearers, host-dependent features and physical identity-changing occurrences. This is upper scaffolding, not a disciplinary replacement for physics and not generic time/space infrastructure.

**Status:** local draft, no human approval, no executable ontology. Requested Tier1; imported root context is recorded without mechanically emitting redundant `is` clauses. A reference that exists is not a scientifically accepted parent. Proposed imported MaterialBody remains blocked until upstream review.

## Question-first evidence and method

The fifteen questions were saved before the local candidate table in QUESTIONS_FIRST.json (SHA256 `64cd46e9f6d551835da54a247239a54d305f4913b646f809cf7133ea8994a5ea`). The author had seen the legacy and previous packet, so this is not blind testing. Questions were not retroactively renamed to fit concepts. No independent expert discussion has occurred.

## Sources and limits

- **BIPM** [BIPM SI Brochure ninth edition](https://www.bipm.org/documents/d/guest/si-brochure-9-en-pdf), 2026 online edition; section2.3.1 Table2 and derived quantities. Distinguishes mass, temperature, amount; unit tables do not dictate observable ancestry. Retrieved2026-10-03.
- **IUPAC-HOM** [IUPAC Homogeneity H02845](https://goldbook.iupac.org/terms/view/H02845/plain), 5th ed2025; definition;1990 recommendations p1201. Uniformity depends on named property/analyte; no global homogeneous identity. Retrieved2026-10-03.
- **LOCAL** [Pinned ontology/context pack and user change commitments](../METHOD.md), METHOD change boundary; src/imod.kwv:289-447; src/physical.kwv; src/earth.kwv. Local design evidence, not external science; current comments not automatically accepted. Retrieved2026-10-03.
- **NASA-HEAT** [NASA Glenn Heat Transfer](https://www.grc.nasa.gov/www/k-12/airplane/heat.html), Updated2021-05-13; thermodynamic equilibrium and gas state paragraphs. Macroscopic thermodynamics; simplified constant heat capacity example is not universal. Retrieved2026-10-03.
- **NASA-MOTION** [NASA Glenn Newton second law](https://www.grc.nasa.gov/WWW/K-12/BGP/newton2.html), Momentum and vector-quantity paragraphs. Classical mechanical scope; momentum, force and velocity directional; no relativistic extension. Retrieved2026-10-03.
- **USGS-DESERT** [USGS Our Dynamic Desert](https://pubs.usgs.gov/of/2004/1007/erosion.html), 2004 report; page updated2009-12-18; Weathering and Erosion. Mojave observations distinguish weathering, erosion, debris transport; regional evidence not universal rates. Retrieved2026-10-03.

## Scope and dependency argument

Retain physical only if reviewers need a material-body layer between root subjects and disciplines. Three subject candidates, two processes, two relationships and two events are enough to expose the principal decisions. Five of each would manufacture distinctions or import machinery. MaterialBody is not a synonym for every Subject: institutions and information content are counterexamples. HostBoundVoid tests whether a host-dependent subject is supported; it is blocked until dependence and identity can be expressed without treating every geometric hole as a material body. DetachedFragment is a process-relative composition that may belong as a role instead of a new subject. Existing Collapse is useful as an identity-loss question, but legacy participation, input/output, periodicity, spatial arrangements and time-position trees are not conserved by default.

Proposed dependency order: imod → physical → physics/chemistry/earth; earth does not import its downstream disciplinary consumers. These are alternative packet decisions, not changed source imports. Generic coordinate, temporal, unit, model and execution infrastructure stays outside.

## Questions before vocabulary

### physical-q01: Which material object are we following when it heats without breaking?

Identity continuity vs thermal change; boundary/identity policy is an upstream issue.
- Source/provenance: NASA-HEAT; original order 1.
- Draft observable: `physical:BodyTemperature of physical:MaterialBody`
- Expected kind: quality. Positive: one identified rock specimen; temperature of a equilibrated specimen. Negative: a temperature reading; heat transferred during a process.
- Dependencies: Identity continuity vs thermal change; boundary/identity policy is an upstream issue. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physical-q02: How much matter does the same bounded object contain?

Mass must not mean amount of substance.
- Source/provenance: BIPM; original order 2.
- Draft observable: `physical:BodyMass of physical:MaterialBody`
- Expected kind: quality. Positive: one identified rock specimen; mass of the specimen. Negative: a temperature reading; moles of its constituent species.
- Dependencies: Mass must not mean amount of substance. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physical-q03: Can a hole be observed separately from the solid hosting it?

Dependent feature vs independent substantial.
- Source/provenance: LOCAL; original order 3.
- Draft observable: `physical:VoidHostedBy linking physical:HostBoundVoid to physical:MaterialBody`
- Expected kind: relationship. Positive: pore within a specified rock; pore hosted by rock specimen. Negative: arbitrary region of open air; a coordinate point near the specimen.
- Dependencies: Dependent feature vs independent substantial. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physical-q04: Did the boulder remain one object after it cracked into detached pieces?

Cessation requires bounded fragmentation occurrence and new identities.
- Source/provenance: USGS-DESERT; original order 4.
- Draft observable: `physical:FragmentationEpisode`
- Expected kind: event. Positive: one observed breakage episode; detached chip after breakage. Negative: two image files of one intact stone; crack whose sides remain attached.
- Dependencies: Cessation requires bounded fragmentation occurrence and new identities. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physical-q05: Which parts of this rock are in physical contact?

Contact does not entail attachment or common identity.
- Source/provenance: NASA-HEAT; original order 5.
- Draft observable: `physical:PhysicalContact linking physical:MaterialBody to physical:MaterialBody`
- Expected kind: relationship. Positive: stone touching vessel wall. Negative: two separated warm stones.
- Dependencies: Contact does not entail attachment or common identity. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physical-q06: Is the hot stone bigger after warming?

Volume and temperature are distinct dependent observables; thermal expansion is a mechanism.
- Source/provenance: NASA-HEAT; original order 6.
- Draft observable: `imod:Volume of physical:MaterialBody`
- Expected kind: quality. Positive: one identified rock specimen; temperature of a equilibrated specimen. Negative: a temperature reading; heat transferred during a process.
- Dependencies: Volume and temperature are distinct dependent observables; thermal expansion is a mechanism. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physical-q07: Did the quantity of material change when fragments moved away?

Open boundary material accounting vs identity loss.
- Source/provenance: USGS-DESERT; original order 7.
- Draft observable: `change in physical:BodyMass`
- Expected kind: change-quality. Positive: splitting rock through an extending crack; mass of the specimen. Negative: sensor losing sight of intact rock; moles of its constituent species.
- Dependencies: Open boundary material accounting vs identity loss. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physical-q08: Does an unmoving stone have no physical processes?

Stillness in a chosen frame cannot establish absence of thermal change.
- Source/provenance: NASA-MOTION; original order 8.
- Explicit gap: gap: frame-dependent speed and process inventory cannot be inferred from stillness.
- Expected kind: gap: frame-dependent speed and process inventory cannot be inferred from stillness. Positive: one identified rock specimen. Negative: a temperature reading.
- Dependencies: Stillness in a chosen frame cannot establish absence of thermal change. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: frame-dependent speed and process inventory cannot be inferred from stillness
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physical-q09: Is the same specimen uniform for both temperature and composition?

Homogeneity must name a property and support scale.
- Source/provenance: IUPAC-HOM; original order 9.
- Explicit gap: gap: property-specific distribution/summary quality.
- Expected kind: gap: property-specific distribution/summary quality. Positive: one identified rock specimen. Negative: a temperature reading.
- Dependencies: Homogeneity must name a property and support scale. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: property-specific distribution/summary quality
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physical-q10: Can two objects have equal mass but different volumes?

Independent qualities, not one size category.
- Source/provenance: BIPM; original order 10.
- Draft observable: `physical:BodyMass of physical:MaterialBody`
- Expected kind: quality. Positive: mass of the specimen; one identified rock specimen. Negative: moles of its constituent species; a temperature reading.
- Dependencies: Independent qualities, not one size category. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physical-q11: When does a crack become a separate void rather than a surface mark?

Identity and host dependence need explicit criteria.
- Source/provenance: LOCAL; original order 11.
- Explicit gap: gap: host/void individuation.
- Expected kind: gap: host/void individuation. Positive: pore within a specified rock. Negative: arbitrary region of open air.
- Dependencies: Identity and host dependence need explicit criteria. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: host/void individuation
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physical-q12: What evidence would show that the object ceased to exist as that object?

Collapse is identity loss, not missing sensor data.
- Source/provenance: LOCAL; original order 12.
- Draft observable: `physical:IdentityLossEpisode`
- Expected kind: event. Positive: destruction that defeats an agreed body identity criterion. Negative: unknown present location.
- Dependencies: Collapse is identity loss, not missing sensor data. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physical-q13: Does a warmer classification mean a larger change in temperature?

Relative level vs temporal difference.
- Source/provenance: NASA-HEAT; original order 13.
- Draft observable: `change in physical:BodyTemperature`
- Expected kind: change-quality. Positive: temperature of a equilibrated specimen. Negative: heat transferred during a process.
- Dependencies: Relative level vs temporal difference. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### physical-q14: Can the mass of an absent observation be treated as zero?

Evidence absence cannot resolve a quality or create cessation.
- Source/provenance: LOCAL; original order 14.
- Explicit gap: gap: epistemic evidence policy is not a domain predicate.
- Expected kind: gap: epistemic evidence policy is not a domain predicate. Positive: mass of the specimen. Negative: moles of its constituent species.
- Dependencies: Evidence absence cannot resolve a quality or create cessation. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: epistemic evidence policy is not a domain predicate
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### physical-q15: Which physical distinctions must every specialized domain import rather than redefine?

Root vs physical scope gate, not an extra domain taxonomy.
- Source/provenance: LOCAL; original order 15.
- Explicit gap: gap: upstream context review.
- Expected kind: gap: upstream context review. Positive: one identified rock specimen. Negative: a temperature reading.
- Dependencies: Root vs physical scope gate, not an extra domain taxonomy. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: upstream context review
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

## Candidate corpus and scoped bindings

### MaterialBody — subject

A bounded portion of matter followed under an explicit physical continuity criterion.
- Imported parent/context: `imod:Subject` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: imod:Mass; imod:Volume; imod:Temperature. Parameters: none proposed.
- Bindings: {}
- Positive: one identified rock specimen. Negative: a temperature reading.
- Evidence: BIPM; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### HostBoundVoid — subject

A cavity individuated by the enclosing material body; dependence is constitutive, not merely location.
- Imported parent/context: `imod:Subject` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: imod:Volume; physical:Depth. Parameters: none proposed.
- Bindings: {"host": "physical:MaterialBody; proposed host dependence, not an extra endpoint"}
- Positive: pore within a specified rock. Negative: arbitrary region of open air.
- Evidence: LOCAL; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### DetachedFragment — subject

A separately bounded piece after separation from a specified material whole.
- Imported parent/context: `imod:Subject` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: imod:Mass; imod:Volume. Parameters: none proposed.
- Bindings: {}
- Positive: detached chip after breakage. Negative: crack whose sides remain attached.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### MaterialSeparation — process

Progressive physical separation of parts of a material body.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: cohesion quality missing; imod:Mass; imod:Volume.
- Bindings: {"affects": "body continuity; upstream identity criterion unresolved", "creates": "detached fragments only after actual detachment; not every crack"}
- Positive: splitting rock through an extending crack. Negative: sensor losing sight of intact rock.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### MaterialAggregation — process

Joining previously separate material portions into one physically individuated body.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: contact quality missing; cohesion quality missing.
- Bindings: {"creates": "one body only if an accepted continuity criterion is met; unsupported for loose proximity"}
- Positive: consolidation into a connected body. Negative: stones merely sharing a map cell.
- Evidence: LOCAL; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### PhysicalContact — relationship

Contact between two specified material bodies at the observational resolution.
- Imported parent/context: `imod:Relationship` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: contact-area quality missing.
- Bindings: {"source": "physical:MaterialBody", "target": "physical:MaterialBody", "rationale": "Symmetric scientific relation; bond versus structural relationship is an upstream category issue."}
- Positive: stone touching vessel wall. Negative: two separated warm stones.
- Evidence: NASA-HEAT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

Blocking reason: symmetric contact requires a human bond-versus-relationship decision; the endpoint notation does not decide it.

### VoidHostedBy — relationship

Directed constitutive dependence of a host-bound cavity on an enclosing body.
- Imported parent/context: `imod:Relationship` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: none proposed.
- Bindings: {"source": "physical:HostBoundVoid", "target": "physical:MaterialBody", "rationale": "Host identity required; no generic location or spatial-containment machinery."}
- Positive: pore hosted by rock specimen. Negative: a coordinate point near the specimen.
- Evidence: LOCAL; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### FragmentationEpisode — event

A bounded occurrence in which a body separates into detached pieces.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: imod:Mass; imod:Volume.
- Bindings: {"affects": "identity/continuity of original body", "creates": "physical:DetachedFragment when detached; material is not created ex nihilo"}
- Positive: one observed breakage episode. Negative: two image files of one intact stone.
- Evidence: USGS-DESERT; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### IdentityLossEpisode — event

A bounded physical occurrence ending the supplied substantial identity criterion.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: identity-continuity criterion unresolved.
- Bindings: {"affects": "specified substantial identity; dependent configuration consequences not implemented", "creates": [], "confers": []}
- Positive: destruction that defeats an agreed body identity criterion. Negative: unknown present location.
- Evidence: LOCAL; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### BodyTemperature — quality

Thermodynamic temperature of an identified material body in an applicable regime.
- Imported parent/context: `imod:Temperature` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: bearer physical:MaterialBody.
- Bindings: {}
- Positive: temperature of a equilibrated specimen. Negative: heat transferred during a process.
- Evidence: BIPM; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### BodyMass — quality

Mass of an identified material body, distinct from amount of substance.
- Imported parent/context: `imod:Mass` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: bearer physical:MaterialBody.
- Bindings: {}
- Positive: mass of the specimen. Negative: moles of its constituent species.
- Evidence: BIPM; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

## Quality summaries, not generic properties

- **WarmerThanReference** summarizes body temperature relative to a reference body. Ordered comparison of temperatures in compatible contexts; no universal hot/cold cutoff. Reference identity required; uncertainty can leave comparison unresolved. blocked: relational comparison vs unary attribute scope unresolved.
- **HomogeneousForNamedProperty** summarizes specified composition or temperature distribution. Nominal summary over named property and declared observational support; tolerance must be supplied by domain convention. Different-property homogeneity may disagree; not exhaustive. blocked: no thresholds or distribution quality yet.

Unknown, unmeasured and disputed are evidence states. They do not themselves license attributes, realms or identity classes. No thresholds, disjointness or exhaustiveness are invented.

## Coverage and iteration ledger

Counts: {'subject': 3, 'process': 2, 'relationship': 2, 'event': 2, 'quality': 2}. Fifteen questions; 5 explicitly retain gaps. No candidate was added solely to fill five/category. Incidence and unused candidates are in dossier.json; unused entries require usefulness review, not automatic deletion.

The first mapping exposed the upstream issues below. They remain unresolved; the vocabulary was not declared valid by circularly narrowing the questions. Models for explanations and runtime consequences for changes remain separate from vocabulary gaps.

- ROOT-MASS: imod:Mass says amount of substance, conflicting with the BIPM distinction; block scientific use of this wording pending root correction.
- ROOT-TEMP: imod:Temperature kinetic-energy gloss is not a general thermodynamic definition.
- PHYS-HOST: source of host dependence and void identity is local design only; expert/source evidence missing.
- PHYS-CONTINUITY: identity loss and fragment creation cannot be applied until material continuity criteria are chosen.
- PHYS-CONTACT: choose symmetric bond or structural relationship; do not encode source/target asymmetry as science.

## Negative cases and review gate

physical:BodyTemperature linking physical:MaterialBody to physical:MaterialBody is a deliberately invalid semantic use of a quality as a binary relationship, even if a parser accepts its token structure.

This is a semantic negative expectation, not a claim that the current parser rejects it. An actual syntax negative control must be run by the parent against the current grammar. Null expressions are gaps, not successful tests.

Review the necessity of physical as an upper module; do not require five entries to justify it. Decide host-dependent subject support, material identity across separation and whether DetachedFragment should be a contingent role. Root wording defects are blocking, not permission to fork unit/quantity foundations.

Human source review, ontology category/ancestry review and exact artifact approval are separate gates. Ready-for-review means these exact dossier files, QUESTIONS_FIRST provenance hash and imported revision are available, not ready-to-apply. Blocking gaps must be closed or candidates explicitly excluded. Extension ideas for workflow stages are source-review outcomes, question-semantic test coverage, ambiguity decisions and approved revision/artifact hashes; the existing proposal schema is unchanged.

At an occurrent-driven transition resolve change in relevant qualities separately. No reading means unknown, not zero change. Cessation requires an occurrence. No process, role or configuration consequences are executed here.
