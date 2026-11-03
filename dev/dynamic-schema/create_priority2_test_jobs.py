#!/usr/bin/env python3
"""Build local Standard integration jobs; connection details come only from a private fixture."""
import argparse
import copy
import csv
from datetime import datetime
import json
from pathlib import Path
import uuid
import xml.etree.ElementTree as E
from create_test_jobs import parameter, schema, node, write_xml, XMI, XSI, MAPPER, PROPERTIES


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--template', required=True, type=Path)
    parser.add_argument('--outer-template', required=True, type=Path)
    parser.add_argument('--output', required=True, type=Path)
    args = parser.parse_args()
    folder = args.output.resolve(); folder.mkdir(parents=True, exist_ok=True, mode=0o700)
    results = folder / 'results'; results.mkdir(exist_ok=True)
    inputs = folder / 'inputs'; inputs.mkdir(exist_ok=True)
    base = E.parse(args.template).getroot()
    source_template = copy.deepcopy(base.find('node[@componentName="tMSSqlInput"]'))
    mixed = [('AGENCE', 'id_String'), ('MOIS', 'id_String'), ('SQL', 'id_Dynamic')]
    all_static = [('AGENCE', 'id_String'), ('MOIS', 'id_String'), ('MONTANT', 'id_BigDecimal'), ('VIDE', 'id_Integer'), ('TEXTE', 'id_String')]
    headers = ['AGENCE', 'MOIS', 'MONTANT', 'VIDE', 'TEXTE', 'EXTRA']
    rows = [['0007', '202601', '1234567890123456789012345678.1234567890', '', 'Été;"€"\nObsèques', 'Restant 漢字'],
            ['0008', '202601', '', '0', 'second', '']]
    for name, values in [('csv', [headers] + rows), ('empty', [headers[:2]] + [r[:2] for r in rows]),
                         ('bad', [headers] + [rows[0], [rows[1][0], 'bad'] + rows[1][2:]])]:
        with (inputs / (name + '.csv')).open('w', encoding='utf-8', newline='') as stream:
            csv.writer(stream, delimiter=';', lineterminator='\n').writerows(values)
    (inputs / 'delimited.csv').write_text('AGENCE;MOIS;MONTANT;VIDE;TEXTE;EXTRA\n0007;202601;12.50;;Été €;Restant 漢字\n0008;202601;;0;second;\n')
    ids = {}
    manifest = []

    def setp(component, key, value, field='TEXT'):
        p = component.find('elementParameter[@name="' + key + '"]')
        if p is None: parameter(component, key, value, field)
        else: p.set('value', value)

    def metadata(component, name, columns, connector='FLOW'):
        schema(component, name, columns, connector)
        for column in component.findall('metadata')[-1].findall('column'):
            if column.get('type') == 'id_BigDecimal': column.set('sourceType', 'DECIMAL')
            if column.get('type') == 'id_Integer': column.set('sourceType', 'INT')

    def fresh(template=base):
        root = copy.deepcopy(template)
        for child in root.findall('node') + root.findall('connection'): root.remove(child)
        for value in root.findall('context/contextParameter'):
            if value.get('name') == 'OUTPUT_DIRECTORY': value.set('value', str(results))
        return root

    def add(root, kind, columns, x=400, y=128):
        name = kind + '_' + str(1 + sum(n.get('componentName') == kind for n in root.findall('node')))
        component = node(root, kind, name, x); component.set('posY', str(y))
        metadata(component, name, columns)
        return name, component

    def connect(root, source, target, meta, connector='FLOW', label=None):
        count = len(root.findall('connection')) + 1
        E.SubElement(root, 'connection', connectorName=connector, label=label or 'row' + str(count),
                     lineStyle='1' if connector == 'SUBJOB_OK' else '0', metaname=meta,
                     source=source, target=target, offsetLabelX='0', offsetLabelY='0')

    def sql_input(root, columns= mixed):
        component = copy.deepcopy(source_template)
        name = 'tDBInput_' + str(1 + sum(n.get('componentName') == 'tMSSqlInput' for n in root.findall('node')))
        setp(component, 'UNIQUE_NAME', name)
        for m in component.findall('metadata'): component.remove(m)
        metadata(component, name, columns); root.append(component)
        return name

    def file_input(root, columns=mixed, csv_mode=True, filename='csv.csv', **options):
        name, component = add(root, 'tFileInputDelimited', columns, 128)
        for key, value, field in [('FILENAME', json.dumps(str(inputs / filename)), 'FILE'), ('CSV_OPTION', str(csv_mode).lower(), 'CHECK'),
                                 ('ENCODING', '"UTF-8"', 'ENCODING_TYPE'), ('FIELDSEPARATOR', '";"', 'TEXT'),
                                 ('ROWSEPARATOR', '"\\n"', 'TEXT'), ('CSVROWSEPARATOR', '"\\n"', 'OPENED_LIST'),
                                 ('HEADER', '1', 'TEXT'), ('DIE_ON_ERROR', 'true', 'CHECK'),
                                 ('USE_HEADER_AS_IS', 'true', 'CHECK'), ('TEXT_ENCLOSURE', '"\\\""', 'TEXT'),
                                 ('ESCAPE_CHAR', '"\\\""', 'TEXT'), ('CHECK_FIELDS_NUM', 'true', 'CHECK')]:
            parameter(component, key, value, field)
        for key, value in options.items(): setp(component, key, value, 'CHECK' if value in ['true', 'false'] else 'TEXT')
        return name, component

    def log(root, source, meta, columns, connector='FLOW'):
        name, component = add(root, 'tLogRow', columns, 650, 240 if connector == 'REJECT' else 128)
        parameter(component, 'TABLE_PRINT', 'true', 'RADIO'); parameter(component, 'FIELDSEPARATOR', '";"')
        connect(root, source, name, meta, connector)
        return name

    def file_output(root, source, meta, columns, variant, csv_mode=True, **options):
        name, component = add(root, 'tFileOutputDelimited', columns, 900)
        for key, value, field in [('FILENAME', 'context.OUTPUT_DIRECTORY + "/' + variant + '.csv"', 'FILE'),
                                 ('ENCODING', '"UTF-8"', 'ENCODING_TYPE'), ('FIELDSEPARATOR', '";"', 'TEXT'),
                                 ('ROWSEPARATOR', '"\\n"', 'TEXT'), ('INCLUDEHEADER', 'true', 'CHECK'),
                                 ('CSV_OPTION', str(csv_mode).lower(), 'CHECK'), ('CREATE', 'true', 'CHECK'),
                                 ('APPEND', 'false', 'CHECK'), ('FILE_EXIST_EXCEPTION', 'false', 'CHECK'), ('TEXT_ENCLOSURE', '"\\\""', 'TEXT'), ('ESCAPE_CHAR', '"\\\""', 'TEXT')]:
            parameter(component, key, value, field)
        for key, value in options.items(): setp(component, key, value, 'CHECK' if value in ['true', 'false'] else 'TEXT')
        connect(root, source, name, meta)
        return name

    def cache_output(root, source, meta, linked=None):
        name, component = add(root, 'tHashOutput', mixed, 400)
        parameter(component, 'LINK_WITH', str(linked is not None).lower(), 'CHECK')
        parameter(component, 'KEYS_MANAGEMENT', 'KEEP_ALL', 'CLOSED_LIST'); parameter(component, 'APPEND', 'false', 'CHECK')
        if linked: parameter(component, 'LIST', linked, 'COMPONENT_LIST')
        connect(root, source, name, meta, label=meta if source.startswith("tMap_") else None)
        return name

    def cache_input(root, original, trigger, release=True):
        name, component = add(root, 'tHashInput', mixed, 128, 400)
        parameter(component, 'LIST', original, 'COMPONENT_LIST'); parameter(component, 'LINK_WITH', 'true', 'CHECK')
        parameter(component, 'RELEASE_CACHE', str(release).lower(), 'CHECK')
        connect(root, trigger, name, trigger, 'SUBJOB_OK', 'OnSubjobOk' + str(len(root.findall('connection'))))
        return name

    def save(root, variant):
        name = 'TEST_DYNAMIC_P2_' + variant
        if root.find('node/nodeData') is not None:
            root.set('xmlns:TalendMapper', MAPPER)
            for mapper in root.findall('node[@componentName="tMap"]'):
                unique = mapper.find('elementParameter[@name="UNIQUE_NAME"]').get('value')
                outputs = {table.get('name') for table in mapper.findall('nodeData/outputTables')}
                for link in root.findall('connection'):
                    if link.get('source') == unique and link.get('connectorName') == 'FLOW':
                        assert link.get('label') == link.get('metaname') and link.get('label') in outputs, 'Mapper output must retain its mapped table name'
        uid = ['_' + uuid.uuid4().hex for _ in range(4)]; ids[variant] = uid[1]
        directory = folder / 'DYNAMIC_SCHEMA_TEST/process'
        write_xml(directory / (name + '_0.1.item'), root)
        properties = E.Element(f'{{{XMI}}}XMI', {f'{{{XMI}}}version': '2.0'})
        prop = E.SubElement(properties, f'{{{PROPERTIES}}}Property', {f'{{{XMI}}}id': uid[0], 'id': uid[1], 'label': name, 'displayName': name, 'version': '0.1', 'item': uid[3]})
        timestamp = datetime.now().astimezone().strftime('%Y-%m-%dT%H:%M:%S.%f')[:-3] + datetime.now().astimezone().strftime('%z')
        for key in ['created_date', 'modified_date']:
            E.SubElement(prop, 'additionalProperties', {f'{{{XMI}}}id': '_' + uuid.uuid4().hex, 'key': key, 'value': timestamp})
        E.SubElement(properties, f'{{{PROPERTIES}}}ItemState', {f'{{{XMI}}}id': uid[2], 'path': ''})
        item = E.SubElement(properties, f'{{{PROPERTIES}}}ProcessItem', {f'{{{XMI}}}id': uid[3], 'property': uid[0], 'state': uid[2]})
        E.SubElement(item, 'process', href=name + '_0.1.item#/'); write_xml(directory / (name + '_0.1.properties'), properties)
        manifest.append(name)

    for variant, cols, csv_mode, filename in [('01_FILE_DELIMITED', mixed, False, 'delimited.csv'),
                                             ('02_FILE_CSV_MIXED', mixed, True, 'csv.csv'),
                                             ('03_FILE_CSV_ALL', [('SQL', 'id_Dynamic')], True, 'csv.csv'),
                                             ('04_FILE_CSV_EMPTY', mixed, True, 'empty.csv'),
                                             ('19_FILE_HEADER_ZERO', mixed, True, 'csv.csv')]:
        root = fresh(); source, component = file_input(root, cols, csv_mode, filename)
        if variant.startswith('19'): setp(component, 'HEADER', '0')
        logged = log(root, source, source, cols); file_output(root, logged, logged, cols, variant, csv_mode)
        save(root, variant)

    root = fresh(); source, _ = file_input(root, [('SQL', 'id_Dynamic')])
    extracted = all_static + [('SQL', 'id_Dynamic')]
    extract, _ = add(root, 'tExtractDynamicFields', extracted); connect(root, source, extract, source)
    logged = log(root, extract, extract, extracted); file_output(root, logged, logged, extracted, '05_EXTRACT_TYPED'); save(root, '05_EXTRACT_TYPED')

    for variant, source_cols, target in [('06_WRITE_STATIC', all_static, mixed),
                                        ('07_WRITE_EXISTING', mixed, [('AGENCE', 'id_String'), ('DATA', 'id_Dynamic')]),
                                        ('17_FIELDS_ROUNDTRIP', all_static, mixed)]:
        root = fresh(); source = sql_input(root, source_cols)
        write, _ = add(root, 'tWriteDynamicFields', target); connect(root, source, write, source)
        if variant.startswith('17'):
            extract, _ = add(root, 'tExtractDynamicFields', all_static, 600); connect(root, write, extract, write)
            logged = log(root, extract, extract, all_static); file_output(root, logged, logged, all_static, variant)
        else:
            logged = log(root, write, write, target); file_output(root, logged, logged, target, variant)
        save(root, variant)

    for variant in ['08_HASH_MIXED', '09_HASH_REREAD', '10_HASH_LINKED', '11_HASH_NULL', '18_HASH_EMPTY']:
        if variant == '11_HASH_NULL':
            root = E.parse(args.outer_template).getroot()
            for component in root.findall('node'):
                if component.get('componentName') not in ['tMSSqlInput', 'tMap']: root.remove(component)
            for connection in root.findall('connection'):
                if connection.get('source') == 'tMap_1': root.remove(connection)
            for value in root.findall('context/contextParameter'):
                if value.get('name') == 'OUTPUT_DIRECTORY': value.set('value', str(results))
            source, meta, trigger = 'tMap_1', 'out1', 'tDBInput_1'
        else:
            root = fresh()
            source = file_input(root, filename='empty.csv')[0] if variant == '18_HASH_EMPTY' else sql_input(root)
            meta, trigger = source, source
        cache = cache_output(root, source, meta)
        if variant == '10_HASH_LINKED':
            second = sql_input(root); second_node = root.findall('node')[-1]; second_node.set('posY', '400')
            connect(root, trigger, second, trigger, 'SUBJOB_OK', 'OnSubjobOk')
            cache_output(root, second, second, cache); trigger = second
        reader = cache_input(root, cache, trigger, variant != '09_HASH_REREAD')
        logged = log(root, reader, reader, mixed); file_output(root, logged, logged, mixed, variant)
        if variant == '09_HASH_REREAD':
            reader2 = cache_input(root, cache, reader); logged2 = log(root, reader2, reader2, mixed)
            file_output(root, logged2, logged2, mixed, variant + '_second')
        save(root, variant)

    for child, parent, cols in [('12_CHILD_MIXED', '13_PARENT_MIXED', mixed), ('14_CHILD_ALL', '15_PARENT_ALL', [('SQL', 'id_Dynamic')])]:
        root = fresh(); source, _ = file_input(root, cols)
        buffer, _ = add(root, 'tBufferOutput', cols); connect(root, source, buffer, source); save(root, child)
        root = fresh(); run, component = add(root, 'tRunJob', cols, 128)
        child_name = 'TEST_DYNAMIC_P2_' + child
        for key, value, field in [('PROCESS', child_name, 'PROCESS_TYPE'),
                                 ('PROCESS:PROCESS_TYPE_PROCESS', 'DYNAMIC_SCHEMA_TEST:' + ids[child], 'TECHNICAL'),
                                 ('PROCESS:PROCESS_TYPE_VERSION', '0.1', 'TECHNICAL'),
                                 ('PROCESS:PROCESS_TYPE_CONTEXT', 'Default', 'TECHNICAL'),
                                 ('PROPAGATE_CHILD_RESULT', 'true', 'CHECK'), ('DIE_ON_CHILD_ERROR', 'true', 'CHECK'),
                                 ('USE_DYNAMIC_JOB', 'false', 'CHECK'), ('USE_INDEPENDENT_PROCESS', 'false', 'CHECK')]:
            parameter(component, key, value, field)
        logged = log(root, run, run, cols); file_output(root, logged, logged, cols, parent); save(root, parent)

    root = fresh(); reject_cols = [('AGENCE', 'id_String'), ('MOIS', 'id_Integer'), ('SQL', 'id_Dynamic')]
    source, component = file_input(root, reject_cols, filename='bad.csv', DIE_ON_ERROR='false')
    metadata(component, 'REJECT', reject_cols + [('errorCode', 'id_String'), ('errorMessage', 'id_String')], 'REJECT')
    for column in component.findall('metadata')[-1].findall('column')[-2:]: column.set('custom', 'true')
    file_output(root, source, source, reject_cols, '16_FILE_REJECT')
    log(root, source, 'REJECT', reject_cols + [('errorCode', 'id_String'), ('errorMessage', 'id_String')], 'REJECT'); save(root, '16_FILE_REJECT')

    root = fresh(); source, _ = file_input(root); file_output(root, source, source, mixed, '20_FILE_CSV_APPEND')
    second, _ = file_input(root); connect(root, source, second, source, 'SUBJOB_OK', 'OnSubjobOk')
    file_output(root, second, second, mixed, '20_FILE_CSV_APPEND', APPEND='true'); save(root, '20_FILE_CSV_APPEND')
    (folder / 'jobs.json').write_text(json.dumps(manifest, indent=2) + '\n')
    for fixture in folder.rglob('*.item'): fixture.chmod(0o600)
    print('Generated', len(manifest), 'priority-two integration jobs')


if __name__ == '__main__':
    main()
