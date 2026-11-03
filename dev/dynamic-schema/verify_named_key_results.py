#!/usr/bin/env python3
"""Assert exact four-engine named-key GUI recipe results, including partial-key non-matches."""
import argparse,csv,json
from decimal import Decimal
from pathlib import Path
p=argparse.ArgumentParser(description=__doc__);p.add_argument('--fixtures',required=True,type=Path);p.add_argument('--available',action='store_true');a=p.parse_args();base=a.fixtures
for job in json.loads((base/'jobs.json').read_text()):
 if a.available and not (base/'results'/(job['name']+'.csv')).exists():continue
 with (base/'results'/(job['name']+'.csv')).open(encoding='utf-8',newline='') as f:rows=list(csv.reader(f,delimiter=';'))
 expected={('KEEP','S1'):(Decimal(99),'legacy')};action=job['action']
 if job['mode']=='MIXED':expected[('K1','OTHER')]=(Decimal(99),'legacy')
 if action!='DELETE':expected[('K1','S1')]=(Decimal(99),'legacy') if action=='INSERT_IF_NOT_EXIST' or job['variant']=='nochange' else (None,'Été € final')
 if action not in ['UPDATE','DELETE'] and job['variant']!='reject':expected[('K2','S1')]=(Decimal(99),'legacy') if job['variant']=='nochange' else (Decimal('22.1234567890'),'Été €')
 assert rows[0]==['AGENCE','MOIS','MONTANT','TEXTE'],(job['name'],'headers',rows[0])
 actual={(r[0],r[1]):(None if r[2]=='' else Decimal(r[2]),r[3]) for r in rows[1:]}
 assert len(rows)-1==len(actual),(job['name'],'duplicate correspondence keys')
 assert actual==expected,(job['name'],actual,expected)
 print('PASS',job['name'])
