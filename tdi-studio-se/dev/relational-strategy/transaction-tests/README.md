# SQL Server order and rollback checks

This is a standalone JDBC prototype of ordered batching, not a change to the Studio
component. Run from the isolated monorepo:

```sh
python3 tdi-studio-se/dev/relational-strategy/transaction-tests/run.py
```

The runner compiles `BatchOrderChecks.java` with Java 21 and uses the JDBC 9.4.1
libraries already exported by the benchmark jobs. It reads the existing connection
configuration and generated encrypted credential, passes them on stdin, and never
prints or writes credentials into a new configuration file.

Only `#RS_BATCH_ORDER`, a connection-local temporary table, is written. The normal
checks roll back all changes. One check commits a seed into this temporary table,
then verifies that rollback restores it after update/insert operations. The table
is removed automatically when the connection closes. No `actors`, Joblet data or
persistent benchmark table is touched.

Observed on SQL Server 16.00.1210 with JDBC 9.4.1.0: all 13 checks pass.

- Seven ordered cases preserve INSERT/UPDATE/DELETE order, repeated same-key
  updates, mixed actions, unique-value dependencies across different keys, and
  flush thresholds. UPSERT uses a barrier and executes sequentially.
- Three negative controls reproduce lost updates, a uniqueness violation across
  different keys, and a duplicate-key failure from naive two-phase batch UPSERT.
- Three rollback cases cover partial batch execution with XACT_ABORT OFF, automatic
  abort with XACT_ABORT ON, and restoration of a pre-existing row.

With XACT_ABORT OFF the failed batch returned `[1, -3, 1]`: the driver executed the
third insert despite the second insert failing. Explicit rollback cleared all writes.
With XACT_ABORT ON the driver threw a plain SQLServerException, not a
BatchUpdateException; update counts were unavailable and XACT_STATE was 0.

Design implications for the next component change:

1. One connection, autocommit disabled; bounded batches of consecutive equal actions.
2. Flush before changing action, before UPSERT, before commit, and at end of input.
3. Flushing a batch does not commit. UPSERT stays sequential initially.
4. Handle SQLException generally, inspect counts only when available, and explicitly
   resolve rollback/error handling according to transaction ownership. Do not commit
   remaining commands after a failed batch or replay them blindly.
5. Add generated-component regression tests before delivering a Studio update. These
   JDBC checks do not prove Studio integration, shared-connection ownership,
   trigger behavior, foreign keys or concurrent-writer behavior.

Results: `benchmark/transaction_tests_20261030/results.csv` and `execution.log` beside
the input fixtures under `/Volumes/infa2talend/infashared/SrcFiles/relationalStrategy/`.
