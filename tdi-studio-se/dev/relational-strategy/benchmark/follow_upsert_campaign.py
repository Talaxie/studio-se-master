#!/usr/bin/env python3
"""Publish partial/final comparisons for an already running, single-pass UPSERT campaign."""
from pathlib import Path
import argparse,csv,datetime,json,os,time

def publish(root,runner):
 source=root/'results/runs.csv';rows=[]
 if source.exists():
  with source.open() as f:rows=[r for r in csv.DictReader(f,delimiter=';') if r.get('validated')=='true']
 for r in rows:
  n=int(r['rows']);assert r['scenario']=='UPSERT' and r['warmup']=='false'
  assert int(r['input_rows'])==n and int(r['inserted'])==n//2 and int(r['updated'])==n//2
  assert int(r['deleted'])==0 and int(r['rejected'])==0 and int(r['batch_size'])==0 and int(r['commit_every'])==50000
 try:os.kill(runner,0);alive=True
 except ProcessLookupError:alive=False
 done=len(rows)==4;state='TERMINE' if done else 'EN COURS' if alive else 'INTERROMPU'
 summary=[dict(rows=int(r['rows']),mode=r['mode'],elapsed_ms=float(r['elapsed_ms']),rows_per_second=float(r['rows_per_second']),inserted=int(r['inserted']),updated=int(r['updated']),validated=True) for r in rows]
 comparison=[]
 lines=['BENCHMARK UPSERT SQL SERVER — '+state,'Dernière mise à jour : '+datetime.datetime.now().astimezone().isoformat(timespec='seconds'),'',f'{len(rows)}/4 passages terminés et validés.','Protocole réduit : une mesure par composant et par taille, sans échauffement. Il ne s’agit pas de médianes.','50 % des clés existent au départ ; 50 % sont nouvelles. Clé : actor_id.','Classique : Mettre à jour ou insérer (UPDATE_OR_INSERT). Stratégie : UPSERT.','Les deux writers exécutent UPDATE puis INSERT si nécessaire, ligne par ligne. Aucun lot UPSERT. Commit every = 50 000.','Temps : pipeline CSV + tMap + sortie SQL, connexion/préparation/écriture/commit inclus. Initialisation de table, validation et lancement JVM exclus.','Seule dbo.BENCH_RS_ACTORS est réinitialisée avant chaque passage. Aucun changement aux Joblets.','']
 for n in [10000,100000]:
  pair={r['mode']:r for r in rows if int(r['rows'])==n}
  lines.append(f'{n:,} lignes :')
  for mode,label in [('classic_row','Classique'),('strategy_upsert','relationalStrategy')]:
   r=pair.get(mode);lines.append(f'  {label} : '+(f"{float(r['elapsed_ms'])/1000:.3f} s ; {float(r['rows_per_second']):.1f} lignes/s ; résultat SQL validé" if r else 'en attente'))
  if len(pair)==2:
   a=float(pair['classic_row']['elapsed_ms']);b=float(pair['strategy_upsert']['elapsed_ms']);delta=(b/a-1)*100
   comparison.append(dict(rows=n,classic_elapsed_ms=a,strategy_elapsed_ms=b,strategy_relative_time_percent=round(delta,2)))
   lines.append(f'  Ecart de temps stratégie/classique : {delta:+.2f} %.')
  lines.append('')
 lines+=['Mesures uniques : les écarts peuvent dépendre de la charge du serveur et du réseau.','Données brutes : results/runs.csv. Configuration et ordre : results/environment.json et results/plan.csv.','Traçabilité des templates et compilation : export_verification.json.']
 temp=root/'COMPARATIF.txt.tmp';temp.write_text('\n'.join(lines)+'\n');temp.replace(root/'COMPARATIF.txt')
 for filename,data in [('summary.csv',summary),('comparison.csv',comparison)]:
  if data:
   with (root/'results'/filename).open('w',newline='') as f:
    w=csv.DictWriter(f,fieldnames=list(data[0]),delimiter=';');w.writeheader();w.writerows(data)
 (root/'results/status.json').write_text(json.dumps(dict(state=state,validated_runs=len(rows),runner_pid=runner,updated_at=datetime.datetime.now().astimezone().isoformat()),indent=2))
 return done or not alive,len(rows)

def main():
 p=argparse.ArgumentParser(description=__doc__);p.add_argument('--root',type=Path,required=True);p.add_argument('--runner-pid',type=int,required=True);a=p.parse_args();last=-1
 while True:
  end,count=publish(a.root,a.runner_pid)
  if count!=last:print(f'{count}/4 validated results; report updated: {a.root / "COMPARATIF.txt"}',flush=True);last=count
  if end:return
  time.sleep(10)
if __name__=='__main__':main()
