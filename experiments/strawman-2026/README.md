# November worldview review packet

This is an initial articulation proposal, not a replacement worldview or a declaration of domain completeness. It addresses Climate–Nature–Economy with wildfire as a cross-domain test. The deliverable is a reviewable foundation for community extension; a source count is not a coverage score.

Read in this order:

1. [Root decision register](../../DECISIONS.md): constraints, disagreements, provisional choices.
2. [Domain map](DOMAIN_MAP.md): every proposed Tier-1 review address, dependency rationale, recovery and gaps; [candidate tables](DOMAIN_CANDIDATES.md) supply minimal meanings/categories/bearers/counterexamples for all 23 addresses. The [evidence supplement](DOMAIN_EVIDENCE_SUPPLEMENT.md) adds bounded physics, oceanography, genetics and sociology support.
3. [Sources](SOURCES.md) and [source inventory](evidence/SOURCE_INVENTORY.md): inspectable source locations, hashes, local-edit patches.
4. [Wildfire](WILDFIRE.md): semantic questions, counterexamples, and unavailable consequences.
5. [Proposal/review example](REVIEW_WORKFLOW.md), with the machine-readable proposal and schema under `review/`.
6. [Validation](VALIDATION.md): actual checks, failures, and promotion gates, including the [recovered reactor](REACTOR_VALIDATION.md) and [verified workflow assessment](WORKFLOW_TESTS.md).

The production `src` directory is unchanged. The candidate is an explicit overlay under `candidate/src`, pending semantic checks. Experimental review material is outside active `src`. A standalone experiment may be syntactically valid without being a service-discovered namespace. No runtime consequence behavior is implemented.

The source snapshots assess the original dirty working copies as well as committed master. `evidence/imod-local.patch` and `evidence/im.aries-local.patch` are attributed pre-existing local work by the checkout owner (authorship not independently verified). They are evidence, not this branch's new ontology changes. `decision.kwv` is reported dirty by Git but has no substantive textual diff; biology differs only in trailing newline/blank content. Those facts are not hidden behind the substantive edits in chemistry, life and society.

For November 16, ask each domain reviewer to return: an accepted minimal set with category/bearer/participants, evidence and counterexamples; unresolved alternatives; legacy dispositions; imports; and tests. Acceptance requires coherence across neighbors, not merely a large glossary. Prioritize physical/chemical, Earth/water/soil, life/ecology, society/agency and infrastructure/economics for the wildfire narrative while keeping all domain gaps visible.

Suggested sequence: first resolve root and boundary decisions; then review the domain seeds; then reconcile overlapping proposals; finally load and reason over a pinned candidate worldview and test representative models. Community acceptance and publication are subsequent steps. Eventual instrumentation should produce reviewable Git PRs from approved immutable proposals, not apply raw model output automatically.
