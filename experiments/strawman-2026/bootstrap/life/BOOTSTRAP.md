# Life bootstrap dossier

Physical biological bearers and life-history occurrences, provisionally distinct from explanatory biology. Old agent Individual and SocialGroup are not conserved by default. Consolidation remains open.

Draft research inventory: no expert discussion or approval occurred. No executable ontology added. All expressions are initially untested. Root references inspected; proposed life parents are missing upstream and never asserted valid.

## Source-first questions

QUESTIONS_FIRST.json preserves original source-led order before candidate rows. This is not an independent holdout; the author knows the broader topic. A component observable is not a full causal answer.

### life-q01: Which living individuals survived in the burned patch, rather than merely leaving detectable remains?

Sources: NPS; original order 1; incidence: life-c01.
Draft expression: `presence of life:Organism`
Expected expression-result category: quality. Positive: Living shoot inspected after fire. Negative: DNA from a dead stem.
Living shoot inspected after fire; excludes DNA from a dead stem. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q02: Is the green patch one organism or several independently rooted individuals?

Sources: CELL; original order 2; incidence: life-c01.
Draft expression: `count of life:Organism`
Expected expression-result category: quality. Positive: Separately bounded individuals. Negative: Count of green pixels.
Separately bounded individuals; excludes Count of green pixels. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q03: How much living material belongs to this organism?

Sources: CELL; original order 3; incidence: life-c18.
Draft expression: `life:LivingMass of life:Organism`
Expected expression-result category: quality. Positive: Mass assigned to a bounded organism. Negative: Dry soil mass.
Mass assigned to a bounded organism; excludes Dry soil mass. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q04: Does the sample contain intact cells or only fragments?

Sources: CELL; original order 4; incidence: life-c02.
Draft expression: `presence of life:Cell`
Expected expression-result category: quality. Positive: Membrane-bounded cell. Negative: Free DNA fragment.
Membrane-bounded cell; excludes Free DNA fragment. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q05: Which tissue in the plant was damaged by heat?

Sources: NPS; original order 5; incidence: life-c03.
Draft expression: `life:Tissue`
Expected expression-result category: subject. Positive: Bark tissue with assessed damage. Negative: Fire perimeter.
Bark tissue with assessed damage; excludes Fire perimeter. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q06: Which organ is still part of the same surviving individual?

Sources: CELL; original order 6; incidence: life-c13.
Draft expression: `life:OrganPart linking life:Organ to life:Organism`
Expected expression-result category: relationship. Positive: Root belonging to this plant. Negative: Nearby unrelated root.
Root belonging to this plant; excludes Nearby unrelated root. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q07: Are seeds present after the fire, and does presence establish that they can germinate?

Sources: NPS; original order 7; incidence: life-c05.
Draft expression: `presence of life:Seed`
Expected expression-result category: quality. Positive: Identified seed; viability separate. Negative: Assuming every seed viable.
Identified seed; viability separate; excludes Assuming every seed viable. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q08: Did an organism die during the fire, or has it simply not been detected?

Sources: NPS; original order 8; incidence: life-c15.
Draft expression: `life:OrganismDeath`
Expected expression-result category: event. Positive: Bounded loss of viable organism. Negative: Missed survey.
Bounded loss of viable organism; excludes Missed survey. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q09: Was a new individual produced by division or was existing biomass merely enlarged?

Sources: CELL; original order 9; incidence: life-c08.
Draft expression: `life:Reproduction`
Expected expression-result category: process. Positive: Production of separately individuated offspring. Negative: Growth of one pre-existing cell.
Production of separately individuated offspring; excludes Growth of one pre-existing cell. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q10: How did the size of the surviving plant change while it regrew?

Sources: NPS; original order 10; incidence: life-c07.
Draft expression: `change in life:LivingMass of life:Organism`
Expected expression-result category: process. Positive: Mass change attributed to growth occurrent. Negative: Missing resurvey interpreted as zero.
Mass change attributed to growth occurrent; excludes Missing resurvey interpreted as zero. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q11: Is a charred standing trunk still a living tree or now a biological remnant?

Sources: NPS; original order 11; incidence: life-c06.
Draft expression: `life:BiologicalRemnant`
Expected expression-result category: subject. Positive: Dead snag retains material continuity. Negative: Unburned live tree.
Dead snag retains material continuity; excludes Unburned live tree. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q12: Which individual is the biological parent of this seedling?

Sources: CELL; original order 12; incidence: life-c14.
Draft expression: `life:ParentOf linking life:Organism to life:Organism`
Expected expression-result category: relationship. Positive: Reproductive lineage evidence. Negative: Nearest adult assumed parent.
Reproductive lineage evidence; excludes Nearest adult assumed parent. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q13: Did a seed germinate, rather than arrive as an already growing seedling?

Sources: NPS; original order 13; incidence: life-c16.
Draft expression: `life:Germination`
Expected expression-result category: event. Positive: Bounded seed-to-seedling transition. Negative: Transplanted seedling.
Bounded seed-to-seedling transition; excludes Transplanted seedling. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q14: Which organisms contain these cells without assuming the cells share one genome?

Sources: CELL; original order 14; incidence: life-c12.
Draft expression: `life:CellPart linking life:Cell to life:Organism`
Expected expression-result category: relationship. Positive: Cellular part of organism. Negative: Surface-associated bacterium automatically called host part.
Cellular part of organism; excludes Surface-associated bacterium automatically called host part. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### life-q15: Can the evidence distinguish dormancy from death?

Sources: CELL; original order 15; incidence: life-c15.
Expression: **explicit gap** — explicit evidence gap.
Expected expression-result category: unresolved. Positive: Repeated viability evidence under specified protocol. Negative: No activity detected once.
Repeated viability evidence under specified protocol; excludes No activity detected once. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate. Explicit gap: explicit evidence gap; unavailable evidence does not imply false/zero/unchanged.

## Candidate meanings, ancestry and bindings

Alternatives for review, not declarations. Empty confers is intentional: generic roles are not manufactured. Every root alias below is foundational type context only, not a selected explicit specialization axiom. No redundant is clauses may be generated. All articulation records are blocked under this task's stronger imported-derivation requirement; scientific plausibility is separately indexed.

### life-c01 Organism — subject

Living individual under an explicitly selected biological individuation criterion.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: LivingMass, structural integrity. Occurrent parameters: not applicable.
Bindings: {}
Source: ORIGIN; positive: Separately individuated plant; negative: Population treated as organism. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c02 Cell — subject

Individuated cellular unit with enclosing boundary and internal organization.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: Volume, membrane integrity. Occurrent parameters: not applicable.
Bindings: {}
Source: ORIGIN; positive: Intact cell; negative: Extracted DNA. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c03 Tissue — subject

Bodily assembly of cells organized under a specified biological function.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: LivingMass, viable cell fraction. Occurrent parameters: not applicable.
Bindings: {}
Source: ORIGIN; positive: Identified leaf tissue; negative: Any co-located microbes. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c04 Organ — subject

Individuated bodily structure integrated in an organism.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: LivingMass, structural dimensions. Occurrent parameters: not applicable.
Bindings: {}
Source: CELL; positive: Root organ; negative: All roots in a map pixel. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c05 Seed — subject

Seed-plant reproductive structure bearing an embryo under a botanical delimitation.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: LivingMass, water content. Occurrent parameters: not applicable.
Bindings: {}
Source: NPS; positive: Seed from cone; negative: Spore treated as seed. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c06 BiologicalRemnant — subject

Material persisting after cessation of a living individual or part.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: Residual mass, structural dimensions. Occurrent parameters: not applicable.
Bindings: {}
Source: NPS; positive: Dead snag; negative: Undetected living plant. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c07 Growth — process

Increase of living individual or part through production and integration of material.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: LivingMass, resource availability.
Bindings: {"affects": ["life:LivingMass"], "rationale": "Growth-related mass change only, not hydration swelling."}
Source: NPS; positive: Regrowth of survivor; negative: Hydration alone. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c08 Reproduction — process

Production of newly individuated biological offspring.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Physiological condition, reproductive output.
Bindings: {"creates": ["life:Organism"], "rationale": "Successful production under explicit individuation; attempts do not guarantee offspring."}
Source: ORIGIN; positive: New cellular individuals; negative: Enlargement only. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c09 Maintenance — process

Biological activity sustaining an individual's organization.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Energy reserve, material turnover.
Bindings: {"affects": ["life:LivingMass"], "rationale": "Material turnover can alter pools; never automatic state retention."}
Source: CELL; positive: Supported metabolic turnover; negative: Assumed persistence rule. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c10 Regeneration — process

Restoration of biological structure through surviving material.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Tissue integrity, growth rate.
Bindings: {"creates": ["life:Tissue"], "rationale": "Demonstrated tissue formation only; no guarantee of complete restoration."}
Source: DENALI; positive: Tissue formation on survivor; negative: Immigrant replacing dead plant. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c11 Decomposition — process

Biological breakdown of dead material; placement shared with ecology/chemistry.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Residual mass, substrate moisture.
Bindings: {"affects": ["life:BiologicalRemnant"], "rationale": "Research candidate; detailed primary source needed, no mineralization guarantee."}
Source: CELL; positive: Biological transformation of remains; negative: Combustion called decomposition. Status: blocked.
Insufficient direct source support for this precise proposed boundary or binding in inspected source; research lead only, blocked pending targeted primary evidence.


### life-c12 CellPart — relationship

Cellular part-to-organism association under the chosen boundary.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "life:Cell", "target": "life:Organism", "rationale": "Constitutive membership, not incidental host association."}
Source: ORIGIN; positive: Plant cell in plant; negative: Surface bacterium automatically host part. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c13 OrganPart — relationship

Organ-to-organism bodily membership.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "life:Organ", "target": "life:Organism", "rationale": "Body part, not ownership."}
Source: CELL; positive: Root belonging to plant; negative: Root merely adjacent. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c14 ParentOf — relationship

Biological progenitor-to-offspring relation under specified reproductive mode.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "life:Organism", "target": "life:Organism", "rationale": "Biological generation; social parentage excluded."}
Source: ORIGIN; positive: Identified progenitor; negative: Caretaker. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c15 OrganismDeath — event

Bounded cessation as a living individual under reviewed viability criteria.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Viability evidence, structural integrity.
Bindings: {"affects": ["life:Organism"], "rationale": "Living reading ends; material may persist; no implemented cascade to dependent relations."}
Source: NPS; positive: Supported organism death; negative: Missed survey. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c16 Germination — event

Bounded onset of seed growth under a botanical recognition criterion.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Seed water content, embryo viability.
Bindings: {"affects": ["life:Seed"], "rationale": "Individual identity continuity unresolved; no automatic creates organism."}
Source: NPS; positive: Observed emergence by criterion; negative: Dormant seed present. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### life-c17 BodilySeparation — event

Bounded detachment of a bodily part.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Attachment integrity.
Bindings: {"affects": ["life:OrganPart"], "rationale": "Ends specific attachment; does not necessarily produce a new organism."}
Source: CELL; positive: Documented detachment; negative: Attached branch moves. Status: blocked.
Insufficient direct source support for this precise proposed boundary or binding in inspected source; research lead only, blocked pending targeted primary evidence.


### life-c18 LivingMass — quality

Mass attributed to a delimited living individual or part.
Parent: `imod:Mass` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"target": "life:Organism,life:Tissue,life:Organ", "rationale": "Dead material excluded; wet/dry conventions in model."}
Source: CELL; positive: Defined living pool; negative: Undifferentiated soil mass. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


## Quality summaries and non-predicates

- **Viability-related physiological evidence → Dormant versus nonviable**: Nominal, assay/species/time dependent; no universal threshold. Nondetection is evidence state, not Dead predicate. provisional; no declaration.
- **LivingMass → Small/large**: Ordered relative to kind and comparison group; overlapping uncertainty, no cutpoint proposed. provisional; no declaration.

## Coverage and review gates

Category counts: {"subject": 6, "process": 5, "relationship": 3, "event": 3, "quality": 1}. Five/category shortfalls: {"relationship": 2, "event": 2}. No weak relations or events padded to meet quota.

Important weaker areas are organ individuation, cell/organism cessation evidence, demographic class boundaries, homologous-segment historical claims and exact gene delimitation. Shortfalls, unused candidates and question incidence are indexed in dossier.json. Source title relevance is not sufficient scientific evidence; explicitly blocked items need stronger sources or removal.

All change and cessation require occurrents. At time transitions change in each quality is resolved separately; unavailable evidence leaves open-world unknown. No retention semantics, zero-change inference or consequence engine is supplied. Creates/affects here are proposed scoped semantic potentials, never guaranteed outcomes. Implication/detection remain syntax-only.

- life-a01: Physical biological bearers and life-history occurrences, provisionally distinct from explanatory biology. Old agent Individual and SocialGroup are not conserved by default. Consolidation remains open. Decision: Human category/namespace consolidation required; legacy compatibility is not sufficient reason to retain meanings. Blocking: True.
- life-a02: Many relevant parameter qualities and participant kinds lack current declarations. Decision: Open upstream issues. Parameters here describe relevant qualities, not ontology model inputs or equations. Blocking: True.
- life-a03: Bounded event versus ongoing process reading and object continuity. Decision: Review delimitation and identity; separate change resolution requires occurrent, never no-change inference. Blocking: True.
- life-a05: Generic root inheritance is not an additional scientific specialization. Decision: Keep foundational type reference separate from selected parent; seek meaningful imported context or explicit user-reviewed relaxation upstream. No redundant is declaration. Blocking: True.

Explored candidates: 18; blocked articulation candidates: 18; semantically ready: 0. Scientific source confidence, category fit and grammatical acceptance are independent coordinates. Counts do not represent completed coverage.

Ready-for-review gates: fix imported revisions; obtain source/domain and ontology review; resolve missing parents/qualities upstream; record parser outcomes per expression and separate adaptation/loaded-semantic/model tests; bind human decisions to exact artifact hashes and proposal revision. No self-review approval. Existing context-pack 1.3 remains the proposal contract. Local dossier fields are instrumentation suggestions only: source-review ledger, question tests, ambiguity decisions and exact-revision approval.

## Explicit invalid probes

- life-negative01: `presence of life:Organism`. Treat absence of model/evidence as false, zero or unchanged. Expected: Reject semantic interpretation; open-world unknown. Grammar may accept unchanged expression. Execution: not run.
- life-negative02: `life:CellPart linking imod:Mass to imod:Mass`.  Expected: Reject quality endpoints for substantial relationship. Syntax may still pass. Execution: not run.

## Sources

- **CELL** [Cooper, The Cell: A Molecular Approach, 2nd edition](https://www.ncbi.nlm.nih.gov/books/NBK9839/). 2000; contents and cellular organization. Scope: Authored textbook hosted by NCBI; chapter headings support research leads, not all operational boundaries. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **DENALI** [NPS Denali: Ecosystems After Fire](https://www.nps.gov/dena/learn/nature/ecosystems-after-fire.htm). Deep Dive; Changes to Patterns of Fire. Scope: Boreal/tundra recovery and ecological variation. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **NPS** [NPS Bryce Canyon: Fire Ecology](https://www.nps.gov/brca/learn/nature/fire-ecology.htm). Forest Succession; adaptations; wildlife. Scope: Ponderosa-pine examples; not universal fire benefits. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **ORIGIN** [Cooper, origin and evolution of cells summary](https://www.ncbi.nlm.nih.gov/books/NBK9943/). 2000; multicellularity. Scope: Cell specialization and cellular organization; no universal individuation criterion. retrieved 2026-10-03; author synthesis, no expert endorsement.
