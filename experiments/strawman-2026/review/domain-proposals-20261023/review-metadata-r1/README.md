# Authored proposal review metadata — revision review-metadata-r1

23 October 2026. The user accepted the single `@review` convention: “I'm happy with the `@review` proposal - a single annotation carrying informative metadata is easier to connect to review instrumentation and proposals.” This records acceptance of metadata syntax for the separate proposal packet. It is **not community acceptance of the concepts**, integration into active/experimental repository sources, or adoption of a community decision procedure.

## Applied scope

**207 new proposed declarations in 26 review files:** foundations 44; Earth 45; living 69; societal 49. Every selected new declaration has exactly one directly authored `@review(...)`. Existing baseline declarations in replacement overlays, ontology headers, contextual source copies and the separate demonstration project were excluded. No declaration, identifier, docstring, clause, import or existing annotation was changed.

The only `.kwv` changes are insertion of review blocks. For every file, removing those exact blocks reproduces the archived previous file **byte-for-byte**, including all literate programming comments, whitespace and line endings. Existing narrative/comment status statements about a pending convention are retained as historical text; this revision supersedes them only for the metadata convention and current syntax receipt.

Records and evidence:

- [PLAN.json](PLAN.json): fixed allocation of files, counts, pre/post SHA256 and review-record locations.
- [VALIDATION.json](VALIDATION.json): current per-file hashes, preservation checks, exact validation scope and unchanged baseline.
- [parser-results.txt](parser-results.txt), [classpath hashes](parser-results.classpath.json): **26 files passed, zero syntax errors**.
- [CONTEXT.json](CONTEXT.json): exact 26-source baseline hashes, immutable ODO locator, convention source hash and authorization scope; PLAN binds the proposal import snapshot.
- `records/<packet>/<file>.json`: source-relative targets of the annotations, containing each stable ID, revision, current/previous source hash, qualified name, unchanged declaration text, original/current line and rationale/evidence pointers.
- `before/`: all 26 pre-metadata proposal files. `prior-evidence/`: copied pre-metadata packet reports/receipts/manifests and index; original receipts also remain at their original paths.
- Each packet's `REVIEW_METADATA_CURRENT.json` supplies its current hashes and links to the shared receipt. Earlier receipts are historical checks of earlier bytes, not silently rewritten.

The first metadata syntax pass is retained as `parser-before-priority-conservatism.txt` and its classpath manifest. The final receipt covers the more conservative priority population described below. Both passed; only the final receipt binds current bytes.

## Fields, IDs and conservative status

All annotations use the tested named-string fields and values:

```text
schema="klab.review/1"
proposal="wv-review-20261023-0001"  (the declaration's stable allocated ID)
revision="review-metadata-r1"
maturity="experimental"
controversy="unassessed"
technical_validation="not_recorded"
community_acceptance="not_recorded"
review_record="../../review-metadata-r1/records/<packet>/<file>.json"
```

The IDs `wv-review-20261023-0001` through `wv-review-20261023-0207` are fixed in the records and must be retained across later renaming; do not regenerate them from a mutable concept name or sort order. Each file-level record has separate declaration entries keyed by those IDs and this exact revision. Existing family identifiers and original rationale tables remain referenced as research provenance, not replaced with invented prior acceptance records.

`experimental` describes these separate, semantically unvalidated research drafts. `unassessed` means no new formal controversy assessment was performed; it neither conceals the linked existing conflicts nor declares them resolved. All community acceptance remains `not_recorded`. No authors, reviewers, votes, quorum, consensus threshold, editor powers or acceptance history were fabricated.

`technical_validation="not_recorded"` is deliberately conservative because its lifecycle vocabulary is not standardized. Exact current syntax checks are recorded separately in the linked evidence; this field must not be interpreted as a completed semantic validation or scientific review.

Only the tested `review_priority="foundational"` literal is used, on **35 declarations** whose existing immediate family comments explicitly say foundational and whose corresponding prose family supports it. Priority is omitted elsewhere rather than inventing additional controlled values or upgrading useful/deferred proposals. Full original F/U/D or F/U/X priorities remain in the linked prose. Neither omission nor foundational review priority changes runtime admission or model ranking.

## Validation limits and authored metadata

The existing local Xtext IParser harness parsed all 26 modified files individually using existing installed language/dependency jars. Worldview and Observable grammar bytes match the source files captured in VALIDATION. The receipt and per-file SHA256 values bind the exact tested bytes, including annotations. No build/install/service operation or repository source edit was performed.

Not run: actual reference linking, effective category/bearer/description/identity checks, adapter/Workspace transport of these 26 modified files, loaded-worldview reasoning, authority replay, model/runtime execution, arbitrary `@review` OWL export/reload or scientific/community acceptance. The convention's separate 14-check parser/adapter/transport audit demonstrates metadata transport for its fixture; it is not a new result for every proposal here.

Review tooling must read **direct authored declaration annotations for the exact source revision**, not inherited/effective annotations on a child or a composite observable. Accepted parent metadata cannot establish child acceptance. No `override=true`, approval flags, logical predicates or eligibility rules were added. The shared convention and its controlled vocabulary remain bounded by the user's accepted metadata syntax; community lifecycle enforcement and decision procedure remain separate work.

Active repository remains at `556f3562aad44ead96d2b1e646a67664901e1fc5` with matching source hashes and empty reported Git porcelain. Its user-global ignore warning remains recorded. The immutable authored core remains ODO 0.2.0 at `08e5a29abbbd32ca8c1b933fc157a1762ba3ee5c`. Experimental/source integration status is unchanged.

## Later documentation instrumentation

Preserve the existing formatted literate content in ontologies and k.IM namespaces. The later requirement is Resources info **HTML/PDF generated from those formatted sources**, discoverable through URLs and carrying exact revision/review provenance. No new literate-comment syntax, renderer implementation or deployment was introduced. The demonstration task owns its own namespace narratives and files; it was not edited by this task.
