#!/usr/bin/env python3
"""Generate real LDAP JET fragments and compile/run regressions without an LDAP server."""
import argparse
import os
from pathlib import Path
import re
import subprocess

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('--studio', type=Path, required=True)
parser.add_argument('--java-home', type=Path, required=True, help='JDK 21 for Studio emitter compilation')
parser.add_argument('--job-java-home', type=Path, required=True, help='JDK 17 or 21 for generated jobs')
parser.add_argument('--output', type=Path, required=True)
a = parser.parse_args()
here = Path(__file__).resolve().parent
root = here.parents[1]
out = a.output.resolve()
out.mkdir(parents=True, exist_ok=True)
plugins = a.studio.resolve() / 'plugins'
cp = os.pathsep.join(map(str, [out, *plugins.glob('org.apache.log4j_*/*.jar'), *sorted(p for p in plugins.iterdir()
    if p.is_dir() or (p.suffix == '.jar' and not p.name.startswith('org.apache.jasper.glassfish_')))]))

def run(home, tool, *args):
    subprocess.run([str(home / 'bin' / tool), *map(str, args)], check=True)

components = root / 'tdi-studio-se/main/plugins/org.talend.designer.components.localprovider/components'
def flatten(path):
    return re.sub(r'<%@\s*include\s+file="([^"]+)"\s*%>',
                  lambda m: flatten(root / 'tdi-studio-se/main/plugins' / m[1][2:].replace('}', '', 1) if m[1].startswith('@{') else path.parent / m[1]), path.read_text())

sources = []
for part in ['begin', 'main', 'end']:
    imports = []
    def directive(m):
        match = re.search(r'imports="([^"]*)"', m[0])
        if match:
            imports.extend(match[1].split())
        return ''
    text = re.sub(r'<%@\s*jet\s+.*?%>', directive,
                  flatten(components / f'tLDAPOutput/tLDAPOutput_{part}.javajet'), flags=re.S)
    flat = out / f'Ldap{part}.javajet'
    flat.write_text('<%@ jet imports="' + ' '.join(dict.fromkeys(imports)) + '" %>\n' + text)
    sources += [flat, out / f'Ldap{part}.java']
run(a.java_home, 'javac', '-proc:none', '-cp', cp, '-d', out, here / 'CompileTemplates.java')
run(a.java_home, 'java', '-cp', cp, 'CompileTemplates', *sources)
run(a.java_home, 'javac', '-proc:none', '-cp', cp, '-d', out, *sources[1::2], here / 'GenerateLdap.java')
run(a.java_home, 'java', '-cp', cp, 'GenerateLdap', out)
# Compile the actual shipped StringUtils routine, not a test reimplementation.
routines = next(plugins.glob('org.talend.librariesmanager_*')) / 'resources/java/routines/system/StringUtils.java'
job_out = out / 'jobs'
job_out.mkdir(exist_ok=True)
jobs = sorted(out.glob('Generated*.java'))
for source in jobs:
    text = source.read_text()
    assert 'com.sun.org.apache.xml.internal.security' not in text, source
run(a.job_java_home, 'javac', '--release', '17', '-encoding', 'UTF-8', '-d', job_out,
    routines, here / 'Base64Cases.java', here / 'RecordingContext.java', *jobs)
for source in jobs:
    run(a.job_java_home, 'java', '-Dfile.encoding=windows-1252', '-cp', job_out, source.stem)
print(f'PASS: {len(jobs)} generated fixtures, {a.job_java_home.name}, target Java 17')
