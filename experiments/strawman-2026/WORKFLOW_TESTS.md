# Verified workflow behavior and workshop boundaries

This summary incorporates the completed `WORLDVIEW_DEMO_ASSESSMENT.md` from the parallel workflow task. The report, characterization test and runner were read here; their source paths and SHA-256 hashes are in `evidence/workflow-assessment-provenance.json`. It concerns klab-services `721f3736596acff39d92a84566dfd364070be662`. No production fixes were made. Raw task logs are not copied into this repository.

The normal offline Maven reactor ran outside the restrictive Java filesystem sandbox from an isolated `git archive HEAD` snapshot. The fixture invokes the real current WorkflowManager and bundled ontology-expert-review schema with an in-memory store and identity fixture. It does not exercise Nitrite, HTTP/security, an IDE session, ontology validation or a Git integration.

## Results inspected

Focused `WorkflowDemoAssessmentTest`: **5 tests, 0 failures, 0 errors, 0 skipped; BUILD SUCCESS**.

| Characterization | Runtime-observed result |
|---|---|
| acceptedTerminalDropsSuppliedArtifactsAndCannotReceiveRequiredUploads | Acceptance admits deliberately schema-invalid proposal bytes, clears supplied target attachment descriptors, closes without terminal attachments and rejects a later final-proposal upload. |
| freshFlowRevisionAllowsAcceptanceWithDeletedCandidateAndStaleApprovalMetadata | An old expectedRevision blocks acceptance; refreshing only that revision permits acceptance with ordinary approval metadata still referring to deleted r1 instead of current r2. This is not a formal typed approval API. |
| openAttachmentCanBeDeletedButClosedStageAttachmentCannot | Open-stage deletion removes the blob; stage closure prevents its later deletion through that attachment path. Whole-flow deletion is a separate retention risk. |
| requestChangesCreatesFreshPeerReviewStageFromPeerAndCommunityReview | Both sources produce a fresh empty peer-review stage. It requires a new proposal upload; there is no resubmit transition. |
| rejectionClosesPeerReviewWithoutTerminalArtifacts | Admin rejection closes peer review. No direct reject-community-review transition exists. |

Existing `WorkflowManagerAuthorizationTest,WorkflowSchemaTest` baseline: **14 tests, 3 failures, 0 errors, 0 skipped**. All failures are preserved:

| Existing failing test | Exact mismatch | Interpretation from source inspection |
|---|---|---|
| workflowPermissionAllowListIsEnforced, line 100 | expected 1, actual 2 | Wildcard sees both bundled workflow definitions. |
| firstStageIsPersistedOnlyAfterAValidAtomicSubmission, line 288 | expected KlabIllegalStateException; none thrown | Generic asset-review's editing candidate is currently optional. |
| bundledSchemaIsValidAndClientExecutable, line 71 | expected required=true, actual false | Same generic asset-review optional-candidate rule. |

These are existing test/schema expectation mismatches. No assertions were weakened to obtain a green baseline. The other 11 tests passed, including callback/failure boundaries and selected access/serialization behavior. Earlier 13 serialization/schema-shape checks are narrower and superseded by the reactor evidence for lifecycle claims.

## Minimal honest runbook

1. Validate the complete proposal against context pack 1.3's schema, preserving stable IDs, revision chain, evidence and actual candidate validation results. This packet supplies schema-valid local examples; workflow blob admission alone does not do that validation.
2. Rehearse an isolated authenticated Resources/IDE session before demonstrating it publicly. Use an editor with permitted workflow and ownership/assignment, not only a nominal role. Initialize editing with bootstrap-proposal and bootstrap-comments, then submit. Editing's comments MIME is currently proposal+yaml; resolve the mismatch rather than silently sending JSON.
3. Explicitly upload the proposal into the fresh peer-review stage. Record the reviewed attachment ID/checksum and proposal revision. Request-changes creates another fresh peer-review stage, also from community-review; upload the new revision there.
4. Keep review open while attaching candidate files and actual validation evidence as supporting-material. Human review and source application are separate from workflow transition. Unsupported tests remain marked unperformed.
5. Illustrate acceptance only with an explicit statement that it is a lifecycle decision, not a semantic-validation/publication gate. Normal acceptance cannot currently enforce populated terminal artifacts or exact-candidate approval. Do not use reopen workarounds as proof that the gate works.
6. Prepare a local Git diff and PR handoff linking reviewed proposal/checksum, action IDs, candidate commit and test evidence. Future authorized instrumentation may create PRs; the present manager does not.

Before claiming an end-to-end community pipeline, implement atomic target-artifact validation, bind approval to exact revision/checksum/actions/tree, invalidate stale approvals, define evidence retention, and connect explicit apply/validation/PR handoff. None of those production fixes is part of this branch. Implication and detection remain syntax-only.

Reproduction source: task-5 `harness/run-reactor-assessment.ps1 -Mode Assessment` (five focused tests) or `-Mode Baseline` (three expected baseline failures). The underlying Maven commands were run; that wrapper itself was syntax-checked but not used for the recorded executions. See the provenance record for the external local paths.
