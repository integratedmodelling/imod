"""Structural documentation checks, not scientific review."""
from pathlib import Path
import json
import re

packet = Path(__file__).resolve().parents[1]
repo = packet.parents[1]
domains = ({p.stem for p in (repo/'src').glob('*.kwv')} - {'imod','calendar','data'}) | {x['namespace'] for x in json.loads((packet/'bootstrap/domain-index.json').read_text(encoding='utf8'))['domains']}
parts = re.split(r'^## ([a-z]+)\s*$', (packet/'DOMAIN_CANDIDATES.md').read_text(encoding='utf8'), flags=re.M)
sections = dict(zip(parts[1::2], parts[2::2]))
if set(sections) != domains:
    raise ValueError('Candidate sections do not match provisional domain addresses')
counts = {}
for domain, section in sections.items():
    rows = [line for line in section.splitlines() if line.startswith('| **')]
    if len(rows) < 2:
        raise ValueError('Fewer than two candidate records: '+domain)
    for row in rows:
        cells = row.strip('|').split('|')
        if len(cells) != 4 or not all(cell.strip() for cell in cells):
            raise ValueError('Incomplete candidate record: '+domain)
        if not re.search(r'[\-—] [PB]:\*\*', row):
            raise ValueError('Missing provisional/blocked status: '+domain)
    counts[domain] = len(rows)


def slug(text):
    return re.sub(r'[^\w\- ]', '', text.lower()).replace(' ', '-')


checked = 0
for path in [repo/'DECISIONS.md', *packet.rglob('*.md')]:
    for target in re.findall(r'\]\(([^)]+)\)', path.read_text(encoding='utf8')):
        if re.match(r'https?://', target):
            continue
        relative, _, anchor = target.partition('#')
        destination = path.parent/relative if relative else path
        if not destination.is_file():
            raise ValueError(f'Missing local link: {path}: {target}')
        if anchor and destination.suffix == '.md':
            anchors = {slug(x.strip()) for x in re.findall(r'^#+ (.+)$', destination.read_text(encoding='utf8'), re.M)}
            if anchor not in anchors:
                raise ValueError(f'Missing local anchor: {path}: {target}')
        checked += 1
result = dict(domain_addresses=len(domains),candidate_records=sum(counts.values()),records_per_domain=counts,local_links_checked=checked,status='PASS',scope='Structural checks only; no scientific completeness or acceptance inferred')
(packet/'evidence/documentation-check.json').write_text(json.dumps(result,indent=2),encoding='utf8')
print(json.dumps(result))
