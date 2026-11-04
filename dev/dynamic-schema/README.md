# Dynamic schemas: SQL Server, Oracle, MySQL and PostgreSQL / OGF

Current scope (2026-11-03): Standard Java jobs in DI and ESB support dynamic JDBC input/output for the four databases, mixed static/Dynamic schemas, INSERT/UPDATE/DELETE and the native upsert modes described in the final section. Correspondence keys may be declared in the static prefix or selected by physical name from Dynamic using the advanced settings described in the final section. The shared processing, file, cache and child-return components are described in the extension sections below. The following initial SQL Server section records the original increment; later sections supersede its former restrictions.

## Initial SQL Server increment


This implementation supports Standard Java DI jobs with the Microsoft SQL Server JDBC provider (`tMSSqlInput` / `tMSSqlOutput`, also displayed as `tDBInput` / `tDBOutput`). A main schema contains either static columns only, or zero or more static columns followed by one final `id_Dynamic` column.

The static prefix keeps its declared types. JDBC result metadata describes the remaining physical columns at execution time, including queries executed through `EXEC(@sql)`. Dynamic column positions are absolute, one-based JDBC ordinals; duplicate labels do not drop columns. Decimal precision and scale are preserved through `BigDecimal`. A result with no remaining dynamic columns is valid and does not add a trailing delimiter.

Supported downstream paths: Standard Java `tMap` mappings to delimited files (CSV mode disabled), Microsoft SQL Server INSERT outputs and `tLogRow`. The mapper allows multiple outputs, dynamic lookup payloads, static join keys, matching modes, lookup load/reload/cache modes and disk storage, using the existing Standard mapper generator. Static expressions, variables, filters and rejects retain their usual behavior. A dynamic container must remain last and pass through unchanged under its original column name. It cannot be transformed, used as a join key, or referenced by variables, filters, constraints or lookup reload parameters. Other database providers, existing connection components, other execution frameworks and dynamic flat-file inputs are outside this increment.

SQL Server output supports `NONE`, `CREATE`, `DROP_CREATE`, `CREATE_IF_NOT_EXISTS` and `DROP_IF_EXISTS_AND_CREATE` table actions. CREATE uses the first row's runtime metadata, preserves SQL string types/lengths, decimal precision/scale and nullability, and quotes dynamic column labels (including `]`). Unsupported types and duplicate dynamic column names fail explicitly. A static prefix with an empty dynamic suffix is valid. No rows means no runtime schema is available: table creation/recreation is deferred and the target is left unchanged. Dynamic UPDATE/DELETE, identity options, extra SQL columns, field options, SQL debug mode and parallel output are not enabled.

INSERT uses prepared statements and the existing component's batch, commit, counter and cleanup paths. The technical `REJECT` schema may append `errorCode` and `errorMessage` after the dynamic column; this exception is restricted to the SQL output's REJECT connector. Connecting REJECT uses row-by-row insertion, as in the existing component, so a failed row can be identified. Its dynamic container is copied to preserve the rejected values when the input advances. A downstream tMap may accept these trailing diagnostics on input, then place the diagnostics before the unchanged dynamic container in its ordinary output schema.

Production changes are in `tcommon-studio-se` (runtime types, type registration, capability checks) and `tdi-studio-se` (editor validation, mapper validation and JDBC/file templates). No new plugin or proprietary runtime dependency is introduced.

## Focused verification

With JDK 21 and an installed Talaxie plugin directory:

```sh
python3 dev/dynamic-schema/run_tests.py \
  --plugins /path/to/Talaxie/plugins \
  --output /tmp/talaxie-dynamic-schema-tests
```

The helper reads the installed libraries without modifying them. It runs 27 JUnit tests, compiles eight real JET emitters, compiles nine emitted SQL output pipelines without a database, then generates, compiles and executes SQL-to-delimited-file fragments for zero, one and two static columns and a static-only control. The file pipeline tests use a local JDBC fixture. `CheckRegistry.java` additionally checks the actual Eclipse extension registry and exportable system routines in a built product.

`LiveSqlServerTest.java` checks a real Microsoft JDBC driver using synthetic, read-only SQL. It takes a SQL file and output directory as arguments; connection settings come exclusively from `TALAXIE_TEST_JDBC_URL`, `TALAXIE_TEST_JDBC_USER` and `TALAXIE_TEST_JDBC_PASSWORD`. Do not store credentials in this directory. Live checks passed with Microsoft JDBC 9.4.1 and 13.2.1, including `EXEC`, mixed prefixes, decimal(38,10), Unicode, NULL, duplicate labels and an empty suffix.

For live output checks, set the same environment variables and run:

```sh
python3 dev/dynamic-schema/run_sql_output_tests.py \
  --classes /tmp/talaxie-dynamic-schema-tests \
  --plugins /path/to/Talaxie/plugins --driver /path/to/mssql-jdbc.jar
```

All nine output scenarios passed with Microsoft JDBC 9.4.1 and 13.2.1: dynamic-only, one/two static fields, empty suffix, connected REJECT, zero source rows, CREATE, CREATE_IF_NOT_EXISTS, and 10,003 rows with batch/commit size 10,000. They compile and run the actual emitted begin/main/end fragments and check persisted rows, counters, decimal(38,10) (positive, negative, zero and NULL), Unicode and escaped column labels. The tests only create/drop unique `dbo.TALAXIE_DYNAMIC_OUTPUT_<uuid>` tables; all were removed after validation. The large batch can take several minutes on the remote test server; the harness allows 300 seconds per scenario. `InspectOutputFixtures.java` lists this namespace and can clean one explicitly named fixture after an interrupted run.

## Importable Studio jobs

```sh
python3 dev/dynamic-schema/create_test_jobs.py --output /tmp/talaxie-dynamic-jobs
```

Import the resulting ZIP/project in the newly built Talaxie. It contains `TEST_MSSQL_DYNAMIC_ALL`, `TEST_MSSQL_DYNAMIC_MIXED` (two static fields), `TEST_MSSQL_DYNAMIC_STATIC`, and two database output examples `TEST_MSSQL_DYNAMIC_DB_ALL` / `TEST_MSSQL_DYNAMIC_DB_MIXED`. All use the ordinary input → mapper → output path and the same two synthetic SQL rows. Configure the local context before running. The database examples recreate only their generated `OUTPUT_TABLE` test name. The generated export has an empty password and does not include client data.

The process XML uses the namespace `platform:/resource/org.talend.model/model/TalendFile.xsd`; an incorrect namespace can make a populated XML job appear empty in the Studio editor.

The three file jobs were opened, generated, compiled and executed with the **Run button** in the built Studio against the test SQL Server. All returned exit code 0 and produced byte-identical 114-byte ISO-8859-15 files. Their generated context passwords were encrypted. Test outputs can be overwritten on subsequent runs (`FILE_EXIST_EXCEPTION=false`). All five base examples, including both SQL output jobs, were subsequently executed with the Run button in the installed ESB on 2026-11-03; persisted database values were verified and dedicated test tables removed. Evidence is in `build-logs/esb-installed-tests-20261102`.

## Internal runtime libraries

The test jobs also exposed a pre-existing dependency collection problem: `getCodesModulesNeededForProcess` omitted internal system routine libraries when the job had no repository routine dependencies. Generated password handling nevertheless calls `PasswordEncryptUtil`, resulting in a missing `org.talend.daikon.crypto.Encryption` class at launch. The collector now includes `getSystemRunningModules()` independently of those declarations, using the existing extension declarations rather than hard-coded JAR versions. This applies to static jobs as well as dynamic jobs.

`ProcessRuntimeLibrariesTest` covers an empty routine dependency list and absent process parameters. Both cases failed before the correction and pass afterwards. Run the tests in an isolated OSGi configuration with:

```sh
python3 dev/dynamic-schema/run_runtime_libraries_tests.py \
  --installation /path/to/TOS_DI.app/Contents/Eclipse \
  --output /tmp/talaxie-runtime-libraries-tests
```

The small OSGi harness uses the built product's class space; it does not modify the installation or its workspace. The regression tests temporarily isolate the collector's cached module list and repository service and restore them in `finally`.

## Maven verification

The full 385-module DI/ESB aggregate build completed successfully on 2026-11-02 (7 min 59 s) with JDK 21 and Maven 3.9.7:

```sh
mvn -B -o -f studio-se-master/pom.xml \
  -Dtos.di=true -Dtos.esb=true -DskipTests -Dmaven.test.skip=true \
  -DforceContextQualifier=20261102_2314_dynamic_output clean install
```

The build packaged the DI and ESB products for macOS Cocoa aarch64. The target environment list was temporarily limited to that platform and restored byte-for-byte afterwards. The Maven command skips the full test reactor; the focused tests above were run separately. No installation under `/Applications` was replaced. Output-extension logs are in the workspace's `build-logs/dynamic-schema-output-20261102` directory, including `validation-result.json` and SQL cleanup evidence.

The final mapper change accepting technical reject diagnostics on input was verified afterwards with another successful Maven install:

```sh
mvn -B -o -f studio-se-master/pom.xml -Dtos.di=true -Dtos.esb=true \
  -pl :org.talend.core.runtime,:org.talend.core,:org.talend.designer.core,:org.talend.designer.mapper -am \
  -DskipTests -Dmaven.test.skip=true \
  -DforceContextQualifier=20261102_2314_dynamic_output install
```

The extracted local DI and ESB apps contain that latest rebuilt mapper. The earlier full-build distribution archives precede this final mapper adjustment and have not been repackaged. Building a changed plugin alone can select an older core runtime from the target platform; including the current core runtime in the reactor avoids that mismatch. All work is local on `Feat/dynamic-schema`; there are no commits or pushes.


## Standard mapper and tLogRow extension (2026-11-03)

The one-input/one-output restriction was removed from `DynamicMappingValidator`. Each dynamic output is checked against the dynamic fields of all input tables, including lookups. Static-only outputs remain valid. Empty/non-dynamic inputs do not bypass the restrictions on Dynamic variables or outputs. The existing mapper and internal advanced-hash generators now clone nullable Dynamic fields safely, including cumulative lookup rows. Existing match, join, filter and rejection algorithms are retained.

`tLogRow` expands the dynamic suffix into its physical labels/values in basic, table and vertical modes. It supports headers, names, separators, fixed-width presentation, labels, console redirection, Log4j content and NB_LINE, and leaves the incoming data untouched for downstream components. Its runtime source is Java 8 compatible even though Studio requires JDK 21. Table mode buffers formatted snapshots, flushes on metadata changes and at component end. An empty or null container is accepted. Static-only jobs retain the original generation branch.

Focused validation now covers 37 JUnit tests, Java 8 compilation of all four runtime sources, 14 real JET emitters (including the mapper's own skeleton), three emitted log pipelines, four emitted SQL-to-file pipelines and nine compiled SQL output variants. The Studio recipe includes the user's modified `TEST_MSSQL_DYNAMIC_MIXED`, with its existing `out2` connected to a table-mode `tLogRow`, plus synthetic jobs generated by `create_mapper_test_jobs.py` and `extend_mapper_test_jobs.py`. Connection context is supplied by a local fixture; do not export its credentials.

Integration cases cover four outputs and all log modes, static variables/filter rejects, lookup load-once in memory/on disk, outer and inner joins with rejection, Reload, Cache-or-Reload, mapper error rejection, tLogRow pass-through, unique/first/all-row matching, static main input with dynamic lookup, multiple dynamic lookups and joined output tables. SQL is synthetic and read-only. Evidence is stored outside Git under `build-logs/dynamic-map-20261103`.


The 2026-11-03 full 385-module DI/ESB clean install passed in 8 min 37 s, followed by another successful full install (7 min 20 s). The last Java 8 API correction in the runtime source and the Integer NB_LINE counter correction were verified by successful targeted Maven installs and the focused suite. Full builds used `-Dtos.di=true -Dtos.esb=true -DskipTests -Dmaven.test.skip=true -DforceContextQualifier=20261103_0040_dynamic_map` and the same temporary macOS aarch64 target restriction, restored byte-for-byte afterwards. `maven-full.log`, `maven-final.log`, `maven-java8-runtime.log` and `maven-counter.log` record the commands' results.

The installed DI/ESB apps under `/Applications/Talaxie-8.9-ogf` and the unpacked build apps have all four final plugin artifacts. File contents were compared with Maven artifacts; the app distribution archives were repackaged after synchronization. Installation backups are outside the applications under the mapper extension's build logs. No client projects were changed. The synthetic test project remains available in the installed workspace.

## Standard processing extension (2026-11-03)

`tReplicate`, `tFilterRow` and `tFilterColumns` now support Dynamic in Standard Java jobs, shared by DI and ESB. Copies of Dynamic values and metadata are isolated and null-safe. Existing static generation remains unchanged. `tReplicate` keeps all fields on each output. `tFilterColumns` maps columns by name, supports reordered/removed/added static columns and keeps or drops the entire unchanged dynamic container. Renaming or changing the type of that container is rejected before generation.

`tFilterRow` preserves the static prefix and Dynamic on accepted and rejected rows. Standard Conditions target static columns; native advanced Java conditions and AND/OR behavior remain available. The REJECT schema appends its native `errorMessage` after Dynamic. `tLogRow` displays that technical schema directly, including diagnostics; a tMap can move the diagnostic before Dynamic for ordinary downstream schemas. Native Integer row counters are preserved, including accepted/rejected counters and cases with only one output connected.

Validation includes 44 JUnit tests, 21 compiled JET emitters and 15 compiled/executed processing pipelines (Java 8 API target). Those pipelines cover three-output replication, dynamic-only schemas, branch mutation isolation for metadata/values/bytes, null and empty containers, projections retaining/dropping Dynamic, added static fields, basic/advanced/OR filters, absent accepted/rejected outputs and static regressions for all three components. Four generated tLogRow pipelines include direct reject diagnostics. The earlier four SQL-to-file pipelines and nine SQL output compilation variants still pass.

`create_processing_test_jobs.py` produces nine synthetic SQL Server integration jobs from a private connection fixture. It includes replication, filtering with rejects routed through tLogRow and tMap, mixed/dynamic-only/static projections, a combined chain and an EXEC result with an empty dynamic suffix. No client data is modified. Evidence and private fixtures are outside Git in `build-logs/dynamic-processing-20261103`.

The full 385-module Maven DI/ESB clean install succeeded in eight minutes, using JDK 21, macOS Cocoa aarch64 and qualifier `20261103_0120_dynamic_processing`. The parent target environment restriction was restored byte-for-byte afterwards. Full reactor tests were skipped; the focused tests above were run separately. Both Maven app archives contain the updated components. Five plugins were updated in each installed app with file-content verification and configuration/cache backups. All work remains local on `Feat/dynamic-schema`.

All nine processing jobs were executed successfully with the installed ESB Run button, and exact output file assertions passed. The existing two-output `TEST_MSSQL_DYNAMIC_MIXED` was regenerated and rerun successfully afterwards (exit 0, two rows per output). `validation-result.json` records the completed recipe and artifact checks.


## Priority-two files, fields, caches and child jobs (2026-11-03)

Standard Java jobs now support Dynamic through `tFileInputDelimited`, CSV output in `tFileOutputDelimited`, `tExtractDynamicFields`, `tWriteDynamicFields`, `tHashInput`, `tHashOutput`, `tRunJob` and the required `tBufferOutput` child return. The implementation is shared by DI and ESB. A schema may contain a static prefix followed by a final Dynamic column, or only Dynamic.

File readers discover the physical suffix from the header using the native delimited/CSV reader. CSV quoting, embedded separators/newlines, Unicode and append/header handling use the existing writer. An empty suffix produces a metadata-only container. Conversion failures in the static prefix retain the native reject fields after Dynamic; these technical rejects can be displayed directly with `tLogRow`. Existing-schema input (`USE_EXISTING_DYNAMIC`, requiring `tSetDynamicSchema`) and parallel/row-mode output remain outside this extension.

`tWriteDynamicFields` retains the static output prefix, snapshots an existing Dynamic container if present and adds input fields not retained statically. `tExtractDynamicFields` resolves physical fields by name, converts them to the declared output types and optionally returns the unextracted suffix. Missing nullable values become null; invalid/required conversions fail explicitly. Metadata, decimal precision and typed values are preserved.

Hash writes and reads snapshot metadata and mutable values, including byte arrays, dates and nested lists/maps. Linked caches, KEEP_ALL/FIRST/LAST, repeated reads, native release behavior and empty/null containers are covered. `tRunJob` uses `DynamicTransfer` for lossless transfer within the native String[][] buffer return contract. It supports referenced child jobs in the same JVM; dynamic job selection and an independent child process remain explicitly unsupported. The transport distinguishes null and empty containers, supports large strings and restricts deserialization classes to the runtime value contract.

Internal routines have no repository change events. Their content fingerprint now invalidates the Maven routines cache after an installed Studio update, so child-job compilation cannot continue using a stale routines.jar even when the product/project version is unchanged. Legacy cache entries without a fingerprint trigger one rebuild. Subsequent unchanged executions reuse the cache.

Focused validation uses `run_tests.py`: 62 JUnit tests, six Java 8 runtime sources, 38 actual JET emitters, eight new emitted file pipelines, four Write/Extract/Buffer pipelines and four native hash pipelines. The previous 15 processing, four log and four SQL-to-file executions and nine SQL output compilation variants remain in the same run. New cache tests cover changed bytes with unchanged timestamps, added/removed sources, provider ordering, installation relocation and unreadable sources.

`create_priority2_test_jobs.py` creates 20 local integration jobs from private connection fixtures; credentials are never embedded in this source tree. The cases cover delimited/CSV mixed and dynamic-only schemas, empty suffixes, typed extraction, writing static/existing fields, linked/repeated/null/empty caches, mixed/dynamic-only child returns, file rejects, Write/Extract round trips, header-zero behavior and CSV append. `verify_priority2_results.py --fixtures <private-fixture-directory>` compares all 19 CSV outputs exactly, including the second cache read. Two child jobs are executed by their parent jobs. SQL sources use synthetic, read-only queries. Evidence is kept outside Git under `build-logs/dynamic-priority2-20261103`.


The final full 385-module Maven DI/ESB clean install succeeded in 8 min 25 s with JDK 21 and qualifier `20261103_0940_dynamic_priority2`. A subsequent 20-second targeted Maven install validated a template indentation cleanup. Both commands used `-Dtos.di=true -Dtos.esb=true -DskipTests -Dmaven.test.skip=true`; focused tests were run separately. The temporary macOS Cocoa aarch64 target restriction was restored byte-for-byte. Six plugins were synchronized into each installed app and both unpacked product apps, with configuration/plugin backups and content comparisons. The distribution archives were repackaged afterwards.

All 20 integration jobs were exercised through the installed ESB Run action (the two children through their parents), and the 19 decoded CSV output assertions passed. The earlier `TEST_MSSQL_DYNAMIC_MIXED` also ran with exit 0 and two rows on both mapper outputs. The initial null-cache fixture mistakenly renamed its mapper flow; it now retains the mapped `out1` name. Fixture properties include native creation/modification timestamps, and recipe file outputs explicitly disable the native file-exists exception so test runs can overwrite their own disposable outputs. Private fixtures and reports remain outside Git. Changes are local in the `tcommon-studio-se` and `tdi-studio-se` source trees on `Feat/dynamic-schema`; nothing was committed or pushed.

Final GUI reruns after disabling the fixture file-exists exception passed on 2026-11-03: null-container cache job 11, mixed child-return parent 13 (two consecutive executions in the same session), dynamic-only parent 15 and CSV append job 20. Output timestamps confirmed actual regeneration, and all 19 exact CSV assertions passed again. The unchanged installed routines.jar was reused across those runs. There are no outstanding validation checks; see `validation-result.json`.


## Oracle, MySQL and PostgreSQL extension (2026-11-03)

Standard Java jobs now support Dynamic in `tOracleInput`/`tOracleOutput`, `tMysqlInput`/`tMysqlOutput` and `tPostgresqlInput`/`tPostgresqlOutput`, including their generic tDBInput/tDBOutput database selections. The implementation is shared by DI and ESB. Schemas may be entirely dynamic or contain a static prefix followed by Dynamic; an empty physical suffix is valid. Input discovery follows JDBC column ordinals and preserves aliases, native types, precision, scale and nullability.

`DynamicJdbc` centralizes metadata discovery, typed reads, destination type selection, identifier quoting, DDL and parameter binding. Output supports INSERT, JDBC batches, NONE/CREATE/DROP_CREATE/CREATE_IF_NOT_EXISTS/DROP_IF_EXISTS_AND_CREATE table actions and native REJECT diagnostics with isolated Dynamic snapshots. Creation is deferred until the first input row; an empty source leaves an existing destination intact. PostgreSQL reject processing uses native per-row savepoints so a rejected insertion cannot silently roll back earlier accepted rows.

Types exercised include exact Oracle NUMBER values (including negative scale), Oracle DATE with its time, CLOB/NCLOB and timestamp offsets; MySQL unsigned integers up to BIGINT UNSIGNED maximum, fractional timestamps and negative TIME durations exceeding 24 hours; PostgreSQL UUID, JSONB, XML, LocalTime, OffsetTime and timestamp offsets. Binary values, Unicode, NULL versus zero, decimal precision and same-JVM child transport are covered. Runtime sources remain Java 8 compatible; Studio is built and run on JDK 21.

This qualification covers each engine independently, not every cross-engine migration pair. UPDATE/DELETE/upsert, existing connections, parallel output, field/spatial options, extra SQL columns and MySQL extended insert/duplicate-key modes are outside the enabled scope. Unsupported native types such as arrays/spatial values fail explicitly. JDBC result metadata does not reconstruct source keys, defaults or ENUM members; MySQL ENUM/SET are materialized as text. Table creation reproduces supported column types and values, not all source database objects.

Validation passed: 76 focused JUnit tests, compilation of seven Java 8 runtime sources and 53 actual JET emitters, the previous 39 emitted programs and nine SQL Server output compilation variants, 12 live JDBC round trips and 24 live native-output variants. Native-output cases include mixed/dynamic-only/empty suffix, REJECT, alternate creation actions, engine-specific types and zero input rows. Tested servers are Oracle 19c, MySQL 8.0.43 and PostgreSQL 17.6. `run_multidb_tests.py` and `run_multidb_generated_tests.py` use a private connection properties file outside Git.

`create_multidb_test_jobs.py` creates 15 local Studio jobs (MIXED, ALL, EMPTY, EXTRA and REJECT for each database). All 15 were run through the installed ESB Run action, and `verify_multidb_results.py` passed every decoded CSV assertion. The last PostgreSQL REJECT execution showed exit 0, one rejected row with SQLSTATE 23514 and one accepted row reread from the table. The SQL Server mixed regression was also rerun. Queries contain synthetic values; writes are limited to dedicated recipe tables. A final read-only metadata check confirmed no synthetic TDYN tables remain on any of the three databases. Connection secrets and result evidence are outside Git under `build-logs/dynamic-multidb-20261103`.

The full 385-module Maven DI/ESB clean install passed in 8 min 50 s with qualifier `20261103_1117_dynamic_multidb`. A final targeted install of core runtime and librariesmanager passed in 20 s after the temporal refinements. Both used `-Dtos.di=true -Dtos.esb=true -DskipTests -Dmaven.test.skip=true`; the focused suite ran separately. The temporary macOS Cocoa aarch64 target restriction was restored byte-for-byte. Six final plugins were synchronized and verified in both installed and unpacked products. Both distribution archives were repackaged and verified against the final unpacked plugins (9,376 files per product). Source changes are in the `tcommon-studio-se` and `tdi-studio-se` trees, with helpers here, on local branch `Feat/dynamic-schema`. No commit or push was made.


## Four-engine UPDATE, DELETE and upsert extension (2026-11-03)

`tMSSqlOutput`, `tOracleOutput`, `tMysqlOutput` and `tPostgresqlOutput` (including their tDBOutput selections) now accept Dynamic with UPDATE, DELETE, INSERT_OR_UPDATE and UPDATE_OR_INSERT. PostgreSQL also supports its native UPSERT (`ON CONFLICT`), MySQL its INSERT_ON_DUPLICATE_KEY_UPDATE action and SQL Server INSERT_IF_NOT_EXIST. Existing INSERT paths and static-only generation remain available. SQL Server/Oracle upserts use the existing component's two-phase algorithms; this extension does not introduce MERGE modes or promise atomicity between concurrent writers. PostgreSQL ON CONFLICT and MySQL ON DUPLICATE KEY UPDATE retain engine-native conflict semantics and require matching destination uniqueness constraints.

Correspondence keys are concrete columns marked Key in the static schema prefix; composite keys and the native SUPPORT_NULL_WHERE option are supported. Dynamic physical fields form the update payload. A missing static key or a Key flag on the whole Dynamic container is rejected by Studio validation before execution. A fully dynamic source can first extract its known key fields with tExtractDynamicFields, leaving the remaining values in Dynamic. An empty dynamic suffix is valid, including a schema containing only static keys: UPDATE uses a parameter-free key self-assignment and PostgreSQL UPSERT uses DO NOTHING when there are no values to update.

Shared runtime SQL helpers quote dynamic identifiers, join static/dynamic SET and INSERT fragments without stray commas, and keep static key parameters after dynamic payload parameters. SQL Server INSERT_OR_UPDATE no longer binds its nullable-key flag twice at conflicting parameter offsets; real tests exposed and now protect the former loss of NULL/decimal payloads. SQL Server INSERT_IF_NOT_EXIST closes its existence ResultSet and counts skipped input rows. MySQL UPDATE_OR_INSERT checks for a matching row after a zero affected-row UPDATE, preventing a duplicate INSERT when useAffectedRows=true reports zero for unchanged values. MySQL native duplicate-key rejects count their input row and cannot add negative operation counters after failure. Other operation counters keep the native component/driver affected-row conventions.

The components retain their native commit/batch paths. UPDATE and DELETE use their existing batch options; the two-phase upserts remain sequential. Connecting REJECT uses row-level execution and snapshots the dynamic payload. PostgreSQL savepoints keep valid writes after a rejected INSERT, UPDATE or DELETE. Null-key conflict matching in native PostgreSQL/MySQL upserts follows the database's UNIQUE semantics; the generic modes cover explicit nullable-key matching. Existing-connection, parallel, field/identity/spatial/debug options and additional SQL columns remain outside the qualified Dynamic capability. The separate RELATIONAL_STRATEGY mode is unchanged and is not enabled for Dynamic by this extension.

`run_tests.py` passed 78 focused JUnit tests, Java 8 runtime compilation, 53 real JET emitters and the existing emitted regression pipelines. `run_dml_tests.py --classes <focused-output> --plugins <Studio-plugins> --connections <private-properties> --drivers <four-JDBC-jars>` compiles actual native output fragments for all four engines. The 167 live variants passed, covering mixed schemas, empty suffixes, key-only rows, composite/nullable keys, unchanged values, zero input, batch/sequential execution, DML rejects and table creation with static primary keys. CHECK constraints exercise UPDATE/insert rejects; foreign keys exercise DELETE rejects and recovery. Exact destination values, preservation of unrelated rows, input counters and immutable reject snapshots are asserted. The initial MySQL DELETE fixture used inline REFERENCES, which MySQL ignored; the final fixture declares an explicit table-level foreign key and its focused rerun passed. This was a recipe correction, not a production workaround.

`create_dml_test_jobs.py` creates 28 isolated Studio jobs from private connection fixtures. All 28 were executed with the installed ESB Run action; `verify_dml_results.py` passed all decoded CSV comparisons. They cover the native actions on each provider, mixed schemas, REJECT, empty suffixes and MySQL unchanged rows with useAffectedRows=true. The four earlier mixed input/output jobs were regenerated and run again; their outputs remain valid. Jobs are installed under the local DYNAMIC_SCHEMA_TEST project in `/Applications/Talaxie-8.9-ogf/workspace`. SQL uses synthetic values and dedicated TDYN_DML_/TDYN_GUI_DML_ tables only. `VerifyDmlCleanup` confirmed that no recipe tables remain on any of the four databases.

The full 385-module Maven DI/ESB clean install passed in 8 min 17 s with JDK 21 and qualifier `20261103_1230_dynamic_dml`. A final 22-second targeted install of core runtime, librariesmanager and components.localprovider packaged the last runtime/template fixes. Both used `-Dtos.di=true -Dtos.esb=true -DskipTests -Dmaven.test.skip=true`; focused tests ran separately. The temporary macOS Cocoa aarch64 target restriction was restored byte-for-byte. Six final plugins were synchronized and verified in both installed products, preserving older versions and custom components with configuration/cache backups. The two distribution archives were repackaged and verified against 9,376 final plugin files per product. Evidence is outside Git under `build-logs/dynamic-dml-20261103`, including validation-result.json. Source changes remain local in tcommon-studio-se and tdi-studio-se on Feat/dynamic-schema; nothing was committed or pushed.


## Named dynamic correspondence keys (2026-11-03)

The advanced settings of tMSSqlOutput, tOracleOutput, tMysqlOutput and tPostgresqlOutput now expose **Use dynamic keys by name** / **Utiliser des clés dynamiques par nom** and a table of physical column names. Enter names exactly as returned in the Dynamic container, including SQL aliases and case, without Java string quotes. For example, selecting AGENCE works with a schema containing only SQL (Dynamic). A mixed schema can mark AGENCE as a static Key and select MOIS from Dynamic; both fields then participate in every correspondence predicate. The selection is explicit and does not infer database primary keys or reuse arbitrary incoming DynamicMetadata Key flags.

The option defaults to false. Existing jobs retain their previous native generators and static-key behavior. Enabling it selects a shared Java 8 runtime, DynamicDml, for the four qualified providers. It supports UPDATE, DELETE, INSERT_OR_UPDATE, UPDATE_OR_INSERT, PostgreSQL UPSERT/ON CONFLICT, MySQL INSERT_ON_DUPLICATE_KEY_UPDATE and SQL Server INSERT_IF_NOT_EXIST; INSERT can also use selected keys for table creation. The Standard implementation is common to DI and ESB. Other frameworks and the previously excluded advanced/shared-connection/parallel/field/identity/spatial options remain outside the enabled capability. RELATIONAL_STRATEGY is unchanged.

Studio rejects an empty selection, duplicate names and a Key flag on the whole Dynamic container. Runtime metadata must resolve each selected name to exactly one physical dynamic field. Missing/ambiguous names, duplicate destination labels and incompatible layout changes fail explicitly. Names are resolved before configured DROP/CREATE actions. Incoming metadata and values remain isolated; rejected and accepted output containers are snapshots. Static keys and selected dynamic keys are excluded from SET clauses and remain part of UPDATE/DELETE/existence predicates. With no payload, UPDATE uses a key self-assignment; PostgreSQL ON CONFLICT uses DO NOTHING. Identifier quoting and typed parameter binding are common, and nullable correspondence uses the existing SUPPORT_NULL_WHERE option.

DynamicDml caches prepared statements, preserves exact decimals and typed NULLs and batches INSERT/UPDATE/DELETE when Die on error is enabled and there are no data outputs. A connected data output or REJECT uses per-row execution; upserts remain sequential. Commit boundaries flush pending batches. Transactional batch failures roll back the current transaction and close statements; auto-commit retains its normal JDBC semantics. Per-row savepoints allow PostgreSQL and the other providers to continue after a rejected write. The classic upsert modes retry a duplicate insertion only when the same correspondence keys now identify a row, without suppressing unrelated constraint failures. Native PostgreSQL/MySQL conflict statements keep the destination database's uniqueness and NULL semantics. Operation counters describe successful writes; concurrent classification and driver affected-row conventions still apply.

Table actions NONE, CREATE, CREATE_IF_NOT_EXISTS, DROP_CREATE and DROP_IF_EXISTS_AND_CREATE are handled after the first valid metadata row. CREATE defines a primary key from the combined static and named dynamic keys, enforcing non-null keys for newly created tables. No input rows leave the destination untouched. Static SQL Server DATETIME2 precision and binary declarations remain supported alongside the selected dynamic keys. Oracle keeps normal unquoted table/schema identifier folding while honoring explicit quoted identifiers.

Validation passed: 88 focused JUnit tests, eight Java 8 runtime sources, 53 real JET emitters and the previous emitted regression pipelines. GenerateNamedKeyOutputs/run_named_key_tests.py produced 353 compiled/executed native component variants covering entirely Dynamic and mixed keys, composite/nullable keys, zero input, key-only payloads, quoted labels, CREATE, batches/sequential writes, UPDATE/DELETE/insert rejects and every qualified upsert mode. An early Oracle quoted-label fixture contained an invalid embedded double quote; the four corrected Oracle cases passed a final focused rerun. LiveNamedTypedKeys additionally passed on all four databases with decimal(38,10), zero and NULL keys, both classic upserts, invalid-name checks before DROP and rollback of a failing batch. LiveNamedMssqlStaticTypes verifies mixed Timestamp/binary declarations and values with a static Timestamp key plus a selected dynamic key. The earlier static-key DML jobs were rerun in ESB with the option disabled.

create_named_key_test_jobs.py derives 48 private Studio recipes from the preceding DML fixtures. ALL jobs have no static fields; MIXED jobs combine a static AGENCE key and dynamic MOIS key, with a K1/OTHER destination row that must remain untouched. Cases cover both classic upserts, each provider's native modes, REJECT and MySQL unchanged rows/useAffectedRows=true. All 48 ran with the installed ESB Run action, and verify_named_key_results.py passed all decoded CSV comparisons. Recipes are installed in the local DYNAMIC_SCHEMA_TEST workspace project. Queries use synthetic values and dedicated TDYN_NK_/TDYN_DML_/TDYN_KEY_ tables. Final cleanup checks verify that no recipe tables remain. One interrupted native fixture was verified as synthetic and disposed separately; GUI tables must be dropped by the jobs themselves.

The full 385-module Maven DI/ESB clean install passed in 8 min 23 s with qualifier 20261103_1330_dynamic_keys, followed by targeted installs for final generator/runtime corrections. The commands used -Dtos.di=true -Dtos.esb=true -DskipTests -Dmaven.test.skip=true; focused tests ran separately. The temporary macOS Cocoa aarch64 target restriction was restored byte-for-byte. Both installed apps and both unpacked products contain verified final plugins, with prior versions, custom components and configuration/cache backups retained. Archives were repackaged and verified against 9,381 plugin files per product. Logs, connection fixtures and validation-result.json are outside Git under build-logs/dynamic-keys-20261103. Source changes are local in tcommon-studio-se and tdi-studio-se on Feat/dynamic-schema; nothing was committed or pushed.


## Custom Java iteration recipes (2026-11-03)

`tJavaRow` is enabled for Dynamic schemas in Standard Java jobs. Its native emitter substitutes `input_row` with the actual incoming flow name and exposes the existing `routines.system.Dynamic` API; no SQL conversion or new row transport is introduced. Custom Java remains responsible for assigning any connected output fields. A plain `tJava` does not consume each incoming row, so it is used only for the final assertions after the input subjob.

`create_java_iteration_test_jobs.py --template <private-mixed-input.item> --output <private-directory>` creates four SQL Server recipes named `TEST_MSSQL_DYNAMIC_JAVA_ALL`, `TEST_MSSQL_DYNAMIC_JAVA_MIXED`, `TEST_MSSQL_DYNAMIC_JAVA_EMPTY` and `TEST_MSSQL_DYNAMIC_JAVA_ZERO_ROWS`. The fixture reuses only the connection/context configuration from the supplied input job. SQL contains synthetic, read-only `EXEC` queries; no destination tables are created. Generated jobs contain the private context and must stay outside Git.

Each flow is `tDBInput -> tJavaRow -> tLogRow`, followed by a `tJava` on `OnSubjobOk` to check the final row/field counts. The Java row explicitly assigns the static prefix and a Dynamic snapshot to its output, so the native row counters and final table display show the two rows. The loop reads every physical field with the public API:

```java
routines.system.Dynamic dynamic = input_row.SQL;
for (int i = 0; i < dynamic.getColumnCount(); i++) {
    routines.system.DynamicMetadata metadata = dynamic.getColumnMetadata(i);
    Object value = dynamic.getColumnValue(i);
    System.out.println(metadata.getName() + " [" + metadata.getDbType() + "] = " + value);
}
```

The recipes additionally assert JDBC column ordinals, index/name access, the static prefix, exact decimal(38,10) values and metadata, Unicode, NULL versus zero, empty dynamic suffixes and zero input rows. Expected live totals are respectively 2 rows/10 fields, 2 rows/6 fields, 2 rows/0 fields and 0 rows/0 fields. The final `tJava` prints a `PASS` marker only when every assertion succeeds.

The focused suite now runs 89 JUnit tests, compiles 54 actual JET emitters, and executes four additional SQL-input-to-tJavaRow programs using an in-memory JDBC fixture and the same loop code as the recipes. Existing regressions remain included. A targeted Maven install of core runtime and its dependencies also passes.

All four recipes were subsequently executed through the installed ESB Run action against SQL Server. Every final PASS marker and exit code 0 was observed, with the expected 2/10, 2/6, 2/0 and 0/0 row/field totals. The installed DI and ESB runtime/UI plugins were subsequently updated, with previous JARs and OSGi caches backed up outside the installation and launcher INI files preserved.


## Runtime database type display (2026-11-03)

The schema editor now displays **Determined at runtime** (**Déterminé à l'exécution** in French) in the database-type cell of a Dynamic container. This cell is read-only and uses the read-only background instead of the orange static type-mismatch warning. Schemas containing Dynamic use a compact database-type column, reduced by two thirds from the translated-label width; the complete label remains available in the cell value. Stored SQL type placeholders are preserved; the runtime still discovers each physical type from JDBC metadata. Static SQL cells retain their existing text, editability and mismatch warnings.

`CustomTableManagerDynamicTest` exercises the actual SWT table label provider and cell modifier in an isolated OSGi configuration. Six tests cover the label, locking only the Dynamic database-type cell, unchanged stored metadata, static warning behavior for SQL Server/Oracle/MySQL/PostgreSQL, changing between Dynamic and static types, English/French resources, and compact column width. Run them with JDK 21 after building `org.talend.core.ui`:

```sh
python3 dev/dynamic-schema/run_schema_editor_tests.py \
  --installation /path/to/TOS_ESB.app/Contents/Eclipse \
  --core-ui tcommon-studio-se/main/plugins/org.talend.core.ui/target/org.talend.core.ui-8.9.0-SNAPSHOT.jar \
  --output /tmp/talaxie-schema-editor-tests
```

The supplied installation is read-only for this test harness. Configuration, workspace and extracted test classes remain under `--output`. The Maven install targets core runtime/core UI and their dependencies; packaging reactor tests are skipped, while the six UI tests and the existing 89 focused tests run separately. Local installed DI and ESB plugins are synchronized with backups and unchanged launcher INI files. Distribution archives have not been repackaged for this increment.

All four Java iteration recipes with their tLogRow output were rerun through ESB against SQL Server. ALL, MIXED and EMPTY each pass two rows through tJavaRow; ZERO_ROWS intentionally passes none. The mixed case checks six dynamic values and displays both complete rows. The final compact-width adjustment also passed the six SWT regressions and a targeted Maven install of core UI and its dependencies. Generated archives and private connection fixtures are excluded from the source change.
