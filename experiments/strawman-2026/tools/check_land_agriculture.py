"""Bounded ownership/reference invariants for the research boundary revision."""
import json,re
from pathlib import Path
ROOT=Path(__file__).resolve().parents[1]/'bootstrap'

def errors(dossiers,dispositions):
 result=[];cs=[c for d in dossiers for c in d['concepts']];qs=[q for d in dossiers for q in d['questions']]
 ids=[c['id'] for c in cs];names=[c['name'] if ':' in c['name'] else d['domain']+':'+c['name'] for d in dossiers for c in d['concepts']];qids=[q['id'] for q in qs]
 for label,values in [('concept ID',ids),('qualified name',names),('question ID',qids)]:
  if len(values)!=len(set(values)):result.append('Duplicate '+label)
 if len(dispositions['dispositions'])!=27:result.append('Missing original disposition')
 for x in dispositions['dispositions']:
  owners=[(d['domain'],c) for d in dossiers for c in d['concepts'] if c['id']==x['original_id']]
  if x['target_domain'] is None:
   if owners:result.append('Deferred primitive still counted: '+x['original_id'])
  elif len(owners)!=1 or owners[0][0]!=x['target_domain'] or owners[0][1]['name']!=x['target_name']:
   result.append('Lost or wrongly owned original ID: '+x['original_id'])
 for x in dispositions['question_dispositions']:
  owners=[d['domain'] for d in dossiers for q in d['questions'] if q['id']==x['id']]
  if owners!=[x['target_domain']]:result.append('Lost or duplicated original question: '+x['id'])
 retired={x['original_name'] for x in dispositions['dispositions'] if x['target_domain'] is None}
 moved={x['original_name'] for x in dispositions['dispositions'] if x['action']=='move_preserve_id'}
 for d in dossiers:
  if d['domain'] not in ['land','agriculture']:continue
  declared_imports={x['namespace'] for x in d['imports']}
  if d['domain']=='land' and 'agriculture' in declared_imports:result.append('Reverse agriculture dependency')
  for c in d['concepts']:
   # Provenance and explicit gaps legitimately retain old names; operative fields do not.
   fields={k:c.get(k) for k in ['name','parent','qualities','parameters','bindings']}
   refs=set(re.findall(r'\b[a-z]+:[A-Z]\w*',json.dumps(fields)))
   for ref in refs:
    if ref in retired|moved:result.append('Stale operative reference '+ref)
    ns=ref.split(':')[0]
    if ns!=d['domain'] and ns not in declared_imports:result.append('Undeclared research dependency '+ref)
   if c.get('explicit_is_generation_allowed') is not False:result.append('Unapproved code generation '+c['id'])
 return result

if __name__=='__main__':
 ds=[json.loads(p.read_text(encoding='utf8')) for p in sorted(ROOT.glob('*/dossier.json'))]
 failures=errors(ds,json.loads((ROOT/'land-agriculture-dispositions.json').read_text()))
 print(json.dumps({'errors':failures,'status':'FAIL' if failures else 'PASS','scope':'Research ownership and reference checks, not type/reasoner validation'}))
 raise SystemExit(bool(failures))
