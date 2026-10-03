"""Check the separately recorded, newly observed original-checkout state; never rewrite old baseline."""
import json,hashlib,subprocess
from pathlib import Path
root=Path(__file__).resolve().parents[1]/'bootstrap'
b=json.loads((root/'preservation-baseline-observed.json').read_text());errors=[]
for r in b['files']:
 if hashlib.sha256(Path(r['path']).read_bytes()).hexdigest()!=r['sha256']:errors.append('Changed file '+r['path'])
for n,r in b['repositories'].items():
 p=Path(r['path']);g=['git','-c','safe.directory='+p.as_posix(),'-C',str(p)]
 for key,cmd in [('head',['rev-parse','HEAD']),('status',['status','--porcelain=v1'])]:
  if subprocess.check_output(g+cmd,text=True).strip()!=r[key]:errors.append('Changed '+n+' '+key)
original=Path(b['repositories']['imod']['path']);g=['git','-c','safe.directory='+original.as_posix(),'-C',str(original)]
master=subprocess.check_output(g+['rev-parse','master'],text=True).strip()
if master!='f8cba48615276c5852b72b9d88854353708f3d6d':errors.append('Observed master changed')
result=dict(scope='Newly observed bootstrap baseline only; earlier preservation failure remains recorded.',source_files=len(b['files']),repositories=3,master=master,errors=errors,status='PASS' if not errors else 'FAIL')
(root/'preservation-current-results.json').write_text(json.dumps(result,indent=2)+'\n')
print(json.dumps(result));raise SystemExit(bool(errors))
