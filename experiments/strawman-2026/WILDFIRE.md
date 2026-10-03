# Wildfire as a coherence test

The following are semantic test stories, not executable k.IM or consequence-engine pseudocode. Names refer to proposed meanings and may change. The initial executable slice does not purport to demonstrate a running fire twin.

## One landscape, several observables

A landscape contains vegetation, soil horizons, water bodies, households and built components. A fire episode is a bounded event; combustion is a process participating in that event. Fuel is a role of combustible material in a specified process/context, not an equality with all vegetation or all biomass. A living plant's mass, dead material stock, moisture proportion and rate of biomass production are different observables. Wind velocity and temperature bear on atmospheric entities; their use as predictors is supplied by models.

An artifact may be an economic asset for an agent and a component of an infrastructure configuration. Asset status is not material identity; monetary loss is not the collapse event. A household's presence in a hazard area does not itself establish vulnerability, realized damage or a service benefit. A source-defined ecosystem service connects ecological contribution and human benefit; it is not every ecological process.

| Question | Vocabulary needed | Model/description needed | Consequence capability still unavailable |
|---|---|---|---|
| What material can participate as fuel? | material, biological stock, participation/fuel role | moisture and availability descriptions; explicit process context | process confers role after graph commit |
| Is this a fire episode? | bounded event and combustion process | episode boundary and detection evidence | resolving role detects a configuration and instantiates observations |
| Did a plant or structure cease to exist as that substantial? | substantial identity, Collapse/event | occurrence evidence and identity criterion | terminate via occurrent; affect dependent configurations/chains |
| Did elevation change after fire? | Elevation and Erosion | separate erosion/change model; fire does not guarantee erosion | context time transition causes all qualities to resolve change in X |
| Is water regulation reduced? | runoff quantity/process, beneficiary/service roles | runoff, exposure, contribution and benefit models | service configuration detection/propagation |
| Is there economic damage? | affected asset/agent, value and loss | valuation perspective, counterfactual/baseline and evidence | no automatic propagation from burn label to monetary damage |

## Transition and open-world acceptance cases

1. Before any fire observation, Elevation can be resolved from a static description. That description must not embed an unannounced erosion transition.
2. A resolved occurrent may make the context see a time transition. The intended contract is then to resolve change in every quality X, not just a hand-selected list of affected variables.
3. If change in Elevation cannot be resolved with then-available knowledge, the twin still runs. The unresolved request is not evidence that real elevation stayed constant. This packet specifies no carry-forward, interpolation, default-zero or state-retention policy.
4. If Collapse of a substantial is resolved, intended future semantics end that substantial and affect dependent configurations/chains through explicit dependency knowledge. Mere absence of a fresh observation is not an occurrent and cannot terminate it.
5. A process conferring a role, role resolution detecting a configuration, and instantiation of observations are intended consequences after graph commits. Current implication/detection syntax must not be advertised as executing those steps.

## Counterexamples that must survive review

CORINE334 cannot be an equals alias for Wildfire or BurnedLand: it encodes particular vegetation, recent/visible damage and exclusions. A historical burn may no longer satisfy it. Conversely a fire episode can occur without mapping to that class. [Source](https://land.copernicus.eu/content/corine-land-cover-nomenclature-guidelines/html/index-clc-334.html).

TallClosedFloodproneForest bundles height, canopy closure, inundation disposition and vegetation class. Test whether each varies independently; articulate dimensions before proposing a stable jargon expression. Scheme-specific forest thresholds remain authority commitments. An authority crosswalk may support a model or mapping with confidence and conditions, never automatic logical equivalence.

Combustion need not imply total mortality. Burned canopy need not imply an observed change in ground elevation. Rainfall following fire need not imply a flood. A failed bridge component need not imply collapse of every connected network. No source in this packet supports these universal consequences, so none is emitted as affects/creates or implies.

## Small candidate rationale

Legacy hydrology:Watershed provides a minimal recoverable region observable: surface water drains toward a common outlet. The experiment names that scope explicitly as SurfaceCatchment, specializing earth:Region, and places a scoped Watershed alias in a separate ordinary .kwv. Groundwater recharge zones and management districts are excluded. Catchment delimitation belongs to models; no flow or flood is instantiated by the concept. The alias is deliberately scoped and must not claim that every use of the English word watershed has this meaning. Biomass and fuel remain review proposals: living/dead scope, water basis, aggregate bearer and participation role need agreement before a candidate.
