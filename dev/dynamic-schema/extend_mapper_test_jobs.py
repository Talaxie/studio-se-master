#!/usr/bin/env python3
"""Extend the synthetic mapper fixtures with matching modes and multiple lookup/output tables."""
import argparse,copy,json,uuid
from pathlib import Path
import xml.etree.ElementTree as E
from create_test_jobs import write_xml,MAPPER,schema,parameter
p=argparse.ArgumentParser(description=__doc__);p.add_argument('--fixtures',type=Path,required=True);a=p.parse_args();folder=a.fixtures/'DYNAMIC_SCHEMA_TEST/process'
base=E.parse(folder/'TEST_DYNAMIC_MAP_03_MEMORY_0.1.item').getroot();properties=(folder/'TEST_DYNAMIC_MAP_03_MEMORY_0.1.properties').read_text()

def setp(n,key,val):
 for e in n.findall('elementParameter'):
  if e.get('name')==key:e.set('value',val);return
 parameter(n,key,val)
def save(r,variant):
 r.set('xmlns:TalendMapper',MAPPER);name='TEST_DYNAMIC_MAP_'+variant
 for e in r.findall('node/elementParameter'):
  if e.get('name')=='FILENAME':e.set('value',e.get('value').replace('03_MEMORY',variant))
 write_xml(folder/(name+'_0.1.item'),r)
 props=properties.replace('TEST_DYNAMIC_MAP_03_MEMORY',name)
 for uid in set(__import__('re').findall(r'_[a-f0-9]{32}',props)):props=props.replace(uid,'_'+uuid.uuid4().hex)
 (folder/(name+'_0.1.properties')).write_text(props)
 return name
names=[]
for variant,mode in [('11_UNIQUE','UNIQUE_MATCH'),('12_FIRST','FIRST_MATCH'),('13_ALL_ROWS','ALL_ROWS')]:
 r=copy.deepcopy(base);mapper=[n for n in r.findall('node') if n.get('componentName')=='tMap'][0];lt=mapper.find('nodeData/inputTables[@name="lookup"]');lt.set('matchingMode',mode)
 if mode=='ALL_ROWS':lt.find('mapperTableEntries').attrib.pop('expression',None)
 else:
  lt.set('innerJoin','true');src=[n for n in r.findall('node') if any(e.get('value')=='tDBInput_2' for e in n.findall('elementParameter'))][0]
  q=src.find('elementParameter[@name="QUERY"]');q.set('value',q.get('value').replace("''0008''","''0007''").replace('ORDER BY AGENCE','ORDER BY VIDE'))
 names.append(save(r,variant))
r=copy.deepcopy(base);source=r.find('node');source.remove(source.find('metadata'));cols=[('AGENCE','id_String'),('MOIS','id_String'),('MONTANT','id_BigDecimal'),('VIDE','id_Integer'),('TEXTE','id_String')];schema(source,'tDBInput_1',cols)
mapper=[n for n in r.findall('node') if n.get('componentName')=='tMap'][0];t=mapper.find('nodeData/inputTables[@name="row1"]')
for e in list(t):t.remove(e)
for label,kind in cols:E.SubElement(t,'mapperTableEntries',name=label,type=kind,nullable='true')
names.append(save(r,'14_STATIC_MAIN'))
r=copy.deepcopy(base);lookup=copy.deepcopy(r.findall('node')[-1]);assert lookup.get('componentName')=='tFileOutputDelimited' or lookup.get('componentName')=='tMSSqlInput'
lookup=copy.deepcopy([n for n in r.findall('node') if any(e.get('name')=='UNIQUE_NAME' and e.get('value')=='tDBInput_2' for e in n.findall('elementParameter'))][0]);setp(lookup,'UNIQUE_NAME','tDBInput_3');lookup.find('metadata').set('name','tDBInput_3');lookup.set('posY','512');r.append(lookup)
mapper=[n for n in r.findall('node') if n.get('componentName')=='tMap'][0];data=mapper.find('nodeData');t=copy.deepcopy(data.find('inputTables[@name="lookup"]'));t.set('name','lookup2');data.append(t)
c=copy.deepcopy(r.find('connection[@label="lookup"]'));c.set('label','lookup2');c.set('source','tDBInput_3');c.set('metaname','tDBInput_3');r.append(c)
t=copy.deepcopy(data.find('outputTables'));t.set('name','out2')
for e in t:e.set('expression',e.get('expression').replace('lookup.','lookup2.'))
data.append(t);meta=copy.deepcopy(mapper.find('metadata'));meta.set('name','out2');mapper.append(meta)
sink=copy.deepcopy([n for n in r.findall('node') if n.get('componentName')=='tFileOutputDelimited'][0]);setp(sink,'UNIQUE_NAME','tFileOutputDelimited_2');setp(sink,'FILENAME','context.OUTPUT_DIRECTORY + "/15_MULTI_LOOKUP_out2.csv"');sink.find('metadata').set('name','tFileOutputDelimited_2');sink.set('posY','320');r.append(sink)
c=copy.deepcopy(r.find('connection[@label="out1"]'));c.set('label','out2');c.set('metaname','out2');c.set('target','tFileOutputDelimited_2');r.append(c);names.append(save(r,'15_MULTI_LOOKUP'))
r=copy.deepcopy(base)
# Joined output tables share one physical output connection.
mapper=[n for n in r.findall('node') if n.get('componentName')=='tMap'][0];data=mapper.find('nodeData');t=copy.deepcopy(data.find('outputTables'));t.set('name','joined');t.set('isJoinTableOf','out1');data.append(t);names.append(save(r,'16_JOINED_OUTPUT'))
manifest=json.loads((a.fixtures/'jobs.json').read_text());(a.fixtures/'jobs.json').write_text(json.dumps(manifest+names,indent=2));print('Added',len(names),'mapper scenarios')
