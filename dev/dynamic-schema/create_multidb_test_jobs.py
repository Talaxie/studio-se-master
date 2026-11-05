#!/usr/bin/env python3
"""Create synthetic Oracle/MySQL/PostgreSQL Studio jobs. Private connection properties stay outside Git."""
import argparse
import copy
from datetime import datetime
import json
from pathlib import Path
import uuid
import xml.etree.ElementTree as E
from create_test_jobs import parameter, schema, node, write_xml, XMI, PROPERTIES

p=argparse.ArgumentParser(description=__doc__)
p.add_argument('--template',required=True,type=Path)
p.add_argument('--connections',required=True,type=Path)
p.add_argument('--queries',required=True,type=Path)
p.add_argument('--output',required=True,type=Path)
a=p.parse_args()
folder=a.output.resolve();folder.mkdir(parents=True,exist_ok=True,mode=0o700)
private={l.split('=',1)[0]:l.split('=',1)[1] for l in a.connections.read_text().splitlines() if '=' in l and not l.startswith('#')}
queries={e.get('key'):e.text for e in E.parse(a.queries).getroot().findall('entry')}
base=E.parse(a.template).getroot();manifest=[]
mixed=[('AGENCE','id_String'),('MOIS','id_String'),('SQL','id_Dynamic')]
results=folder/'results';results.mkdir(exist_ok=True)

def setp(n,k,v,f='TEXT'):
    ep=n.find('elementParameter[@name="'+k+'"]')
    if ep is not None:ep.set('value',v)
    else:parameter(n,k,v,f)

def add(root,kind,cols,x,y):
    name=kind+'_'+str(1+sum(n.get('componentName')==kind for n in root.findall('node')))
    n=node(root,kind,name,x);n.set('posY',str(y));schema(n,name,cols)
    return name,n

def link(root,source,target,meta,connector='FLOW'):
    count=1+len(root.findall('connection'))
    E.SubElement(root,'connection',connectorName=connector,label=('OnSubjobOk' if connector=='SUBJOB_OK' else 'row')+str(count),
        lineStyle='1' if connector=='SUBJOB_OK' else '0',metaname=meta,source=source,target=target,offsetLabelX='0',offsetLabelY='0')

for db,component,mapping in [('oracle','Oracle','oracle_id'),('mysql','Mysql','mysql_id'),('postgres','Postgresql','postgres_id')]:
    from urllib.parse import urlparse
    url=private[db+'.url']; uri=urlparse(url.replace('jdbc:oracle:thin:@//','oracle://').removeprefix('jdbc:'))
    for variant in ['MIXED','ALL','EMPTY','EXTRA','REJECT']:
        name='TEST_DYNAMIC_'+db.upper()+'_'+variant
        table='TDYN_GUI_'+db.upper()+'_'+variant
        assert len(table)<=30
        root=copy.deepcopy(base)
        for child in root.findall('node')+root.findall('connection'):root.remove(child)
        context=root.find('context');context.clear();context.set('confirmationNeeded','false');context.set('name','Default')
        for key,value in [('DB_HOST',uri.hostname),('DB_PORT',str(uri.port)),('DB_NAME',uri.path[1:]),('DB_SCHEMA','public' if db=='postgres' else ''),
                         ('DB_USER',private[db+'.user']),('DB_PASSWORD',private[db+'.password']),('OUTPUT_DIRECTORY',str(results)),('TEST_TABLE',table)]:
            E.SubElement(context,'contextParameter',comment='',name=key,prompt=key,promptNeeded='false',type='id_Password' if key=='DB_PASSWORD' else 'id_String',value=value)
        cols=mixed if variant in ['MIXED','EMPTY','REJECT'] else [('SQL','id_Dynamic')]
        query=queries[db+'.'+('extra' if variant=='EXTRA' else 'empty' if variant=='EMPTY' else 'basic')]
        def connection(n):
            for key,value,field in [('MAPPING',mapping,'TEXT'),('HOST','context.DB_HOST','TEXT'),('PORT','context.DB_PORT','TEXT'),('DBNAME','context.DB_NAME','TEXT'),
                ('USER','context.DB_USER','TEXT'),('PASS','context.DB_PASSWORD','PASSWORD'),('DB_SCHEMA','context.DB_SCHEMA','TEXT'),('SCHEMA_DB','context.DB_SCHEMA','TEXT'),('TABLESCHEMA','context.DB_SCHEMA','TEXT'),
                ('USE_EXISTING_CONNECTION','false','CHECK'),('CONNECTION_TYPE','ORACLE_SERVICE_NAME','CLOSED_LIST'),('DB_VERSION','ORACLE_18' if db=='oracle' else 'MYSQL_8' if db=='mysql' else 'V9_X','CLOSED_LIST'),('PROPERTIES','""','TEXT')]:setp(n,key,value,field)
        source,n=add(root,'t'+component+'Input',cols,128,360 if variant=='REJECT' else 128);connection(n);setp(n,'QUERY',json.dumps(query,ensure_ascii=False),'MEMO_SQL')
        output,n=add(root,'t'+component+'Output',cols,400,360 if variant=='REJECT' else 128);connection(n)
        for key,value,field in [('TABLE','context.TEST_TABLE','TABLE'),('TABLE_ACTION','NONE' if variant=='REJECT' else 'DROP_IF_EXISTS_AND_CREATE','CLOSED_LIST'),('DATA_ACTION','INSERT','CLOSED_LIST'),
            ('USE_BATCH_SIZE','true','CHECK'),('BATCH_SIZE','2','TEXT'),('COMMIT_EVERY','3','TEXT'),('DIE_ON_ERROR','false' if variant=='REJECT' else 'true','CHECK'),('EXTENDINSERT','false','CHECK'),('ON_DUPLICATE_KEY_UPDATE','false','CHECK'),
            ('CONVERT_COLUMN_TABLE_TO_LOWERCASE','false','CHECK'),('CONVERT_COLUMN_TABLE_TO_UPPERCASE','false','CHECK')]:setp(n,key,value,field)
        link(root,source,output,source)
        if variant=='REJECT':
            quoted='`'+table+'`' if db=='mysql' else '"'+table+'"'
            column='`AGENCE`' if db=='mysql' else '"AGENCE"'
            start,n=add(root,'t'+component+'Row',[],128,128);connection(n)
            setp(n,'QUERY',json.dumps('CREATE TABLE '+quoted+' ('+queries[db+'.reject_columns']+', CHECK ('+column+" <> '0008'))",ensure_ascii=False),'MEMO_SQL')
            setp(n,'DIE_ON_ERROR','true','CHECK');link(root,start,source,start,'SUBJOB_OK')
            rejected=cols+[('errorCode','id_String'),('errorMessage','id_String')]
            component_node=next(v for v in root.findall('node') if v.find('elementParameter[@name="UNIQUE_NAME"]').get('value')==output)
            schema(component_node,'REJECT',rejected,'REJECT')
            for col in component_node.findall('metadata')[-1].findall('column')[-2:]:col.set('custom','true')
            rejectlog,n=add(root,'tLogRow',rejected,700,360);setp(n,'TABLE_PRINT','true','CHECK');setp(n,'BASIC_PRINT','false','CHECK')
            link(root,output,rejectlog,'REJECT','REJECT')
        read,n=add(root,'t'+component+'Input',[('SQL','id_Dynamic')],128,600 if variant=='REJECT' else 360);connection(n)
        quoted='`'+table+'`' if db=='mysql' else '"'+table+'"'
        setp(n,'QUERY',json.dumps('SELECT * FROM '+quoted+' ORDER BY '+('`AGENCE`' if db=='mysql' else '"AGENCE"'),ensure_ascii=False),'MEMO_SQL');link(root,source,read,source,'SUBJOB_OK')
        log,n=add(root,'tLogRow',[('SQL','id_Dynamic')],400,600 if variant=='REJECT' else 360);setp(n,'TABLE_PRINT','true','CHECK');setp(n,'BASIC_PRINT','false','CHECK');link(root,read,log,read)
        out,n=add(root,'tFileOutputDelimited',[('SQL','id_Dynamic')],700,600 if variant=='REJECT' else 360)
        for key,value,field in [('FILENAME','context.OUTPUT_DIRECTORY + "/'+name+'.csv"','FILE'),('ENCODING','"UTF-8"','ENCODING_TYPE'),('FIELDSEPARATOR','";"','TEXT'),('ROWSEPARATOR','"\\n"','TEXT'),
            ('CSV_OPTION','true','CHECK'),('INCLUDEHEADER','true','CHECK'),('APPEND','false','CHECK'),('CREATE','true','CHECK'),('FILE_EXIST_EXCEPTION','false','CHECK'),('TEXT_ENCLOSURE','"\\\""','TEXT'),('ESCAPE_CHAR','"\\\""','TEXT')]:setp(n,key,value,field)
        link(root,log,out,log)
        drop,n=add(root,'t'+component+'Row',[],128,840 if variant=='REJECT' else 600);connection(n);setp(n,'QUERY',json.dumps('DROP TABLE '+quoted),'MEMO_SQL');setp(n,'DIE_ON_ERROR','true','CHECK');link(root,read,drop,read,'SUBJOB_OK')
        directory=folder/'DYNAMIC_SCHEMA_TEST/process';write_xml(directory/(name+'_0.1.item'),root)
        u=['_'+uuid.uuid4().hex for _ in range(4)];props=E.Element(f'{{{XMI}}}XMI',{f'{{{XMI}}}version':'2.0'})
        prop=E.SubElement(props,f'{{{PROPERTIES}}}Property',{f'{{{XMI}}}id':u[0],'id':u[1],'label':name,'displayName':name,'version':'0.1','item':u[3]})
        timestamp=datetime.now().astimezone().strftime('%Y-%m-%dT%H:%M:%S.%f')[:-3]+datetime.now().astimezone().strftime('%z')
        for key in ['created_date','modified_date']:E.SubElement(prop,'additionalProperties',{f'{{{XMI}}}id':'_'+uuid.uuid4().hex,'key':key,'value':timestamp})
        E.SubElement(props,f'{{{PROPERTIES}}}ItemState',{f'{{{XMI}}}id':u[2],'path':''})
        item=E.SubElement(props,f'{{{PROPERTIES}}}ProcessItem',{f'{{{XMI}}}id':u[3],'property':u[0],'state':u[2]});E.SubElement(item,'process',href=name+'_0.1.item#/')
        write_xml(directory/(name+'_0.1.properties'),props);(directory/(name+'_0.1.item')).chmod(0o600);manifest.append({'name':name,'table':table,'database':db,'variant':variant})
(folder/'jobs.json').write_text(json.dumps(manifest,indent=2)+'\n');print('Generated',len(manifest),'isolated Studio integration jobs')
