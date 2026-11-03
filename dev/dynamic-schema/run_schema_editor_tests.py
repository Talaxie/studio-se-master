#!/usr/bin/env python3
"""Run schema editor tests against a built core UI JAR, without modifying the installation."""
import argparse
import os
from pathlib import Path
import subprocess
import sys

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('--installation', type=Path, required=True)
parser.add_argument('--core-ui', type=Path, required=True)
parser.add_argument('--output', type=Path, required=True)
args = parser.parse_args()
root = Path(__file__).resolve().parents[2]
output = args.output.resolve()
output.mkdir(parents=True, exist_ok=True)
plugins = args.installation.resolve() / 'plugins'
junit = Path.home() / '.m2/repository/junit/junit/4.13.2/junit-4.13.2.jar'
hamcrest = Path.home() / '.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar'
cp = os.pathsep.join(map(str, [args.core_ui.resolve(), junit, hamcrest, *plugins.glob('*.jar'), *(p for p in plugins.iterdir() if p.is_dir())]))
test = root / 'tcommon-studio-se/test/plugins/org.talend.core.ui.test/src/main/java/org/talend/core/ui/metadata/dialog/CustomTableManagerDynamicTest.java'
subprocess.run(['javac', '-proc:none', '-encoding', 'UTF-8', '-cp', cp, '-d', str(output), str(Path(__file__).with_name('CheckSchemaEditor.java')), str(test)], check=True)
subprocess.run(['java', *(['-XstartOnFirstThread'] if sys.platform == 'darwin' else []), '-Duser.language=fr', '-Duser.country=FR', '-cp', os.pathsep.join(map(str, [output, *plugins.glob('org.eclipse.osgi_*.jar')])), 'CheckSchemaEditor', str(args.installation.resolve()), str(output / 'osgi'), str(output), str(junit), str(hamcrest), str(args.core_ui.resolve())], check=True)
