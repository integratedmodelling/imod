# Entry-only LandCover example

This isolated candidate binds the existing `land:LandCover` identity, without adding a duplicate
root, to LAND `ENTRY_ONLY`, catalogue `corine_entry_hierarchy_example`, revision `illustrative-1`,
codelist alias `land.corine`. This requires the matching candidate LAND provider and Services strict
subsumption/delegation changes; it is not activated in the live worldview.

`entry-example.kim` is an executable source fixture using current grammar. It classifies synthetic
literal input 111 as `land.corine:ContinuousUrbanFabric`; it also demonstrates the mapping of input
311 to `land.corine:BroadLeavedForest`. Unknown codes have no catch-all. Replace the synthetic input
with an appropriately scoped source-code resource before real use: this fixture does not assert
that every Location is urban. `type of` produces the classification observable; LandCover remains
an identity rather than the observed region or an ecosystem.

The eight-entry catalogue uses actual CORINE code/label references but **locally illustrative parent
assertions**, not official CORINE entailments. It tests explicit edges, multiple parents, transitivity,
direction and distance without patterns. The owner's team will supply a curated hierarchy separately.
BroadLeavedForest is not a synonym for DeciduousForest; that name occurs only in synthetic tests.

Validation uses the actual WorkspaceManager ontology/strategy/KIM adapters and production Jackson
mapper through interface types. The private source harness loads all 26 ontologies/two strategies,
checks the LAND binding, and verifies both numeric-code/term classifier pairs survive transport.
Provider tests separately check configuration, parent validation and offline snapshot restoration;
Services tests check host identity-root validation, actual provider archive capture/replay, resolver
and reasoner dispatch, and eligibility-before-distance. These tests do not establish live observation
execution or data/model selection at a particular site.

Reproduction scripts and dated receipts are supplied alongside the isolated candidate in
`land-entry-example/`: `run-provider-tests.py`, `run-delegation-tests.py --fixed`,
`run-source-check.py`, `run-archive-test.py` and `run-full-world.py`. They use Java 21 and existing
read-only dependency/capture paths recorded in their arguments, and write private outputs only.
