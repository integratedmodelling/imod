# Foundations review — 23 October 2026

Review target: near-complete **first-level ontology articulation**, not Tier-1 resolution strategies. Seven packets cover `imod`, `physical`, `physics`, `chemistry`, `data`, `calendar`, and `engineering`. The accompanying language files are review proposals, not community-accepted ontology changes.

## Verified baseline

Active Resources worldview: `C:/Users/Ferd/.klab/services/resources/workspaces/imod`. Current branch is `worldview/strawman-2026`; both that branch and `master` resolve to `556f3562aad44ead96d2b1e646a67664901e1fc5` (`Make existing relationship direction explicit`). Git reported no working-tree changes. The root imports immutable ODO **0.2.0** at commit `08e5a29abbbd32ca8c1b933fc157a1762ba3ee5c`.

Read-only review used that checkout, its decisions/bootstrap records, and the current `klab-services/llm/DOMAIN_CONTEXT_PACK.md` and ontology-language/grammar documentation. No older `git/imod` or `klab-modeler` checkout was accessed. No repository edits, branch operations, installs, services, builds, commits or publication occurred. Git's ownership check was handled with a per-command `safe.directory` option; no Git configuration was changed. Its global-ignore file was inaccessible, so clean status is reported with that diagnostic caveat. Source hashes accompany this packet.

## Decisions needed first

1. **Quantity foundations:** `imod:Velocity` maps to scalar `odo:Speed`; `physical:Acceleration` differentiates it. Root Mass and Amount prose conflate distinct quantities. Root Temperature prose is too narrow as a general thermodynamic definition. The language operationally treats Energy as intensive; scientific total-energy aggregation needs separate review. Preserve ODO while owners choose corrections and compatibility policy.
2. **Dimension and unit contract:** distinguish known unit, explicit unit one, unknown metadata and nonnumeric/not-applicable values. Generic `physical:Impedance`/`Conductance` cannot share one unit across transport domains. `Frequency` currently says count rather than count per time. Do not infer dimensions from a familiar name or an absent unit.
3. **Category repairs:** Calendar's period-expiration event is not its elapsed interval. Physical Dependence's goal-based child is not plainly existential dependence. `Throughput` is a role whose prose defines an amount. Feature/Hole/Slot/Bump need host and boundary criteria. These are existing contradictions, not requests to rewrite ODO.
4. **Current contracts supersede historical blockers:** MaterialBody, FluidParcel and several process seeds already exist. Relationship axes are independently selected/inherited with no defaults. Configuration `of` means emergence, explicit `applies to` gives application scope; neither is native inherency. Historical bootstrap statements about these being absent or syntax-only need dated interpretation, not uncritical reuse.
5. **Do not generalize recorded directions:** mixture partitive inheritance remains open; CHEM family/classifier scope needs review; rated function is distinct from measured delivery; Ecosystem detection does not settle its category. Source/fixture support does not prove deployed runtime behavior.

## Manageable first-level package

| Packet | Foundational focus | Useful extension | Defer |
|---|---|---|---|
| imod | category/relationship axes; quantity meaning and unit evidence | shared review contracts and cross-domain validation cases | new upper ontology, generic parthood/dispositions |
| physical | bodies versus host features; contact and host dependence | separation and bounded fragmentation; concrete body measurements | universal identity-loss inference |
| physics | speed/vector issue; force/pressure/density; stored versus transferred quantities | phase change, transport, waves and electrical observation gateways | exhaustive particle/field taxonomy or unsupported vector runtime |
| chemistry | identity versus entity versus material; composition basis | precipitation, adsorption, composition qualities and pH | exhaustive chemistry, automatic CHEM family equivalences |
| data | transformation/reference support; rank versus magnitude | median, uncertainty qualification and weighted aggregation evidence | datasets/software/workflows as scientific taxonomy |
| calendar | endpoint events versus intervals; reference/calendar/time zone | quarterly recurrence and explicitly delimited periods | exhaustive cultural calendars and temporal-relation reimplementation |
| engineering | Artifact reuse; new product versus continuing artifact | device archetypes, operation, repair, replacement, testing and actual connections | universal safety/capability claims and device catalogues |

`PROPOSALS.md` contains evidence, dependency/ownership distinctions and discriminating tests for each material proposal, plus an interface summary. `proposals/*.kwv` makes the selected additions readable in worldview language using isolated `review.*` namespaces. Alternative repairs to existing identifiers remain prose rather than duplicate declarations. These files have passed syntax-only parsing; adaptation, reasoner and model/runtime validation remain unperformed. `proposals/README.md` explains imports and expected migration.

For October 30, settle the shared-root questions, select the small proposed heads, and retain open alternatives with stable packet IDs. For November 17, use the positive/negative scenarios for multidisciplinary discussion. Revision-workflow instrumentation follows agreement on the strawman; this review neither schedules nor implements it.


Community governance: recorded source decisions establish the experimental baseline; they do not certify community acceptance. Ferd and team steer core alignment and cross-domain coherence, while competent editors coordinate open community review. Maturity, controversy, technical validation and recorded community acceptance remain separate; the shared annotation convention is pending and these drafts use comments.

Current follow-up: SELF_CHECK.md records semantic corrections, cross-domain risks and the reconciled parser evidence. The final seven language files are syntax checked, not semantically validated or community-accepted.

