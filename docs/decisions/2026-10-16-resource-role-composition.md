# Material bodies, artifacts and resource composition — 2026-10-16

## MaterialBody and Artifact

The user approved abstract physical:MaterialBody as "an individuated portion of
matter, whose unity and boundaries are established by its specialization".
Specializations supply universal criteria; models establish particulars. Solids,
liquids and gases need neither fixed shape nor permanent material membership.
Physical discontinuities, qualitative differentiation, conventional demarcations
and mixed boundaries are admissible. The commentary cites Smith and Varzi (2000),
section 1.1; manufactured objects can have physically grounded boundaries.
No FiatBody/NaturalBody partition or automatic subjective modifier is introduced.

MaterialBody remains a Subject, preserving the deliberate Agent–Subject boundary.
Cavity commentary distinguishes the host, absence of host material and contents;
a cavity can contain air or water. Existing Hole/Slot/Bump declarations, host
semantics and parentage are unchanged; no duplicate Cavity or Feature/MaterialBody
disjointness is added.

The user approved Artifact as an abstract MaterialBody intentionally produced or
modified. It is an organizing category; models target suitable concrete
specializations. Informational artifacts and constructed cavities are outside
this class. Neither human-only manufacture, Earth-only scope, current usefulness,
functioning nor Resource status follows. Existing review annotations remain.

## Resource role composition

The user approved removal of infrastructure:HumanMadeResource. It bundled a
Resource role with an artifact/provenance distinction and described that bundle
as equivalent to Artifact. Artifact and resource use are different meanings:
being an artifact does not establish its use as a resource.

The general review principle favors composition of independently meaningful
attributes, roles and identities over a separately named bundled specialization.
Compound spelling alone is not grounds for removing a genuine kind.

This edit removes only HumanMadeResource and its attached equivalence annotation,
prose and applicability clause. Resource and its NaturalResource child remain.
No replacement alias, new provenance predicate, human-only manufacture rule or
resolver behavior is introduced. Observable provenance meanings and any PROV
alignment remain separate discussion items; no record schema is added here.

## Local reference review

Before removal, the only exact HumanMadeResource occurrence in active src/ and
strategies/ was its declaration. No active dependent reference needed rewriting.
Engineering bootstrap proposals refer to Artifact rather than HumanMadeResource.

Original snapshots and an old commented physical:HumanMadeResource reference in
docs/decisions/2026-10-15-community-strawman/original-v15/ retain their historical
bytes. The separate checkout under ~/git/imod was not modified. Broader local
searches could not inspect ~/git/klab-modeler because access was denied; the local
result is not proof that no external consumer exists. Any external use needs
meaning review before migration, rather than blind replacement with Artifact.

## Integration and validation scope

Base: 200542674b57378578ee74999395b1828a3b3724, branch
worldview/strawman-2026. This record covers only the approved Physical and
Infrastructure packet. Organization/Institution, other possible bundled concepts
and new provenance mappings remain unimplemented discussion items. Yesterday's
universal domain/system contracts and core Agent–Subject disjointness remain.

Independent services validation parsed, adapted and ingested all 26 ontologies
in a private home with captured authorities. Candidate bean and logical status
were VALID, the ontology was consistent, and no named classes were unsatisfiable.
MaterialBody and Artifact were both abstract Subjects disjoint with Agent;
Artifact inherited MaterialBody, and HumanMadeResource was absent. The same
32 baseline diagnostics remained. This validation did not cover strategies,
service lifecycle or live acceptance; it was not a full stack rebuild.

Validated source SHA256:

- src/physical.kwv: bf886d8b44ffbd74eaa1363cbbf807eade9f6c8815bb5d107730a60c01571e6d
- src/infrastructure.kwv: 8144cb1db03e00fb0d6cbad3d3d7cca089066997e93179ab7f63068f389b89a7

The integration scope is a local commit, with no remote push or master merge.
