# Minimal candidate articulation for discussion

These are tentative semantic records for each of the 23 provisional review addresses, not executable declarations or accepted Tier-1 content. **P** means a provisional, source-motivated formulation requiring review. **B** means blocked by the stated category, scope or evidence question. Neither means consensus. Placement does not decide consolidation.

Types use the context pack's implicit upper-derived meanings: `thing` = structural substantial; `agent` = agentive substantial (intentionality scope is disputed); `quality` and specialized quantity keywords = dependent observables; `process` = dependent functional observable; `event` = bounded occurrence; `relationship` = relational observable with endpoints; `configuration` = recognized arrangement; identities/attributes/roles are predicates, with roles contextually conferred. None is a direct ODO import. Applicability and participants below are meaning constraints for review, not untested clauses.

`current:` points to this repository's base `src/`; `legacy:` to im/src/; `ARIES:` to im.aries/src/. Exact files, declarations and hashes are indexed in [source inventory](evidence/SOURCE_INVENTORY.md). External source IDs refer to [SOURCES](SOURCES.md); new evidence is scoped in the [four-domain supplement](DOMAIN_EVIDENCE_SUPPLEMENT.md). Reusing a source term does not adopt all its existing axioms. Only SurfaceCatchment and its scoped alias have candidate files; all other rows remain prose.

## physical

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **Collapse — P:** bounded loss of the identity under which a substantial is observed. | event; affected substantial identified explicitly. | current:physical.kwv Collapse; user's occurrent-only cessation constraint. | A stale or missing observation is not Collapse. Identity criterion and effects on dependent configurations require review; no termination machinery supplied. |
| **MaterialTransport — P:** ongoing displacement of material between locations. | process; material participants, contextual origin/destination. | legacy:physical.kim MatterTransport. | An inventory of stored material is not transport. Amount, rate and displacement are separate qualities; no implicit flow model. |

## physics

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **MaterialPhaseArrangement — B:** recognized phase arrangement of a specified material body. | candidate configuration; material bearer/parts. | legacy:physical.kim Phase; NIST TN2312, scoped in supplement. | Same composition is insufficient to identify phase. Configuration versus qualifying predicate is unresolved; NIST does not choose the ODO category. |
| **PhaseTransition — P:** ongoing transformation between material phases. | process; transforming material and phase endpoints; bounded episode could instead be event. | legacy:physical.kim PhaseTransition; TN2312 crystalline element transitions at atmospheric pressure. | A phase name or transition-temperature value is not an occurrence. Generalization beyond source conditions needs evidence. |
| **MaterialTemperature — P:** temperature of a specified material bearer. | temperature quality; material body/sample. | NIST TDE property inventory; current root temperature type. | A transition threshold is not necessarily present sample temperature. Density and viscosity remain separately defined qualities. |

## chemistry

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **ChemicalIdentity — B:** predicate identifying a specified chemical entity or accepted chemical grouping. | identity; applies to chemical material under a pinned authority scope. | current:chemistry.kwv ChemicalSpecies and owner's CHEM patch broadening it to ChemicalIdentity. | A mixture is not one chemical species. Compound-family versus species scope and provider identity require review; do not approve the broadening silently. |
| **ConstituentMassFraction — P:** mass of a specified constituent relative to total material mass. | proportional quality; material bearer plus identified constituent. | legacy:chemistry.kim concentration/Purity distinctions; explicit mass-basis reformulation is a modeling choice. | A mass-per-volume concentration is not this quantity. Mixture/phase boundary and constituent definition must be explicit; units and estimation outside vocabulary. |

## earth

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **WaterBody — P:** bounded identifiable body of water. | thing; water material and contextual boundary. | current:earth.kwv WaterBody, Lake, Ocean; GWML fluid-body distinction. | A region potentially containing water is not an observed water body. Identity across flows remains a review question. |
| **PrecipitationEpisode — P:** bounded episode of atmospheric water deposition. | event; depositing water, receiving region and episode boundary. | current:earth.kwv MeteorologicalEvent/Precipitation/PrecipitationVolume. | Accumulated precipitation volume is a quality, not an episode. Proposed bounded name separates event from ongoing precipitation process. |

## geography

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **SurfaceElevation — P:** vertical position of a specified surface location relative to a stated reference. | length quality; location/surface bearer and reference. | current:geography.kwv Elevation; separates source DEM/Lidar wording from meaning. | Canopy-return height is not automatically ground elevation. Reference/frame comes from context; change requires a separate description/occurrent. |
| **TerrainArrangement — P:** recognized arrangement of land-surface relief in a region. | configuration; surface locations and their relative qualities. | current:geography.kwv Terrain, Elevation/Slope/Aspect. | A stored DEM file is not the configuration itself. Recognition does not establish a currently implemented detection engine. |

## geology

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **RockMaterialIdentity — P:** predicate for material understood as an aggregate of minerals/mineraloids. | identity; applies to material, not automatically an entire geographic unit. | legacy:geology.kim Rock; GeoSciML pointer remains a supplementary, incompletely verified source. | A mapped formation containing several lithologies is not one rock identity. Authority and genesis-qualified categories need separate review. |
| **GeologicalBody — B:** bounded region individuated by specified geological material/structure criteria. | candidate thing; material constituents and boundary criterion. | current:earth.kwv GeoFormation; legacy geology; proposed generalization. | A geological-unit classifier is not a particular body. Criteria and external primary evidence are insufficient for acceptance. |

## atmosphere

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **AirIdentity — P:** material-composition predicate for atmospheric air under stated scope. | identity specializing mixture meaning; atmospheric material. | current:atmosphere.kwv Air is chemistry:Mixture. | A parcel's identity is not its temperature or pressure. Composition scope must allow relevant variation without conflating air with every gas mixture. |
| **WindMotion — P:** motion of atmospheric air relative to a stated frame. | process; air participant; velocity as separate dependent quality. | legacy:earth.kim weather/wind vocabulary; physical transport distinction. | A wind-speed number is not the process. Fire spread consequences belong to models, not this declaration. |

## hydrology

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **SurfaceCatchment — P:** region delineated by surface drainage convergence to a specified outlet. | thing specializing earth:Region; boundary is contextual. | legacy:hydrology.kim Watershed; IPCC Catchment. Actual tested overlay. | A management district crossing drainage divides is excluded. Surface footprint versus volumetric parent scope remains open. |
| **WaterVolume — P:** volume of specified water associated with a bearer/system. | volume quality; explicit water-bearing body/region. | legacy:hydrology.kim WaterVolume and runoff-volume distinctions; GWML. | Water flow rate is not stored/accumulated volume. Do not infer actual water merely from an aquifer label. |

## oceanography

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **MarineWaterBody — P:** water body scoped to a marine setting. | thing, potentially composition of WaterBody with marine realm; not necessarily new atomic class. | current:earth.kwv Ocean/Sea; NOAA Principles 1A–B/E. | The seafloor basin is not the contained water body; seawater material is not its identity/boundary. |
| **OceanCirculation — P:** movement of marine water through connected regions. | process; water participants; speed/transport quantities separate. | NOAA Principle 1C educational synthesis. | A basin map is not circulation. Broad descriptions of drivers are not universal causal clauses. |
| **AbsoluteSalinity — B:** explicitly selected TEOS-10 salinity meaning for seawater. | dependent quantity; seawater bearer and defined composition convention. | TEOS-10 section 2.5, A.4–A.5; supplement. | Practical Salinity is not an unrestricted equal. Exact definition/variant needs specialist selection; oxygen concentration and ecosystem condition remain distinct. |

## soil

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **SoilHorizon — B:** distinguishable layer within a soil body, delimited by specified characteristics. | candidate configuration versus dependent thing; soil host and adjacent layers. | legacy:soil.kim Horizon; FAO soil definitions. | An arbitrary sampling-depth interval is not necessarily a horizon. Host dependence and category need review. |
| **SoilFormation — P:** ongoing formation/transformation of soil material and organization. | process; parent material and soil participants. | legacy:soil.kim SoilGenesis/Pedogenesis. | A taxonomic soil label is not the formation process. Models supply mechanisms; no automatic creation of a taxon. |

## life

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **OrganismIndividual — B:** an organism individuated as a living whole. | substantial; agent versus non-agentive thing unresolved; boundary/identity criterion explicit. | current:life.kwv Individual; legacy:biology.kim Individual. | A taxon or collection of organisms is not one organism. Intentionality cannot be inferred from biological individuality. |
| **TaxonomicIdentity — P:** predicate identifying a taxonomic entity under an explicit authority release. | identity; appropriate organism/group bearer, scope to be reviewed. | owner's TAXA patch; legacy:biology.kim taxonomy and nomenclature. | Commonsense “fish” is not automatically one formally recognized taxon. A code requires provider/release validation. |

## biology

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **OrganismBiomass — B:** mass of biological material of a specified organism. | mass quality; organism bearer, included material and water basis required. | legacy:biology.kim Biomass; reformulation exposes bearer. | Production per time is not mass. Living/dead and dry/wet scope remain unresolved; no supposedly universal biomass definition emitted. |
| **OrganismGrowth — B:** ongoing increase/development under an explicitly selected biological growth criterion. | process; organism participant; size/mass changes separately observed. | legacy:biology.kim Growth; current life/biology boundary provisional. | Water uptake alone is not necessarily the intended biological growth. Criterion must be narrowed before executable use. |

## genetics

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **NucleotideArrangement — B:** ordered nucleotide arrangement borne by a specified DNA segment. | candidate configuration or dependent structural observable; DNA material bearer. | NHGRI DNA/Locus entries; supplement. | A printed sequence is a representation, not the material arrangement. Category is unresolved; do not assign automatically to Knowledge. |
| **AllelicVariant — P:** alternative sequence at a corresponding genomic locus. | candidate identity predicate; segment and homologous-locus scope required. | NHGRI Allele entry. | Different sequences at unrelated loci are not thereby alleles of one locus. Human diploid examples do not impose universal two-copy rules. |
| **GeneExpression — B:** regulated process using a specified gene's information to produce RNA under a scoped gene definition. | process; genomic material, cellular context, possible RNA product. | NHGRI Gene Expression and Gene narration, including noncoding RNA. | Sequence presence is not expression/activity/phenotype. Gene boundary/function disputed; no creates-RNA axiom accepted. |

## ecology

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **EcosystemArrangement — P:** recognized interacting biological community and nonliving environment under stated system boundary. | configuration; organisms/environment participants. | legacy:ecology.kim Ecosystem; CBD Article 2, convention scope. | A vegetation class alone is not an ecosystem. System identity and functional versus structural view remain reviewable. |
| **TrophicParticipant — P:** role of an organism/group in a specified feeding interaction. | role; applies to participants relative to interaction and counterpart. | legacy:ecology.kim TrophicRole/EcologicalInteraction. | Taxonomic identity alone does not confer every feeding role. Models/evidence resolve interaction; no role-conferral engine added. |

## agency

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **Intentional — P:** action/participation qualified by an attributable intention toward an outcome. | attribute; agency/activity scope needs explicit review. | current:agency.kwv Intentional and Decision. | Reactive movement is not evidence of intention. No universal inference from agent keyword to human deliberation. |
| **ActionParticipant — P:** role held through participation in a specified intentional activity. | role; participant and conferring activity/context. | current:agency.kwv Participant; physical participation vocabulary. | Mere proximity to an activity does not establish participation. Cessation requires an occurrent; implementation deferred. |

## society

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **HumanIndividual — B:** individual organism qualified by the scoped human taxonomic identity. | agent/substantial interpretation inherited from unresolved OrganismIndividual choice. | current:society.kwv; owner's Human move/TAXA patch; legacy:demography.kim. | A household is not one organism. Species identity does not settle social roles or intentionality. |
| **Institution — B:** socially maintained organization or rule-governed arrangement, senses requiring separation. | candidate agent organization versus configuration of rules/relations. | current:society.kwv Institution; legacy:policy.kim Institution. | A rule and the organization administering it are not automatically one substantial. Polysemy blocks acceptance; no vague merged class. |

## sociology

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **CoResidence — P:** persons sharing specified usual-residence accommodation in the observation context. | structural relationship; person endpoints plus residence context. | UNECE 2030 paragraphs 958–963; statistical scope. | Co-residence does not entail kinship or shared finances. Multi-person household configuration is separate. |
| **DomesticProvisionGroup — B:** persons sharing specified domestic provision under an explicit grouping criterion. | candidate configuration; people, provision activities and residence scope. | UNECE boarder/lodger examples motivate, but do not define a universal class. | Same dwelling alone is insufficient. Definition and nonresidential cases require broader evidence. |
| **WorkAuthority — B:** authority a participant exercises over specified work/economic-unit decisions. | role/relation proposal; worker, work and economic unit specified. | ILO ICSE-18 authority/risk dimensions. | Payment alone does not identify authority or legal employee status. Category and institutional scope need review. |

## infrastructure

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **BuiltArtifact — P:** identifiable material artifact intentionally constructed or materially modified. | thing; physical components; manufacture history distinct from present function. | current:infrastructure.kwv Artifact; legacy:infrastructure.kim BuiltArtifact. | A naturally occurring channel is not built solely because people use it. Boundary of modification needs review. |
| **UsableResource — P:** role of an entity as available for a specified activity/agent purpose. | role; entity, activity and agent/context. | current:infrastructure.kwv Resource. | Existence or ownership alone does not establish availability for that purpose. Avoid equating role with physical material identity. |

## engineering

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **Machine — B:** manufactured device organized to perform a specified operation. | thing specializing artifact; designed operation and components. | Machine is declared in legacy:engineering.kim:5; its parent ManufacturedProduct is declared in legacy:infrastructure.kim:278 and referenced at engineering.kim:6. Definition remains sparse. | A static monument is not a machine merely because manufactured. Functional criterion needs specialist evidence. |
| **TransportVehicle — P:** machine/artifact configured for transporting participants or material. | thing or compositional alias with transport function, equality review pending. | legacy:engineering.kim Vehicle is Machine for infrastructure:Transportation. | A road supports transport but is not thereby a vehicle. Present motion not required; capability versus actual use separated. |

## economics

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **EconomicAsset — P:** role of an entity valued for an economic agent under a stated perspective. | role; entity and valuing agent/context. | current:economics.kwv EconomicAsset; legacy risk/asset discussion. | A physical object is not automatically an asset for every observer. Positive-only value rule needs review. |
| **WealthValue — P:** monetary valuation of an agent's scoped stock of holdings at an observation context. | money quality; individual/group/institution bearer and valuation scope. | legacy:economics.kim Wealth; explicitly unresolved stock/flow comments. | Income received over an interval is not this stock. Gross/net and ownership boundaries need definition; accounting formulas outside. |
| **ReceivedIncome — B:** monetary amount received by an agent over an explicit accounting interval under a chosen income convention. | money quality of agent/receipt scope; not a process itself. | legacy:economics.kim Income; reformulation addresses source stock/flow concern. | Asset-price revaluation is not necessarily received income. Convention and receipt boundary require economic review. |

## land

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **LandSurfaceUnit - B:** actual bounded surface, independent of its map. | subject; upstream surface parent unresolved. | FAO cover/use and EEA land. | Volumetric earth:Region is not silently substituted. |
| **LandUseConversion - B:** bounded actual transition between uses. | event; source/target uses and surface participants. | EEA cross-sector land use; revised land dossier. | Plan or authority relabeling alone is not physical conversion. |

## agriculture

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **ManagedField - B:** cultivated surface with an explicit boundary. | subject; surface parent unresolved. | legacy agriculture.kim Cropfield; stable land-ManagedField moved into agriculture research. | Vegetation alone does not prove cultivation. |
| **ManagedHerd - B:** livestock group with explicit membership and management unity. | subject versus configuration; population specialization unresolved. | Historical FAO WCA livestock evidence. | A polygon's animals are not automatically one herd; raising differs from owning. |

## decision

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **ChoiceOccurrence — P:** bounded choice among considered alternatives by an intentional participant. | event; choosing participant and alternative set. | legacy:behavior.kim Decision (event), contrasted with current:agency.kwv Decision (process). | Ongoing deliberation without a bounded choice is not this event. No universal transformation effect assumed. |
| **ConsideredAlternative — P:** role of an option considered within a particular decision activity. | role; option and conferring decision context. | legacy:behavior.kim Alternative/Choice. | A physically possible option never considered is not automatically this role. Numerical ranking/optimization is model work. |

## valuation

| Tentative meaning and status | Upper-derived category; bearer/participants/applicability | Evidence and scope | Discriminating counterexample / unresolved choice |
|---|---|---|---|
| **Stakeholder — P:** agent role grounded in a specified stake in an asset/outcome. | role; agent, asset/outcome and valuation context. | current:valuation.kwv Stakeholder; legacy:risk.kim. | A nearby observer is not necessarily a stakeholder. Proposed role consequences do not execute today. |
| **HazardOccurrentRole — B:** role of an occurrent considered capable of harming a valued entity in scope. | role applying to process/event; asset relation explicit. | current:valuation.kwv Hazard and IPCC scoped hazard distinctions. | Collapse probability is a quality, not the hazard role. Actual versus potential harm and nonterminal harm require reconciliation; no silent equivalence. |
| **ExposureArrangement — P:** recognized co-presence of relevant assets and a compatible hazard under explicit exposure conditions. | configuration; asset and hazard participants, context supplied by core. | current:valuation.kwv Exposure; legacy:risk.kim; IPCC. | Exposure is not actual loss or susceptibility. The recognition description and future detection machinery remain separate. |

These records provide a small initial articulation rather than merely a list of topics. They deliberately leave ambiguous records blocked, and do not imply that adding two or three records completes any domain. Cross-domain aliases and predicates should reduce duplicate atomic meanings after review; names and ownership can change without forcing philosophical consolidation now.
