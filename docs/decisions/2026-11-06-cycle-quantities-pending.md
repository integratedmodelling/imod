# Pending integration decisions for cycle quantities

The narrow scientific scope is settled: Frequency is completed cycles per unit
time; Period is duration of one complete cycle. Both physical qualities inhere
in physical:CyclicProcess. Irregular event occurrence rates remain separate.
The retained decreases-with relation is descriptive and introduces no numerical
reciprocal calculation.

## Publication

The local ODO 0.2.2 source pin is
f5e996b42a2d91994d06c11581ce80616d8351d4, SHA-256
008d603a91eb345c4c4e69e8a90267c0f74d39f56a24373e5e9cc5ba251ea549.
It must be published and verified before activating the authored IMOD URL.
Services includes the same exact bytes and the frozen-catalog identity.
No push, merge, deployment or restart is included in this work.

## Existing measurement-category mismatch

The current language/adapter marks Duration (and therefore Period) EXTENSIVE,
while the unchanged ODO Duration class inherits IntensivePhysicalProperty.
The new Frequency is a generic numeric quantity in the consumer flags, with
intensive ancestry in ODO and Hz units. It is not Numerosity or EXTENSIVE.
This work verifies Period's Duration ancestry, seconds, cyclic bearer and OWL
consistency; it does not resolve Duration aggregation semantics or introduce a
new Frequency keyword/type. A separate paired Languages/Services decision is
needed before relying on Period's aggregation flags. Historical ODO bytes must
remain unchanged in any such correction.

## Independent Time/Space cleanup

The authored candidate preserves the two root aliases to avoid combining this
change with the user's active removal work. The replay harness can comment
those aliases only in private inputs with --without-extents. No additional
extent taxonomy or contextualization commitments are introduced.

## Authority capture

Full-world replay uses the existing owned capture and audited legacy reader.
It verifies source/proof hashes and removes obsolete empty fields in memory.
The native persistent-catalogue checksum/roundtrip remains unverified.
