from pathlib import Path
import subprocess,shutil,json,hashlib
root=Path(__file__).resolve().parent
repo=root.parent/'chemical-alias-integration'
out=root/'chemical-alias-offline-r4-final';out.mkdir(exist_ok=False)
frozen=Path('C:/Users/Ferd/Documents/Codex/2026-10-20/task-2/relationship-axis-implementation')
args=(frozen/'world-check/run.args').read_text().splitlines();cp=args[args.index('"-cp"')+1].strip('"')
java=Path('C:/Users/Ferd/.jdks/temurin-21.0.12.1/bin')
classes=out/'classes';classes.mkdir()
capture=root.parent/'chemical-capture-r2/capture'
base='7c372b74a378a0b0cfb91962e87263018017d0ca'
def argfile(folder,name,items):
 p=folder/name;p.write_bytes(('\n'.join('"'+str(v).replace('\\','/')+'"' for v in items)).encode('utf-8'));return '@'+str(p)
with (out/'compile.log').open('w') as log:
 result=subprocess.run([str(java/'javac.exe'),argfile(out,'compile.args',['-proc:none','-encoding','UTF-8','-cp',cp,'-d',classes,root/'ChemicalAliasCombinedCheck.java'])],stdout=log,stderr=subprocess.STDOUT,timeout=90)
assert result.returncode==0,'Private driver compile failed; inspect compile.log'
for mode in ['baseline','candidate']:
 run=out/mode;run.mkdir();flat=run/'flat-source';flat.mkdir()
 for folder,pattern in [('src','*.kwv'),('strategies','*.obs')]:
  for p in (repo/folder).glob(pattern):
   data=subprocess.check_output(['git','-c','safe.directory='+repo.as_posix(),'show',base+':'+folder+'/'+p.name],cwd=repo) if mode=='baseline' else p.read_bytes()
   (flat/p.name).write_bytes(data)
 shutil.copyfile(frozen/'world-check/model-example.kim',run/'model-example.kim')
 (run/'water-candidate.flag').write_text('Shared environmental water assertions enabled')
 if mode=='candidate':(run/'alias-candidate.flag').write_text('Chemical alias assertions enabled')
 for d in ['tmp','home']:(run/d).mkdir()
 receipt={'actual_base':base,'mode':mode,'sources':{p.name:hashlib.sha256(p.read_bytes()).hexdigest() for p in flat.iterdir()},'private_driver_sha256':hashlib.sha256((root/'ChemicalAliasCombinedCheck.java').read_bytes()).hexdigest(),'classpath':cp,'capture':str(capture),'scope':'Frozen toolchain, owned captured providers; offline actual compiler/reasoner; no deployment or runtime detection claim'}
 (run/'RECEIPT.json').write_bytes((json.dumps(receipt,indent=2)+'\n').encode('utf-8'))
 with (run/'run.log').open('w') as log:
  result=subprocess.run([str(java/'java.exe'),argfile(run,'run.args',['-Djava.security.manager=allow','-Duser.home='+str(run/'home'),'-Djava.io.tmpdir='+str(run/'tmp'),'-cp',str(classes)+';'+cp,'org.integratedmodelling.klab.services.reasoner.internal.ChemicalAliasCombinedCheck',run,capture])],stdout=log,stderr=subprocess.STDOUT,timeout=360)
 print(mode+' exit '+str(result.returncode),flush=True)
 assert result.returncode==0,'Inspect '+str(run/'run.log')
 results=json.loads((run/'RESULTS.json').read_text(encoding='utf-8'))
 assert all(results['checks'].values()) and results['unsatisfiable']==[]
baseline=json.loads((out/'baseline/RESULTS.json').read_text(encoding='utf-8'));candidate=json.loads((out/'candidate/RESULTS.json').read_text(encoding='utf-8'))
assert baseline['diagnostics']==candidate['diagnostics']
print(json.dumps({'baseline_checks':len(baseline['checks']),'candidate_checks':len(candidate['checks']),'diagnostics_unchanged':True,'unsatisfiable':candidate['unsatisfiable']}))
