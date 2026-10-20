# Elevation bearer and realm containment

Elevation is computed from surface/crustal measurements; this does not establish
that its Region bearer is within the Crust realm. A realm requires the bearer to
be within it, spatially or conceptually, rather than merely qualified like an
attribute. Source, reference and computational provenance are distinct relations.

At baseline `35a0df73`, Elevation was Height of Location describing Terrain.
Terrain is SpatialArrangement of Crust Terrestrial Region. The description therefore
contributed a Crust Terrestrial Region bearer to Elevation; repeating a broader
`of Location` could not soundly override that inherited bound. Height's independent
`requires identity (Areal or Volumetric)` obligation still applies to the bearer.

The correction changes only Elevation's description target to
`physical:SpatialArrangement of (earth:Terrestrial earth:Region)`. It uses the
existing broader configuration expression rather than changing shared Terrain.
Terrain retains its Crust-qualified bearer and emergence relation to Elevation,
Slope and Aspect. Aspect and Terrain-based heterogeneity retain their own definitions.
Configurations can emerge when their triggering observations become available.
Terrain's declared `emerges from (Elevation or Slope or Aspect)` relation therefore
does not require the reverse `Elevation describes Terrain` relation. Preserve the
emergence declaration independently; it must not back-propagate Terrain's Crust
restriction into Elevation's bearer. Observing/committing Elevation may provide an
opportunity for later Terrain resolution, but this change does not establish that
the post-commit runtime emergence workflow has been implemented or executed.
No realm is removed globally and no identity or explicit-abstractness obligation
is waived. The Earth/Geography domain remains unchanged.

Acceptance requires the complete source to remain consistent with no unsatisfiable
named classes; the original cotechino model must validate against the corrected
Elevation bearer. Freshwater, Elevation and Slope must select eligible observation
strategies, while explicit abstract Height and unproved/incompatible bearer requests
remain rejected. These checks are private source/strategy acceptance, not executed
live contextualizations. Current realm representation does not certify complete
runtime containment enforcement.
