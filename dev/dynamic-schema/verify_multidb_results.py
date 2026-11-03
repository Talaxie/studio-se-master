#!/usr/bin/env python3
"""Verify synthetic Studio recipe CSV results, including exact numeric and temporal values."""
import argparse
import csv
from decimal import Decimal
import json
from pathlib import Path

p=argparse.ArgumentParser(description=__doc__)
p.add_argument('--fixtures',required=True,type=Path)
a=p.parse_args();base=a.fixtures.resolve()
manifest=json.loads((base/'jobs.json').read_text())
for record in manifest:
    name=record['name'];variant=record['variant'];db=record['database']
    with (Path(record.get('results_directory',base/'results'))/(name+'.csv')).open(encoding='utf-8',newline='') as stream:rows=list(csv.reader(stream,delimiter=';'))
    data=rows[1:];assert len(data)==(1 if variant in ['EXTRA','REJECT'] else 2),name
    if variant=='EXTRA':
        value=data[0]
        if db=='oracle':
            assert Decimal(value[1])==Decimal('123456789000'),name
            assert value[2]=='2026-11-03 12:34:56.0' and value[3:5]==['Été €','Obsèques €'],name
            assert value[5]=='2026-11-03T12:34:56.123456+05:30',name
        elif db=='mysql':
            assert value[1:3]==['18446744073709551615','-25:01:02.123456'],name
            assert json.loads(value[3])=={'é':'€'},name
        else:
            assert value[1:5]==['12:34:56.123456','12:34:56.123456+05:30','2026-11-03T07:04:56.123456Z','123e4567-e89b-12d3-a456-426614174000'],name
            assert json.loads(value[5])=={'é':'€'} and value[6]=='<a>€</a>',name
    else:
        assert data[0][0].strip()=='0007' and data[0][1].strip()=='202601',name
        if variant=='EMPTY':assert len(rows[0])==2,name
        else:
            assert len(rows[0])==7,name
            assert Decimal(data[0][2])==Decimal('1234567890123456789012345678.1234567890'),name
            assert data[0][3]=='' and data[0][4]=='Été €' and data[0][5]=='2026-11-03 12:34:56.123456',name
            if variant!='REJECT':assert data[1][2]=='' and Decimal(data[1][3])==0 and data[1][4]=='Obsèques',name
    print('PASS',name)
(base/'results-verification.json').write_text(json.dumps({'jobs_verified':len(manifest),'cases':manifest,'typed_binary_roundtrips':'Verified separately against real JDBC in live-runtime.log'},indent=2)+'\n')
