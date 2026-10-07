"""Verify this revision's observed external baseline without recapturing it."""
from pathlib import Path
import json,hashlib,subprocess
root=Path(__file__).resolve().parents[1]/'bootstrap'
baseline=json.loads((root/'land-agriculture-preservation.json').read_text())
def git(path,*args):
 path=Path(path);return subprocess.check_output(['git','-c','safe.directory='+path.as_posix(),'-C',str(path),*args])
errors=[]
for x in baseline['files']:
 if hashlib.sha256(Path(x['path']).read_bytes()).hexdigest()!=x['sha256']:errors.append('Changed source: '+x['path'])
for n,x in baseline['repositories'].items():
 for key,cmd in [('head',['rev-parse','HEAD']),('status',['status','--porcelain=v1'])]:
  if git(x['path'],*cmd).decode().strip()!=x[key]:errors.append('Changed '+n+' '+key)
if git(baseline['repositories']['imod']['path'],'rev-parse','master').decode().strip()!=baseline['master']:errors.append('Changed master')
for f,digest in baseline['protected_staging']['files'].items():
 if hashlib.sha256(git(baseline['protected_staging']['worktree'],'show',':'+f)).hexdigest()!=digest:errors.append('Changed staged bytes: '+f)
print(json.dumps(dict(status='FAIL' if errors else 'PASS',errors=errors,source_files=len(baseline['files']),repositories=len(baseline['repositories']),protected_staged_files=len(baseline['protected_staging']['files']),master=baseline['master'])))
raise SystemExit(bool(errors))
