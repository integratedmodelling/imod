"""Validate this packet's single, linear, unapplied proposal sample.

Checks saved-byte hashes and cross-revision links, not ontology semantics, approval
authority, an apply processor, or production workflow conformance. Branching review
histories and approved/applied actions are outside this bounded sample.
"""
from pathlib import Path
import argparse
import hashlib
import json
import yaml
from jsonschema import Draft202012Validator


class SampleValidationError(ValueError):
    pass


def require(condition, message):
    if not condition:
        raise SampleValidationError(message)


def unique(records, key, label):
    indexed = {}
    for record in records:
        identity = record[key]
        require(identity not in indexed, f'duplicate {label}: {identity}')
        indexed[identity] = record
    return indexed


def validate_directory(directory, schema_path=None):
    directory = Path(directory)
    schema_path = Path(schema_path or directory / 'domain-context-proposal.schema.json')
    schema = json.loads(schema_path.read_text(encoding='utf8'))
    Draft202012Validator.check_schema(schema)
    validator = Draft202012Validator(schema)
    revisions, paths, digests = {}, {}, {}
    for path in sorted(directory.glob('*.yaml')):
        raw = path.read_bytes()
        document = yaml.safe_load(raw)
        validator.validate(document)
        proposal = document['proposal']
        rid = proposal['revision_id']
        require(rid not in revisions, f'duplicate revision identity: {rid}')
        revisions[rid], paths[rid] = proposal, path
        digests[rid] = hashlib.sha256(raw).hexdigest()
    require(bool(revisions), 'no proposal revisions')
    require(len({p['id'] for p in revisions.values()}) == 1, 'sample must contain one proposal identity')
    roots = [rid for rid, p in revisions.items() if p['supersedes_revision'] is None]
    require(len(roots) == 1, 'sample needs exactly one root revision')
    require(revisions[roots[0]]['iteration'] == 1, 'root iteration must be 1')
    require(len({p['iteration'] for p in revisions.values()}) == len(revisions), 'duplicate iteration')
    ancestors = {}
    for rid, proposal in revisions.items():
        chain, cursor = set(), rid
        while revisions[cursor]['supersedes_revision'] is not None:
            previous = revisions[cursor]['supersedes_revision']
            require(previous in revisions, f'nonexistent predecessor: {previous}')
            require(previous not in chain and previous != rid, f'predecessor cycle: {rid}')
            require(revisions[cursor]['iteration'] == revisions[previous]['iteration'] + 1,
                    f'nonconsecutive predecessor iteration: {cursor}')
            chain.add(previous)
            cursor = previous
        require(cursor == roots[0], f'disconnected predecessor chain: {rid}')
        ancestors[rid] = chain
        control = proposal['iteration_control']
        require(control['previous_revision_id'] == proposal['supersedes_revision'],
                f'iteration-control predecessor mismatch: {rid}')
        require(control['current_iteration'] == proposal['iteration'] and
                control['next_iteration'] == proposal['iteration'] + 1,
                f'iteration-control number mismatch: {rid}')
        history = proposal['change_log']
        require(len(history) == proposal['iteration'], f'incomplete change log: {rid}')
        require(len({h['revision_id'] for h in history}) == len(history), f'duplicate history revision: {rid}')
        require({h['revision_id'] for h in history} == chain | {rid}, f'history lineage mismatch: {rid}')
        for entry in history:
            target = revisions[entry['revision_id']]
            require(entry['iteration'] == target['iteration'] and
                    entry['previous_revision_id'] == target['supersedes_revision'],
                    f'history predecessor/iteration mismatch: {rid}')
    asset_maps = {rid: unique(p['assets'], 'asset_id', 'asset ID') for rid, p in revisions.items()}
    action_history, feedback_history = {}, {}
    for rid, proposal in sorted(revisions.items(), key=lambda item: item[1]['iteration']):
        assets = asset_maps[rid]
        require(set(proposal['dependency_order']) == set(assets), f'dependency order mismatch: {rid}')
        evidence = unique(proposal['evidence'], 'evidence_id', 'evidence ID')
        sources = unique(proposal['sources'], 'source_id', 'source ID')
        require(all(e['source_id'] in sources for e in evidence.values()), f'unknown evidence source: {rid}')
        actions = unique(proposal['actions'], 'action_id', 'action ID')
        comments = unique([c for a in assets.values() for c in a['feedback']['comments']], 'comment_id', 'feedback ID')
        require(set(action_history) <= set(actions), f'carried action missing in bounded sample: {rid}')
        require(set(feedback_history) <= set(comments), f'carried feedback missing in bounded sample: {rid}')
        for aid, asset in assets.items():
            require(set(asset['evidence_refs']) <= set(evidence), f'unknown asset evidence: {aid}')
            require(asset['tier'] == proposal['scope']['requested_tier'], f'asset tier mismatch: {aid}')
            feedback = asset['feedback']
            require(set(feedback['proposed_action_ids']) <= set(actions), f'unknown asset feedback action: {aid}')
            require(not feedback['applied_action_ids'], 'sample must retain unapplied actions')
            for action_id in feedback['proposed_action_ids']:
                require(aid in actions[action_id]['target_asset_ids'], f'asset feedback/action target mismatch: {aid}')
        for fid, feedback in comments.items():
            referenced = feedback['proposal_revision_id']
            require(referenced in ancestors[rid] | {rid}, f'feedback references unknown/nonancestor revision: {fid}')
            require(feedback['target'] in asset_maps[referenced], f'feedback target absent in referenced revision: {fid}')
            require(set(feedback['evidence_refs']) <= set(evidence), f'unknown feedback evidence: {fid}')
            require(feedback['iteration'] <= proposal['iteration'], f'future feedback iteration: {fid}')
            require(set(feedback['proposed_action_ids']) <= set(actions), f'unknown feedback action link: {fid}')
            for action_id in feedback['proposed_action_ids']:
                require(fid in actions[action_id]['requested_by_feedback_ids'], f'nonreciprocal feedback/action link: {fid}')
                require(feedback['target'] in actions[action_id]['target_asset_ids'], f'feedback/action target mismatch: {fid}')
            if fid in feedback_history:
                require(feedback == feedback_history[fid], f'changed carried feedback in bounded sample: {fid}')
            feedback_history[fid] = feedback
        for action_id, action in actions.items():
            base = action['base_revision_id']
            require(base in ancestors[rid], f'action base revision is not a known ancestor: {action_id}')
            require(action['proposal_id'] == proposal['id'], f'action proposal mismatch: {action_id}')
            require(bool(action['target_asset_ids']), f'empty action targets: {action_id}')
            require(set(action['target_asset_ids']) <= set(asset_maps[base]) and
                    set(action['target_asset_ids']) <= set(assets), f'nonexistent action target: {action_id}')
            conditions = action['preconditions']
            require(conditions.get('base_revision_id') == base, f'action precondition base mismatch: {action_id}')
            require(conditions.get('source_proposal_sha256') == digests[base], f'incorrect action source hash: {action_id}')
            require(all(conditions.get('record_version') == asset_maps[base][aid]['record_version']
                        for aid in action['target_asset_ids']), f'action record-version precondition mismatch: {action_id}')
            require(revisions[base]['iteration'] < action['requested_in_iteration'] <= proposal['iteration'],
                    f'action request iteration mismatch: {action_id}')
            require(bool(action['requested_by_feedback_ids']) and set(action['requested_by_feedback_ids']) <= set(comments),
                    f'unknown action feedback link: {action_id}')
            for fid in action['requested_by_feedback_ids']:
                require(action_id in comments[fid]['proposed_action_ids'], f'nonreciprocal action/feedback link: {action_id}')
                require(comments[fid]['target'] in action['target_asset_ids'], f'action/feedback target mismatch: {action_id}')
                require(comments[fid]['proposal_revision_id'] == base and comments[fid]['iteration'] == action['requested_in_iteration'],
                        f'action/feedback revision or iteration mismatch: {action_id}')
            for aid in action['target_asset_ids']:
                require(action_id in assets[aid]['feedback']['proposed_action_ids'], f'action absent from target feedback: {action_id}')
            require(action['status'] == 'proposed' and action['operation'] == 'modify',
                    'bounded sample supports only proposed modify actions')
            require(action['apply_result'].get('applied') is False and action['apply_result'].get('commit') is None,
                    'sample action must remain unapplied')
            require(action['approval'].get('decision') is None and action['approval'].get('reviewer') is None and
                    not action['approval'].get('approved_action_ids'), 'sample must not assert approval')
            if action_id in action_history:
                require(action == action_history[action_id], f'changed carried action in bounded sample: {action_id}')
            action_history[action_id] = action
        control = proposal['iteration_control']
        require(set(control['proposed_action_ids']) == set(actions), f'iteration action links mismatch: {rid}')
        require(set(control['unresolved_feedback_ids']) == {fid for fid,c in comments.items() if c['status']=='open'},
                f'iteration feedback links mismatch: {rid}')
        require(not control['applied_action_ids'], 'sample iteration must retain unapplied actions')
    return [paths[rid] for rid in sorted(revisions, key=lambda rid: revisions[rid]['iteration'])]


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('directory', nargs='?', type=Path, default=Path(__file__).resolve().parents[1] / 'review')
    args = parser.parse_args()
    for path in validate_directory(args.directory):
        print('PASS schema, lineage, action/feedback links and saved-byte hashes:', path.name)
    print('Bounded sample validation only; no ontology reasoning, approval authorization, application or workflow execution.')
