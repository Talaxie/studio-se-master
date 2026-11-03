#!/usr/bin/env python3
"""Run the runtime dependency regressions in an isolated OSGi configuration."""
import argparse
import os
from pathlib import Path
import subprocess

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument("--installation", type=Path, required=True, help="Product Contents/Eclipse directory")
parser.add_argument("--output", type=Path, required=True)
args = parser.parse_args()
installation = args.installation.resolve()
output = args.output.resolve()
output.mkdir(parents=True, exist_ok=True)
root = Path(__file__).resolve().parents[2]
junit = Path.home() / ".m2/repository/junit/junit/4.13.2/junit-4.13.2.jar"
hamcrest = Path.home() / ".m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar"
plugins = installation / "plugins"
classpath = os.pathsep.join(map(str, [junit, hamcrest, *plugins.glob("*.jar"),
                                     *(p for p in plugins.iterdir() if p.is_dir())]))
sources = [Path(__file__).with_name("CheckRuntimeLibraries.java"),
           root / "tcommon-studio-se/test/plugins/org.talend.librariesmanager.test/src/org/talend/librariesmanager/model/ProcessRuntimeLibrariesTest.java"]
subprocess.run(["javac", "-proc:none", "-cp", classpath, "-d", str(output), *map(str, sources)], check=True)
subprocess.run(["java", "-cp", os.pathsep.join(map(str, [output, *plugins.glob("org.eclipse.osgi_*.jar")])),
                "CheckRuntimeLibraries", str(installation), str(output / "osgi"), str(output),
                str(junit), str(hamcrest)], check=True)
