import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetMetaDataImpl;
import javax.sql.rowset.RowSetProvider;

/** In-memory JDBC fixture. It never opens a network connection. */
public class GeneratedPipelineSupport implements Driver {
    static ResultSet result;
    static int executions;
    static boolean closed;

    static {
        try {
            DriverManager.registerDriver(new GeneratedPipelineSupport());
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    static void reset(boolean emptySuffix) throws Exception {
        executions = 0;
        closed = false;
        int count = emptySuffix ? 2 : 5;
        RowSetMetaDataImpl metadata = new RowSetMetaDataImpl();
        metadata.setColumnCount(count);
        String[] names = { "AGENCE", "MOIS", "MONTANT", "VIDE", "TEXTE" };
        int[] types = { Types.VARCHAR, Types.NVARCHAR, Types.DECIMAL, Types.INTEGER, Types.LONGNVARCHAR };
        String[] sql = { "varchar", "nvarchar", "decimal", "int", "ntext" };
        for (int i = 1; i <= count; i++) {
            metadata.setColumnName(i, names[i - 1]);
            metadata.setColumnLabel(i, names[i - 1]);
            metadata.setColumnType(i, types[i - 1]);
            metadata.setColumnTypeName(i, sql[i - 1]);
            metadata.setPrecision(i, i == 3 ? 38 : 30);
            metadata.setScale(i, i == 3 ? 10 : 0);
            metadata.setNullable(i, 1);
        }
        CachedRowSet rows = RowSetProvider.newFactory().createCachedRowSet();
        rows.setMetaData(metadata);
        rows.moveToInsertRow();
        rows.updateString(1, "0007");
        rows.updateString(2, "202601");
        if (!emptySuffix) {
            rows.updateBigDecimal(3, new BigDecimal("1234567890123456789012345678.1234567890"));
            rows.updateNull(4);
            rows.updateString(5, "Été €");
        }
        rows.insertRow();
        rows.moveToCurrentRow();
        rows.beforeFirst();
        result = rows;
    }

    @Override
    public Connection connect(String url, Properties properties) {
        if (!acceptsURL(url)) { return null; }
        return (Connection) Proxy.newProxyInstance(getClass().getClassLoader(), new Class<?>[] { Connection.class },
                (p, method, args) -> {
                    switch (method.getName()) {
                    case "createStatement":
                        return Proxy.newProxyInstance(getClass().getClassLoader(), new Class<?>[] { java.sql.Statement.class },
                                (statement, action, a) -> {
                                    if ("executeQuery".equals(action.getName())) {
                                        if (!a[0].toString().contains("EXEC(@q)")) {
                                            throw new AssertionError("The SQL batch was changed");
                                        }
                                        executions++;
                                        return result;
                                    }
                                    return null;
                                });
                    case "close": closed = true; return null;
                    case "isClosed": return closed;
                    default: return null;
                    }
                });
    }

    @Override public boolean acceptsURL(String url) { return url.startsWith("jdbc:sqlserver://localhost"); }
    @Override public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) { return new DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return false; }
    @Override public Logger getParentLogger() { return Logger.getGlobal(); }
}
