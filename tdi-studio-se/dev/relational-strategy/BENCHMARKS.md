# Relational strategy benchmarks

Recorded on 30–31 October 2026. SQL Server medians and the three other database campaigns use the different protocols described below.

Performance — INSERT, UPDATE and DELETE, batches of 50,000 in both modes:

Classic is the baseline (**100%**). The percentage is **elapsed-time difference**, calculated as `(strategy time / classic time - 1) × 100`; negative means strategy took less time, positive means more time. It is not a throughput percentage.

| Database | Action | 10,000 rows: classic → strategy (s) | Time difference | 100,000 rows: classic → strategy (s) | Time difference |
| --- | --- | ---: | ---: | ---: | ---: |
| SQL Server | INSERT | 1.188 → 1.224 | +3.0% | 6.429 → 6.105 | -5.0% |
| SQL Server | UPDATE | 1.110 → 1.113 | +0.3% | 7.721 → 7.125 | -7.7% |
| SQL Server | DELETE | 0.967 → 0.874 | -9.6% | 5.960 → 5.615 | -5.8% |
| PostgreSQL | INSERT | 1.072 → 1.104 | +2.9% | 10.069 → 10.471 | +4.0% |
| PostgreSQL | UPDATE | 1.233 → 1.297 | +5.2% | 14.982 → 12.917 | -13.8% |
| PostgreSQL | DELETE | 1.060 → 0.918 | -13.4% | 9.026 → 9.263 | +2.6% |
| MySQL | INSERT | 0.915 → 0.914 | -0.1% | 8.459 → 5.315 | -37.2% |
| MySQL | UPDATE | 8.288 → 10.539 | +27.2% | 76.118 → 72.249 | -5.1% |
| MySQL | DELETE | 5.929 → 4.898 | -17.4% | 42.626 → 40.624 | -4.7% |
| Oracle | INSERT | 0.287 → 0.286 | -0.1% | 1.122 → 1.096 | -2.3% |
| Oracle | UPDATE | 0.493 → 0.433 | -12.2% | 3.058 → 3.082 | +0.8% |
| Oracle | DELETE | 0.448 → 0.548 | +22.1% | 4.171 → 3.712 | -11.0% |

Methodology and limits:

- SQL Server: one excluded warmup plus five measured runs per case; the table reports medians. Both modes use a 50,000-row commit interval. Timing includes CSV reading, mapping, target connection/preparation, writes and commits.
- PostgreSQL/MySQL/Oracle: one measured run per case, no warmup, fresh JVM; **36/36 cases passed**. Both modes use a shared connection, autocommit disabled and an explicit final commit. Timing includes CSV reading, mapping, output preparation, writes and commit; connection establishment is excluded.
- Table reset/seed and full final-state verification are excluded in both campaigns. INSERT/UPDATE checks every final key/value/date; DELETE checks the table is empty. No rejected rows are accepted.
- MySQL retains `rewriteBatchedStatements=true`; classic INSERT uses its extended-insert setting with 50,000 rows per batch. Oracle classic batching on an existing connection is explicitly enabled. Oracle verification fetching at 100,000 rows is 50,000 in both modes, outside the timed section.
- The same input CSV, mapping, database and JDBC driver are used within each comparison. Output phases are generated from the production JET templates and compiled into the same Studio-generated job skeleton for both modes.
- Each benchmark flow contains one action. These results do not measure mixed-action flows, whose action changes can shorten batches.
- The campaigns have different measurement/connection protocols and are not intended to rank database engines. Single-pass results are exploratory; they do not establish a reproducible performance gain. SQL Server run ranges also overlap.

Additional SQL Server UPSERT comparison, **sequential in both modes** (classic `UPDATE_OR_INSERT` versus strategy `UPSERT`, 50% existing keys, one run per case, no warmup, commit interval 50,000):

| Rows | Classic (s) | Strategy (s) | Elapsed-time difference |
| ---: | ---: | ---: | ---: |
| 10,000 | 226.013 | 215.524 | -4.6% |
| 100,000 | 1,922.584 | 1,717.794 | -10.7% |

No batched UPSERT performance claim is made. PostgreSQL/MySQL/Oracle UPSERT is covered by the functional tests, not by this performance campaign.
