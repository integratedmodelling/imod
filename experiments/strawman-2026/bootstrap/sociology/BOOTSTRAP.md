# sociology: domain bootstrap dossier

Status: research draft, not ready for executable promotion. No expert discussion or human approval has occurred. All names are provisional; all 15 question expressions are untested here until recorded parser results say otherwise. A parser result never validates scientific specialization.

This dossier treats social relations as directed and contextual. Trust toward a warning source is not its measured reliability; assistance promised is not assistance delivered; eligibility is not attendance. Ostrom provides a reason to resist forcing all governance into one hierarchy. However, the bounded source set does not represent the breadth of sociology: culture, stratification, identity, conflict and historical institutions require additional traditions and expert participation. Proposed social processes therefore do not assert laws such as trust necessarily creates cooperation or group membership confers resilience.

## Scope and imported context

Observed social ties, participation, collective action, access and expressed trust relevant to collective environmental action. Social structures are not equated with moral worth or universal causal laws.

Imported references inspected at commit `46c695b8e360b4e2c1180c57c203844d53723258`: `imod` ([source](../../../../src/imod.kwv)), `physical` ([source](../../../../src/physical.kwv)), `society` ([source](../../../../src/society.kwv)). These are source references, not approval of the proposed derivation. Each candidate below names an actual imported parent reference. Broad upper ancestry is necessary but insufficient; unresolved bearers, content, endpoint restrictions and meanings remain explicit blockers. No direct ODO import is introduced.

The obsolete decision namespace is not retained as a dossier or proposed dependency. Original checkout changes remain attributed in the previous inventory, and none are modified by this dossier.

## Source-first questions and provenance

[QUESTION_ORIGIN.json](QUESTION_ORIGIN.json) was written before constructing this dossier's candidate vocabulary. It preserves the sequence, source motivation and text of 15 questions. The drafting agent had already read current ontologies and the prior packet, so these are not independent held-out questions. No claim of independent validation is made. Obtain new probes from a reviewer who has not seen the candidates.

Sources motivate the inquiry; the category assignments and precise candidate definitions below are proposed interpretations. A published standard's operational convention is not automatically a universal concept. Reading depth is explicit:

- **OSTROM** — [Elinor Ostrom, Beyond Markets and States](https://www.nobelprize.org/uploads/2018/06/ostrom_lecture.pdf). Locator: 2009 Nobel lecture, action-situation diagram and discussion of polycentric governance. Read status: primary author lecture, search text retrieved; direct open failed; retrieved 2026-10-03. Supported scope: Supports attention to participants, control, rules and diverse institutional arrangements. Proposed domain concepts below are interpretations, not an extracted universal taxonomy.
- **TRUST** — [OECD Guidelines on Measuring Trust](https://www.oecd.org/en/publications/oecd-guidelines-on-measuring-trust_9789264278219-en.html). Locator: 2017; abstract and measurement remit. Read status: official landing-page abstract read; retrieved 2026-10-03. Supported scope: Separates interpersonal and institutional trust; survey design and interpretation matter. Abstract alone does not validate a network or causal theory.
- **VULN** — [UNDRR Sendai terminology: Vulnerability](https://www.undrr.org/terminology/vulnerability). Locator: 2017 definition. Read status: official definition search text read; retrieved 2026-10-03. Supported scope: Susceptibility conditions include physical, social, economic and environmental factors; not synonymous with exposure.
- **ILO154** — [ILO Collective Bargaining Convention,1981(No.154)](https://normlex.ilo.org/dyn/normlex/en/f/f?p=NORMLEXPUB%3A12100%3A0%3A%3ANO%3A12100%3AP12100_INSTRUMENT_ID%3A312299%3ANO). Locator: Articles1-3,5-7. Read status: official instrument search text retrieved; retrieved 2026-10-03. Supported scope: Distinguishes negotiating parties and labor-relation scope. Jurisdiction-specific applicability and legal consequences are not asserted here.

## Candidate inventory and mandatory ancestry

Bindings are semantic design notes, not executable clauses or runtime claims. Empty affects/creates/confers sets are intentional where universal support is absent. Relevant quality parameters do not contain equations. A named parameter that lacks a reviewed quality/bearer is an upstream issue, not an implemented model input. The counts include blocked alternatives and do not measure readiness.

### Subject candidates (2)

2/5 contextual collective candidates. They may compose society:Organization with purpose/roles rather than justify new atomic subjects. Persons, households and organizations should be imported.

**sociology-c01: MutualAidCollective** — blocked.

Identifiable collective organized around members' practical assistance to one another. Proposed imported parent: `society:Institution` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bearer/qualities: MembershipCount; SupportAvailability.

Positive: A neighborhood aid group with recognized members and continuity. Negative: People temporarily queuing at the same distribution point. Blocking issue: society:Institution exists but lacks sufficient definition; parent specialization blocked pending society Organization issue.

**sociology-c02: ResourceUserAssociation** — blocked.

Identifiable organized collective of participants governing use of a specified resource. Proposed imported parent: `society:Institution` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bearer/qualities: MembershipCount; ParticipationShare.

Positive: An association governing a shared water supply. Negative: Everyone who drinks water in the region. Blocking issue: Likely society:Organization with contextual purpose; do not duplicate organization taxonomy before review.

### Process candidates (5)

5/5 research candidates; Communication needs a more direct primary source and CollectiveBargaining may be a specialist/compositional reading.

**sociology-c03: Cooperation** — blocked.

Participants contribute actions toward an explicitly identified shared undertaking. Proposed imported parent: `physical:Activity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Relevant qualities/parameters: ContributionCount. Unresolved parameter names are not accepted declarations.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: affects only independently observed contribution qualities; successful shared outcome not guaranteed.

Positive: A group maintains a shared firebreak. Negative: Adjacent independent clearing projects. Blocking issue: Proposed quantity parameters lack agreed upstream definitions; agency overlaps require alignment.

**sociology-c04: Communication** — blocked.

Agents convey interpretable content to other agents in a stated social interaction. Proposed imported parent: `physical:Activity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: TRUST.

Relevant qualities/parameters: MessageReceiptShare. Unresolved parameter names are not accepted declarations.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: No creates trust or confers informed role; receiving and understanding require separate observations.

Positive: Residents relay a warning to neighbors. Negative: A radio emits an undelivered signal. Blocking issue: Trust source does not supply a communication taxonomy; targeted communication source needed.

**sociology-c05: RuleAmendment** — blocked.

Participants work to alter the rules of an identified social arrangement. Proposed imported parent: `physical:Activity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Relevant qualities/parameters: ParticipationShare. Unresolved parameter names are not accepted declarations.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: Possible affects rule content but upstream norm/content concept absent; no unconditional compliance.

Positive: Members debate and revise water-access rules. Negative: A hydrological process changes available water. Blocking issue: Proposed quantity parameters lack agreed upstream definitions; agency overlaps require alignment.

**sociology-c06: MutualAssistance** — blocked.

Agents provide practical help to others within a specified social context. Proposed imported parent: `physical:Activity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VULN, OSTROM.

Relevant qualities/parameters: SupportDeliveryCount. Unresolved parameter names are not accepted declarations.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: Potential effects on recipients depend on actual help; no deterministic removal of vulnerability.

Positive: Neighbors arrange a ride for a resident. Negative: A list of promised rides that never occur. Blocking issue: Proposed quantity parameters lack agreed upstream definitions; agency overlaps require alignment.

**sociology-c07: CollectiveBargaining** — blocked.

Negotiation between authorized worker and employer parties over labor relations in Convention154 scope. Proposed imported parent: `physical:Activity` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: ILO154.

Relevant qualities/parameters: ParticipationShare. Unresolved parameter names are not accepted declarations.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: No unconditional creates agreement; endpoint roles and scope need agency proposal.

Positive: Worker and employer organizations negotiate cleanup-work conditions. Negative: A vendor negotiates the sale price of a truck. Blocking issue: Proposed quantity parameters lack agreed upstream definitions; agency overlaps require alignment.

### Relationship candidates (4)

4/5: representation belongs in agency rather than duplicate a fifth local relation.

**sociology-c08: ReportedTrustToward** — blocked.

Directed expressed trust from a person toward an identified person or institution. Proposed imported parent: `imod:Relationship` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: TRUST.

Bindings: source: society:HumanIndividual | target: imod:Agent | rationale: Relationship is qualified by its action/resource/report context. Directed trust and support must not be symmetrized..

Positive: A resident reports trust in a named fire service. Negative: An analyst declares the service trustworthy. Blocking issue: Alternative: directed assessment context plus quality rather than independent relationship. Decide before encoding.

**sociology-c09: AvailableSupportTie** — provisional.

Directed availability of a specified practical help from one person or organization to another. Proposed imported parent: `imod:Relationship` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VULN.

Bindings: source: imod:Agent | target: imod:Agent | rationale: Relationship is qualified by its action/resource/report context. Directed trust and support must not be symmetrized..

Positive: An identified neighbor can provide a ride under stated conditions. Negative: General friendship with no identified support.

**sociology-c10: ResourceAccessRelation** — provisional.

A context-qualified relation between an agent and a resource they can access under identified rules and conditions. Proposed imported parent: `imod:Relationship` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bindings: source: imod:Agent | target: imod:Subject | rationale: Relationship is qualified by its action/resource/report context. Directed trust and support must not be symmetrized..

Positive: Member has access to a specified shared water source. Negative: A person lives nearby but is excluded or unable to reach it.

**sociology-c11: CoordinationTie** — provisional.

Relationship between agents coordinating specified actions within a joint undertaking. Proposed imported parent: `imod:Relationship` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bindings: source: imod:Agent | target: imod:Agent | rationale: Relationship is qualified by its action/resource/report context. Directed trust and support must not be symmetrized..

Positive: Organizations coordinate distinct evacuation tasks. Negative: Organizations exist in the same municipality.

### Event candidates (5)

5/5 bounded patterns; source evidence for precise event boundaries remains weak.

**sociology-c12: ParticipationMeeting** — blocked.

Bounded meeting in which people participate in discussion of a specified collective matter. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: No confers representation merely by attendance..

Positive: A watershed meeting with a declared start, end and participant set. Negative: An open-ended online community. Blocking issue: Event interpretation proposed from sources; binding target and boundary require review.

**sociology-c13: RuleAdoption** — blocked.

Bounded recognized adoption of a rule by participants with the requisite authority. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: May change rule applicability; norm content and authority upstream gap..

Positive: Water users adopt an access rule under agreed procedures. Negative: A draft uploaded without adoption. Blocking issue: Event interpretation proposed from sources; binding target and boundary require review.

**sociology-c14: DisputeSettlement** — blocked.

Bounded occurrence ending a specified dispute under the parties' accepted settlement criterion. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: Cessation scoped to that dispute; silence is not settlement..

Positive: Parties adopt a mediated settlement. Negative: One party stops responding. Blocking issue: Event interpretation proposed from sources; binding target and boundary require review.

**sociology-c15: CollectiveFormation** — blocked.

Bounded establishment of an identifiable collective under stated membership/constitution criteria. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: Candidate creates collective only with satisfied identity criterion..

Positive: Residents constitute a mutual-aid group. Negative: Creation of a website. Blocking issue: Event interpretation proposed from sources; binding target and boundary require review.

**sociology-c16: SupportDelivery** — blocked.

Bounded delivery of specified practical assistance to an identified recipient. Proposed imported parent: `imod:Event` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VULN.

Bindings: affects: none asserted | creates: none asserted | confers: none asserted | rationale: Changes recipient circumstances only to extent observed; no automatic resilient/safe predicate..

Positive: A resident is transported to the shelter as arranged. Negative: A pledge to offer transport. Blocking issue: Event interpretation proposed from sources; binding target and boundary require review.

### Quality candidates (3)

3 explicit quality candidates; count/frequency parameters require separate bearer articulation.

**sociology-c17: ReportedTrust** — blocked.

Degree of trust expressed by a person toward a specified referent under a documented elicitation context. Proposed imported parent: `imod:Quality` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: TRUST.

Bearer/qualities: bearer:society:HumanIndividual.

Positive: A response on a documented trust scale. Negative: An institution's measured warning accuracy. Blocking issue: Context and measurement convention needed; not a generic high/low predicate.

**sociology-c18: ParticipationShare** — blocked.

Proportion of the explicitly eligible/reference group participating in a specified event. Proposed imported parent: `imod:Proportion` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: OSTROM.

Bearer/qualities: bearer:imod:Event.

Positive: Attendees among the stated eligible group. Negative: All attendees divided by an unrelated population. Blocking issue: Context and measurement convention needed; not a generic high/low predicate.

**sociology-c19: SupportAvailability** — blocked.

Availability of a specified type of practical assistance to an agent under identified conditions. Proposed imported parent: `imod:Quality` (proposed_parent); existence verified in the inspected source, scientific specialization unreviewed. Sources: VULN.

Bearer/qualities: bearer:imod:Agent.

Positive: A named provider able to deliver a ride when required. Negative: An unspecified feeling that somebody might help. Blocking issue: Context and measurement convention needed; not a generic high/low predicate.

## Quality summaries and predicates

- **ReportedTrust → Higher/lower reported trust** (blocked): Ordering only within matched question, referent, response scale and context. Threshold for HighTrust not invented; mistrust and missing response distinguished. No unknown/unmeasured/disputed predicate; preserve evidence state.
- **ParticipationShare → Participation levels** (provisional): Ordered proportion relative to stated denominator; no universal adequate participation threshold. Equal share need not equal influence. No unknown/unmeasured/disputed predicate; preserve evidence state.
- **SupportAvailability → Available/unavailable for specified help** (blocked): Nominal or ordered only after service type, required timing, capability and eligibility are specified; possible overlap among sources of support. Unknown evidence remains unknown. No unknown/unmeasured/disputed predicate; preserve evidence state.

No generic Valuable, Vulnerable, Autonomous, Good or Resilient predicate is minted merely because the word is useful in conversation. Classification thresholds, comparisons and scopes must be supplied and reviewed. Schemes are not declared exhaustive or disjoint without evidence.

## Question-by-question semantic tests

Expressions below are candidate observable strings, not complete query programs. A name can parse while being undeclared or incorrectly specialized. Null expressions are explicit formulation gaps. Each question needs the dependencies and positive/negative case, not just a plausible-looking path.

### sociology-q01: Whom do residents trust to give reliable wildfire warnings?

Source-first sequence 1; sources TRUST. Motivation: directed reported trust, not demonstrated reliability. Concepts: sociology-c08, sociology-c17.

Draft expression: `sociology:ReportedTrust of society:HumanIndividual`. Expected expression-result category: quality. Expected interpretation: Explicit warning-source referent and elicitation context; this expression omits referent binding and is incomplete semantically.

Positive: Reported trust toward named fire service. Negative: Accuracy substituted for trust.

Dependencies/checks: Explicit warning-source referent and elicitation context; this expression omits referent binding and is incomplete semantically.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q02: Who has someone they can call on for evacuation help?

Source-first sequence 2; sources TRUST. Motivation: support availability differs from delivered help. Concepts: sociology-c09, sociology-c19.

Draft expression: `sociology:AvailableSupportTie`. Expected expression-result category: relationship. Expected interpretation: Provider, recipient, help type and availability conditions required.

Positive: Named neighbor can provide an accessible ride. Negative: Vague friendship counted as available ride.

Dependencies/checks: Provider, recipient, help type and availability conditions required.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q03: Which affected groups were absent from the planning meeting?

Source-first sequence 3; sources OSTROM. Motivation: representation, eligibility and actual attendance. Concepts: sociology-c12, sociology-c18.

Draft expression: `sociology:ParticipationShare of sociology:ParticipationMeeting`. Expected expression-result category: quality. Expected interpretation: Need eligible/reference group and attendance; underrepresentation criterion separate.

Positive: Some eligible group members absent. Negative: No attendees of a group inferred no stake.

Dependencies/checks: Need eligible/reference group and attendance; underrepresentation criterion separate.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q04: Did residents cooperate in maintaining shared firebreaks?

Source-first sequence 4; sources OSTROM. Motivation: joint action versus spatial coincidence. Concepts: sociology-c03.

Draft expression: `sociology:Cooperation`. Expected expression-result category: process. Expected interpretation: Shared undertaking and actual contributions; benefit success separate.

Positive: Joint maintenance with complementary tasks. Negative: Adjacent independent clearing counted cooperation.

Dependencies/checks: Shared undertaking and actual contributions; benefit success separate.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q05: Can people challenge the rules for accessing the community water supply?

Source-first sequence 5; sources OSTROM. Motivation: rule-change participation and appeal. Concepts: sociology-c05, sociology-c10.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Agency authorization plus upstream norm content needed; user access is not rule-change power.

Positive: Recognized appeal/revision route exists. Negative: Use of water inferred authority to change rules.

Dependencies/checks: Agency authorization plus upstream norm content needed; user access is not rule-change power.; Explicit formulation gap: no complete observable expression claimed.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q06: Are people equally able to obtain help, even if they face the same hazard?

Source-first sequence 6; sources VULN. Motivation: access conditions differ from physical exposure. Concepts: sociology-c19, sociology-c10.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Compare practical access and hazard exposure separately, with no single generic vulnerability label.

Positive: Equal exposure with unequal transport access. Negative: Equal hazard assumed equal ability to leave.

Dependencies/checks: Compare practical access and hazard exposure separately, with no single generic vulnerability label.; Explicit formulation gap: no complete observable expression claimed.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q07: Which organizations share responsibility for the watershed?

Source-first sequence 7; sources OSTROM. Motivation: polycentric arrangements not a single hierarchy. Concepts: sociology-c02, sociology-c11.

Draft expression: `sociology:CoordinationTie`. Expected expression-result category: relationship. Expected interpretation: Responsibility/authority norm missing; coordination alone insufficient for legal duty.

Positive: Two associations coordinate different responsibilities. Negative: Coordination inferred single command hierarchy.

Dependencies/checks: Responsibility/authority norm missing; coordination alone insufficient for legal duty.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q08: Did warning messages pass between otherwise disconnected groups?

Source-first sequence 8; sources TRUST. Motivation: communication ties are not trust ties. Concepts: sociology-c04.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Message transfer observable upstream missing; trust tie cannot substitute for receipt.

Positive: Observed warning relay between groups. Negative: Shared trust score treated as communication edge.

Dependencies/checks: Message transfer observable upstream missing; trust tie cannot substitute for receipt.; Explicit formulation gap: no complete observable expression claimed.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q09: How did confidence in local authorities change after the evacuation?

Source-first sequence 9; sources TRUST. Motivation: reported trust change requires occurrence context; no assumed causation. Concepts: sociology-c17.

Draft expression: `change in sociology:ReportedTrust of society:HumanIndividual`. Expected expression-result category: process. Expected interpretation: Separate resolutions at occurrence-induced transition; report before/after with comparable referent, not causal proof.

Positive: Comparable reports differ after evacuation. Negative: No follow-up treated as unchanged trust.

Dependencies/checks: Separate resolutions at occurrence-induced transition; report before/after with comparable referent, not causal proof.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q10: Were workers represented when recovery work conditions were negotiated?

Source-first sequence 10; sources ILO154. Motivation: representation scope and negotiation participants. Concepts: sociology-c07.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Representation must import reviewed agency relation; worker status from relevant domain/authority.

Positive: Authorized delegates negotiate cleanup terms. Negative: Workers present assumed represented.

Dependencies/checks: Representation must import reviewed agency relation; worker status from relevant domain/authority.; Explicit formulation gap: no complete observable expression claimed.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q11: When did a neighborhood mutual-aid group form?

Source-first sequence 11; sources OSTROM. Motivation: formation event versus website creation. Concepts: sociology-c15, sociology-c01.

Draft expression: `sociology:CollectiveFormation`. Expected expression-result category: event. Expected interpretation: Identity/constitution criteria; creation target depends on society group review.

Positive: Recognized collective formation. Negative: New social media page equated with new group.

Dependencies/checks: Identity/constitution criteria; creation target depends on society group review.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q12: Was a dispute settled, or did people merely stop attending?

Source-first sequence 12; sources OSTROM. Motivation: settlement and withdrawal have different interpretations. Concepts: sociology-c14.

Draft expression: `sociology:DisputeSettlement`. Expected expression-result category: event. Expected interpretation: Need agreed settlement criterion and event evidence.

Positive: Parties adopt settlement. Negative: Silence interpreted as agreement.

Dependencies/checks: Need agreed settlement criterion and event evidence.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q13: Did assistance reach isolated residents as well as well-connected residents?

Source-first sequence 13; sources VULN. Motivation: network isolation and material need are separate. Concepts: sociology-c16, sociology-c09.

Draft expression: `sociology:SupportDelivery`. Expected expression-result category: event. Expected interpretation: Delivered help versus network opportunity; compare recipients without conflating isolation and need.

Positive: Documented delivery to isolated resident. Negative: Promised assistance counted delivered.

Dependencies/checks: Delivered help versus network opportunity; compare recipients without conflating isolation and need.; Draft names are research candidates, not declarations in active src; namespace and type resolution remain blocked.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q14: Are people with low reported trust necessarily refusing to cooperate?

Source-first sequence 14; sources TRUST. Motivation: counterexample to unsupported deterministic relation. Concepts: sociology-c17, sociology-c03.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Reject deterministic mapping between reported trust and cooperation; model hypothesis only.

Positive: Low-trust resident still contributes. Negative: Low trust implies no cooperation.

Dependencies/checks: Reject deterministic mapping between reported trust and cooperation; model hypothesis only.; Explicit formulation gap: no complete observable expression claimed.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

### sociology-q15: Can two groups agree on an action while disagreeing about its reasons?

Source-first sequence 15; sources OSTROM. Motivation: coordination is not value consensus. Concepts: sociology-c03, sociology-c13.

Expression: **gap — no complete observable expression claimed**. Expected expression-result category: unresolved. Expected interpretation: Observed joint action need not imply common values; reason content upstream gap.

Positive: Different reasons for same adopted action. Negative: Agreement on action recorded as philosophical consensus.

Dependencies/checks: Observed joint action need not imply common values; reason content upstream gap.; Explicit formulation gap: no complete observable expression claimed.; imod; physical; society Grammar: untested; semantic: blocked. No observation or model execution has been run. A missing resolution is unknown, not false, zero change or evidence of safety.

## Incidence, coverage and revisions driven by questions

The 15 questions contain 9 draft expression strings and 6 explicit formulation gaps. The machine-readable dossier contains a complete concept-to-question incidence map. Concepts not exercised directly by these questions: sociology-c06 (MutualAssistance). An unused concept is a coverage weakness to review, not an instruction to invent a question just to justify it.

Questions1,8,9 and14 separate trust, communication, reliability and cooperation. Questions3,5 and10 expose upstream entitlement and representation gaps. Questions2 and13 require available support and delivered help to remain separate. Agreement on action in question15 does not close disagreement about values.

## Ambiguities, alternatives and upstream issues

- A-SOCIOLOGY-01: relation of trust versus a quality inhering in a person under directed assessment context remains open; do not encode both redundantly.
- A-SOCIOLOGY-02: availability, receipt and effectiveness of support are different observations.
- A-SOCIOLOGY-03: meeting participation is not recognition, entitlement, representation or influence.
- A-SOCIOLOGY-04: social vulnerability is multidimensional and hazard/context specific; disadvantage is not a universal intrinsic predicate of a demographic group.
- A-SOCIOLOGY-05: Communication and SupportAvailability have suggestive relevance sources only; direct measurement literature and community definitions required.
- A-SOCIOLOGY-06: proposed society:Organization must resolve before specialized collective ancestry; do not patch the gap with locally invented upper agents.

## Change, consequences and model boundary

Only an occurrent can establish change or cessation. When occurrences induce a context transition, changes in the relevant qualities must resolve separately. A withdrawal, dissolution, death, damage or revision does not imply a programmed graph cascade in this packet. Implication/detection remain syntax-only. No state-retention semantics are invented; missing change knowledge does not stop an open-world twin and does not mean no real change. Hypotheses about trust, cooperation, choice, damage, loss and valuation mechanisms belong in k.IM descriptions, not unconditional ontology causes.

## Validation, review gates and instrumentation

Local dossier schema/incidence checks are separate from actual language parsing, adaptation, loaded-worldview reasoning and model execution. Parent validation may subsequently update the JSON grammar statuses and shared parser report; this drafting document records the initial untested state. No .kwv source was created for these concepts. Suggested invalid grammar control: `sociology:MutualAidCollective of`. The per-question negative examples are scientific/semantic controls that may still be syntactically legal.

Required next gates:

1. Resolve blocking meaning/ancestry and upstream issues.
2. Confirm exact source sections and competing interpretations with domain experts.
3. Reconcile question meanings with proposed declarations; obtain fresh independent probes.
4. Create context-pack1.3 proposal with exact import revisions and artifact hashes.
5. Run parser, adapter and loaded-worldview tests separately; preserve failures.
6. Human approval of exact revision/actions before executable promotion; no self-approval.

The dossier is a local research index, not an API contract. Map accepted concepts into the existing context-pack1.3 assets/evidence/existing_ontologies/alignment/open_questions fields. Proposed stage needs are a source-review ledger, question-semantic results, ambiguity decisions, exact import/artifact hashes and approval bound to the proposal revision/action IDs. Preserve request-changes history and stable IDs. Do not treat workflow acceptance or schema validity as scientific approval. At ready-for-review, record both blocking issues and explicitly deferred nonblocking extensions; this version still has blocking issues.
