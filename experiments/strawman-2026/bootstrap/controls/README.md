# Intentional invalid fixture

invalid-confers.kwv must fail the active Worldview parser: confers has no active declaration production. This is a test fixture, not a candidate ontology or source to load. It also deliberately references an unchosen summary as if it were a role; syntax rejection does not test that separate semantic error. See REVIEW_FINDINGS HYD-N05. Source: inspected current Worldview.xtext AffectsClause and commented historical declarations.
