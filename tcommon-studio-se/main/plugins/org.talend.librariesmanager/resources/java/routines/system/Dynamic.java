package routines.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/** Ordered metadata and typed values for the dynamic suffix of a row. */
public class Dynamic implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    // Public for compatibility with existing component generation templates.
    public List<DynamicMetadata> metadatas = new ArrayList<DynamicMetadata>();

    private final List<Object> values = new ArrayList<Object>();
    private String dbmsId;

    public void setDbmsId(String value) { dbmsId = value; }
    public String getDbmsId() { return dbmsId; }
    public int getColumnCount() { return metadatas.size(); }
    public DynamicMetadata getColumnMetadata(int index) { return metadatas.get(index); }
    public Object getColumnValue(int index) { return values.get(index); }
    public void addColumnValue(Object value) { values.add(value); }
    public void setColumnValue(int index, Object value) { values.set(index, value); }
    public void clearColumnValues() { values.clear(); }

    /** Returns the first matching column, or -1. Duplicate labels retain their ordinals. */
    public int getIndex(String name) {
        for (int i = 0; i < metadatas.size(); i++) {
            if (Objects.equals(name, metadatas.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(String name) { return getIndex(name) >= 0; }

    public Object getColumnValue(String name) {
        int index = getIndex(name);
        if (index < 0) {
            throw new IllegalArgumentException("Unknown dynamic column: " + name);
        }
        return getColumnValue(index);
    }

    /** SQL Server types qualified for Standard dynamic input. Never narrows a decimal. */
    public static String getTalendTypeFromDBType(String dbms, String dbType, int length, int precision) {
        if (!"id_MSSQL".equalsIgnoreCase(dbms)) {
            return DynamicJdbc.type(dbms, dbType, length, precision);
        }
        String type = dbType == null ? "" : dbType.trim().toUpperCase(Locale.ROOT);
        int arguments = type.indexOf('(');
        if (arguments >= 0) {
            type = type.substring(0, arguments).trim();
        }
        switch (type) {
        case "CHAR": case "VARCHAR": case "NCHAR": case "NVARCHAR": case "TEXT": case "NTEXT":
            return "id_String";
        case "DECIMAL": case "NUMERIC": case "MONEY": case "SMALLMONEY":
            return "id_BigDecimal";
        case "TINYINT": case "SMALLINT":
            return "id_Short";
        case "INT": case "INTEGER":
            return "id_Integer";
        case "BIGINT":
            return "id_Long";
        case "BIT":
            return "id_Boolean";
        case "REAL":
            return "id_Float";
        case "FLOAT": case "DOUBLE": case "DOUBLE PRECISION":
            return "id_Double";
        default:
            throw new IllegalArgumentException("Unsupported SQL Server dynamic type: " + dbType);
        }
    }

    public Dynamic copyMetadata() {
        Dynamic copy = new Dynamic();
        copy.dbmsId = dbmsId;
        for (DynamicMetadata metadata : metadatas) {
            copy.metadatas.add(metadata.clone());
        }
        return copy;
    }

    public Dynamic copy() { return clone(true); }

    @Override
    public Dynamic clone() { return clone(true); }

    public Dynamic clone(boolean copyMetadata) {
        Dynamic copy = new Dynamic();
        copy.dbmsId = dbmsId;
        for (DynamicMetadata metadata : metadatas) {
            copy.metadatas.add(copyMetadata ? metadata.clone() : metadata);
        }
        for (Object value : values) {
            copy.values.add(copyValue(value));
        }
        return copy;
    }

    /** Mutable field values must not alias cached rows or other output branches. */
    public static Object copyValue(Object value) {
        if (value instanceof byte[]) return ((byte[]) value).clone();
        if (value instanceof java.util.Date) return ((java.util.Date) value).clone();
        if (value instanceof List) {
            List<Object> copy = new ArrayList<Object>();
            for (Object entry : (List<?>) value) copy.add(copyValue(entry));
            return copy;
        }
        if (value instanceof java.util.Map) {
            java.util.Map<Object, Object> copy = new java.util.LinkedHashMap<Object, Object>();
            for (java.util.Map.Entry<?, ?> entry : ((java.util.Map<?, ?>) value).entrySet()) {
                copy.put(copyValue(entry.getKey()), copyValue(entry.getValue()));
            }
            return copy;
        }
        return value;
    }

    @Override
    public String toString() { return toString(";"); }

    public String toString(String separator) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) {
                result.append(separator);
            }
            if (values.get(i) != null) {
                result.append(values.get(i));
            }
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Dynamic)) {
            return false;
        }
        Dynamic value = (Dynamic) other;
        return Objects.equals(dbmsId, value.dbmsId) && metadatas.equals(value.metadatas)
                && values.equals(value.values);
    }

    @Override
    public int hashCode() { return Objects.hash(dbmsId, metadatas, values); }
}
