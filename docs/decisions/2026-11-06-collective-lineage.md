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
`86e25036b7e7a7d75971ab9f303c8f5f1785e30c`. Its SHA-256 is
`06c081d46d9435aeadb4ef086b6a278e868953871cbc87d1debc75e6f8e0ba45`.
The isolated Services bundle is byte-identical. Historical ODO numbered releases
and the retirement of the mutable latest alias are preserved. This immutable pin
becomes remotely usable only after separately authorized ODO publication.

## Validation and limits

- All 26 active ontology files pass Xtext syntax parsing.
- ODO OWLAPI/HermiT release checks pass, with zero unsatisfiable named classes,
  distinct/nonexhaustive collective roots and independent member/group agency.
- The paired Services lineage/Energy fixture passes 72 checks, with bean and logical
  status VALID, consistent OWL, zero unsatisfiable classes, no diagnostics and
  no external network attempts. It extracts the exact declarations from src;
  generic Physical ownership isolates lineage from disciplinary authority data.
- All 48 CoreDomainAliasValidationTest, WorldviewDeclarationSupportTest,
  BroadDescriptionContractTest and EnergyReleaseMeasurementTest cases pass
  against the candidate bundle and paired Energy-extensive language API.

The subsequent full-world replay passes: baseline 14/14 and candidate 72/72 checks,
with all 26 ontologies and two strategy documents adapted, bean/logical status
VALID, consistent OWL, no unsatisfiable named classes and no external network
attempts. The same three existing Time/Space and Period/Frequency diagnostics
remain unchanged. Initial blocked records are historical, superseded by evidence
under docs/reviews/collective-lineage-20261106/followup.

The verified historical capture contains 492 empty requiredExtents and 492 empty
requiredAttributes fields removed from current transport. A private read adapter
verifies the original source/proof SHA before removing only obsolete empty arrays
in memory; any nonempty obsolete field is rejected. No source/proof bytes change.
The water/ChEBI records were expired, rather than absent. The exact proved provider
refreshed 38 code forms through real CachedAuthority calls in a private capture
copy. The complete replay then uses those owned answers offline. Original capture,
provider configuration, permissions and services remain unchanged.

The optional native persistent-catalogue roundtrip failed its configured-snapshot
checksum check. That generated file is not a reusable accepted catalogue. This
separate persistence issue does not invalidate the passing isolated full-world
replay; use its verified capture/read-adapter path for reproduction.

The initial evidence below describes the pre-integration build and remains historical.
Current reasoner/API/common/services compiled dependencies correspond to Services
`197a60a37ba3483b7d3f62fa93a510241a22e652`. The fixture uses previously compiled
Resources loader classes from the frozen relationship-axis integration; it is
an isolated compiler/reasoner check, not a clean reactor build. Exact local
arguments are retained with validation output in the task workspace. The portable
fixture runner is tests/collective-lineage/run.py. The Energy correction requires
the quantitative-within task's paired SemanticSyntax.java category change:
Energy belongs to EXTENSIVE, not INTENSIVE. The read-only source used for the
private compiled API overlay has SHA-256
6a0027dd3e2da269178a20bd786c76eccf9fa4d29a836b8446b17ccffc685535.
No file was modified in that task. ODO alone cannot correct the installed language
API's category; rebuild the paired language artifact before integration.

Energy now inherits ExtensivePhysicalProperty in the unpublished 0.2.1 release;
historical releases are unchanged. Its joule unit is preserved. Checks cover
current consumer flags, kJ/J conversion, distinction from power/specific-energy
dimensions, and extensive energy derivatives with J/s dimensions. The new OWL
regression fails on historical 0.2.0 as expected.

Remaining scientific work: specify the applicable social-connection and
population configurations, cohort/support criteria and models. No further
ontological choice blocks this lineage candidate. Publication/activation and a
normal distribution/activation remain separate work. The coordinated normal build supersedes the private API-overlay requirement; see [current integration record](../reviews/collective-lineage-20261106/INTEGRATION.md).
