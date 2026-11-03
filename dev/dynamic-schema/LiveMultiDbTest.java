import java.nio.file.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.math.BigDecimal;
import routines.system.*;

/** Real JDBC round trips in uniquely named disposable tables. No client tables are modified. */
public class LiveMultiDbTest {
    static Properties config = new Properties();
    public static Connection connect(String db) throws Exception {
        return DriverManager.getConnection(config.getProperty(db + ".url"), config.getProperty(db + ".user"), config.getProperty(db + ".password"));
    }
    static void require(boolean test, String message) { if (!test) throw new AssertionError(message); }
    static String id(String db) { return db.equals("oracle") ? "oracle_id" : db.equals("mysql") ? "mysql_id" : "postgres_id"; }
    public static String query(String db, boolean empty) {
        String a = db.equals("oracle") ? "VARCHAR2" : "CHAR";
        String num = db.equals("oracle") ? "NUMBER" : "DECIMAL";
        String text = db.equals("oracle") ? "N'Été €'" : "'Été €'";
        String date = db.equals("mysql") ? "CAST('2026-11-03 12:34:56.123456' AS DATETIME(6))" : "TIMESTAMP '2026-11-03 12:34:56.123456'";
        String binary = db.equals("oracle") ? "HEXTORAW('00FF01')" : db.equals("mysql") ? "UNHEX('00FF01')" : "decode('00ff01','hex')";
        String from = db.equals("oracle") ? " FROM DUAL" : "";
        String first = "SELECT CAST('0007' AS " + a + "(10)) AS AGENCE, CAST('202601' AS " + a + "(6)) AS MOIS";
        String rest = ", CAST(1234567890123456789012345678.1234567890 AS " + num + "(38,10)) AS MONTANT, CAST(NULL AS " + num + "(9,0)) AS VIDE, " + text + " AS TEXTE, " + date + " AS DT, " + binary + " AS BIN";
        String second = "SELECT CAST('0008' AS " + a + "(10)), CAST('202601' AS " + a + "(6))";
        String nulls = ", CAST(NULL AS " + num + "(38,10)), CAST(0 AS " + num + "(9,0)), " + (db.equals("oracle") ? "N'Obsèques'" : "'Obsèques'") + ", " + date + ", " + binary;
        String sql = first + (empty ? "" : rest) + from + " UNION ALL " + second + (empty ? "" : nulls) + from;
        if (db.equals("postgres")) for (String name : Arrays.asList("AGENCE", "MOIS", "MONTANT", "VIDE", "TEXTE", "DT", "BIN")) sql = sql.replace("AS " + name, "AS \"" + name + "\"");
        return sql;
    }
    static String extras(String db) {
        if (db.equals("oracle")) return "SELECT '0007' AS AGENCE, CAST(123456789012 AS NUMBER(12,-3)) AS NEG_SCALE, CAST(TIMESTAMP '2026-11-03 12:34:56' AS DATE) AS DT, TO_CLOB('Été €') AS LOB_TEXT, TO_NCLOB(N'Obsèques €') AS NATIONAL_TEXT, TO_TIMESTAMP_TZ('2026-11-03 12:34:56.123456 +05:30','YYYY-MM-DD HH24:MI:SS.FF TZH:TZM') AS TZ FROM DUAL";
        if (db.equals("mysql")) return "SELECT '0007' AS AGENCE, CAST('18446744073709551615' AS UNSIGNED) AS BIG_UNSIGNED, CAST('-25:01:02.123456' AS TIME(6)) AS DURATION, CAST('{\"é\":\"€\"}' AS JSON) AS DOCUMENT";
        return "SELECT '0007' AS \"AGENCE\", TIME '12:34:56.123456' AS clock, TIMETZ '12:34:56.123456+05:30' AS clock_tz, TIMESTAMPTZ '2026-11-03 12:34:56.123456+05:30' AS dt_tz, '123e4567-e89b-12d3-a456-426614174000'::uuid AS id, '{\"é\":\"€\"}'::jsonb AS document, '<a>€</a>'::xml AS doc_xml";
    }
    static void roundtrip(String db, int fixed, boolean empty) throws Exception { roundtrip(db, fixed, empty, false); }
    static void roundtrip(String db, int fixed, boolean empty, boolean extra) throws Exception {
        String database = id(db), table = "TDYN_" + UUID.randomUUID().toString().replace("-", "").substring(0,20).toUpperCase(Locale.ROOT);
        String quoted = DynamicJdbc.quote(table, database);
        boolean created = false;
        try (Connection connection = connect(db); Statement source = connection.createStatement(); ResultSet rows = source.executeQuery(extra ? extras(db) : query(db, empty))) {
            Dynamic schema = DynamicJdbc.create(rows.getMetaData(), fixed, database);
            String prefix = fixed == 0 ? "" : DynamicJdbc.quote("AGENCE", database) + (db.equals("oracle") ? " VARCHAR2(10), " : " VARCHAR(10), ") + DynamicJdbc.quote("MOIS", database) + " VARCHAR(6)";
            String columns = DynamicUtils.completeCreateTableSQL("CREATE TABLE " + quoted + " (" + prefix + (fixed == 0 ? "" : ", ") + "{TALEND_DYNAMIC_COLUMN}", schema, database) + ")";
            try (Statement ddl = connection.createStatement()) { ddl.execute(columns); created = true; }
            String fixedNames = fixed == 0 ? "" : DynamicJdbc.quote("AGENCE", database) + ", " + DynamicJdbc.quote("MOIS", database);
            List<Dynamic> expected = new ArrayList<>();
            Dynamic all = DynamicJdbc.create(rows.getMetaData(), 0, database);
            try (PreparedStatement insert = connection.prepareStatement(DynamicUtils.getInsertSQL(quoted, fixedNames, fixed == 0 ? "" : "?, ?", schema, database))) {
                while (rows.next()) {
                    DynamicJdbc.read(all, rows, 0, false); expected.add(all.copy());
                    DynamicJdbc.read(schema, rows, fixed, false);
                    require(DynamicTransfer.decode(DynamicTransfer.encode(schema)).getColumnCount() == schema.getColumnCount(), "Child transfer count changed");
                    if (fixed > 0) { insert.setString(1, rows.getString(1)); insert.setString(2, rows.getString(2)); }
                    DynamicUtils.writeColumnsToDatabse(schema, insert, fixed, database); insert.addBatch();
                }
                int[] counts = insert.executeBatch(); require(counts.length == expected.size(), "Batch lost rows");
            }
            try (Statement read = connection.createStatement(); ResultSet result = read.executeQuery("SELECT * FROM " + quoted + " ORDER BY " + DynamicJdbc.quote("AGENCE", database))) {
                Dynamic actual = DynamicJdbc.create(result.getMetaData(), 0, database); int n = 0;
                while (result.next()) {
                    DynamicJdbc.read(actual, result, 0, false); Dynamic exp = expected.get(n++);
                    require(actual.getColumnCount() == exp.getColumnCount(), "Column count changed");
                    for (int i=0; i<actual.getColumnCount(); i++) {
                        Object av = actual.getColumnValue(i), ev = exp.getColumnValue(i);
                        boolean equal = av instanceof BigDecimal && ev instanceof BigDecimal ? ((BigDecimal) av).compareTo((BigDecimal) ev) == 0 : Objects.deepEquals(av, ev);
                        require(equal, db + " value changed at column " + i + ": " + av + " / " + ev);
                    }
                }
                require(n == expected.size(), "Read lost rows");
            }
            System.out.println("PASS " + db + " fixed=" + fixed + " empty=" + empty + " extra=" + extra + " typed metadata/DDL/batch/values/child transfer");
        } finally {
            if (created) try (Connection clean = connect(db); Statement ddl = clean.createStatement()) { ddl.execute("DROP TABLE " + quoted); }
        }
    }
    public static void main(String[] args) throws Exception {
        if (args[0].equals("--queries")) {
            Properties queries = new Properties();
            for (String db : Arrays.asList("oracle", "mysql", "postgres")) {
                queries.setProperty(db + ".basic", query(db,false)); queries.setProperty(db + ".empty",query(db,true)); queries.setProperty(db + ".extra",extras(db));
            }
            try (OutputStream out = Files.newOutputStream(Paths.get(args[1]))) { queries.storeToXML(out,"Synthetic read-only fixture queries","UTF-8"); }
            return;
        }
        try (InputStream in = Files.newInputStream(Paths.get(args[0]))) { config.load(in); }
        for (String db : Arrays.asList("oracle", "mysql", "postgres")) {
            try (Connection c = connect(db)) { System.out.println("Connected " + db + " " + c.getMetaData().getDatabaseProductVersion().split("\\n")[0]); }
            roundtrip(db,0,false); roundtrip(db,2,false); roundtrip(db,2,true); roundtrip(db,0,false,true);
        }
    }
}
