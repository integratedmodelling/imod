"""Record research context and generate a loss-aware backend sample, never a command."""
import json,hashlib,subprocess,sys
from pathlib import Path
from dossier_consistency import retain_quality_analyses
packet=Path(__file__).resolve().parents[1];root=packet/'bootstrap';repo=packet.parents[1]
git=['git','-c','safe.directory='+repo.as_posix(),'-C',str(repo)]
head=subprocess.check_output(git+['rev-parse','HEAD'],text=True).strip()
generic={'imod:Subject','imod:Agent','imod:Process','imod:Event','imod:Relationship','imod:Quality','imod:Volume','imod:Length','imod:Area','imod:Mass','imod:Temperature','imod:Quantity','imod:Velocity'}
for p in ([] if '--projection-only' in sys.argv else root.glob('*/dossier.json')):
 d=json.loads(p.read_text(encoding='utf8'))
 imported=[]
 for item in d['imports']:
  item={'namespace':item} if isinstance(item,str) else item
  f=repo/'src'/str(item['namespace']+'.kwv')
  item['review_context_commit']=head
  if f.exists():item['review_context_sha256']=hashlib.sha256(f.read_bytes()).hexdigest()
  imported.append(item)
 d['imports']=imported
 for c in d['concepts']:
  c['alignment_role']='implicit_type_context_not_explicit_is' if c['parent'] in generic else 'proposed_scientific_specialization_requires_review'
  c['explicit_is_generation_allowed']=False
  c['alignment_gate']='Generic root aliases report keyword type context (context pack7.4), not redundant is. A meaningful narrower parent must be justified; absent distinctions are upstream issues. No automatic code generation.'
 d['validation']['human_approval']='none; source/ontology review outstanding'
 d['validation']['type_context_warning']='Reference existence and grammar acceptance do not establish scientific specialization.'
 p.write_text(json.dumps(d,indent=2,ensure_ascii=False)+'\n',encoding='utf8')
d=json.loads((root/'hydrology/dossier.json').read_text(encoding='utf8'))
kind={'subject':'SUBJECT','quality':'QUALITY','process':'PROCESS','relationship':'RELATIONSHIP','event':'EVENT','predicate':'ATTRIBUTE'}
projection={'evidence':[dict(id=s['id'],source=s.get('url') or s['title'],locator=s['locator'],excerpt=None) for s in d['sources']], 'concepts':[], 'questions':[], 'qualityAnalyses':[], 'unresolvedSemantics':d['ambiguities']+['Illustrative client BootstrapDossier projection only. No Candidate attachment identity/contextDigest, Command, server validation or approval.','All ancestry strings are unvalidated context claims. Generic root aliases are implicit type context, not executable is statements.','Evidence excerpts omitted: no verbatim source quotations supplied. Source scope/status remains in original research attachment.'], 'coverageShortfalls':d['coverage']['weaknesses']}
by_name={c['name']:c['id'] for c in d['concepts']}
def refs(names):
 result=[]
 for name in names:
  if name in by_name:result.append(by_name[name])
  else:projection['unresolvedSemantics'].append('Unmapped quality/binding reference: '+name+'; no stable ID minted.')
 return list(dict.fromkeys(result))
for c in d['concepts']:
 b=c['bindings']
 projection['concepts'].append(dict(id=c['id'],kind=kind[c['category']],expression=c['name'],derivedType=c['category']+' (reported, unvalidated)',ancestry=[c['parent']] if c['parent'] else [],evidenceIds=c['source_ids'],qualityIds=refs(c['qualities']+c['parameters']),affects=refs(b.get('affects',[])),creates=refs(b.get('creates',[])),confers=refs(b.get('confers',[])),sourceType=b.get('source'),targetType=b.get('target'),bindings=[json.dumps(b), 'Definition: '+c['definition'],'Status: '+c['status']+'; parent: '+c['parent_status']+'; '+c['alignment_role'],'Parameters: '+json.dumps(c['parameters']),'Positive: '+c['positive']+'; negative: '+c['negative']]))
for q in d['questions']:
 projection['questions'].append(dict(id=q['id'],text=q['text'],intent=q.get('expected_interpretation','Unreviewed author intent: '+q['positive']+'; distinguish '+q['negative']),evidenceIds=q['source_ids'],conceptIds=q['concept_ids'],observableExpressions=[q['expression']] if q['expression'] else [],invalidProbes=[q['negative']],gaps=q['dependencies']+['Intent is author interpretation, not human-reviewed.','Semantic status: '+q['semantic_status']+'; client grammar record: '+q['grammar_status']+' (not server validation)']))
for q in d['quality_summaries']:
 if q['quality'] not in by_name:
  projection['unresolvedSemantics'].append('Unmapped quality analysis retained in research dossier: '+json.dumps(q));continue
 qc=next(c for c in d['concepts'] if c['name']==q['quality'])
 projection['qualityAnalyses'].append(dict(qualityId=by_name[q['quality']],limitation=q['basis'],attributeIds=[],realmIds=[],orderingIds=[],boundaryOrComparison=q['comparison_rule'],valueStructure=q['value_structure'],contextAndScope=q['context']+'; overlap: '+q['overlap'],evidenceIds=qc['source_ids'],unknownRatherThanCategory=True))
retain_quality_analyses(projection,d['quality_summaries'],(root/'hydrology/dossier.json').read_bytes(),'hydrology/dossier.json')
projection['unresolvedSemantics'].append('Complete quality analyses, including proposed summary names and blocker/status fields, are retained losslessly above. The full research bytes are hash-bound locally; this is not a server attachment or completed four-artifact manifest. No predicate assets created.')
(root/'hydrology/backend-dossier.sample.json').write_text(json.dumps(projection,indent=2)+'\n',encoding='utf8',newline='\n')
context=[]
for f in [repo/'src/imod.kwv',Path('C:/Users/Ferd/git/klab-services/llm/DOMAIN_CONTEXT_PACK.md'),Path('C:/Users/Ferd/git/klab-languages/org.integratedmodelling.languages.observable/src/org/integratedmodelling/languages/Observable.xtext'),Path('C:/Users/Ferd/git/klab-languages/org.integratedmodelling.languages.worldview/src/org/integratedmodelling/languages/Worldview.xtext'),Path('C:/Users/Ferd/Documents/Codex/2026-10-03/task-7/backend/PROPOSAL_REVIEW_CONTRACT.md'),Path('C:/Users/Ferd/Documents/Codex/2026-10-03/task-7/backend/klab.core.api/src/main/java/org/integratedmodelling/klab/api/services/resources/workflow/ProposalReview.java')]:
 context.append(dict(path=str(f),sha256=hashlib.sha256(f.read_bytes()).hexdigest()))
backend=Path('C:/Users/Ferd/Documents/Codex/2026-10-03/task-7/backend')
for f in [backend/'DOSSIER_MAPPING.md',backend/'klab.core.api/src/main/java/org/integratedmodelling/klab/api/services/resources/workflow/BootstrapDossierValidator.java']:
 context.append(dict(path=str(f),sha256=hashlib.sha256(f.read_bytes()).hexdigest()))
backend_head=subprocess.check_output(['git','-c','safe.directory='+backend.as_posix(),'-C',str(backend),'rev-parse','HEAD'],text=True).strip()
(root/'review-context.json').write_text(json.dumps(dict(sandbox_start=head,backend_commit=backend_head,context_sources=context,note='Pinned inspected backend mapping; production acceptance remains blocked pending real validators and research manifest integration.'),indent=2)+'\n',encoding='utf8',newline='\n')
print('Frozen context for',len(list(root.glob('*/dossier.json'))),'dossiers; no approval granted')
