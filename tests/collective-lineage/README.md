# Collective lineage regression

`run.py` extracts the exact Subject/Agent collective declarations from `src`,
parses and adapts four isolated ontology documents with the real Services loader,
and builds a private semantic environment with exact ODO 0.2.1 bytes. It verifies
lineage, Subject/Agent separation, Organization's domain-neutral ancestry,
unchanged Individual nature, and absence of collection, containment, bearer and
created-observable implications. Java blocks external networking. It starts no service.

Requires Java 21, an existing Services reasoner Surefire XML providing its compiled
classpath, compatible compiled Resources classes, and the Mockito startup agent.
The loader comes from the adjacent `elevation-bearer` harness. The fixture has no
strategies or authority bindings; generic Physical ownership deliberately isolates
lineage. It does not certify full-world domain, authority or strategy acceptance.

```powershell
python tests/collective-lineage/run.py --surefire-xml <reasoner-test.xml> `
  --resources-classes <resources-target-classes> --mockito-agent <mockito-core.jar> `
  --odo <odo-im/releases/0.2.1/odo.owl> --output <new-private-output-directory>
```

The XML's compiled classes must match the Services source being reviewed.
`RESULTS.json`, `run.log`, `compile.log`, extracted sources and Java argument files
record the replay. Full-world acceptance additionally requires a current,
compatible and complete owned authority capture.
