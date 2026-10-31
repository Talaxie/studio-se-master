#!/usr/bin/env python3
"""Summarize measured, validated benchmark logs; exclude warmups and reject mixed settings."""
import argparse,csv,statistics
from collections import defaultdict
from pathlib import Path

def summarize(rows):
 groups=defaultdict(list)
 for r in rows:
  if r['warmup'].lower()=='true':continue
  if r['validated'].lower()!='true' or float(r['rejected'] or 0)!=0:raise ValueError('Unvalidated or rejected run in results')
  if int(r['input_rows'])!=int(r['rows']):raise ValueError('Incomplete input stream')
  ms=float(r['elapsed_ms'])
  if ms<=0:raise ValueError('Non-positive elapsed time')
  key=(r['scenario'],int(r['rows']),r['mode'],int(r['commit_every']),int(r['batch_size']))
  groups[key].append(ms)
 output=[]
 for key,times in sorted(groups.items()):
  scenario,n,mode,commit,batch=key;median=statistics.median(times)
  output.append(dict(scenario=scenario,rows=n,mode=mode,batch_size=batch,commit_every=commit,runs=len(times),min_ms=round(min(times),3),median_ms=round(median,3),max_ms=round(max(times),3),rows_per_second=round(n*1000/median,3),speedup_vs_classic_row=''))
 for r in output:
  base=next((b for b in output if b['scenario']==r['scenario'] and b['rows']==r['rows'] and b['commit_every']==r['commit_every'] and b['mode']=='classic_row'),None)
  if base:r['speedup_vs_classic_row']=round(base['median_ms']/r['median_ms'],3)
 return output

def main():
 p=argparse.ArgumentParser(description=__doc__);p.add_argument('input',nargs='?',type=Path,default=Path(__file__).resolve().parent/'results/runs.csv');p.add_argument('--scenarios',nargs='+',choices=['INSERT','UPDATE','DELETE','UPSERT'],default=['INSERT','UPDATE','DELETE','UPSERT']);p.add_argument('--min-runs',type=int,default=5);a=p.parse_args()
 if not a.input.exists():raise SystemExit('No measured results yet. Import/run the benchmark jobs first; no results have been fabricated.')
 with a.input.open(newline='',encoding='utf-8') as f:output=summarize(list(csv.DictReader(f,delimiter=';')))
 if not output:raise SystemExit('Only warmup runs are present. Set warmup=false for measured runs.')
 dest=a.input.with_name('summary.csv')
 with dest.open('w',newline='',encoding='utf-8') as f:
  w=csv.DictWriter(f,fieldnames=list(output[0]),delimiter=';');w.writeheader();w.writerows(output)
 for r in output:print(f'{r["scenario"]:6} {r["rows"]:6} {r["mode"]:13} n={r["runs"]}: {r["median_ms"]:.3f} ms, {r["rows_per_second"]:.1f} rows/s, x{r["speedup_vs_classic_row"]} vs classic without batches')
 missing=[]
 for scenario in a.scenarios:
  for n in [10000,100000]:
   for mode in ['strategy','classic_row']+([] if scenario=='UPSERT' else ['classic_batch']):
    found=[r for r in output if r['scenario']==scenario and r['rows']==n and r['mode']==mode]
    if not found or sum(r['runs'] for r in found)<a.min_runs:missing.append(f'{scenario}/{n}/{mode}')
 if missing:print(f'Incomplete matrix or fewer than {a.min_runs} measured runs:',', '.join(missing))
 print('Summary:',dest)

if __name__=='__main__':main()
