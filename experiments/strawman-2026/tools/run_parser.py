"""Local Xtext syntax-only harness. Requires Java 21 and locally built language jars.

Use --languages PATH --maven PATH --report PATH SOURCE_DIR [SOURCE_DIR ...].
No Maven builds, source mutations, service calls or network access are performed.
Classpath discovery is a local fallback, not a supported production build recipe.
"""
from pathlib import Path
import argparse, subprocess, json, hashlib, tempfile, re

p=argparse.ArgumentParser()
p.add_argument('--languages',type=Path,required=True)
p.add_argument('--maven',type=Path,required=True)
p.add_argument('--report',type=Path,required=True)
p.add_argument('sources',nargs='+',type=Path)
a=p.parse_args()
jars={}
for group in ['org/eclipse','com/google','org/antlr','aopalliance','javax/inject','jakarta/inject','log4j','org/apache/logging','org/slf4j','org/ow2/asm']:
    for jar in sorted((a.maven/group).rglob('*.jar')):
        if any(x in jar.name for x in ['-sources','-javadoc','-tests','google-collections']): continue
        key=str(jar.parent.parent)
        if key not in jars or jar.parent.name>jars[key].parent.name: jars[key]=jar
# Xtext requires the historical Token.EOF_TOKEN contract.
antlr=a.maven/'org/antlr/antlr-runtime/3.2/antlr-runtime-3.2.jar'
if not antlr.exists(): raise SystemExit('Missing required local ANTLR runtime 3.2')
jars[str(antlr.parent.parent)]=antlr
cp=[a.languages/f'org.integratedmodelling.languages.{n}/target/org.integratedmodelling.languages.{n}-1.0.0-SNAPSHOT.jar' for n in ['worldview','observable']]+list(jars.values())
for jar in cp:
    if not jar.exists(): raise SystemExit('Missing '+str(jar))
manifest=[dict(path=str(jar),sha256=hashlib.sha256(jar.read_bytes()).hexdigest()) for jar in cp]
a.report.parent.mkdir(parents=True,exist_ok=True)
a.report.with_suffix('.classpath.json').write_text(json.dumps(manifest,indent=2),encoding='utf8')
java=Path(__file__).with_name('ParseWorldview.java')
with tempfile.TemporaryDirectory(prefix='worldview-parse-') as tmp:
    argfile=Path(tmp)/'java.args'
    argfile.write_text('--class-path\n"'+';'.join(x.as_posix() for x in cp)+'"\n"'+java.as_posix()+'"\n'+'\n'.join('"'+s.resolve().as_posix()+'"' for s in a.sources),encoding='utf8')
    result=subprocess.run(['java','@'+str(argfile)],capture_output=True,text=True)
    a.report.write_text(result.stdout+result.stderr,encoding='utf8')
    print(result.stdout[-1000:])
    if result.returncode: print(result.stderr[-2000:])
    raise SystemExit(result.returncode)
