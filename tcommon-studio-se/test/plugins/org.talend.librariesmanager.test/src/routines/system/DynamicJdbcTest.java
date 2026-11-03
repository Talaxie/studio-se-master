package routines.system;

import static org.junit.Assert.*;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import org.junit.Test;

public class DynamicJdbcTest {
    private Dynamic column(String db, String sql, int jdbc, String type, int p, int s, Object value) {
        Dynamic d = new Dynamic(); d.setDbmsId(db); DynamicMetadata c = new DynamicMetadata();
        c.setName("A \"` €"); c.setDbType(sql); c.setDbTypeId(jdbc); c.setType(type);
        c.setLength(p); c.setPrecision(s); c.setNullable(true); d.metadatas.add(c); d.addColumnValue(value); return d;
    }
    @Test public void numericTypesNeverNarrowDecimalsOrUnsignedBigint() {
        assertEquals("id_BigDecimal", Dynamic.getTalendTypeFromDBType("oracle_id", "NUMBER", 38, -4));
        assertEquals("id_BigDecimal", Dynamic.getTalendTypeFromDBType("mysql_id", "BIGINT UNSIGNED", 20, 0));
        assertEquals("id_Long", Dynamic.getTalendTypeFromDBType("mysql_id", "INT UNSIGNED", 10, 0));
        assertEquals("id_BigDecimal", Dynamic.getTalendTypeFromDBType("postgres_id", "numeric", 0, 0));
    }
    @Test public void physicalTypesHavePortableValueContracts() {
        for (String[] pair : new String[][] {{"oracle_id", "BLOB"}, {"mysql_id", "LONGBLOB"}, {"postgres_id", "bytea"}})
            assertEquals("id_byte[]", DynamicJdbc.type(pair[0], pair[1], 100, 0));
        assertEquals("id_Date", DynamicJdbc.type("oracle_id", "DATE", 0, 0));
        assertEquals("id_Object", DynamicJdbc.type("postgres_id", "timestamptz", 0, 6));
        assertEquals("id_String", DynamicJdbc.type("postgres_id", "jsonb", 0, 0));
    }
    @Test public void unsupportedNativeTypesFailWithContext() {
        assertThrows(IllegalArgumentException.class, () -> DynamicJdbc.type("postgres_id", "geometry", 0, 0));
        assertThrows(IllegalArgumentException.class, () -> DynamicJdbc.type("oracle_id", "BFILE", 0, 0));
        assertThrows(IllegalArgumentException.class, () -> DynamicJdbc.dialect("unknown"));
    }
    @Test public void quotesAreDialectSpecificAndEscaped() throws Exception {
        assertEquals("`a``b`", DynamicJdbc.quote("a`b", "mysql_id"));
        assertEquals("\"a\"\"b\"", DynamicJdbc.quote("a\"b", "postgres_id"));
        assertThrows(SQLException.class, () -> DynamicJdbc.quote("a\0b", "oracle_id"));
    }
    @Test public void ddlPreservesOracleNegativeScaleAndPgUnconstrainedNumeric() throws Exception {
        Dynamic d = column("oracle_id", "NUMBER", Types.NUMERIC, "id_BigDecimal", 20, -3, null);
        assertTrue(DynamicUtils.getCreateTableSQL(d, "oracle_id").contains("NUMBER(20,-3)"));
        d = column("postgres_id", "numeric", Types.NUMERIC, "id_BigDecimal", 0, 0, null);
        assertTrue(DynamicUtils.getCreateTableSQL(d, "postgres_id").endsWith(" NUMERIC"));
    }
    @Test public void crossDatabaseDdlUsesLogicalType() throws Exception {
        Dynamic d = column("oracle_id", "VARCHAR2", Types.VARCHAR, "id_String", 20, 0, "hello");
        assertTrue(DynamicUtils.getCreateTableSQL(d, "postgres_id").endsWith(" TEXT"));
        assertTrue(DynamicUtils.getCreateTableSQL(d, "mysql_id").endsWith(" LONGTEXT"));
    }
    @Test public void emptySuffixSqlHasNoDanglingComma() throws Exception {
        for (String db : Arrays.asList("oracle_id", "mysql_id", "postgres_id")) {
            assertEquals("INSERT INTO T (A) VALUES (?)", DynamicUtils.getInsertSQL("T", "A", "?", new Dynamic(), db));
            assertEquals("CREATE TABLE T(A INT ", DynamicUtils.completeCreateTableSQL("CREATE TABLE T(A INT, {TALEND_DYNAMIC_COLUMN} ", new Dynamic(), db));
            assertThrows(SQLException.class, () -> DynamicUtils.getInsertSQL("T", "", "", new Dynamic(), db));
        }
    }
    @Test public void bindPreservesExactValuesAndOffsets() throws Exception {
        for (String db : Arrays.asList("oracle_id", "mysql_id", "postgres_id")) {
            BigDecimal n = new BigDecimal("18446744073709551615");
            Dynamic d = column(db, "NUMERIC", Types.NUMERIC, "id_BigDecimal", 20, 0, n);
            List<String> calls = new ArrayList<>();
            PreparedStatement ps = (PreparedStatement) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{PreparedStatement.class},
                (p,m,a) -> { calls.add(m.getName() + ":" + a[0] + ":" + a[1]); return null; });
            assertEquals(1, DynamicUtils.writeColumnsToDatabse(d, ps, 2, db));
            assertEquals("setBigDecimal:3:" + n, calls.get(0));
            d.setColumnValue(0, null); DynamicUtils.writeColumnsToDatabse(d, ps, 0, db);
            assertEquals("setNull:1:" + Types.NUMERIC, calls.get(1));
        }
    }
    @Test public void temporalValuesSurviveChildReturn() {
        java.time.OffsetDateTime date = java.time.OffsetDateTime.parse("2026-11-03T12:34:56.123456789+05:30");
        Dynamic d = column("postgres_id", "timestamptz", Types.TIMESTAMP_WITH_TIMEZONE, "id_Object", 0, 6, date);
        assertEquals(date, DynamicTransfer.decode(DynamicTransfer.encode(d)).getColumnValue(0));
    }
    @Test public void duplicateNamesAndImpossiblePrecisionAreRejected() throws Exception {
        Dynamic d = column("mysql_id", "DECIMAL", Types.DECIMAL, "id_BigDecimal", 70, 40, null);
        assertThrows(SQLException.class, () -> DynamicUtils.getCreateTableSQL(d, "mysql_id"));
        d.getColumnMetadata(0).setLength(20); d.getColumnMetadata(0).setPrecision(2);
        d.metadatas.add(d.getColumnMetadata(0).clone());
        assertThrows(SQLException.class, () -> DynamicUtils.getCreateTableSQL(d, "mysql_id"));
    }

    @Test public void mysqlTemporalExpressionsRecoverFractionalPrecision() throws Exception {
        ResultSetMetaData m = (ResultSetMetaData) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{ResultSetMetaData.class},
            (p, method, a) -> {
                switch(method.getName()) {
                case "getColumnCount": return 1;
                case "getColumnLabel": case "getColumnName": return "DT";
                case "getColumnTypeName": return "DATETIME";
                case "getColumnType": return Types.TIMESTAMP;
                case "getPrecision": case "getColumnDisplaySize": return 26;
                case "getScale": return 0;
                case "isNullable": return ResultSetMetaData.columnNullable;
                default: return null;
                }
            });
        Dynamic d = DynamicJdbc.create(m,0,"mysql_id");
        assertEquals(6,d.getColumnMetadata(0).getPrecision());
        assertTrue(DynamicUtils.getCreateTableSQL(d,"mysql_id").endsWith("DATETIME(6)"));
    }
    @Test public void unknownOracleRawLengthUsesLobWithoutTruncation() throws Exception {
        Dynamic d = column("oracle_id","RAW",Types.VARBINARY,"id_byte[]",0,0,new byte[]{0,1});
        assertTrue(DynamicUtils.getCreateTableSQL(d,"oracle_id").endsWith("BLOB"));
    }
    @Test public void timeFractionsAndMysqlDurationsAreNotNarrowedToSqlTime() throws Exception {
        assertEquals("id_String",DynamicJdbc.type("mysql_id","TIME",17,6));
        assertEquals("id_Object",DynamicJdbc.type("postgres_id","time",15,6));
        java.time.LocalTime time=java.time.LocalTime.parse("12:34:56.123456789");
        Dynamic d=column("postgres_id","time",Types.TIME,"id_Object",0,9,time);
        assertEquals(time,DynamicTransfer.decode(DynamicTransfer.encode(d)).getColumnValue(0));
    }
    @org.junit.Test
    public void dmlPreservesEmptySuffixAndEscapesPhysicalNames() throws Exception {
        Dynamic empty = new Dynamic();
        assertEquals("UPDATE t SET \"value\"=? WHERE \"id\"=?", DynamicUtils.getUpdateSQL("t", "\"value\"=?", "\"id\"=?", "id", empty, "postgres_id"));
        assertEquals("UPDATE t SET [id] = [id] WHERE [id]=?", DynamicUtils.getUpdateSQL("t", "", "[id]=?", "id", empty, "id_MSSQL"));
        DynamicMetadata column = new DynamicMetadata(); column.setName("a\"b"); empty.metadatas.add(column);
        assertEquals("\"a\"\"b\" = ?", DynamicUtils.getUpdateSet(empty,"postgres_id"));
        assertEquals(" ON CONFLICT (\"id\") DO UPDATE SET \"a\"\"b\" = EXCLUDED.\"a\"\"b\"", DynamicUtils.getPostgresConflictClause(new String[]{"id"},new boolean[]{true},empty));
        assertEquals(" ON CONFLICT (\"id\") DO NOTHING", DynamicUtils.getPostgresConflictClause(new String[]{"id"},new boolean[]{true},new Dynamic()));
        try { DynamicUtils.getUpdateSQL("t", "v=?", "", "", empty, "postgres_id"); fail("Unbounded update accepted"); }
        catch(java.sql.SQLException expected) { assertEquals("42000", expected.getSQLState()); }
    }
}
