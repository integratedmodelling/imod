# Hydrology bootstrap dossier

Status: draft for source and ontology review; no expert approval. Read the source-first question ledger before the vocabulary below. Five per category is an exploration target, not evidence of completeness. The local JSON is a research index, not the context-pack proposal envelope.

## Scope and upstream decisions

- SurfaceCatchment parent earth:Region is volumetric; choose footprint versus volume before promotion; current executable earlier candidate retained as test artifact, not approval.
- USGS broad watershed includes underlying groundwater; our scoped alias cannot assert equivalence to every use.
- StreamReach mixes enduring channel and occupied water: split requires earth-level body/channel articulation, not hydrology workaround.
- Root Velocity aliases Speed; retain scalar speed scope or raise vector distinction upstream.
- Hydraulic head evidence is introductory and insufficient for full energy-reference conventions; specialist source needed.
- Event boundaries are observational modeling choices; no source says these five comprise a universal event taxonomy.

## Source ledger

- **watersheds** — USGS Watersheds and Drainage Basins; Definition; Not all precipitation flows out. Scope: Common outlet and water budget; broad groundwater wording is not equality of subsurface and surface catchments. Status: primary agency introduction read; not expert reviewed. [Source](https://www.usgs.gov/water-science-school/science/watersheds-and-drainage-basins)
- **streamflow** — USGS Streamflow and the Water Cycle; Streamflow; hydrographs; mechanisms. Scope: Discharge, stage, movement and changing storage; introductory prose does not distinguish every ontology category. Status: primary agency introduction read; not expert reviewed. [Source](https://www.usgs.gov/water-science-school/science/streamflow-and-water-cycle)
- **infiltration** — USGS Infiltration and the Water Cycle; Factors affecting infiltration; recharge. Scope: Entry into ground distinguished from eventual aquifer replenishment. Status: primary agency introduction read; not expert reviewed. [Source](https://www.usgs.gov/water-science-school/science/infiltration-and-water-cycle)
- **runoff** — USGS Runoff: Surface and Overland Water Runoff; Factors affecting runoff; water quality. Scope: Overland movement and erosion factors; not universal fire response. Status: primary agency introduction read; not expert reviewed. [Source](https://www.usgs.gov/water-science-school/science/runoff-surface-and-overland-water-runoff)
- **groundwater** — USGS Groundwater: What is Groundwater?; Groundwater storage and flow overview. Scope: Subsurface water; aquifer material must not be equated with water. Status: primary agency introduction read; not expert reviewed. [Source](https://www.usgs.gov/water-science-school/science/groundwater-what-groundwater)
- **floods** — USGS Floods and Recurrence Intervals; Floods and recurrence discussion. Scope: Flood occurrence and probability distinct; no deterministic recurrence schedule. Status: primary agency introduction read; not expert reviewed. [Source](https://www.usgs.gov/water-science-school/science/floods-and-recurrence-intervals)
- **wmo** — WMO/UNESCO International Glossary of Hydrology; 2012 edition metadata. Scope: Discovery only; drought entry not read, cannot support adopted boundary. Status: metadata_only. [Source](https://unesdoc.unesco.org/ark%3A/48223/pf0000221862)
- **user** — User change/open-world constraints; delegated instructions 2026-10-03. Scope: Intended system semantics, not empirical hydrology. Status: design_authority.

## Subject candidates

### hydrology:SurfaceCatchment
Surface-drainage region delineated towards one specified outlet; not an assertion that all rain reaches it. Parent: `earth:Region` (proposed_parent); status **blocked**. Sources: watersheds.
Positive: Delineated hillslopes above a bridge outlet. Negative: Administrative water district crossing divides.
Bearer qualities: hydrology:CatchmentArea.

### hydrology:StreamReach
A bounded segment of a channel-associated water body, with endpoints fixed for the observation; water presence can vary. Parent: `earth:Waterway` (proposed_parent); status **blocked**. Sources: streamflow.
Positive: Reach between two confluences. Negative: The discharge value at a gauge.
Bearer qualities: hydrology:Stage, hydrology:StoredWaterVolume.

### hydrology:LakeWaterBody
A bounded body of standing inland surface water, distinguished from its basin and water volume. Parent: `earth:WaterBody` (proposed_parent); status **provisional**. Sources: streamflow.
Positive: Water occupying a specified lake basin. Negative: Empty excavated basin.
Bearer qualities: hydrology:StoredWaterVolume, hydrology:WaterTemperature.

### hydrology:GroundwaterBody
Contextually delineated subsurface water body in connected saturated pore or fracture space; distinct from aquifer solid material. Parent: `earth:WaterBody` (proposed_parent); status **blocked**. Sources: groundwater.
Positive: Water in a specified connected saturated unit. Negative: Dry permeable sandstone.
Bearer qualities: hydrology:StoredWaterVolume, hydrology:HydraulicHead.

### hydrology:SpringWaterBody
A locally bounded water body at a groundwater emergence site, distinguished from the discharge process and the site. Parent: `earth:WaterBody` (proposed_parent); status **provisional**. Sources: groundwater, infiltration.
Positive: Water pool supplied at a spring outlet. Negative: Groundwater discharge rate without a bounded body.
Bearer qualities: hydrology:StoredWaterVolume, hydrology:WaterTemperature.


## Quality candidates

### hydrology:StoredWaterVolume
Volume occupied by water in the specified body at contextual time. Parent: `imod:Volume` (verified_reference); status **provisional**. Sources: groundwater, streamflow.
Positive: Water volume of one lake. Negative: Cumulative flow through its outlet.
Bindings and limits: {"bearer": "earth:WaterBody"}.

### hydrology:CatchmentArea
Area of the delineated surface catchment footprint. Parent: `imod:Area` (verified_reference); status **provisional**. Sources: watersheds.
Positive: Footprint area above selected outlet. Negative: Total aquifer storage.
Bindings and limits: {"bearer": "hydrology:SurfaceCatchment"}.

### hydrology:Stage
Water-surface height relative to a specified local reference. Parent: `imod:Length` (verified_reference); status **provisional**. Sources: streamflow.
Positive: Gauge-relative water height. Negative: Discharge or absolute terrain elevation.
Bindings and limits: {"bearer": "hydrology:StreamReach"}.

### hydrology:Discharge
Water volume crossing a specified section per contextual time interval. Parent: `imod:Quantity` (verified_reference); status **provisional**. Sources: streamflow.
Positive: Section water throughput. Negative: Mean water velocity alone.
Bindings and limits: {"bearer": "hydrology:ChannelFlow"}.

### hydrology:WaterTemperature
Thermal state of a specified water body under an identified measurement interpretation. Parent: `imod:Temperature` (verified_reference); status **provisional**. Sources: streamflow.
Positive: Lake water temperature. Negative: Air temperature above the lake.
Bindings and limits: {"bearer": "earth:WaterBody"}.

### hydrology:HydraulicHead
Hydraulic energy per weight represented as a reference-relative head for water. Parent: `imod:Length` (verified_reference); status **blocked**. Sources: groundwater.
Positive: Head at a specified groundwater location. Negative: Depth to water without reference information.
Bindings and limits: {"bearer": "hydrology:GroundwaterBody"}.

### hydrology:InfiltrationFlux
Water entry through a specified ground surface per area and contextual time. Parent: `imod:Quantity` (verified_reference); status **provisional**. Sources: infiltration.
Positive: Entry rate through one soil surface. Negative: Aquifer recharge rate inferred without vadose-zone travel.
Bindings and limits: {"bearer": "hydrology:Infiltration"}.

### hydrology:FlowVelocity
Magnitude of water movement velocity under specified section/point interpretation. Parent: `imod:Velocity` (verified_reference); status **blocked**. Sources: streamflow.
Positive: Water speed through section. Negative: Volume throughput.
Bindings and limits: {"bearer": "hydrology:ChannelFlow"}.

### hydrology:SedimentConcentration
Mass concentration of suspended sediment in water; sampling convention unresolved. Parent: `imod:Quantity` (verified_reference); status **blocked**. Sources: runoff.
Positive: Suspended material in sampled stream water. Negative: Turbidity treated as identical mass concentration.
Bindings and limits: {"bearer": "earth:WaterBody"}.


## Process candidates

### hydrology:ChannelFlow
Water transport along a channel; course of movement, not discharge number. Parent: `imod:Process` (verified_reference); status **provisional**. Sources: streamflow.
Positive: Water moving through a river reach. Negative: Gauge reading considered as a process.
Relevant quality parameters: hydrology:Discharge, hydrology:FlowVelocity, hydrology:Stage.
Bindings and limits: {"participants": "water body; receiving body/ground/air as scoped by definition", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Transfer may contribute to source/recipient storage change, but steady throughflow or compensation can leave storage unchanged. Bearer-specific effects remain blocked; no runtime inference asserted."}.

### hydrology:OverlandFlow
Water movement over the land surface before or outside channel transport. Parent: `imod:Process` (verified_reference); status **provisional**. Sources: runoff.
Positive: Sheet flow down a wet hillslope. Negative: Infiltration into pore space.
Relevant quality parameters: hydrology:InfiltrationFlux, geography:Slope.
Bindings and limits: {"participants": "water body; receiving body/ground/air as scoped by definition", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Transfer may contribute to source/recipient storage change, but steady throughflow or compensation can leave storage unchanged. Bearer-specific effects remain blocked; no runtime inference asserted."}.

### hydrology:Infiltration
Entry of surface water into the ground; not synonymous with arrival at saturated groundwater. Parent: `imod:Process` (verified_reference); status **provisional**. Sources: infiltration.
Positive: Water crosses the ground surface. Negative: Groundwater recharge inferred solely from surface entry.
Relevant quality parameters: hydrology:InfiltrationFlux.
Bindings and limits: {"participants": "water body; receiving body/ground/air as scoped by definition", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Transfer may contribute to source/recipient storage change, but steady throughflow or compensation can leave storage unchanged. Bearer-specific effects remain blocked; no runtime inference asserted."}.

### hydrology:GroundwaterDischarge
Groundwater transfer into a receiving surface water body. Parent: `imod:Process` (verified_reference); status **provisional**. Sources: groundwater, streamflow.
Positive: Groundwater contribution at a gaining reach. Negative: Losing-reach transfer in the opposite direction.
Relevant quality parameters: hydrology:HydraulicHead, hydrology:Discharge.
Bindings and limits: {"participants": "water body; receiving body/ground/air as scoped by definition", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Transfer may contribute to source/recipient storage change, but steady throughflow or compensation can leave storage unchanged. Bearer-specific effects remain blocked; no runtime inference asserted."}.

### hydrology:OpenWaterEvaporation
Liquid water transfer from an exposed body into atmospheric vapour. Parent: `imod:Process` (verified_reference); status **provisional**. Sources: streamflow.
Positive: Vapour transfer at a lake surface. Negative: Leaf transpiration.
Relevant quality parameters: hydrology:WaterTemperature, atmosphere:VaporPressure.
Bindings and limits: {"participants": "water body; receiving body/ground/air as scoped by definition", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Transfer may contribute to source/recipient storage change, but steady throughflow or compensation can leave storage unchanged. Bearer-specific effects remain blocked; no runtime inference asserted."}.


## Relationship candidates

### hydrology:SurfaceDrainsTo
Potential surface-drainage routing relative to the selected outlet; not observed water transfer. Parent: `imod:Relationship` (verified_reference); status **blocked**. Sources: watersheds.
Positive: Catchment routed to reach outlet. Negative: Administrative district assigned to water company.
Bindings and limits: {"source": "hydrology:SurfaceCatchment", "target": "hydrology:StreamReach", "rationale": "Subject endpoints are scoped; transfer relations are observation-dependent and not inferred from adjacency. Structural-versus-functional root split remains unresolved."}.

### hydrology:TributaryOf
Directed channel-network connection from a tributary reach to its receiving reach. Parent: `imod:Relationship` (verified_reference); status **blocked**. Sources: watersheds.
Positive: Joining tributary at a confluence. Negative: Nearby unconnected channel.
Bindings and limits: {"source": "hydrology:StreamReach", "target": "hydrology:StreamReach", "rationale": "Subject endpoints are scoped; transfer relations are observation-dependent and not inferred from adjacency. Structural-versus-functional root split remains unresolved."}.

### hydrology:GroundwaterFeeds
Observed transfer from groundwater to a surface-water recipient in the observation context. Parent: `imod:Relationship` (verified_reference); status **blocked**. Sources: groundwater, streamflow.
Positive: Gaining reach supported by transfer evidence. Negative: Hydraulic proximity alone.
Bindings and limits: {"source": "hydrology:GroundwaterBody", "target": "earth:WaterBody", "rationale": "Subject endpoints are scoped; transfer relations are observation-dependent and not inferred from adjacency. Structural-versus-functional root split remains unresolved."}.

### hydrology:LosesWaterTo
Observed transfer from a surface-water source into a groundwater recipient. Parent: `imod:Relationship` (verified_reference); status **blocked**. Sources: streamflow, infiltration.
Positive: Losing reach with supported exchange. Negative: Dry channel above deep groundwater without demonstrated connection.
Bindings and limits: {"source": "earth:WaterBody", "target": "hydrology:GroundwaterBody", "rationale": "Subject endpoints are scoped; transfer relations are observation-dependent and not inferred from adjacency. Structural-versus-functional root split remains unresolved."}.

### hydrology:NestedCatchmentIn
Containment of one surface catchment within another under compatible routing and outlet definitions. Parent: `imod:Relationship` (verified_reference); status **blocked**. Sources: watersheds.
Positive: Upstream tributary basin inside full basin. Negative: Overlapping management areas.
Bindings and limits: {"source": "hydrology:SurfaceCatchment", "target": "hydrology:SurfaceCatchment", "rationale": "Subject endpoints are scoped; transfer relations are observation-dependent and not inferred from adjacency. Structural-versus-functional root split remains unresolved."}.


## Event candidates

### hydrology:OverbankFloodEpisode
Bounded episode of channel water inundating normally unsubmerged adjacent land; onset/end rule supplied in context. Parent: `imod:Event` (verified_reference); status **blocked**. Sources: floods, streamflow.
Positive: Observed overbank inundation within bounded storm response. Negative: High stage confined within channel.
Relevant quality parameters: hydrology:Stage, hydrology:Discharge.
Bindings and limits: {"participants": "stream reach and inundated region", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Event delimitation is author interpretation, not source-defined universal threshold. No role conferral or downstream configuration instantiation is implemented."}.

### hydrology:RechargeEpisode
Bounded interval of water arrival replenishing a specified groundwater body; bounding rule explicit. Parent: `imod:Event` (verified_reference); status **blocked**. Sources: infiltration.
Positive: Observed recharge episode after vadose travel. Negative: Rainfall alone.
Relevant quality parameters: hydrology:StoredWaterVolume, hydrology:HydraulicHead.
Bindings and limits: {"participants": "groundwater body and arriving water", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Event delimitation is author interpretation, not source-defined universal threshold. No role conferral or downstream configuration instantiation is implemented."}.

### hydrology:LakeDrawdownEpisode
Bounded reduction of lake water storage; level decline is separate evidence requiring a basin relation to estimate volume. Occurrence does not identify its cause. Parent: `imod:Event` (verified_reference); status **blocked**. Sources: streamflow.
Positive: Lake drawdown bracketed by agreed endpoints. Negative: One low reading without change evidence.
Relevant quality parameters: hydrology:StoredWaterVolume.
Bindings and limits: {"participants": "lake water body", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Event delimitation is author interpretation, not source-defined universal threshold. No role conferral or downstream configuration instantiation is implemented."}.

### hydrology:ReachWettingEpisode
Bounded transition to observable connected water along a specified previously dry reach. Parent: `imod:Event` (verified_reference); status **blocked**. Sources: streamflow.
Positive: Documented wetting-front passage reconnects the reach. Negative: Missing sensor becomes available.
Relevant quality parameters: hydrology:StoredWaterVolume.
Bindings and limits: {"participants": "stream reach and water", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Event delimitation is author interpretation, not source-defined universal threshold. No role conferral or downstream configuration instantiation is implemented."}.

### hydrology:GroundwaterDepletionEpisode
Bounded reduction of groundwater storage under specified start/end and body boundary. Parent: `imod:Event` (verified_reference); status **blocked**. Sources: groundwater.
Positive: Observed storage reduction with a bounded assessment episode. Negative: Head decline treated as identical storage change without storage properties.
Relevant quality parameters: hydrology:StoredWaterVolume, hydrology:HydraulicHead.
Bindings and limits: {"participants": "groundwater body", "affects": ["hydrology:StoredWaterVolume"], "creates": [], "confers": [], "rationale": "Event delimitation is author interpretation, not source-defined universal threshold. No role conferral or downstream configuration instantiation is implemented."}.

## Question interpretation and counterexamples

### hydrology-Q01 — Which land drains to the bridge outlet, and is it the same area feeding the well?
Draft expression: `hydrology:SurfaceCatchment`.
Expected expression-result category: subject. Dependencies/gaps: Subsurface contributing-area distinction absent; two resolutions required.
Positive: Surface-drainage delineation. Negative: Groundwater contributing area asserted identical. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q02 — How much water is stored in this lake now?
Draft expression: `hydrology:StoredWaterVolume of hydrology:LakeWaterBody`.
Expected expression-result category: quality. Dependencies/gaps: Lake identity and storage observation.
Positive: Body-borne storage. Negative: Throughput accumulated without lake balance. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q03 — Is river water moving faster after the storm, or is more water passing the section?
Draft expression: `hydrology:Discharge of hydrology:ChannelFlow`.
Expected expression-result category: quality. Dependencies/gaps: Second expression FlowVelocity of ChannelFlow; section/time basis required.
Positive: Compare discharge separately from speed. Negative: Treat speed as volume throughput. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q04 — How much rain enters the ground instead of running over it?
Draft expression: `hydrology:InfiltrationFlux of hydrology:Infiltration`.
Expected expression-result category: quality. Dependencies/gaps: Rain partition needs water-balance model; expression is one component.
Positive: Surface-entry flux. Negative: Assume all infiltration recharges aquifer. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q05 — Does this reach gain groundwater or lose water into the ground?
Draft expression: `hydrology:GroundwaterFeeds linking hydrology:GroundwaterBody to hydrology:StreamReach`.
Expected expression-result category: relationship. Dependencies/gaps: Compare reverse relationship separately; direction can vary by context.
Positive: Supported groundwater-to-reach transfer. Negative: Infer gain from adjacent aquifer. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q06 — Can groundwater beneath one catchment feed a stream in another?
Draft expression: `hydrology:GroundwaterFeeds linking hydrology:GroundwaterBody to hydrology:StreamReach`.
Expected expression-result category: relationship. Dependencies/gaps: Subsurface geometry and transfer model; geographical overlay outside expression.
Positive: Transfer evidence crosses surface divide. Negative: Surface divide assumed groundwater barrier. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q07 — Why does this river flow after weeks without rain?
Draft expression: `hydrology:GroundwaterDischarge`.
Expected expression-result category: process. Dependencies/gaps: Causal explanation also considers releases and diversions; model needed.
Positive: Supported groundwater contribution. Negative: All dry-weather flow declared groundwater by definition. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q08 — Did the storm cause actual overbank flooding or just a high reading?
Draft expression: `presence of hydrology:OverbankFloodEpisode`.
Expected expression-result category: quality. Dependencies/gaps: Event boundaries/inundated-region link and attribution separate.
Positive: Bounded observed overbank inundation. Negative: High in-channel stage. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q09 — Did lake water decline by evaporation during the hot spell?
Draft expression: `change in hydrology:StoredWaterVolume of hydrology:LakeWaterBody`.
Expected expression-result category: process. Dependencies/gaps: Time transition and evaporation model; competing transfers.
Positive: Separate storage change and evaporation contribution. Negative: Assume heat means net volume loss. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q10 — Are two tributaries joined even when one is dry?
Draft expression: `hydrology:TributaryOf linking hydrology:StreamReach to hydrology:StreamReach`.
Expected expression-result category: relationship. Dependencies/gaps: Channel material identity versus water body must be split upstream.
Positive: Mapped channel connection persists under selected channel identity. Negative: Actual transfer inferred in dry reach. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q11 — Has pumping reduced stored groundwater, and can we separate other losses?
Draft expression: `change in hydrology:StoredWaterVolume of hydrology:GroundwaterBody`.
Expected expression-result category: process. Dependencies/gaps: Pumping belongs agency/engineering bridge; storage properties needed.
Positive: Observed storage change with attribution model. Negative: Head drop alone equals removed volume. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q12 — After wildfire, does the next storm carry more sediment to the river?
Expression gap after reviewer correction: transported sediment mass/load requires concentration, discharge and contextual integration; concentration change alone does not answer this question.
Expected expression-result category: unresolved. Dependencies/gaps: Soil erosion, sediment delivery and sampling model; no fire implication.
Positive: Observed concentration change at comparable support. Negative: Burn class entails increased concentration. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q13 — Is this river seasonally low, or has an agreed drought episode begun?
Expression gap: no honest single observable expression yet.
Expected expression-result category: unresolved. Dependencies/gaps: Upstream drought definition and baseline source review outstanding.
Positive: Contextual low-flow evidence distinguished from episode criterion. Negative: Universal drought threshold invented. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q14 — Can a dry reach reconnect during a wetting episode?
Draft expression: `presence of hydrology:ReachWettingEpisode`.
Expected expression-result category: quality. Dependencies/gaps: Wetting-process distinction, channel identity and emergence machinery unresolved.
Positive: Bounded observed reconnection. Negative: Sensor availability mistaken for water arrival. Semantic status: blocked; grammar initially untested (see generated parser report).

### hydrology-Q15 — Without a resolved change estimate, what remains known about lake storage?
Expression gap: no honest single observable expression yet.
Expected expression-result category: unresolved. Dependencies/gaps: Open-world resolution policy is core; no invented retention semantics.
Positive: Twin continues with explicitly available evidence. Negative: Unresolved change treated as zero. Semantic status: blocked; grammar initially untested (see generated parser report).

## Poorly specified quality summaries

- **LowFlow** summarizes hydrology:Discharge: Ordered relative to a specified seasonal reference distribution; no cutoff selected. Rule: requires reviewer-approved reference population and boundary; ordered; overlap: may overlap normal for another season/reference; context: reach, season, baseline; blocked; drought is not identical.
- **Gaining / Losing** summarizes direction of groundwater/surface exchange: Sign relative to explicit groundwater-to-surface orientation; simultaneous subreach gains/losses possible. Rule: direction at stated spatial support and interval; nominal; overlap: possible at aggregated reach support; context: exchange observation support; provisional; relations preferred to timeless predicates.
- **DryReach** summarizes hydrology:StoredWaterVolume: Water presence and connectivity interpretation; zero volume, no connected flow and unmeasured volume differ. Rule: no universal threshold or exhaustive dry/wet partition selected; nominal; overlap: isolated pools may coexist with disconnected reach; context: channel/flow support; blocked; unknown is evidence state.

## Iteration and review stop

Q10 blocks promotion of StreamReach: channel persistence and water-body identity differ. Q01 blocks unqualified watershed equality. Q13 remains a vocabulary/source gap; Q15 belongs to core resolution. Q12 needs a cross-domain model and does not license an affects clause from wildfire to sediment concentration. No new .kwv declarations are added by this dossier. The earlier two-file catchment overlay remains the only executable candidate, with its ancestry problem now explicit.

Current source review supports a useful research packet, not final science coverage. Freeze hashes and exact import revisions before external review. Ask hydrologists to resolve catchment volume/footprint, channel/water identity, flux bearer/section support and event delimitation; ask ontology reviewers about process parameter expression and missing confers syntax. Human approval and exact-revision semantic validation remain blocking gates.

## Reviewer correction record

Q12 keeps its source-led narrative but now records a load/flux gap instead of the insufficient concentration expression. WaterBody ancestry remains blocked for LakeWaterBody and SpringWaterBody as well: the existing parent denotes an Aquatic Region and does not establish material-water identity. All five process effects are now blocked pending typed source/recipient quality bearers; steady throughflow can occur without net storage change. These corrections are review findings, not scientific approval. The JSON is the current machine-readable status record; earlier candidate paragraphs are exploration history.
