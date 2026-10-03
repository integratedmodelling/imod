"""Bounded research consistency rules, not a parser, type checker or Reasoner.

Operator result categories follow DOMAIN_CONTEXT_PACK.md section 6, conditional on a
valid operand. Simple named heads use proposed dossier categories; this does not
validate their ancestry, bearer or scientific meaning.
"""
import json,re,hashlib

OPERATORS=[('change rate of ','quality'),('change in ','process'),('changed ','event'),
 ('presence of ','quality'),('count of ','quality'),('occurrence of ','quality'),
 ('distance to ','quality'),('distance from ','quality'),('probability of ','quality'),
 ('uncertainty of ','quality'),('magnitude of ','quality'),('level of ','quality'),
 ('type of ','quality'),('proportion ','quality'),('percentage ','quality'),
 ('ratio of ','quality'),('monetary value of ','quality'),('value of ','quality')]

def registry(dossiers):
 # Explicitly inspected imported declarations, not an inferred ontology closure:
 # src/imod.kwv Volume/Mass/Temperature and src/earth.kwv RainfallVolume.
 result={'imod:Volume':'quality','imod:Mass':'quality','imod:Temperature':'quality','earth:RainfallVolume':'quality'}
 for d in dossiers:
  for c in d['concepts']:
   name=c['name'] if ':' in c['name'] else d['domain']+':'+c['name']
   result[name]=c['category']
 return result

def result_category(expression, concepts):
 if not expression:return None,'no formulation'
 for prefix,category in OPERATORS:
  if expression.startswith(prefix):return category,'context-pack section6; conditional on valid operand, operand not validated'
 match=re.match(r'^([a-z][\w.]*:[A-Z]\w*)(?=\s|$)',expression)
 if match:
  category=concepts.get(match.group(1))
  if category and category!='predicate':return category,'proposed named-head category only; no semantic validation'
 return None,'unresolved by bounded rule; requires explicit type review'

def category_errors(dossiers):
 index=registry(dossiers);errors=[]
 for d in dossiers:
  for q in d['questions']:
   category,_=result_category(q.get('expression'),index)
   if q.get('expression_result_category')!=category:errors.append(q['id']+': expression category mismatch')
   if category and q['expected_type']!=category:errors.append(q['id']+': expected_type alias mismatch')
 return errors

ANALYSIS_PREFIX='Complete research quality analysis: '
ARTIFACT_PREFIX='Immutable full research artifact binding: '

def retain_quality_analyses(projection, analyses, artifact_bytes, relative_path):
 """Lossless sidecar strings within existing DTO fields; no backend redesign."""
 for ordinal,analysis in enumerate(analyses):
  projection['unresolvedSemantics'].append(ANALYSIS_PREFIX+json.dumps({'ordinal':ordinal,'analysis':analysis},ensure_ascii=False,sort_keys=True))
 projection['unresolvedSemantics'].append(ARTIFACT_PREFIX+json.dumps({'path':relative_path,'sha256':hashlib.sha256(artifact_bytes).hexdigest(),'size_bytes':len(artifact_bytes),'status':'local immutable byte binding only; not a server attachment or four-artifact manifest'},sort_keys=True))

def quality_roundtrip_errors(projection, analyses, artifact_bytes):
 saved=[json.loads(s[len(ANALYSIS_PREFIX):]) for s in projection['unresolvedSemantics'] if s.startswith(ANALYSIS_PREFIX)]
 errors=[]
 if saved!=[{'ordinal':i,'analysis':a} for i,a in enumerate(analyses)]:errors.append('Quality analysis round-trip lost fields/order/blockers')
 bindings=[json.loads(s[len(ARTIFACT_PREFIX):]) for s in projection['unresolvedSemantics'] if s.startswith(ARTIFACT_PREFIX)]
 if len(bindings)!=1 or bindings[0]['sha256']!=hashlib.sha256(artifact_bytes).hexdigest():errors.append('Full research artifact byte binding mismatch')
 return errors

def predicate_evidence_errors(dossier):
 errors=[];sources={s['id']:s for s in dossier['sources']}
 for a in dossier['quality_summaries']:
  ids=a.get('source_ids',[])
  for sid in ids:
   if sid not in sources:errors.append('Unknown predicate evidence '+sid)
  # A named authority in the predicate's own claim must be cited directly.
  claim=' '.join(str(a.get(k,'')) for k in ['basis','comparison_rule','proposed_summary','boundary_rule'])
  for sid in sources:
   if sid.startswith('FAO-') and sid in claim and sid not in ids:errors.append('Missing predicate-specific source '+sid)
  for e in a.get('claim_evidence',[]):
   if e.get('source_id') not in ids:errors.append('Claim source absent from predicate source_ids')
   if not e.get('locator') or not e.get('scope'):errors.append('Incomplete predicate claim locator/scope')
 return errors
