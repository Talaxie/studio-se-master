#!/usr/bin/env python3
"""Create local four-engine Dynamic DML recipe jobs using private connection fixtures."""
import argparse,copy,json,uuid,re
from datetime import datetime
from pathlib import Path
from urllib.parse import urlparse
import xml.etree.ElementTree as E
from create_test_jobs import parameter,schema,node,write_xml,XMI,PROPERTIES
p=argparse.ArgumentParser(description=__doc__)
p.add_argument('--template',required=True,type=Path);p.add_argument('--connections',required=True,type=Path);p.add_argument('--queries',required=True,type=Path);p.add_argument('--output',required=True,type=Path)
a=p.parse_args();folder=a.output.resolve();folder.mkdir(parents=True,exist_ok=True,mode=0o700);results=folder/'results';results.mkdir(exist_ok=True)
private=dict(l.split('=',1) for l in a.connections.read_text().splitlines() if '=' in l and not l.startswith('#'));queries={e.get('key'):e.text for e in E.parse(a.queries).getroot().findall('entry')};base=E.parse(a.template).getroot();manifest=[]
def setp(n,k,v,f='TEXT'):
 ep=n.find('elementParameter[@name="'+k+'"]')
 if ep is not None:ep.set('value',v)
 else:parameter(n,k,v,f)
def add(root,kind,cols,x,y):
 name=kind+'_'+str(1+sum(n.get('componentName')==kind for n in root.findall('node')));n=node(root,kind,name,x);n.set('posY',str(y));schema(n,name,cols);return name,n
def link(root,s,t,meta,connector='FLOW'):
 E.SubElement(root,'connection',connectorName=connector,label=('OnSubjobOk' if connector=='SUBJOB_OK' else 'row')+str(1+len(root.findall('connection'))),lineStyle='1' if connector=='SUBJOB_OK' else '0',metaname=meta,source=s,target=t,offsetLabelX='0',offsetLabelY='0')
for db,component,mapping in [('mssql','MSSql','id_MSSQL'),('oracle','Oracle','oracle_id'),('mysql','Mysql','mysql_id'),('postgres','Postgresql','postgres_id')]:
 url=private[db+'.url'];uri=urlparse(url.replace('jdbc:oracle:thin:@//','oracle://').removeprefix('jdbc:').split(';',1)[0]);database=re.search(r';database(?:Name)?=([^;]+)',url,re.I)[1] if db=='mssql' else uri.path[1:]
 def quote(v):
  q='`' if db=='mysql' else '[' if db=='mssql' else '"';end=']' if q=='[' else q;return q+v.replace(end,end+end)+end
 for action,variant in [(x,'mixed') for x in ['UPDATE','DELETE','INSERT_OR_UPDATE','UPDATE_OR_INSERT']]+[('UPDATE_OR_INSERT','reject'),('UPDATE','empty')]+([('UPSERT','mixed')] if db=='postgres' else [('INSERT_ON_DUPLICATE_KEY_UPDATE','mixed'),('UPDATE_OR_INSERT','nochange')] if db=='mysql' else [('INSERT_IF_NOT_EXIST','mixed')] if db=='mssql' else []):
  suffix={'INSERT_OR_UPDATE':'INS_UPD','UPDATE_OR_INSERT':'UPD_INS','INSERT_ON_DUPLICATE_KEY_UPDATE':'ON_DUP','INSERT_IF_NOT_EXIST':'INS_ABSENT'}.get(action,action)
  name='TEST_DYN_DML_'+db.upper()+'_'+suffix+('' if variant=='mixed' else '_'+variant.upper());table='TDYN_GUI_DML_'+db.upper()+'_'+suffix[:8]+('E' if variant=='empty' else 'R' if variant=='reject' else 'N' if variant=='nochange' else '');assert len(table)<=30
  root=copy.deepcopy(base)
  for c in root.findall('node')+root.findall('connection'):root.remove(c)
  context=root.find('context');context.clear();context.set('name','Default');context.set('confirmationNeeded','false')
  for key,value in [('DB_HOST',uri.hostname),('DB_PORT',str(uri.port)),('DB_NAME',database),('DB_SCHEMA','dbo' if db=='mssql' else 'public' if db=='postgres' else ''),('DB_USER',private[db+'.user']),('DB_PASSWORD',private[db+'.password']),('OUTPUT_DIRECTORY',str(results)),('TEST_TABLE',table)]:E.SubElement(context,'contextParameter',comment='',name=key,prompt=key,promptNeeded='false',type='id_Password' if key=='DB_PASSWORD' else 'id_String',value=value)
  def connection(n):
   for key,value,field in [('MAPPING',mapping,'TEXT'),('HOST','context.DB_HOST','TEXT'),('PORT','context.DB_PORT','TEXT'),('DBNAME','context.DB_NAME','TEXT'),('DB_SCHEMA','context.DB_SCHEMA','TEXT'),('SCHEMA_DB','context.DB_SCHEMA','TEXT'),('TABLESCHEMA','context.DB_SCHEMA','TEXT'),('USER','context.DB_USER','TEXT'),('PASS','context.DB_PASSWORD','PASSWORD'),('DRIVER','MSSQL_PROP','CLOSED_LIST'),('USE_EXISTING_CONNECTION','false','CHECK'),('CONNECTION_TYPE','ORACLE_SERVICE_NAME','CLOSED_LIST'),('DB_VERSION','ORACLE_18' if db=='oracle' else 'MYSQL_8' if db=='mysql' else 'V9_X','CLOSED_LIST'),('PROPERTIES','"encrypt=true;trustServerCertificate=true;loginTimeout=10"' if db=='mssql' else '"useAffectedRows=true"' if variant=='nochange' else '""','TEXT')]:setp(n,key,value,field)
  def sqlrow(sql,x,y):
   name,n=add(root,'t'+component+'Row',[],x,y);connection(n);setp(n,'QUERY',json.dumps(sql,ensure_ascii=False),'MEMO_SQL');setp(n,'DIE_ON_ERROR','true','CHECK');return name
  chars='VARCHAR2' if db=='oracle' else 'VARCHAR';national='NVARCHAR2' if db=='oracle' else 'NVARCHAR' if db=='mssql' else 'VARCHAR';empty=variant=='empty';qt=quote(table)
  ddl='CREATE TABLE '+qt+' ('+quote('AGENCE')+' '+chars+'(10), '+quote('MOIS')+' '+chars+'(6)'+('' if empty else ', '+quote('MONTANT')+' DECIMAL(38,10), '+quote('TEXTE')+' '+national+'(30)')+', UNIQUE ('+quote('AGENCE')+')'+(', CHECK ('+quote('TEXTE')+" <> 'bad')" if variant=='reject' else '')+')'
  start=sqlrow(ddl,128,128)
  seeded=sqlrow('INSERT INTO '+qt+" VALUES ('K1','S1'"+('' if empty else ",99,'legacy'")+')',400,128);link(root,start,seeded,start,'SUBJOB_OK')
  keep=sqlrow('INSERT INTO '+qt+" VALUES ('KEEP','S1'"+('' if empty else ",99,'legacy'")+')',700,128);link(root,seeded,keep,seeded,'SUBJOB_OK')
  cols=[('AGENCE','id_String'),('MOIS','id_String'),('SQL','id_Dynamic')]
  source,n=add(root,'t'+component+'Input',cols,128,360);connection(n);setp(n,'QUERY',json.dumps(queries[db+'.'+variant],ensure_ascii=False),'MEMO_SQL');link(root,keep,source,keep,'SUBJOB_OK')
  output,n=add(root,'t'+component+'Output',cols,400,360);connection(n)
  n.find('metadata/column[@name="AGENCE"]').set('key','true')
  for key,value,field in [('TABLE','context.TEST_TABLE','TABLE'),('TABLE_ACTION','NONE','CLOSED_LIST'),('DATA_ACTION',action,'CLOSED_LIST'),('USE_BATCH_SIZE','true','CHECK'),('BATCH_SIZE','2','TEXT'),('COMMIT_EVERY','3','TEXT'),('SUPPORT_NULL_WHERE','true','CHECK'),('DIE_ON_ERROR','false' if variant=='reject' else 'true','CHECK'),('EXTENDINSERT','false','CHECK'),('ON_DUPLICATE_KEY_UPDATE','false','CHECK'),('CONVERT_COLUMN_TABLE_TO_LOWERCASE','false','CHECK'),('CONVERT_COLUMN_TABLE_TO_UPPERCASE','false','CHECK')]:setp(n,key,value,field)
  link(root,source,output,source)
  if variant=='reject':
   rejected=cols+[('errorCode','id_String'),('errorMessage','id_String')];schema(n,'REJECT',rejected,'REJECT')
   for c in n.findall('metadata')[-1].findall('column')[-2:]:c.set('custom','true')
   rejectlog,n=add(root,'tLogRow',rejected,700,360);setp(n,'TABLE_PRINT','true','CHECK');setp(n,'BASIC_PRINT','false','CHECK');link(root,output,rejectlog,'REJECT','REJECT')
  read,n=add(root,'t'+component+'Input',[('SQL','id_Dynamic')],128,600);connection(n);setp(n,'QUERY',json.dumps('SELECT * FROM '+qt+' ORDER BY '+quote('AGENCE')),'MEMO_SQL');link(root,source,read,source,'SUBJOB_OK')
  log,n=add(root,'tLogRow',[('SQL','id_Dynamic')],400,600);setp(n,'TABLE_PRINT','true','CHECK');setp(n,'BASIC_PRINT','false','CHECK');link(root,read,log,read)
  out,n=add(root,'tFileOutputDelimited',[('SQL','id_Dynamic')],700,600)
  for key,value,field in [('FILENAME','context.OUTPUT_DIRECTORY + "/'+name+'.csv"','FILE'),('ENCODING','"UTF-8"','ENCODING_TYPE'),('FIELDSEPARATOR','";"','TEXT'),('ROWSEPARATOR','"\\n"','TEXT'),('CSV_OPTION','true','CHECK'),('INCLUDEHEADER','true','CHECK'),('APPEND','false','CHECK'),('CREATE','true','CHECK'),('FILE_EXIST_EXCEPTION','false','CHECK'),('TEXT_ENCLOSURE','"\\\""','TEXT'),('ESCAPE_CHAR','"\\\""','TEXT')]:setp(n,key,value,field)
  link(root,log,out,log);drop=sqlrow('DROP TABLE '+qt,128,840);link(root,read,drop,read,'SUBJOB_OK')
  directory=folder/'DYNAMIC_SCHEMA_TEST/process';write_xml(directory/(name+'_0.1.item'),root)
  u=['_'+uuid.uuid4().hex for _ in range(4)];props=E.Element(f'{{{XMI}}}XMI',{f'{{{XMI}}}version':'2.0'});prop=E.SubElement(props,f'{{{PROPERTIES}}}Property',{f'{{{XMI}}}id':u[0],'id':u[1],'label':name,'displayName':name,'version':'0.1','item':u[3]});stamp=datetime.now().astimezone().strftime('%Y-%m-%dT%H:%M:%S.%f')[:-3]+datetime.now().astimezone().strftime('%z')
  for key in ['created_date','modified_date']:E.SubElement(prop,'additionalProperties',{f'{{{XMI}}}id':'_'+uuid.uuid4().hex,'key':key,'value':stamp})
  E.SubElement(props,f'{{{PROPERTIES}}}ItemState',{f'{{{XMI}}}id':u[2],'path':''});item=E.SubElement(props,f'{{{PROPERTIES}}}ProcessItem',{f'{{{XMI}}}id':u[3],'property':u[0],'state':u[2]});E.SubElement(item,'process',href=name+'_0.1.item#/');write_xml(directory/(name+'_0.1.properties'),props);(directory/(name+'_0.1.item')).chmod(0o600)
  manifest.append({'name':name,'database':db,'action':action,'variant':variant,'table':table})
(folder/'jobs.json').write_text(json.dumps(manifest,indent=2)+'\n');print('Generated',len(manifest),'local DML jobs')
