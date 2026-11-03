package routines.system;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;
import org.junit.Test;

public class DynamicPriority2Test {
    private Dynamic row() {
        Dynamic row = new Dynamic(); row.setDbmsId("id_MSSQL");
        DynamicFields.add(row, "Montant €", "Amount", "id_BigDecimal", "DECIMAL", 38, 10, true, true, null,
                new BigDecimal("1234567890123456789012345678.1234567890"));
        DynamicFields.add(row, "text", "text", "id_String", "NVARCHAR", 200000, 0, true, false, null, "Été;\"€\"\nObsèques");
        DynamicFields.add(row, "empty", "empty", "id_Integer", "INT", 10, 0, true, false, null, null);
        return row;
    }

    @Test public void typedChildResultPreservesFullMetadataAndValues() {
        Dynamic original = row(); String encoded = DynamicTransfer.encode(original);
        original.setColumnValue(0, BigDecimal.ZERO);
        Dynamic decoded = DynamicTransfer.decode(encoded);
        assertEquals("1234567890123456789012345678.1234567890", decoded.getColumnValue(0).toString());
        assertEquals("Été;\"€\"\nObsèques", decoded.getColumnValue("text"));
        assertNull(decoded.getColumnValue("empty"));
        DynamicMetadata metadata = decoded.getColumnMetadata(0);
        assertEquals(38, metadata.getLength()); assertEquals(10, metadata.getPrecision());
        assertEquals("Amount", metadata.getDbName()); assertTrue(metadata.isKey());
        assertEquals("id_MSSQL", decoded.getDbmsId());
    }

    @Test public void nullEmptyAndLargeChildResultsAreDistinct() {
        assertNull(DynamicTransfer.decode(DynamicTransfer.encode(null)));
        assertEquals(0, DynamicTransfer.decode(DynamicTransfer.encode(new Dynamic())).getColumnCount());
        Dynamic row = row(); char[] chars = new char[100000]; Arrays.fill(chars, 'é');
        row.setColumnValue(1, new String(chars));
        assertEquals(new String(chars), DynamicTransfer.decode(DynamicTransfer.encode(row)).getColumnValue(1));
    }

    @Test public void mutableListsMapsDatesAndBytesAreSnapshotted() {
        Dynamic row = new Dynamic(); List<Object> list = new ArrayList<Object>(); list.add(new byte[]{65});
        Map<String,Object> map = new LinkedHashMap<String,Object>(); map.put("list", list); map.put("date", new Date(123456));
        DynamicFields.add(row, "value", "value", "id_Object", "", 0, 0, true, false, null, map);
        ((byte[]) list.get(0))[0] = 90;
        Dynamic decoded = DynamicTransfer.decode(DynamicTransfer.encode(row));
        Map<?,?> copy = (Map<?,?>) decoded.getColumnValue(0);
        assertEquals(65, ((byte[]) ((List<?>) copy.get("list")).get(0))[0]);
        assertEquals(new Date(123456), copy.get("date"));
        ((Date) copy.get("date")).setTime(0);
        assertEquals(new Date(123456), ((Map<?,?>) row.getColumnValue(0)).get("date"));
    }

    @Test public void extractionConvertsStringsAndNumbersWithoutDecimalRounding() {
        assertEquals(new BigDecimal("1234567890123456789012345678.1234567890"),
                DynamicFields.convert("1234567890123456789012345678.1234567890", "id_BigDecimal", null, true));
        assertEquals(Integer.valueOf(7), DynamicFields.convert(Long.valueOf(7), "id_Integer", null, false));
        assertEquals(Boolean.TRUE, DynamicFields.convert("true", "id_Boolean", null, true));
        assertEquals(Character.valueOf('É'), DynamicFields.convert("Été", "id_Character", null, true));
        assertEquals("Été", DynamicFields.convert("Été".getBytes(), "id_String", null, true));
    }

    @Test public void missingNullableAndEmptyCsvValuesBecomeNull() {
        assertNull(DynamicFields.get(row(), "absent")); assertNull(DynamicFields.get(null, "absent"));
        assertNull(DynamicFields.convert(null, "id_Integer", null, true));
        assertNull(DynamicFields.convert("", "id_BigDecimal", null, true));
        assertEquals("", DynamicFields.convert("", "id_String", null, true));
    }

    @Test public void remainingFieldsRetainOrderAndAreIndependent() {
        Dynamic source = row(); Dynamic result = DynamicFields.remaining(source, new String[]{"text", "missing"});
        assertEquals(2, result.getColumnCount()); assertEquals("Montant €", result.getColumnMetadata(0).getName());
        result.getColumnMetadata(0).setName("changed"); result.setColumnValue(0, BigDecimal.ZERO);
        assertEquals("Montant €", source.getColumnMetadata(0).getName());
        assertEquals(0, DynamicFields.remaining(null, new String[0]).getColumnCount());
    }

    @Test public void datesListsAndBinaryExtractionsAreTypedCopies() {
        Date date = (Date) DynamicFields.convert("2026-11-03", "id_Date", "yyyy-MM-dd", true);
        assertNotSame(date, DynamicFields.convert(date, "id_Date", null, true));
        List<String> source = new ArrayList<String>(Arrays.asList("Été", "€"));
        assertEquals(source, DynamicFields.convert(source, "id_List", null, true));
        assertNotSame(source, DynamicFields.convert(source, "id_List", null, true));
        byte[] bytes = {65,66}; assertArrayEquals(bytes, (byte[]) DynamicFields.convert(bytes, "id_byte[]", null, true));
        assertNotSame(bytes, DynamicFields.convert(bytes, "id_byte[]", null, true));
    }

    @Test public void csvExpansionPreservesSpecialCharactersAndConfigurableNulls() {
        String[] output = new String[5]; output[0] = "fixed";
        DynamicUtils.writeValuesToStringArrayEnhance(row(), output, 1, "NULL", StandardCharsets.UTF_8);
        assertEquals("fixed", output[0]); assertEquals("1234567890123456789012345678.1234567890", output[1]);
        assertEquals("Été;\"€\"\nObsèques", output[2]); assertEquals("NULL", output[3]);
        assertEquals(0, DynamicUtils.columnCount(null));
    }

    @Test public void malformedTransportAndInvalidFieldConversionsFailClearly() {
        for (String value : Arrays.asList("ordinary text", "TalaxieDynamic:1:invalid!")) {
            try { DynamicTransfer.decode(value); fail(value); } catch (IllegalArgumentException expected) { }
        }
        for (Object[] test : new Object[][]{{null,"id_Integer",null}, {"2026-02-31","id_Date","yyyy-MM-dd"},
                {"bad","id_BigDecimal",null}, {"bad","id_List",null}}) {
            try { DynamicFields.convert(test[0], (String)test[1], (String)test[2], false); fail(); }
            catch (IllegalArgumentException expected) { }
        }
    }
}
