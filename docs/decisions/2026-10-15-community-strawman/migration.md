# Consumer migration and open design

Old names are not semantic aliases for newly specified meanings.

* `geography:StreamGradient` was an angle in the old declaration. Inspect consumers
  before selecting StreambedGradient or WaterSurfaceGradient. The known
  `klab.staging.vxii/src/staging/vxii/basic.kim:173` test uses `degree_angle` and
  `(elevation.max - elevation)/slope`; both the unit and formula require migration
  or retirement. A unit relabel does not turn the expression into a gradient ratio.
* The `klab-services-diocan` TestOutput Java example resolves the old StreamGradient
  URN. A historical `pugetStreamGradient` raster has no inspected unit metadata.
* Old `geography:SlopeLength` consumers need their actual formula, horizontal/surface
  distance convention and stopping criteria checked before choosing ErosionSlopeLength
  or OverlandFlowPathLength. RUSLE/LS raster names are not proof of physical-length units.
  Most running legacy models were unavailable locally; no local hit implies no disuse.
* `physical:Periodicity` is replaced by TemporalOccurrencePattern. The three child
  names remain, but callers must not require ordinal behavior or a repetition-period
  description. No consumers appeared in accessible qualified/model-language searches.
* Country-family removal has known external consumer references from the earlier
  dependency inventory. No replacement authority IDs were guessed. Previously
  retired Net/Gross and Moving/Still families are not silently reinstated.

No external consumers were modified by this integration. Scans could not access
`~/git/klab-modeler`, remote models or binary resources; they do not prove global disuse.

The user identified partitive inheritance for mixtures, including cases with fully
specified children, as unresolved future design. The water-equivalent convention
does not implement a mereological mechanism or assert that rain/snow/hail exhaust
precipitation or form an additive partition. The exact user statements are retained
in `partitive-inheritance-open-issue.json`; no solution is proposed here.

Unresolved scientific/taxonomy questions carried by retained source annotations
remain review work. See `scientific-review.json` and the historical prose archive.
No deprecated or suspect concept is made to look accepted by deleting its marker.

The user-modified packaged services core and untracked language `plugin.xml_gen`
are preserved. The reviewed additive core synchronization retains the user's
describesConfiguration addition; packaging and local builds/restarts are coordinated
by the services owner/parent, outside this ontology source commit.
