#!/usr/bin/env python3
from pathlib import Path
import csv
ROOT=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/benchmark/multi_db_batch50000_20261031')
rows=list(csv.DictReader((ROOT/'results/runs.csv').open(),delimiter=';'))
index={(r['database'],r['action'],r['mode'],int(r['rows'])):r for r in rows}
lines=['Benchmarks PostgreSQL, MySQL, Oracle — 31 octobre 2026','',f'{len(rows)}/36 cas terminés et validés.', 'Temps en secondes, classique puis relationalStrategy ; écart = (stratégie/classique - 1) × 100.', 'Un passage par cas, sans échauffement, JVM neuve : mesures exploratoires, pas une médiane.', 'Lots de 50000 des deux côtés ; connexion partagée, autocommit désactivé, commit final chronométré.', 'Lecture CSV, tMap, préparation de la sortie et écritures inclus ; connexion, remise à zéro, préchargement et contrôle complet exclus.','']
summary=[]
for db in ['PostgreSQL','MySQL','Oracle']:
 for action in ['INSERT','UPDATE','DELETE']:
  for n in [10000,100000]:
   classic=index.get((db,action,'classic',n));strategy=index.get((db,action,'strategy',n))
   if classic and strategy:
    c=float(classic['elapsed_ms'])/1000;s=float(strategy['elapsed_ms'])/1000;delta=(s/c-1)*100
    summary.append([db,action,n,f'{c:.3f}',f'{s:.3f}',f'{delta:+.1f}',f'{n/s:.0f}','PASS'])
    lines.append(f'{db:10} {action:6} {n:6} : {c:9.3f} s -> {s:9.3f} s ; {delta:+6.1f} %')
with (ROOT/'results/summary.csv').open('w',newline='') as f:
 w=csv.writer(f,delimiter=';');w.writerow(['database','action','rows','classic_seconds','strategy_seconds','strategy_overhead_percent','strategy_rows_per_second','validated']);w.writerows(summary)
lines+=['','Chaque ligne INSERT/UPDATE est contrôlée (clé, prénom, nom et date) après le commit ; DELETE exige une table vide. Aucun rejet accepté.', 'Table dédiée bench_rs_multi_actors (BENCH_RS_MULTI_ACTORS sur Oracle). Aucun changement des jobs fonctionnels, des tables actors, des CSV ou des travaux Joblets.', 'MySQL : rewriteBatchedStatements=true conservé par la connexion native ; mode classique INSERT étendu avec NB_ROWS_PER_INSERT=50000. Oracle : lots sur connexion existante activés explicitement.', 'Les phases de sortie des deux modes sont produites par les vrais générateurs JET du checkout isolé, puis intégrées aux mêmes jobs Java issus du Studio. Les variantes compilées et leurs phases sont conservées dans variants/.']
(ROOT/'COMPARATIF.txt').write_text('\n'.join(lines)+'\n');print('\n'.join(lines))
