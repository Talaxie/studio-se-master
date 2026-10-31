#!/usr/bin/env python3
"""Run small SQL Server order/rollback tests using the existing exported job connection.

Only a session-local SQL temporary table is written. Credentials remain in memory.
"""
from pathlib import Path
import json,os,re,subprocess,tempfile,xml.etree.ElementTree as E

HERE=Path(__file__).resolve().parent
WORKSPACE=Path('/Applications/Talaxie-8.9-ogf/workspace-strategy/TEST')
BASE=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/benchmark')
OUT=BASE/'transaction_tests_20261030'
JAVA_HOME=Path('/Users/hciaravolo/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home')

def connection_payload():
 root=E.parse(WORKSPACE/'process/RelationalBenchmark/bench_insert_classic_row_0.1.item').getroot()
 node=next(n for n in root.findall('node') if n.get('componentName')=='tMSSqlOutput')
 values={p.get('name'):p.get('value') for p in node.findall('elementParameter')}
 def literal(name):return json.loads(values[name])
 source=WORKSPACE/'poms/jobs/process/RelationalBenchmark/bench_insert_classic_row_0.1/src/main/java/test/bench_insert_classic_row_0_1/bench_insert_classic_row.java'
 match=re.search(r'final String decryptedPassword_tDBOutput_1\s*=\s*routines\.system\.PasswordEncryptUtil\.decryptPassword\(("(?:\\.|[^"\\])*")\)',source.read_text())
 assert match,'Cannot locate the existing generated credential expression'
 cipher=json.loads(match[1])
 url='jdbc:sqlserver://'+literal('HOST')+':'+literal('PORT')+';databaseName='+literal('DBNAME')+';appName=RelationalStrategyOrderTests;'+literal('PROPERTIES')
 payload='\n'.join([url,literal('USER'),cipher])+'\n'
 return payload

def main():
 payload=connection_payload()
 exports=BASE/'exported/jobs/RelationalBenchmark'
 cp=os.pathsep.join(str(p) for p in [*sorted((exports/'lib').glob('*.jar')),exports/'bench_insert_classic_row/bench_insert_classic_row_0_1.jar'])
 OUT.mkdir(exist_ok=True)
 with tempfile.TemporaryDirectory(prefix='talaxie-sql-order-tests-') as tmp:
  subprocess.run([str(JAVA_HOME/'bin/javac'),'-proc:none','-cp',cp,'-d',tmp,str(HERE/'BatchOrderChecks.java')],check=True)
  result=subprocess.run([str(JAVA_HOME/'bin/java'),'-cp',tmp+os.pathsep+cp,'BatchOrderChecks',str(OUT/'results.csv')],input=payload,text=True,capture_output=True)
  (OUT/'execution.log').write_text(result.stdout+result.stderr)
  print(result.stdout)
  if result.returncode:
   print(result.stderr)
   raise SystemExit(result.returncode)
 print('Results:',OUT/'results.csv')

if __name__=='__main__':main()
