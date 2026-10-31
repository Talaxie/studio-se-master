#!/usr/bin/env python3
"""Compile SQL Server's real JET emitters using locally installed Studio dependencies.

All generated files live outside the checkout. No Maven install or database is needed.
"""
from pathlib import Path
import os
import re
import subprocess
import tempfile
import xml.etree.ElementTree as ET

REPO = Path(__file__).resolve().parents[2]
COMPONENTS = REPO / 'main/plugins/org.talend.designer.components.localprovider/components'
HERE = Path(__file__).resolve().parent


def classpath():
    cache = Path.home() / '.m2/repository'
    jars = {}
    for group in [cache / 'p2/osgi/bundle', cache / 'org/talend/studio']:
        for p in sorted(group.glob('*/*/*.jar'), key=lambda p: tuple(int(n) for n in re.findall(r'\d+', p.parent.name))):
            if p.parent.parent.name == 'org.apache.jasper.glassfish':
                continue
            if any(s in p.name for s in ['-sources.', '-javadoc.', '.source-']):
                continue
            if group.name == 'studio' and p.parent.name != '8.9.0-SNAPSHOT':
                continue
            jars[p.parent.parent.name] = p
    return os.pathsep.join(map(str, jars.values()))


def flatten(path, baseline=False):
    text = subprocess.check_output(['git', 'show', 'HEAD:' + str(path.relative_to(Path(subprocess.check_output(['git','rev-parse','--show-toplevel'], cwd=REPO, text=True).strip())))], cwd=REPO, text=True) if baseline else path.read_text()
    text = text.replace('@{org.talend.designer.components.localprovider}', str(COMPONENTS.parent))
    def include(match):
        name = match[1].replace('@{org.talend.designer.components.localprovider}', str(COMPONENTS.parent))
        return flatten((path.parent / name).resolve(), baseline)
    text = re.sub(r'<%@\s*include\s+file="([^"]+)"\s*%>', include, text)
    text = re.sub(r'skeleton="([^"]+)"', lambda m: 'skeleton="' + str((path.parent / m[1]).resolve()) + '"', text)
    return text


def run(*args):
    result = subprocess.run(args)
    if result.returncode:
        raise SystemExit(f'{args[0]} failed with exit code {result.returncode}')


def main():
    ET.parse(COMPONENTS / 'tMSSqlOutput/tMSSqlOutput_java.xml')
    with tempfile.TemporaryDirectory(prefix='talaxie-relational-strategy-') as tmp:
        out = Path(tmp)
        cp = classpath()
        if os.environ.get('RS_SQLSERVER_TESTS'):
            exports = Path('/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/benchmark/exported/jobs/RelationalBenchmark')
            cp += os.pathsep + os.pathsep.join(map(str, [*sorted((exports/'lib').glob('*.jar')), exports/'bench_insert_classic_row/bench_insert_classic_row_0_1.jar']))
        run('javac', '-proc:none', '-cp', cp, '-d', tmp, str(HERE / 'CompileTemplates.java'))
        templates = []
        for phase in ['begin', 'main', 'end', 'finally']:
            source = COMPONENTS / f'tMSSqlOutput/tMSSqlOutput_{phase}.javajet'
            target = out / source.name
            target.write_text(flatten(source))
            templates.append(str(target))
            baseline = out / ('Baseline_' + source.name)
            baseline.write_text(flatten(source, baseline=True))
            templates.append(str(baseline))
        run('java', '-cp', tmp + os.pathsep + cp, 'CompileTemplates', tmp, *templates)
        run('javac', '-proc:none', '-cp', cp, '-d', tmp, *map(str, sorted(out.glob('*tMSSqlOutput_*.java'))))
        print('PASS: XML and all four SQL Server JET emitters compile', flush=True)
        if (HERE / 'StrategyChecks.java').exists():
            run('javac', '-proc:none', '-cp', tmp + os.pathsep + cp, '-d', tmp, str(HERE / 'StrategyChecks.java'))
            run('java', '-cp', tmp + os.pathsep + cp, 'StrategyChecks', tmp)
            run('javac', '-proc:none', '-cp', tmp + os.pathsep + cp, '-d', tmp, str(HERE / 'BatchStrategyChecks.java'))
            if os.environ.get('RS_SQLSERVER_TESTS'):
                import importlib.util
                spec = importlib.util.spec_from_file_location('sqlrunner', HERE / 'transaction-tests/run.py')
                sqlrunner = importlib.util.module_from_spec(spec); spec.loader.exec_module(sqlrunner)
                subprocess.run(['java', '-cp', tmp + os.pathsep + cp, 'BatchStrategyChecks', tmp], input=sqlrunner.connection_payload(), text=True, check=True)
            else:
                run('java', '-cp', tmp + os.pathsep + cp, 'BatchStrategyChecks', tmp)


if __name__ == '__main__':
    main()
