#!/usr/bin/env python3
"""Compile and execute generated output fragments against a test SQL Server.

Only uniquely named TALAXIE_DYNAMIC_OUTPUT_* tables are created/dropped.
Connection credentials must be supplied through TALAXIE_TEST_JDBC_* environment variables.
"""
import argparse
import os
from pathlib import Path
import re
import subprocess

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument("--classes", required=True, type=Path, help="Output from run_tests.py")
parser.add_argument("--plugins", required=True, type=Path)
parser.add_argument("--driver", type=Path)
parser.add_argument("--compile-only", action="store_true", help="Compile emitted pipelines without a database")
parser.add_argument("--variants", nargs="*", help="Run only selected generated scenarios")
args = parser.parse_args()
output = args.classes.resolve()
plugins = args.plugins.resolve()
environment = os.environ.copy()
if not args.compile_only:
    for key in ["TALAXIE_TEST_JDBC_URL", "TALAXIE_TEST_JDBC_USER", "TALAXIE_TEST_JDBC_PASSWORD"]:
        if key not in os.environ:
            raise SystemExit("Missing test environment variable: " + key)
    if args.driver is None:
        raise SystemExit("Provide --driver for live SQL tests")
    host = re.search(r"jdbc:sqlserver://([^:;]+):(\d+)", os.environ["TALAXIE_TEST_JDBC_URL"])
    database = re.search(r";database(?:Name)?=([^;]+)", os.environ["TALAXIE_TEST_JDBC_URL"], re.I)
    if not host or not database:
        raise SystemExit("Use a SQL Server JDBC URL with explicit host, port and databaseName")
    environment.update(TALAXIE_TEST_DB_HOST=host[1], TALAXIE_TEST_DB_PORT=host[2], TALAXIE_TEST_DB_NAME=database[1])
classpath = os.pathsep.join(map(str, [output, *([args.driver.resolve()] if args.driver else []),
        *plugins.glob("*.jar"), *(p for p in plugins.iterdir() if p.is_dir()),
        *plugins.glob("org.apache.log4j_*/*.jar")]))
sources = [Path(__file__).with_name("LiveMssqlOutputSupport.java")]
names = []
for variant in args.variants or ["0", "1", "2", "empty", "reject", "zero", "create", "create_if", "large"]:
    fixed = int(variant) if variant.isdigit() else 2 if variant in ["empty", "reject", "large"] else 0
    name = "GeneratedMssqlOutput_" + variant
    names.append(name)
    parts = [(output / f"sql-output-{part}-{variant}.java.fragment").read_text() for part in range(3)]
    source = """import java.sql.*;
import routines.TalendDate;
import routines.system.Dynamic;
import routines.system.DynamicUtils;
public class """ + name + """ extends LiveMssqlOutputSupport {
    protected void execute(ResultSet source) throws Exception {
        rowStruct row = new rowStruct();
        rejectedStruct rejected = null;
        Dynamic dynamic = DynamicUtils.createMssqlDynamic(source.getMetaData(), """ + str(fixed) + ");\n" + parts[0] + """
        while (source.next()) {
            tos_count_tMSSqlOutput_1++;
            row.AGENCE = source.getString(1);
            row.MOIS = source.getString(2);
            row.SQL = dynamic;
            DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, source, """ + str(fixed) + """, null, false);
            rejected = null;
""" + parts[1] + """
            if (rejected != null) { rejectedRows.add(rejected); }
            if (tos_count_tMSSqlOutput_1 % 1000 == 0) { System.out.println("Rows processed: " + tos_count_tMSSqlOutput_1); }
        }
""" + parts[2] + """
    }
    public static void main(String[] args) throws Exception { new """ + name + '().test("' + variant + '", ' + str(fixed) + "); }\n}\n"
    path = output / (name + ".java")
    path.write_text(source)
    sources.append(path)
try:
    subprocess.run(["javac", "-proc:none", "-encoding", "UTF-8", "-cp", classpath, "-d", str(output),
                    *map(str, sources)], check=True)
    for name in names:
        if not args.compile_only:
            subprocess.run(["java", "-cp", classpath, name], check=True, env=environment, timeout=300)
    if args.compile_only:
        print("Generated SQL output pipelines compiled: " + str(len(names)) + " variants.")
except subprocess.CalledProcessError as error:
    raise SystemExit("Generated SQL output test failed (exit " + str(error.returncode) + "). See output above.")
except subprocess.TimeoutExpired:
    raise SystemExit("Generated SQL output test exceeded 300 seconds; inspect the fixture table named in the log.")
