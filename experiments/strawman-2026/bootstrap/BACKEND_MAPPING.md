# Research dossier to proposal-review transport mapping

Read against task-7/backend/PROPOSAL_REVIEW_CONTRACT.md, DOSSIER_MAPPING.md and ProposalReview.java at backend commit e6ad32ca048c5e9468ab722909c44b541ee98b7a. That implementation is the transport authority; this packet never edits or replaces it. Use its shared ProposalCandidateBinding inspector for proposal/action/import-manifest binding, not a parallel client serialization.

There are three separate representations:

| Research record | Context-pack 1.3 proposal | Backend ProposalReview.BootstrapDossier |
|---|---|---|
| domain/scope/imports | proposal.scope, existing_ontologies and alignment context | No full equivalent; retain proposal as source of record and unresolvedSemantics references |
| sources plus scoped claims | sources plus evidence records; do not conflate a whole source with a claim | Evidence(id, source, locator, excerpt); excerpt is null when no actual quotation was retained, with scope/status preserved in research attachments |
| concept id/name/category/definition | stable asset_id, qualified_name, semantic_coordinates and boundaries | Concept.id/kind/expression/derivedType; these are reported claims, not validated derivations |
| parent plus alignment_role | implicit_type_inheritance for generic keyword context; explicit upper/domain alignment only for genuine specialization | ancestry list reports context; bindings/unresolvedSemantics must retain blocked/proposed status because ancestry alone has no status field |
| qualities/parameters/bindings | supported clauses and semantic coordinates with evidence; unsupported clauses remain open questions | qualityIds, affects/creates/confers/sourceType/targetType/bindings; string lists do not prove active grammar supports all combinations |
| source-first question/provenance | research support and open_questions; no invented required proposal field | Question text/intent/evidenceIds/conceptIds/observableExpressions/invalidProbes/gaps |
| quality_summaries | predicate assets only after semantic/evidence review | QualityAnalysis boundaryOrComparison/valueStructure/contextAndScope, evidenceIds; unknownRatherThanCategory must preserve evidence-state distinction |
| ambiguities/coverage | unresolved alternatives, open questions and review feedback | unresolvedSemantics/coverageShortfalls |
| grammar_status/validation | exact artifact-linked validation evidence, not approval | Server owns StageData.validation; clients cannot authoritatively set PASS |

The local dossier is NOT wire compatible. It permits richer research fields, source retrieval limitations and multiple unresolved alternatives. An adapter must explicitly preserve those; unsupported or lossily mapped fields cannot disappear. A generic imod:Subject/Process/Event parent is foundational type context, not an instruction to generate a redundant is clause. Missing meaningful specialization becomes an upstream issue where needed.

hydrology/backend-dossier.sample.json is an illustrative projection into BootstrapDossier field names with unmapped data recorded, not a Command and not submitted. It omits Candidate because no backend attachment IDs/checksums/context digest have been obtained. It supplies no server-owned validation or acceptance claim. Stable local concept IDs replace known quality/binding names; missing external quality names and one unmapped quality analysis remain explicit unresolvedSemantics. Source excerpts are null. Question intent is an explicit unreviewed author interpretation, not merely expected_type. The existing valid catchment proposal r1-r3 remains separate: it does not contain all new dossier concepts.

The actual backend DTO deserialized this sample and BootstrapDossierValidator returned no structural errors (29 concepts,15 questions), recorded in backend-projection-validation.txt and its hash/context file. The first restricted-environment attempt could not load external class files; its compiler failure is retained separately. The successful read-only retry changed no backend files. This test checks IDs/required fields, not scientific meaning or workflow acceptance. The production validator and four-artifact manifest remain incomplete, so production acceptance stays blocked.

Future integration must upload exact proposal/ontology bytes, obtain server attachment identity/checksum, bind candidate revision/supersedes/action IDs/contextDigest and expectedRevision, and let server-owned checks validate. At present many candidate expressions refer to undeclared meanings. Parsing is evidence for syntax only; reasoner/application/PR handoff stay NOT_RUN or BLOCKED. Human source review, scientific review and exact revision decisions remain required; no task here exercises that new transport.
