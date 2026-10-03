# Recovered parser and adapter validation

On 2026-10-03 the normal offline Maven reactor was run in `C:\Users\Ferd\Documents\Codex\2026-10-03\task-4\reactor`, extracted from a `git archive` of klab-services `721f3736596acff39d92a84566dfd364070be662`. This isolated source archive is not the original services checkout and not a linked worktree. Only this packet's `tools/WorldviewStrawmanAssessmentTest.java` was copied into its resources test tree. No production code, dependency cache or Maven settings were repaired.

The command was run outside the restrictive Java filesystem sandbox through approved escalation:

```powershell
mvn -o -pl klab.services.resources -am test `
  '-Dtest=WorldviewValidationTest,WorldviewStrawmanAssessmentTest' `
  '-Dsurefire.failIfNoSpecifiedTests=false' `
  '-DargLine=-Duser.home=C:/Users/Ferd/Documents/Codex/2026-10-03/task-4/test-home' `
  '-Dstrawman.repo=C:/Users/Ferd/Documents/Codex/2026-10-03/task-4/imod-strawman' `
  '-Dstrawman.reports=C:/Users/Ferd/Documents/Codex/2026-10-03/task-4/adapter-reports'
```

Result: **BUILD SUCCESS; 14 tests, 0 failures, 0 errors, 0 skipped**. All seven reactor modules compiled successfully. Compiling reasoner/resolver dependencies does not mean their semantic tests ran.

The 12 existing `WorldviewValidationTest` tests passed without modification. The two new tests parse actual source files, topologically order their namespace imports, instantiate `OntologySyntaxImpl`, adapt through the real `LanguageAdapter`, register namespaces in `WorldviewValidationScope`, and collect language/adaptation diagnostics. Baseline: 26/26 adapted, zero errors or warnings. Overlay: 27/27 adapted, zero errors or warnings. The overlay substitutes the catchment ontology for the empty hydrology source and adds the jargon namespace; it does not load duplicate hydrology namespaces.

The candidate checks confirm SUBJECT type for both declarations, `isAlias=false` for SurfaceCatchment, and `isAlias=true` for Watershed. No stub concepts or simplified replacement root were used. This is stronger than bare syntax parsing but is not a Resource service discovery/startup test, the full semantic visitor, OWL/worldview loading, Reasoner consistency, model resolution or runtime consequence execution.

Small supporting evidence is kept in `evidence/baseline-adaptation.txt`, `overlay-adaptation.txt`, and the two Surefire text summaries. `reactor-assessment-provenance.json` pins source/test/report hashes and the full log's external local path. The large compilation log is left in the task workspace rather than copied into the repository. The original failed standalone classpath-bootstrap log remains as historical evidence; it no longer blocks the parser/adapter assessment.

For a fresh reproduction, archive the pinned services commit into a new writable directory, copy the Java test into `klab.services.resources/src/test/java/org/integratedmodelling/klab/services/resources/lang/`, adjust the three task paths above, and run the exact command. No install/deploy/clean or network goals are needed on this machine's existing cache. Other machines may need dependencies provisioned separately.
