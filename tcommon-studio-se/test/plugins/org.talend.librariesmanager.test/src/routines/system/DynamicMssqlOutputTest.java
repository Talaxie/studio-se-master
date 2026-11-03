package routines.system;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DynamicMssqlOutputTest {

    private static Dynamic column(String name, String dbType, int jdbc, String type, int length, int scale, Object value) {
        Dynamic dynamic = new Dynamic();
        DynamicMetadata metadata = new DynamicMetadata();
        metadata.setName(name);
        metadata.setDbName("source_name");
        metadata.setDbType(dbType);
        metadata.setDbTypeId(jdbc);
        metadata.setType(type);
        metadata.setLength(length);
        metadata.setPrecision(scale);
        metadata.setNullable(true);
        dynamic.metadatas.add(metadata);
        dynamic.addColumnValue(value);
        return dynamic;
    }

    @Test
    public void createUsesLabelsEscapesIdentifiersAndPreservesDecimalScale() throws Exception {
        Dynamic dynamic = column("Montant ] €", "decimal", Types.DECIMAL, "id_BigDecimal", 38, 10, null);
        assertEquals("[Montant ]] €] DECIMAL(38,10) NULL", DynamicUtils.getCreateTableSQL(dynamic, "id_mssql"));
        assertEquals("[Montant ]] €]", DynamicUtils.getInsertIntoStmtColumnsList(dynamic, "id_MSSQL"));
        dynamic.getColumnMetadata(0).setNullable(false);
        assertTrue(DynamicUtils.getCreateTableSQL(dynamic, "id_MSSQL").endsWith(" NOT NULL"));
    }

    @Test
    public void unicodeAndLargeStringsKeepTheirSqlTypes() throws Exception {
        Dynamic dynamic = column("text", "nvarchar", Types.NVARCHAR, "id_String", Integer.MAX_VALUE, 0, null);
        assertEquals("[text] NVARCHAR(MAX) NULL", DynamicUtils.getCreateTableSQL(dynamic, "id_MSSQL"));
        dynamic.getColumnMetadata(0).setDbType("nchar");
        dynamic.getColumnMetadata(0).setLength(12);
        assertEquals("[text] NCHAR(12) NULL", DynamicUtils.getCreateTableSQL(dynamic, "id_MSSQL"));
    }

    @Test
    public void emptyDynamicSuffixDoesNotGenerateDanglingCommas() throws Exception {
        Dynamic empty = new Dynamic();
        assertEquals("CREATE TABLE [t]([fixed] INT ", DynamicUtils.completeMssqlCreateTableSQL(
                "CREATE TABLE [t]([fixed] INT, {TALEND_DYNAMIC_COLUMN} ", empty));
        assertEquals("INSERT INTO [t] ([fixed]) VALUES (?)", DynamicUtils.getMssqlInsertSQL("[t]", "[fixed]", "?", empty));
        assertThrows(SQLException.class, () -> DynamicUtils.getMssqlInsertSQL("[t]", "", "", empty));
        assertThrows(SQLException.class, () -> DynamicUtils.completeMssqlCreateTableSQL(
                "CREATE TABLE [t]( {TALEND_DYNAMIC_COLUMN} ", empty));
    }

    @Test
    public void invalidMetadataAndUnsupportedProvidersFailExplicitly() throws Exception {
        Dynamic dynamic = column("a", "decimal", Types.DECIMAL, "id_BigDecimal", 38, 39, null);
        assertThrows(SQLException.class, () -> DynamicUtils.getCreateTableSQL(dynamic, "id_MSSQL"));
        dynamic.getColumnMetadata(0).setDbType("xml");
        assertThrows(SQLException.class, () -> DynamicUtils.getCreateTableSQL(dynamic, "id_MSSQL"));
        assertThrows(SQLException.class, () -> DynamicUtils.getCreateTableSQL(dynamic, "id_Oracle"));
        dynamic.getColumnMetadata(0).setDbType("int");
        dynamic.metadatas.add(dynamic.getColumnMetadata(0).clone());
        assertThrows(SQLException.class, () -> DynamicUtils.getCreateTableSQL(dynamic, "id_MSSQL"));
    }

    @Test
    public void bindingUsesDestinationOffsetsTypedNullsAndExactDecimalValues() throws Exception {
        BigDecimal exact = new BigDecimal("1234567890123456789012345678.1234567890");
        Dynamic dynamic = column("amount", "decimal", Types.DECIMAL, "id_BigDecimal", 38, 10, exact);
        Dynamic nullable = column("text", "nvarchar", Types.NVARCHAR, "id_String", 20, 0, null);
        dynamic.metadatas.add(nullable.getColumnMetadata(0));
        dynamic.addColumnValue(null);
        List<List<Object>> calls = new ArrayList<>();
        PreparedStatement statement = (PreparedStatement) Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class<?>[] { PreparedStatement.class }, (p, method, args) -> {
                    List<Object> call = new ArrayList<>();
                    call.add(method.getName()); call.addAll(Arrays.asList(args)); calls.add(call);
                    return null;
                });
        assertEquals(2, DynamicUtils.writeColumnsToDatabse(dynamic, statement, 2, "id_MSSQL"));
        assertEquals(Arrays.asList("setBigDecimal", 3, exact), calls.get(0));
        assertEquals(Arrays.asList("setNull", 4, Types.NVARCHAR), calls.get(1));
        assertEquals("INSERT INTO [t] ([fixed], [amount], [text]) VALUES (?, ?, ?)",
                DynamicUtils.getMssqlInsertSQL("[t]", "[fixed]", "?", dynamic));
    }
}
