# Validation record

Date: 2026-10-03. Branch base: `608bef150ced0a109db98a5aad64ba4461beaa54`. This packet keeps the production source tree unchanged and tests a two-file overlay separately.

| Check actually performed | Result | What it does not prove |
|---|---|---|
| Rechecked original Git states and captured raw-source SHA-256 hashes | 26 current .kwv + 44 legacy .kim recorded; dirty patches attributed | Scientific coverage or authorship of uncommitted work |
| Local Xtext parser over base `src` | 26/26 files pass | Symbol resolution, adapter validity or loaded worldview consistency |
| Same parser over candidate source | 2/2 files pass | Candidate imports and references resolve semantically |
| Parser negative control: unqualified `is Missing` | Rejected as expected (nonzero exit); see negative-parser.txt | All possible invalid input is rejected |
| Embedded Worldview/Observable grammar compared with local source after newline normalization | Both match | Every adapter/reasoner artifact is synchronized with source |
| Candidate overlay static namespace/import checks | 27 unique namespaces, imports exist, acyclic; alias-only convention passes | Service discovery, symbol existence/type compatibility, OWL consistency |
| Proposal r1, illustrative r2 and validation r3 JSON Schema Draft 2020-12 | All three pass; local evidence/source/asset reference checks pass | Domain correctness, real reviewer approval, action authorization |
| Final source preservation and local Markdown links | All 70 original source hashes, three original HEAD/status pairs, and packet links pass | Concurrent edits made after this check |
| Initial Maven offline dependency-classpath bootstrap | Failed, later bypassed by the normal isolated reactor | The initial failure is retained, not the final validation status |
| Normal offline reactor: existing WorldviewValidationTest | 12 tests pass, zero failures/errors/skips | Passing these unit tests is not candidate Reasoner validation |
| Normal offline reactor: new WorldviewStrawmanAssessmentTest | 2 tests pass; baseline 26 and overlay 27 ontologies adapt with zero errors/warnings | This exercises LanguageAdapter/WorldviewValidationScope, not service startup or the full semantic visitor |
| Candidate adapted categories and alias status | SurfaceCatchment and Watershed are SUBJECT; canonical is not alias, jargon is alias | Equivalence of scientific meaning remains reviewable |
| Resource service load, reasoner, full wildfire resolution | NOT RUN | No executable twin or consequence execution claimed |

Raw parser logs and exact JAR path/SHA-256 manifests are in `evidence/`. `built-grammar-match.json` records the grammar comparison. The parser is a real Xtext `IParser`, not the static regex checker. The locally available Java is JDK 21. The language source checkout is pinned in baseline.json. The fallback classpath uses local build jars and Maven-cache jars; it is not a production dependency recipe. Bootstrap initially encountered missing setup classes (empty classes directory), an incompatible ANTLR Token API, and a legacy google-collections/Guava collision. The final harness uses built jars, ANTLR runtime 3.2 and excludes obsolete google-collections; the reported final baseline and candidate runs use the same harness/classpath selection.

The initial Maven failure occurred before tests: `org.apache.geronimo.genesis:genesis-java5-flava:pom:2.0` was cached but unavailable under the required repository identity in offline mode, reached through HermiT → axiom-api → geronimo activation. See `evidence/maven-bootstrap.txt`. Following the parallel workflow investigation, a normal offline reactor in an isolated git-archive snapshot recovered outside the restrictive Java filesystem sandbox. No dependency-cache repair or original-source edit was required. The resulting 14 passing tests supersede the earlier adapter bootstrap blocker, but do not establish Reasoner or service-load success. See [reactor validation](REACTOR_VALIDATION.md) for exact commands and scope.

Git whitespace checking reports pre-existing whitespace in the verbatim local-edit patch evidence and trailing spaces in raw Maven output. These captures are intentionally not normalized. The authored proposal, candidate and tools pass the same check with raw evidence excluded.

## Reproduction

From this packet directory, with PyYAML and jsonschema available:

```powershell
python tools/validate_proposal.py
python tools/check_overlay.py
python tools/run_parser.py --languages C:/Users/Ferd/git/klab-languages --maven C:/Users/Ferd/.m2/repository --report evidence/baseline-parser.txt ../../src
python tools/run_parser.py --languages C:/Users/Ferd/git/klab-languages --maven C:/Users/Ferd/.m2/repository --report evidence/candidate-parser.txt candidate/src
```

Python packages used in this task: PyYAML 6.0.3, jsonschema 4.26.0, installed into the task workspace `.python-deps`, not the repository or global Python installation. Local validation sets PYTHONPATH to that location. The schema copy is byte-identical to the current guidance schema; source hash recorded in guidance-hashes.json.

## Promotion gates and remaining limitations

Before copying the candidate into active `src`, complete recursive jargon discovery, duplicate-namespace rejection through the real resource service, loading and reasoner checks against pinned ODO/authority versions. The disposable overlay now passes parser adaptation with WorldviewValidationScope, but full reference/semantic validation remains distinct. Check category/ancestry of earth:Region and domain expression, scientific alias equality, and root-only ODO constraints. An adapted alias can still be semantically wrong.

Then add domain-reviewed descriptions for catchment delineation and representative observations. Test candidate and baseline separately; retain all failures, including pre-existing ones. Do not implement implication/detection, graph-commit consequences or state retention to make this example pass. The current task explicitly leaves those mechanisms unimplemented.

The proposal examples remain drafts with unresolved semantic review and ancestry flags even though schema-valid. The synthetic second iteration is an unapplied review action, not a second accepted concept definition. The third revision records successful adapter validation without approving/applying that action. No push, PR, merge, external workflow transition or deployment was performed.
