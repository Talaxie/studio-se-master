#!/usr/bin/env python3
"""Compile real emitted database output pipelines and execute against private test connections."""
import argparse
import os
from pathlib import Path
import re
import subprocess

p = argparse.ArgumentParser(description=__doc__)
p.add_argument('--classes', required=True, type=Path)
p.add_argument('--plugins', required=True, type=Path)
p.add_argument('--connections', required=True, type=Path)
p.add_argument('--oracle-driver', required=True, type=Path)
p.add_argument('--mysql-driver', required=True, type=Path)
p.add_argument('--postgres-driver', required=True, type=Path)
a = p.parse_args()
out = a.classes.resolve()
root = Path(__file__).resolve().parents[2]
cp = os.pathsep.join(map(str,[out, a.oracle_driver,a.mysql_driver,a.postgres_driver,
    Path.home()/'.m2/repository/oro/oro/2.0.8/oro-2.0.8.jar',
    *a.plugins.glob('*.jar'), *[x for x in a.plugins.iterdir() if x.is_dir()], *a.plugins.glob('org.apache.log4j_*/*.jar')]))
subprocess.run(['javac','-proc:none','-cp',cp,'-d',str(out),str(Path(__file__).with_name('GenerateRows.java')),str(Path(__file__).with_name('GenerateMultiDbOutputs.java'))],check=True)
subprocess.run(['java','-cp',cp,'GenerateMultiDbOutputs',str(out),str(root/'tcommon-studio-se/main/plugins/org.talend.core.runtime/mappings')],check=True)
sources=[Path(__file__).with_name(n+'.java') for n in ['LiveMultiDbTest','LiveMultiDbOutputSupport']]
names=[]
for db,component in [('oracle','tOracleOutput'),('mysql','tMysqlOutput'),('postgres','tPostgresqlOutput')]:
    for variant in ['0','2','empty','reject','create','create_if','extra','zero']:
        fixed=2 if variant in ['2','empty','reject'] else 0
        name='GeneratedMulti_'+db+'_'+variant
        parts=[(out/f'multi-{db}-{i}-{variant}.java.fragment').read_text() for i in range(3)]
        parts=[re.sub(r'final String decryptedPassword_[^=]+=[^;]+;',f'final String decryptedPassword_{component}_1 = context.DB_PASSWORD;',s) for s in parts]
        code='''import java.sql.*;
import routines.TalendDate;
import routines.system.*;
public class NAME extends LiveMultiDbOutputSupport {
 protected void execute(ResultSet source) throws Exception {
  rowStruct row = new rowStruct(); rejectedStruct rejected = null;
  Dynamic dynamic = DynamicJdbc.create(source.getMetaData(), FIXED, "DATABASE");
  __BEGIN_FRAGMENT__
  while (source.next()) {
   tos_count_COMPONENT_1++;
   row.AGENCE = source.getString(1); row.MOIS = source.getString(2); row.SQL = dynamic;
   DynamicJdbc.read(dynamic, source, FIXED, false);
   rejected = null;
   __MAIN_FRAGMENT__
   if (rejected != null) rejectedRows.add(rejected);
  }
  __END_FRAGMENT__
 }
 public static void main(String[] args) throws Exception {
  try (java.io.InputStream in = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(args[0]))) { config.load(in); }
  new NAME().test("DB", "VARIANT", FIXED);
 }
}
'''
        for k,v in [('NAME',name),('FIXED',str(fixed)),('DATABASE',{'oracle':'oracle_id','mysql':'mysql_id','postgres':'postgres_id'}[db]),('COMPONENT',component),('VARIANT',variant),('DB',db)]: code=code.replace(k,v)
        for k,v in [('__BEGIN_FRAGMENT__',parts[0]),('__MAIN_FRAGMENT__',parts[1]),('__END_FRAGMENT__',parts[2])]: code=code.replace(k,v)
        path=out/(name+'.java');path.write_text(code);sources.append(path);names.append(name)
subprocess.run(['javac','-proc:none','-encoding','UTF-8','-cp',cp,'-d',str(out),*map(str,sources)],check=True)
for name in names:subprocess.run(['java','-cp',cp,name,str(a.connections.resolve())],check=True,timeout=120)
