"""Offline current-Services lineage fixture; requires existing compiled dependencies.

Extracts the exact declarations under test from this checkout. Generic Physical
ownership in the fixture isolates lineage from disciplinary authority/domain data.
The complete worldview still requires a separate authority-backed acceptance run.
"""
from pathlib import Path
import argparse, json, re, subprocess, xml.etree.ElementTree as ET

p=argparse.ArgumentParser(description=__doc__)
p.add_argument('--surefire-xml',type=Path,required=True)
p.add_argument('--resources-classes',type=Path,required=True)
p.add_argument('--mockito-agent',type=Path,required=True)
p.add_argument('--odo',type=Path,required=True)
p.add_argument('--output',type=Path,required=True)
a=p.parse_args()
here=Path(__file__).resolve().parent
repo=here.parents[1]
out=a.output.resolve();out.mkdir(parents=True,exist_ok=False)
classes=out/'classes';classes.mkdir()
flat=out/'flat-source';flat.mkdir()
for name in ['home','tmp']:(out/name).mkdir()
properties=ET.parse(a.surefire_xml).getroot().find('properties')
cp=next(x.attrib['value'] for x in properties if x.attrib['name']=='java.class.path')+';'+str(a.resources_classes.resolve())
source=(repo/'src/imod.kwv').read_text(encoding='utf8')
locator=re.search(r'"(https://[^" ]+/releases/0\.2\.1/odo\.owl)" as odo',source).group(1)
names={'imod':['Subject','Agent','CollectiveSubject','CollectiveAgent'],
       'life':['Individual','Assemblage','CollectiveAgent','SocialGroup','AnatomicalAssemblage','CellAssemblage'],
       'ecology':['Population','Community'],'society':['Organization']}
for ns,wanted in names.items():
    text=(repo/'src'/f'{ns}.kwv').read_text(encoding='utf8')
    preamble=(f'ontology imod version 1.0 in domain root with core "{locator}" as odo;\nabstract domain Physical is core odo:PhysicalDomain;\n'
              if ns=='imod' else f'ontology {ns} version 1.0 using imod'+(', life' if ns in ['ecology','society'] else '')+' in domain imod:Physical;\n')
    declarations=[]
    for name in wanted:
        found=re.findall(r'^(?:abstract )?(?:thing|agent) '+name+r'\b[^;]*;',text,re.M)
        if len(found)!=1:raise RuntimeError((ns,name,found))
        declarations.append(found[0])
    (flat/f'{ns}.kwv').write_bytes((preamble+'\n'.join(declarations)+'\n').encode('utf8'))
loader=out/'M49CompositionSourceLoader.java'
loader.write_bytes((here.parent/'elevation-bearer/M49CompositionSourceLoader.java').read_bytes().replace(
    b'if(worldview.getObservationStrategies().size()!=2)throw new AssertionError("Expected 2 strategy documents");',b''))
def argfile(name,items):
    path=out/name
    path.write_bytes(('\n'.join('"'+str(v).replace('\\','/')+'"' for v in items)+'\n').encode('utf8'))
    return '@'+str(path)
with (out/'compile.log').open('w') as log:
    subprocess.run(['javac',argfile('compile.args',['-proc:none','-encoding','UTF-8','-cp',cp,'-d',classes,here/'CollectiveLineageCheck.java',loader])],stdout=log,stderr=subprocess.STDOUT,check=True)
with (out/'run.log').open('w') as log:
    result=subprocess.run(['java',argfile('run.args',['-javaagent:'+str(a.mockito_agent.resolve()),'-Djava.security.manager=allow','-Duser.home='+str(out/'home'),'-Djava.io.tmpdir='+str(out/'tmp'),'-cp',str(classes)+';'+cp,'org.integratedmodelling.klab.services.reasoner.internal.CollectiveLineageCheck',out,out/'unused-authority-capture',a.odo.resolve(),'fixture'])],stdout=log,stderr=subprocess.STDOUT,timeout=180)
if (out/'RESULTS.json').exists():
    results=json.loads((out/'RESULTS.json').read_text(encoding='utf8'))
    print(json.dumps({'checks':len(results['checks']),'failed':[k for k,v in results['checks'].items() if not v], 'failure':results.get('failure')}))
raise SystemExit(result.returncode)
