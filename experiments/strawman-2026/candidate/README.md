# Candidate overlay, not an additional worldview

Replace the existing empty `src/hydrology.kwv` with this candidate only in a disposable test copy; add `src/jargon/hydrology.terms.kwv`. Never load both hydrology files as separate namespaces. This experiment leaves the branch's production `src` unchanged pending semantic validation.

SurfaceCatchment is a `thing` (structural, independent, bounded region) specializing `earth:Region`, with no additional explicit ODO superclass. The bounding criterion is a specified surface-drainage outlet; it is not the occurrence of water flow. A model may delineate it with terrain and drainage evidence. `Watershed` has exactly the same locally defined intension/extension and adds no type restriction. Other uses of watershed are excluded. RiverBasin is not also introduced: different linguistic scopes need review rather than multiplying synonyms.

The proposed import edges are hydrology → imod, earth; hydrology.terms → imod, hydrology. There is no import back from hydrology to jargon. The physical/knowledge placement is inherited provisionally, not a new claim about physical versus mental reality. A functional view of drainage remains a separate process meaning.

Sources: legacy im/src/hydrology.kim, Watershed definition and RiverBasin alias; IPCC AR6 WGII catchment glossary entry. The narrower explicit outlet criterion follows the legacy source. Names are new proposals. Groundwater/administrative exclusions are scope choices informed by GWML2 distinctions.

Pass/fail details are in `../VALIDATION.md`. Parsing cannot establish that Region and Hydrosphere resolve, that the aliases have compatible categories, or that a resource service recursively discovers jargon files. Those are separate promotion gates.

Specific parent-scope issue: current earth:Region describes a volumetrically delimited section including soil and lower atmosphere, whereas this catchment is bounded through surface drainage. Review whether the catchment denotes that full region with a drainage-defined footprint or requires a different parent. The proposal deliberately leaves ancestry unverified; parser success does not settle this interpretation.
