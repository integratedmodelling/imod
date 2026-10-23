# Earth interfaces against living and foundations

Review completed 23 October 2026; saved after desktop connection recovery. Scope: read-only comparison of the completed Earth, Living and Foundations packets. This is an independent source/document cross-check, not a loaded semantic test or a claim of formal inconsistency. Other reviewers' proposals and repository sources were not changed. All proposed changes below remain suggestions without recorded community acceptance.

## Substantive Earth proposal for the coordinator

The Earth packet supplies small material-support families rather than exhaustive taxonomies:

```kwv
thing AirBody is physical:MaterialBody;
thing WaterBody is physical:MaterialBody;
thing GroundwaterBody is reviewhydrology:WaterBody;
thing MarineWaterBody is physical:MaterialBody;
thing RockStratum is geology:RockBody;
thing SoilHorizon is soil:SoilBody;
```

These excerpts abbreviate the full declarations; their actual namespaces are `reviewatmosphere`, `reviewhydrology`, `reviewoceanography`, `reviewgeology` and `reviewsoil`. AirParcel and MarineWaterParcel also specialize existing `physics:FluidParcel` through intersection with their respective material-body family. They do not retype fixed geographic regions as moving material.

Dependent observations include AirTemperature, SpecificHumidity, WindSpeed and WindDirection; AbsoluteSalinity; StoredWaterVolume and CatchmentArea; HorizonThickness, ClayFraction and OrganicMatterFraction; and SurfaceCoverFraction/SealedSurfaceFraction. Their native supports and measurement bases matter more than superficial shared units.

Concrete connections select both axes: FaultCutsBody is structural directed; MaterialContact and PhysicalAssetConnection are structural bonds; TransfersWaterTo, ExchangesWaterTo, ManagesLand and SuppliesWaterTo are functional directed. WaterDeliveryNetwork emerges from actual supply connections, separately from its application target. SoilProfile is a recognized vertical arrangement, not an observational container or material part-of assertion.

## High-priority conflicts and integration gaps

### X1 — one shared material-water family is still missing

Earth hydrology declares `reviewhydrology:WaterBody is physical:MaterialBody`, while oceanography declares `reviewoceanography:MarineWaterBody is physical:MaterialBody`. They are siblings with no shared water-specific parent or proved alignment. `TransfersWaterTo` accepts hydrology WaterBody endpoints; `ExchangesWaterTo` accepts marine-body endpoints. A river–estuary–sea transfer cannot simply reuse either signature across the other family. Neither material body is equivalent to geographic `earth:WaterBody`.

**Recommendation for arbitration:** select a canonical shared material-water head and specialize marine/subsurface readings where identity criteria justify it. Then choose a shared transfer family or explicit narrower specializations. Do not silently add mutual disciplinary imports or equate a water stock, parcel and region.

Sources: `earth/kwv/hydrology.kwv:21,25,29,34`; `earth/kwv/oceanography.kwv:11,24,32`; Foundations `PROPOSALS.md` PY2/CH1. Positive test: tracked marine water moves through a fixed inlet; negative: the geographic inlet is automatically the moving material body.

### X2 — Region does not yet settle the common surface support

Earth's SurfaceCatchment specializes Region; LandSurfaceUnit specializes Terrestrial Region. Active Region has Areal ancestry and volumetric prose. Living explicitly withholds ManagedField pending a shared surface bearer. These are compatible cautions, but the Earth drafts must not be mistaken for a resolution of that foundational ambiguity. HabitatPatch/corridor and agricultural yield denominators depend on the same choice.

**Recommendation:** preserve the existing candidates as blocked alternatives until the shared surface/volume contract is chosen; distinguish horizontal footprint, physical surface, host volume and material. No change to the settled non-mereological containment contract is needed.

Sources: `earth/kwv/hydrology.kwv:12`; `earth/kwv/land.kwv:13`; `living/proposals/agriculture.kwv:100`; Living `PROPOSALS.md` E4/R2/R6; active `src/earth.kwv:31`. Positive: specified surface drainage basin; negative: recharge volume, management district and field surface automatically share one identity.

### X3 — MaterialBody does not by itself establish an abiotic endpoint

Living's `ecology:BioticAbioticCoupling` is functional directed Agent → MaterialBody. The same packet proposes CellularBody, TissueBody and OrganBody under MaterialBody. Thus the declared endpoint type alone does not distinguish an abiotic material participant from a structurally observed biological material body. Living already calls this a narrow seed rather than exhaustive coupling; this finding sharpens its recognition/evidence obligation, not a new claim that Ecosystem's criterion is unknown.

**Recommendation:** make the observed abiotic-participant meaning/evidence explicit before treating this connection as sufficient recognition support. Do not globally declare all MaterialBody abiotic or retype organism Agents as Subjects. Soil/water material support can provide legitimate endpoints, but a whole soil body may include living constituents; the perspective and participant scope still matter.

Sources: `living/proposals/ecology.kwv:72,75`; `living/proposals/life.kwv:163,166,169`; Living `PROPOSALS.md` E3. Positive: documented organism–water/soil-material exchange under explicit scope; negative: any Agent-to-MaterialBody connection automatically recognizes an ecosystem.

### X4 — unit-compatible meanings still need shared bases

SpecificHumidity and AbsoluteSalinity use Proportion and are mass fractions; proposed `review.chemistry:MassFraction` is a plausible common semantic parent after constituent/support alignment. This is a proposed integration hook, not an active root already available. Absolute and Practical Salinity remain distinct.

ClayFraction is explicitly dry-mass based; OrganicMatterFraction states a mass basis. MineralFraction and surface-cover fractions need their denominator conventions settled before equating or aggregating results. CatchmentArea is horizontal; a cover fraction must not silently mix projected horizontal area and actual surface area. Existing Soil BulkDensity also needs dimensional comparison with proposed MassDensity; it is not automatically equivalent to dimensionless Ratio. Unknown unit metadata must remain different from explicit unit one.

Sources: Earth atmosphere/oceanography/soil/geology/land drafts; `foundations/proposals/review.chemistry.kwv:24,27,31`; `review.physics.kwv:19,28`; Foundations `PROPOSALS.md` unit ledger and CH2/PY2. Positive: same constituent, denominator, preparation and support; negative: equal number/unit alone proves equal observable meaning.

## Useful coordination, without claiming contradictions

**X5 Contact hierarchy:** Earth MaterialContact, foundations PhysicalContact, infrastructure PhysicalAssetConnection and engineering ComponentAttachment overlap but are not proved equivalent. Contact is weaker than attachment and neither proves actual supply. Coordinate narrower specialization under shared contact where justified. Sources: `earth/kwv/{geology,infrastructure}.kwv`; `foundations/proposals/review.physical.kwv:14`; `review.engineering.kwv:37`.

**X6 Native process support:** Earth leaves native dependence of AirAdvection/CloudCondensation unresolved. Foundations encodes PhaseChange/MolecularDiffusion with material-body native support. This is an unresolved alignment choice rather than a demonstrated logical contradiction. Resolve native bearer, participant, reference support and process quantity meanings separately; do not use observation containment to supply them. Sources: Earth atmosphere draft; foundations physics draft; Living PROPOSALS B6/R6.

**X7 Evaluation packaging:** Living files are full same-namespace replacement overlays; Earth and foundations use separate review namespaces. A combined isolated evaluation must replace the six Living baseline namespaces rather than load duplicate declarations, while adding the review namespaces and preserving their explicit imports. Syntax passes in separate packages are not evidence of a combined linked worldview. Sources: Living SUMMARY/VALIDATION; Earth kwv README; foundations proposals README.

## Compatible shared hooks — preserve these settled choices

- **Ecosystem:** biotic–abiotic coupling is the criterion. `BioticAbioticArrangement` recognizes a configuration; `EcosystemType` is a separate typology Identity hook. Ecosystem itself is not Identity. The remaining head/identity/continuity question does not reopen the criterion. Source: `living/proposals/ecology.kwv:72-80`; Living E3; Earth L2/L5 and interfaces.
- **Land classification:** existing `land:LandCover` Identity is legitimate and differs from `earth:LandCover` Configuration. Land cover and ecosystem typology share a mediation problem/mechanism, not an equivalence. No automatic taxonomy or authority mapping is supplied.
- **Host/occupant/material:** foundations HostBoundCavity/CavityHostedBy matches Earth's tank-material versus cavity/contents/region distinction. SoilBody/water-body/air-body are material observations; location, host and observational container must not become their identities. Source: `foundations/proposals/review.physical.kwv:20,24`; Earth H2/I5.
- **Living/material:** Individual remains Agent. Structural biological bodies and detached material observations can use reviewed MaterialBody meanings without contradictory same-observation dual typing. Earth introduces no organism-as-Subject hierarchy.
- **Engineering:** Pump/Valve and OpeningFraction complement Earth WaterPipe/WaterStorageTank. Actual supply, physical connection, geometric opening and rated capacity remain independent. Source: foundations engineering EN1/EN4/EN5; Earth I1-I4.
- **Containment:** observational containment is non-mereological and does not automatically establish spatial enclosure, temporal coverage, existence or membership. All three packets retain that contract; no containment repair or new generic part-of relation is proposed here.

## Read/save and preservation status

All paths above are relative to `C:/Users/Ferd/Documents/Codex/2026-10-23/domain-reviews/`, except active source references. Relevant packet bytes are pinned in `cross-domain-evidence.json`. The first save attempt was prevented by a desktop transport disconnect; the completed comparison was returned in chat. After reconnection, actual read access was verified and this additional report was saved in Earth's own output folder only. No other proposal or repository file was changed, and no broad build or semantic/runtime test was run.

Recovery inspection requested by the coordinator: at 2026-10-23 09:24:08 +02:00, `domain-reviews/societal/` did not exist. Therefore no societal draft or document completeness could be verified at that destination. No unrelated task storage was searched and no societal research was recreated.
