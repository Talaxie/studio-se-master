package routines.system;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

/** Named extraction and typed construction for Standard Dynamic field components. */
public final class DynamicFields {
    private DynamicFields() { }

    public static Object get(Dynamic dynamic, String name) {
        return dynamic == null || !dynamic.contains(name) ? null : Dynamic.copyValue(dynamic.getColumnValue(name));
    }

    public static Dynamic remaining(Dynamic dynamic, String[] extractedNames) {
        Dynamic result = new Dynamic();
        if (dynamic == null) return result;
        result.setDbmsId(dynamic.getDbmsId());
        Set<String> extracted = new HashSet<String>(Arrays.asList(extractedNames));
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            if (!extracted.contains(dynamic.getColumnMetadata(i).getName())) {
                result.metadatas.add(dynamic.getColumnMetadata(i).clone());
                result.addColumnValue(Dynamic.copyValue(dynamic.getColumnValue(i)));
            }
        }
        return result;
    }

    public static void add(Dynamic dynamic, String name, String dbName, String type, String dbType,
            int length, int precision, boolean nullable, boolean key, String pattern, Object value) {
        DynamicMetadata metadata = new DynamicMetadata();
        metadata.setName(name); metadata.setDbName(dbName); metadata.setType(type); metadata.setDbType(dbType);
        metadata.setLength(length); metadata.setPrecision(precision); metadata.setNullable(nullable); metadata.setKey(key);
        metadata.setFormat(pattern); metadata.setColumnPosition(dynamic.getColumnCount());
        dynamic.metadatas.add(metadata); dynamic.addColumnValue(Dynamic.copyValue(value));
    }

    public static Object convert(Object value, String type, String pattern, boolean nullable) {
        if (value == null) {
            if (!nullable) throw new IllegalArgumentException("Missing value for required " + type + " field");
            return null;
        }
        String text = value instanceof BigDecimal ? ((BigDecimal) value).toPlainString() : String.valueOf(value);
        if (value instanceof String && text.isEmpty() && !"id_String".equals(type)
                && !"id_Object".equals(type) && !"id_List".equals(type) && !"id_byte[]".equals(type)) {
            if (nullable) return null;
            throw new IllegalArgumentException("Empty value for required " + type + " field");
        }
        switch (type) {
        case "id_String": return value instanceof byte[] ? new String((byte[]) value, Charset.defaultCharset()) : text;
        case "id_BigDecimal": return value instanceof BigDecimal ? value : new BigDecimal(text);
        case "id_BigInteger": return value instanceof BigInteger ? value : new BigInteger(text);
        case "id_Integer": return value instanceof Number ? ((Number) value).intValue() : Integer.valueOf(text);
        case "id_Long": return value instanceof Number ? ((Number) value).longValue() : Long.valueOf(text);
        case "id_Short": return value instanceof Number ? ((Number) value).shortValue() : Short.valueOf(text);
        case "id_Byte": return value instanceof Number ? ((Number) value).byteValue() : Byte.valueOf(text);
        case "id_Float": return value instanceof Number ? ((Number) value).floatValue() : Float.valueOf(text);
        case "id_Double": return value instanceof Number ? ((Number) value).doubleValue() : Double.valueOf(text);
        case "id_Boolean": return value instanceof Boolean ? value : Boolean.valueOf(text);
        case "id_Character":
            if (text.isEmpty()) { if (nullable) return null; throw new IllegalArgumentException("Empty character field"); }
            return text.charAt(0);
        case "id_byte[]": return value instanceof byte[] ? ((byte[]) value).clone() : text.getBytes(Charset.defaultCharset());
        case "id_Date":
            if (value instanceof Date) return ((Date) value).clone();
            if (pattern == null || pattern.isEmpty()) throw new IllegalArgumentException("A date pattern is required");
            SimpleDateFormat format = new SimpleDateFormat(pattern); format.setLenient(false);
            ParsePosition position = new ParsePosition(0); Date date = format.parse(text, position);
            if (date == null || position.getIndex() != text.length()) throw new IllegalArgumentException("Invalid date: " + text);
            return date;
        case "id_List":
            if (!(value instanceof List)) throw new IllegalArgumentException("Expected a List field");
            return Dynamic.copyValue(value);
        case "id_Object": return Dynamic.copyValue(value);
        default: throw new IllegalArgumentException("Unsupported extraction type: " + type);
        }
    }
}
