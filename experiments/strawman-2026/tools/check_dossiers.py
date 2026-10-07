"""Research structure, references, incidence and dependency DAG only; not semantic approval."""
import json, hashlib, re, argparse
from pathlib import Path
from jsonschema import Draft202012Validator
from dossier_consistency import category_errors,predicate_evidence_errors
root=Path(__file__).resolve().parents[1]/'bootstrap'
schema=json.loads((root/'dossier.schema.json').read_text())
ap=argparse.ArgumentParser();ap.add_argument('--partial',action='store_true');args=ap.parse_args()
expected={x['namespace'] for x in json.loads((root/'domain-index.json').read_text(encoding='utf8'))['domains']}
paths=sorted(root.glob('*/dossier.json')); errors=[]; reports=[];graph={}; all_names=set(); all_ids=set()
all_dossiers=[json.loads(p.read_text(encoding='utf8')) for p in paths]
errors.extend(category_errors(all_dossiers))
for p in paths:
 d=json.loads(p.read_text(encoding='utf8'));all_names.update(c['name'] for c in d['concepts']);all_ids.update(c['id'] for c in d['concepts'])
for p in paths:
 d=json.loads(p.read_text(encoding='utf8'));ns=d['domain']
 errors.extend(ns+': '+e for e in predicate_evidence_errors(d))
 for e in Draft202012Validator(schema).iter_errors(d):errors.append(ns+': '+str(list(e.path))+' '+e.message)
 source_ids={s['id'] for s in d['sources']}; concepts={c['id']:c for c in d['concepts']}
 if len(source_ids)!=len(d['sources']) or len(concepts)!=len(d['concepts']):errors.append(ns+': duplicate source/concept ids')
 if len({q['id'] for q in d['questions']})!=len(d['questions']):errors.append(ns+': duplicate question ids')
 if len({q['text'] for q in d['questions']})!=len(d['questions']):errors.append(ns+': repeated narrative question')
 incidence={k:[] for k in concepts}; orphan=[]
 for record in [*d['concepts'],*d['questions']]:
  if not set(record['source_ids'])<=source_ids:errors.append(ns+': dangling source '+record['id'])
 for q in d['questions']:
  for cid in q['concept_ids']:
   if cid not in concepts:errors.append(ns+': missing question concept '+cid)
   else:incidence[cid].append(q['id'])
  if not q.get('expression') and not q.get('dependencies'):errors.append(ns+': unexplained expression gap '+q['id'])
 for q in d['questions']:
  for ref in q.get('external_concept_refs',[]):
   target=next((other for other in all_dossiers if other['domain']==ref['domain']),None)
   if target is None or ref['id'] not in {c['id'] for c in target['concepts']}:errors.append(ns+': missing external question reference '+ref['id'])
 imports=[x if isinstance(x,str) else x['namespace'] for x in d['imports']]
 graph[ns]=[x for x in imports if x in expected and x!=ns]
 if ns in imports:errors.append(ns+': self-import')
 counts={cat:sum(c['category']==cat for c in d['concepts']) for cat in ['subject','quality','process','relationship','event','predicate']}
 blocked=sum('block' in str(c.get('status','')).lower() or c.get('parent_status')=='blocked' for c in d['concepts'])
 targets={c:max(0,5-counts[c]) for c in ['subject','process','relationship','event']}
 reports.append(dict(domain=ns,counts=counts,category_target_shortfalls=targets,all_four_category_targets_met=not any(targets.values()),questions=len(d['questions']),expressions=sum(bool(q.get('expression')) for q in d['questions']),insufficient_components=sum(len(q.get('components',[])) for q in d['questions']),blocked_candidates=blocked,review_ready_candidates=0,incidence=incidence,unused_candidates=[k for k,v in incidence.items() if not v],sha256=hashlib.sha256(p.read_bytes()).hexdigest()))
seen=set();active=set()
def visit(n):
 if n in active:errors.append('Dependency cycle at '+n);return
 if n in seen:return
 active.add(n)
 for x in graph.get(n,[]):visit(x)
 active.remove(n);seen.add(n)
for n in graph:visit(n)
if not args.partial and set(graph)!=expected:errors.append('Retained domain set mismatch: '+str(expected.symmetric_difference(graph)))
report=dict(scope='Local research schema/reference/incidence/DAG checks only. Ready count zero: no human semantic approval or full validation.',domains=len(reports),concepts=sum(sum(r['counts'].values()) for r in reports),questions=sum(r['questions'] for r in reports),expressions=sum(r['expressions'] for r in reports),errors=errors,dependency_graph=graph,dossiers=reports)
report['domains_meeting_all_four_targets']=[r['domain'] for r in reports if r['all_four_category_targets_met']]
report['domains_with_shortfalls']=[r['domain'] for r in reports if not r['all_four_category_targets_met']]
report['question_count_limit']=f"{report['questions']} research slots include scientific questions, methodological probes and counterexamples; not {report['questions']} answerable scientific questions. Non-null expression does not imply sufficient formulation."
(root/'coverage-validation.json').write_text(json.dumps(report,indent=2)+'\n',encoding='utf8',newline='\n')
lines=['# Initial research coverage dashboard','',f"{len(report['domains_meeting_all_four_targets'])} of {len(reports)} domains meet all four five-record targets; {len(report['domains_with_shortfalls'])} have principled shortfalls. These are explored records, not accepted concepts. No padding is used.",'',report['question_count_limit'],'','| Domain | Subjects | Processes | Relationships | Events | Targets |','|---|---:|---:|---:|---:|---|']
for r in reports:lines.append('| '+r['domain']+' | '+' | '.join(str(r['counts'][c]) for c in ['subject','process','relationship','event'])+' | '+('counts met' if r['all_four_category_targets_met'] else 'shortfall: '+', '.join(k+' '+str(v) for k,v in r['category_target_shortfalls'].items() if v))+' |')
lines+=['',f"{report['expressions']} question slots retain draft expressions; {report['questions']-report['expressions']} have full-formulation gaps. Additional component expressions are explicitly insufficient for their full narratives; see the parser report. Zero concepts are approved. See per-domain evidence and blockers; quantities above do not measure scientific breadth or readiness."]
(root/'COVERAGE_DASHBOARD.md').write_text('\n'.join(lines)+'\n',encoding='utf8',newline='\n')
print(json.dumps({k:v for k,v in report.items() if k not in ['dossiers','dependency_graph']}))
raise SystemExit(bool(errors))
