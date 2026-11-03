#!/usr/bin/env python3
"""Compile and run dynamic schema regressions using JDK 21 and Studio libraries.

The supplied Studio is read-only. All generated files go to --output.
"""

import argparse
import os
from pathlib import Path
import re
import subprocess


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--plugins", required=True, type=Path)
    parser.add_argument("--output", required=True, type=Path)
    args = parser.parse_args()
    root = Path(__file__).resolve().parents[2]
    output = args.output.resolve()
    output.mkdir(parents=True, exist_ok=True)
    maven = Path.home() / ".m2/repository"
    libraries = [maven / "junit/junit/4.13.2/junit-4.13.2.jar",
                 maven / "org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar",
                 maven / "oro/oro/2.0.8/oro-2.0.8.jar",
                 maven / "org/talend/components/talendcsv/1.1.0/talendcsv-1.1.0.jar",
                 maven / "org/talend/components/lib/talend_file_enhanced/1.3/talend_file_enhanced-1.3.jar",
                 maven / "org/talend/components/lib/thashfile/3.1-20190910/thashfile-3.1-20190910.jar",
                 maven / "org/talend/components/lib/talend_DB_mssqlUtil/1.4/talend_DB_mssqlUtil-1.4.jar",
                 *sorted(args.plugins.glob("org.apache.log4j_*/*.jar"))]
    plugins = args.plugins.resolve()
    cp = os.pathsep.join(map(str, [output, *libraries,
                                  *sorted(p for p in plugins.glob("*.jar")
                                          if not p.name.startswith("org.apache.jasper.glassfish_")),
                                  *sorted(p for p in plugins.iterdir() if p.is_dir())]))
    runtime = root / "tcommon-studio-se/main/plugins/org.talend.librariesmanager/resources/java/routines/system"
    runtime_java8 = output / "runtime-java8"
    runtime_java8.mkdir(exist_ok=True)
    subprocess.run(["javac", "--release", "8", "-encoding", "UTF-8", "-d", str(runtime_java8),
                    *[str(runtime / (name + ".java")) for name in
                      ["Dynamic", "DynamicMetadata", "DynamicUtils", "DynamicLogRow", "DynamicFields", "DynamicTransfer", "DynamicJdbc", "DynamicDml"]]], check=True)
    mapper = root / "tdi-studio-se/main/plugins/org.talend.designer.mapper/src/main/java/org/talend/designer/mapper/utils/problems"
    tests = [root / "tcommon-studio-se/test/plugins/org.talend.librariesmanager.test/src/routines/system/DynamicDmlTest.java",
             root / "tcommon-studio-se/test/plugins/org.talend.librariesmanager.test/src/routines/system/DynamicJdbcTest.java",
             root / "tcommon-studio-se/test/plugins/org.talend.designer.maven.test/src/main/java/org/talend/designer/maven/tools/SystemRoutinesFingerprintTest.java",
             root / "tcommon-studio-se/test/plugins/org.talend.librariesmanager.test/src/routines/system/DynamicPriority2Test.java",
             root / "tcommon-studio-se/test/plugins/org.talend.librariesmanager.test/src/routines/system/DynamicLogRowTest.java",
             root / "tcommon-studio-se/test/plugins/org.talend.librariesmanager.test/src/routines/system/DynamicSchemaTest.java",
             root / "tcommon-studio-se/test/plugins/org.talend.librariesmanager.test/src/routines/system/DynamicMssqlOutputTest.java",
             root / "tdi-studio-se/test/plugins/org.talend.designer.mapper.test/src/org/talend/designer/mapper/utils/problems/DynamicMappingValidatorTest.java",
             root / "tcommon-studio-se/test/plugins/org.talend.core.runtime.test/src/org/talend/core/model/metadata/DynamicSchemaSupportTest.java"]
    sources = [root / "tcommon-studio-se/main/plugins/org.talend.designer.maven/src/main/java/org/talend/designer/maven/tools/SystemRoutinesFingerprint.java",
               *(runtime / (name + ".java") for name in ["Dynamic", "DynamicMetadata", "DynamicUtils", "DynamicLogRow", "DynamicFields", "DynamicTransfer", "DynamicJdbc", "DynamicDml"]),
               mapper / "DynamicMappingValidator.java",
               root / "tcommon-studio-se/main/plugins/org.talend.core.runtime/src/main/java/org/talend/core/model/metadata/DynamicSchemaSupport.java", *tests, Path(__file__).with_name("CompileTemplates.java")]
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    *map(str, sources)], check=True)
    subprocess.run(["java", "-cp", cp, "org.junit.runner.JUnitCore", "routines.system.DynamicSchemaTest",
                    "routines.system.DynamicDmlTest", "routines.system.DynamicMssqlOutputTest", "routines.system.DynamicLogRowTest", "routines.system.DynamicPriority2Test", "routines.system.DynamicJdbcTest",
                    "org.talend.designer.mapper.utils.problems.DynamicMappingValidatorTest",
                    "org.talend.core.model.metadata.DynamicSchemaSupportTest",
                    "org.talend.designer.maven.tools.SystemRoutinesFingerprintTest"], check=True)

    plugin_sources = {p.name: p for repo in ["tdi-studio-se", "tcommon-studio-se"]
                      for p in (root / repo / "main/plugins").iterdir() if p.is_dir()}

    def flatten(path):
        text = path.read_text()

        def include(match):
            reference = match.group(1)
            bundle = re.match(r"@\{([^}]+)\}/(.*)", reference)
            target = plugin_sources[bundle[1]] / bundle[2] if bundle else path.parent / reference
            return flatten(target.resolve())

        return re.sub(r'<%@\s*include\s+file="([^"]+)"\s*%>', include, text)

    components = plugin_sources["org.talend.designer.components.localprovider"] / "components"
    templates = ["tMSSqlInput/tMSSqlInput_begin.javajet", "tMSSqlInput/tMSSqlInput_end.javajet",
                 "tFileOutputDelimited/tFileOutputDelimited_begin.javajet",
                 "tFileOutputDelimited/tFileOutputDelimited_main.javajet",
                 "tFileOutputDelimited/tFileOutputDelimited_end.javajet",
                 "tMSSqlOutput/tMSSqlOutput_begin.javajet", "tMSSqlOutput/tMSSqlOutput_main.javajet",
                 "tMSSqlOutput/tMSSqlOutput_end.javajet",
                 "tLogRow/tLogRow_begin.javajet", "tLogRow/tLogRow_main.javajet", "tLogRow/tLogRow_end.javajet",
                 "tMap/tMap_begin.javajet", "tMap/tMap_main.javajet", "tMap/tMap_end.javajet",
                 "tReplicate/tReplicate_main.javajet",
                 "tFilterRow/tFilterRow_begin.javajet", "tFilterRow/tFilterRow_main.javajet", "tFilterRow/tFilterRow_end.javajet",
                 "tFilterColumns/tFilterColumns_begin.javajet", "tFilterColumns/tFilterColumns_main.javajet", "tFilterColumns/tFilterColumns_end.javajet",
                 "tFileInputDelimited/tFileInputDelimited_begin.javajet", "tFileInputDelimited/tFileInputDelimited_end.javajet",
                 "tExtractDynamicFields/tExtractDynamicFields_begin.javajet", "tExtractDynamicFields/tExtractDynamicFields_main.javajet", "tExtractDynamicFields/tExtractDynamicFields_end.javajet",
                 "tWriteDynamicFields/tWriteDynamicFields_begin.javajet", "tWriteDynamicFields/tWriteDynamicFields_main.javajet", "tWriteDynamicFields/tWriteDynamicFields_end.javajet",
                 "tHashOutput/tHashOutput_begin.javajet", "tHashOutput/tHashOutput_main.javajet", "tHashOutput/tHashOutput_end.javajet",
                 "tHashInput/tHashInput_begin.javajet", "tHashInput/tHashInput_end.javajet",
                 "tBufferOutput/tBufferOutput_main.javajet",
                 "tRunJob/tRunJob_begin.javajet", "tRunJob/tRunJob_main.javajet", "tRunJob/tRunJob_finally.javajet"]
    templates += [f"{name}/{name}_{part}.javajet" for name in ["tOracleInput", "tMysqlInput", "tPostgresqlInput"] for part in ["begin", "end"]]
    templates += [f"{name}/{name}_{part}.javajet" for name in ["tOracleOutput", "tMysqlOutput", "tPostgresqlOutput"] for part in ["begin", "main", "end"]]
    emitter_sources = []
    compile_args = []
    for index, relative in enumerate(templates):
        text = flatten(components / relative)
        imports = []

        def directive(match):
            imported = re.search(r'imports="([^"]*)"', match[0])
            if imported:
                imports.extend(imported[1].split())
            return ""

        text = re.sub(r"<%@\s*jet\s+.*?%>", directive, text, flags=re.S)
        name = "DynamicTemplate" + str(index)
        flat = output / (name + ".javajet")
        skeleton = ''
        if relative.split('/')[0] in ['tMSSqlOutput', 'tOracleOutput', 'tMysqlOutput', 'tPostgresqlOutput']:
            imports.extend(['java.util.HashMap', 'org.talend.core.model.metadata.MappingTypeRetriever', 'org.talend.core.model.metadata.MetadataTalendType', 'org.talend.core.model.metadata.types.JavaTypesManager'])
            skeleton_file = output / 'db_output_bulk.skeleton'
            skeleton_file.write_text((components / 'templates/db_output_bulk.skeleton').read_text())
            skeleton = ' skeleton="db_output_bulk.skeleton"'
        if relative.startswith('tMap/'):
            (output / 'tMap_commons.skeleton').write_text((components / 'tMap/tMap_commons.skeleton').read_text())
            skeleton = ' skeleton="tMap_commons.skeleton"'
        flat.write_text('<%@ jet imports="' + " ".join(dict.fromkeys(imports)) + '"' + skeleton + ' %>\n' + text)
        java = output / (name + ".java")
        emitter_sources.append(java)
        compile_args.extend([str(flat), str(java)])
    subprocess.run(["java", "-cp", cp, "CompileTemplates", *compile_args], check=True)
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    *map(str, emitter_sources)], check=True)
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    str(Path(__file__).with_name("GenerateRows.java"))], check=True)
    subprocess.run(["java", "-cp", cp, "GenerateRows", str(output)], check=True)
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    str(Path(__file__).with_name("GenerateOutputs.java"))], check=True)
    subprocess.run(["java", "-cp", cp, "GenerateOutputs", str(output), str(root /
                    "tcommon-studio-se/main/plugins/org.talend.core.runtime/mappings/mapping_MSSQL.xml")], check=True)
    subprocess.run(["python3", str(Path(__file__).with_name("run_sql_output_tests.py")), "--compile-only",
                    "--classes", str(output), "--plugins", str(plugins)], check=True)
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    str(Path(__file__).with_name("GenerateLogRows.java"))], check=True)
    subprocess.run(["java", "-cp", cp, "GenerateLogRows", str(output)], check=True)
    logs = ["GeneratedLog" + mode for mode in ["BASIC", "TABLE", "VERTICAL", "REJECT"]]
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    *[str(output / (name + ".java")) for name in logs]], check=True)
    for name in logs:
        subprocess.run(["java", "-cp", cp, name], check=True)
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    str(Path(__file__).with_name("GenerateProcessingRows.java"))], check=True)
    subprocess.run(["java", "-cp", cp, "GenerateProcessingRows", str(output)], check=True)
    processing = sorted(output.glob("GeneratedReplicate*.java")) + sorted(output.glob("GeneratedStatic*.java")) + sorted(output.glob("GeneratedProjection*.java")) + sorted(output.glob("GeneratedFilter*.java"))
    subprocess.run(["javac", "--release", "8", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    *map(str, processing)], check=True)
    for source in processing:
        subprocess.run(["java", "-cp", cp, source.stem], check=True)
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    str(Path(__file__).with_name("GenerateFileRows.java"))], check=True)
    subprocess.run(["java", "-cp", cp, "GenerateFileRows", str(output), str(components)], check=True)
    files = sorted(output.glob("GeneratedFile*.java"))
    subprocess.run(["javac", "--release", "8", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    *map(str, files)], check=True)
    for source in files:
        subprocess.run(["java", "-cp", cp, source.stem], check=True)
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    str(Path(__file__).with_name("GenerateDynamicFieldRows.java"))], check=True)
    subprocess.run(["java", "-cp", cp, "GenerateDynamicFieldRows", str(output)], check=True)
    dynamic_fields = sorted(output.glob("GeneratedDynamicFields*.java"))
    subprocess.run(["javac", "--release", "8", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    *map(str, dynamic_fields)], check=True)
    for source in dynamic_fields:
        subprocess.run(["java", "-cp", cp, source.stem], check=True)
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    str(Path(__file__).with_name("GenerateHashRows.java"))], check=True)
    subprocess.run(["java", "-cp", cp, "GenerateHashRows", str(output)], check=True)
    hashes = sorted(output.glob("GeneratedHash*.java"))
    subprocess.run(["javac", "--release", "8", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    *map(str, hashes)], check=True)
    for source in hashes:
        subprocess.run(["java", "-cp", cp, source.stem], check=True)
    # Compile and execute the Java actually emitted for N=0, N=1 and N=2.
    # Only authentication/driver setup is replaced with an in-memory JDBC fixture.
    pipelines = []
    for fixed in [0, 1, 2, "static"]:
        begin = (output / ("input-0-" + str(fixed) + ".java.fragment")).read_text()
        begin = begin.replace("com.microsoft.sqlserver.jdbc.SQLServerDriver", "GeneratedPipelineSupport")
        begin = re.sub(r"final String decryptedPassword_[^=]+=[^;]+;",
                       'final String decryptedPassword_tMSSqlInput_1 = "";', begin)
        end = (output / ("input-1-" + str(fixed) + ".java.fragment")).read_text()
        main = (output / ("output-main-" + str(fixed) + ".java.fragment")).read_text()
        name = "GeneratedPipeline" + str(fixed)
        java = output / (name + ".java")
        source = r'''import java.util.*;
import java.io.*;
import routines.system.*;
public class CLASS {
    static class Row { String AGENCE; String MOIS; Dynamic SQL; }
    static String run(boolean emptySuffix) throws Exception {
        GeneratedPipelineSupport.reset(emptySuffix);
        Map<String,Object> globalMap = new HashMap<>(), resourceMap = new HashMap<>();
        String projectName = "synthetic";
        Row row = new Row();
        File filetFileOutputDelimited_1 = File.createTempFile("dynamic-schema-", ".tmp");
        try {
            StringWriter outtFileOutputDelimited_1 = new StringWriter();
            String OUT_DELIM_tFileOutputDelimited_1 = ";", OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = "\n";
            boolean isFirstCheckDyn_tFileOutputDelimited_1 = true;
            int nb_line_tFileOutputDelimited_1 = 0;
            BEGIN
            MAIN
            END
            if (GeneratedPipelineSupport.executions != 1 || !GeneratedPipelineSupport.closed)
                throw new AssertionError("Query execution or resource closure failed");
            if (!Integer.valueOf(1).equals(globalMap.get("tMSSqlInput_1_NB_LINE")))
                throw new AssertionError("Wrong input line count");
            return outtFileOutputDelimited_1.toString();
        } finally {
            filetFileOutputDelimited_1.delete();
        }
    }
    public static void main(String[] args) throws Exception {
        String expected = "AGENCE;MOIS;MONTANT;VIDE;TEXTE\n0007;202601;1234567890123456789012345678.1234567890;;Été €\n";
        String actual = run(false);
        if (!expected.equals(actual)) throw new AssertionError(actual);
        EXTRA
        System.out.println("Generated pipeline FIXED passed");
    }
}
'''
        extra = 'if (!"AGENCE;MOIS\\n0007;202601\\n".equals(run(true))) throw new AssertionError("Empty suffix separator");' if fixed == 2 else ""
        source = source.replace("CLASS", name).replace("BEGIN", begin).replace("MAIN", main).replace("END", end)
        source = source.replace("EXTRA", extra).replace("FIXED", str(fixed))
        if fixed == "static":
            source = source.replace("Dynamic SQL;", "String SQL;")
            source = source.replace("AGENCE;MOIS;MONTANT;VIDE;TEXTE\\n0007;202601;1234567890123456789012345678.1234567890;;Été €\\n",
                                    "0007;202601;1234567890123456789012345678.1234567890\\n")
        java.write_text(source)
        pipelines.append(java)
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", cp, "-d", str(output),
                    str(Path(__file__).with_name("GeneratedPipelineSupport.java")), *map(str, pipelines)], check=True)
    for fixed in [0, 1, 2, "static"]:
        subprocess.run(["java", "-cp", cp, "GeneratedPipeline" + str(fixed)], check=True)
    print("Runtime/mapper/capability tests and generated SQL-to-file pipelines passed.")


if __name__ == "__main__":
    try:
        main()
    except subprocess.CalledProcessError as error:
        raise SystemExit("Regression command failed (exit " + str(error.returncode) + "). See output above.")
