# Organization membership admission, candidate r2

This version overlays [src/society.kwv](src/society.kwv) on the IMOD project identified in [validation.json](validation.json). The only source addition is the admission event and its documentation. The project version and domain imports match the baseline. The companion [proposal](proposal.yaml) supersedes the peer-review draft for this candidate.

| Observation | Reading in this case | Verified distinction |
|---|---|---|
| The federation votes on June 15 to admit a clinic effective July 1. | The decisive vote commits the federation to a choice, represented here by `agency:ChoiceCommitment`. An individual ballot or an inconclusive tally would need different evidence. | The commitment and admission are separately resolvable event meanings. Neither subsumes the other. A commitment has no declared creation of admission or membership. |
| The clinic becomes a member on July 1 under that decision. | `society:OrganizationMembershipAdmission` identifies the bounded effective occurrence. Its definition requires an identified agent, organization and applicable admission criteria. | The Reasoner resolves a satisfiable countable event under `imod:Event`. A June query for effective admissions should exclude this July event. |
| The August roster shows the clinic as a member. | `society:OrganizationMembership` is the directed structural relationship from the clinic as agent to the federation as organization. | The accepted relationship retains both endpoints. Observing it implies neither an admission observation nor a vote observation. It can be known even if the admission date is missing. |

The dates illustrate how a model would use the declarations. This replay checked concepts, subsumption, relationship endpoints and declared creation in the private Reasoner. It did not run an instance-level roster model or infer dates from minutes. Endpoints belong to the membership relationship; the event documentation records participant requirements for a future model. The two events may coincide when the rules give a vote immediate effect.

## Replaying the checks

The checked-in [Java probe](AdmissionCheck.java) uses the project's [Resources source loader](../../../../../tests/elevation-bearer/M49CompositionSourceLoader.java). Compile both with Java 21 on the Services Resources and Reasoner classpath, including their runtime dependencies and Mockito. Launch the probe with Mockito's Java agent and a private Java home and temporary directory. Its four positional arguments are:

1. A fresh output directory containing a flat `sources/` subdirectory with the 26 harvested KWV files and two strategy documents. Copy the candidate Society file over the harvested version for the candidate run.
2. A matching persistent Reasoner authority `catalog.json` containing all five binding requests. The native reader verifies the catalog and provider hashes.
3. The pinned ODO 0.2.2 OWL file, identified by SHA-256 in the validation record.
4. `baseline` or `candidate`.

The loader runs the Resources workspace parsers, import ordering, adaptation and authority validator with isolated storage/service lifecycle bindings. The Reasoner captures the resulting beans, builds and classifies the full private semantic environment, then resolves the probe terms against its accepted state. Baseline and candidate ran in separate JVMs. No deployment, service restart or modification of the shared accepted worldview was part of this validation.
