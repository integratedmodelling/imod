"""Negative tests mutate temporary copies; saved proposal artifacts are untouched."""
from pathlib import Path
import shutil
import tempfile
import unittest
import yaml
from validate_proposal import validate_directory, SampleValidationError

SOURCE = Path(__file__).resolve().parents[1] / 'review'


class ProposalChainTests(unittest.TestCase):
    def setUp(self):
        self.tmp = tempfile.TemporaryDirectory(prefix='worldview-proposal-tests-')
        self.addCleanup(self.tmp.cleanup)
        self.root = Path(self.tmp.name)
        for path in SOURCE.iterdir():
            if path.suffix in ('.yaml', '.json'):
                shutil.copyfile(path, self.root / path.name)

    def corrupt(self, mutation, message):
        path = self.root / 'surface-catchment-r3-validation.yaml'
        doc = yaml.safe_load(path.read_bytes())
        mutation(doc['proposal'])
        path.write_text(yaml.safe_dump(doc, sort_keys=False), encoding='utf8')
        with self.assertRaisesRegex(SampleValidationError, message):
            validate_directory(self.root)

    def test_unchanged_chain_passes(self):
        self.assertEqual(3, len(validate_directory(self.root)))

    def test_nonexistent_predecessor_fails(self):
        self.corrupt(lambda p: p.update(supersedes_revision='missing-revision'), 'nonexistent predecessor')

    def test_nonexistent_action_target_fails(self):
        self.corrupt(lambda p: p['actions'][0].update(target_asset_ids=['missing-asset']), 'target')

    def test_incorrect_source_hash_fails(self):
        self.corrupt(lambda p: p['actions'][0]['preconditions'].update(source_proposal_sha256='0'*64), 'source hash')

    def test_duplicate_revision_identity_fails(self):
        shutil.copyfile(self.root/'surface-catchment-r1.yaml', self.root/'duplicate.yaml')
        with self.assertRaisesRegex(SampleValidationError, 'duplicate revision identity'):
            validate_directory(self.root)

    def test_nonexistent_action_base_fails(self):
        self.corrupt(lambda p: p['actions'][0].update(base_revision_id='missing-revision'), 'action base revision')

    def test_missing_feedback_link_fails(self):
        self.corrupt(lambda p: p['actions'][0].update(requested_by_feedback_ids=['missing-feedback']), 'feedback.*link')

    def test_unknown_feedback_action_fails(self):
        self.corrupt(lambda p: p['assets'][0]['feedback']['comments'][0].update(proposed_action_ids=['missing-action']), 'feedback action link')

    def test_record_version_precondition_fails(self):
        self.corrupt(lambda p: p['actions'][0]['preconditions'].update(record_version=99), 'record-version')

    def test_application_claim_fails(self):
        self.corrupt(lambda p: p['actions'][0]['apply_result'].update(applied=True), 'remain unapplied')

    def test_silent_action_and_feedback_removal_fails(self):
        def remove(p):
            p['actions'] = []
            p['iteration_control'].update(proposed_action_ids=[], unresolved_feedback_ids=[])
            for asset in p['assets']:
                asset['feedback'].update(comments=[], proposed_action_ids=[])
        self.corrupt(remove, 'carried action missing')


if __name__ == '__main__':
    unittest.main(verbosity=2)
