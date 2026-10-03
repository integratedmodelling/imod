# Genetics bootstrap dossier

Physical genomic bearers, inheritance and molecular occurrences. Physical segment, information identity and function are distinct readings. Clinical classification and sequence databases are outside this gateway.

Draft research inventory: no expert discussion or approval occurred. No executable ontology added. All expressions are initially untested. Root references inspected; proposed life parents are missing upstream and never asserted valid.

## Source-first questions

QUESTIONS_FIRST.json preserves original source-led order before candidate rows. This is not an independent holdout; the author knows the broader topic. A component observable is not a full causal answer.

### genetics-q01: What DNA sequence is present in this sampled molecule?

Sources: DNA; original order 1; incidence: genetics-c21.
Draft expression: `genetics:DNASequence of genetics:DNAMolecule`
Expected type: quality. Positive: Sequence of an identified molecular bearer. Negative: Database identifier itself.
Sequence of an identified molecular bearer; excludes Database identifier itself. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q02: Are two versions found at the same genomic location?

Sources: ALLELE; original order 2; incidence: upstream gap.
Expression: **explicit gap** — identity/reference gap.
Expected type: identity/reference gap. Positive: Alleles aligned to one declared locus. Negative: Variants at unrelated loci.
Alleles aligned to one declared locus; excludes Variants at unrelated loci. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate. Explicit gap: identity/reference gap; unavailable evidence does not imply false/zero/unchanged. UPSTREAM GAP: AllelicIdentity identity/reference distinction not established; no local workaround.

### genetics-q03: How many chromosomes are present in this cell?

Sources: CHROMOSOME; original order 3; incidence: genetics-c03.
Draft expression: `count of genetics:Chromosome contained in life:Cell`
Expected type: numerosity. Positive: Chromosome count in specified cell. Negative: Human count assumed for all species.
Chromosome count in specified cell; excludes Human count assumed for all species. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q04: Does this gene produce a functional RNA rather than a protein?

Sources: GENE; original order 4; incidence: genetics-c07.
Draft expression: `genetics:Transcription`
Expected type: process. Positive: Noncoding functional RNA transcript. Negative: All genes forced protein coding.
Noncoding functional RNA transcript; excludes All genes forced protein coding. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q05: Which cells are expressing a particular gene after heat exposure?

Sources: EXPRESSION; original order 5; incidence: genetics-c22.
Draft expression: `genetics:TranscriptAbundance of life:Cell`
Expected type: quality. Positive: Gene-specific transcripts and cell context. Negative: Expression inferred solely from DNA presence.
Gene-specific transcripts and cell context; excludes Expression inferred solely from DNA presence. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q06: Did a DNA sequence change in this lineage?

Sources: MUTATION; original order 6; incidence: genetics-c16.
Draft expression: `genetics:Mutation`
Expected type: event. Positive: Bounded sequence alteration in lineage. Negative: Different samples with no lineage evidence.
Bounded sequence alteration in lineage; excludes Different samples with no lineage evidence. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q07: Can the detected variant be inherited by offspring?

Sources: MUTATION; original order 7; incidence: upstream gap.
Expression: **explicit gap** — germline/lineage gap.
Expected type: germline/lineage gap. Positive: Specified reproductive lineage with germline evidence. Negative: Somatic variant assumed inherited.
Specified reproductive lineage with germline evidence; excludes Somatic variant assumed inherited. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate. Explicit gap: germline/lineage gap; unavailable evidence does not imply false/zero/unchanged. UPSTREAM GAP: Inheritance identity/reference distinction not established; no local workaround.

### genetics-q08: Has a chromosome segment been copied again?

Sources: GLOSSARY; original order 8; incidence: genetics-c18.
Draft expression: `genetics:Duplication`
Expected type: event. Positive: Extra segment copy relative to baseline. Negative: Higher sequencing coverage alone.
Extra segment copy relative to baseline; excludes Higher sequencing coverage alone. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q09: Has a segment been lost from a chromosome?

Sources: GLOSSARY; original order 9; incidence: genetics-c17.
Draft expression: `genetics:Deletion`
Expected type: event. Positive: Documented segment loss. Negative: Unsequenced interval.
Documented segment loss; excludes Unsequenced interval. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q10: Which DNA molecule contains this gene segment?

Sources: GENE; original order 10; incidence: genetics-c11.
Draft expression: `genetics:GenePart linking genetics:GeneSegment to genetics:DNAMolecule`
Expected type: relationship. Positive: Physical segment on identified molecule. Negative: Information record contained in database.
Physical segment on identified molecule; excludes Information record contained in database. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q11: Are chromosomes being segregated into gametes?

Sources: MEIOSIS; original order 11; incidence: genetics-c09.
Draft expression: `genetics:MeioticSegregation`
Expected type: process. Positive: Reductional division in appropriate organism. Negative: Ordinary tissue growth.
Reductional division in appropriate organism; excludes Ordinary tissue growth. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q12: Does a sequence similarity establish shared descent?

Sources: GLOSSARY; original order 12; incidence: upstream gap.
Expression: **explicit gap** — historical hypothesis gap.
Expected type: historical hypothesis gap. Positive: Independent ancestry evidence. Negative: Similarity automatically asserted homology.
Independent ancestry evidence; excludes Similarity automatically asserted homology. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate. Explicit gap: historical hypothesis gap; unavailable evidence does not imply false/zero/unchanged. UPSTREAM GAP: Homology identity/reference distinction not established; no local workaround.

### genetics-q13: Did fertilization combine genetic contributions from the observed gametes?

Sources: MEIOSIS; original order 13; incidence: genetics-c19.
Draft expression: `genetics:Fertilization`
Expected type: event. Positive: Fusion with lineage evidence. Negative: Two gametes merely adjacent.
Fusion with lineage evidence; excludes Two gametes merely adjacent. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate.

### genetics-q14: Would a gene expression difference alone explain survival after wildfire?

Sources: EXPRESSION; original order 14; incidence: genetics-c08.
Expression: **explicit gap** — causal model gap.
Expected type: causal model gap. Positive: Expression comparison plus mechanism evidence. Negative: Association treated as sufficient explanation.
Expression comparison plus mechanism evidence; excludes Association treated as sufficient explanation. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate. Explicit gap: causal model gap; unavailable evidence does not imply false/zero/unchanged.

### genetics-q15: Is missing sequence information evidence that the gene is absent?

Sources: GENE; original order 15; incidence: genetics-c02.
Expression: **explicit gap** — negative evidence probe.
Expected type: negative evidence probe. Positive: Adequate coverage and detection model needed. Negative: Missing record equated with gene deletion.
Adequate coverage and detection model needed; excludes Missing record equated with gene deletion. Expression is a component observable where full question needs multiple resolutions.
Semantic status: blocked; grammar untested. Dependencies: New names are dossier proposals, not installed declarations. Imported participant and quality meanings; human category review; observations and models separate. Explicit gap: negative evidence probe; unavailable evidence does not imply false/zero/unchanged.

## Candidate meanings, ancestry and bindings

Alternatives for review, not declarations. Empty confers is intentional: generic roles are not manufactured. Every root alias below is foundational type context only, not a selected explicit specialization axiom. No redundant is clauses may be generated. All articulation records are blocked under this task's stronger imported-derivation requirement; scientific plausibility is separately indexed.

### genetics-c01 DNAMolecule — subject

Physically individuated DNA molecule; its record is a different entity.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: DNASequence, molecular length. Occurrent parameters: not applicable.
Bindings: {}
Source: DNA; positive: Physical DNA molecule; negative: Sequence file. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c02 GeneSegment — subject

Physical genomic segment under an explicitly selected functional gene delimitation.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: DNASequence, segment length. Occurrent parameters: not applicable.
Bindings: {}
Source: GENE; positive: Segment encoding functional RNA; negative: Only protein-coding segments admitted. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c03 Chromosome — subject

Physically delimited chromosome in an organism/cell context.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: DNASequence, copy number. Occurrent parameters: not applicable.
Bindings: {}
Source: CHROMOSOME; positive: Identified chromosome; negative: 46 assumed universal. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c04 RNAMolecule — subject

Physical RNA product distinguishable from sequence or functional identity.
Parent: `imod:Subject` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: Sequence, pool abundance. Occurrent parameters: not applicable.
Bindings: {}
Source: EXPRESSION; positive: Transcript molecule; negative: RNA identifier. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c05 Gamete — subject

Reproductive cell participating in a specified sexual life cycle.
Parent: `life:Cell` (blocked); UPSTREAM GAP: missing imported life parent or unresolved category.
Bearer qualities: Chromosome count, viability. Occurrent parameters: not applicable.
Bindings: {}
Source: MEIOSIS; positive: Egg in appropriate life cycle; negative: All reproduction forced into human pattern. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c06 DNAReplication — process

Production of DNA molecules using DNA templates.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Template availability, substrate availability.
Bindings: {"creates": ["genetics:DNAMolecule"], "rationale": "No guarantee of error-free copying."}
Source: GLOSSARY; positive: Template copying; negative: File duplication. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c07 Transcription — process

Production of RNA using DNA template in a scoped cellular setting.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Template activity, transcript abundance.
Bindings: {"creates": ["genetics:RNAMolecule"], "rationale": "Includes noncoding transcripts; not universal protein output."}
Source: EXPRESSION; positive: RNA transcription; negative: DNA replication. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c08 GeneExpression — process

Use of gene-associated information in producing functional biological output.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: TranscriptAbundance, product activity.
Bindings: {"affects": ["genetics:TranscriptAbundance"], "rationale": "Transcript assay is one observation route, not equivalence with function."}
Source: EXPRESSION; positive: Observed output; negative: Gene presence alone. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c09 MeioticSegregation — process

Chromosome allocation during meiotic reproductive sequence.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Chromosome copy number, segregation state.
Bindings: {"affects": ["genetics:Chromosome"], "rationale": "Life-cycle scoped; gamete numerical output not universalized."}
Source: MEIOSIS; positive: Reductional segregation; negative: Somatic copying. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c10 DNARepair — process

Biological processing or restoration of damaged DNA in a specified pathway.
Parent: `imod:Process` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Damage extent, template integrity.
Bindings: {"affects": ["genetics:DNASequence"], "rationale": "Potential changes; no guarantee of exact original restoration."}
Source: MUTATION; positive: Repair processing; negative: Computational missing-sequence fill. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c11 GenePart — relationship

Physical gene-segment membership in a DNA molecule.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "genetics:GeneSegment", "target": "genetics:DNAMolecule", "rationale": "Physical parthood, not database containment."}
Source: GENE; positive: Segment on molecule; negative: Record in database. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c12 TemplateFor — relationship

DNA molecule serving as template for a particular RNA product.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "genetics:DNAMolecule", "target": "genetics:RNAMolecule", "rationale": "Transcriptional provenance required; similarity insufficient."}
Source: EXPRESSION; positive: Supported template product; negative: Matching strings. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c13 ChromosomeInCell — relationship

Physical chromosome membership in a cell.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "genetics:Chromosome", "target": "life:Cell", "rationale": "No universal nuclear containment assumption."}
Source: CHROMOSOME; positive: Bacterial chromosome; negative: Sample accession. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c14 InheritedFrom — relationship

Descendant-to-progenitor genetic contribution relation.
Parent: `imod:Relationship` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "life:Organism", "target": "life:Organism", "rationale": "Transmission evidence, germline scope explicit; not social descent."}
Source: MUTATION; positive: Supported transmission; negative: Somatic variant assumed inherited. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c15 HomologousSegment — relationship

Sequence-segment historical common-descent relation.
Parent: `None` (blocked); UPSTREAM GAP: missing imported life parent or unresolved category.
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"source": "genetics:GeneSegment", "target": "genetics:GeneSegment", "rationale": "Historical hypothesis; source detail inadequate, not similarity-as-descent."}
Source: GLOSSARY; positive: Supported ancestry; negative: Sequence similarity alone. Status: blocked.
Insufficient direct source support for this precise proposed boundary or binding in inspected source; research lead only, blocked pending targeted primary evidence.
Scientifically symmetric reading; bond versus directed relationship unresolved. Endpoint labels do not establish direction.

### genetics-c16 Mutation — event

Bounded DNA sequence alteration in a specified molecular lineage.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: DNASequence.
Bindings: {"affects": ["genetics:DNASequence"], "rationale": "Occurrence distinguished from variant identity and health effect."}
Source: MUTATION; positive: Lineage sequence alteration; negative: Different samples alone. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c17 Deletion — event

Loss of DNA segment in documented lineage relative to baseline.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: DNASequence, segment copy number.
Bindings: {"affects": ["genetics:DNASequence"], "rationale": "Occurrence distinguished from missing assay coverage."}
Source: GLOSSARY; positive: Supported segment loss; negative: Unsequenced interval. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c18 Duplication — event

Additional segment copy arising in documented lineage.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Copy number, DNASequence.
Bindings: {"affects": ["genetics:DNASequence"], "rationale": "Copy change does not entail expression change."}
Source: GLOSSARY; positive: Supported extra segment; negative: PCR artifact. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c19 Fertilization — event

Bounded union of gametic contributions in a declared reproductive system.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Gamete viability, chromosome complement.
Bindings: {"affects": ["genetics:Gamete"], "creates": ["life:Cell"], "rationale": "Zygotic-cell formation; organism identity boundary unresolved."}
Source: MEIOSIS; positive: Gametic fusion; negative: Gamete contact. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c20 ChromosomeNondisjunction — event

Failure of expected chromosome separation in a bounded division.
Parent: `imod:Event` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: Chromosome allocation.
Bindings: {"affects": ["genetics:Chromosome"], "rationale": "Not automatically a syndrome; detailed source review pending."}
Source: GLOSSARY; positive: Documented failed segregation; negative: Any chromosome-number difference. Status: blocked.
Insufficient direct source support for this precise proposed boundary or binding in inspected source; research lead only, blocked pending targeted primary evidence.


### genetics-c21 DNASequence — quality

Ordered nucleotide composition of specified physical DNA bearer.
Parent: `imod:Quality` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"target": "genetics:DNAMolecule,genetics:GeneSegment", "rationale": "Structured value representation belongs to core/model discussion."}
Source: DNA; positive: Bearer-linked sequence; negative: Unattached string. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


### genetics-c22 TranscriptAbundance — quality

Transcript number for a specified gene and cellular bearer.
Parent: `imod:Numerosity` (blocked); src/imod.kwv category exists; scientific specialization unapproved; generic root alias must not merely restate keyword inheritance. User-required meaningful imported derivation remains an upstream design issue..
Bearer qualities: not applicable. Occurrent parameters: not applicable.
Bindings: {"target": "life:Cell", "rationale": "Normalization and gene identity required; not identical to protein function."}
Source: EXPRESSION; positive: Gene-specific transcript count; negative: Generic RNA quantity. Status: blocked.
Source supports broad disciplinary meaning or research lead; our individuation, category and binding choices are explicit synthesis requiring claim-level expert review.


## Quality summaries and non-predicates

- **Allelic composition at specified locus → Homozygous/heterozygous**: Nominal sequence-comparison rule conditional on ploidy, locus and reliable calls. Missing calls are not a third biological genotype. provisional; no declaration.
- **TranscriptAbundance → High/low expression**: Ordered relative to cell type and reference; no universal cutpoint or beneficial/pathogenic inference. provisional; no declaration.

## Coverage and review gates

Category counts: {"subject": 5, "process": 5, "relationship": 5, "event": 5, "quality": 2}. Five/category shortfalls: {}. No weak relations or events padded to meet quota.

Important weaker areas are organ individuation, cell/organism cessation evidence, demographic class boundaries, homologous-segment historical claims and exact gene delimitation. Shortfalls, unused candidates and question incidence are indexed in dossier.json. Source title relevance is not sufficient scientific evidence; explicitly blocked items need stronger sources or removal.

All change and cessation require occurrents. At time transitions change in each quality is resolved separately; unavailable evidence leaves open-world unknown. No retention semantics, zero-change inference or consequence engine is supplied. Creates/affects here are proposed scoped semantic potentials, never guaranteed outcomes. Implication/detection remain syntax-only.

- genetics-a01: Physical genomic bearers, inheritance and molecular occurrences. Physical segment, information identity and function are distinct readings. Clinical classification and sequence databases are outside this gateway. Decision: Human category/namespace consolidation required; legacy compatibility is not sufficient reason to retain meanings. Blocking: True.
- genetics-a02: Many relevant parameter qualities and participant kinds lack current declarations. Decision: Open upstream issues. Parameters here describe relevant qualities, not ontology model inputs or equations. Blocking: True.
- genetics-a03: Bounded event versus ongoing process reading and object continuity. Decision: Review delimitation and identity; separate change resolution requires occurrent, never no-change inference. Blocking: True.
- genetics-a04: NHGRI explicitly notes debated gene definition and functional noncoding RNA genes. Decision: Keep physical segment separate from information identity and function; no one-gene-one-protein axiom. Blocking: True.
- genetics-a05: Generic root inheritance is not an additional scientific specialization. Decision: Keep foundational type reference separate from selected parent; seek meaningful imported context or explicit user-reviewed relaxation upstream. No redundant is declaration. Blocking: True.

Explored candidates: 22; blocked articulation candidates: 22; semantically ready: 0. Scientific source confidence, category fit and grammatical acceptance are independent coordinates. Counts do not represent completed coverage.

Ready-for-review gates: fix imported revisions; obtain source/domain and ontology review; resolve missing parents/qualities upstream; record parser outcomes per expression and separate adaptation/loaded-semantic/model tests; bind human decisions to exact artifact hashes and proposal revision. No self-review approval. Existing context-pack 1.3 remains the proposal contract. Local dossier fields are instrumentation suggestions only: source-review ledger, question tests, ambiguity decisions and exact-revision approval.

## Explicit invalid probes

- genetics-negative01: `genetics:DNASequence of genetics:DNAMolecule`. Treat absence of model/evidence as false, zero or unchanged. Expected: Reject semantic interpretation; open-world unknown. Grammar may accept unchanged expression. Execution: not run.
- genetics-negative02: `genetics:GenePart linking imod:Mass to imod:Mass`.  Expected: Reject quality endpoints for substantial relationship. Syntax may still pass. Execution: not run.

## Sources

- **ALLELE** [NHGRI: Allele](https://www.genome.gov/genetics-glossary/Allele). Definition and narration. Scope: Agency explanation; exact ontological specialization is proposed here, not endorsed. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **CHROMOSOME** [NHGRI: Chromosome](https://www.genome.gov/genetics-glossary/Chromosome). Definition and narration. Scope: Agency explanation; exact ontological specialization is proposed here, not endorsed. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **DNA** [NHGRI: Deoxyribonucleic-Acid-DNA](https://www.genome.gov/genetics-glossary/Deoxyribonucleic-Acid-DNA). Definition and narration. Scope: Agency explanation; exact ontological specialization is proposed here, not endorsed. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **EXPRESSION** [NHGRI: Gene-Expression](https://www.genome.gov/genetics-glossary/Gene-Expression). Definition and narration. Scope: Agency explanation; exact ontological specialization is proposed here, not endorsed. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **GENE** [NHGRI: Gene](https://www.genome.gov/genetics-glossary/Gene). Definition and narration. Scope: Agency explanation; exact ontological specialization is proposed here, not endorsed. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **GLOSSARY** [NHGRI: Talking Glossary](https://www.genome.gov/genetics-glossary). Deletion; Duplication; Genome; gene-environment interaction. Scope: Introductory scope; human diploidy not universal. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **MEIOSIS** [NHGRI: Meiosis](https://www.genome.gov/genetics-glossary/Meiosis). Definition and narration. Scope: Agency explanation; exact ontological specialization is proposed here, not endorsed. retrieved 2026-10-03; author synthesis, no expert endorsement.
- **MUTATION** [NHGRI: Mutation](https://www.genome.gov/genetics-glossary/Mutation). Definition and narration. Scope: Agency explanation; exact ontological specialization is proposed here, not endorsed. retrieved 2026-10-03; author synthesis, no expert endorsement.
