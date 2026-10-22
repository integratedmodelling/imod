# Ecology and economics: settled discussion decisions

Owner discussion of 2026-10-21, recorded 2026-10-22. This record separates accepted direction
from unresolved ontology proposals. It changes no executable vocabulary or runtime behavior.
Historical candidate dossiers retain their research status; these decisions supersede conflicting
historical alternatives only to the extent explicitly stated below.

## Ecology

- Retain `ecology:Population` and `ecology:Community` as Agents **provisionally**, as already
  declared in [ecology.kwv](../../src/ecology.kwv). Better articulation of grouping may justify
  reconsideration. Ordinary ecological "assemblage" language does not reclassify them as the
  formal Subject `life:Assemblage`.
- Specific relationships establish ecological groupings. Sexual/reproductive relations are an
  example for **interfecund populations**, not a universal definition of every population.
  Communities are understood here as groupings of populations articulated through ecological
  interactions. No relationship signature or automatic group-creation rule is approved here.
- Physical separability is not required. Scale is central; grain, extent, observation interval,
  membership and continuity require explicit treatment. Individual interactions do not automatically
  supply population/community interactions or aggregate quantities.
- **Biotic–abiotic coupling is the Ecosystem criterion.** Recognition through a configuration of
  biotic–abiotic relationships is a proposed representation supported for exploration. Ecosystem's
  semantic head, relationship endpoints, recognition rules and identity/continuity remain open.
  A recognizing configuration does not determine the nature of the observed Ecosystem.
- Ecosystem typology should use a separate authority-backed classification root/predicate;
  **Ecosystem itself need not be an Identity**. Reuse LAND's classification mechanisms rather
  than duplicate source taxonomies. No Ecosystem root or authority binding is selected here.
- Ecosystem and land-cover classifications share a mediation problem and authority mechanism,
  but retain distinct families, applications and policy relevance. No automatic cross-scheme
  equivalence or regulatory reconciliation follows. The existing [LandCover binding and example](../../tests/land-entry-authority/README.md)
  at imod `43e3ca21` are implemented; the Ecosystem hook remains a proposal.

Identified ecological groups, query-selected collectives, detected configurations and networks
remain distinct. A successful empty collective is legal and does not itself recognize an identified
group. Proposed group `creates`/`created by` behavior is not implemented by this record.

## Economics and sociology

The owner approved four discussion areas, not their candidate concept names or semantic heads:

1. **Shared Society foundations:** reuse canonical people and organizations; resolve household,
   institutional/reporting-unit and membership criteria before adding competing entity identities.
2. **Macroeconomics:** cover GDP, inflation, employment and related accounting/measurement support.
   Distinguish GDP flows from wealth stocks and welfare; inflation process from index/rate; and
   work, employment, jobs, person status, counts and hours. Exact heads, bearers and methods remain open.
3. **Microeconomics:** cover behavior, individual/household choice and markets. No universal
   optimizing-choice axiom, single household mind or theory-specific utility model is approved.
4. **Sociology interfaces:** articulate social institutions, roles and relationships with shared
   Society entities rather than duplicate participants across disciplinary namespaces.

Economics includes processes, roles, relationships, dependent qualities, accounting constructs
and models. Society concerns observed social phenomena, not only material objects. The existing
[domain declarations](../../src/imod.kwv), [Society](../../src/society.kwv),
[Economics](../../src/economics.kwv) and [Sociology](../../src/sociology.kwv) remain unchanged.
Measurement standards and policy classifications must remain distinct from semantic heads.

## Promotion boundary

The six separately tested experimental ecology/economics concepts and their synthetic model
are **not promoted** by this record. Technical consistency does not settle scientific meaning,
ownership, scale or measurement support. The broader research tables remain proposals.
Open choices include group identity across scales, Ecosystem head/endpoints, household/reporting
boundaries, macroeconomic description targets and work/choice/market interpretations.

The owner's 2026-10-22 permission to merge was conditional on no open questions. Accordingly,
only this settled decision record and its index are integrated; no unresolved executable proposal
is implied approved. Recursive resolution and consequence/group runtimes remain separate work.
