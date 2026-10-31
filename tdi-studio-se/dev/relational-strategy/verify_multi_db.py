#!/usr/bin/env python3
"""Compile actual PostgreSQL/MySQL/Oracle emitters, generated jobs and unchanged legacy paths."""
from pathlib import Path
import tempfile,os,subprocess,xml.etree.ElementTree as E
import verify
HERE=Path(__file__).resolve().parent

def main():
 with tempfile.TemporaryDirectory(prefix='talaxie-multi-db-strategy-') as tmp:
  out=Path(tmp);cp=verify.classpath()
  oracle=Path.home()/'.m2/repository/com/oracle/database/jdbc/ojdbc8/19.8.0.0/ojdbc8-19.8.0.0.jar'
  if oracle.exists():cp+=os.pathsep+str(oracle)
  for jar in (Path.home()/'.m2/repository/oro/oro').glob('*/*.jar'):
   if not any(x in jar.name for x in ['sources','javadoc']):cp+=os.pathsep+str(jar)
  verify.run('javac','-proc:none','-cp',cp,'-d',tmp,str(HERE/'CompileTemplates.java'))
  templates=[]
  for db in ['tPostgresqlOutput','tMysqlOutput','tOracleOutput']:
   E.parse(verify.COMPONENTS/db/(db+'_java.xml'))
   for phase in ['begin','main','end','finally']:
    source=verify.COMPONENTS/db/f'{db}_{phase}.javajet'
    for baseline in [False,True]:
     dest=out/(('Baseline_' if baseline else '')+source.name)
     dest.write_text(verify.flatten(source,baseline=baseline));templates.append(str(dest))
  verify.run('java','-cp',tmp+os.pathsep+cp,'CompileTemplates',tmp,*templates)
  verify.run('javac','-proc:none','-cp',cp,'-d',tmp,*map(str,sorted(out.glob('*.java'))))
  # Shared model doubles and runtime fixtures; SQL Server emitters are referenced by StrategyChecks.
  for phase in ['begin','main','end','finally']:
   source=verify.COMPONENTS/'tMSSqlOutput'/f'tMSSqlOutput_{phase}.javajet';dest=out/source.name;dest.write_text(verify.flatten(source))
  verify.run('java','-cp',tmp+os.pathsep+cp,'CompileTemplates',tmp,*map(str,out.glob('tMSSqlOutput_*.javajet')))
  verify.run('javac','-proc:none','-cp',cp,'-d',tmp,*map(str,out.glob('tMSSqlOutput_*.java')))
  verify.run('javac','-proc:none','-cp',tmp+os.pathsep+cp,'-d',tmp,str(HERE/'StrategyChecks.java'),str(HERE/'BatchStrategyChecks.java'),str(HERE/'MultiDbStrategyChecks.java'))
  verify.run('java','-cp',tmp+os.pathsep+cp,'MultiDbStrategyChecks',tmp,str(verify.REPO.parent/'tcommon-studio-se/main/plugins/org.talend.core.runtime/mappings'))
if __name__=='__main__':main()
