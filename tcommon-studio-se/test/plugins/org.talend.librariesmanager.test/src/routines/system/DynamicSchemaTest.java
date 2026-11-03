package routines.system;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collections;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetMetaDataImpl;
import javax.sql.rowset.RowSetProvider;

import org.junit.Test;

public class DynamicSchemaTest {

    private static final BigDecimal AMOUNT = new BigDecimal("1234567890123456789012345678.1234567890");

    private static RowSetMetaDataImpl metadata() throws Exception {
        RowSetMetaDataImpl metadata = new RowSetMetaDataImpl();
        metadata.setColumnCount(5);
        String[] names = { "AGENCE", "MOIS", "MONTANT", "VIDE", "TEXTE" };
        int[] types = { Types.VARCHAR, Types.NVARCHAR, Types.DECIMAL, Types.INTEGER, Types.LONGNVARCHAR };
        String[] sqlTypes = { "varchar", "nvarchar", "decimal", "int", "ntext" };
        for (int i = 1; i <= names.length; i++) {
            metadata.setColumnName(i, names[i - 1]);
            metadata.setColumnLabel(i, names[i - 1]);
            metadata.setColumnType(i, types[i - 1]);
            metadata.setColumnTypeName(i, sqlTypes[i - 1]);
            metadata.setNullable(i, ResultSetMetaData.columnNullable);
            metadata.setPrecision(i, i == 3 ? 38 : 30);
            metadata.setScale(i, i == 3 ? 10 : 0);
        }
        return metadata;
    }

    private static CachedRowSet rows(RowSetMetaDataImpl metadata) throws Exception {
        CachedRowSet rows = RowSetProvider.newFactory().createCachedRowSet();
        rows.setMetaData(metadata);
        rows.moveToInsertRow();
        rows.updateString(1, "0007");
        rows.updateString(2, "202601");
        rows.updateBigDecimal(3, AMOUNT);
        rows.updateNull(4);
        rows.updateString(5, "Été €");
        rows.insertRow();
        rows.moveToCurrentRow();
        rows.beforeFirst();
        assertTrue(rows.next());
        return rows;
    }

    @Test
    public void mixedAndEntirelyDynamicRowsProduceIdenticalFields() throws Exception {
        String expected = "0007;202601;" + AMOUNT.toPlainString() + ";;Été €";
        for (int fixed = 0; fixed <= 2; fixed++) {
            try (CachedRowSet rows = rows(metadata())) {
                Dynamic dynamic = DynamicUtils.createMssqlDynamic(rows.getMetaData(), fixed);
                DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, rows, fixed, Collections.<String>emptyList(), false);
                assertEquals(5 - fixed, dynamic.getColumnCount());
                assertEquals(fixed + 1, dynamic.getColumnMetadata(0).getColumnPosition());
                StringBuilder output = new StringBuilder();
                for (int i = 1; i <= fixed; i++) {
                    output.append(rows.getString(i)).append(';');
                }
                DynamicUtils.writeValuesToStringBuilder(dynamic, output, ";", Charset.forName("ISO-8859-15"));
                assertEquals(expected, output.toString());
                DynamicMetadata amount = dynamic.getColumnMetadata(2 - fixed);
                assertEquals(38, amount.getLength());
                assertEquals(10, amount.getPrecision());
                assertEquals("id_BigDecimal", amount.getType());
                assertEquals(AMOUNT, dynamic.getColumnValue(2 - fixed));
            }
        }
    }

    @Test
    public void emptySuffixIsAValidContainer() throws Exception {
        Dynamic dynamic = DynamicUtils.createMssqlDynamic(metadata(), 5);
        assertEquals(0, dynamic.getColumnCount());
        StringWriter header = new StringWriter();
        DynamicUtils.writeHeaderToDelimitedFile(dynamic, header, ";");
        StringBuilder output = new StringBuilder();
        DynamicUtils.writeValuesToStringBuilder(dynamic, output, ";");
        assertEquals("", header.toString());
        assertEquals("", output.toString());
    }

    @Test
    public void missingStaticColumnsFailBeforeReadingRows() throws Exception {
        try {
            DynamicUtils.createMssqlDynamic(metadata(), 6);
            fail("An incomplete static prefix must fail");
        } catch (SQLException expected) {
            assertEquals("07009", expected.getSQLState());
        }
    }

    @Test
    public void duplicateLabelsDoNotLoseDynamicColumns() throws Exception {
        RowSetMetaDataImpl metadata = metadata();
        metadata.setColumnLabel(3, "AGENCE");
        Dynamic dynamic = DynamicUtils.createMssqlDynamic(metadata, 2);
        assertEquals(3, dynamic.getColumnCount());
        assertEquals("AGENCE", dynamic.getColumnMetadata(0).getName());
        assertEquals(3, dynamic.getColumnMetadata(0).getColumnPosition());
    }

    @Test
    public void unsupportedTypesReportColumnAndSqlState() throws Exception {
        RowSetMetaDataImpl metadata = metadata();
        metadata.setColumnTypeName(3, "datetimeoffset");
        try {
            DynamicUtils.createMssqlDynamic(metadata, 2);
            fail("Unqualified types must not become strings");
        } catch (SQLException expected) {
            assertEquals("0A000", expected.getSQLState());
            assertTrue(expected.getMessage().contains("3 (MONTANT)"));
        }
    }

    @Test
    public void nullDoesNotKeepThePreviousRowValue() throws Exception {
        try (CachedRowSet rows = rows(metadata())) {
            Dynamic dynamic = DynamicUtils.createMssqlDynamic(rows.getMetaData(), 2);
            DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, rows, 2, null, false);
            Dynamic copy = dynamic.copy();
            rows.updateNull(3);
            rows.updateString(5, " suivant ");
            DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, rows, 2, null, true);
            assertNull(dynamic.getColumnValue(0));
            assertEquals("suivant", dynamic.getColumnValue(2));
            assertEquals(AMOUNT, copy.getColumnValue(0));
            assertEquals("Été €", copy.getColumnValue(2));
        }
    }

    @Test
    public void serializeTheCompleteRowAndPreserveItsMetadata() throws Exception {
        try (CachedRowSet rows = rows(metadata())) {
            Dynamic dynamic = DynamicUtils.createMssqlDynamic(rows.getMetaData(), 2);
            DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, rows, 2, null, false);
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            try (ObjectOutputStream output = new ObjectOutputStream(bytes)) {
                output.writeObject(dynamic);
            }
            try (ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(bytes.toByteArray()))) {
                assertEquals(dynamic, input.readObject());
            }
            Dynamic copy = dynamic.copy();
            dynamic.getColumnMetadata(0).setName("CHANGED");
            assertEquals("MONTANT", copy.getColumnMetadata(0).getName());
            assertEquals(-1, copy.getIndex("missing"));
        }
    }

    @Test
    public void exactDecimalsAndDelimitedTextMatchTheReference() throws Exception {
        try (CachedRowSet rows = rows(metadata())) {
            Dynamic dynamic = DynamicUtils.createMssqlDynamic(rows.getMetaData(), 2);
            DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, rows, 2, null, false);
            dynamic.setColumnValue(2, "Été;OGF €");
            StringWriter header = new StringWriter();
            DynamicUtils.writeHeaderToDelimitedFile(dynamic, header, ";");
            assertEquals("MONTANT;VIDE;TEXTE", header.toString());
            StringBuilder output = new StringBuilder();
            DynamicUtils.writeValuesToStringBuilder(dynamic, output, ";", Charset.forName("ISO-8859-15"));
            assertEquals(AMOUNT.toPlainString() + ";;Été;OGF €", output.toString());
            byte[] bytes = output.toString().getBytes("ISO-8859-15");
            assertEquals(output.toString(), new String(bytes, "ISO-8859-15"));
        }
    }

    @Test
    public void numericMappingsDoNotNarrowUnsignedTinyintOrDecimals() {
        assertEquals("id_Short", Dynamic.getTalendTypeFromDBType("id_MSSQL", "tinyint", 3, 0));
        assertEquals("id_BigDecimal", Dynamic.getTalendTypeFromDBType("id_MSSQL", "DECIMAL(38,10)", 38, 10));
        assertEquals("id_BigDecimal", Dynamic.getTalendTypeFromDBType("id_MSSQL", "money", 19, 4));
    }

    @Test
    public void zeroAndNegativeDecimalKeepTheirScale() throws Exception {
        try (CachedRowSet rows = rows(metadata())) {
            Dynamic dynamic = DynamicUtils.createMssqlDynamic(rows.getMetaData(), 2);
            DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, rows, 2, null, false);
            for (String number : new String[] { "0.0000000000", "-0.1200000000" }) {
                dynamic.setColumnValue(0, new BigDecimal(number));
                StringBuilder output = new StringBuilder();
                DynamicUtils.writeValuesToStringBuilder(dynamic, output, ";");
                assertEquals(number + ";;Été €", output.toString());
            }
        }
    }

    @Test
    public void primitiveJdbcGettersPreserveRangesAndNull() throws Exception {
        RowSetMetaDataImpl metadata = new RowSetMetaDataImpl();
        String[] sqlTypes = { "tinyint", "smallint", "int", "bigint", "bit", "real", "float", "money" };
        int[] types = { Types.TINYINT, Types.SMALLINT, Types.INTEGER, Types.BIGINT, Types.BIT,
                Types.REAL, Types.DOUBLE, Types.DECIMAL };
        metadata.setColumnCount(types.length);
        for (int i = 1; i <= types.length; i++) {
            metadata.setColumnName(i, "C" + i);
            metadata.setColumnLabel(i, "C" + i);
            metadata.setColumnType(i, types[i - 1]);
            metadata.setColumnTypeName(i, sqlTypes[i - 1]);
            metadata.setNullable(i, ResultSetMetaData.columnNullable);
        }
        try (CachedRowSet rows = RowSetProvider.newFactory().createCachedRowSet()) {
            rows.setMetaData(metadata);
            rows.moveToInsertRow();
            rows.updateObject(1, Short.valueOf((short) 255));
            rows.updateShort(2, Short.MIN_VALUE);
            rows.updateInt(3, Integer.MAX_VALUE);
            rows.updateLong(4, 9007199254740993L);
            rows.updateBoolean(5, false);
            rows.updateFloat(6, 1.25f);
            rows.updateDouble(7, 1.25d);
            rows.updateBigDecimal(8, new BigDecimal("12.3400"));
            rows.insertRow();
            rows.moveToCurrentRow();
            rows.beforeFirst();
            assertTrue(rows.next());
            Dynamic dynamic = DynamicUtils.createMssqlDynamic(metadata, 0);
            DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, rows, 0, null, false);
            assertEquals(Short.valueOf((short) 255), dynamic.getColumnValue(0));
            assertEquals(Short.valueOf(Short.MIN_VALUE), dynamic.getColumnValue(1));
            assertEquals(Integer.valueOf(Integer.MAX_VALUE), dynamic.getColumnValue(2));
            assertEquals(Long.valueOf(9007199254740993L), dynamic.getColumnValue(3));
            assertEquals(Boolean.FALSE, dynamic.getColumnValue(4));
            assertEquals(Float.valueOf(1.25f), dynamic.getColumnValue(5));
            assertEquals(Double.valueOf(1.25d), dynamic.getColumnValue(6));
            assertEquals(new BigDecimal("12.3400"), dynamic.getColumnValue(7));
            rows.updateNull(5);
            DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, rows, 0, null, false);
            assertNull(dynamic.getColumnValue(4));
        }
    }
}
