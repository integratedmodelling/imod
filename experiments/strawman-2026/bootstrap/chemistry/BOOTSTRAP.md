# Chemistry bootstrap dossier

Chemical entities, phases and five observable transformation/transfer processes relevant to water, atmosphere and wildfire materials; species authorities remain separately governed.

**Status:** local draft, no human approval, no executable ontology. Requested Tier1; imported root context is recorded without mechanically emitting redundant `is` clauses. A reference that exists is not a scientifically accepted parent. Proposed imported MaterialBody remains blocked until upstream review.

## Question-first evidence and method

The fifteen questions were saved before the local candidate table in QUESTIONS_FIRST.json (SHA256 `ec0e0fe81c6ea82093a8253ddcbb78674af0d97bb5cbd5e1082b072562d375b5`). The author had seen the legacy and previous packet, so this is not blind testing. Questions were not retroactively renamed to fit concepts. No independent expert discussion has occurred.

## Sources and limits

- **BIPM** [BIPM SI Brochure ninth edition](https://www.bipm.org/documents/d/guest/si-brochure-9-en-pdf), 2026 online edition; section2.3.1 Table2 and derived quantities. Distinguishes mass, temperature, amount; unit tables do not dictate observable ancestry. Retrieved2026-10-03.
- **IUPAC-ADSORB** [IUPAC Dissociative adsorption D01803](https://goldbook.iupac.org/terms/view/D01803/plain), 5th ed2025; definition;1976 recommendations p76. Surface-bound fragments; does not prove every adsorption is dissociative. Retrieved2026-10-03.
- **IUPAC-DISSOLUTION** [IUPAC Dissolution D01806](https://goldbook.iupac.org/terms/view/D01806/plain), 5th ed2025; definition; 1994 recommendations p581. Phase mixing into homogeneous solution; not automatic chemical species conversion. Retrieved2026-10-03.
- **IUPAC-ENTITY** [IUPAC Molecular entity M03986](https://goldbook.iupac.org/terms/view/M03986/pdf), 1994 recommendations p1142; fetched PDF search text. Singular molecular entity distinguished from chemical species ensemble; state precision context-dependent. Retrieved2026-10-03.
- **IUPAC-HOM** [IUPAC Homogeneity H02845](https://goldbook.iupac.org/terms/view/H02845/plain), 5th ed2025; definition;1990 recommendations p1201. Uniformity depends on named property/analyte; no global homogeneous identity. Retrieved2026-10-03.
- **IUPAC-OX** [IUPAC Oxidation O04362](https://old.goldbook.iupac.org/plain/O04362-plain.html), 1994 recommendations p1148; archived definition. Electron-loss and oxidation-number interpretations; oxygen gain is not necessary. Retrieved2026-10-03.
- **IUPAC-PHASE** [IUPAC Phase P04528](https://goldbook.iupac.org/terms/view/P04528/plain), 5th ed2025; definition; 1994 recommendations p588. Uniform composition and physical state; bounded phase portion is proposed observational individuation. Retrieved2026-10-03.
- **IUPAC-PRECIP** [IUPAC Precipitation P04795](https://goldbook.iupac.org/terms/view/P04795/json), 5th ed2025; definitions1-3. Chemical, electrostatic and meteorological senses explicitly distinguished; do not unify. Retrieved2026-10-03.
- **IUPAC-REACTION** [IUPAC Chemical reaction C01033](https://www.dev.goldbook.iupac.org/terms/view/C01033/json), 5th ed2025; definition and microscopic-event note. Species interconversion including conformers; entity event vs ensemble reaction distinction. Retrieved2026-10-03.
- **LOCAL** [Pinned ontology/context pack and user change commitments](../METHOD.md), METHOD change boundary; src/imod.kwv:289-447; src/physical.kwv; src/earth.kwv. Local design evidence, not external science; current comments not automatically accepted. Retrieved2026-10-03.

## Scope and dependency argument

Five subject candidates support five processes, two relationships and three bounded event patterns. These are observational candidates, not automatic literalizations of every dictionary noun. MolecularEntity has singular identity; the legacy ChemicalSpecies identity declaration must not silently stand for IUPAC ensembles and molecular tokens simultaneously. PhasePortion is a proposed bounded observational reading of phase, not evidence that every thermodynamic phase is already a countable. AdsorbentBody may be better a MaterialBody carrying a contingent surface-interaction role, and SolutionPortion may be PhasePortion plus a compositional predicate. Those alternatives remain blocked rather than being forced into subject taxonomies. Precipitation is explicitly chemically qualified to avoid both atmospheric rain and electrostatic particle collection.

Proposed dependency order: imod → physical → physics/chemistry/earth; earth does not import its downstream disciplinary consumers. These are alternative packet decisions, not changed source imports. Generic coordinate, temporal, unit, model and execution infrastructure stays outside.

## Questions before vocabulary

### chemistry-q01: Does methane mean one molecule or a collection of the same kind?

Molecular entity vs species ensemble vs classifier.
- Source/provenance: IUPAC-ENTITY; original order 1.
- Draft observable: `chemistry:MolecularEntity`
- Expected expression-result category: subject. Positive: specified methane molecule. Negative: all methane as a chemical species.
- Dependencies: Molecular entity vs species ensemble vs classifier. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q02: Has a chemical change occurred or have materials only mixed?

Species interconversion vs mixing.
- Source/provenance: IUPAC-REACTION; original order 2.
- Draft observable: `chemistry:ChemicalReaction`
- Expected expression-result category: process. Positive: specified reactants interconvert; salt dissolves into water. Negative: physical transfer with unchanged species; sand simply suspended.
- Dependencies: Species interconversion vs mixing. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### chemistry-q03: When salt disappears into water, what material remains?

Dissolution and solution rather than disappearance of matter.
- Source/provenance: IUPAC-DISSOLUTION; original order 3.
- Draft observable: `chemistry:SolutionPortion`
- Expected expression-result category: subject. Positive: salt dissolves into water; specified dissolved-salt solution portion. Negative: sand simply suspended; suspended grit.
- Dependencies: Dissolution and solution rather than disappearance of matter. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q04: Are oil and water one phase after stirring?

Uniformity criterion vs visual emulsion.
- Source/provenance: IUPAC-PHASE; original order 4.
- Draft observable: `chemistry:PhasePortion`
- Expected expression-result category: subject. Positive: one specified liquid phase portion. Negative: stirred oil-water emulsion treated as uniform.
- Dependencies: Uniformity criterion vs visual emulsion. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q05: Does a new solid in water mean it rained?

Chemical precipitation distinct from meteorological precipitation.
- Source/provenance: IUPAC-PRECIP; original order 5.
- Draft observable: `chemistry:ChemicalPrecipitation`
- Expected expression-result category: process. Positive: solid separates from supersaturated solution; specified separated crystalline deposit. Negative: rainfall or electrostatic dust collection; rain cloud.
- Dependencies: Chemical precipitation distinct from meteorological precipitation. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q06: Can oxidation occur without adding oxygen?

Electron loss/oxidation-state reading, not oxygen-only definition.
- Source/provenance: IUPAC-OX; original order 6.
- Draft observable: `chemistry:Oxidation`
- Expected expression-result category: process. Positive: electron-removal transformation. Negative: oxygen gas simply moved past a sample.
- Dependencies: Electron loss/oxidation-state reading, not oxygen-only definition. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### chemistry-q07: Which molecule is attached to the surface rather than dissolved in the bulk?

Surface association vs solution composition.
- Source/provenance: IUPAC-ADSORB; original order 7.
- Draft observable: `chemistry:SurfaceBoundTo linking chemistry:MolecularEntity to chemistry:AdsorbentBody`
- Expected expression-result category: relationship. Positive: adsorbed fragment on grain; identified catalytic surface-bearing grain; specified methane molecule. Negative: molecule dissolved far from surface; dissolved solute with no specified surface; all methane as a chemical species.
- Dependencies: Surface association vs solution composition. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q08: How much of each species is present in this sample?

Species-specific amount/concentration requires denominator and phase.
- Source/provenance: BIPM; original order 8.
- Explicit gap: gap: species amount/concentration and denominator binding.
- Expected expression-result category: unresolved. Positive: one specified liquid phase portion; specified methane molecule. Negative: stirred oil-water emulsion treated as uniform; all methane as a chemical species.
- Dependencies: Species-specific amount/concentration requires denominator and phase. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: species amount/concentration and denominator binding
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q09: Can equal masses of two substances contain different numbers of entities?

Mass vs amount distinction.
- Source/provenance: BIPM; original order 9.
- Explicit gap: gap: amount root definition must distinguish entity count from mass.
- Expected expression-result category: unresolved. Positive: specified methane molecule. Negative: all methane as a chemical species.
- Dependencies: Mass vs amount distinction. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: amount root definition must distinguish entity count from mass
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q10: Is a material uniform for one constituent but patchy for another?

Analyte-specific homogeneity.
- Source/provenance: IUPAC-HOM; original order 10.
- Explicit gap: gap: named-analyte distribution and homogeneity summary.
- Expected expression-result category: unresolved. Positive: one specified liquid phase portion. Negative: stirred oil-water emulsion treated as uniform.
- Dependencies: Analyte-specific homogeneity. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: named-analyte distribution and homogeneity summary
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q11: What starts and finishes a single reaction episode?

Operational bounded event around dependent reaction process.
- Source/provenance: IUPAC-REACTION; original order 11.
- Draft observable: `chemistry:ReactionEpisode`
- Expected expression-result category: event. Positive: one chemically monitored reaction episode. Negative: reagent list without occurrence.
- Dependencies: Operational bounded event around dependent reaction process. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### chemistry-q12: Are the products different species or only a different physical state?

Interconversion vs phase change may overlap; identify actual entities.
- Source/provenance: IUPAC-REACTION; original order 12.
- Explicit gap: gap: species identity authority and phase-state distinction.
- Expected expression-result category: unresolved. Positive: specified reactants interconvert; one specified liquid phase portion. Negative: physical transfer with unchanged species; stirred oil-water emulsion treated as uniform.
- Dependencies: Interconversion vs phase change may overlap; identify actual entities. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: species identity authority and phase-state distinction
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q13: Does adsorption always leave a molecule intact?

Dissociative adsorption counterexample.
- Source/provenance: IUPAC-ADSORB; original order 13.
- Draft observable: `chemistry:DissociativeAdsorption`
- Expected expression-result category: process. Positive: hydrogen dissociates and binds on catalytic surface; adsorbed fragment on grain. Negative: intact gas in container bulk; molecule dissolved far from surface.
- Dependencies: Dissociative adsorption counterexample. Imported ancestry and all proposed names must resolve; no model or data availability assumed.
- Checks: grammar **untested**, semantic **provisional**, adaptation/reasoner/model not run.

### chemistry-q14: Does unknown chemical composition mean a new kind of substance?

Unknown evidence is not chemical identity.
- Source/provenance: LOCAL; original order 14.
- Explicit gap: gap: evidence-state metadata, not new chemical predicate.
- Expected expression-result category: unresolved. Positive: one specified liquid phase portion. Negative: stirred oil-water emulsion treated as uniform.
- Dependencies: Unknown evidence is not chemical identity. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: evidence-state metadata, not new chemical predicate
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

### chemistry-q15: Can a chemical classification code tell us how fast this reaction proceeds?

Identity authority vs kinetic quality/model.
- Source/provenance: IUPAC-REACTION; original order 15.
- Explicit gap: gap: kinetic quality and model; authority does not supply rate.
- Expected expression-result category: unresolved. Positive: specified reactants interconvert. Negative: physical transfer with unchanged species.
- Dependencies: Identity authority vs kinetic quality/model. Imported ancestry and all proposed names must resolve; no model or data availability assumed. gap: kinetic quality and model; authority does not supply rate
- Checks: grammar **untested**, semantic **blocked**, adaptation/reasoner/model not run.

## Candidate corpus and scoped bindings

### MolecularEntity — subject

An individually distinguishable chemical entity with specified constitutional/isotopic state.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: imod:Mass; electric charge missing. Parameters: none proposed.
- Bindings: {}
- Positive: specified methane molecule. Negative: all methane as a chemical species.
- Evidence: IUPAC-ENTITY; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### PhasePortion — subject

Bounded portion of material uniform in composition and physical state at a declared observational scale.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: imod:Temperature; imod:Volume; composition missing. Parameters: none proposed.
- Bindings: {}
- Positive: one specified liquid phase portion. Negative: stirred oil-water emulsion treated as uniform.
- Evidence: IUPAC-PHASE; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### SolutionPortion — subject

Bounded homogeneous phase produced by dissolution, with identified constituents.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: species amount missing; imod:Volume; imod:Temperature. Parameters: none proposed.
- Bindings: {}
- Positive: specified dissolved-salt solution portion. Negative: suspended grit.
- Evidence: IUPAC-DISSOLUTION; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### PrecipitateBody — subject

Solid material individuated after chemical precipitation from solution.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: imod:Mass; composition missing. Parameters: none proposed.
- Bindings: {}
- Positive: specified separated crystalline deposit. Negative: rain cloud.
- Evidence: IUPAC-PRECIP; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### AdsorbentBody — subject

Bounded material body bearing the surface on which an adsorption interaction is examined.
- Imported parent/context: `physical:MaterialBody` (blocked). Proposed imported physical:MaterialBody is absent from current src; upstream issue, no local workaround.
- Qualities: surface area missing; surface coverage missing. Parameters: none proposed.
- Bindings: {}
- Positive: identified catalytic surface-bearing grain. Negative: dissolved solute with no specified surface.
- Evidence: IUPAC-ADSORB; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **blocked**; grammar untested.

### ChemicalReaction — process

Interconversion of chemical species, keeping ensemble and single-entity readings distinct.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: species amount missing; imod:Temperature; reaction rate missing.
- Bindings: {"affects": "participant species amounts/identities under specified reaction", "creates": "product molecular entities only with explicit stoichiometric/species scope", "confers": []}
- Positive: specified reactants interconvert. Negative: physical transfer with unchanged species.
- Evidence: IUPAC-REACTION; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### Dissolution — process

Combination of phases producing one homogeneous solution phase.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: composition missing; imod:Temperature; interfacial area missing.
- Bindings: {"affects": "phase amounts and solution composition", "creates": "solution portion only with specified individuation", "confers": []}
- Positive: salt dissolves into water. Negative: sand simply suspended.
- Evidence: IUPAC-DISSOLUTION; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### ChemicalPrecipitation — process

Separation of solid material from a solution under the chemical sense of precipitation.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: solubility missing; species concentration missing; imod:Temperature.
- Bindings: {"affects": "dissolved species amount", "creates": "chemistry:PrecipitateBody when a separated body is individuated", "confers": []}
- Positive: solid separates from supersaturated solution. Negative: rainfall or electrostatic dust collection.
- Evidence: IUPAC-PRECIP; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### Oxidation — process

Chemical transformation interpreted as net electron loss or increase in oxidation number.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: oxidation number missing; electron amount missing.
- Bindings: {"affects": "specified entity oxidation state; oxygen addition not mandatory", "creates": [], "confers": []}
- Positive: electron-removal transformation. Negative: oxygen gas simply moved past a sample.
- Evidence: IUPAC-OX; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### DissociativeAdsorption — process

Adsorption accompanied by fragmentation with resulting fragments surface-bound.
- Imported parent/context: `imod:Process` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: surface coverage missing; imod:Temperature; species amount missing.
- Bindings: {"affects": "molecular entity constitution and surface occupancy", "creates": "surface-bound fragments in specified interaction", "confers": []}
- Positive: hydrogen dissociates and binds on catalytic surface. Negative: intact gas in container bulk.
- Evidence: IUPAC-ADSORB; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### SurfaceBoundTo — relationship

A specified molecular entity is bound to a specified adsorbent surface-bearing body.
- Imported parent/context: `imod:Relationship` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: surface coverage missing.
- Bindings: {"source": "chemistry:MolecularEntity", "target": "chemistry:AdsorbentBody", "rationale": "Entity-to-body endpoint relation; mechanism and bond type separately scoped."}
- Positive: adsorbed fragment on grain. Negative: molecule dissolved far from surface.
- Evidence: IUPAC-ADSORB; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### ConstituentOfPhase — relationship

An identified molecular entity participates as a constituent in a specified phase portion.
- Imported parent/context: `imod:Relationship` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: species amount missing.
- Bindings: {"source": "chemistry:MolecularEntity", "target": "chemistry:PhasePortion", "rationale": "Do not use chemical species classifier as if a subject token."}
- Positive: molecule in chosen phase portion. Negative: species code in authority catalogue.
- Evidence: IUPAC-ENTITY; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### ReactionEpisode — event

Bounded occurrence of a specified reaction with stated participants and segmentation rule.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: species amount missing; reaction extent missing.
- Bindings: {"affects": "participant species identity/amount", "creates": "products only if specified", "confers": []}
- Positive: one chemically monitored reaction episode. Negative: reagent list without occurrence.
- Evidence: IUPAC-REACTION; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### PrecipitationEpisode — event

Bounded chemical solid-separation occurrence in an identified solution.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: species concentration missing; solubility missing.
- Bindings: {"affects": "solution composition", "creates": "chemistry:PrecipitateBody", "confers": []}
- Positive: one observed solid-separation episode. Negative: meteorological shower.
- Evidence: IUPAC-PRECIP; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

### DissolutionEpisode — event

Bounded occurrence of dissolution with initial separate phases and declared endpoint.
- Imported parent/context: `imod:Event` (verified_reference). Reference exists in imported root. For root generalized aliases this records upper context only, NOT an instruction to emit redundant is; declaration keyword supplies implicit ODO-IM ancestry. Scientific specialization still provisional.
- Qualities: not a substantial. Parameters: species amount missing; imod:Volume.
- Bindings: {"affects": "phase amounts", "creates": "solution portion if newly individuated", "confers": []}
- Positive: one pellet dissolving in specified solvent. Negative: solid hidden by turbid water.
- Evidence: IUPAC-DISSOLUTION; Source supports stated phenomenon/distinction; k.LAB category, naming, boundaries, ancestry and clause bindings are author proposals, not source claims. Status **provisional**; grammar untested.

## Quality summaries, not generic properties

- **HomogeneousForConstituent** summarizes distribution of a named constituent within a phase portion. Nominal, constituent-specific summary; declared scale/tolerance. Can overlap with heterogeneity for another constituent. No unmeasured-to-heterogeneous implication. blocked pending constituent distribution quality and convention.
- **SaturatedWithRespectToSpecies** summarizes species concentration relative to solubility under stated conditions. Comparison against condition-dependent solubility; below/at/above readings ordered only for same species, solvent, temperature and convention. No invented numeric cutoff or guaranteed precipitation. blocked: source supports solubility dependency but quantitative comparison convention not supplied.

Unknown, unmeasured and disputed are evidence states. They do not themselves license attributes, realms or identity classes. No thresholds, disjointness or exhaustiveness are invented.

## Coverage and iteration ledger

Counts: {'subject': 5, 'process': 5, 'relationship': 2, 'event': 3}. Fifteen questions; 6 explicitly retain gaps. No candidate was added solely to fill five/category. Incidence and unused candidates are in dossier.json; unused entries require usefulness review, not automatic deletion.

The first mapping exposed the upstream issues below. They remain unresolved; the vocabulary was not declared valid by circularly narrowing the questions. Models for explanations and runtime consequences for changes remain separate from vocabulary gaps.

- UPSTREAM-MATERIAL: physical:MaterialBody does not yet exist in executable source.
- CHEM-SPECIES: choose classifier/authority identity, ensemble observable and entity distinctions; no automatic equivalence to current chemistry:ChemicalSpecies.
- CHEM-AMOUNT: root Amount broad gloss does not settle amount-of-substance or entity-count semantics.
- CHEM-PHASE: phase portion boundedness and phase identity need human review; composition and physical-state qualities not yet articulated.
- CHEM-KINETIC: reaction rate and extent, species concentration denominator and surface coverage qualities absent; no broad generic quantity workaround.
- CHEM-ROLE: adsorbent/reactant/product are contingent participation meanings; no confers assertion until applicable role and occurrence conditions reviewed.

## Negative cases and review gate

type of chemistry:MolecularEntity is a semantic negative when MolecularEntity is a subject rather than an identity. chemistry:PrecipitationEpisode is not interchangeable with earth:Precipitation.

This is a semantic negative expectation, not a claim that the current parser rejects it. An actual syntax negative control must be run by the parent against the current grammar. Null expressions are gaps, not successful tests.

Obtain chemistry review of phase individuation, molecular entity/species distinction and authority use. Resolve whether solution and adsorbent are stable subjects or compositions/roles. A fifth relationship or event was not fabricated: evidence presently supports two/three clear patterns, not five independent dimensions.

Human source review, ontology category/ancestry review and exact artifact approval are separate gates. Ready-for-review means these exact dossier files, QUESTIONS_FIRST provenance hash and imported revision are available, not ready-to-apply. Blocking gaps must be closed or candidates explicitly excluded. Extension ideas for workflow stages are source-review outcomes, question-semantic test coverage, ambiguity decisions and approved revision/artifact hashes; the existing proposal schema is unchanged.

At an occurrent-driven transition resolve change in relevant qualities separately. No reading means unknown, not zero change. Cessation requires an occurrence. No process, role or configuration consequences are executed here.
