# Concrete context-pack review example

Input: target Tier 1 hydrology; current imod and earth context; the legacy Watershed declaration; IPCC catchment entry; context pack 1.3. Output: `review/surface-catchment-r1.yaml`, validated against the unchanged copied schema. It has stable asset ID `concept-surface-catchment`, proposed mutable name `hydrology:SurfaceCatchment`, structural/independent/arity-0 coordinates, an explicit earth:Region parent, boundaries, evidence, alternatives/open questions, and no causal clauses.

The jargon alias is Tier 2 and intentionally not smuggled into this Tier-1 proposal. Its candidate syntax is separately reviewable under `candidate/`. A complete next iteration should produce a separate Tier-2 proposal with the accepted Tier-1 context and an equals-versus-is review. This avoids claiming mixed-tier schema compliance means requested-tier validity.

`surface-catchment-r2-review-example.yaml` demonstrates an **illustrative**, not real, reviewer request: clarify that the region's boundary is delineated for a specified drainage interpretation and outlet, rather than asserting observed water at every point. The asset ID is stable, feedback points to r1, and an unapplied modify action is recorded. It includes version/revision preconditions and an empty approval decision. There is no invented expert endorsement and no instruction to auto-apply the action.

## Assisted workflow, using current envelopes

The source-defined workflow is `ontology-expert-review`. A future authorized editor initializes through `POST /api/v1/flows/initialize?workflowId=ontology-expert-review`, uploads editing-stage attachments at `/api/v1/flows/{flowId}/states/{stateId}/attachments`, then uses `/api/v1/flows/{flowId}/transitions` for allowed transitions. These are instructions for future instrumentation, not calls performed here.

Attach the proposal using `application/vnd.klab.proposal+yaml`. The editing stage currently also labels required bootstrap-comments as proposal+yaml, while peer-review comments use comments+json. Do not pretend a generic comments JSON satisfies the editing declaration. Resolve that mismatch or use an explicitly valid source-defined envelope before a live demonstration. On submission, reattach the proposal in peer-review; do not assume automatic copying. An editor needs permitted workflow roles and applicable ownership/assignment, not merely a reviewer label.

Record every reviewer change against proposal revision and asset ID. Preserve the old proposal and source locators. The parent workflow investigation reports that request-changes returns to peer-review with no resubmit transition; model the next review iteration there rather than inventing a transition. Treat workflow attachments as durable but not immutable audit archives: open-stage deletion and whole-flow deletion remain possible.

Do not close accepted until final artifacts can be populated and validated. Current source checks source-stage requirements and closes the accepted stage before normal uploads can fill final-proposal/accepted-ontology slots. The honest demonstration therefore stops at assisted review with a separately validated local candidate and a prepared handoff. It does not claim automatic publication.

## Future Git handoff contract

An eventual processor must consume a schema-valid immutable proposal revision and bind approval to exact action IDs, base commit, record versions and artifact hashes. Revalidate after each change: identifiers/dependencies/tier, evidence, alias equality, grammar, adaptation, reference resolution, loaded-worldview semantic checks and representative models. If the base moves, regenerate and re-review the change rather than silently rebasing approval.

Generate a Git diff and draft PR containing old/new meanings, source provenance, rejected alternatives, affected models and test results. Reviewer approval must precede apply; PR approval and release remain separate governance. Current WorkflowManager's optional expectedRevision protects flow concurrency, not exact semantic-action approval. The default lifecycle callback is NO_OP. Neither workflow stage status nor parser success authorizes source mutation or publication.

Implementation findings above combine inspected workflow YAML and WorkflowManager with a parent-supplied workflow investigation. That investigation reports 3 existing serialization/schema tests and 10 YAML structural checks passing; these are **not tests run by this packet**, nor proof of a working end-to-end workflow. Its runtime lifecycle work was still in progress when this packet was prepared. No external workflow was created or changed here.
