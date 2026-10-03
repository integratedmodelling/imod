"""Validate saved proposals; schema validity is not semantic approval."""
from pathlib import Path
import json
import yaml
from jsonschema import Draft202012Validator

root=Path(__file__).resolve().parents[1]
schema=json.loads((root/'review/domain-context-proposal.schema.json').read_text(encoding='utf8'))
Draft202012Validator.check_schema(schema)
validator=Draft202012Validator(schema)
for path in sorted((root/'review').glob('*.yaml')):
    document=yaml.safe_load(path.read_text(encoding='utf8'))
    validator.validate(document)
    proposal=document['proposal']
    ids=[a['asset_id'] for a in proposal['assets']]
    assert len(ids)==len(set(ids)), 'duplicate stable asset IDs'
    assert set(proposal['dependency_order'])==set(ids), 'dependency order mismatch'
    evidence={e['evidence_id'] for e in proposal['evidence']}
    sources={s['source_id'] for s in proposal['sources']}
    assert all(e['source_id'] in sources for e in proposal['evidence'])
    for asset in proposal['assets']:
        assert set(asset['evidence_refs'])<=evidence
        assert asset['tier']==proposal['scope']['requested_tier']
    print('PASS schema and local record references:',path.name)
print('No ontology reference resolution, scientific approval, or workflow execution performed.')
