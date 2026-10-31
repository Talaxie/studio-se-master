#!/usr/bin/env python3
"""Recompile existing standalone relational benchmark jobs with the current production output emitters.

Only output phases change; retain the exported reader/mapper/setup/validation,
resources, connection code and dependency versions. No SQL runs during export.
"""
from pathlib import Path
import importlib.util,os,re,shutil,subprocess,tempfile,hashlib,json,argparse
HERE=Path(__file__).resolve().parent
spec=importlib.util.spec_from_file_location('verify',HERE.parent/'verify.py');verify=importlib.util.module_from_spec(spec);spec.loader.exec_module(verify)
BASE=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/benchmark')
WORKSPACE=Path('/Applications/Talaxie-8.9-ogf/workspace-strategy/TEST')

def run(*args):
 result=subprocess.run(list(map(str,args)))
 if result.returncode:raise SystemExit(f'{args[0]} failed: {result.returncode}')
def main():
 parser=argparse.ArgumentParser(description=__doc__);parser.add_argument('--campaign',type=Path,required=True);parser.add_argument('--scenarios',nargs='+',choices=['INSERT','UPDATE','DELETE','UPSERT'],default=['INSERT']);args=parser.parse_args();campaign=args.campaign.resolve();export=campaign/'exported/jobs/RelationalBenchmark';export.mkdir(parents=True,exist_ok=True)
 original=BASE/'exported/jobs/RelationalBenchmark';(export/'lib').symlink_to(original/'lib',target_is_directory=True) if not (export/'lib').exists() else None
 fingerprints={}
 with tempfile.TemporaryDirectory(prefix='rs-benchmark-emitters-') as tmp:
  out=Path(tmp);cp=verify.classpath();templates=[]
  run('javac','-proc:none','-cp',cp,'-d',out,HERE.parent/'CompileTemplates.java')
  for phase in ['begin','main','end','finally']:
   source=verify.COMPONENTS/f'tMSSqlOutput/tMSSqlOutput_{phase}.javajet';target=out/source.name;target.write_text(verify.flatten(source));templates.append(target)
  run('java','-cp',str(out)+os.pathsep+cp,'CompileTemplates',out,*templates)
  run('javac','-proc:none','-cp',cp,'-d',out,*out.glob('tMSSqlOutput_*.java'))
  run('javac','-proc:none','-cp',str(out)+os.pathsep+cp,'-d',out,HERE.parent/'StrategyChecks.java',HERE/'ExportInsertTemplates.java')
  for scenario,mode in [(scenario,mode) for scenario in args.scenarios for mode in (['strategy','classic_row'] if scenario=='UPSERT' else ['strategy','classic_batch'])]:
   name='bench_'+scenario.lower()+'_'+mode;job=export/name;shutil.copytree(original/name,job,dirs_exist_ok=True)
   phases=campaign/'generated_phases'/name
   item=campaign/'native'/f'{name}_0.1.item'
   if not item.exists():item=WORKSPACE/'process/RelationalBenchmark'/f'{name}_0.1.item'
   run('java','-cp',str(out)+os.pathsep+cp,'ExportInsertTemplates',item,phases)
   source=job/f'src/main/java/test/{name}_0_1/{name}.java';text=source.read_text();fingerprints[name]={'original_source_sha256':hashlib.sha256(source.read_bytes()).hexdigest()}
   def block(phase):
    pattern=r'(/\*\*\s*\* \[tDBOutput_1 '+phase+r' \] start\s*\*/)(.*?)(/\*\*\s*\* \[tDBOutput_1 '+phase+r' \] stop\s*\*/)'
    found=re.search(pattern,text,re.S);assert found,phase
    return pattern,found
   _,old=block('begin');connection=re.search(r'java.sql.Connection conn_tDBOutput_1 = null;.*?(?=\s*resourceMap.put\("conn_tDBOutput_1")',old[2],re.S);assert connection
   for phase in ['begin','main','end','finally']:
    code=(phases/f'{phase}.java').read_text();pattern,old=block(phase)
    if phase=='begin':
     code,count=re.subn(r'java.sql.Connection conn_tDBOutput_1 = null;.*?(?=\s*resourceMap.put\("conn_tDBOutput_1")',lambda m:connection[0],code,flags=re.S);assert count==1
     code='ok_Hash.put("tDBOutput_1", false); start_Hash.put("tDBOutput_1",System.currentTimeMillis()); int tos_count_tDBOutput_1=0;\n'+code
    elif phase=='main':code+='\ntos_count_tDBOutput_1++;\n'
    elif phase=='end':code+='\nok_Hash.put("tDBOutput_1",true);end_Hash.put("tDBOutput_1",System.currentTimeMillis());\n'
    text=re.sub(pattern,lambda m:m[1]+'\ncurrentComponent="tDBOutput_1";\n'+code+'\n'+m[3],text,count=1,flags=re.S)
   if scenario=='UPSERT':
    if mode=='strategy':
     assert 'final boolean enabled = false' in text and 'pstmtUpdate_tDBOutput_1.executeUpdate()' in text
     text=text.replace(';UPSERT;strategy;',';UPSERT;strategy_upsert;')
    else:assert 'executeUpdate()' in text and '.addBatch(' not in (phases/'main.java').read_text()
   elif mode=='strategy':
    assert 'final boolean enabled = true' in text and 'relationalBatchLimit_tDBOutput_1 = context.batchSize' in text
    text=text.replace(';'+scenario+';strategy;',';'+scenario+';strategy_batch;')
    needle='context.rowCount + ";" + 0 +';assert needle in text;text=text.replace(needle,'context.rowCount + ";" + context.batchSize +',1)
   else:assert 'batchSize_tDBOutput_1 = context.batchSize' in text and 'executeBatch()' in text
   assert 'int commitEvery_tDBOutput_1 = context.commitEvery' in text
   source.write_text(text)
   classes=out/name;classes.mkdir()
   deps=os.pathsep.join(map(str,(export/'lib').glob('*.jar')))
   run('javac','-proc:none','-encoding','UTF-8','-cp',deps,'-d',classes,source)
   run('jar','--update','--file',job/f'{name}_0_1.jar','-C',classes,'.')
   fingerprints[name].update(recompiled_source_sha256=hashlib.sha256(source.read_bytes()).hexdigest(),production_templates=True,batch_size='0 (sequential UPSERT)' if scenario=='UPSERT' else 'context.batchSize',commit_every='context.commitEvery')
 (campaign/'export_verification.json').write_text(json.dumps(fingerprints,indent=2))
 print('PASS: selected benchmark jobs rebuilt from production output templates, batch/row settings verified, shared input/mapping/SQL validation and original connection/dependencies preserved')
 print(export)
if __name__=='__main__':main()
