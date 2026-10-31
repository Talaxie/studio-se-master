#!/usr/bin/env python3
"""Build 18 standalone benchmark variants using actual Studio sources and production JET output phases. No SQL."""
from pathlib import Path
import sys,subprocess,os,re,shutil,json,hashlib,xml.etree.ElementTree as E
HERE=Path(__file__).resolve().parent
sys.path.insert(0,str(HERE.parent));import verify
sys.path.insert(0,str(HERE.parent/'benchmark'));import prepare as util
WORK=Path('/Applications/Talaxie-8.9-ogf/workspace-strategy/TEST')
OUT=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/benchmark/multi_db_batch50000_20261031')

def run(*a):subprocess.run(list(map(str,a)),check=True)
def block(text,node,phase,code):
 pattern=r'(/\*\*\s*\* \['+node+' '+phase+r' \] start\s*\*/)(.*?)(/\*\*\s*\* \['+node+' '+phase+r' \] stop\s*\*/)'
 text,n=re.subn(pattern,lambda m:m[1]+'\n'+code+'\n'+m[3],text,count=1,flags=re.S);assert n==1,(node,phase)
 return text

def java_begin(name,code):
 return 'ok_Hash.put("'+name+'",false);start_Hash.put("'+name+'",System.currentTimeMillis());currentComponent="'+name+'";int tos_count_'+name+'=0;\n'+code

CONFIG='''globalMap.put("RS_TX_OPEN",Boolean.FALSE);
int benchN=Integer.getInteger("bench.rows");
String scenario=System.getProperty("bench.scenario");
if ((benchN!=10000 && benchN!=100000) || !java.util.List.of("INSERT","UPDATE","DELETE").contains(scenario) || context.batchSize!=50000 || !context.tableName.equals("TABLE")) throw new IllegalArgumentException("Invalid benchmark scope");
globalMap.put("BENCH_N",benchN);globalMap.put("BENCH_SCENARIO",scenario);globalMap.put("BENCH_SEEN",0);
'''
SETUP='''globalMap.put("RS_TX_OPEN",Boolean.TRUE);
java.sql.Connection benchConnection=(java.sql.Connection)globalMap.get("conn_tDBConnection_1");
String benchTable="QUALIFIED";
try(java.sql.Statement s=benchConnection.createStatement()) {
 boolean exists;
 try(java.sql.ResultSet r=benchConnection.getMetaData().getTables(CATALOG,SCHEMA,"__TABLE__",new String[]{"TABLE"})){exists=r.next();}
 if(!exists)s.executeUpdate("CREATE TABLE "+benchTable+" (actor_id NUMERIC(18,0) NOT NULL PRIMARY KEY, first_name VARCHAR(50) NOT NULL, last_name VARCHAR(50) NOT NULL, last_update DATETYPE NOT NULL)ENGINE");
 s.executeUpdate("TRUNCATE TABLE "+benchTable);
}
int benchN=(Integer)globalMap.get("BENCH_N");
if(!"INSERT".equals(globalMap.get("BENCH_SCENARIO"))) {
 try(java.sql.PreparedStatement seed=benchConnection.prepareStatement("INSERT INTO "+benchTable+" (actor_id,first_name,last_name,last_update) VALUES (?,?,?,?)")) {
  for(int id=1;id<=benchN;id++) {seed.setBigDecimal(1,java.math.BigDecimal.valueOf(id));seed.setString(2,"SEED");seed.setString(3,"BEFORE");seed.setTimestamp(4,java.sql.Timestamp.valueOf("2026-10-29 00:00:00"));seed.addBatch();if(id%50000==0)seed.executeBatch();}
  if(benchN%50000!=0)seed.executeBatch();
 }
}
benchConnection.commit();
globalMap.put("BENCH_START_NS",System.nanoTime());
'''
COUNTERS='''int n=(Integer)globalMap.get("BENCH_N");
if(((Number)globalMap.get("tFileInputDelimited_1_NB_LINE")).intValue()!=n || ((Number)globalMap.get("tDBOutput_1_NB_LINE")).intValue()!=n || ((Number)globalMap.get("tDBOutput_1_NB_LINE_REJECTED")).intValue()!=0)throw new IllegalStateException("Invalid benchmark counters");
((java.sql.Connection)globalMap.get("conn_tDBConnection_1")).commit();
globalMap.put("BENCH_ELAPSED_NS",System.nanoTime()-(Long)globalMap.get("BENCH_START_NS"));
'''
ROW='''int id=verifyRows.actor_id.intValueExact();
int seen=(Integer)globalMap.get("BENCH_SEEN")+1;
if("DELETE".equals(globalMap.get("BENCH_SCENARIO")) || id!=seen || id>(Integer)globalMap.get("BENCH_N") || !String.format(java.util.Locale.ROOT,"F%06d",id).equals(verifyRows.first_name) || !String.format(java.util.Locale.ROOT,"L%06d",id).equals(verifyRows.last_name) || !"2026-10-30 10:00:00".equals(TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",verifyRows.last_update)))throw new IllegalStateException("Incorrect final row "+id);
globalMap.put("BENCH_SEEN",seen);
'''
FINAL='''int expected="DELETE".equals(globalMap.get("BENCH_SCENARIO"))?0:(Integer)globalMap.get("BENCH_N");
if((Integer)globalMap.get("BENCH_SEEN")!=expected)throw new IllegalStateException("Wrong final row count");
'''
RESULT='''System.out.println("BENCH_RESULT;DB;ACTION;MODE;"+globalMap.get("BENCH_N")+";50000;"+String.format(java.util.Locale.ROOT,"%.3f",((Long)globalMap.get("BENCH_ELAPSED_NS"))/1000000.0)+";"+globalMap.get("tFileInputDelimited_1_NB_LINE")+";"+globalMap.get("tDBOutput_1_NB_LINE_REJECTED")+";"+globalMap.get("BENCH_SEEN")+";PASS");'''

def main():
 assert not (OUT/'manifest.json').exists(), 'Campaign already prepared'
 OUT.mkdir(exist_ok=True);build=OUT/'build';build.mkdir(exist_ok=True);cp=verify.classpath()
 cp+=':'+str(Path.home()/'.m2/repository/com/oracle/database/jdbc/ojdbc8/19.8.0.0/ojdbc8-19.8.0.0.jar')
 for jar in (Path.home()/'.m2/repository/oro/oro').glob('*/*.jar'):
  if not any(x in jar.name for x in ['sources','javadoc']):cp+=':'+str(jar)
 run('javac','-proc:none','-cp',cp,'-d',build,HERE.parent/'CompileTemplates.java')
 templates=[]
 for db in ['MSSql','Postgresql','Mysql','Oracle']:
  for phase in ['begin','main','end','finally']:
   src=verify.COMPONENTS/f't{db}Output'/f't{db}Output_{phase}.javajet';dest=build/src.name;dest.write_text(verify.flatten(src));templates.append(dest)
 run('java','-cp',str(build)+':'+cp,'CompileTemplates',build,*templates)
 run('javac','-proc:none','-cp',cp,'-d',build,*build.glob('*.java'))
 run('javac','-proc:none','-cp',str(build)+':'+cp,'-d',build,HERE.parent/'StrategyChecks.java',HERE/'ExportMultiDb.java')
 plan=[];hashes={}
 for db,component in [('PostgreSQL','Postgresql'),('MySQL','Mysql'),('Oracle','Oracle')]:
  stem='teststrategy_'+db.lower()+'_0.1';module=WORK/'poms/jobs/process'/stem;src=module/f'src/main/java/test/teststrategy_{db.lower()}_0_1/testStrategy_{db}.java'
  hashes[str(src)]=hashlib.sha256(src.read_bytes()).hexdigest()
  item=WORK/f'process/testStrategy_{db}_0.1.item';table='BENCH_RS_MULTI_ACTORS' if db=='Oracle' else 'bench_rs_multi_actors'
  for action in ['INSERT','UPDATE','DELETE']:
   for mode in ['strategy','classic']:
    name=f'{db}_{action}_{mode}';dest=OUT/'variants'/name;dest.mkdir(parents=True,exist_ok=True);phases=dest/'phases'
    native=dest/'output.item';r=E.parse(item).getroot();r.set('xmlns:TalendMapper',util.NS['TalendMapper']);u=r.find("node[@componentName='t"+component+"Output']")
    util.setp(u,'TABLE_ACTION','NONE','CLOSED_LIST');util.setp(u,'BATCH_SIZE','context.batchSize');util.write_xml(r,native)
    run('java','-cp',str(build)+':'+cp,'ExportMultiDb',native,phases,'t'+component+'Output','RELATIONAL_STRATEGY' if mode=='strategy' else action,verify.REPO.parent/'tcommon-studio-se/main/plugins/org.talend.core.runtime/mappings')
    text=src.read_text()
    for phase in ['begin','main','end','finally']:
     code=(phases/f'{phase}.java').read_text()
     if phase=='begin':code=java_begin('tDBOutput_1',code)
     elif phase=='main':code+='\ntos_count_tDBOutput_1++;'
     elif phase=='end':code+='\nok_Hash.put("tDBOutput_1",true);end_Hash.put("tDBOutput_1",System.currentTimeMillis());'
     text=block(text,'tDBOutput_1',phase,code)
    if mode=='strategy':assert 'final boolean enabled = true' in (phases/'begin.java').read_text() and 'relationalBatch_tDBOutput_1.write(' in (phases/'main.java').read_text(),name
    else:assert '.addBatch(' in (phases/'main.java').read_text() and 'batchSize_tDBOutput_1=context.batchSize' in re.sub(r'\s+','',(phases/'begin.java').read_text()),name
    setup=SETUP.replace('QUALIFIED',('SAKILA.' if db=='Oracle' else 'public.' if db=='PostgreSQL' else '')+table).replace('CATALOG','context.dbName' if db=='MySQL' else 'null').replace('SCHEMA','"SAKILA"' if db=='Oracle' else '"public"' if db=='PostgreSQL' else 'null').replace('DATETYPE','DATETIME' if db=='MySQL' else 'TIMESTAMP').replace('ENGINE',' ENGINE=InnoDB' if db=='MySQL' else '').replace('__TABLE__',table)
    for node,code in [('tJava_Config',CONFIG.replace('TABLE',table)),('tJava_TxOpened',setup),('tJava_Counters',COUNTERS),('tJava_FinalCheck',FINAL),('tJava_Result',RESULT.replace(';DB;',';'+db+';').replace(';ACTION;',';'+action+';').replace(';MODE;',';'+mode+';'))]:text=block(text,node,'begin',java_begin(node,code))
    # tJavaRow user code resides in its main phase.
    old=re.search(r'java.math.BigDecimal checkedId\s*=.*?(?=\s*tos_count_tJavaRow_Verify\+\+;)',text,re.S);assert old
    text=text[:old.start()]+ROW+'\n'+text[old.end():]
    if db=='Oracle':text=text.replace('java.sql.Statement stmt_tDBInput_Verify = conn_tDBInput_Verify.createStatement();','java.sql.Statement stmt_tDBInput_Verify = conn_tDBInput_Verify.createStatement();\nstmt_tDBInput_Verify.setFetchSize(50000);')
    target=dest/src.name;target.write_text(text);classes=dest/'classes';classes.mkdir(exist_ok=True)
    dep=str(module/'target/classpath.jar');run('javac','-proc:none','-encoding','UTF-8','-cp',dep,'-d',classes,target)
    plan.append(dict(database=db,action=action,mode=mode,variant=str(dest),classpath=str(classes)+':'+dep,main=f'test.teststrategy_{db.lower()}_0_1.testStrategy_{db}',table=table,source_sha256=hashlib.sha256(target.read_bytes()).hexdigest()))
 (OUT/'manifest.json').write_text(json.dumps(dict(variants=plan,original_sources=hashes,measurements=1,warmups=0,batch_size=50000,timing='CSV read + mapping + output setup + writes + explicit commit, shared connection established beforehand; table reset/seed and full result verification excluded'),indent=2))
 print('Prepared 18 variants; no SQL executed:',OUT)
if __name__=='__main__':main()
