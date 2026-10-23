# Societal domains: first-level review, 23 October 2026

Review target: a coherent, community-discussable strawman by **30 October**, supporting the multidisciplinary discussion on **17 November**. This packet proposes ontology coverage, not Tier-1 resolution strategies or instrumentation.

**Verified baseline:** `C:/Users/Ferd/.klab/services/resources/workspaces/imod`; HEAD, local `master`, and local `worldview/strawman-2026` all resolve to `556f3562aad44ead96d2b1e646a67664901e1fc5`. The checked-out branch is `worldview/strawman-2026`, rather than the stated master. Git porcelain output was empty; Git warned that the user-level ignore file was unreadable. No tracked changes were reported. Exact 26-source byte hashes and guidance hashes are in [baseline.json](baseline.json).

**Read first:** [PROPOSALS.md](PROPOSALS.md) contains one packet for each of Society, Sociology, Valuation, and Economics, followed by their interfaces, arbitration questions, validation scenarios, and bounded coverage assessment. [SOURCES.md](SOURCES.md) gives primary literature and reading limitations.

## Decisions needed before promotion

1. **Valuation endpoints:** `imod:ValuationRelationship` and `imod:ValueObject` only support Subjects, although `valuation:Asset` and `economics:MarketValue` cover Agents too. `valuation:Stakeholder` also implies an asset Subject. Choose a coherent shared-root contract; this packet leaves roots unchanged.
2. **Households and institutions:** a household may contain one person and need not act as one agent. An institution as rules is distinct from the Organization administering it. Draft Subject heads expose these choices; their heads and continuity rules remain open.
3. **Work before employment:** introduce a broad work process and social work-relation root. Employee relationships do not represent all employment, and self-employment requires no self-loop. Persons, jobs, status, hours and unemployment denominators stay distinct.
4. **Accounting support:** GDP, wealth, income, inflation, index and rate require explicit native bearers and accounting boundaries. Their draft abstract heads are discussion proposals, not accepted measurement contracts.

Existing recorded discussion decisions already support macroeconomics, behavior/household/markets, shared participants, and sociology interfaces. They accept neither these names nor their semantic heads. Historical bootstrap dossiers already propose many of the same ideas; the detailed packet identifies their IDs and dispositions. Several bootstrap claims are stale: Organization and HumanIndividual now exist, and Valuation no longer imports Decision.

## Deliverables and status

- [proposal-src/society.kwv](proposal-src/society.kwv): current declarations plus household, membership, residence, parental recognition and age proposals.
- [proposal-src/sociology.kwv](proposal-src/sociology.kwv): social/work roots, work, institutions, cooperation/support, trust, representation, inequality and learning hooks.
- [proposal-src/valuation.kwv](proposal-src/valuation.kwv): value attribution, nonmonetary importance, deliberation/appraisal, non-substitution judgment and expression.
- [proposal-src/economics.kwv](proposal-src/economics.kwv): reporting/aggregation, production/consumption, employment/jobs, GDP/income/wealth, inflation/index/rate, markets/choice, debt/payment.
- `context-src/`: exact read-only copies of all 26 baseline `.kwv` files. These provide the remaining imports; do not load both copies of a namespace.
- [VALIDATION.json](VALIDATION.json): original preservation/textual checks and draft inventory. [RECOVERY_VALIDATION.md](RECOVERY_VALIDATION.md) and [RECOVERY_VALIDATION.json](RECOVERY_VALIDATION.json) record fresh preservation, corrected lexical checks and the successful syntax-only parser run.

These are **proposed review artifacts with no recorded community acceptance**. Ferd/team discussion direction, proposal maturity, controversy, technical validation and community acceptance are separate. Repository action permission is separate again. No `@approved` or new status vocabulary is asserted. Existing annotation idioms are reported; shared convention coordination remains pending.

Only local deliverables were written. No repository source edits, branch switches, commits, merges, pushes, installations, broad builds or service operations were performed. The older `C:/Users/Ferd/git/imod` and denied `klab-modeler` checkouts were not accessed. Recovery ran the existing Xtext syntax-only harness: all four overlays and all 26 context files passed, zero errors. Adapter, reasoner, live discovery and scientific expert validation were not run; the positive/negative semantic cases remain proposed tests. Draft comments saying parser-not-tested describe their original staging state; the recovery receipt supersedes that statement while preserving all four draft files byte-for-byte.

The result is a manageable first-level gateway, **not a claim of near-complete coverage**. Remaining thin areas include demography, rights/power/conflict, culture/communication, education and social services, financial/sectoral accounting and concrete nonmonetary value scales. Their named first-level hooks and honest deferrals make those gaps visible without manufacturing exhaustive taxonomies.
