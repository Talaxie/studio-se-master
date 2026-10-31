#!/usr/bin/env python3
"""Prepare three native TEST jobs. No database connection or CSV mutation."""
from pathlib import Path
import copy,datetime,hashlib,importlib.util,json,uuid,zipfile,xml.etree.ElementTree as E
HERE=Path(__file__).resolve().parent
spec=importlib.util.spec_from_file_location('bench_prepare',HERE.parent/'benchmark/prepare.py');util=importlib.util.module_from_spec(spec);spec.loader.exec_module(util)
WORK=Path('/Applications/Talaxie-8.9-ogf/workspace-strategy/TEST')
OUT=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/shared_connection_tests_20261031')
INPUT=Path('/Volumes/infa2talend/infashared/SrcFiles/actor_update_strategy.csv')
EXPECTED=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/actor_resultat_attendu.csv')

CONFIG='''globalMap.put("RS_TX_OPEN", Boolean.FALSE);
if (context.dbHost.trim().isEmpty() || context.dbName.trim().isEmpty() || context.dbUser.trim().isEmpty())
    throw new IllegalArgumentException("Renseigner dbHost, dbName (base/service Oracle), dbUser et dbPassword dans le contexte du Job.");
if (!context.tableName.matches("[A-Za-z][A-Za-z0-9_]*") || (!context.dbSchema.isEmpty() && !context.dbSchema.matches("[A-Za-z][A-Za-z0-9_]*")))
    throw new IllegalArgumentException("Utiliser des noms simples pour tableName et dbSchema.");
if (context.batchSize <= 0) throw new IllegalArgumentException("batchSize doit etre positif.");
if (!java.nio.file.Files.isRegularFile(java.nio.file.Paths.get(context.inputFile))) throw new IllegalArgumentException("Fichier entree absent : " + context.inputFile);
java.util.Map<java.math.BigDecimal, java.util.List<String>> expected = new java.util.LinkedHashMap<>();
java.util.List<String> lines = java.nio.file.Files.readAllLines(java.nio.file.Paths.get(context.expectedFile), java.nio.charset.StandardCharsets.UTF_8);
for (int index=1; index<lines.size(); index++) {
    if (lines.get(index).trim().isEmpty()) continue;
    String[] fields=lines.get(index).split(";", -1);
    if (fields.length!=4) throw new IllegalArgumentException("Ligne de resultat attendu invalide : " + (index+1));
    java.math.BigDecimal id=new java.math.BigDecimal(fields[0]).stripTrailingZeros();
    if (expected.put(id, java.util.Arrays.asList(fields[1],fields[2],fields[3]))!=null) throw new IllegalArgumentException("Cle attendue dupliquee");
}
if (expected.size()!=3) throw new IllegalArgumentException("Le fichier attendu doit contenir les 3 lignes du test SQL Server.");
globalMap.put("RS_EXPECTED", expected);
globalMap.put("RS_SEEN", new java.util.HashSet<java.math.BigDecimal>());
'''
COUNTERS='''int incoming=((Number)globalMap.get("tFileInputDelimited_1_NB_LINE")).intValue();
int processed=((Number)globalMap.get("tDBOutput_1_NB_LINE")).intValue();
int rejected=((Number)globalMap.get("tDBOutput_1_NB_LINE_REJECTED")).intValue();
if (incoming!=8 || processed!=8 || rejected!=0) throw new IllegalStateException("Flux incomplet ou rejets : input="+incoming+", output="+processed+", rejected="+rejected);
Object unknownValue=globalMap.get("tDBOutput_1_NB_LINE_BATCH_UNKNOWN");
int unknown=unknownValue instanceof Number ? ((Number)unknownValue).intValue() : 0;
if (unknown==0) {
    if (((Number)globalMap.get("tDBOutput_1_NB_LINE_INSERTED")).intValue()!=4
            || ((Number)globalMap.get("tDBOutput_1_NB_LINE_UPDATED")).intValue()!=3
            || ((Number)globalMap.get("tDBOutput_1_NB_LINE_DELETED")).intValue()!=1)
        throw new IllegalStateException("Compteurs attendus : 4 insertions, 3 mises a jour, 1 suppression.");
} else {
    System.out.println("Compteurs JDBC partiellement inconnus ("+unknown+" commandes) : verification du resultat SQL complet avant commit.");
}
'''
VERIFY='''java.math.BigDecimal checkedId=verifyRows.actor_id.stripTrailingZeros();
java.util.Map<java.math.BigDecimal,java.util.List<String>> expectedRows=(java.util.Map<java.math.BigDecimal,java.util.List<String>>)globalMap.get("RS_EXPECTED");
java.util.Set<java.math.BigDecimal> seenRows=(java.util.Set<java.math.BigDecimal>)globalMap.get("RS_SEEN");
java.util.List<String> wanted=expectedRows.get(checkedId);
if (wanted==null || !seenRows.add(checkedId)) throw new IllegalStateException("Cle inattendue ou dupliquee : "+checkedId);
String actualDate=verifyRows.last_update==null ? null : TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",verifyRows.last_update);
if (!java.util.Objects.equals(wanted.get(0),verifyRows.first_name)
        || !java.util.Objects.equals(wanted.get(1),verifyRows.last_name)
        || !java.util.Objects.equals(wanted.get(2),actualDate))
    throw new IllegalStateException("Valeurs incorrectes pour actor_id="+checkedId+" : "+verifyRows.first_name+" / "+verifyRows.last_name+" / "+actualDate);
'''
FINAL='''java.util.Map<?,?> expected=(java.util.Map<?,?>)globalMap.get("RS_EXPECTED");
java.util.Set<?> seen=(java.util.Set<?>)globalMap.get("RS_SEEN");
if (seen.size()!=expected.size()) throw new IllegalStateException("Nombre de lignes relues incorrect : "+seen.size()+" au lieu de "+expected.size());
System.out.println("Resultat SQL conforme aux 3 lignes attendues, sur la connexion partagee avant commit.");
'''

def setp(*a,**kw):return util.setp(*a,**kw)
def defaults(component,name,x,y,code=None):
 n=util.defaults(component,name,code);n.set('posX',str(x));n.set('posY',str(y));return n

def trigger(r,source,target,kind='SUBJOB_OK',condition=None):
 style={'SUBJOB_OK':1,'COMPONENT_OK':3,'RUN_IF':6}[kind]
 c=E.SubElement(r,'connection',{'connectorName':kind,'label':{'SUBJOB_OK':'OnSubjobOk','COMPONENT_OK':'OnComponentOk','RUN_IF':'If_Transaction_Open'}[kind],'lineStyle':str(style),'metaname':'','offsetLabelX':'0','offsetLabelY':'0','source':source,'target':target})
 setp(c,'UNIQUE_NAME',kind+'_'+uuid.uuid4().hex[:8])
 if condition:setp(c,'CONDITION',condition,'MEMO_JAVA')

def schema(node,metadata,flowname,connector='FLOW'):
 m=copy.deepcopy(metadata);m.set('connector',connector);m.set('name',flowname);m.set('label','metadata')
 node.append(m);return m

def main():
 assert not OUT.exists(),OUT
 source=WORK/'process/testStrategy_0.1.item';prop=source.with_suffix('.properties');original=E.parse(source).getroot();properties=E.parse(prop).getroot()
 source_hash={str(p):hashlib.sha256(p.read_bytes()).hexdigest() for p in [source,prop,INPUT,EXPECTED]}
 proc=OUT/'native/TEST/process';proc.mkdir(parents=True);shutil_project=OUT/'native/TEST/talend.project';shutil_project.write_bytes((WORK/'talend.project').read_bytes())
 manifest=[]
 configs=[('PostgreSQL','Postgresql','postgres_id','V9_X','5432','public'),('MySQL','Mysql','mysql_id','MYSQL_8','3306',''),('Oracle','Oracle','oracle_id','ORACLE_18','1521','')]
 for label,db,mapping,version,port,default_schema in configs:
  job='testStrategy_'+label;r=copy.deepcopy(original);r.set('xmlns:TalendMapper',util.NS['TalendMapper'])
  for child in list(r):
   if child.tag in ['node','connection','subjob','context']:r.remove(child)
  parameters=r.find('parameters')
  # Retain routines; discard inherited implicit-context/stat-log database credentials.
  for child in list(parameters):
   if child.tag=='elementParameter':parameters.remove(child)
  for key in ['ON_STATCATCHER_FLAG','ON_LOGCATCHER_FLAG','ON_METERCATCHER_FLAG','IMPLICIT_TCONTEXTLOAD','IMPLICITCONTEXT_USE_PROJECT_SETTINGS','STATANDLOG_USE_PROJECT_SETTINGS','MULTI_THREAD_EXECATION']:
   setp(parameters,key,'false','CHECK')
  setp(parameters,'LOG4J_RUN_LEVEL','Error','CLOSED_LIST')
  context=E.Element('context',{'confirmationNeeded':'false','hide':'false','name':'Default'})
  fields=[('dbHost','id_String',''),('dbPort','id_String',port),('dbName','id_String',''),('dbSchema','id_String',default_schema),('dbUser','id_String',''),('dbPassword','id_Password',''),('tableName','id_String','ACTORS_STRATEGY_TEST' if db=='Oracle' else 'actors_strategy_test'),('batchSize','id_Integer','50000'),('inputFile','id_String',str(INPUT)),('expectedFile','id_String',str(EXPECTED))]
  for name,typ,value in fields:E.SubElement(context,'contextParameter',{'name':name,'type':typ,'value':value,'prompt':name+'?','promptNeeded':'false','comment':'Base/service Oracle' if name=='dbName' else '', 'repositoryContextId':'built-in','internalId':util.uid()})
  r.insert(0,context)
  reader=copy.deepcopy(original.findall('node')[0]);mapper=copy.deepcopy(original.find("node[@componentName='tMap']"))
  util.cleanrefs(reader)
  reader.set('posX','96');reader.set('posY','288');mapper.set('posX','352');mapper.set('posY','288')
  setp(reader,'FILENAME','context.inputFile','FILE');setp(reader,'DIE_ON_ERROR','true','CHECK')
  for e in mapper.findall('elementParameter'):
   if e.get('name')=='PREVIEW':mapper.remove(e)
  connection=defaults('t'+db+'Connection','tDBConnection_1',352,48)
  for name,value in [('HOST','context.dbHost'),('PORT','context.dbPort'),('DBNAME','context.dbName'),('USER','context.dbUser'),('PASS','context.dbPassword'),('SCHEMA_DB','context.dbSchema'),('DB_VERSION',version),('AUTO_COMMIT','false'),('USE_SHARED_CONNECTION','false'),('SPECIFY_DATASOURCE_ALIAS','false')]:setp(connection,name,value,'PASSWORD' if name=='PASS' else 'CHECK' if name in ['AUTO_COMMIT','USE_SHARED_CONNECTION','SPECIFY_DATASOURCE_ALIAS'] else 'CLOSED_LIST' if name=='DB_VERSION' else 'TEXT')
  if db=='Oracle':setp(connection,'CONNECTION_TYPE','ORACLE_SERVICE_NAME','CLOSED_LIST')
  setp(connection,'PROPERTY:PROPERTY_TYPE','BUILT_IN','TECHNICAL')
  output=defaults('t'+db+'Output','tDBOutput_1',576,288)
  for name,value,field in [('PROPERTY:PROPERTY_TYPE','BUILT_IN','TECHNICAL'),('SCHEMA:SCHEMA_TYPE','BUILT_IN','TECHNICAL'),('MAPPING',mapping,'MAPPING_TYPE'),('USE_EXISTING_CONNECTION','true','CHECK'),('CONNECTION','tDBConnection_1','COMPONENT_LIST'),('DB_VERSION',version,'CLOSED_LIST'),('TABLE','context.tableName','DBTABLE'),('TABLE_ACTION','DROP_IF_EXISTS_AND_CREATE','CLOSED_LIST'),('DATA_ACTION','RELATIONAL_STRATEGY','CLOSED_LIST'),('RELATIONAL_STRATEGY_COLUMN','updateStrategy','COLUMN_LIST'),('RELATIONAL_STRATEGY_BATCH_SIZE','context.batchSize','TEXT'),('USE_BATCH_SIZE','true','CHECK'),('DIE_ON_ERROR','true','CHECK'),('USE_FIELD_OPTIONS','false','CHECK'),('COMMIT_EVERY','0','TEXT'),('SUPPORT_NULL_WHERE','false','CHECK'),('USE_SPATIAL_OPTIONS','false','CHECK'),('ENABLE_DEBUG_MODE','false','CHECK')]:setp(output,name,value,field)
  types={'actor_id':{'Postgresql':'NUMERIC','Mysql':'DECIMAL','Oracle':'NUMBER'}[db],'first_name':'VARCHAR2' if db=='Oracle' else 'VARCHAR','last_name':'VARCHAR2' if db=='Oracle' else 'VARCHAR','last_update':'DATETIME' if db=='Mysql' else 'TIMESTAMP','updateStrategy':'VARCHAR2' if db=='Oracle' else 'VARCHAR'}
  source_output=original.find("node[@componentName='tMSSqlOutput']/metadata[@connector='FLOW']")
  meta=schema(output,source_output,'tDBOutput_1')
  for col in meta.findall('column'):
   col.set('sourceType',types[col.get('name')]);col.set('key',str(col.get('name')=='actor_id').lower())
   if col.get('name')=='last_update':col.set('pattern','"yyyy-MM-dd HH:mm:ss"');col.set('length','29')
  if db=='Oracle':setp(output,'CONVERT_COLUMN_TABLE_TO_UPPERCASE','true','CHECK');setp(output,'USE_TIMESTAMP_FOR_DATE_TYPE','true','CHECK')
  # Re-read the uncommitted result on the same connection, before any commit.
  verification=defaults('t'+db+'Input','tDBInput_Verify',352,480)
  for name,value,field in [('PROPERTY:PROPERTY_TYPE','BUILT_IN','TECHNICAL'),('SCHEMA:SCHEMA_TYPE','BUILT_IN','TECHNICAL'),('MAPPING',mapping,'MAPPING_TYPE'),('DB_VERSION',version,'CLOSED_LIST'),('USE_EXISTING_CONNECTION','true','CHECK'),('CONNECTION','tDBConnection_1','COMPONENT_LIST'),('USE_PREPAREDSTATEMENT','false','CHECK'),('DIE_ON_ERROR','true','CHECK')]:setp(verification,name,value,field)
  quote='`' if db=='Mysql' else '"'
  def q(expr):return util.java(quote)+' + '+expr+' + '+util.java(quote)
  table=q('context.tableName')
  if db!='Mysql':table='(context.dbSchema.isEmpty() ? "" : '+q('context.dbSchema.toUpperCase(java.util.Locale.ROOT)' if db=='Oracle' else 'context.dbSchema')+' + ".") + '+table
  query=util.java('SELECT actor_id, first_name, last_name, last_update FROM ')+' + '+table+' + '+util.java(' ORDER BY actor_id')
  setp(verification,'QUERY',query,'MEMO_SQL');setp(verification,'TABLE','context.tableName','DBTABLE')
  vm=schema(verification,meta,'verifyRows')
  vm.remove(next(col for col in vm.findall('column') if col.get('name')=='updateStrategy'))
  verifier=defaults('tJavaRow','tJavaRow_Verify',576,480,VERIFY);schema(verifier,vm,'tJavaRow_Verify')
  config=defaults('tJava','tJava_Config',96,48,CONFIG)
  opened=defaults('tJava','tJava_TxOpened',576,48,'globalMap.put("RS_TX_OPEN", Boolean.TRUE);')
  counters=defaults('tJava','tJava_Counters',96,480,COUNTERS)
  final=defaults('tJava','tJava_FinalCheck',96,672,FINAL)
  commit=defaults('t'+db+'Commit','tDBCommit_1',352,672);setp(commit,'CONNECTION','tDBConnection_1','COMPONENT_LIST');setp(commit,'CLOSE','false','CHECK')
  committed=defaults('tJava','tJava_Committed',576,672,'globalMap.put("RS_TX_OPEN", Boolean.FALSE);')
  close=defaults('t'+db+'Close','tDBClose_1',800,672);setp(close,'CONNECTION','tDBConnection_1','COMPONENT_LIST')
  result=defaults('tJava','tJava_Result',1024,672,'System.out.println("'+job+' : INSERT / UPDATE / DELETE / UPSERT OK ; 3 lignes conformes ; transaction validee et connexion fermee.");')
  post=defaults('tPostjob','tPostjob_1',96,864)
  cleanup=defaults('tJava','tJava_Cleanup',352,864,'// Le rollback ne s execute que si la transaction est encore ouverte.')
  rollback=defaults('t'+db+'Rollback','tDBRollback_1',576,864);setp(rollback,'CONNECTION','tDBConnection_1','COMPONENT_LIST');setp(rollback,'CLOSE','true','CHECK')
  for n in [config,connection,opened,reader,mapper,output,counters,verification,verifier,final,commit,committed,close,result,post,cleanup,rollback]:r.append(n)
  for edge in original.findall('connection'):r.append(copy.deepcopy(edge))
  E.SubElement(r,'connection',{'connectorName':'FLOW','label':'verifyRows','lineStyle':'0','metaname':'verifyRows','offsetLabelX':'0','offsetLabelY':'0','source':'tDBInput_Verify','target':'tJavaRow_Verify'})
  for a,z in [('tJava_Config','tDBConnection_1'),('tDBConnection_1','tJava_TxOpened'),('tJava_TxOpened','tFileInputDelimited_1'),('tFileInputDelimited_1','tJava_Counters'),('tJava_Counters','tDBInput_Verify'),('tDBInput_Verify','tJava_FinalCheck'),('tJava_FinalCheck','tDBCommit_1'),('tDBCommit_1','tJava_Committed'),('tJava_Committed','tDBClose_1'),('tDBClose_1','tJava_Result')]:trigger(r,a,z)
  trigger(r,'tPostjob_1','tJava_Cleanup','COMPONENT_OK');trigger(r,'tJava_Cleanup','tDBRollback_1','RUN_IF','Boolean.TRUE.equals(globalMap.get("RS_TX_OPEN"))')
  item=proc/(job+'_0.1.item');util.write_xml(r,item)
  pr=copy.deepcopy(properties);ids={e.get(util.XMI+'id'):util.uid() for e in pr.iter() if e.get(util.XMI+'id')}
  for e in pr.iter():
   for k,v in list(e.attrib.items()):
    if v in ids:e.set(k,ids[v])
  property_=next(e for e in pr if e.tag.endswith('Property'));property_.set('id',util.uid());property_.set('label',job);property_.set('displayName',job);property_.set('purpose','Verifier relationalStrategy avec une connexion partagee '+label);property_.set('description','8 operations puis relecture et comparaison au fichier attendu avant commit. Parametres de connexion a renseigner. Table de test recreee a chaque execution.')
  now=datetime.datetime.now().astimezone().strftime('%Y-%m-%dT%H:%M:%S.000%z')
  for e in property_.findall('additionalProperties'):
   if e.get('key') in ['created_date','modified_date']:e.set('value',now)
   if e.get('key') in ['created_product_version','modified_product_version']:e.set('value','8.9.0.20261030-2350-SNAPSHOT')
  next(e for e in pr if e.tag.endswith('ItemState')).set('path','')
  next(e for e in pr.iter() if e.tag=='process').set('href',job+'_0.1.item#/');util.write_xml(pr,item.with_suffix('.properties'))
  manifest.append({'job':job,'database':label,'input_file':str(INPUT),'expected_file':str(EXPECTED),'table_default':dict((n,v) for n,t,v in fields)['tableName'],'connection':'tDBConnection_1','autocommit':False,'batch_size':50000,'expected_counters':{'input':8,'inserted':4,'updated':3,'deleted':1,'rejected':0},'connection_settings_required':True})
 for name,digest in source_hash.items():assert hashlib.sha256(Path(name).read_bytes()).hexdigest()==digest
 (OUT/'manifest.json').write_text(json.dumps({'jobs':manifest,'unchanged_sources':source_hash},indent=2))
 with zipfile.ZipFile(OUT/'testStrategy_shared_connections.zip','w',zipfile.ZIP_DEFLATED) as z:
  for p in (OUT/'native').rglob('*'):
   if p.is_file():z.write(p,p.relative_to(OUT/'native'))
 print('Prepared:',OUT);print('Jobs:',[j['job'] for j in manifest]);print('No database connection or SQL execution. Original job and CSVs unchanged.')
if __name__=='__main__':main()
