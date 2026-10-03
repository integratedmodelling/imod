"""Recheck original source bytes and Git states against this packet's baseline."""
from pathlib import Path
import json,hashlib,subprocess
root=Path(__file__).resolve().parents[1]
evidence=root/'evidence'
baseline=json.loads((evidence/'baseline.json').read_text())
records=json.loads((evidence/'source-inventory.json').read_text())
errors=[]
for r in records:
    path=Path(baseline[r['repository']]['path'])/r['path']
    if hashlib.sha256(path.read_bytes()).hexdigest()!=r['sha256']:
        errors.append('Source changed since capture: '+str(path))
for name in ['imod','im','im.aries']:
    entry=baseline[name]; path=Path(entry['path'])
    def git(*args):
        return subprocess.check_output(['git','-c','safe.directory='+path.as_posix(),'-C',str(path),*args]).decode().strip()
    if git('rev-parse','HEAD')!=entry['head']:errors.append(name+' HEAD changed')
    if git('status','--porcelain=v1')!=entry['status'].strip():errors.append(name+' status changed')
result=dict(checked_source_files=len(records),repositories_checked=['imod','im','im.aries'],errors=errors,pass_=not errors)
(evidence/'preservation-check.json').write_text(json.dumps(result,indent=2),encoding='utf8')
print(json.dumps(result))
raise SystemExit(1 if errors else 0)
