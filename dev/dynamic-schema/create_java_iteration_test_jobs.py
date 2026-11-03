#!/usr/bin/env python3
"""Create read-only SQL Server -> tJavaRow iteration recipes from a private input fixture."""
import argparse
import copy
from datetime import datetime
import json
from pathlib import Path
import uuid
import xml.etree.ElementTree as E
import zipfile

from create_test_jobs import SQL, PROCESS, PROPERTIES, XMI, node, parameter, schema, write_xml


def iteration_code(fixed, variant):
    names = ['AGENCE', 'MOIS', 'MONTANT', 'VIDE', 'TEXTE'][fixed:]
    if variant == 'EMPTY':
        names = []
    code = '''// Dynamic is a container: visit its physical columns for each incoming row.
routines.system.Dynamic dynamic = input_row.SQL;
if (dynamic == null) throw new IllegalStateException("Missing Dynamic container");
int rowNumber = ((Integer) globalMap.getOrDefault("JAVA_DYNAMIC_ROWS", Integer.valueOf(0))).intValue() + 1;
String[] expectedNames = __NAMES__;
if (dynamic.getColumnCount() != expectedNames.length)
    throw new IllegalStateException("Unexpected Dynamic column count: " + dynamic.getColumnCount());
__STATIC_CHECK__
for (int i = 0; i < dynamic.getColumnCount(); i++) {
    routines.system.DynamicMetadata metadata = dynamic.getColumnMetadata(i);
    Object value = dynamic.getColumnValue(i);
    String fieldName = metadata.getName();
    if (!expectedNames[i].equals(fieldName) || metadata.getColumnPosition() != i + __FIXED__ + 1)
        throw new IllegalStateException("Unexpected name or JDBC ordinal: " + fieldName);
    if (!java.util.Objects.equals(value, dynamic.getColumnValue(fieldName)))
        throw new IllegalStateException("Index/name lookup mismatch: " + fieldName);
    if ("MONTANT".equals(fieldName)) {
        if (rowNumber == 1) {
            if (!(value instanceof java.math.BigDecimal)
                    || !new java.math.BigDecimal("1234567890123456789012345678.1234567890").equals(value)
                    || metadata.getLength() != 38 || metadata.getPrecision() != 10)
                throw new IllegalStateException("Decimal value/precision/scale changed");
        } else if (value != null) throw new IllegalStateException("Decimal NULL changed");
    } else if ("VIDE".equals(fieldName)) {
        if (rowNumber == 1 ? value != null : !Integer.valueOf(0).equals(value))
            throw new IllegalStateException("NULL and zero must remain distinct");
    } else {
        String expected = "AGENCE".equals(fieldName) ? (rowNumber == 1 ? "0007" : "0008")
            : "MOIS".equals(fieldName) ? "202601" : rowNumber == 1 ? "Été €" : "Obsèques";
        if (!expected.equals(value)) throw new IllegalStateException("String value changed: " + fieldName);
    }
    System.out.println("JAVA_DYNAMIC_FIELD|CASE=__VARIANT__|ROW=" + rowNumber
        + "|INDEX=" + i + "|NAME=" + fieldName + "|TALEND_TYPE=" + metadata.getType()
        + "|DB_TYPE=" + metadata.getDbType() + "|JAVA_TYPE=" + (value == null ? "null" : value.getClass().getName())
        + "|VALUE=" + String.valueOf(value));
}
globalMap.put("JAVA_DYNAMIC_ROWS", Integer.valueOf(rowNumber));
globalMap.put("JAVA_DYNAMIC_FIELDS", Integer.valueOf(
    ((Integer) globalMap.getOrDefault("JAVA_DYNAMIC_FIELDS", Integer.valueOf(0))).intValue() + dynamic.getColumnCount()));
'''
    static = '' if not fixed else '''if (!(rowNumber == 1 ? "0007" : "0008").equals(input_row.AGENCE))
    throw new IllegalStateException("Static prefix changed");'''
    if fixed == 2:
        static += '\nif (!"202601".equals(input_row.MOIS)) throw new IllegalStateException("Second static column changed");'
    code += 'output_row.SQL = dynamic.copy();\n'
    for column in ['AGENCE', 'MOIS'][:fixed]:
        code += 'output_row.' + column + ' = input_row.' + column + ';\n'
    return (code.replace('__NAMES__', 'new String[] {' + ', '.join(json.dumps(n) for n in names) + '}')
            .replace('__STATIC_CHECK__', static).replace('__FIXED__', str(fixed)).replace('__VARIANT__', variant))


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--template', type=Path, required=True, help='Existing private mixed SQL Server input job')
    parser.add_argument('--output', type=Path, required=True)
    args = parser.parse_args()
    output = args.output.resolve()
    output.mkdir(parents=True, exist_ok=True, mode=0o700)
    base = E.parse(args.template).getroot()
    manifest = []
    for variant, fixed, expected_rows in [('ALL', 0, 2), ('MIXED', 2, 2), ('EMPTY', 2, 2), ('ZERO_ROWS', 2, 0)]:
        name = 'TEST_MSSQL_DYNAMIC_JAVA_' + variant
        root = copy.deepcopy(base)
        root.tag = f'{{{PROCESS}}}ProcessType'
        source = next(n for n in root.findall('node') if n.get('componentName') == 'tMSSqlInput')
        for child in list(root):
            if child.tag in ('connection', 'subjob', 'note') or (child.tag == 'node' and child is not source):
                root.remove(child)
        source.find('elementParameter[@name="UNIQUE_NAME"]').set('value', 'tDBInput_1')
        source.set('posX', '120'); source.set('posY', '128')
        query = SQL
        if variant in ('EMPTY', 'ZERO_ROWS'):
            query = "DECLARE @q nvarchar(max)=N'SELECT CAST(''0007'' AS varchar(10)) AGENCE, CAST(''202601'' AS nvarchar(6)) MOIS UNION ALL SELECT ''0008'', ''202601'''; EXEC(@q);"
            if variant == 'ZERO_ROWS':
                query = "DECLARE @q nvarchar(max)=N'SELECT CAST(''0007'' AS varchar(10)) AGENCE, CAST(''202601'' AS nvarchar(6)) MOIS WHERE 1=0'; EXEC(@q);"
        source.find('elementParameter[@name="QUERY"]').set('value', json.dumps(query, ensure_ascii=False))
        columns = [('AGENCE', 'id_String'), ('MOIS', 'id_String')][:fixed] + [('SQL', 'id_Dynamic')]
        for md in source.findall('metadata'): source.remove(md)
        schema(source, 'tDBInput_1', columns)
        java = node(root, 'tJavaRow', 'tJavaRow_1', 440)
        schema(java, 'tJavaRow_1', columns)
        parameter(java, 'CODE', iteration_code(fixed, variant), 'MEMO_JAVA')
        parameter(java, 'IMPORT', '', 'MEMO_IMPORT')
        E.SubElement(root, 'connection', connectorName='FLOW', label='row1', lineStyle='0', metaname='tDBInput_1', source='tDBInput_1', target='tJavaRow_1', offsetLabelX='0', offsetLabelY='0')
        logger = node(root, 'tLogRow', 'tLogRow_1', 760)
        schema(logger, 'tLogRow_1', columns)
        parameter(logger, 'TABLE_PRINT', 'true', 'RADIO')
        parameter(logger, 'BASIC_PRINT', 'false', 'RADIO')
        parameter(logger, 'VERTICAL_PRINT', 'false', 'RADIO')
        parameter(logger, 'PRINT_HEADER', 'true', 'CHECK')
        parameter(logger, 'FIELDSEPARATOR', '";"')
        E.SubElement(root, 'connection', connectorName='FLOW', label='row2', lineStyle='0', metaname='tJavaRow_1', source='tJavaRow_1', target='tLogRow_1', offsetLabelX='0', offsetLabelY='0')
        final = node(root, 'tJava', 'tJava_1', 1040)
        final.set('posY', '320')
        fields = expected_rows * (5 - fixed if variant not in ('EMPTY', 'ZERO_ROWS') else 0)
        parameter(final, 'CODE', '''int rows = ((Integer) globalMap.getOrDefault("JAVA_DYNAMIC_ROWS", Integer.valueOf(0))).intValue();
int fields = ((Integer) globalMap.getOrDefault("JAVA_DYNAMIC_FIELDS", Integer.valueOf(0))).intValue();
if (rows != __ROWS__ || fields != __FIELDS__)
    throw new IllegalStateException("Iteration count mismatch: rows=" + rows + ", fields=" + fields);
System.out.println("PASS __NAME__ rows=" + rows + " fields=" + fields);
'''.replace('__ROWS__', str(expected_rows)).replace('__FIELDS__', str(fields)).replace('__NAME__', name), 'MEMO_JAVA')
        E.SubElement(root, 'connection', connectorName='SUBJOB_OK', label='OnSubjobOk', lineStyle='1', metaname='tDBInput_1', source='tDBInput_1', target='tJava_1', offsetLabelX='0', offsetLabelY='0')
        dest = output / 'DYNAMIC_SCHEMA_TEST/process'
        item = dest / (name + '_0.1.item'); write_xml(item, root); item.chmod(0o600)
        ids = ['_' + uuid.uuid4().hex for _ in range(4)]
        props = E.Element(f'{{{XMI}}}XMI', {f'{{{XMI}}}version': '2.0'})
        prop = E.SubElement(props, f'{{{PROPERTIES}}}Property', {f'{{{XMI}}}id': ids[0], 'id': ids[1], 'label': name, 'displayName': name, 'version': '0.1', 'item': ids[3]})
        stamp = datetime.now().astimezone().isoformat(timespec='milliseconds')
        for key in ('created_date', 'modified_date'):
            E.SubElement(prop, 'additionalProperties', {f'{{{XMI}}}id': '_' + uuid.uuid4().hex, 'key': key, 'value': stamp})
        E.SubElement(props, f'{{{PROPERTIES}}}ItemState', {f'{{{XMI}}}id': ids[2], 'path': ''})
        process = E.SubElement(props, f'{{{PROPERTIES}}}ProcessItem', {f'{{{XMI}}}id': ids[3], 'property': ids[0], 'state': ids[2]})
        E.SubElement(process, 'process', href=name + '_0.1.item#/')
        write_xml(dest / (name + '_0.1.properties'), props)
        (output / (variant + '.java.fragment')).write_text(iteration_code(fixed, variant))
        manifest.append({'name': name, 'variant': variant, 'fixed': fixed, 'expected_rows': expected_rows, 'expected_fields': fields})
    archive = output / 'dynamic-java-iteration-jobs.zip'
    with zipfile.ZipFile(archive, 'w', zipfile.ZIP_DEFLATED) as z:
        for path in sorted((output / 'DYNAMIC_SCHEMA_TEST').rglob('*')):
            if path.is_file(): z.write(path, path.relative_to(output / 'DYNAMIC_SCHEMA_TEST'))
    archive.chmod(0o600)
    (output / 'jobs.json').write_text(json.dumps(manifest, indent=2) + '\n')
    print('Generated four Java iteration recipes:', archive)


if __name__ == '__main__':
    main()
