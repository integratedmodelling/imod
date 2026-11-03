# Earth-domain review — 23 October 2026

**Conclusion:** the nine namespaces are a useful foundation, but do not yet provide near-complete first-level coverage. The next strawman should complete a small set of bearer, state, process, occurrence and connection families, rather than promote the older five-per-category inventories. This is a read-only scientific/ontology proposal, not executable source or a resolution-strategy review.

## Verified baseline

- Active repository: `C:/Users/Ferd/.klab/services/resources/workspaces/imod`.
- Checked-out branch: `worldview/strawman-2026`.
- HEAD, local `master` and local `worldview/strawman-2026`: `556f3562aad44ead96d2b1e646a67664901e1fc5`.
- Initial Git working tree: clean. A command-scoped `safe.directory` override was necessary; no configuration was changed.
- Current root imports **ODO 0.2.0**, pinned at `08e5a29abbbd32ca8c1b933fc157a1762ba3ee5c`. The older immutable-0.1.1 decision is historical, not the current foundation.
- No repository ontology/source edit, branch change, service operation, component installation, merge, commit or push occurred. Standalone `.kwv` research drafts are included in this output folder. The older `git/imod` and denied `klab-modeler` checkout were not accessed.

## Decisions needed first

1. **Shared geographic supports:** `earth:Region` says volumetric in prose but inherits `Areal`; `WaterBody`, streams and lakes identify geographic regions, not automatically material water. Choose surface, volume, channel and material-water identity contracts before adding their dependents.
2. **Realm repair:** atmosphere's live realm prose omits the stratosphere and higher layers; its comments confuse spatial enclosure with observational containment. `AtmosphericBottomLayer` and `Troposphere` also need a defensible disjointness interpretation. Keep realm membership, classification and observation containment separate.
3. **Shared ownership:** decide ownership of Earth material bodies, geological structures, water stores and surface units without reverse imports from Earth into disciplinary consumers. Do not silently move weather/landform declarations out of Earth.
4. **Geographical identities:** live continental predicates impose hemisphere inheritance that is not valid for every location bearing those continental identities. Review African/Asian/European and oceanic/continental boundary conventions; do not infer physical placement from statistical affiliation.
5. **Existing decisions outrank old dossiers:** MaterialBody, FluidParcel, geological/soil bodies and process seeds now exist. The LAND entry binding is authored, but its test README still calls it an isolated non-live candidate. Record deployment separately from source presence. Ecosystem classification remains a separate proposal.

## Proposed first level

| Domain | Priority coverage to complete | Coverage boundary |
|---|---|---|
| earth | Place/material/surface distinctions; shared environment realms; cross-sphere water and frozen-water gateway | Keep Earth physical; named disciplines are Knowledge about Earth |
| atmosphere | Air support; pressure/temperature/humidity/wind; cloud/phase processes; climate and composition gateway | Air identity is not an air body; avoid a weather-type catalogue |
| oceanography | Marine support; temperature/salinity/current/height/sea state; water-column, ice and chemistry interfaces | Marine organisms remain ecological/biological interfaces |
| geology | Material kinds, units and structures; composition/texture/geometry; deformation and transformation | Formal units, map representations and physical individuals differ |
| geography | Repair existing terrain measures; general landform and regional/place distinctions; human-geography interface | Avoid duplicating geology processes or importing GIS software taxonomy |
| hydrology | Catchment/channel/water-store supports; stage/discharge/storage/head; exchange and phase processes | Infiltration is not recharge; surface basin is not groundwater basin |
| soil | Horizon/profile support; texture/water/chemistry/composition; pedogenic processes; classification hook | Soil classification is not the material individual; WRB is not installed |
| land | Surface support; cover/use/management distinctions; cover fractions, sealing and change | LAND cover and ecosystem typology are separate classification families |
| infrastructure | Physical asset archetypes; condition and functioning; actual delivery connections and interruption | Engineering owns production/modification knowledge; networks emerge |

The detailed packet has one section per domain, stable review-row IDs, dependency and bearer decisions, literature, previous-proposal matches, and positive/negative tests. Rows group related *distinct* meanings for discussion; they do not propose a single bundled concept. Nine [worldview-language drafts](kwv/README.md) encode a small explicit subset, with a ledger of language commitments still unresolved. Community acceptance is unrecorded; discussion with Ferd does not substitute for it.

## Discussion sequence

By October 30, arbitrate the five shared issues above, select the foundational rows in each packet, and retain the useful rows as explicit extensions. Freeze a coherent vocabulary proposal with dissent and unresolved meanings visible. For November 17, use the cross-domain scenarios in [INTERFACES.md](INTERFACES.md) to test multidisciplinary understanding. Revision-workflow instrumentation follows that strawman; this packet does not claim schema submission, scientific approval or runtime implementation.

See [PROPOSALS.md](PROPOSALS.md), [INTERFACES.md](INTERFACES.md), [SOURCES.md](SOURCES.md), [baseline.json](baseline.json) and [source-inventory.json](source-inventory.json).

Validation: all nine standalone `.kwv` files pass the existing local Xtext syntax-only harness, zero errors. Bundled Worldview/Observable grammar bytes match inspected sources. [Parser receipt](parser-results.txt) and [grammar pins](grammar-context.json) are included. Linking, type/semantic validation, loaded-worldview consistency, live behavior and community acceptance remain untested/unrecorded.
