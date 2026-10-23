# Minimal material-water naming recommendation

2026-10-23; discussion recommendation only, superseding the awkward *WaterMaterialBody names in r1 for naming discussion. The existing r1 files/receipts remain unchanged. No source changes, integration or semantic validation result is asserted here.

Recommend shared material root **hydrology:Water**, with ordinary English specializations **hydrology:SubsurfaceWater**, **hydrology:Groundwater**, **hydrology:SurfaceWater**, and **oceanography:Seawater**. Hydrology owns the common hydrological distinctions; Oceanography imports that root for its marine specialization. This is vocabulary ownership, not exclusive ownership of the material by an academic discipline. Do not add another WaterBody alongside the geographic earth:WaterBody.

The declaration cores below belong in their respective namespaces, not as qualified declaration names. Definitions and review metadata would accompany integration; these cores have not been separately parsed or reasoner-tested.

```kwv
// namespace hydrology, using physical
thing Water
    "An individuated material body of water, including natural water mixtures, under a stated observational boundary convention."
    is physical:MaterialBody;

thing SubsurfaceWater
    "Water material below the ground surface, without restricting it to the saturated zone."
    is hydrology:Water;

thing Groundwater
    "Subsurface water occupying the saturated zone, individuated under a stated hydrogeological convention."
    is hydrology:SubsurfaceWater;

thing SurfaceWater
    "Water material present at the Earth's surface, individuated under a stated hydrological convention."
    is hydrology:Water;

// namespace oceanography, using hydrology
thing Seawater
    "Marine water material, individuated under a stated oceanographic convention."
    is hydrology:Water;
```

This is five names, not an exhaustive hydrologic taxonomy. Groundwater uses the saturated-zone sense. Broader subsurface water supplies a place for vadose/unsaturated-soil water without misnaming it groundwater. No additional VadoseWater or SoilWater Subject is needed for this increment. Soil describes a host/material context; soil water is not universally synonymous with vadose water, since soil need not always be unsaturated. Later named specializations must justify their own observational discrimination. No children are asserted disjoint and Seawater is not asserted below SurfaceWater. Marine groundwater and transitional contexts are not eliminated by a premature partition or salinity threshold.

The formal head is an individuated material body, not a chemical identity, measured water quantity, geographical Region or FluidParcel. Neither pure H2O identity nor any Solution/mixture constituent rule is entailed. FluidParcel remains narrower through its material-following boundary; no generic Water -> FluidParcel inheritance is added. No new realm is invented; SeaSurface cannot substitute for all marine material. Explicit observational boundaries still need establishment and do not arise from naming the class.

## Source-backed scope recommendation

[USGS Groundwater Basics](https://www.usgs.gov/mission-areas/water-resources/science/groundwater-basics), directly retrieved2026-10-23, describes groundwater through saturation of pores/cracks in soil and rock, including settings beneath oceans. It also identifies dissolved constituents, supporting the separation of water material from pure-chemical identity and host rock. [USGS Water Resources Glossaries](https://water.usgs.gov/water-basics_glossary.html), search/direct retrieved2026-10-23, records broad all-subsurface usage and the more common saturated-zone usage of ground water. The [older USGS Ground Water glossary](https://pubs.usgs.gov/gip/gw/glossary.html) gives the same ambiguity in indexed text, but direct retrieval returned403 in this pass. The [1989 federal subsurface-water glossary](https://pubs.usgs.gov/publication/70100276), DOI10.3133/70100276, explicitly covers both saturated and unsaturated flow in its retrieved abstract; full report definitions were not examined. These support retaining the established narrower Groundwater sense while using the transparent broader SubsurfaceWater label; they do not dictate namespace allocation or universal body individuation.

[TEOS-10](https://www.teos-10.org/), directly retrieved in the preceding pass, treats seawater composition and its salinity quantities. It does not establish that a seawater material body is a pure-H2O chemical identity. Exact marine/estuarine boundaries and phase cases are not decided by this naming recommendation.

## Smallest owner decision

Accept **hydrology:Water** as the shared material-body name, with **Groundwater reserved for saturated-zone water**, **SubsurfaceWater** covering the broader subsurface meaning, and **oceanography:Seawater** as a direct shared-root specialization. This naming/ownership package replaces the earlier WaterMaterialBody suffixes; it does not request a new domain, larger hierarchy or resolution of mixture partitive inherency.

After that decision: update the concrete overlays/records to a new revision, retain IDs for renamed proposals, give SubsurfaceWater its own ID, run complete grammar/document/reasoner plus positive/negative common-parent and geographic/material separation checks, obtain independent review, then integrate only the validated settled increment under existing authorization.

Tests to discriminate semantics: saturated groundwater, identified river-water material and identified marine-water material all match Water; water in an unsaturated soil sample matches the broader subsurface interpretation without inferring Groundwater; the aquifer rock host and geographic earth:WaterBody do not become Water; salinity alone does not establish marine context; Seawater is not automatically SurfaceWater or FluidParcel. A groundwater-to-river-to-sea transfer can use common Water endpoints only with independently observed transfers and compatible support/time/units. These are planned scenarios, not executed results.
