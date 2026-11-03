import java.sql.*;
import java.util.*;
import routines.system.*;

/** Executes native emitted component fragments against isolated disposable tables. */
public abstract class LiveMultiDbOutputSupport extends LiveMultiDbTest {
    protected Map<String,Object> globalMap = new HashMap<>(), resourceMap = new HashMap<>();
    protected final List<rejectedStruct> rejectedRows = new ArrayList<>();
    protected final String projectName = "DynamicMultiDbTest";
    protected long tos_count_tOracleOutput_1, tos_count_tMysqlOutput_1, tos_count_tPostgresqlOutput_1;
    protected Context context = new Context();
    protected static class Context {
        public String DB_HOST, DB_PORT, DB_NAME, DB_SCHEMA = "", DB_USER, DB_PASSWORD, DB_PROPERTIES = "";
        public String TEST_TABLE = "TDYN_" + UUID.randomUUID().toString().replace("-", "").substring(0,20).toUpperCase(Locale.ROOT);
    }
    protected static class rowStruct { public String AGENCE, MOIS; public Dynamic SQL; }
    protected static class rejectedStruct extends rowStruct { public String errorCode, errorMessage; }
    protected abstract void execute(ResultSet rows) throws Exception;
    protected void test(String db, String variant, int fixed) throws Exception {
        String database = id(db); java.net.URI uri = java.net.URI.create(config.getProperty(db+".url").replace("jdbc:oracle:thin:@//", "oracle://").replace("jdbc:", ""));
        context.DB_HOST = uri.getHost(); context.DB_PORT = ""+uri.getPort(); context.DB_NAME = uri.getPath().substring(1);
        context.DB_USER = config.getProperty(db+".user"); context.DB_PASSWORD = config.getProperty(db+".password");
        if (db.equals("postgres")) context.DB_SCHEMA = "public";
        String table = DynamicJdbc.quote(context.TEST_TABLE, database);
        try (Connection admin = connect(db); Statement source = admin.createStatement(); ResultSet rows = source.executeQuery(variant.equals("extra") ? extras(db) : variant.equals("zero") ? "SELECT * FROM ("+query(db,false)+") q WHERE 1=0" : query(db,variant.equals("empty")))) {
            try {
                if (variant.equals("reject") || variant.equals("create_if")) {
                    Dynamic d = DynamicJdbc.create(rows.getMetaData(), 0, database);
                    try (Statement ddl = admin.createStatement()) { ddl.execute("CREATE TABLE " + table + " (" + DynamicUtils.getCreateTableSQL(d,database)
                        + (variant.equals("reject") ? ", CHECK ("+DynamicJdbc.quote("AGENCE",database)+" <> '0008')" : "") + ")"); }
                }
                if (variant.equals("zero")) {
                    try (Statement ddl=admin.createStatement()) { ddl.execute("CREATE TABLE "+table+" (LEGACY INTEGER)"); ddl.executeUpdate("INSERT INTO "+table+" VALUES(42)"); }
                }
                execute(rows);
                try (Statement read = admin.createStatement(); ResultSet result = read.executeQuery("SELECT * FROM " + table + (variant.equals("zero") ? "" : " ORDER BY " + DynamicJdbc.quote("AGENCE",database)))) {
                    int count=0; Dynamic d = DynamicJdbc.create(result.getMetaData(),0,database);
                    while (result.next()) { count++; DynamicJdbc.read(d,result,0,false);
                        if (variant.equals("zero")) require(result.getInt(1)==42,"Empty input changed existing table");
                        if (count==1 && !variant.equals("empty") && !variant.equals("extra") && !variant.equals("zero")) require(new java.math.BigDecimal("1234567890123456789012345678.1234567890").compareTo((java.math.BigDecimal)d.getColumnValue(2))==0,"Generated INSERT lost decimal");
                    }
                    require(count==(variant.equals("reject")||variant.equals("extra")||variant.equals("zero")?1:2),"Generated output row count: "+count);
                }
                require(rejectedRows.size()==(variant.equals("reject")?1:0),"Reject count changed");
                if (!rejectedRows.isEmpty()) require(rejectedRows.get(0).SQL != null && rejectedRows.get(0).errorMessage != null,"Missing Dynamic reject payload/diagnostic");
                System.out.println("PASS native " + db + " " + variant + " DDL/INSERT/batch/reject");
            } finally {
                try (Statement ddl = admin.createStatement()) { ddl.execute("DROP TABLE "+table); }
                catch (SQLException e) { if (!e.getSQLState().equals("42P01") && e.getErrorCode()!=942 && e.getErrorCode()!=1051) throw e; }
            }
        }
    }
}
