"""Static overlay checks only; regex is not a replacement for Xtext or Reasoner."""
from pathlib import Path
import re,json
packet=Path(__file__).resolve().parents[1]
repo=packet.parents[1]
def clean(text):
    return re.sub(r'/\*.*?\*/|//[^\n]*|"(?:\\.|[^"\\])*"','',text,flags=re.S)
base={p.relative_to(repo/'src').as_posix():p for p in (repo/'src').rglob('*.kwv')}
overlay=dict(base)
overlay.update({p.relative_to(packet/'candidate/src').as_posix():p for p in (packet/'candidate/src').rglob('*.kwv')})
names={};imports={}
for name,p in overlay.items():
    s=clean(p.read_text(encoding='utf8'))
    ns=re.search(r'\bontology\s+([\w.]+)',s)[1]
    assert ns not in names, f'Duplicate namespace: {ns}'
    names[ns]=name
    m=re.search(r'\busing\s+([\w.]+(?:\s*,\s*[\w.]+)*)',s)
    imports[ns]=re.findall(r'[\w.]+',m[1]) if m else []
for ns,deps in imports.items():
    assert all(d in names for d in deps), (ns,'unresolved namespace import',deps)
seen=set();active=set()
def visit(n):
    assert n not in active, 'Import cycle at '+n
    if n in seen:return
    active.add(n)
    for d in imports[n]:visit(d)
    active.remove(n);seen.add(n)
for n in names:visit(n)
alias=clean((packet/'candidate/src/jargon/hydrology.terms.kwv').read_text())
assert re.search(r'thing\s+Watershed\s+equals\s+hydrology:SurfaceCatchment\s*;',alias)
assert not re.search(r'\b(is|affects|creates|implies|inherits|children|emerges)\b',alias)
assert 'hydrology.terms' not in imports['hydrology']
assert len(overlay)==len(base)+1
print(f'PASS {len(overlay)} unique overlay namespaces; imports exist and are acyclic; alias-only convention; canonical domain does not import jargon.')
print('No symbol resolution, adaptation, discovery/load, or semantic reasoning performed.')
