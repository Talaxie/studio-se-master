#!/usr/bin/env python3
"""Prepare native Studio benchmark jobs and deterministic fixtures; never connect to SQL."""
from pathlib import Path
from datetime import datetime
from zoneinfo import ZoneInfo
import copy,csv,hashlib,json,uuid,zipfile,xml.etree.ElementTree as E

SOURCE=Path('/Applications/Talaxie-8.9-ogf/workspace-strategy/TEST')
OUT=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/benchmark')
COMPONENTS=Path(__file__).resolve().parents[3]/'main/plugins/org.talend.designer.components.localprovider/components'
XMI='{http://www.omg.org/XMI}'
NS={'xmi':'http://www.omg.org/XMI','xsi':'http://www.w3.org/2001/XMLSchema-instance','TalendMapper':'http://www.talend.org/mapper','talendfile':'platform:/resource/org.talend.model/model/TalendFile.xsd','TalendProperties':'http://www.talend.org/properties'}
for k,v in NS.items():E.register_namespace(k,v)

def uid():return '_'+uuid.uuid4().hex

def setp(node,name,value,field='TEXT'):
 p=next((p for p in node.findall('elementParameter') if p.get('name')==name),None)
 if p is None:p=E.SubElement(node,'elementParameter',{'name':name,'field':field})
 p.set('value',str(value));return p

def cleanrefs(node):
 for p in node.findall('elementParameter'):
  name=p.get('name','')
  if name.endswith(':PROPERTY_TYPE') or name.endswith(':SCHEMA_TYPE'):p.set('value','BUILT_IN')
  if ':REPOSITORY_' in name:p.set('value','')


def java(value):return json.dumps(value,ensure_ascii=False)

def defaults(component,name,code=None):
 doc=E.parse(COMPONENTS/component/(component+'_java.xml')).getroot()
 n=E.Element('node',{'componentName':component,'componentVersion':doc.find('HEADER').get('VERSION'),'offsetLabelX':'0','offsetLabelY':'0','posX':'96','posY':'64'})
 setp(n,'UNIQUE_NAME',name)
 for p in doc.findall('./PARAMETERS/PARAMETER')+doc.findall('./ADVANCED_PARAMETERS/PARAMETER'):
  d=p.find('DEFAULT');items=p.find('ITEMS')
  val=d.text if d is not None else (items.get('DEFAULT') if items is not None else '')
  if p.get('FIELD')=='TABLE':E.SubElement(n,'elementParameter',{'name':p.get('NAME'),'field':'TABLE'});continue
  setp(n,p.get('NAME'),val or '',p.get('FIELD'))
 if code is not None:setp(n,'CODE',code,'MEMO_JAVA')
 return n


def conn(root,source,target):
 c=E.SubElement(root,'connection',{'connectorName':'SUBJOB_OK','label':'OnSubjobOk','lineStyle':'1','metaname':'','offsetLabelX':'0','offsetLabelY':'0','source':source,'target':target})
 setp(c,'UNIQUE_NAME','OnSubjobOk_'+uid()[1:9])


def write_xml(root,path):
 E.indent(root,space='  ');E.ElementTree(root).write(path,encoding='UTF-8',xml_declaration=True)


def main():
 assert not OUT.exists(),f'Output already exists: {OUT}'
 original=SOURCE/'process/testStrategy_0.1.item'
 original_hash=hashlib.sha256(original.read_bytes()).hexdigest()
 template=E.parse(original).getroot();props=E.parse(SOURCE/'process/testStrategy_0.1.properties').getroot()
 OUT.mkdir(parents=True);(OUT/'data').mkdir();(OUT/'results').mkdir()
 native=OUT/'native/TEST';proc=native/'process/RelationalBenchmark';proc.mkdir(parents=True)
 (native/'talend.project').write_bytes((SOURCE/'talend.project').read_bytes())
 now=datetime.now(ZoneInfo('Europe/Paris')).isoformat(timespec='seconds')
 scenarios=['INSERT','UPDATE','DELETE','UPSERT']
 header=['actor_id','first_name','last_name','last_update','updateStrategy']
 for count in [10000,100000]:
  for scenario in scenarios:
   p=OUT/'data'/f'actor_{scenario.lower()}_{count}.csv'
   with p.open('w',encoding='utf-8',newline='') as f:
    w=csv.writer(f,delimiter=';',lineterminator='\n');w.writerow(header)
    for i in range(1,count+1):w.writerow([i,f'F{i:06}',f'L{i:06}','2026-10-30 10:00:00',scenario])

 variants=[]
 for scenario in scenarios:
  modes=['strategy','classic_row']+([] if scenario=='UPSERT' else ['classic_batch'])
  for mode in modes:variants.append((scenario,mode))

 target=next(n for n in template.findall('node') if n.get('componentName')=='tMSSqlOutput')
 connection_params={p.get('name'):copy.deepcopy(p) for p in target.findall('elementParameter') if p.get('name') in ['DRIVER','HOST','PORT','DBNAME','USER','PASS','PROPERTIES','ACTIVE_DIR_AUTH']}
 manifest=[]
 for scenario,mode in variants:
  label='bench_'+scenario.lower()+'_'+mode
  r=copy.deepcopy(template)
  r.set('xmlns:TalendMapper',NS['TalendMapper'])
  # Retain local routines and project metadata, but remove old graphical cache references.
  for c in list(r):
   if c.tag in ['connection','subjob']:r.remove(c)
  for c in r.findall('context'):r.remove(c)
  context=E.Element('context',{'confirmationNeeded':'false','hide':'false','name':'Default'})
  contexts=[('rowCount','id_Integer','10000'),('batchSize','id_Integer','50000'),('commitEvery','id_Integer','50000'),('iteration','id_Integer','1'),('warmup','id_Boolean','true'),('benchmarkDir','id_String',str(OUT))]
  for name,typ,value in contexts:E.SubElement(context,'contextParameter',{'comment':'','name':name,'prompt':name+'?','promptNeeded':'false','repositoryContextId':'','type':typ,'value':value})
  r.insert(0,context)
  parameters=r.find('parameters')
  setp(parameters,'ON_STATCATCHER_FLAG','false','CHECK');setp(parameters,'ON_LOGCATCHER_FLAG','false','CHECK');setp(parameters,'ON_METERCATCHER_FLAG','false','CHECK')
  setp(parameters,'LOG4J_RUN_LEVEL','Error','CLOSED_LIST')
  inp,mapper,out=r.findall('node')
  cleanrefs(inp);cleanrefs(out)
  setp(inp,'FILENAME','context.benchmarkDir + "/data/actor_'+scenario.lower()+'_" + context.rowCount + ".csv"','FILE')
  setp(inp,'DIE_ON_ERROR','true','CHECK');setp(inp,'HEADER','1');setp(inp,'LABEL','benchmark CSV')
  inp.set('posX','96');inp.set('posY','288');mapper.set('posX','352');mapper.set('posY','288');out.set('posX','576');out.set('posY','288')
  for c in inp.findall('./metadata/column'):
   if c.get('name')=='actor_id':c.set('length','10')
   if c.get('name') in ['first_name','last_name']:c.set('length','50')
  for p in mapper.findall('elementParameter'):
   if p.get('name')=='PREVIEW':mapper.remove(p)
  setp(out,'TABLE','"BENCH_RS_ACTORS"','DBTABLE');setp(out,'DB_SCHEMA','"dbo"');setp(out,'TABLE_ACTION','NONE','CLOSED_LIST')
  setp(out,'DIE_ON_ERROR','true','CHECK');setp(out,'COMMIT_EVERY','context.commitEvery')
  setp(out,'USE_BATCH_SIZE','true' if mode=='classic_batch' else 'false','CHECK');setp(out,'BATCH_SIZE','context.batchSize')
  setp(out,'USE_FIELD_OPTIONS','false','CHECK');setp(out,'DATA_ACTION','RELATIONAL_STRATEGY' if mode=='strategy' else ('UPDATE_OR_INSERT' if scenario=='UPSERT' else scenario),'CLOSED_LIST')
  setp(out,'RELATIONAL_STRATEGY_COLUMN','updateStrategy','COLUMN_LIST')
  setp(out,'ENABLE_DEBUG_MODE','false','CHECK');setp(out,'IDENTITY_INSERT','false','CHECK');setp(out,'SPECIFY_IDENTITY_FIELD','false','CHECK')
  # The classic output receives four SQL columns; the reader still parses the same five fields.
  if mode!='strategy':
   for m in [*mapper.findall('metadata'),*out.findall('metadata')]:
    for c in m.findall('column'):
     if c.get('name')=='updateStrategy':m.remove(c)
   for table in mapper.findall('./nodeData/outputTables'):
    for entry in table.findall('mapperTableEntries'):
     if entry.get('name')=='updateStrategy':table.remove(entry)
  for m in out.findall('metadata'):
   for c in m.findall('column'):c.set('key','true' if c.get('name')=='actor_id' else 'false')

  init_code='''if (context.rowCount != 10000 && context.rowCount != 100000) throw new IllegalArgumentException("rowCount must be 10000 or 100000");
if (context.batchSize < 1 || context.commitEvery < 1) throw new IllegalArgumentException("batchSize and commitEvery must be positive");
java.nio.file.Path input = java.nio.file.Paths.get(context.benchmarkDir, "data", "actor_SCENARIO_" + context.rowCount + ".csv");
if (!java.nio.file.Files.isRegularFile(input)) throw new IllegalArgumentException("Missing input: " + input);
'''.replace('SCENARIO',scenario.lower())
  init=defaults('tJava','tJava_validate',init_code)
  seed='0' if scenario=='INSERT' else ('context.rowCount / 2' if scenario=='UPSERT' else 'context.rowCount')
  setup='''SET NOCOUNT ON;
IF OBJECT_ID(N'dbo.BENCH_RS_ACTORS', N'U') IS NULL
CREATE TABLE dbo.BENCH_RS_ACTORS (actor_id NUMERIC(18,0) NOT NULL PRIMARY KEY, first_name NVARCHAR(50) NOT NULL, last_name NVARCHAR(50) NOT NULL, last_update DATETIME2(0) NOT NULL);
TRUNCATE TABLE dbo.BENCH_RS_ACTORS;
'''
  setup_expr=java(setup)
  if seed!='0':
   setup_expr+=' + "WITH d(n) AS (SELECT n FROM (VALUES (0),(1),(2),(3),(4),(5),(6),(7),(8),(9)) AS v(n)), nums AS (SELECT TOP (" + ('+seed+') + ") ROW_NUMBER() OVER (ORDER BY (SELECT NULL)) AS id FROM d a CROSS JOIN d b CROSS JOIN d c CROSS JOIN d e CROSS JOIN d f) INSERT INTO dbo.BENCH_RS_ACTORS(actor_id,first_name,last_name,last_update) SELECT id,N\'SEED\',N\'BEFORE\',CAST(\'2026-10-29T00:00:00\' AS DATETIME2(0)) FROM nums;"'
  def sqlnode(name,query):
   n=defaults('tMSSqlRow',name)
   for k,v in connection_params.items():
    old=next((e for e in n.findall('elementParameter') if e.get('name')==k),None)
    if old is not None:n.remove(old)
    n.append(copy.deepcopy(v))
   cleanrefs(n);setp(n,'PROPERTY:PROPERTY_TYPE','BUILT_IN','TECHNICAL');setp(n,'DB_SCHEMA','"dbo"');setp(n,'TABLE','"BENCH_RS_ACTORS"','DBTABLE')
   setp(n,'QUERY',query,'MEMO_SQL');setp(n,'DIE_ON_ERROR','true','CHECK');setp(n,'USE_PREPAREDSTATEMENT','false','CHECK')
   setp(n,'COMMIT_EVERY','0');setp(n,'USE_EXISTING_CONNECTION','false','CHECK')
   return n
  prep=sqlnode('tMSSqlRow_prepare',setup_expr);prep.set('posX','352')
  start=defaults('tJava','tJava_start','globalMap.put("BENCH_START_NS", System.nanoTime());');start.set('posX','576')
  stop=defaults('tJava','tJava_stop','globalMap.put("BENCH_ELAPSED_NS", System.nanoTime() - ((Long) globalMap.get("BENCH_START_NS")));');stop.set('posY','480')
  expected='0' if scenario=='DELETE' else 'context.rowCount'
  validation='"IF (SELECT COUNT_BIG(*) FROM dbo.BENCH_RS_ACTORS) <> " + ('+expected+') + " THROW 51000, \'Benchmark: wrong final row count\', 1;"'
  if scenario!='DELETE':
   validation+=' + " IF EXISTS (SELECT 1 FROM dbo.BENCH_RS_ACTORS WHERE actor_id < 1 OR actor_id > " + context.rowCount + " OR first_name <> N\'F\' + RIGHT(\'000000\' + CONVERT(VARCHAR(6),actor_id),6) OR last_name <> N\'L\' + RIGHT(\'000000\' + CONVERT(VARCHAR(6),actor_id),6) OR last_update <> CAST(\'2026-10-30T10:00:00\' AS DATETIME2(0))) THROW 51001, \'Benchmark: wrong final values\', 1;"'
  verify=sqlnode('tMSSqlRow_verify',validation);verify.set('posX','352');verify.set('posY','480')
  report_code='''double elapsedMs = ((Long) globalMap.get("BENCH_ELAPSED_NS")) / 1000000.0;
double rate = context.rowCount * 1000.0 / Math.max(elapsedMs, 0.001);
java.nio.file.Path results = java.nio.file.Paths.get(context.benchmarkDir, "results", "runs.csv");
java.nio.file.Files.createDirectories(results.getParent());
String header = "timestamp;job;scenario;mode;rows;batch_size;commit_every;iteration;warmup;elapsed_ms;rows_per_second;input_rows;inserted;updated;deleted;rejected;validated\\n";
boolean newFile = !java.nio.file.Files.exists(results) || java.nio.file.Files.size(results)==0;
String record = java.time.OffsetDateTime.now() + ";JOB;SCENARIO;MODE;" + context.rowCount + ";" + BATCH_EXPR + ";" + context.commitEvery + ";" + context.iteration + ";" + context.warmup + ";" + String.format(java.util.Locale.ROOT,"%.3f;%.3f",elapsedMs,rate)
 + ";" + globalMap.get("tFileInputDelimited_1_NB_LINE") + ";" + globalMap.get("tDBOutput_1_NB_LINE_INSERTED") + ";" + globalMap.get("tDBOutput_1_NB_LINE_UPDATED") + ";" + globalMap.get("tDBOutput_1_NB_LINE_DELETED") + ";" + globalMap.get("tDBOutput_1_NB_LINE_REJECTED") + ";true\\n";
java.nio.file.Files.write(results, ((newFile?header:"") + record).getBytes(java.nio.charset.StandardCharsets.UTF_8), java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
System.out.println("BENCHMARK JOB: " + String.format(java.util.Locale.ROOT,"%.3f ms; %.1f rows/s",elapsedMs,rate) + "; validation OK; warmup=" + context.warmup);
'''.replace('JOB',label).replace('SCENARIO',scenario).replace('MODE',mode).replace('BATCH_EXPR','context.batchSize' if mode=='classic_batch' else '0')
  report=defaults('tJava','tJava_report',report_code);report.set('posX','576');report.set('posY','480')
  # Nodes precede connections, matching native Studio export order.
  for n in [init,prep,start,stop,verify,report]:r.append(n)
  for c in template.findall('connection'):
   clone=copy.deepcopy(c)
   for param in list(clone):
    if param.get('name')=='TRACES_CONNECTION_FILTER':clone.remove(param)
   r.append(clone)
  conn(r,'tJava_validate','tMSSqlRow_prepare');conn(r,'tMSSqlRow_prepare','tJava_start');conn(r,'tJava_start','tFileInputDelimited_1');conn(r,'tFileInputDelimited_1','tJava_stop');conn(r,'tJava_stop','tMSSqlRow_verify');conn(r,'tMSSqlRow_verify','tJava_report')
  write_xml(r,proc/(label+'_0.1.item'))
  pr=copy.deepcopy(props)
  ids={e.get(XMI+'id'):uid() for e in pr.iter() if e.get(XMI+'id')}
  for e in pr.iter():
   for k,v in list(e.attrib.items()):
    if v in ids:e.set(k,ids[v])
   tag=e.tag.rsplit('}',1)[-1]
   if tag=='Property':e.set('id',uid());e.set('label',label);e.set('displayName',label)
   if tag=='ItemState':e.set('path','RelationalBenchmark')
   if tag=='author':e.set('href','../../talend.project#'+e.get('href').split('#')[-1])
   if tag=='process':e.set('href',label+'_0.1.item#/')
   if tag=='additionalProperties' and e.get('key') in ['created_date','modified_date']:e.set('value',now)
  write_xml(pr,proc/(label+'_0.1.properties'))
  manifest.append({'job':label,'scenario':scenario,'mode':mode,'sizes':[10000,100000],'table':'dbo.BENCH_RS_ACTORS','seed_rows':seed,'expected_final_rows':expected})
 (OUT/'manifest.json').write_text(json.dumps(manifest,indent=2)+'\n')
 archive=OUT/'benchmark_testStrategy.zip'
 with zipfile.ZipFile(archive,'w',zipfile.ZIP_DEFLATED) as z:
  for p in sorted((OUT/'native').rglob('*')):
   if p.is_file():z.write(p,p.relative_to(OUT/'native'))
 archive.chmod(0o600)
 assert hashlib.sha256(original.read_bytes()).hexdigest()==original_hash
 print('Prepared',len(variants),'native jobs and 8 CSV fixtures in',OUT)

if __name__=='__main__':main()
