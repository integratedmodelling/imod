# Authority capture investigation

Full-world isolated validation is complete: unchanged baseline 14/14 checks and
corrected candidate 72/72 checks pass. Both adapt all 26 ontologies and two strategy
documents, report bean/logical VALID, consistent OWL and zero unsatisfiable named
classes. Candidate and baseline have identical three pre-existing Time/Space and
Period/Frequency diagnostics. Actual replay made zero external network attempts.

## Original failure and safe recovery

The saved public capture is chemical-capture-r2/capture under the 2026-10-23 task-2
workspace. Its source/proof SHA remains
0f7a9a6c0c1b60e48e914c5f5ea8df2ea28908ccfcd12aff888d14780943efde.
It contains 492 obsolete empty requiredExtents arrays and 492 obsolete empty
requiredAttributes arrays. The current strict transport reader rejects these.
The private read adapter verifies the original source/proof hash, removes only
obsolete empty arrays in memory, rejects nonempty obsolete data, and delegates
provider/configuration proof checking to the current captureRecorded API.

The CHEM response for CID_962 was present but expired at approximately
2026-10-24T09:24:57.7Z. All 38 chemical code-form records were expired: 19 unique
identities, comprising CID:962 and 18 ChEBI ancestors. The exact identities and
cache paths are in capture-audit.json. The 36 TAXA records remain unexpired;
UN.M49 and LAND retain verified configured snapshots. No missing or invalid
binding among these four remained after the refresh.

Fresh capture is feasible without a running service. The exact proved public
PubChem archive (SHA-256
11477e8215617572e5ceac738b6e02ad0b66815880624dc9b4fdb6004112097e)
resolved 38 code forms through real provider/CachedAuthority calls using unchanged
parameters. A private copied capture received the responses and owned documentation.
No response, expiration, proof hash, permission or configuration was fabricated
or manually changed. The original capture and all services remain untouched.

The successful full-world replay uses that copied capture and the audited read
adapter. Exact local run arguments, private source copies, logs and refreshed data
are retained in this task workspace under validation/authority-investigation.

## Separate native-persistence limitation

An optional conversion through current writePersistent/readPersistent fails with
Authority configured snapshot checksum mismatch. Both UN.M49 and LAND snapshots
retain identical JSON values and original raw-content hashes, but the native
reader reserializes typed snapshots with sorted request-parameter maps. Their
resulting hashes differ from the stored original byte hashes. The typed-snapshot
audit records both cases; no checksum check was bypassed and the generated native
catalogue is not an accepted reusable artifact.

This does not block the verified isolated replay. The smallest follow-up for a
normal reusable current-format catalogue is to make the native writer/reader use
the same canonical typed-snapshot hash, preserve original producer-byte provenance
separately, and test roundtrips for both UN.M49 and LAND. That product fix is not
included in this ontology candidate.

## Energy pairing and next step

Energy is extensive in ODO candidate release commit
86e25036b7e7a7d75971ab9f303c8f5f1785e30c. The paired language API from the
quantitative-within task also moves ENERGY into EXTENSIVE and out of INTENSIVE;
its source SHA is recorded in paired-api-provenance.json. The old installed API
retains the intensive flag, so the ODO bundle alone is insufficient. Private tests
prepend the compiled paired API: all 72 fixture checks and 48 consumer JUnit tests
pass, including energy-rate nature and J/s dimensions. The new OWL regression
fails against historical ODO 0.2.0 as expected.

The immediate integration step is a normal build of that paired language change
with the corrected ODO/consumer pin. No warning work, original-checkout edits,
push, merge, deployment or service restart was performed.
