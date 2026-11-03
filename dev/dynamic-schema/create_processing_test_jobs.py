#!/usr/bin/env python3
"""Create synthetic processing jobs using connection context from a private local fixture."""
import argparse
import copy
import json
from pathlib import Path
import uuid
import xml.etree.ElementTree as E
from create_test_jobs import parameter, schema, node, write_xml, XMI, XSI, MAPPER, PROPERTIES


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--template', type=Path, required=True)
    parser.add_argument('--output', type=Path, required=True)
    args = parser.parse_args()
    output = args.output.resolve()
    output.mkdir(parents=True, exist_ok=True, mode=0o700)
    results = output / 'results'
    results.mkdir(exist_ok=True)
    base = E.parse(args.template).getroot()
    columns = [('AGENCE', 'id_String'), ('MOIS', 'id_String'), ('SQL', 'id_Dynamic')]
    names = []

    def connect(root, source, target, label, meta, connector='FLOW'):
        E.SubElement(root, 'connection', connectorName=connector, label=label, lineStyle='0',
                     metaname=meta, source=source, target=target, offsetLabelX='0', offsetLabelY='0')

    def file(root, source, meta, label, cols, variant, suffix='', connector='FLOW'):
        name = 'tFileOutputDelimited_' + str(len(root.findall('node')))
        sink = node(root, 'tFileOutputDelimited', name, 1050)
        sink.set('posY', str(100 + 110 * len(root.findall('node'))))
        schema(sink, name, cols)
        for key, value, field in [('FILENAME', 'context.OUTPUT_DIRECTORY + "/' + variant + suffix + '.csv"', 'FILE'),
                                 ('FIELDSEPARATOR', '";"', 'TEXT'), ('ROWSEPARATOR', '"\\n"', 'TEXT'),
                                 ('ENCODING', '"UTF-8"', 'ENCODING_TYPE'), ('INCLUDEHEADER', 'true', 'CHECK'),
                                 ('CSV_OPTION', 'false', 'CHECK'), ('CREATE', 'true', 'CHECK')]:
            parameter(sink, key, value, field)
        connect(root, source, name, label, meta, connector)

    def log(root, source, meta, label, cols, connector='FLOW'):
        name = 'tLogRow_' + str(len(root.findall('node')))
        sink = node(root, 'tLogRow', name, 780)
        sink.set('posY', str(100 + 110 * len(root.findall('node'))))
        schema(sink, name, cols)
        parameter(sink, 'TABLE_PRINT', 'true', 'RADIO')
        parameter(sink, 'FIELDSEPARATOR', '";"')
        connect(root, source, name, label, meta, connector)
        return name

    def filter_row(root, source, meta, label, variant):
        name = 'tFilterRow_1'
        filt = node(root, 'tFilterRow', name, 400)
        schema(filt, name, columns)
        schema(filt, 'FILTER', columns, 'FILTER')
        rejected = columns + [('errorMessage', 'id_String')]
        schema(filt, 'REJECT', rejected, 'REJECT')
        error = filt.findall('metadata')[-1].findall('column')[-1]
        error.set('readOnly', 'true'); error.set('custom', 'true')
        parameter(filt, 'LOGICAL_OP', '||' if variant == '04_OR' else '&&', 'CLOSED_LIST')
        conditions = E.SubElement(filt, 'elementParameter', field='TABLE', name='CONDITIONS')
        if variant != '03_ADVANCED':
            for agency in (['0007', '0008'] if variant == '04_OR' else ['0007']):
                for key, value in [('INPUT_COLUMN', 'AGENCE'), ('FUNCTION', ''), ('OPERATOR', '=='), ('RVALUE', json.dumps(agency))]:
                    E.SubElement(conditions, 'elementValue', elementRef=key, value=value)
        parameter(filt, 'USE_ADVANCED', str(variant == '03_ADVANCED').lower(), 'CHECK')
        parameter(filt, 'ADVANCED_COND', 'input_row.AGENCE.equals("0008")', 'MEMO_JAVA')
        connect(root, source, name, label, meta)
        return name, rejected

    def reject_sink(root, source, rejected, variant):
        # Display the native technical schema directly, then reorder diagnostics
        # before Dynamic for a normal downstream output schema.
        log_name = log(root, source, 'REJECT', 'rejected', rejected, 'REJECT')
        mapper = node(root, 'tMap', 'tMap_1', 900)
        parameter(mapper, 'MAP', '', 'EXTERNAL')
        target = [('errorMessage', 'id_String')] + columns
        schema(mapper, 'errors', target)
        data = E.SubElement(mapper, 'nodeData', {f'{{{XSI}}}type': 'TalendMapper:MapperData'})
        E.SubElement(data, 'uiProperties'); E.SubElement(data, 'varTables', name='Var', minimized='true')
        for tag, name, cols in [('inputTables', 'loggedReject', rejected), ('outputTables', 'errors', target)]:
            table = E.SubElement(data, tag, name=name, sizeState='INTERMEDIATE')
            for label, kind in cols:
                entry = E.SubElement(table, 'mapperTableEntries', name=label, type=kind, nullable='true')
                if tag == 'outputTables': entry.set('expression', 'loggedReject.' + label)
        connect(root, log_name, 'tMap_1', 'loggedReject', log_name)
        file(root, 'tMap_1', 'errors', 'errors', target, variant, '_rejected')

    for variant in ['01_REPLICATE', '02_FILTER', '03_ADVANCED', '04_OR', '05_COLUMNS_MIXED',
                    '06_COLUMNS_DYNAMIC', '07_COLUMNS_STATIC', '08_CHAIN', '09_EMPTY']:
        root = copy.deepcopy(base); root.set('xmlns:TalendMapper', MAPPER)
        for connection in root.findall('connection'): root.remove(connection)
        for component in root.findall('node'):
            if component.get('componentName') != 'tMSSqlInput': root.remove(component)
        for context in root.findall('context/contextParameter'):
            if context.get('name') == 'OUTPUT_DIRECTORY': context.set('value', str(results))
        source = root.find('node')
        if variant == '09_EMPTY':
            source.find('elementParameter[@name="QUERY"]').set('value', json.dumps(
                "DECLARE @q nvarchar(max)=N'SELECT CAST(''0007'' AS varchar(10)) AGENCE, CAST(''202601'' AS nvarchar(6)) MOIS UNION ALL SELECT ''0008'', ''202601'''; EXEC(@q);"))
        if variant == '01_REPLICATE':
            replicate = node(root, 'tReplicate', 'tReplicate_1', 400); schema(replicate, 'tReplicate_1', columns)
            connect(root, 'tDBInput_1', 'tReplicate_1', 'row1', 'tDBInput_1')
            file(root, 'tReplicate_1', 'tReplicate_1', 'copy1', columns, variant, '_a')
            file(root, 'tReplicate_1', 'tReplicate_1', 'copy2', columns, variant, '_b')
            log(root, 'tReplicate_1', 'tReplicate_1', 'copy3', columns)
        elif variant.startswith(('02', '03', '04')):
            name, rejected = filter_row(root, 'tDBInput_1', 'tDBInput_1', 'row1', variant)
            file(root, name, 'FILTER', 'accepted', columns, variant, connector='FILTER')
            reject_sink(root, name, rejected, variant)
        else:
            upstream, meta, label = 'tDBInput_1', 'tDBInput_1', 'row1'
            connector = 'FLOW'
            if variant.startswith(('08', '09')):
                replicate = node(root, 'tReplicate', 'tReplicate_1', 280); schema(replicate, 'tReplicate_1', columns)
                connect(root, upstream, 'tReplicate_1', label, meta)
                log(root, 'tReplicate_1', 'tReplicate_1', 'audit', columns)
                upstream, _ = filter_row(root, 'tReplicate_1', 'tReplicate_1', 'toFilter', variant)
                meta, label, connector = 'FILTER', 'accepted', 'FILTER'
            target = [('MOIS', 'id_String'), ('AGENCE', 'id_String'), ('SQL', 'id_Dynamic')]
            if variant == '06_COLUMNS_DYNAMIC': target = [('SQL', 'id_Dynamic')]
            if variant == '07_COLUMNS_STATIC': target = [('MOIS', 'id_String'), ('AGENCE', 'id_String')]
            project = node(root, 'tFilterColumns', 'tFilterColumns_1', 600); schema(project, 'tFilterColumns_1', target)
            connect(root, upstream, 'tFilterColumns_1', label, meta, connector)
            if variant.startswith(('08', '09')):
                name = log(root, 'tFilterColumns_1', 'tFilterColumns_1', 'projected', target)
                file(root, name, name, 'logged', target, variant)
            else: file(root, 'tFilterColumns_1', 'tFilterColumns_1', 'projected', target, variant)
        name = 'TEST_DYNAMIC_PROCESS_' + variant
        folder = output / 'DYNAMIC_SCHEMA_TEST/process'
        write_xml(folder / (name + '_0.1.item'), root)
        ids = ['_' + uuid.uuid4().hex for _ in range(4)]
        props = E.Element(f'{{{XMI}}}XMI', {f'{{{XMI}}}version': '2.0'})
        E.SubElement(props, f'{{{PROPERTIES}}}Property', {f'{{{XMI}}}id': ids[0], 'id': ids[1], 'label': name, 'displayName': name, 'version': '0.1', 'item': ids[3]})
        E.SubElement(props, f'{{{PROPERTIES}}}ItemState', {f'{{{XMI}}}id': ids[2], 'path': ''})
        item = E.SubElement(props, f'{{{PROPERTIES}}}ProcessItem', {f'{{{XMI}}}id': ids[3], 'property': ids[0], 'state': ids[2]})
        E.SubElement(item, 'process', href=name + '_0.1.item#/')
        write_xml(folder / (name + '_0.1.properties'), props)
        names.append(name)
    (output / 'jobs.json').write_text(json.dumps(names, indent=2) + '\n')
    for fixture in output.rglob('*.item'): fixture.chmod(0o600)
    print('Generated', len(names), 'synthetic processing jobs')


if __name__ == '__main__':
    main()
