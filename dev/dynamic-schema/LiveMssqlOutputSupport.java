import java.math.BigDecimal;
import java.sql.*;
import java.util.*;

import routines.system.Dynamic;
import routines.system.DynamicUtils;

/** Synthetic integration fixture. Creates and drops only its uniquely named test table. */
public abstract class LiveMssqlOutputSupport {
    protected final Map<String, Object> globalMap = new HashMap<>();
    protected final Map<String, Object> resourceMap = new HashMap<>();
    protected final List<rejectedStruct> rejectedRows = new ArrayList<>();
    protected final Context context = new Context();
    protected final String projectName = "DynamicOutputTest";
    protected long tos_count_tMSSqlOutput_1;

    public static class Context {
        public String DB_HOST = System.getenv("TALAXIE_TEST_DB_HOST");
        public String DB_PORT = System.getenv("TALAXIE_TEST_DB_PORT");
        public String DB_NAME = System.getenv("TALAXIE_TEST_DB_NAME");
        public String DB_SCHEMA = "dbo";
        public String DB_USER = System.getenv("TALAXIE_TEST_JDBC_USER");
        public String DB_PASSWORD = System.getenv("TALAXIE_TEST_JDBC_PASSWORD");
        public String DB_PROPERTIES = "encrypt=true;trustServerCertificate=true;loginTimeout=10";
        public String TEST_TABLE = "TALAXIE_DYNAMIC_OUTPUT_" + UUID.randomUUID().toString().replace("-", "");
    }

    public static class rowStruct {
        public String AGENCE;
        public String MOIS;
        public Dynamic SQL;
    }

    public static class rejectedStruct extends rowStruct {
        public String errorCode;
        public String errorMessage;
    }

    protected abstract void execute(ResultSet source) throws Exception;

    protected void test(String variant, int fixed) throws Exception {
        String table = "[dbo].[" + context.TEST_TABLE + "]";
        if (!context.TEST_TABLE.matches("TALAXIE_DYNAMIC_OUTPUT_[a-f0-9]{32}")) {
            throw new AssertionError("Unsafe fixture table name");
        }
        System.out.println("Starting generated SQL output " + variant + "; fixture table: " + context.TEST_TABLE);
        String query = "SELECT CAST(RIGHT('0000' + CAST(v.i AS varchar(4)),4) AS varchar(10)) AS AGENCE,"
                + "CAST('202601' AS nvarchar(6)) AS MOIS,"
                + "CAST(CASE WHEN v.i = 5 THEN 0 WHEN v.i = 7 THEN -1234567890123456789012345678.1234567890 "
                + "WHEN v.i % 2 = 1 THEN 1234567890123456789012345678.1234567890 END AS decimal(38,10)) AS MONTANT,"
                + "CAST(CASE WHEN v.i = 1 THEN 0 WHEN v.i % 2 = 1 THEN v.i END AS int) AS VIDE,"
                + "CAST(N'Été €' AS nvarchar(30)) AS [Texte ]] €] "
                + "FROM (VALUES(1),(2),(3),(4),(5),(6),(7)) v(i)";
        if ("large".equals(variant)) {
            String digits = "(VALUES(0),(1),(2),(3),(4),(5),(6),(7),(8),(9))";
            query = query.replace("RIGHT('0000' + CAST(v.i AS varchar(4)),4)",
                    "RIGHT('00000000' + CAST(v.i AS varchar(8)),8)")
                    .replace("(VALUES(1),(2),(3),(4),(5),(6),(7)) v(i)",
                    "(SELECT TOP(10003) ROW_NUMBER() OVER(ORDER BY a.n) i FROM " + digits + " a(n) CROSS JOIN "
                    + digits + " b(n) CROSS JOIN " + digits + " c(n) CROSS JOIN " + digits
                    + " d(n) CROSS JOIN " + digits + " e(n)) v");
        }
        if ("empty".equals(variant)) {
            query = "SELECT CAST('0007' AS varchar(10)) AS AGENCE, CAST('202601' AS nvarchar(6)) AS MOIS "
                    + "FROM (VALUES(1),(2),(3),(4),(5),(6),(7)) v(i)";
        }
        if ("zero".equals(variant)) { query += " WHERE v.i < 0"; }
        query += " ORDER BY AGENCE";
        try (Connection admin = DriverManager.getConnection(System.getenv("TALAXIE_TEST_JDBC_URL"),
                context.DB_USER, context.DB_PASSWORD)) {
            try {
                if (!"create".equals(variant) && !"reject".equals(variant) && !"create_if".equals(variant)) {
                    try (Statement statement = admin.createStatement()) {
                        statement.execute("CREATE TABLE " + table + " (legacy INT)");
                        statement.executeUpdate("INSERT INTO " + table + " VALUES (42)");
                    }
                }
                try (Statement statement = admin.createStatement(); ResultSet source = statement.executeQuery(query)) {
                    if ("reject".equals(variant) || "create_if".equals(variant)) {
                        Dynamic schema = DynamicUtils.createMssqlDynamic(source.getMetaData(), fixed);
                        String prefix = fixed == 2 ? "[AGENCE] VARCHAR(20) NULL, [MOIS] VARCHAR(20) NULL, " : "";
                        String constraint = "reject".equals(variant) ? ", CHECK ([AGENCE] <> '0003')" : "";
                        try (Statement ddl = admin.createStatement()) {
                            ddl.execute("CREATE TABLE " + table + " (" + prefix
                                    + DynamicUtils.getCreateTableSQL(schema, "id_MSSQL") + constraint + ")");
                            if ("create_if".equals(variant)) {
                                ddl.executeUpdate("INSERT INTO " + table + " VALUES ('9999','202601',NULL,NULL,N'legacy')");
                            }
                        }
                    }
                    execute(source);
                }
                try (Statement statement = admin.createStatement(); ResultSet result = statement.executeQuery(
                        "SELECT * FROM " + table + ("zero".equals(variant) ? "" : " ORDER BY AGENCE"))) {
                    if ("zero".equals(variant)) {
                        require(result.next() && result.getInt(1) == 42 && !result.next(), "Empty input modified the target");
                    } else {
                        require(result.getMetaData().getColumnCount() == ("empty".equals(variant) ? 2 : 5),
                                "Unexpected physical column count");
                        if (!"empty".equals(variant)) {
                            require(result.getMetaData().getPrecision(3) == 38 && result.getMetaData().getScale(3) == 10,
                                    "DDL lost decimal precision/scale");
                        }
                        int count = 0;
                        while (result.next()) {
                            if (count == 0 && !"empty".equals(variant)) {
                                require(new BigDecimal("1234567890123456789012345678.1234567890").equals(result.getBigDecimal(3)),
                                        "INSERT lost decimal precision/scale");
                                require(result.getInt(4) == 0 && !result.wasNull(), "Zero became NULL");
                                require("Été €".equals(result.getNString(5)), "Unicode changed");
                            }
                            if (count == 1 && !"empty".equals(variant)) {
                                require(result.getBigDecimal(3) == null, "NULL decimal changed");
                                result.getInt(4); require(result.wasNull(), "NULL integer became zero");
                            }
                            if (!"empty".equals(variant) && Integer.parseInt(result.getString(1)) == 5) {
                                require(new BigDecimal("0.0000000000").equals(result.getBigDecimal(3)), "Zero decimal scale changed");
                            }
                            if (!"empty".equals(variant) && Integer.parseInt(result.getString(1)) == 7) {
                                require(new BigDecimal("-1234567890123456789012345678.1234567890").equals(result.getBigDecimal(3)),
                                        "Negative decimal changed");
                            }
                            count++;
                        }
                        require(count == ("large".equals(variant) ? 10003 : "reject".equals(variant) ? 6 : "create_if".equals(variant) ? 8 : 7),
                                "Batch flush, commit or reject row count differs: " + count);
                    }
                }
                require(Integer.valueOf("zero".equals(variant) ? 0 : "large".equals(variant) ? 10003 : "reject".equals(variant) ? 6 : 7)
                        .equals(globalMap.get("tMSSqlOutput_1_NB_LINE_INSERTED")), "Incorrect inserted counter");
                if ("reject".equals(variant)) {
                    require(rejectedRows.size() == 1, "Expected one rejected row");
                    rejectedStruct row = rejectedRows.get(0);
                    require("0003".equals(row.AGENCE) && Integer.valueOf(3).equals(row.SQL.getColumnValue(1)),
                            "Rejected dynamic values were overwritten by a later source row");
                    require(row.errorCode != null && row.errorMessage != null, "Missing reject diagnostics");
                }
                System.out.println("Generated SQL output " + variant + " passed (static prefix " + fixed + ").");
            } finally {
                for (Object resource : resourceMap.values()) {
                    if (resource instanceof Connection && !((Connection) resource).isClosed()) {
                        ((Connection) resource).rollback(); ((Connection) resource).close();
                    }
                }
                try (Statement cleanup = admin.createStatement()) { cleanup.execute("DROP TABLE IF EXISTS " + table); }
            }
        }
    }

    private static void require(boolean condition, String message) {
        if (!condition) { throw new AssertionError(message); }
    }
}
