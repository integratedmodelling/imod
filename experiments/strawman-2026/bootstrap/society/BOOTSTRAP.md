# society: domain bootstrap dossier

Status: research draft, not ready for executable promotion. No expert discussion or human approval has occurred. All names are provisional; all 15 question expressions are untested here until recorded parser results say otherwise. A parser result never validates scientific specialization.

The useful starting distinction is person, household, family, organization and population. They are not interchangeable units. The census source deliberately permits alternative household conventions; this dossier pins the housekeeping reading and records the dwelling-based reading as a non-equivalent alternative. Single-person households make a simplistic SocialGroup ancestry unsafe. A resident population may be a contextual collection rather than an ordinary substantial; this is an upstream issue, not a license to invent a Population parent. Demographic events must be distinguished from registration events and from later records.

## Scope and imported context

Human persons, living arrangements, resident collections, organized collectives and constitutive demographic/social relations. Physical dwellings remain infrastructure; legal regimes remain contextual authorities.

Imported references inspected at commit `46c695b8e360b4e2c1180c57c203844d53723258`: `imod` ([source](../../../../src/imod.kwv)), `life` ([source](../../../../src/life.kwv)), `physical` ([source](../../../../src/physical.kwv)). These are source references, not approval of the proposed derivation. Each candidate below names an actual imported parent reference. Broad upper ancestry is necessary but insufficient; unresolved bearers, content, endpoint restrictions and meanings remain explicit blockers. No direct ODO import is introduced.

The obsolete decision namespace is not retained as a dossier or proposed dependency. Original checkout changes remain attributed in the previous inventory, and none are modified by this dossier.

## Source-first questions and provenance

[QUESTION_ORIGIN.json](QUESTION_ORIGIN.json) was written before constructing this dossier's candidate vocabulary. It preserves the sequence, source motivation and text of 15 questions. The drafting agent had already read current ontologies and the prior packet, so these are not independent held-out questions. No claim of independent validation is made. Obtain new probes from a reviewer who has not seen the candidates.

Sources motivate the inquiry; the category assignments and precise candidate definitions below are proposed interpretations. A published standard's operational convention is not automatically a universal concept. Reading depth is explicit:

- **CENSUS3** — [UNSD Principles and Recommendations for Population and Housing Censuses, Revision3](https://unstats.un.org/unsd/demographic-social/Standards-and-Methods/files/Principles_and_Recommendations/Population-and-Housing-Censuses/Series_M67rev3-E.pdf). Locator: 2017; paragraphs2.33-38 and4.121-128. Read status: official PDF scoped paragraphs read; retrieved 2026-10-03. Supported scope: Housekeeping/dwelling-based household conventions and household/family distinctions. This is a pinned edition; Revision4 exists and requires separate reconciliation.
- **OSTROM** — [Elinor Ostrom, Beyond Markets and States](https://www.nobelprize.org/uploads/2018/06/ostrom_lecture.pdf). Locator: 2009 Nobel lecture, action-situation diagram and discussion of polycentric governance. Read status: primary author lecture, search text retrieved; direct open failed; retrieved 2026-10-03. Supported scope: Supports attention to participants, control, rules and diverse institutional arrangements. Proposed domain concepts below are interpretations, not an extracted universal taxonomy.
- **EVAC** — [UNDRR Sendai terminology: Evacuation](https://www.undrr.org/terminology/evacuation). Locator: 2017 definition and annotation. Read status: official definition read; retrieved 2026-10-03. Supported scope: Temporary protective relocation differs from migration and can occur before, during or after a hazard.
- **VITAL** — [UNSD Principles and Recommendations for a Vital Statistics System, Revision3](https://unstats.un.org/unsd/demographic-social/Standards-and-Methods/files/Principles_and_Recommendations/CRVS/M19Rev3-E.pdf). Locator: 2014; chapterI, vital-event definitions. Read status: official PDF search excerpt and contents reviewed; definitions not fully audited; retrieved 2026-10-03. Supported scope: Motivates separation of demographic occurrences from registration. Specific event-boundary and jurisdiction definitions need close review before acceptance.
- **DISPLACE** — [UNDRR Understanding disaster displacement and assessing future risk](https://www.undrr.org/resource/case-study/understanding-disaster-displacement-and-assessing-future-risk). Locator: 2025-07-18; paragraphs on return and data gaps. Read status: official case-study search text read; retrieved 2026-10-03. Supported scope: Observations after initial evacuation are often incomplete; housing damage is an imperfect proxy for continuing displacement.

## Candidate inventory and mandatory ancestry

Bindings are semantic design notes, not executable clauses or runtime claims. Empty affects/creates/confers sets are intentional where universal support is absent. Relevant quality parameters do not contain equations. A named parameter that lacks a reviewed quality/bearer is an upstream issue, not an implemented model input. The counts include blocked alternatives and do not measure readiness.

### Subject candidates (5)

5/5 proposed meanings, not five new approved kinds: HumanPerson is a proposed rename/clarification of HumanIndividual; ResidentPopulation and FamilyNetwork have category/boundary blockers.

**society-c01: HumanPerson** — blocked.

A human individual viewed as the bearer of demographic and social observations. Proposed imported parent: `life:Individual` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bearer/qualities: PersonAge; usual-residence relation.

Positive: A resident temporarily staying with relatives. Negative: A household counted as one person. Blocking issue: Do not duplicate society:HumanIndividual: proposed rename/clarification only; human identity import required.

**society-c02: HousekeepingHousehold** — blocked.

A bounded living arrangement constituted by one person or people sharing provision for essentials under the housekeeping convention. Proposed imported parent: `imod:Subject` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bearer/qualities: HouseholdSize; HouseholdComposition.

Positive: Unrelated residents jointly provision meals and essentials. Negative: All people in one building solely because they share its address. Blocking issue: Identity/persistence rule unresolved; life:SocialGroup would exclude or confuse single-person cases.

**society-c03: Organization** — blocked.

An organized collective whose identity is maintained by recognized membership and constituting rules rather than by an unchanged roster. Proposed imported parent: `imod:Agent` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bearer/qualities: OrganizationMembershipCount.

Positive: A water association continues after an officer replacement. Negative: An administrative list of unrelated people. Blocking issue: Relation to society:Institution and agency:SocialAgent must be decided; not every institution is a collective agent.

**society-c04: ResidentPopulation** — blocked.

The collection of people satisfying a declared usual-residence convention for a specified area/context. Proposed imported parent: `imod:Subject` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bearer/qualities: ResidentCount.

Positive: Usual residents including temporarily absent members. Negative: Everyone photographed in a square at noon. Blocking issue: Collection versus substantial/configuration requires upstream issue; no invented population upper class.

**society-c05: FamilyNetwork** — blocked.

A bounded group identified by explicitly specified family relationships, not by sharing a dwelling. Proposed imported parent: `life:SocialGroup` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bearer/qualities: member count.

Positive: Related people included under an explicit kinship boundary. Negative: Unrelated housemates automatically called family. Blocking issue: Census family-within-household differs from broader network; boundary and cultural scope must be chosen.

### Process candidates (3)

3/5: many demographic rates are derived qualities; birth/death are bounded events rather than extra processes added to meet a quota.

**society-c06: ResidentialMigration** — provisional.

Movement through which people change usual residence under a declared residence convention. Proposed imported parent: `imod:Process` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3, EVAC.

Relevant qualities/parameters: change in ResidentCount; migration participation count. Unresolved parameter names are not accepted declarations.

Bindings: affects: ResidentCount of affected origin/destination populations | creates: none asserted | confers: none asserted | rationale: Only a completed residence change changes membership; movement alone does not. Proposed quantitative consequence needs model..

Positive: A person relocates their usual home to another area. Negative: An overnight protective evacuation.

**society-c07: HouseholdFormation** — blocked.

The establishment of an identifiable shared or single-person provision-for-living arrangement. Proposed imported parent: `physical:Activity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Relevant qualities/parameters: HouseholdSize. Unresolved parameter names are not accepted declarations.

Bindings: affects: none asserted | creates: HousekeepingHousehold only when identity criteria are met | confers: none asserted | rationale: Prospective creates binding is scoped to an actual constituted household, not any co-location..

Positive: People establish one common housekeeping arrangement. Negative: A set of strangers boards a bus. Blocking issue: Source describes units rather than formation mechanism; process/event boundary unresolved.

**society-c08: OrganizingCollective** — provisional.

Participants establish a collective's membership and operating rules. Proposed imported parent: `physical:Activity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Relevant qualities/parameters: OrganizationMembershipCount. Unresolved parameter names are not accepted declarations.

Bindings: affects: none asserted | creates: Organization upon successful constitution | confers: none asserted | rationale: Attempted organizing may fail; creation belongs to a separately identified constitution event..

Positive: Users form a water association with agreed rules. Negative: A researcher groups survey responses.

### Relationship candidates (5)

5/5 with parent/partnership senses still requiring split or qualification.

**society-c09: HouseholdMembership** — provisional.

Person's membership in a specified housekeeping household. Proposed imported parent: `imod:Relationship` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bindings: source: life:Individual | target: imod:Subject | rationale: Qualified endpoints above are imported broad types; narrower dossier subjects require approval. Relation scope and change occurrences remain explicit..

Positive: Common living provision under declared convention. Negative: Same street address alone.

**society-c10: UsualResidenceIn** — provisional.

Person's usual-residence relation to a specified place under a declared reference convention. Proposed imported parent: `imod:Relationship` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bindings: source: life:Individual | target: physical:Feature | rationale: Qualified endpoints above are imported broad types; narrower dossier subjects require approval. Relation scope and change occurrences remain explicit..

Positive: Temporarily absent resident linked to their usual home area. Negative: A holiday visit.

**society-c11: ParentOf** — blocked.

Directed parent-child relation under an explicitly declared biological, adoptive or legal reading. Proposed imported parent: `imod:Relationship` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bindings: source: life:Individual | target: life:Individual | rationale: Qualified endpoints above are imported broad types; narrower dossier subjects require approval. Relation scope and change occurrences remain explicit..

Positive: A recorded adoptive parent-child relation in its legal scope. Negative: A caregiver automatically inferred to be a parent. Blocking issue: Polysemous family/legal senses must be split before execution.

**society-c12: RecognizedPartnership** — blocked.

Partnership relation recognized under a declared social or legal convention. Proposed imported parent: `imod:Relationship` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VITAL.

Bindings: source: life:Individual | target: life:Individual | rationale: Qualified endpoints above are imported broad types; narrower dossier subjects require approval. Relation scope and change occurrences remain explicit..

Positive: A partnership established under the stated convention. Negative: Any pair sharing a dwelling. Blocking issue: Polysemous family/legal senses must be split before execution.

**society-c13: OrganizationMembership** — provisional.

Agent's recognized membership in an identified organization. Proposed imported parent: `imod:Relationship` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bindings: source: imod:Agent | target: imod:Agent | rationale: Qualified endpoints above are imported broad types; narrower dossier subjects require approval. Relation scope and change occurrences remain explicit..

Positive: Member admitted under the organization's rules. Negative: Person who receives the organization's service.

### Event candidates (5)

5/5 with vital-event definitions needing close reading; organization dissolution remains a gap.

**society-c14: LiveBirth** — blocked.

Bounded live-birth occurrence as defined in the pinned vital-statistics standard. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VITAL.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: creates candidate HumanIndividual observation; biological identity/beginning is not settled here.

Positive: A birth showing the standard's signs of life. Negative: Registration entered later. Blocking issue: Imported upper event exists; domain boundary definition and downstream bindings require human review.

**society-c15: Death** — blocked.

Bounded cessation of a person's life under the applicable vital-event definition. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VITAL.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: affects dependent memberships via cessation; no automatic graph cascade implemented.

Positive: Confirmed death occurrence. Negative: An absent person with no response. Blocking issue: Imported upper event exists; domain boundary definition and downstream bindings require human review.

**society-c16: MarriageFormation** — blocked.

Bounded occurrence establishing a marriage under a specified recognition regime. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VITAL.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: creates a qualified partnership relation only where recognition rules hold.

Positive: A legally recognized marriage occurrence. Negative: A celebratory gathering with no corresponding status change. Blocking issue: Imported upper event exists; domain boundary definition and downstream bindings require human review.

**society-c17: Divorce** — blocked.

Bounded recognized dissolution of an existing marriage. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VITAL.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: ends that qualified partnership through an occurrent; no universal family-network destruction.

Positive: A legally effective dissolution. Negative: Temporary separation or estrangement alone. Blocking issue: Imported upper event exists; domain boundary definition and downstream bindings require human review.

**society-c18: ResidenceChange** — blocked.

Bounded transition in a person's usual-residence relation under an explicit reference convention. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3, EVAC.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: affects origin/destination population membership; change in ResidentCount separately resolved.

Positive: Completion of a qualifying relocation. Negative: Temporary evacuation with unchanged usual residence. Blocking issue: Imported upper event exists; domain boundary definition and downstream bindings require human review.

### Quality candidates (5)

5 explicit candidates; HouseholdComposition is likely authority-backed and PersonAge should reuse a reviewed specialization.

**society-c19: ResidentCount** — provisional.

Number of people belonging to an explicitly delimited resident population. Proposed imported parent: `imod:Numerosity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bearer/qualities: bearer:ResidentPopulation.

Positive: Residents with stated reference date and convention. Negative: All mobile-phone devices detected.

**society-c20: HouseholdSize** — provisional.

Number of persons belonging to one specified household. Proposed imported parent: `imod:Numerosity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bearer/qualities: bearer:HousekeepingHousehold.

Positive: Three members sharing provision for essentials. Negative: Number of rooms.

**society-c21: PersonAge** — provisional.

Elapsed age of a human individual measured from a declared birth reference. Proposed imported parent: `physical:Age` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VITAL.

Bearer/qualities: bearer:life:Individual.

Positive: Person's age from accepted birth occurrence. Negative: Date when the record was digitized.

**society-c22: OrganizationMembershipCount** — provisional.

Number of agents recognized as members under one organization's membership rules. Proposed imported parent: `imod:Numerosity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bearer/qualities: bearer:Organization.

Positive: Roster reconciled with admissions and departures. Negative: All people on a mailing list.

**society-c23: HouseholdComposition** — blocked.

Nominal description of a household's membership pattern under a specified classification. Proposed imported parent: `imod:Type` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: CENSUS3.

Bearer/qualities: bearer:HousekeepingHousehold.

Positive: Composition under a declared census scheme. Negative: A universal quality of social desirability. Blocking issue: Authority classification rather than universal categorical ontology; preserve scheme identity.

## Quality summaries and predicates

- **HouseholdSize → SinglePerson versus MultiPerson household** (provisional): Ordered count partition at1 andgreaterthan1 follows stated housekeeping unit; empty arrangement is not a household. Unknown membership is not zero. No unknown/unmeasured/disputed predicate; preserve evidence state.
- **PersonAge → Age bands** (blocked): Ordered but scheme-specific intervals; no child/elderly boundaries invented. Retain exact authority and interval inclusivity. No unknown/unmeasured/disputed predicate; preserve evidence state.
- **HouseholdComposition → Nominal household type** (blocked): No universal order; schemes can overlap and use different membership conventions. Map authorities explicitly without automatic equality. No unknown/unmeasured/disputed predicate; preserve evidence state.

No generic Valuable, Vulnerable, Autonomous, Good or Resilient predicate is minted merely because the word is useful in conversation. Classification thresholds, comparisons and scopes must be supplied and reviewed. Schemes are not declared exhaustive or disjoint without evidence.

## Question-by-question semantic tests

Expressions below are candidate observable strings, not complete query programs. A name can parse while being undeclared or incorrectly specialized. Null expressions are explicit formulation gaps. Each question needs the dependencies and positive/negative case, not just a plausible-looking path.

### society-q01: How many people normally live here, including those temporarily away during the fire?

Source-first sequence 1; sources CENSUS3. Motivation: usual residence versus current presence. Concepts: society-c04, society-c19.

Draft expression: `society:ResidentCount of society:ResidentPopulation`. Expected expression-result category: quality. Expected interpretation: Count residents under stated convention, including qualifying temporary absences.

Positive: Temporarily absent usual resident included. Negative: Tourist included solely by current presence.

Dependencies/checks: Count residents under stated convention, including qualifying temporary absences.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q02: Do two families sharing one building form one household?

Source-first sequence 2; sources CENSUS3. Motivation: housekeeping versus dwelling-based convention. Concepts: society-c02, society-c05.

Draft expression: `society:HousekeepingHousehold`. Expected expression-result category: subject. Expected interpretation: Need provisioning evidence; dwelling and family counts cannot substitute.

Positive: Two separate provision arrangements in one dwelling. Negative: One building forced to one household.

Dependencies/checks: Need provisioning evidence; dwelling and family counts cannot substitute.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q03: Who lives alone and might need help leaving a threatened area?

Source-first sequence 3; sources CENSUS3. Motivation: single-person household does not imply helplessness. Concepts: society-c02, society-c20.

Draft expression: `society:HouseholdSize of society:HousekeepingHousehold`. Expected expression-result category: quality. Expected interpretation: Size-one household is observable; assistance need is separate.

Positive: One-person household independently observed. Negative: Living alone deemed unable to evacuate.

Dependencies/checks: Size-one household is observable; assistance need is separate.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q04: Which children and adults are members of the same household?

Source-first sequence 4; sources CENSUS3. Motivation: membership rule and reference context. Concepts: society-c09.

Draft expression: `society:HouseholdMembership`. Expected expression-result category: relationship. Expected interpretation: Person-to-household membership under a named rule.

Positive: Members share housekeeping arrangement. Negative: Visitors automatically members.

Dependencies/checks: Person-to-household membership under a named rule.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q05: How many residents moved away rather than merely evacuated overnight?

Source-first sequence 5; sources EVAC. Motivation: temporary protective movement versus usual-residence change. Concepts: society-c06, society-c18.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Distinguish usual-residence transition from temporary evacuation; requires linked residence observations.

Positive: Qualifying residence move. Negative: Overnight shelter stay classified as migration.

Dependencies/checks: Distinguish usual-residence transition from temporary evacuation; requires linked residence observations.; Explicit formulation gap: no complete observable expression claimed.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q06: Which households changed membership after a birth?

Source-first sequence 6; sources VITAL. Motivation: birth occurrence versus registration. Concepts: society-c14, society-c09.

Draft expression: `society:LiveBirth`. Expected expression-result category: event. Expected interpretation: Birth event and household-membership change independently identified; no automatic household assignment.

Positive: Birth plus observed admission to household. Negative: Registration timestamp used as birth time.

Dependencies/checks: Birth event and household-membership change independently identified; no automatic household assignment.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q07: How many people died during the disaster, without assuming that every death was caused by it?

Source-first sequence 7; sources VITAL. Motivation: death occurrence versus causal attribution. Concepts: society-c15.

Draft expression: `society:Death`. Expected expression-result category: event. Expected interpretation: Count deaths in context separately from fire-attribution models.

Positive: Confirmed death during event window. Negative: Missing resident presumed dead.

Dependencies/checks: Count deaths in context separately from fire-attribution models.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q08: Who is related by parenthood even though they live apart?

Source-first sequence 8; sources CENSUS3. Motivation: family relationship versus coresidence. Concepts: society-c11.

Draft expression: `society:ParentOf`. Expected expression-result category: relationship. Expected interpretation: Choose and expose biological/adoptive/legal reading; living apart irrelevant to relation criterion.

Positive: Qualifying adoptive parent living elsewhere. Negative: Co-resident adult inferred parent.

Dependencies/checks: Choose and expose biological/adoptive/legal reading; living apart irrelevant to relation criterion.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q09: Which organizations remain identifiable when their staff change?

Source-first sequence 9; sources OSTROM. Motivation: organization persistence is not personnel equality. Concepts: society-c03, society-c13.

Draft expression: `society:Organization`. Expected expression-result category: subject. Expected interpretation: Identity persists under reviewed constitution rules despite roster changes.

Positive: Association continues after officer election. Negative: Mailing list treated as collective agent.

Dependencies/checks: Identity persists under reviewed constitution rules despite roster changes.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q10: Did marriage or divorce change a legally recognized partnership?

Source-first sequence 10; sources VITAL. Motivation: jurisdiction and recognized union boundaries. Concepts: society-c16, society-c17, society-c12.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Jurisdiction and recognition convention needed; no universal marriage status taxonomy.

Positive: Recognized dissolution with identified parties. Negative: Estrangement equated to divorce.

Dependencies/checks: Jurisdiction and recognition convention needed; no universal marriage status taxonomy.; Explicit formulation gap: no complete observable expression claimed.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q11: Which people share essential living arrangements without being relatives?

Source-first sequence 11; sources CENSUS3. Motivation: household not equivalent to kinship. Concepts: society-c02, society-c05.

Draft expression: `society:HousekeepingHousehold`. Expected expression-result category: subject. Expected interpretation: Housekeeping relation independent of family kinship.

Positive: Unrelated housemates share provision. Negative: Related persons living separately assumed one household.

Dependencies/checks: Housekeeping relation independent of family kinship.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q12: How many evacuees are still away from their usual homes?

Source-first sequence 12; sources DISPLACE. Motivation: observation gap cannot imply return. Concepts: society-c10.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Need current whereabouts and return observations; no automatic retention or return inference.

Positive: Confirmed person still away after evacuation. Negative: Missing follow-up interpreted as return.

Dependencies/checks: Need current whereabouts and return observations; no automatic retention or return inference.; Explicit formulation gap: no complete observable expression claimed.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q13: When did an organization begin or cease to exist?

Source-first sequence 13; sources OSTROM. Motivation: institutional constituting or dissolving occurrence. Concepts: society-c08, society-c03.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Organization constitution/dissolution event concepts unresolved; do not infer cease from roster silence.

Positive: Explicit dissolution act under rules. Negative: No recent website update treated as dissolution.

Dependencies/checks: Organization constitution/dissolution event concepts unresolved; do not infer cease from roster silence.; Explicit formulation gap: no complete observable expression claimed.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q14: Are visitors counted as residents in this estimate?

Source-first sequence 14; sources CENSUS3. Motivation: reference-population convention explicit. Concepts: society-c04, society-c19.

Draft expression: `society:ResidentPopulation`. Expected expression-result category: subject. Expected interpretation: Reference convention distinguishes visitors and usual residents.

Positive: Visitor excluded from usual-resident count. Negative: All overnight guests included without convention.

Dependencies/checks: Reference convention distinguishes visitors and usual residents.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### society-q15: Which households lack a conventional dwelling but still share provision for essentials?

Source-first sequence 15; sources CENSUS3. Motivation: household does not require dwelling ownership. Concepts: society-c02.

Draft expression: `society:HousekeepingHousehold`. Expected expression-result category: subject. Expected interpretation: Housekeeping convention admits arrangements without conventional housing.

Positive: People without a dwelling share essentials. Negative: No address means no household.

Dependencies/checks: Housekeeping convention admits arrangements without conventional housing.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; life; physical Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

## Incidence, coverage and revisions driven by questions

The 15 questions contain 11 draft expression strings and 4 explicit formulation gaps. The machine-readable dossier contains a complete concept-to-question incidence map. Concepts not exercised directly by these questions: society-c01 (HumanPerson), society-c07 (HouseholdFormation), society-c21 (PersonAge), society-c22 (OrganizationMembershipCount), society-c23 (HouseholdComposition). An unused concept is a coverage weakness to review, not an instruction to invent a question just to justify it.

Questions2,11 and15 prevent identifying household with dwelling, family or housing tenure. Question5 forces temporary evacuation apart from residence-changing migration. Questions6,7 and13 distinguish a real occurrence from a register update or lack of recent records. Population and family candidates remain blocked despite helping frame these questions.

## Ambiguities, alternatives and upstream issues

- A-SOCIETY-01: household housekeeping and dwelling conventions not equivalent; schema authority must travel with data.
- A-SOCIETY-02: institution can mean a rule arrangement or an organized body. Existing society:Institution does not settle which.
- A-SOCIETY-03: resident population identity changes by births, deaths and migration; no hidden retention/automatic membership cascade.
- A-SOCIETY-04: family readings vary by relationship and cultural/legal scope. Do not force a worldwide family taxonomy.
- A-SOCIETY-05: original dirty society Human move is attributed in prior packet but not applied here. Import life:Human/life:Individual in current base remains an explicit comparison point.
- A-SOCIETY-06: Revision4 census guidance exists; this dossier deliberately cites the read Revision3 paragraphs, not a falsely reconciled current consensus.

## Change, consequences and model boundary

Only an occurrent can establish change or cessation. When occurrences induce a context transition, changes in the relevant qualities must resolve separately. A withdrawal, dissolution, death, damage or revision does not imply a programmed graph cascade in this packet. Implication/detection remain syntax-only. No state-retention semantics are invented; missing change knowledge does not stop an open-world twin and does not mean no real change. Hypotheses about trust, cooperation, choice, damage, loss and valuation mechanisms belong in k.IM descriptions, not unconditional ontology causes.

## Validation, review gates and instrumentation

Local dossier schema/incidence checks are separate from actual language parsing, adaptation, loaded-worldview reasoning and model execution. Parent validation may subsequently update the JSON grammar statuses and shared parser report; this drafting document records the initial untested state. No .kwv source was created for these concepts. Suggested invalid grammar control: `society:HumanPerson of`. The per-question negative examples are scientific/semantic controls that may still be syntactically legal.

Required next gates:

1. Resolve blocking meaning/ancestry and upstream issues.
2. Confirm exact source sections and competing interpretations with domain experts.
3. Reconcile question meanings with proposed declarations; obtain fresh independent probes.
4. Create context-pack1.3 proposal with exact import revisions and artifact hashes.
5. Run parser, adapter and loaded-worldview tests separately; preserve failures.
6. Human approval of exact revision/actions before executable promotion; no self-approval.

The dossier is a local research index, not an API contract. Map accepted concepts into the existing context-pack1.3 assets/evidence/existing_ontologies/alignment/open_questions fields. Proposed stage needs are a source-review ledger, question-semantic results, ambiguity decisions, exact import/artifact hashes and approval bound to the proposal revision/action IDs. Preserve request-changes history and stable IDs. Do not treat workflow acceptance or schema validity as scientific approval. At ready-for-review, record both blocking issues and explicitly deferred nonblocking extensions; this version still has blocking issues.
