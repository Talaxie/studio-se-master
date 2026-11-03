#!/usr/bin/env python3
"""Create importable Standard Talaxie jobs with synthetic SQL Server data only."""

import argparse
import json
from pathlib import Path
import uuid
import xml.etree.ElementTree as ET
import zipfile

XMI = "http://www.omg.org/XMI"
XSI = "http://www.w3.org/2001/XMLSchema-instance"
PROCESS = "platform:/resource/org.talend.model/model/TalendFile.xsd"
PROPERTIES = "http://www.talend.org/properties"
MAPPER = "http://www.talend.org/mapper"
for prefix, uri in [("xmi", XMI), ("xsi", XSI), ("talendfile", PROCESS), ("TalendProperties", PROPERTIES)]:
    ET.register_namespace(prefix, uri)

SQL = """DECLARE @q nvarchar(max);
SET @q = N'SELECT CAST(''0007'' AS varchar(10)) AS AGENCE,
CAST(''202601'' AS nvarchar(6)) AS MOIS,
CAST(1234567890123456789012345678.1234567890 AS decimal(38,10)) AS MONTANT,
CAST(NULL AS int) AS VIDE, CAST(N''Été €'' AS nvarchar(30)) AS TEXTE
UNION ALL SELECT CAST(''0008'' AS varchar(10)), CAST(''202601'' AS nvarchar(6)),
CAST(NULL AS decimal(38,10)), CAST(0 AS int), CAST(N''Obsèques'' AS nvarchar(30))
ORDER BY AGENCE';
EXEC(@q);"""


def parameter(parent, name, value, field="TEXT"):
    ET.SubElement(parent, "elementParameter", field=field, name=name, value=value)


def schema(parent, name, columns, connector="FLOW"):
    metadata = ET.SubElement(parent, "metadata", connector=connector, name=name)
    for label, kind in columns:
        ET.SubElement(metadata, "column", name=label, type=kind, nullable="true", key="false",
                      length="38" if kind == "id_BigDecimal" else "100" if kind == "id_String" else "-1",
                      precision="10" if kind == "id_BigDecimal" else "-1", sourceType="VARCHAR",
                      usefulColumn="true", pattern="", comment="")


def node(parent, component, name, x):
    element = ET.SubElement(parent, "node", componentName=component, componentVersion="0.102" if component in ("tMSSqlInput", "tMSSqlOutput") else "2.1" if component == "tMap" else "0.101",
                            posX=str(x), posY="128", offsetLabelX="0", offsetLabelY="0")
    parameter(element, "UNIQUE_NAME", name)
    parameter(element, "CONNECTION_FORMAT", "row")
    return element


def write_xml(path, root):
    path.parent.mkdir(parents=True, exist_ok=True)
    ET.indent(root, space="  ")
    ET.ElementTree(root).write(path, encoding="UTF-8", xml_declaration=True)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--output", type=Path, required=True)
    args = parser.parse_args()
    output = args.output.resolve()
    project = output / "DYNAMIC_SCHEMA_TEST"
    project.mkdir(parents=True, exist_ok=True)
    eclipse = ET.Element("projectDescription")
    ET.SubElement(eclipse, "name").text = "DYNAMIC_SCHEMA_TEST"
    ET.SubElement(eclipse, "comment")
    ET.SubElement(eclipse, "projects")
    ET.SubElement(eclipse, "buildSpec")
    natures = ET.SubElement(eclipse, "natures")
    ET.SubElement(natures, "nature").text = "org.talend.core.talendnature"
    write_xml(project / ".project", eclipse)
    description = ET.Element(f"{{{PROPERTIES}}}Project", {f"{{{XMI}}}version": "2.0",
                            f"{{{XMI}}}id": "_DynamicSchemaProject", "label": "DYNAMIC_SCHEMA_TEST",
                            "technicalLabel": "DYNAMIC_SCHEMA_TEST", "language": "java"})
    write_xml(project / "talend.project", description)
    fixed = [("AGENCE", "id_String"), ("MOIS", "id_String")]
    all_columns = fixed + [("MONTANT", "id_BigDecimal"), ("VIDE", "id_Integer"), ("TEXTE", "id_String")]
    for variant, columns in [("ALL", [("SQL", "id_Dynamic")]),
                             ("MIXED", fixed + [("SQL", "id_Dynamic")]), ("STATIC", all_columns),
                             ("DB_ALL", [("SQL", "id_Dynamic")]), ("DB_MIXED", fixed + [("SQL", "id_Dynamic")])]:
        database_output = variant.startswith("DB_")
        name = "TEST_MSSQL_DYNAMIC_" + variant
        root = ET.Element(f"{{{PROCESS}}}ProcessType", {f"{{{XMI}}}version": "2.0",
                          "xmlns:TalendMapper": MAPPER, "defaultContext": "Default", "jobType": "Standard"})
        context = ET.SubElement(root, "context", name="Default", confirmationNeeded="false")
        for key, value in {"DB_HOST": "127.0.0.1", "DB_PORT": "11433", "DB_NAME": "master",
                           "DB_SCHEMA": "dbo", "DB_USER": "sa", "DB_PASSWORD": "",
                           "DB_PROPERTIES": "encrypt=true;trustServerCertificate=true",
                           "OUTPUT_TABLE": "TALAXIE_DYNAMIC_OUTPUT_" + uuid.uuid4().hex,
                           "OUTPUT_DIRECTORY": str(output / "results")}.items():
            ET.SubElement(context, "contextParameter", name=key,
                          type="id_Password" if key == "DB_PASSWORD" else "id_String", value=value,
                          prompt=key, promptNeeded="false")
        parameters = ET.SubElement(root, "parameters")
        for key in ["STATANDLOG_USE_PROJECT_SETTINGS", "IMPLICITCONTEXT_USE_PROJECT_SETTINGS"]:
            parameter(parameters, key, "false", "CHECK")
        source = node(root, "tMSSqlInput", "tDBInput_1", 128)
        for key, value, field in [("TYPE", "MSSQL", "TEXT"), ("DRIVER", "MSSQL_PROP", "CLOSED_LIST"),
                                  ("USE_EXISTING_CONNECTION", "false", "CHECK"),
                                  ("PROPERTY:PROPERTY_TYPE", "BUILT_IN", "TECHNICAL"),
                                  ("SCHEMA:SCHEMA_TYPE", "BUILT_IN", "TECHNICAL"),
                                  ("MAPPING", "id_MSSQL", "MAPPING_TYPE"),
                                  ("QUERY", json.dumps(SQL, ensure_ascii=False), "MEMO_SQL"),
                                  ("TABLE", '""', "DBTABLE"), ("TRIM_ALL_COLUMN", "false", "CHECK")]:
            parameter(source, key, value, field)
        for key, target in {"HOST": "DB_HOST", "PORT": "DB_PORT", "DBNAME": "DB_NAME", "DB_SCHEMA": "DB_SCHEMA",
                            "USER": "DB_USER", "PASS": "DB_PASSWORD", "PROPERTIES": "DB_PROPERTIES"}.items():
            parameter(source, key, "context." + target, "PASSWORD" if key == "PASS" else "TEXT")
        schema(source, "tDBInput_1", columns)
        mapper = node(root, "tMap", "tMap_1", 384)
        parameter(mapper, "MAP", "", "EXTERNAL")
        schema(mapper, "out1", columns)
        data = ET.SubElement(mapper, "nodeData", {f"{{{XSI}}}type": "TalendMapper:MapperData"})
        ET.SubElement(data, "uiProperties")
        ET.SubElement(data, "varTables", name="Var", minimized="true", sizeState="INTERMEDIATE")
        for tag, table_name in [("outputTables", "out1"), ("inputTables", "row1")]:
            table = ET.SubElement(data, tag, name=table_name, sizeState="INTERMEDIATE")
            for label, kind in columns:
                entry = ET.SubElement(table, "mapperTableEntries", name=label, type=kind, nullable="true")
                if tag == "outputTables":
                    entry.set("expression", "row1." + label)
        sink_name = "tDBOutput_1" if database_output else "tFileOutputDelimited_1"
        sink = node(root, "tMSSqlOutput" if database_output else "tFileOutputDelimited", sink_name, 640)
        sink_parameters = [("FILENAME", 'context.OUTPUT_DIRECTORY + "/' + variant.lower() + '.csv"', "FILE"),
                                  ("FIELDSEPARATOR", '";"', "TEXT"), ("ROWSEPARATOR", '"\\n"', "TEXT"),
                                  ("ENCODING", '"ISO-8859-15"', "ENCODING_TYPE"), ("CSV_OPTION", "false", "CHECK"),
                                  ("INCLUDEHEADER", "true", "CHECK"), ("APPEND", "false", "CHECK"),
                                  ("FILE_EXIST_EXCEPTION", "false", "CHECK"),
                                  ("CREATE", "true", "CHECK"), ("DELETE_EMPTYFILE", "true", "CHECK")]
        if database_output:
            import copy
            for element in source.findall("elementParameter"):
                if element.get("name") in ["DRIVER", "TYPE", "MAPPING", "HOST", "PORT", "DBNAME", "DB_SCHEMA",
                        "USER", "PASS", "PROPERTIES", "USE_EXISTING_CONNECTION", "PROPERTY:PROPERTY_TYPE", "SCHEMA:SCHEMA_TYPE"]:
                    sink.append(copy.deepcopy(element))
            sink_parameters = [("TABLE", "context.OUTPUT_TABLE", "DBTABLE"),
                               ("DATA_ACTION", "INSERT", "CLOSED_LIST"),
                               ("TABLE_ACTION", "DROP_IF_EXISTS_AND_CREATE", "CLOSED_LIST"),
                               ("USE_BATCH_SIZE", "true", "CHECK"), ("BATCH_SIZE", "10000", "TEXT"),
                               ("COMMIT_EVERY", "10000", "TEXT"), ("DIE_ON_ERROR", "true", "CHECK")]
        for key, value, field in sink_parameters:
            parameter(sink, key, value, field)
        schema(sink, sink_name, columns)
        if database_output:
            schema(sink, "REJECT", columns + [("errorCode", "id_String"), ("errorMessage", "id_String")], "REJECT")
        for source_name, target, label, meta in [("tDBInput_1", "tMap_1", "row1", "tDBInput_1"),
                                                ("tMap_1", sink_name, "out1", "out1")]:
            ET.SubElement(root, "connection", connectorName="FLOW", label=label, lineStyle="0", metaname=meta,
                          source=source_name, target=target, offsetLabelX="0", offsetLabelY="0")
        folder = project / "process"
        write_xml(folder / (name + "_0.1.item"), root)
        ids = ["_" + uuid.uuid4().hex for _ in range(4)]
        properties = ET.Element(f"{{{XMI}}}XMI", {f"{{{XMI}}}version": "2.0"})
        ET.SubElement(properties, f"{{{PROPERTIES}}}Property", {f"{{{XMI}}}id": ids[0], "id": ids[1],
                      "label": name, "displayName": name, "version": "0.1", "item": ids[3], "statusCode": ""})
        ET.SubElement(properties, f"{{{PROPERTIES}}}ItemState", {f"{{{XMI}}}id": ids[2], "path": ""})
        item = ET.SubElement(properties, f"{{{PROPERTIES}}}ProcessItem", {f"{{{XMI}}}id": ids[3],
                             "property": ids[0], "state": ids[2]})
        ET.SubElement(item, "process", href=name + "_0.1.item#/")
        write_xml(folder / (name + "_0.1.properties"), properties)
    archive = output / "dynamic-schema-test-jobs.zip"
    with zipfile.ZipFile(archive, "w", zipfile.ZIP_DEFLATED) as zipped:
        for path in project.rglob("*"):
            if path.is_file():
                zipped.write(path, path.relative_to(output))
    print(archive)


if __name__ == "__main__":
    main()
