#!/usr/bin/env python3
"""Create synthetic mapper integration jobs; connection context comes from an explicit local fixture."""
from pathlib import Path
import argparse, copy, json, uuid
import xml.etree.ElementTree as E
from create_test_jobs import parameter, schema, node, write_xml, XMI, XSI, PROCESS, PROPERTIES, MAPPER, SQL

p=argparse.ArgumentParser(description=__doc__)
p.add_argument('--template',type=Path,required=True)
p.add_argument('--output',type=Path,required=True)
a=p.parse_args();a.output=a.output.resolve();a.output.mkdir(parents=True,exist_ok=True)
base=E.parse(a.template).getroot(); out=a.output/'results';out.mkdir(exist_ok=True)
columns=[('AGENCE','id_String'),('MOIS','id_String'),('SQL','id_Dynamic')]

def setparam(n,key,value,field='TEXT'):
 for e in n.findall('elementParameter'):
  if e.get('name')==key:e.set('value',value);return
 parameter(n,key,value,field)

def table(data,tag,name,cols,source=None,**attrs):
 t=E.SubElement(data,tag,name=name,sizeState='INTERMEDIATE',**attrs)
 for label,kind in cols:
  e=E.SubElement(t,'mapperTableEntries',name=label,type=kind,nullable='true')
  if source:e.set('expression',source+'.'+label)
 return t

def connect(r,source,target,label,meta=None,style='0'):
 E.SubElement(r,'connection',connectorName='FLOW',label=label,lineStyle=style,metaname=meta or label,source=source,target=target,offsetLabelX='0',offsetLabelY='0')

manifest=[]
variants=['01_MULTI','02_FILTER','03_MEMORY','04_DISK','05_OUTER','06_INNER','07_RELOAD','08_CACHE','09_ERROR','10_PASSTHROUGH']
for variant in variants:
 r=copy.deepcopy(base);r.set('xmlns:TalendMapper',MAPPER)
 for c in r.findall('connection'):r.remove(c)
 for n in r.findall('node'):
  if n.get('componentName')!='tMSSqlInput':r.remove(n)
 for c in r.findall('context/contextParameter'):
  if c.get('name')=='OUTPUT_DIRECTORY':c.set('value',str(out))
 main=r.find('node');main_name='tDBInput_1'
 mapper=node(r,'tMap','tMap_1',384);parameter(mapper,'MAP','','EXTERNAL');parameter(mapper,'DIE_ON_ERROR','false','CHECK')
 parameter(mapper,'TEMPORARY_DATA_DIRECTORY',json.dumps(str(a.output/'lookup-temp')),'DIRECTORY');parameter(mapper,'ROWS_BUFFER_SIZE','1')
 data=E.SubElement(mapper,'nodeData',{f'{{{XSI}}}type':'TalendMapper:MapperData'});E.SubElement(data,'uiProperties');vars=E.SubElement(data,'varTables',name='Var',minimized='true',sizeState='INTERMEDIATE')
 table(data,'inputTables','row1',columns,matchingMode='ALL_ROWS',lookupMode='LOAD_ONCE')
 connect(r,main_name,'tMap_1','row1',main_name)
 lookup_case=variant[0:2] in ['03','04','05','06','07','08']
 reference='row1'
 if lookup_case:
  lookup=copy.deepcopy(main);r.append(lookup);lookup.set('posY','320');setparam(lookup,'UNIQUE_NAME','tDBInput_2');lookup.find('metadata').set('name','tDBInput_2')
  if variant.startswith(('05','06')):
   query="SELECT CAST('0007' AS varchar(10)) AGENCE, CAST('202601' AS nvarchar(6)) MOIS, CAST(1234567890123456789012345678.1234567890 AS decimal(38,10)) MONTANT, CAST(NULL AS int) VIDE, CAST(N'Été €' AS nvarchar(30)) TEXTE"
   setparam(lookup,'QUERY',json.dumps(query,ensure_ascii=False))
  lt=table(data,'inputTables','lookup',columns,matchingMode='ALL_MATCHES',lookupMode='RELOAD' if variant.startswith('07') else 'CACHE_OR_RELOAD' if variant.startswith('08') else 'LOAD_ONCE',persistent='true' if variant.startswith('04') else 'false',innerJoin='true' if variant.startswith('06') else 'false')
  lt.find('mapperTableEntries').set('expression','row1.AGENCE');connect(r,'tDBInput_2','tMap_1','lookup','tDBInput_2','8');reference='lookup'
 outputs=[('out1',columns,reference,{},'FILE')]
 if variant.startswith('01'):outputs += [('basic',columns,'row1',{},'BASIC'),('grid',columns,'row1',{},'TABLE'),('vertical',columns,'row1',{},'VERTICAL')]
 if variant.startswith('02'):
  outputs[0][3].update(expressionFilter='row1.AGENCE.equals("0007")',activateExpressionFilter='true')
  outputs.append(('rejected',columns,'row1',{'reject':'true'},'FILE'))
  E.SubElement(vars,'mapperTableEntries',name='agency',type='id_String',nullable='true',expression='row1.AGENCE.trim()')
 if variant.startswith('06'):outputs.append(('unmatched',columns,'row1',{'rejectInnerJoin':'true'},'FILE'))
 if variant.startswith('09'):outputs.append(('errors',[('errorMessage','id_String'),('errorStackTrace','id_String')]+columns,'row1',{'isErrorRejectTable':'true'},'FILE'))
 for i,(name,cols,source,attrs,mode) in enumerate(outputs):
  schema(mapper,name,cols);t=table(data,'outputTables',name,cols,source,**attrs)
  if variant.startswith('02') and name=='out1':t.find('mapperTableEntries').set('expression','Var.agency')
  if variant.startswith('09'):
   if name=='out1':t.find('mapperTableEntries').set('expression','row1.AGENCE.equals("0008") ? String.valueOf(Integer.parseInt("bad")) : row1.AGENCE')
   else:
    for j,e in enumerate(t.findall('mapperTableEntries')[:2]):e.attrib.pop('expression',None)
    for j,e in enumerate(mapper.findall('metadata')[-1].findall('column')[:2]):e.set('readOnly','true');e.set('custom','true');e.set('customId',str(j))
  sinkname=('tFileOutputDelimited_' if mode=='FILE' else 'tLogRow_')+str(i+1)
  sink=node(r,'tFileOutputDelimited' if mode=='FILE' else 'tLogRow',sinkname,640);sink.set('posY',str(128+i*160));schema(sink,sinkname,cols)
  if mode=='FILE':
   for key,val,field in [('FILENAME','context.OUTPUT_DIRECTORY + "/'+variant+'_'+name+'.csv"','FILE'),('FIELDSEPARATOR','";"','TEXT'),('ROWSEPARATOR','"\\n"','TEXT'),('ENCODING','"UTF-8"','ENCODING_TYPE'),('INCLUDEHEADER','true','CHECK'),('FILE_EXIST_EXCEPTION','false','CHECK'),('CREATE','true','CHECK'),('CSV_OPTION','false','CHECK')]:parameter(sink,key,val,field)
  else:
   for key,val in [('BASIC_MODE',mode=='BASIC'),('TABLE_PRINT',mode=='TABLE'),('VERTICAL',mode=='VERTICAL'),('PRINT_HEADER',True),('PRINT_UNIQUE',True),('PRINT_COLNAMES',True)]:parameter(sink,key,str(val).lower(),'RADIO' if key in ['BASIC_MODE','TABLE_PRINT','VERTICAL','PRINT_UNIQUE'] else 'CHECK')
   parameter(sink,'FIELDSEPARATOR','";"');parameter(sink,'LABEL','"Recette dynamique"')
  if variant.startswith('10'):
   log=node(r,'tLogRow','tLogRow_1',512);schema(log,'tLogRow_1',cols);parameter(log,'TABLE_PRINT','true','RADIO');parameter(log,'FIELDSEPARATOR','";"');connect(r,'tMap_1','tLogRow_1',name);connect(r,'tLogRow_1',sinkname,'logged','tLogRow_1')
  else:connect(r,'tMap_1',sinkname,name)
 name='TEST_DYNAMIC_MAP_'+variant;folder=a.output/'DYNAMIC_SCHEMA_TEST/process';write_xml(folder/(name+'_0.1.item'),r)
 props=E.Element(f'{{{XMI}}}XMI',{f'{{{XMI}}}version':'2.0'});ids=['_'+uuid.uuid4().hex for _ in range(4)]
 E.SubElement(props,f'{{{PROPERTIES}}}Property',{f'{{{XMI}}}id':ids[0],'id':ids[1],'label':name,'displayName':name,'version':'0.1','item':ids[3],'statusCode':''});E.SubElement(props,f'{{{PROPERTIES}}}ItemState',{f'{{{XMI}}}id':ids[2],'path':''});item=E.SubElement(props,f'{{{PROPERTIES}}}ProcessItem',{f'{{{XMI}}}id':ids[3],'property':ids[0],'state':ids[2]});E.SubElement(item,'process',href=name+'_0.1.item#/');write_xml(folder/(name+'_0.1.properties'),props)
 manifest.append(name)
(a.output/'jobs.json').write_text(json.dumps(manifest,indent=2));print('Generated',len(manifest),'mapper jobs')
