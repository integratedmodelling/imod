"""Replay using existing compiled services and frozen authority bytes; no downloads."""
import argparse
import json
import pathlib
import shutil
import subprocess
import xml.etree.ElementTree as ET

p = argparse.ArgumentParser(description=__doc__)
p.add_argument('--surefire-xml', type=pathlib.Path, required=True,
               help='Existing services-validation resources Surefire XML with java.class.path')
p.add_argument('--capture', type=pathlib.Path, required=True)
p.add_argument('--basic', type=pathlib.Path, required=True, help='Original staging basic.kim, read only')
p.add_argument('--output', type=pathlib.Path, required=True, help='New private output directory')
p.add_argument('--worldview', type=pathlib.Path, default=pathlib.Path(__file__).resolve().parents[2])
a = p.parse_args()
a.output = a.output.resolve()
if a.output.is_relative_to(a.worldview.resolve()):
    p.error('--output must be outside the worldview source tree')
a.output.mkdir(parents=True, exist_ok=False)
classes = a.output / 'classes'
classes.mkdir()
source = a.output / 'source'
source.mkdir()
for pattern in ('*.kwv', '*.obs'):
    for item in a.worldview.rglob(pattern):
        target = source / item.name
        if target.exists():
            raise RuntimeError('Duplicate source basename: ' + item.name)
        shutil.copyfile(item, target)
properties = ET.parse(a.surefire_xml).getroot().find('properties')
classpath = next(x.attrib['value'] for x in properties if x.attrib['name'] == 'java.class.path')
here = pathlib.Path(__file__).resolve().parent
def argfile(name, values):
    path = a.output / name
    path.write_text('\n'.join(json.dumps(str(v)) for v in values) + '\n', encoding='utf-8')
    return '@' + str(path)
compile_args = argfile('compile.args', ['-cp', classpath, '-d', classes,
    *[here / name for name in ('ProviderSnapshotRecheck.java', 'M49CompositionSourceLoader.java', 'M49FixtureAudit.java')]])
subprocess.run(['javac', compile_args], check=True)
home, tmp = a.output / 'home', a.output / 'tmp'
home.mkdir()
tmp.mkdir()
run_args = argfile('run.args', ['-Djava.security.manager=allow', '-Duser.home=' + str(home),
    '-Djava.io.tmpdir=' + str(tmp), '-cp', str(classes) + ';' + classpath,
    'org.integratedmodelling.klab.services.reasoner.internal.ProviderSnapshotRecheck',
    a.output / 'result', a.capture.resolve(), source, a.basic.resolve(), 'corrected'])
subprocess.run(['java', run_args], check=True)
