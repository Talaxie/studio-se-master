#!/usr/bin/env python3
"""Run real JDBC Dynamic round trips using a private properties file and supplied drivers."""
import argparse
import os
from pathlib import Path
import subprocess

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('--connections', required=True, type=Path)
parser.add_argument('--output', required=True, type=Path)
parser.add_argument('--oracle-driver', required=True, type=Path)
parser.add_argument('--mysql-driver', required=True, type=Path)
parser.add_argument('--postgres-driver', required=True, type=Path)
args = parser.parse_args()
root = Path(__file__).resolve().parents[2]
output = args.output.resolve()
output.mkdir(parents=True, exist_ok=True)
runtime = root / 'tcommon-studio-se/main/plugins/org.talend.librariesmanager/resources/java/routines/system'
subprocess.run(['javac', '--release', '8', '-encoding', 'UTF-8', '-d', str(output),
                *[str(runtime / (n + '.java')) for n in ['Dynamic', 'DynamicMetadata', 'DynamicJdbc', 'DynamicUtils', 'DynamicTransfer']],
                str(Path(__file__).with_name('LiveMultiDbTest.java'))], check=True)
cp = os.pathsep.join(map(str, [output, args.oracle_driver, args.mysql_driver, args.postgres_driver]))
subprocess.run(['java', '-cp', cp, 'LiveMultiDbTest', str(args.connections.resolve())], check=True, timeout=300)
