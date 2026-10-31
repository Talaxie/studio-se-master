#!/usr/bin/env python3
"""Plan or run exported standalone benchmark jobs sequentially. Default is plan only."""
import argparse,csv,json,os,platform,random,subprocess,signal
from pathlib import Path

def main():
 p=argparse.ArgumentParser(description=__doc__)
 p.add_argument('--root',type=Path,default=Path(__file__).resolve().parent)
 p.add_argument('--jobs-dir',type=Path)
 p.add_argument('--execute',action='store_true',help='Run jobs: creates/truncates only dbo.BENCH_RS_ACTORS using the copied connection')
 p.add_argument('--repetitions',type=int,default=5)
 p.add_argument('--seed',type=int,default=42)
 p.add_argument('--scenarios',nargs='+',choices=['INSERT','UPDATE','DELETE','UPSERT'])
 p.add_argument('--warmups',type=int,choices=[0,1],default=1)
 p.add_argument('--batch-size',type=int,default=50000)
 p.add_argument('--commit-every',type=int,default=50000)
 p.add_argument('--timeout-seconds',type=int,default=180,help='Stop a run that unexpectedly exceeds this duration')
 a=p.parse_args();assert a.repetitions>=1 and a.batch_size>0 and a.commit_every>0
 root=a.root.resolve();manifest=json.loads((root/'manifest.json').read_text());manifest=[v for v in manifest if not a.scenarios or v['scenario'] in a.scenarios];rng=random.Random(a.seed)
 plan=[]
 for size in [10000,100000]:
  # Warmup prepares the server/filesystem caches; a fresh exported process does not preserve JVM/JIT state.
  warm=manifest[:];rng.shuffle(warm)
  if a.warmups:
   for v in warm:plan.append(dict(v,rows=size,iteration=0,warmup=True))
  for iteration in range(1,a.repetitions+1):
   order=manifest[:];rng.shuffle(order)
   for v in order:plan.append(dict(v,rows=size,iteration=iteration,warmup=False))
 results=root/'results';results.mkdir(exist_ok=True)
 with (results/'plan.csv').open('w',newline='',encoding='utf-8') as f:
  w=csv.writer(f,delimiter=';');w.writerow(['order','job','rows','iteration','warmup'])
  for i,v in enumerate(plan,1):w.writerow([i,v['job'],v['rows'],v['iteration'],str(v['warmup']).lower()])
 print(f'{len(plan)} runs planned: {len(manifest)} variants, 2 sizes, {a.warmups} warmup + {a.repetitions} measured runs. Plan: {results / "plan.csv"}')
 if not a.execute:
  print('PLAN ONLY. No jobs or SQL were executed.');return
 if not a.jobs_dir:p.error('--jobs-dir is required with --execute')
 launchers={}
 for v in manifest:
  found=list(a.jobs_dir.resolve().rglob(v['job']+'_run.sh'))
  if len(found)!=1:raise SystemExit(f'Expected one exported launcher for {v["job"]}, found {len(found)}')
  if '$@' not in found[0].read_text() and '${@}' not in found[0].read_text():
   raise SystemExit(f'Launcher does not appear to forward context arguments: {found[0]}')
  launchers[v['job']]=found[0]
 child_env=dict(os.environ)
 java_home=Path('/Users/hciaravolo/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home')
 if java_home.is_dir():child_env['JAVA_HOME']=str(java_home);child_env['PATH']=str(java_home/'bin')+os.pathsep+child_env.get('PATH','')
 java=subprocess.run(['java','-version'],capture_output=True,text=True,env=child_env)
 (results/'environment.json').write_text(json.dumps({'platform':platform.platform(),'java':java.stderr.strip(),'seed':a.seed,'repetitions':a.repetitions,'batch_size':a.batch_size,'commit_every':a.commit_every,'scope':'end-to-end job pipeline; setup/validation excluded; fresh JVM per exported run'},indent=2)+'\n')
 for i,v in enumerate(plan,1):
  launcher=launchers[v['job']]
  args=['sh',str(launcher),'--context=Default']
  for k,value in {'rowCount':v['rows'],'iteration':v['iteration'],'warmup':str(v['warmup']).lower(),'batchSize':a.batch_size,'commitEvery':a.commit_every,'benchmarkDir':str(root)}.items():args+=['--context_param',f'{k}={value}']
  log=results/f'{i:03}_{v["job"]}_{v["rows"]}.log'
  print(f'[{i}/{len(plan)}] {v["job"]}: {v["rows"]}, warmup={v["warmup"]}',flush=True)
  with log.open('w') as f:
   child=subprocess.Popen(args,cwd=launcher.parent,env=child_env,stdout=f,stderr=subprocess.STDOUT,start_new_session=True)
   try:status=child.wait(timeout=a.timeout_seconds)
   except subprocess.TimeoutExpired:
    os.killpg(child.pid,signal.SIGTERM)
    try:child.wait(timeout=10)
    except subprocess.TimeoutExpired:os.killpg(child.pid,signal.SIGKILL);child.wait()
    raise SystemExit(f'Job exceeded {a.timeout_seconds}s; process group stopped. See {log}')
  if status:raise SystemExit(f'Job failed (exit {status}); stopped. See {log}')
 print('Finished. Run summarize.py to compare medians.')

if __name__=='__main__':main()
