# Collective entity lineage

Status: isolated candidate; no publication or activation.

The domain-neutral ODO roots distinguish identifiable collective Subjects from
collective Agents. IMOD exposes both through core aliases. Scientific criteria
establish unity, continuity, identity and cohort; a query result alone does not
establish a collective entity.

| Declaration | Parent |
| --- | --- |
| imod:CollectiveSubject | core odo:CollectiveSubject |
| imod:CollectiveAgent | core odo:CollectiveAgent |
| life:Assemblage | imod:CollectiveSubject |
| life:CollectiveAgent | imod:CollectiveAgent |
| ecology:Population | life:CollectiveAgent |
| ecology:Community | life:CollectiveAgent |
| life:SocialGroup | life:CollectiveAgent |
| society:Organization | imod:CollectiveAgent |

AnatomicalAssemblage and CellAssemblage retain their existing biological Subject
ancestry. Individual remains an Agent without collective ancestry. Community is
articulated through populations; this introduces no direct individual-membership
restriction. The biological CollectiveAgent description therefore does not limit
every member to life:Individual. Organization was reviewed separately: its current
organized-unit meaning supports generic collective agency without a biological
parent. Formal constitution and OrganizationMembership retain their own meanings.

Collective agency does not confer agency or a common type on every member.
Neither root introduces membership relations, fixed membership, minimum size,
observational collection semantics, observational containment or an emergence
clause. Configuration-first recognition and subsequent ordinary models remain
separate. Existing Community/SocialGroup configuration review records remain pending.

## Release and consumer

The candidate imports ODO 0.2.1 at local release commit
`ede866637f505dfb882b7b9427a8f21f27922093`. Its SHA-256 is
`d6ca3d02d560d6af7f5b8d44e97befca64050fef4b832e97d4381da7630d8f78`.
The isolated Services bundle is byte-identical. Historical ODO numbered releases
and the retirement of the mutable latest alias are preserved. This immutable pin
becomes remotely usable only after separately authorized ODO publication.

## Validation and limits

- All 26 active ontology files pass Xtext syntax parsing.
- ODO OWLAPI/HermiT release checks pass, with zero unsatisfiable named classes,
  distinct/nonexhaustive collective roots and independent member/group agency.
- The current Services lineage fixture passes 65 checks, with bean and logical
  status VALID, consistent OWL, zero unsatisfiable classes, no diagnostics and
  no external network attempts. It extracts the exact declarations from src;
  generic Physical ownership isolates lineage from disciplinary authority data.
- The 46 existing CoreDomainAliasValidationTest, WorldviewDeclarationSupportTest
  and BroadDescriptionContractTest cases pass against the candidate core bundle.

The whole-world replay does not establish acceptance. On the current toolchain,
the existing authority capture fails deserialization of the removed requiredExtents
field before ontology compilation. The frozen toolchain reads that capture but
the unchanged current baseline requires an uncaptured CHEM identity response for
CID_962. No successful full-world candidate run is claimed. Refreshing a complete,
compatible owned authority capture is required before integration. External
authority access was not enabled to conceal this limit.

Current reasoner/API/common/services compiled dependencies correspond to Services
`197a60a37ba3483b7d3f62fa93a510241a22e652`. The fixture uses previously compiled
Resources loader classes from the frozen relationship-axis integration; it is
an isolated compiler/reasoner check, not a clean reactor build. Exact local
arguments are retained with validation output in the task workspace. The portable
runner is tests/collective-lineage/run.py.

Remaining scientific work: specify the applicable social-connection and
population configurations, cohort/support criteria and models. No further
ontological choice blocks this lineage candidate. Full-world validation and
publication/activation remain separate work.
