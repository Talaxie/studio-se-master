#!/usr/bin/env python3
"""Derive entirely Dynamic and mixed-key Studio recipes from private DML fixtures."""
import argparse,copy,json,uuid
from datetime import datetime
from pathlib import Path
import xml.etree.ElementTree as E
from create_test_jobs import parameter,schema,write_xml,XMI,PROPERTIES
p=argparse.ArgumentParser(description=__doc__);p.add_argument('--base',required=True,type=Path);p.add_argument('--output',required=True,type=Path);a=p.parse_args()
folder=a.output.resolve();folder.mkdir(parents=True,exist_ok=True,mode=0o700);results=folder/'results';results.mkdir(exist_ok=True);manifest=[]
def setp(n,key,value,field='TEXT'):
 ep=n.find('elementParameter[@name="'+key+'"]')
 if ep is None:parameter(n,key,value,field)
 else:ep.set('value',value)
def name(n):return n.find('elementParameter[@name="UNIQUE_NAME"]').get('value')
for record in json.loads((a.base/'jobs.json').read_text()):
 if record['variant']=='empty':continue
 for mode in ['ALL','MIXED']:
  old=record['name'];db=record['database'];job=old.replace('TEST_DYN_DML_','TEST_DYN_KEY_')+'_'+mode
  table='TDYN_NK_'+{'mssql':'MS','oracle':'OR','mysql':'MY','postgres':'PG'}[db]+'_'+{'UPDATE':'U','DELETE':'D','INSERT_OR_UPDATE':'IU','UPDATE_OR_INSERT':'UI','UPSERT':'UPS','INSERT_ON_DUPLICATE_KEY_UPDATE':'DUP','INSERT_IF_NOT_EXIST':'INE'}[record['action']]+'_'+record['variant'][:3].upper()+'_'+mode[0]
  root=E.parse(a.base/'DYNAMIC_SCHEMA_TEST/process'/(old+'_0.1.item')).getroot();context=root.find('context')
  for c in context.findall('contextParameter'):
   if c.get('name')=='TEST_TABLE':c.set('value',table)
   if c.get('name')=='OUTPUT_DIRECTORY':c.set('value',str(results))
  nodes=root.findall('node');source=next(n for n in nodes if n.get('componentName').endswith('Input') and name(n).endswith('_1'));output=next(n for n in nodes if n.get('componentName').endswith('Output') and 'File' not in n.get('componentName'))
  cols=[('SQL','id_Dynamic')] if mode=='ALL' else [('AGENCE','id_String'),('SQL','id_Dynamic')]
  for n in [source,output]:
   for md in n.findall('metadata'):n.remove(md)
   schema(n,name(n),cols)
  if mode=='MIXED':output.find('metadata/column[@name="AGENCE"]').set('key','true')
  setp(output,'USE_DYNAMIC_KEYS','true','CHECK');ep=output.find('elementParameter[@name="DYNAMIC_KEY_COLUMNS"]')
  if ep is not None:output.remove(ep)
  ep=E.SubElement(output,'elementParameter',field='TABLE',name='DYNAMIC_KEY_COLUMNS');E.SubElement(ep,'elementValue',elementRef='NAME',value='AGENCE' if mode=='ALL' else 'MOIS')
  if record['variant']=='reject':
   rejected=cols+[('errorCode','id_String'),('errorMessage','id_String')];schema(output,'REJECT',rejected,'REJECT')
   for c in output.findall('metadata')[-1].findall('column')[-2:]:c.set('custom','true')
   rejectlog=next(n for n in nodes if n.get('componentName')=='tLogRow' and name(n).endswith('_1'))
   for md in rejectlog.findall('metadata'):rejectlog.remove(md)
   schema(rejectlog,name(rejectlog),rejected)
  for ep in root.findall('.//elementParameter[@name="QUERY"]'):
   sql=json.loads(ep.get('value')).replace(record['table'],table)
   if mode=='MIXED':
    q=lambda x:'`'+x+'`' if db=='mysql' else '['+x+']' if db=='mssql' else '"'+x+'"'
    sql=sql.replace('UNIQUE ('+q('AGENCE')+')','UNIQUE ('+q('AGENCE')+', '+q('MOIS')+')')
   ep.set('value',json.dumps(sql,ensure_ascii=False))
  for ep in root.findall('.//elementParameter[@name="FILENAME"]'):ep.set('value','context.OUTPUT_DIRECTORY + "/'+job+'.csv"')
  if mode=='MIXED':
   rows=[n for n in nodes if n.get('componentName').endswith('Row') and n.get('componentName')!='tLogRow'];seed=next(n for n in rows if name(n).endswith('_3'));extra=copy.deepcopy(seed);extra_name=seed.get('componentName')+'_5';setp(extra,'UNIQUE_NAME',extra_name);extra.set('posX','1000')
   for md in extra.findall('metadata'):md.set('name',extra_name)
   sql=json.loads(extra.find('elementParameter[@name="QUERY"]').get('value')).replace("'KEEP','S1'","'K1','OTHER'");setp(extra,'QUERY',json.dumps(sql,ensure_ascii=False),'MEMO_SQL');root.append(extra)
   edge=next(c for c in root.findall('connection') if c.get('source')==name(seed) and c.get('target')==name(source));edge.set('source',extra_name)
   E.SubElement(root,'connection',connectorName='SUBJOB_OK',label='OnSubjobOkNK',lineStyle='1',metaname=name(seed),source=name(seed),target=extra_name,offsetLabelX='0',offsetLabelY='0')
  dest=folder/'DYNAMIC_SCHEMA_TEST/process';write_xml(dest/(job+'_0.1.item'),root);(dest/(job+'_0.1.item')).chmod(0o600)
  ids=['_'+uuid.uuid4().hex for _ in range(4)];props=E.Element(f'{{{XMI}}}XMI',{f'{{{XMI}}}version':'2.0'});prop=E.SubElement(props,f'{{{PROPERTIES}}}Property',{f'{{{XMI}}}id':ids[0],'id':ids[1],'label':job,'displayName':job,'version':'0.1','item':ids[3]});stamp=datetime.now().astimezone().strftime('%Y-%m-%dT%H:%M:%S.%f')[:-3]+datetime.now().astimezone().strftime('%z')
  for key in ['created_date','modified_date']:E.SubElement(prop,'additionalProperties',{f'{{{XMI}}}id':'_'+uuid.uuid4().hex,'key':key,'value':stamp})
  E.SubElement(props,f'{{{PROPERTIES}}}ItemState',{f'{{{XMI}}}id':ids[2],'path':''});item=E.SubElement(props,f'{{{PROPERTIES}}}ProcessItem',{f'{{{XMI}}}id':ids[3],'property':ids[0],'state':ids[2]});E.SubElement(item,'process',href=job+'_0.1.item#/');write_xml(dest/(job+'_0.1.properties'),props)
  manifest.append({**record,'name':job,'table':table,'mode':mode,'selected_keys':['AGENCE'] if mode=='ALL' else ['MOIS']})
(folder/'jobs.json').write_text(json.dumps(manifest,indent=2)+'\n');print('Generated',len(manifest),'named-key Studio recipes')
