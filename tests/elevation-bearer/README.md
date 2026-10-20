# Private full-world Elevation regression

These three Java sources are the exact standalone harness used for the successful
2026-10-20 `elevation-run-v2/result.json` acceptance. They require the existing
compiled services validation candidate `547c84a1cf06048e0cb8b19eb1ab9e5d0379adc1`,
its test dependency classpath, Java 21, and verified frozen October 18 authority
inputs. They do not install dependencies or invoke a deployed service.

The pinned receipt names the services revision intentionally; this is a dated
acceptance harness, not a claim that arbitrary later services revisions were tested.
Run `python run.py --help` for explicit paths. Use a new output directory for each
run. The launcher copies `src/*.kwv` and `strategies/*.obs` into a flat private
source directory, matching the real WorkspaceManager loader. It leaves the
worldview, capture and supplied cotechino source untouched.
Archived experiments are excluded, just as in the production project loader.

Assertions cover all 26 ontologies and two observation strategy documents,
consistent OWL/no unsatisfiable named classes, original cotechino dependency
admission, four nonempty strategy selections, explicit abstract Height rejection,
missing bearer proof, retained Terrain Crust bounds, and declared plus compiled
Terrain emergence from Elevation. It uses the complete boolean emergence trigger.
Network attempts are denied in this private JVM and reported; UN must restore one
configuration and perform no fresh configuration. TAXA/CHEM use frozen legacy
responses, not snapshot-capable providers. The historical capture manifest does
not individually pin those legacy cache entries; the current catalog hashes them
into its dependency revision.

This does not execute resources, resolve model data, contextualize cotechino,
verify deployed HTTP behavior or prove post-commit Terrain emergence. Six existing
worldview diagnostics remain in the receipt and are not suppressed.
