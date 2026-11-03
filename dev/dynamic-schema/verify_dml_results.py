#!/usr/bin/env python3
"""Assert decoded native-Run DML recipe outputs; connection credentials are never read."""
import argparse,csv,json
from decimal import Decimal
from pathlib import Path
p=argparse.ArgumentParser(description=__doc__);p.add_argument('--fixtures',required=True,type=Path);a=p.parse_args();base=a.fixtures
for job in json.loads((base/'jobs.json').read_text()):
 with (base/'results'/(job['name']+'.csv')).open(encoding='utf-8',newline='') as f:rows=list(csv.reader(f,delimiter=';'))
 empty=job['variant']=='empty';expected={'KEEP':('S1',Decimal(99),'legacy')}
 action=job['action']
 if action!='DELETE':expected['K1']=('S1',Decimal(99),'legacy') if action=='INSERT_IF_NOT_EXIST' or job['variant']=='nochange' else ('S1',None,'Été € final')
 if action not in ['UPDATE','DELETE'] and job['variant']!='reject':expected['K2']=('S1',Decimal(99),'legacy') if job['variant']=='nochange' else ('S1',Decimal('22.1234567890'),'Été €')
 assert rows[0]==(['AGENCE','MOIS'] if empty else ['AGENCE','MOIS','MONTANT','TEXTE']),(job['name'],'headers',rows[0])
 actual={r[0]:(r[1],None if empty or r[2]=='' else Decimal(r[2]),None if empty else r[3]) for r in rows[1:]}
 if empty:expected={k:(v[0],None,None) for k,v in expected.items()}
 assert len(rows)-1==len(actual),(job['name'],'duplicate keys')
 assert actual==expected,(job['name'],actual,expected)
 print('PASS',job['name'])
