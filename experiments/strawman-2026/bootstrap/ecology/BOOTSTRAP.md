# Ecology bootstrap dossier

Interactions, population/community observations and disturbance/recovery. Population and Community compete with configuration readings; their existing agent declarations are not presumed valid.

Draft research inventory: no expert discussion or approval occurred. No executable ontology added. All expressions are initially untested. Root references inspected; proposed life parents are missing upstream and never asserted valid.

## Source-first questions

QUESTIONS_FIRST.json preserves original source-led order before candidate rows. This is not an independent holdout; the author knows the broader topic. A component observable is not a full causal answer.

### ecology-q01: Which organisms are feeding on which others in the recovering burn area?

Sources: FOOD; original order 1; incidence: ecology-c09.
Draft expression: `ecology:FeedsOn linking life:Organism to life:Organism`
Expected expression-result category: relationship. Positive: Observed trophic link. Negative: Spatial co-occurrence.
Observed trophic link; excludes Spatial co-occurrence. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q02: How many individuals of a specified population remain after fire?

Sources: NPS; original order 2; incidence: ecology-c17.
Draft expression: `ecology:PopulationAbundance of ecology:Population`
Expected expression-result category: quality. Positive: Bounded population census. Negative: All organisms irrespective of population.
Bounded population census; excludes All organisms irrespective of population. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q03: Has the mix of species changed during recovery?

Sources: NPS; original order 3; incidence: ecology-c18 and ecology-c02.
Full draft expression: absent; expected result category unresolved; grammar not applicable; semantic status blocked.

Insufficient component: `change in ecology:SpeciesRichness of ecology:Community`. Its result category is process under the operator contract, and its syntax parsed successfully. It measures change in species count, not species replacement. For example, {A,B} -> {C,D} retains richness 2 while replacing all species.

Missing observables are community species composition and compositional turnover. Review must choose incidence or abundance-weighted membership, establish the Community bearer, comparable boundaries/support, versioned taxon identities and detection evidence. A comparison metric/model remains separate and unselected. Before/after taxon-identified composition is the positive case; richness alone is the counterexample. No composition declaration is installed by this correction.

### ecology-q04: Are dead trees providing shelter for surviving animals?

Sources: NPS; original order 4; incidence: ecology-c10.
Draft expression: `ecology:Shelters linking life:BiologicalRemnant to life:Organism`
Expected expression-result category: relationship. Positive: Occupied snag shelter. Negative: Any standing dead tree assigned benefit.
Occupied snag shelter; excludes Any standing dead tree assigned benefit. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q05: Does a parasite benefit while its host is harmed?

Sources: SYMBIOSIS; original order 5; incidence: ecology-c11.
Draft expression: `ecology:Parasitizes linking life:Organism to life:Organism`
Expected expression-result category: relationship. Positive: Evidence of feeding/harm in scoped interaction. Negative: Close association assumed parasitism.
Evidence of feeding/harm in scoped interaction; excludes Close association assumed parasitism. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q06: Are two associated organisms both benefiting from the interaction?

Sources: SYMBIOSIS; original order 6; incidence: ecology-c12.
Draft expression: `ecology:Mutualism linking life:Organism to life:Organism`
Expected expression-result category: relationship. Positive: Benefits on specified outcome axes. Negative: Association alone.
Benefits on specified outcome axes; excludes Association alone. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q07: Are newly arriving organisms establishing local reproducing populations?

Sources: NPS; original order 7; incidence: ecology-c04.
Draft expression: `ecology:Colonization`
Expected expression-result category: process. Positive: Arrival followed by establishment criterion. Negative: Transient visitor.
Arrival followed by establishment criterion; excludes Transient visitor. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q08: Did the last locally surviving individual die, or was the population not found?

Sources: NPS; original order 8; incidence: ecology-c14.
Draft expression: `ecology:LocalExtirpation`
Expected expression-result category: event. Positive: Bounded local cessation with detection evidence. Negative: One negative survey.
Bounded local cessation with detection evidence; excludes One negative survey. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q09: How much living material is present in the community?

Sources: FOOD; original order 9; incidence: ecology-c19.
Draft expression: `ecology:CommunityBiomass of ecology:Community`
Expected expression-result category: quality. Positive: Defined living biomass pool. Negative: Total wet soil mass.
Defined living biomass pool; excludes Total wet soil mass. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q10: Which feeding links could carry a disturbance beyond the burned patch?

Sources: FOOD; original order 10; incidence: ecology-c09.
Draft expression: `ecology:FeedsOn linking life:Organism to life:Organism`
Expected expression-result category: relationship. Positive: Supported links; effects require model. Negative: All links assumed equally strong.
Supported links; effects require model; excludes All links assumed equally strong. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q11: Does an aquatic community meet a locally chosen reference condition?

Sources: EPA; original order 11; incidence: upstream gap.
Expression: **explicit gap** — reference authority/model gap.
Expected expression-result category: unresolved. Positive: Matched reference waterbody and criteria. Negative: Universal healthy threshold.
Matched reference waterbody and criteria; excludes Universal healthy threshold. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate. Explicit gap: reference authority/model gap; unavailable evidence does not imply false/zero/unchanged. UPSTREAM GAP: BiologicalCondition identity/reference distinction not established; no local workaround.

### ecology-q12: Has a disturbance started a shift in community composition?

Sources: NPS; original order 12; incidence: ecology-c05.
Draft expression: `ecology:Succession`
Expected expression-result category: process. Positive: Documented temporal replacement. Negative: Automatic fixed trajectory after every fire.
Documented temporal replacement; excludes Automatic fixed trajectory after every fire. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q13: Is a habitat patch occupied continuously or only occasionally?

Sources: FOOD; original order 13; incidence: ecology-c03.
Draft expression: `ecology:HabitatPatch`
Expected expression-result category: subject. Positive: Occupancy records for defined organism context. Negative: Suitability equated with presence.
Occupancy records for defined organism context; excludes Suitability equated with presence. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q14: Do organisms compete for the same limiting resource?

Sources: NPS; original order 14; incidence: ecology-c13.
Draft expression: `ecology:CompetesWith linking life:Organism to life:Organism`
Expected expression-result category: relationship. Positive: Resource limitation and interaction evidence. Negative: Same resource use alone.
Resource limitation and interaction evidence; excludes Same resource use alone. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### ecology-q15: Would unchanged species richness prove the ecosystem has recovered?

Sources: EPA; original order 15; incidence: ecology-c18.
Expression: **explicit gap** — negative semantic probe.
Expected expression-result category: unresolved. Positive: Composition/functions/reference considered separately. Negative: One summary metric equated with recovery.
Composition/functions/reference considered separately; excludes One summary metric equated with recovery. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate. Explicit gap: negative semantic probe; unavailable evidence does not imply false/zero/unchanged.

## Candidate meanings, ancestry and bindings

Alternatives for review, not declarations. Empty confers is intentional: generic roles are not manufactured. Every root alias below is foundational type context only, not a selected explicit specialization axiom. No redundant is clauses may be generated. All articulation records are blocked under this task's stronger imported-derivation requirement; scientific plausibility is separately indexed.

### ecology-c01 Population — subject

Individuals of selected biological identity in a declared ecological context.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: PopulationAbundance, age composition. Occurrent parameters: not applicable.
Bindings: {}
Source: FOOD; positive: Delimited fish population; negative: All co-located organisms. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c02 Community — subject

Co-occurring biological populations under ecological interactions and stated boundary.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: SpeciesRichness, CommunityBiomass. Occurrent parameters: not applicable.
Bindings: {}
Source: FOOD; positive: Defined aquatic community; negative: Intentional agent assumed. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c03 HabitatPatch — subject

Delimited place considered as habitat for a specified organism/population.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: Area, resource availability. Occurrent parameters: not applicable.
Bindings: {}
Source: NPS; positive: Organism-specific patch; negative: Suitability independent of organism. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c04 Colonization — process

Arrival and establishment in a previously unoccupied ecological context.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: PopulationAbundance, establishment evidence.
Bindings: {"affects": ["ecology:PopulationAbundance"], "rationale": "Arrival alone insufficient; establishment criterion required."}
Source: NPS; positive: Establishing immigrants; negative: Transient visitor. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c05 Succession — process

Temporal community-composition alteration through ecological occurrences.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Species composition, CommunityBiomass.
Bindings: {"affects": ["ecology:Community"], "rationale": "No universal endpoint or obligatory postfire sequence."}
Source: DENALI; positive: Observed composition trajectory; negative: Fixed climax assumed. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c06 Predation — process

Consumption involving predator and prey in a feeding context.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Prey availability, consumption rate.
Bindings: {"affects": ["life:Organism"], "rationale": "Consequences require evidence; no automatic extinction cascade."}
Source: FOOD; positive: Supported consumption; negative: Co-location. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c07 Herbivory — process

Consumption of plant material by an organism.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Plant material availability, consumption rate.
Bindings: {"affects": ["life:LivingMass"], "rationale": "May alter plant pool; whole-plant death not entailed."}
Source: NPS; positive: Observed grazing; negative: Mortality without feeding evidence. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c08 ResourceCompetition — process

Interaction through limiting shared resource affecting participants.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Resource availability, participant performance.
Bindings: {"affects": ["ecology:PopulationAbundance"], "rationale": "Potential demographics require context; shared use insufficient."}
Source: NPS; positive: Supported limitation; negative: Use without limitation. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c09 FeedsOn — relationship

Consumer-to-food-organism trophic association in stated context.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "life:Organism", "target": "life:Organism", "rationale": "Supported link, not energy-flow mechanism."}
Source: FOOD; positive: Supported trophic association; negative: Proximity. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c10 Shelters — relationship

Remnant-to-organism shelter provision in documented use context.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "life:BiologicalRemnant", "target": "life:Organism", "rationale": "Use/effect evidence required; not generic value."}
Source: NPS; positive: Animal uses snag; negative: Unoccupied snag assumed benefit. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c11 Parasitizes — relationship

Association benefiting parasite and harming host on specified outcome axes.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "life:Organism", "target": "life:Organism", "rationale": "Direction matters; close association alone insufficient."}
Source: SYMBIOSIS; positive: Host harm with parasite benefit; negative: Commensal association. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c12 Mutualism — relationship

Association benefiting both participants under specified outcomes/context.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "life:Organism", "target": "life:Organism", "rationale": "Two-sided evaluation; outcome can vary by context."}
Source: SYMBIOSIS; positive: Supported reciprocal benefits; negative: Association alone. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.
Scientifically symmetric reading; bond versus directed relationship unresolved. Endpoint labels do not establish direction.

### ecology-c13 CompetesWith — relationship

Organism pair sharing limiting resource with interaction evidence.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "life:Organism", "target": "life:Organism", "rationale": "Ecological competition; no inference from shared resource alone."}
Source: NPS; positive: Competitive effect supported; negative: Unlimited shared resource. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.
Scientifically symmetric reading; bond versus directed relationship unresolved. Endpoint labels do not establish direction.

### ecology-c14 LocalExtirpation — event

Bounded local population cessation through occurrences.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: PopulationAbundance, detection evidence.
Bindings: {"affects": ["ecology:Population"], "rationale": "Not global extinction; nondetection insufficient, consequences unimplemented."}
Source: NPS; positive: Supported local cessation; negative: Empty survey. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c15 Recruitment — event

Entry of individual into defined demographic observation class.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Individual size or stage, PopulationAbundance.
Bindings: {"affects": ["ecology:PopulationAbundance"], "rationale": "Boundary explicit and contextual; not necessarily birth. Specialist source pending."}
Source: NPS; positive: Entry to census class; negative: Growth without class crossing. Status: blocked.
Insufficient direct source support for this precise proposed boundary or binding in inspected source; research lead only, blocked pending targeted primary evidence.


### ecology-c16 CommunityDisturbance — event

Bounded disturbance episode affecting a delimited community.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: CommunityBiomass, species composition.
Bindings: {"affects": ["ecology:Community"], "rationale": "Fire one trigger; magnitude/direction not guaranteed."}
Source: DENALI; positive: Observed fire episode; negative: Any change assumed disturbance. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c17 PopulationAbundance — quality

Number of population members at the observation support.
Parent: `imod:Numerosity` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"target": "ecology:Population", "rationale": "Membership/detection explicit."}
Source: FOOD; positive: Defined member count; negative: Species count. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c18 SpeciesRichness — quality

Number of distinct species identities under declared classification and sampling context.
Parent: `imod:Numerosity` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"target": "ecology:Community", "rationale": "Authority/detection convention required; not total biodiversity."}
Source: EPA; positive: Species count; negative: Individual count. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### ecology-c19 CommunityBiomass — quality

Mass in delimited living community components.
Parent: `imod:Mass` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"target": "ecology:Community", "rationale": "Pool/wet-dry convention external; dead material separate."}
Source: FOOD; positive: Living mass pool; negative: All organic matter. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


## Quality summaries and non-predicates

- **Composition, abundance and reference-comparable functions → Biological condition class**: Authority-defined multi-quality summary; not universal health. Schemes may overlap and need not be exhaustive. provisional; no declaration.
- **Participant outcomes of interaction → Mutualistic/commensal/parasitic**: Benefit/harm comparisons need stated outcome and counterfactual. Context can reverse outcome; no fixed universal identity. provisional; no declaration.

## Coverage and review gates

Category counts: {"subject": 3, "process": 5, "relationship": 5, "event": 3, "quality": 3}. Five/category shortfalls: {"subject": 2, "event": 2}. No weak relations or events padded to meet quota.

Important weaker areas are organ individuation, cell/organism cessation evidence, demographic class boundaries, homologous-segment historical claims and exact gene delimitation. Shortfalls, unused candidates and question incidence are indexed in dossier.json. Source title relevance is not sufficient scientific evidence; explicitly blocked items need stronger sources or removal.

All change and cessation require occurrents. At time transitions change in each quality is resolved separately; unavailable evidence leaves open-world unknown. No retention semantics, zero-change inference or consequence engine is supplied. Creates/affects here are proposed scoped semantic potentials, never guaranteed outcomes. Implication/detection remain syntax-only.

- ecology-a01: Interactions, population/community observations and disturbance/recovery. Population and Community compete with configuration readings; their existing agent declarations are not presumed valid. Decision: Human category/namespace consolidation required; legacy compatibility is not sufficient reason to retain meanings. Blocking: True.
- ecology-a02: Many relevant parameter qualities and participant kinds lack current declarations. Decision: Open upstream issues. Parameters here describe relevant qualities, not ontology model inputs or equations. Blocking: True.
- ecology-a03: Bounded event versus ongoing process reading and object continuity. Decision: Review delimitation and identity; separate change resolution requires occurrent, never no-change inference. Blocking: True.
- ecology-a04: Bryce and Denali have different ecological settings and variable fire responses. Decision: No universal recovery trajectory or mandatory fire benefit; mechanisms belong in models. Blocking: False.
- ecology-a05: Generic root inheritance is not an additional scientific specialization. Decision: Keep foundational type reference separate from selected parent; seek meaningful imported context or explicit user-reviewed relaxation upstream. No redundant is declaration. Blocking: True.

Explored candidates: 19; blocked articulation candidates: 19; semantically ready: 0. Scientific source confidence, category fit and grammatical acceptance are independent coordinates. Counts do not represent completed coverage.

Ready-for-review gates: fix imported revisions; obtain source/domain and ontology review; resolve missing parents/qualities upstream; record parser outcomes per expression and separate adaptation/loaded-semantic/model tests; bind human decisions to exact artifact hashes and proposal revision. No self-review approval. Existing context-pack 1.3 remains the proposal contract. Local dossier fields are instrumentation suggestions only: source-review ledger, question tests, ambiguity decisions and exact-revision approval.

## Explicit invalid probes

- ecology-negative01: `ecology:FeedsOn linking life:Organism to life:Organism`. Treat absence of model/evidence as false, zero or unchanged. Expected: Reject semantic interpretation; open-world unknown. Grammar may accept unchanged expression. Execution: not run.
- ecology-negative02: `ecology:FeedsOn linking imod:Mass to imod:Mass`.  Expected: Reject quality endpoints for substantial relationship. Syntax may still pass. Execution: not run.

## Sources

- **DENALI** [NPS Denali: Ecosystems After Fire](https://www.nps.gov/dena/learn/nature/ecosystems-after-fire.htm). Deep Dive; Changes to Patterns of Fire. Scope: Boreal/tundra recovery and ecological variation. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **EPA** [EPA: Estuarine and Coastal Marine Waters bioassessment guidance](https://www.epa.gov/wqc/fact-sheet-estuarine-and-coastal-marine-waters-bioassessment-and-biocriteria-technical-guidance). Biological Integrity; Reference Condition. Scope: Reference-dependent assessment, not intrinsic universal health. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **FOOD** [NOAA: Aquatic food webs](https://www.noaa.gov/education/resource-collections/marine-life/aquatic-food-webs). Food webs; direct/indirect effects. Scope: Aquatic feeding associations; terrestrial transfer requires review. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **NPS** [NPS Bryce Canyon: Fire Ecology](https://www.nps.gov/brca/learn/nature/fire-ecology.htm). Forest Succession; adaptations; wildlife. Scope: Ponderosa-pine examples; not universal fire benefits. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **SYMBIOSIS** [NOAA Ocean Exploration: What is symbiosis?](https://oceanexplorer.noaa.gov/ocean-fact/symbiosis/). updated 2022-07-08; outcome distinctions. Scope: Close association and mutualistic/commensal/parasitic outcomes; no universal benefit metric. retrieved 2026-10-03; author synthesis, no expert endorsement.
