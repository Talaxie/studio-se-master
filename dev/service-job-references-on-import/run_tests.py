#!/usr/bin/env python3
"""Run the compiled import regression tests with an installed Studio's libraries."""

import argparse
import os
from pathlib import Path
import subprocess


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--plugins", type=Path, required=True, help="Studio's Eclipse plugins directory")
    parser.add_argument("--maven-repository", type=Path, default=Path.home() / ".m2/repository")
    args = parser.parse_args()
    root = Path(__file__).resolve().parents[2]
    class_directories = [
        root / "tesb-studio-se/test/plugins/org.talend.esb.repository.services.test/target/classes",
        root / "tcommon-studio-se/main/plugins/org.talend.core.runtime/target/classes",
        root / "tcommon-studio-se/main/plugins/org.talend.repository.items.importexport/target/classes",
        root / "tesb-studio-se/main/plugins/org.talend.repository.services/target/classes",
    ]
    libraries = [
        args.maven_repository / "junit/junit/4.13.2/junit-4.13.2.jar",
        args.maven_repository / "org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar",
    ]
    for path in [*class_directories, *libraries, args.plugins]:
        if not path.exists():
            parser.error(f"Missing {path}; build the four modules first (see README.md).")
    classpath = os.pathsep.join(str(path) for path in [*class_directories, *libraries, args.plugins / "*"])
    return subprocess.run([
        "java", "-classpath", classpath, "org.junit.runner.JUnitCore",
        "org.talend.esb.repository.services.ServiceJobReferencesImportTest",
    ], check=False).returncode


if __name__ == "__main__":
    raise SystemExit(main())
