#!/usr/bin/env python3
"""Run 36 isolated JVMs sequentially; stop on a failed job or final-state check."""
from pathlib import Path
import csv,json,random,subprocess,os,platform,time,hashlib
ROOT=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/benchmark/multi_db_batch50000_20261031')
JAVA='/Users/hciaravolo/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java'
DATA=ROOT.parent/'data'

def main():
 m=json.loads((ROOT/'manifest.json').read_text());out=ROOT/'results';out.mkdir(exist_ok=True)
 assert not (out/'runs.csv').exists(),'Do not overwrite existing measurements'
 for p,digest in m['original_sources'].items():assert hashlib.sha256(Path(p).read_bytes()).hexdigest()==digest
 plan=[];rng=random.Random(42)
 for n in [10000,100000]:
  for db in ['PostgreSQL','MySQL','Oracle']:
   for action in ['INSERT','UPDATE','DELETE']:
    pair=[v for v in m['variants'] if v['database']==db and v['action']==action];rng.shuffle(pair)
    plan.extend(dict(v,rows=n) for v in pair)
 (out/'plan.json').write_text(json.dumps(plan,indent=2))
 (out/'environment.json').write_text(json.dumps(dict(platform=platform.platform(),java=subprocess.run([JAVA,'-version'],capture_output=True,text=True).stderr,scope=m['timing'],repetitions=1,warmups=0,batch_size=50000,seed=42),indent=2))
 with (out/'runs.csv').open('w',newline='') as f:
  w=csv.writer(f,delimiter=';');w.writerow(['database','action','mode','rows','batch_size','elapsed_ms','input_rows','rejected','final_rows','validated']);f.flush()
  for i,v in enumerate(plan,1):
   name=f'{i:02}_{v["database"]}_{v["action"]}_{v["mode"]}_{v["rows"]}'
   args=[JAVA,'-Xms256m','-Xmx2048m',f'-Dbench.rows={v["rows"]}',f'-Dbench.scenario={v["action"]}','-cp',v['classpath'],v['main'],'--context=Default']
   for k,value in dict(tableName=v['table'],inputFile=str(DATA/f'actor_{v["action"].lower()}_{v["rows"]}.csv'),batchSize=50000).items():args+=['--context_param',f'{k}={value}']
   print(f'[{i}/36] {name}',flush=True);start=time.monotonic()
   with (out/(name+'.log')).open('w') as log:
    child=subprocess.run(args,stdout=log,stderr=subprocess.STDOUT,timeout=3600)
   text=(out/(name+'.log')).read_text();records=[line for line in text.splitlines() if line.startswith('BENCH_RESULT;')]
   if child.returncode or len(records)!=1:raise SystemExit(f'Failed {name}: exit={child.returncode}. See run log.')
   parts=records[0].split(';')[1:];assert parts[-1]=='PASS' and int(parts[6])==v['rows'] and int(parts[7])==0
   w.writerow(parts);f.flush();print(f'  PASS {parts[5]} ms; total process/setup/validation {time.monotonic()-start:.1f}s',flush=True)
 print('All 36 cases validated.',flush=True)
if __name__=='__main__':main()
