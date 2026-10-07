"""Bounded regression checks for the four cross-domain findings, not scientific approval."""
import copy,json,unittest
from pathlib import Path
from dossier_consistency import (registry,result_category,category_errors,predicate_evidence_errors,
 quality_roundtrip_errors,ANALYSIS_PREFIX)
ROOT=Path(__file__).resolve().parents[1]/'bootstrap'
def read(domain):return json.loads((ROOT/domain/'dossier.json').read_text(encoding='utf8'))

class ReviewCorrections(unittest.TestCase):
 @classmethod
 def setUpClass(cls):
  cls.ds=[json.loads(p.read_text(encoding='utf8')) for p in sorted(ROOT.glob('*/dossier.json'))]
  cls.idx=registry(cls.ds)
 def test_change_is_process_changed_is_event_rate_is_quality(self):
  for expression,expected in [('change in imod:Temperature','process'),('changed imod:Temperature','event'),('change rate of imod:Temperature','quality')]:
   self.assertEqual(expected,result_category(expression,self.idx)[0])
 def test_output_and_income_are_quality_heads(self):
  for name in ['OutputValue','DisposableIncome']:
   self.assertEqual('quality',result_category('economics:'+name+' of economics:EstablishmentUnit',self.idx)[0])
 def test_entire_corpus_bounded_result_categories(self):
  self.assertEqual([],category_errors(self.ds))
 def test_wrong_change_label_is_rejected(self):
  d=copy.deepcopy(read('hydrology'));q=next(q for q in d['questions'] if (q['expression'] or '').startswith('change in '))
  q['expected_type']='quality';q['expression_result_category']='quality'
  self.assertTrue(category_errors([d]))
 def test_wrong_output_label_is_rejected(self):
  d=copy.deepcopy(read('economics'));q=next(q for q in d['questions'] if q['id']=='economics-q03');q['expected_type']='process'
  self.assertTrue(category_errors([d]))
 def test_ecology_composition_not_replaced_by_richness(self):
  q=next(q for q in read('ecology')['questions'] if q['id']=='ecology-q03')
  self.assertIsNone(q['expression']);self.assertEqual('unresolved',q['expected_type'])
  self.assertEqual('insufficient_component',q['components'][0]['role'])
  self.assertEqual('process',q['components'][0]['expression_result_category'])
  self.assertEqual(2,len(q['missing_observables']))
  self.assertIn('taxon',q['missing_observables'][0]['meaning'].lower())
  self.assertIn('{A,B}',q['positive']);self.assertIn('{C,D}',q['positive'])
 def test_quality_projection_roundtrip_and_artifact_hash(self):
  d=read('hydrology');projection=json.loads((ROOT/'hydrology/backend-dossier.sample.json').read_text())
  self.assertEqual([],quality_roundtrip_errors(projection,d['quality_summaries'],(ROOT/'hydrology/dossier.json').read_bytes()))
 def test_dropped_quality_status_is_rejected(self):
  d=read('hydrology');projection=json.loads((ROOT/'hydrology/backend-dossier.sample.json').read_text())
  for i,s in enumerate(projection['unresolvedSemantics']):
   if not s.startswith(ANALYSIS_PREFIX):continue
   for field in ['status','proposed_summary']:
    with self.subTest(analysis=i,field=field):
     corrupted=copy.deepcopy(projection);a=json.loads(s[len(ANALYSIS_PREFIX):]);del a['analysis'][field]
     corrupted['unresolvedSemantics'][i]=ANALYSIS_PREFIX+json.dumps(a)
     self.assertTrue(quality_roundtrip_errors(corrupted,d['quality_summaries'],(ROOT/'hydrology/dossier.json').read_bytes()))
 def test_changed_research_bytes_invalidate_projection_binding(self):
  d=read('hydrology');projection=json.loads((ROOT/'hydrology/backend-dossier.sample.json').read_text())
  self.assertTrue(quality_roundtrip_errors(projection,d['quality_summaries'],(ROOT/'hydrology/dossier.json').read_bytes()+b' '))
 def test_fao_predicate_has_direct_scoped_evidence(self):
  d=read('agriculture');self.assertEqual([],predicate_evidence_errors(d))
  a=next(a for a in d['quality_summaries'] if a['proposed_summary']=='conservation agriculture cover class')
  self.assertIn('FAO-CA',a['source_ids']);self.assertEqual('Permanent soil organic cover paragraph',a['claim_evidence'][0]['locator'])
 def test_missing_fao_predicate_source_is_rejected(self):
  d=copy.deepcopy(read('agriculture'));a=d['quality_summaries'][0];a['source_ids'].remove('FAO-CA')
  self.assertTrue(predicate_evidence_errors(d))
 def test_partial_explored_category_targets(self):
  met=[]
  for d in self.ds:
   if all(sum(c['category']==kind for c in d['concepts'])>=5 for kind in ['subject','process','relationship','event']):met.append(d['domain'])
  self.assertEqual(sorted(['economics','engineering','genetics','hydrology','infrastructure']),sorted(met))
  self.assertEqual(18,len(self.ds)-len(met))
 def test_narrative_intent_separate_from_expression_category(self):
  for d in self.ds:
   for q in d['questions']:
    self.assertTrue(q['narrative_intent']);self.assertIn('expression_result_category',q)
    self.assertNotEqual(q['narrative_intent'],q['expression_result_category'])

if __name__=='__main__':unittest.main()
