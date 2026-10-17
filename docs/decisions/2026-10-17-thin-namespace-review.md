# Thin namespace review agenda - 2026-10-17

## Starting state and inventory

The existing worldview/strawman-2026 branch began clean at
aa5e709215e5984acd6938b5c5bac2b25a40bb33, matching the freshly queried origin ref.
Local and remote master were 8093249b0c6503114cb24277d3b08e94a8b49eb3, already
an ancestor. No merge is part of this work. The stale 51918525 observation is
superseded by the current branch inspection.

The actual parser found nine declaration-free namespaces: physics, engineering,
biology, genetics, sociology, geology, hydrology, oceanography and soil. Some have
substantial introductory comments but no declarations. Agriculture had Sowing;
Ecology had two abstract Agent heads; Economics had EconomicAsset and MarketValue;
Land had LandCover. Atmosphere has a chemical identity and realm heads; Chemistry
has chemical and mixture identity heads. Root, Data and Calendar are treated as
shared foundations rather than empty scientific gateways.

The local additions are deliberately process-first: physical transfer mechanisms,
Earth/material transport, deliberate artifact/agricultural operations, then
biological/genetic/ecological processes. They do not force a five-concepts-per-
category quota. Sociology, Land and Economics await the choices below. Existing
abstract organizing heads are not made concrete merely to populate the inventory.

## Settled contracts to retain

- System remains a Configuration, with EarthSystem as intermediate.
- Domain about is subject matter; bearer inherency is separate. Domain describes
  Configuration remains permitted. A Knowledge-domain address is not a reason to
  make its physical observables abstract or retype them as information artifacts.
- Generic Life, Society and BuiltEnvironment are not intrinsically Earth-only.
- Agent and Subject remain disjoint. Collective agency is a deliberate worldview
  commitment, without a requirement for human intentions or a mechanistic proof.
- Explicit abstractness is independent. Identity requirements add their own
  eligibility restriction; taxonomic, crop, product and operation identities have
  different scopes. A concrete process universal is not an instantiated event.
- Participation roles remain distinct from durable biological/material provenance.
  Missing observations are unknown, not proof of absence, no change or no process.
- Mechanisms, rates and occurrence conditions belong to models. An explanatory
  causal connection does not guarantee that an event is instantiated.
- No automatic ENVO/SWEET imports or equivalences, speculative dispositions,
  formal generic part-of relation, or effects/role conferral by narrative analogy.

## Namespace-by-namespace decisions for review

| Namespace | Concrete question or missing contract |
| --- | --- |
| physics | Do ThermalBody/MechanicalBody merit named classes or compositions over MaterialBody? Keep transferred energy distinct from stored energy, scalar speed from a velocity vector, and settle force/pressure/conductivity kinds before adding quantities. |
| geology | Review RockBody, SedimentBody, MineralGrain and stratum individuation under the now-available MaterialBody. Do not use LandformingProcess where surface morphological change is not universal. Keep deposition and lithification distinct; decide fault/layer spatial readings before relationships. |
| hydrology | Choose material water versus geographic region; channel versus flowing water; catchment footprint versus volume. Specify discharge/flux support and dimensions, hydraulic reference and event segmentation. Surface entry is not groundwater recharge. |
| oceanography | Separate tracked parcels and fixed recipient regions; settle water-mass unity, salinity convention and pH scale. Review whether Downwelling belongs in the minimal Tier 1 seed, since the old packet had no direct question incidence. Do not infer productivity from Upwelling. |
| soil | Decide SoilBody/Horizon/Pedon identity and relation without inventing generic part-of. Review dry bulk-density basis and clay/organic-matter conventions. Obtain adequate primary source coverage for SoilLeaching before public acceptance or horizon/solute effects. |
| engineering | Review the narrow new-product reading of ProductAssembly versus reassembly of a continuing artifact. Which device archetypes are common Tier 1 versus Tier 2? Rated/actual function and physical test/report must remain separate; no automatic functional disposition. |
| agriculture | Decide field surface, operational holding versus responsible Agent, and crop/herd group unity. Keep direct activities separate from episodes and outcome claims. Resolve cross-sector Harvesting versus the narrower agricultural product-removal meaning. ICC bearer/identity/concreteness remains a separate proposal. |
| biology | Decide cell/organ/organism categories and Life/Biology ownership. Do not silently retype an organism Agent as a material Subject. Review respiration scope, process-rate versus bearer state, compartment boundaries and event criteria. |
| genetics | Separate physical DNA/RNA, sequence information, gene boundaries and functional identity. Do not assert one gene/one protein. Settle lineage and mutation-event boundaries and units for abundance before new qualities or relationships. |
| ecology | Preserve the current Population/Community Agent declarations for deliberate review; no automatic reparenting to Assemblage or CollectiveAgent. Resolve habitat relational/configuration meaning, population unity, richness sampling and feeding relationships. Review scope of the plant-material reading of Herbivory. |
| sociology | Organization now exists, so that old missing-parent gate is resolved. Still choose collective unity, cooperation/representation scope, trust relation versus elicited quality, availability versus actual support, and explicit institutional setting. Do not equate participation with power or entitlement. |
| economics | Select versioned accounting and unit boundaries, institutional parties and valuation basis. Avoid duplicating an artifact as ProducedAsset when a role composition is intended. Economic value, physical condition, legal title and welfare remain distinct. |
| land | Settle an actual surface bearer rather than specializing a surface footprint from a volumetric Region. Distinguish actual use, plan, permission, tenure and condition; n-ary rights/disputes need explicit parties and context. No automatic sustainability from a practice label. |
| atmosphere | Air is currently a mixture identity, not a material air body. Resolve mobile AirMass versus geostationary Location and the existing layer/Atmosphere realm scope. Review humidity and wind-direction conventions before properties or advection effects. |
| chemistry | Decide classifier/authority, individual molecule, material phase and ensemble readings. Amount-of-substance/count, concentration basis and mixture scope need explicit contracts. The old missing MaterialBody gate is closed, not every molecular/phase individuation question. |
| geography (separate investigation) | Leave the commented UN.M49 block untouched. The investigation reports M49_COUNTRY cannot yet be expressed by the current map-key grammar: quoted/uppercase fail parsing and lowercase fails the provider contract. Quoted-string-key support awaits approval. Use a general geographical identity anchor; Country is a separate M49_COUNTRY boundary mapping, so regions do not become countries. |
| foundations and existing content | Preserve current root and provenance decisions; review any proposed quantitative or bearer additions explicitly. Do not restore NaturalResource, removed obsolete comments, or the disabled invalid-confers control. No unrelated cleanup or blanket abstraction changes. |

## Existing baseline discrepancy

The isolated packaged compiler reports logical INVALID on the unchanged baseline
because earth:Terrestrial applied to earth:EarthCover is outside its current
applies-to bound. Bean loading succeeds and the OWL graph is consistent with no
unsatisfiable named classes. There are 31 diagnostics in that baseline. This is
recorded independently of the owner's report of successful live ingestion: no
live acceptance comparison or service operation is authorized in this assignment.
The new slices must add no diagnostics and preserve all retained semantic checks.
Their differential success is not a full-worldview validity claim.

## Documentation and evidence conventions

Every new declaration has a precise single-sentence docstring. Literate Markdown
comments explain the meaning, useful contrasts, identity distinctions and model
boundary without implementation-gap notes. No glossary padding, generic Quality
placeholders or unexplained abstract keyword is added. Review records carry source
IDs, narrowed scope, rejected bindings and validation limits. Bootstrap documents
remain research history; their stale readiness and missing-parent claims are not
mechanically copied into source or silently rewritten.

Exact initial/cumulative source hashes, bootstrap hashes, current compiler/language
jar hashes, packaged core hashes, frozen authority proof hashes and per-process
checks are task-local in namespace-seeds-20261017. The production compiler build
is 1.0.0-alpha1.202610171913; current source HEAD is d8e16b277a616b63165b857018722bba658c0007
and language HEAD e1e4e90bdb37c61b15302e4b7d4a483a440d8659. Core ODO 0.1.1 bytes
match the numbered release. No scientific expert endorsement or live-model success
is inferred from compiler or differential checks. All checkpoints remain local.
