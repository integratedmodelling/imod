"""Offline full-world cycle contract replay, using an owned authority capture."""
from pathlib import Path
import argparse, hashlib, json, re, shutil, subprocess, xml.etree.ElementTree as ET

p=argparse.ArgumentParser(description=__doc__)
p.add_argument('--surefire-xml',type=Path,required=True)
p.add_argument('--owned-capture',type=Path,required=True)
p.add_argument('--odo',type=Path,required=True)
p.add_argument('--mockito-agent',type=Path,required=True)
p.add_argument('--output',type=Path,required=True)
p.add_argument('--without-extents',action='store_true',help='Comment only the two root aliases in the private replay source')
a=p.parse_args()
here=Path(__file__).resolve().parent
repo=here.parents[1]
out=a.output.resolve();out.mkdir(parents=True,exist_ok=False)
classes=out/'classes';classes.mkdir()
props=ET.parse(a.surefire_xml).getroot().find('properties')
cp=next(v.attrib['value'] for v in props if v.attrib['name']=='java.class.path')
adapter=repo/'docs/reviews/collective-lineage-20261106/followup/AuthorityCaptureCompatibility.java'
loader=repo/'tests/elevation-bearer/M49CompositionSourceLoader.java'
driver=here/'CycleWorldCheck.java'
def argfile(name,values):
    path=out/name
    path.write_bytes(('\n'.join('"'+str(v).replace('\\','/')+'"' for v in values)+'\n').encode())
    return '@'+str(path)
with (out/'compile.log').open('w') as log:
    subprocess.run(['javac',argfile('compile.args',['-proc:none','-encoding','UTF-8','-cp',cp,'-d',classes,driver,adapter,loader])],stdout=log,stderr=subprocess.STDOUT,check=True)
flat=out/'flat-source';flat.mkdir()
for folder,pattern in [('src','*.kwv'),('strategies','*.obs')]:
    for source in (repo/folder).glob(pattern):shutil.copyfile(source,flat/source.name)
if a.without_extents:
    source=flat/'imod.kwv'
    text=source.read_text(encoding='utf8')
    text,count=re.subn(r'(?m)^\s*abstract extent (?:Time|Space)\b[^;]*;',lambda m:'\n/* Disabled root extent alias for isolated compatibility replay.\n'+m.group(0)+'\n*/',text)
    assert count==2,count
    source.write_bytes(text.encode('utf8'))
for name in ['home','tmp']:(out/name).mkdir()
provenance={'classpathXml':str(a.surefire_xml.resolve()),'sourceHashes':{f.name:hashlib.sha256(f.read_bytes()).hexdigest() for f in flat.iterdir()},'driverSha256':hashlib.sha256(driver.read_bytes()).hexdigest(),'odoSha256':hashlib.sha256(a.odo.read_bytes()).hexdigest(),'limitation':'Audited legacy authority capture reader; native persistent catalogue roundtrip remains unverified.'}
(out/'PROVENANCE.json').write_bytes(json.dumps(provenance,indent=2).encode())
with (out/'run.log').open('w') as log:
    result=subprocess.run(['java',argfile('run.args',['-javaagent:'+str(a.mockito_agent.resolve()),'-Djava.security.manager=allow','-Duser.home='+str(out/'home'),'-Djava.io.tmpdir='+str(out/'tmp'),'-cp',str(classes)+';'+cp,'org.integratedmodelling.klab.services.reasoner.internal.CycleWorldCheck',out,a.owned_capture.resolve(),a.odo.resolve(),'candidate'])],stdout=log,stderr=subprocess.STDOUT,timeout=300)
if (out/'RESULTS.json').exists():
    r=json.loads((out/'RESULTS.json').read_text())
    print(json.dumps({'checks':len(r['checks']),'failed':[k for k,v in r['checks'].items() if not v],'failure':r.get('failure'),'diagnostics':r.get('diagnostics')}))
raise SystemExit(result.returncode)
