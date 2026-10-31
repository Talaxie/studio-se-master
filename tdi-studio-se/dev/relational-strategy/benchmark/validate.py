#!/usr/bin/env python3
"""Validate benchmark fixtures/native jobs and compile embedded Java without running SQL."""
from pathlib import Path
import csv,json,subprocess,tempfile,xml.etree.ElementTree as E
OUT=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/benchmark')
manifest=json.loads((OUT/'manifest.json').read_text())
assert len(manifest)==11
for count in [10000,100000]:
 for scenario in ['INSERT','UPDATE','DELETE','UPSERT']:
  rows=list(csv.DictReader((OUT/'data'/f'actor_{scenario.lower()}_{count}.csv').open(),delimiter=';'))
  assert len(rows)==count and list(rows[0])==['actor_id','first_name','last_name','last_update','updateStrategy']
  assert [int(r['actor_id']) for r in rows]==list(range(1,count+1))
  state={} if scenario=='INSERT' else {i:('SEED','BEFORE') for i in range(1,(count//2 if scenario=='UPSERT' else count)+1)}
  for r in rows:
   i=int(r['actor_id']);assert r['updateStrategy']==scenario
   assert r['first_name']==f'F{i:06}' and r['last_name']==f'L{i:06}'
   if scenario=='INSERT':assert i not in state
   if scenario in ['UPDATE','DELETE']:assert i in state
   if scenario=='DELETE':del state[i]
   else:state[i]=(r['first_name'],r['last_name'])
  assert len(state)==(0 if scenario=='DELETE' else count)
  assert all(v==(f'F{i:06}',f'L{i:06}') for i,v in state.items())
props_ids=set();java=[]
for item in manifest:
 label=item['job'];path=OUT/'native/TEST/process/RelationalBenchmark'/f'{label}_0.1.item'
 r=E.parse(path).getroot();nodes={next(p.get('value') for p in n.findall('elementParameter') if p.get('name')=='UNIQUE_NAME'):n for n in r.findall('node')}
 assert len(nodes)==9
 out=nodes['tDBOutput_1'];params={p.get('name'):p.get('value') for p in out.findall('elementParameter')}
 assert params['TABLE']=='"BENCH_RS_ACTORS"' and params['TABLE_ACTION']=='NONE'
 assert params['USE_BATCH_SIZE']==('true' if item['mode']=='classic_batch' else 'false')
 assert params['COMMIT_EVERY']=='context.commitEvery' and params['BATCH_SIZE']=='context.batchSize'
 assert params['DIE_ON_ERROR']=='true'
 flow=out.find("metadata[@connector='FLOW']")
 assert [c.get('name') for c in flow.findall('column') if c.get('key')=='true']==['actor_id']
 assert ('updateStrategy' in [c.get('name') for c in flow.findall('column')])==(item['mode']=='strategy')
 connections=r.findall('connection')
 assert len(connections)==8
 for c in connections:assert c.get('source') in nodes and c.get('target') in nodes
 # Timers bracket the input pipeline; SQL preparation/verification are outside it.
 edges={(c.get('source'),c.get('target')) for c in connections}
 assert ('tMSSqlRow_prepare','tJava_start') in edges and ('tFileInputDelimited_1','tJava_stop') in edges
 assert ('tJava_stop','tMSSqlRow_verify') in edges and ('tMSSqlRow_verify','tJava_report') in edges
 for name,n in nodes.items():
  p={p.get('name'):p.get('value') for p in n.findall('elementParameter')}
  if n.get('componentName')=='tJava':java.append(f'void check{len(java)}() throws Exception {{\n'+p['CODE']+'\n}')
  if n.get('componentName')=='tMSSqlRow':java.append(f'String check{len(java)}() {{return '+p['QUERY']+';}')
 prop=E.parse(path.with_suffix('.properties')).getroot()
 for e in prop.iter():
  if e.tag.endswith('Property'):
   assert e.get('id') not in props_ids;props_ids.add(e.get('id'))
  if e.tag.endswith('author'):assert (path.parent/e.get('href').split('#')[0]).resolve().is_file()
with tempfile.TemporaryDirectory(prefix='talaxie-benchmark-java-') as tmp:
 path=Path(tmp)/'BenchmarkSnippets.java'
 path.write_text('''import java.util.*;
class BenchmarkSnippets {
 static class C { int rowCount=10000,batchSize=1000,commitEvery=10000,iteration=1; boolean warmup=true; String benchmarkDir=""; }
 C context=new C(); Map<String,Object> globalMap=new HashMap<>();
'''+ '\n'.join(java)+'\n}')
 subprocess.run(['javac','-proc:none',str(path)],check=True)
print('PASS: 8 fixtures, 11 native jobs, shared inputs/settings/keys, reset/timing/validation order, unique ids and embedded Java compilation; no SQL executed.')
