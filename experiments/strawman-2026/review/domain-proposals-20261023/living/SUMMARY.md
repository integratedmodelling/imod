# Living domains: first-level coverage proposal

Review dated 23 October 2026, for a coherent 30 October strawman and multidisciplinary discussion on 17 November. This is ontology articulation, not a Tier-1 resolution-strategy exercise.

Verified active Resources repository: `C:/Users/Ferd/.klab/services/resources/workspaces/imod`. HEAD, master and worldview/strawman-2026 all resolve to `556f3562aad44ead96d2b1e646a67664901e1fc5`. The active branch is **worldview/strawman-2026**, not master. The tree is clean. No repository files were changed; no branch switch, service operation, install, commit, merge or push was performed. Neither the older `git/imod` checkout nor `klab-modeler` was opened.

## Decisions and contradictions to address first

- Organisms, including unicellular organisms, remain Agents without cognition requirements. Bootstrap Organism-as-Subject and Population/Community-as-Subject proposals are superseded. Reuse `life:Individual`; Species is exclusively an Identity classifier, never an interacting Agent.
- `ecology:Community emerges from ecology:Population` does not state the interaction-grounded recognition criterion. Keep this visible for owner arbitration. A population list or bookkeeping membership cannot establish a community.
- `agency:Decision` is a Process, while its commentary calls decisions events and asserts an overbroad decision/intention equivalence. Separate choice-making activity from bounded commitment. `agency:Assessment` still describes observer machinery rather than independently defined human appraisal.
- Current root Relationship prose permits independent axes; an old TODO still calls them fundamental/disjoint. The current language/context pack supports neutral abstract roots and independently inherited nature/orientation. Every concrete relationship proposal explicitly resolves both axes.
- Ecosystem recognition requires biotic-abiotic coupling. Its semantic head remains open; the proposal supplies a recognizing configuration and separate typology hook, not an Ecosystem Identity.
- Old bootstrap/readme claims of empty biology/genetics and non-executable agriculture are stale. Existing source seeds and later dated decisions take precedence. Implementation statements in the current context pack are newer than the old blanket “syntax-only” decision register; detection and network construction still lack complete runtime implementation.

## Recommended manageable first level

| Domain | Preserve | Foundational next articulation | Useful next review |
|---|---|---|---|
| Life | Individual, two group readings, biological origin/cultivation/harvest, TAXA | structural cell/tissue/organ bodies; reproduction, death and germination; genealogical link | lifecycle distinctions, repair/regeneration and material-pool contrasts |
| Biology | Photosynthesis, MembraneTransport | membrane and physiological families: metabolism, respiration, growth, development, regulation and movement | cell division/differentiation, repair, signalling, adhesion; rate conventions |
| Genetics | DNAReplication, Transcription | physical molecular bearers versus sequence/locus/allele descriptions; expression, translation, repair and mutation | segregation, inheritance, fertilization, abundance and variation support |
| Agency | broad Agent independent of intention; existing participants pending review | agent-source interaction intermediate; choice process versus commitment event | cooperation, negotiation, representation, decision support and consent |
| Ecology | provisional Agent Population/Community, Herbivory | explicit individual/population feeding connections and separate networks; group criteria; biotic-abiotic recognition | habitat/patch/corridor, demographic change, richness, association and biome typology |
| Agriculture | Sowing, Irrigation, Tillage; Life provenance predicates | managed groups and livestock roles; cultivation/harvesting/husbandry | nutrient/protection/transplant/residue operations; fields/holdings; product and yield bases |

The detailed packet contains six domain packets, ranked gaps, sources, prior-proposal IDs, positive/negative tests, interface ownership and unresolved questions. Near-complete first-level coverage means these observational families have a defensible home; it does not mean exhaustive anatomy, taxa, pathways or management practices. Some families intentionally remain blocked alternatives.

## Deliverables and validation

- [Detailed proposal packet and interface summary](PROPOSALS.md).
- Six full namespace overlays under [proposals/](proposals/): baseline context plus clearly divided draft additions. Replace the same-named namespace in an isolated evaluation copy; do not load both definitions. Dependencies on the other draft overlays are listed in the packet.
- [Baseline and source hashes](BASELINE.json), [validation scope](VALIDATION.md), parser output and exact classpath hashes.

No draft has recorded community acceptance. Owner discussion or incorporation into an experimental strawman does not confer community acceptance. Competent editors coordinate an open community; the steering board checks core alignment and cross-domain coherence. Repository action permission remains separate. Scientific/category questions, linking, loaded semantic validation, reasoner checks and runtime observation tests remain outstanding. The overlays are review artifacts, not an executable completeness certification. Shared annotation status conventions remain with the parent review coordinator; existing idioms are `@todo`, `@fixme`, `@check`, and `@colormap`, not a proven approval-state vocabulary.

Cross-domain review: see [CROSS_DOMAIN_FINDINGS.md](CROSS_DOMAIN_FINDINGS.md). It corrects a historical ODO-pin attribution in the detailed packet and records anatomical host, molecular-parent, transfer/bearer and ecosystem endpoint/Network blockers. Settled biological agency and group decisions remain intact.
