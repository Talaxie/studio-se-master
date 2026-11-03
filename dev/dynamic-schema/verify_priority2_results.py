#!/usr/bin/env python3
"""Assert exact CSV results after running the priority-two jobs in Studio."""
import argparse
import csv
import json
from pathlib import Path

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('--fixtures', required=True, type=Path)
args = parser.parse_args()
base = args.fixtures.resolve()

def read(path):
    with path.open(encoding='utf-8', newline='') as stream:
        return list(csv.reader(stream, delimiter=';'))

full = read(base / 'inputs/csv.csv')
empty = read(base / 'inputs/empty.csv')
plain = read(base / 'inputs/delimited.csv')
sql = [['AGENCE', 'MOIS', 'MONTANT', 'VIDE', 'TEXTE'],
       ['0007', '202601', '1234567890123456789012345678.1234567890', '', 'Été €'],
       ['0008', '202601', '', '0', 'Obsèques']]
expected = {
    '01_FILE_DELIMITED': plain,
    '02_FILE_CSV_MIXED': full,
    '03_FILE_CSV_ALL': full,
    '04_FILE_CSV_EMPTY': empty,
    '05_EXTRACT_TYPED': full,
    '06_WRITE_STATIC': sql,
    '07_WRITE_EXISTING': [[r[i] for i in [0, 2, 3, 4, 1]] for r in sql],
    '08_HASH_MIXED': sql,
    '09_HASH_REREAD': sql,
    '09_HASH_REREAD_second': sql,
    '10_HASH_LINKED': sql + sql[1:],
    '11_HASH_NULL': sql[:2] + [['', '']],
    '13_PARENT_MIXED': full,
    '15_PARENT_ALL': full,
    '16_FILE_REJECT': full[:2],
    '17_FIELDS_ROUNDTRIP': sql,
    '18_HASH_EMPTY': empty,
    '19_FILE_HEADER_ZERO': full,
    '20_FILE_CSV_APPEND': full + full[1:],
}
for name, rows in expected.items():
    actual = read(base / 'results' / (name + '.csv'))
    assert actual == rows, f'{name}: incorrect header, values, order or row count'
    print('PASS', name)
(base / 'results-verification.json').write_text(json.dumps({
    'csv_files_verified': len(expected),
    'jobs': json.loads((base / 'jobs.json').read_text()),
    'children_executed_by_parents': ['TEST_DYNAMIC_P2_12_CHILD_MIXED', 'TEST_DYNAMIC_P2_14_CHILD_ALL'],
    'values': 'Exact decoded CSV cells, including embedded newline, Unicode, decimal precision and null/empty containers'
}, indent=2) + '\n')
