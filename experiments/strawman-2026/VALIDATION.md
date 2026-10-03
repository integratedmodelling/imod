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
| Proposal r1 and illustrative r2 JSON Schema Draft 2020-12 | Both pass; local evidence/source/asset reference checks pass | Domain correctness, real reviewer approval, action authorization |
| Final source preservation and local Markdown links | All 70 original source hashes, three original HEAD/status pairs, and packet links pass | Concurrent edits made after this check |
| Maven offline dependency-classpath bootstrap for resources tests | BLOCKED, dependency-resolution exit 1 | No Maven parser/adaptation/reasoner test suite was run |
| Adapter, resource service load, reasoner, full wildfire resolution | NOT RUN | No executable twin or consequence execution claimed |

Raw parser logs and exact JAR path/SHA-256 manifests are in `evidence/`. `built-grammar-match.json` records the grammar comparison. The parser is a real Xtext `IParser`, not the static regex checker. The locally available Java is JDK 21. The language source checkout is pinned in baseline.json. The fallback classpath uses local build jars and Maven-cache jars; it is not a production dependency recipe. Bootstrap initially encountered missing setup classes (empty classes directory), an incompatible ANTLR Token API, and a legacy google-collections/Guava collision. The final harness uses built jars, ANTLR runtime 3.2 and excludes obsolete google-collections; the reported final baseline and candidate runs use the same harness/classpath selection.

The Maven failure occurs before tests: `org.apache.geronimo.genesis:genesis-java5-flava:pom:2.0` is cached but unavailable under the required repository identity in offline mode, reached through HermiT → axiom-api → geronimo activation. See `evidence/maven-bootstrap.txt` for the exact invocation result. This is an environment/bootstrap blocker, not a candidate semantic failure and not proof that baseline semantic tests pass.

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

Before copying the candidate into active `src`, create a disposable full-worldview overlay, then test real parser adaptation with workspace reference scope, recursive jargon discovery, duplicate-namespace rejection, loading and reasoner checks against pinned ODO/authority versions. Check category/ancestry of earth:Region and domain expression, alias identity, and root-only ODO constraints. A syntactically correct alias can still be semantically wrong.

Then add domain-reviewed descriptions for catchment delineation and representative observations. Test candidate and baseline separately; retain all failures, including pre-existing ones. Do not implement implication/detection, graph-commit consequences or state retention to make this example pass. The current task explicitly leaves those mechanisms unimplemented.

The proposal example remains a draft with unresolved semantic review and ancestry flags even though schema-valid. The synthetic second iteration is an unapplied review action, not a second accepted concept definition. No push, PR, merge, external workflow transition or deployment was performed.
