import copy,json,unittest
from pathlib import Path
from check_land_agriculture import errors,ROOT

class BoundaryRevision(unittest.TestCase):
 @classmethod
 def setUpClass(cls):
  cls.ds=[json.loads(p.read_text(encoding='utf8')) for p in sorted(ROOT.glob('*/dossier.json'))]
  cls.disp=json.loads((ROOT/'land-agriculture-dispositions.json').read_text())
 def test_ownership_and_references(self):self.assertEqual([],errors(self.ds,self.disp))
 def test_lost_moved_id_rejected(self):
  ds=copy.deepcopy(self.ds);a=next(d for d in ds if d['domain']=='agriculture');a['concepts']=[c for c in a['concepts'] if c['id']!='land-ManagedField'];self.assertTrue(errors(ds,self.disp))
 def test_duplicate_coverage_rejected(self):
  ds=copy.deepcopy(self.ds);a=next(d for d in ds if d['domain']=='agriculture');next(d for d in ds if d['domain']=='land')['concepts'].append(copy.deepcopy(a['concepts'][0]));self.assertTrue(errors(ds,self.disp))
 def test_retired_binding_rejected(self):
  ds=copy.deepcopy(self.ds);next(d for d in ds if d['domain']=='agriculture')['concepts'][0]['qualities'].append('land:PlantAvailableWater');self.assertTrue(errors(ds,self.disp))
 def test_lost_question_rejected(self):
  ds=copy.deepcopy(self.ds);a=next(d for d in ds if d['domain']=='agriculture');a['questions']=[q for q in a['questions'] if q['id']!='land-q01'];self.assertTrue(errors(ds,self.disp))
 def test_livestock_is_substantive_and_not_ownership(self):
  a=next(d for d in self.ds if d['domain']=='agriculture');names={c['name'] for c in a['concepts']}
  self.assertTrue({'agriculture:ManagedLivestock','agriculture:ManagedHerd','agriculture:AnimalHusbandry','agriculture:LivestockGrazing','agriculture:RaisesLivestock','agriculture:GrazingEpisode','agriculture:LivestockCount'}<=names)
  self.assertEqual(6,sum(q['id'].startswith('agriculture-') for q in a['questions']))
  self.assertIn('responsible actor',next(c for c in a['concepts'] if c['name']=='agriculture:RaisesLivestock')['definition'])
 def test_land_has_no_crop_operations_or_automatic_recovery(self):
  land=next(d for d in self.ds if d['domain']=='land');self.assertFalse(any(c['name'].endswith(':Sowing') for c in land['concepts']))
  self.assertIn('not merely restoration activity',next(a for a in land['quality_summaries'] if a['proposed_summary']=='restored')['basis'])
 def test_no_executable_agriculture_namespace(self):self.assertFalse((ROOT.parents[2]/'src/agriculture.kwv').exists())

if __name__=='__main__':unittest.main()
