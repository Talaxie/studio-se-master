#!/usr/bin/env python3
"""Validate native test-job wiring and compile/execute embedded checks; no SQL."""
from pathlib import Path
import xml.etree.ElementTree as E,json,csv,hashlib,subprocess,tempfile
ROOT=Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/shared_connection_tests_20261031')
manifest=json.loads((ROOT/'manifest.json').read_text())
for name,sha in manifest['unchanged_sources'].items():assert hashlib.sha256(Path(name).read_bytes()).hexdigest()==sha,name
ids=set()
with tempfile.TemporaryDirectory(prefix='strategy-shared-job-checks-') as tmp:
 for job in manifest['jobs']:
  p=ROOT/'native/TEST/process'/(job['job']+'_0.1.item');assert dict((prefix,uri) for _,(prefix,uri) in E.iterparse(p,events=['start-ns'])).get('TalendMapper')=='http://www.talend.org/mapper';r=E.parse(p).getroot();nodes={next(e.get('value') for e in n.findall('elementParameter') if e.get('name')=='UNIQUE_NAME'):n for n in r.findall('node')}
  def params(node):return {e.get('name'):e.get('value') for e in node.findall('elementParameter')}
  assert len(nodes)==17
  settings=params(nodes['tDBOutput_1']);assert settings['USE_EXISTING_CONNECTION']=='true' and settings['CONNECTION']=='tDBConnection_1' and settings['RELATIONAL_STRATEGY_COLUMN']=='updateStrategy' and settings['TABLE_ACTION']=='DROP_IF_EXISTS_AND_CREATE'
  assert settings['DATA_ACTION']=='RELATIONAL_STRATEGY' and settings['USE_BATCH_SIZE']=='true' and settings['RELATIONAL_STRATEGY_BATCH_SIZE']=='context.batchSize' and settings['DIE_ON_ERROR']=='true'
  assert [c.get('name') for c in nodes['tDBOutput_1'].find("metadata[@connector='FLOW']").findall('column') if c.get('key')=='true']==['actor_id']
  assert params(nodes['tDBConnection_1'])['AUTO_COMMIT']=='false'
  assert params(nodes['tDBInput_Verify'])['CONNECTION']=='tDBConnection_1' and params(nodes['tDBInput_Verify'])['USE_EXISTING_CONNECTION']=='true'
  assert params(nodes['tDBCommit_1'])['CLOSE']=='false' and params(nodes['tDBRollback_1'])['CLOSE']=='true'
  assert all(params(nodes[n])['CONNECTION']=='tDBConnection_1' for n in ['tDBCommit_1','tDBClose_1','tDBRollback_1'])
  edges=r.findall('connection');assert len(edges)==15
  assert all(c.get('source') in nodes and c.get('target') in nodes for c in edges)
  edge={(c.get('source'),c.get('target')):c for c in edges}
  assert edge['tDBInput_Verify','tJava_FinalCheck'].get('connectorName')=='SUBJOB_OK'
  assert edge['tJava_FinalCheck','tDBCommit_1'].get('connectorName')=='SUBJOB_OK'
  assert edge['tPostjob_1','tJava_Cleanup'].get('connectorName')=='COMPONENT_OK'
  assert params(edge['tJava_Cleanup','tDBRollback_1'])['CONDITION']=='Boolean.TRUE.equals(globalMap.get("RS_TX_OPEN"))'
  # Ensure technical strategy survives the existing mapper and SQL Server dates remain unchanged.
  mapping={e.get('name'):e.get('expression') for e in nodes['tMap_1'].findall('./nodeData/outputTables/mapperTableEntries')}
  assert mapping['updateStrategy'].strip()=='row1.updateStrategy' and 'yyyy-MM-dd HH:mm:ss' in mapping['last_update']
  ctx={e.get('name'):e for e in r.find('context').findall('contextParameter')}
  assert ctx['inputFile'].get('value')==job['input_file'] and ctx['expectedFile'].get('value')==job['expected_file']
  assert ctx['batchSize'].get('value')=='50000' and ctx['dbHost'].get('value')=='10.0.4.18'
  assert ctx['dbPassword'].get('type')=='id_Password'
  assert ctx['connectionReady'].get('value')=='true'
  assert ctx['dbPassword'].get('value').startswith('enc:')
  prop=E.parse(p.with_suffix('.properties')).getroot()
  for e in prop.iter():
   x=e.get('{http://www.omg.org/XMI}id')
   if x:assert x not in ids;ids.add(x)
   if e.tag.endswith('author'):assert (p.parent/e.get('href').split('#')[0]).resolve().is_file()
  code=[];code_names={}
  for name,node in nodes.items():
   if node.get('componentName') in ['tJava','tJavaRow']:
    method='check'+str(len(code));code_names[name]=method;code.append('void '+method+'() throws Exception {\n'+params(node)['CODE']+'\n}')
  query=params(nodes['tDBInput_Verify'])['QUERY']
  fields='\n'.join('String '+n+'='+json.dumps(e.get('value') if n!='dbPassword' else '')+';' for n,e in ctx.items() if e.get('type') in ['id_String','id_Password'])+'\nint batchSize=50000; boolean connectionReady=true;'
  rows=list(csv.DictReader(Path(job['input_file']).open(),delimiter=';'));state={};counts={'INSERT':0,'UPDATE':0,'DELETE':0}
  for row in rows:
   key=int(row['actor_id']);op=row['updateStrategy']
   if op=='DELETE':assert key in state;del state[key];counts['DELETE']+=1
   else:
    if op=='INSERT':assert key not in state;counts['INSERT']+=1
    elif op=='UPDATE':assert key in state;counts['UPDATE']+=1
    else:counts['UPDATE' if key in state else 'INSERT']+=1
    state[key]=row
  assert counts=={'INSERT':4,'UPDATE':3,'DELETE':1} and set(state)=={900001,900002,900004}
  setup='\n'.join('context.'+k+'='+json.dumps(ctx[k].get('value'))+';' for k in ['dbHost','dbName','dbUser','inputFile','expectedFile','tableName','dbSchema'])
  exercise=setup+'\n'+code_names['tJava_Config']+'();\n'
  for k,v in {'tFileInputDelimited_1_NB_LINE':8,'tDBOutput_1_NB_LINE':8,'tDBOutput_1_NB_LINE_INSERTED':4,'tDBOutput_1_NB_LINE_UPDATED':3,'tDBOutput_1_NB_LINE_DELETED':1,'tDBOutput_1_NB_LINE_REJECTED':0,'tDBOutput_1_NB_LINE_BATCH_UNKNOWN':0}.items():exercise+='globalMap.put('+json.dumps(k)+','+str(v)+');\n'
  exercise+=code_names['tJava_Counters']+'();\n'
  for key,row in sorted(state.items()):
   exercise+='verifyRows.actor_id=new java.math.BigDecimal("'+str(key)+'");\n'
   for field in ['first_name','last_name']:exercise+='verifyRows.'+field+'='+json.dumps(row[field])+';\n'
   exercise+='verifyRows.last_update=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse('+json.dumps(row['last_update'])+');\n'+code_names['tJavaRow_Verify']+'();\n'
  exercise+=code_names['tJava_FinalCheck']+'();\n'
  # Check both the normal counters and Oracle's unknown batch-count case.
  exercise+='globalMap.put("tDBOutput_1_NB_LINE_BATCH_UNKNOWN",3); globalMap.put("tDBOutput_1_NB_LINE_INSERTED",1);'+code_names['tJava_Counters']+'();\n'
  exercise+='context.connectionReady=false;try{'+code_names['tJava_Config']+'();throw new AssertionError("Inactive connection accepted");}catch(IllegalStateException expected){}\n'
  source=Path(tmp)/'SharedChecks.java';source.write_text('''import java.util.*;class SharedChecks {
static class C {'''+fields+'''} C context=new C(); Map<String,Object> globalMap=new HashMap<>();
static class Row { java.math.BigDecimal actor_id; String first_name,last_name;java.util.Date last_update; }Row verifyRows=new Row();
static class TalendDate {static String formatDate(String p,java.util.Date d){return new java.text.SimpleDateFormat(p).format(d);}}
'''+ '\n'.join(code)+'\nString query(){return '+query+';}\nvoid exercise() throws Exception{'+exercise+'}\npublic static void main(String[] args)throws Exception{new SharedChecks().exercise();}}')
  subprocess.run(['javac','-proc:none',str(source)],check=True)
  subprocess.run(['java','-cp',tmp,'SharedChecks'],check=True)
  print('PASS:',job['job'],'native graph, shared transaction, encrypted context, same fixtures, counters and row-value assertions; no SQL')
print('PASS: original SQL Server job/files unchanged; 3 native jobs validated')
