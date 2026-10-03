"""Parse each saved question expression using the actual Observable grammar; do not resolve names."""
import base64, hashlib, json, subprocess, tempfile
from pathlib import Path
packet=Path(__file__).resolve().parents[1]
bootstrap=packet/'bootstrap'
manifest=json.loads((packet/'evidence/candidate-parser.classpath.json').read_text())
for item in manifest:
    path=Path(item['path'])
    if hashlib.sha256(path.read_bytes()).hexdigest()!=item['sha256']:
        raise SystemExit('Parser dependency hash changed: '+str(path))
rows=[]
for path in sorted(bootstrap.glob('*/dossier.json')):
    d=json.loads(path.read_text(encoding='utf8'))
    for q in d['questions']:
        if q.get('expression'):
            rows.append((d['domain']+'/'+q['id'],q['expression']))
question_count=len(rows)
probes=json.loads((bootstrap/'review-probes.json').read_text()) if (bootstrap/'review-probes.json').exists() else []
for probe in probes:rows.append(('review-'+probe['id'],probe['expression']))
controls=[('control-valid','presence of earth:WaterBody','PASS'),
          ('control-invalid-syntax','change in of ;','FAIL'),
          ('control-invalid-category','count of imod:Temperature','PASS'),
          ('control-missing-reference','missing:Nonexistent','PASS')]
for id,e,_ in controls:rows.append((id,e))
with tempfile.TemporaryDirectory(prefix='dossier-parser-') as tmp:
    tmp=Path(tmp)
    (tmp/'input.tsv').write_text('\n'.join(id+'\t'+base64.b64encode(e.encode()).decode() for id,e in rows),encoding='utf8')
    cp=';'.join(Path(x['path']).as_posix() for x in manifest)
    arg='--class-path\n"'+cp+'"\n"'+Path(__file__).with_name('ParseDossierQuestions.java').as_posix()+'"\n"'+(tmp/'input.tsv').as_posix()+'"\n'
    (tmp/'java.args').write_text(arg,encoding='utf8')
    result=subprocess.run(['java','@'+str(tmp/'java.args')],text=True,capture_output=True)
    if result.returncode:raise SystemExit(result.stdout+result.stderr)
parsed={}
for line in result.stdout.splitlines():
    f=line.split('\t',2)
    if len(f)>=2 and f[1] in ('PASS','FAIL'): parsed[f[0]]=dict(status=f[1],diagnostics=f[2] if len(f)>2 else '')
if set(parsed)!=set(id for id,_ in rows):raise SystemExit('Incomplete parser output')
for id,_,expected in controls:
    if parsed[id]['status']!=expected:raise SystemExit('Negative control failed: '+id)
report=dict(scope='Actual ObservableSequence grammar only; no name resolution, type/category validation, adaptation, reasoner or model execution.',
            grammar_source='klab-languages 8f5c29363f4362bddd13f9fdd4f43e7e2c9fb024; dependency hashes verified against candidate-parser.classpath.json',
            parser_source_sha256=hashlib.sha256(Path(__file__).with_name('ParseDossierQuestions.java').read_bytes()).hexdigest(),
            expressions=[dict(id=id,expression=e,sha256=hashlib.sha256(e.encode()).hexdigest(),**parsed[id]) for id,e in rows],
            controls='Invalid category and missing namespace intentionally parse: this proves parser acceptance is not semantic validity.')
(bootstrap/'question-parser-results.json').write_text(json.dumps(report,indent=2)+'\n',encoding='utf8')
for path in sorted(bootstrap.glob('*/dossier.json')):
    d=json.loads(path.read_text(encoding='utf8'))
    for q in d['questions']:
        key=d['domain']+'/'+q['id']
        if key in parsed:q['grammar_status']='parse_pass' if parsed[key]['status']=='PASS' else 'parse_fail'
    path.write_text(json.dumps(d,indent=2,ensure_ascii=False)+'\n',encoding='utf8')
fails=[id for id,_ in rows if not id.startswith('control-') and parsed[id]['status']=='FAIL']
print(json.dumps(dict(question_expressions=question_count,review_probe_components=len(probes),failed=fails,controls=4,scope=report['scope'])))
