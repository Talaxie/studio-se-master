#!/usr/bin/env python3
"""Compile actual output generators and verify four-engine DML in disposable tables."""
import argparse, os, re, subprocess
from pathlib import Path
p=argparse.ArgumentParser(description=__doc__)
p.add_argument('--classes',required=True,type=Path);p.add_argument('--plugins',required=True,type=Path);p.add_argument('--connections',required=True,type=Path)
p.add_argument('--drivers',required=True,nargs='+',type=Path);p.add_argument('--compile-only',action='store_true');p.add_argument('--names',nargs='*')
a=p.parse_args();out=a.classes.resolve();root=Path(__file__).resolve().parents[2];here=Path(__file__).parent
cp=os.pathsep.join(map(str,[out,*a.drivers,Path.home()/'.m2/repository/oro/oro/2.0.8/oro-2.0.8.jar',*a.plugins.glob('*.jar'),*[x for x in a.plugins.iterdir() if x.is_dir()],*a.plugins.glob('org.apache.log4j_*/*.jar')]))
subprocess.run(['javac','-proc:none','-cp',cp,'-d',str(out),str(here/'GenerateNamedKeyOutputs.java')],check=True)
subprocess.run(['java','-cp',cp,'GenerateNamedKeyOutputs',str(out),str(root/'tcommon-studio-se/main/plugins/org.talend.core.runtime/mappings')],check=True)
sources=[here/'LiveDmlOutputSupport.java'];names=[]
for file in sorted(out.glob('named-*-0-*.java.fragment')):
    _,db,_,action,variant,mode=file.name.removesuffix('.java.fragment').split('-');component={'mssql':'tMSSqlOutput','oracle':'tOracleOutput','mysql':'tMysqlOutput','postgres':'tPostgresqlOutput'}[db]
    if variant=='nullable' and action in ['UPSERT','INSERT_ON_DUPLICATE_KEY_UPDATE']:continue
    fixed=0 if mode=='all' else 1
    name='GeneratedNamed_'+db+'_'+action+'_'+variant+'_'+mode
    parts=[(out/f'named-{db}-{i}-{action}-{variant}-{mode}.java.fragment').read_text() for i in range(3)]
    parts=[re.sub(r'final String decryptedPassword_[^=]+=[^;]+;',f'final String decryptedPassword_{component}_1 = context.DB_PASSWORD;',s) for s in parts]
    code='''import java.sql.*;
import routines.TalendDate;
import routines.system.*;
public class __NAME__ extends LiveDmlOutputSupport {
 protected void execute(ResultSet source) throws Exception {
  rowStruct row = new rowStruct(); rejectedStruct rejected = null;
  Dynamic dynamic = __CREATE__;
  __BEGIN__
  while(source.next()) {
   tos_count___COMP___1++;
   row.AGENCE=source.getString(1);row.MOIS=source.getString(2);row.SQL=dynamic;
   __READ__;
   rejected=null;
   __MAIN__
   if(rejected!=null)rejectedRows.add(rejected);
  }
  __END__
 }
 public static void main(String[] args) throws Exception {
  try(java.io.InputStream in=java.nio.file.Files.newInputStream(java.nio.file.Paths.get(args[0]))){config.load(in);}
  __NAME__ job=new __NAME__();job.mixedKeys=__MIXED__;job.test("__DB__","__ACTION__","__VARIANT__");
 }
}
'''
    dbid={'mssql':'id_MSSQL','oracle':'oracle_id','mysql':'mysql_id','postgres':'postgres_id'}[db]
    replacements={'__MIXED__':'true' if mode=='mixed' else 'false','__NAME__':name,'__COMP__':component,'__DB__':db,'__ACTION__':action,'__VARIANT__':variant,'__CREATE__':f'DynamicUtils.createMssqlDynamic(source.getMetaData(),{fixed})' if db=='mssql' else f'DynamicJdbc.create(source.getMetaData(),{fixed},"{dbid}")','__READ__':f'DynamicUtils.readColumnsFromDatabase_Mssql(dynamic,source,{fixed},null,false)' if db=='mssql' else f'DynamicJdbc.read(dynamic,source,{fixed},false)'}
    for k,v in replacements.items():code=code.replace(k,v)
    for k,v in zip(['__BEGIN__','__MAIN__','__END__'],parts):code=code.replace(k,v)
    path=out/(name+'.java');path.write_text(code);sources.append(path);names.append(name)
if subprocess.run(['javac','-proc:none','-encoding','UTF-8','-cp',cp,'-d',str(out),*map(str,sources)]).returncode:raise SystemExit('Named-key pipeline compilation failed')
print('Compiled named-key DML variants:',len(names),flush=True)
if not a.compile_only:
    failures=[]
    for name in names:
        if a.names and not any(v in name for v in a.names):continue
        result=subprocess.run(['java','-cp',cp,name,str(a.connections.resolve())],timeout=120)
        if result.returncode:failures.append(name)
    if failures:raise SystemExit('Native DML failures: '+', '.join(failures))
