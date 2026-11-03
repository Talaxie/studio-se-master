package routines.system;

import java.io.Serializable;
import java.util.Objects;

/** Description of one physical column in a dynamic row. */
public class DynamicMetadata implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    public enum sourceTypes { database, file, demilitedFile }

    private String name;
    private String dbName;
    private String type;
    private String dbType;
    private int dbTypeId;
    private int length;
    private int precision;
    private String format;
    private boolean nullable = true;
    private boolean key;
    private sourceTypes sourceType;
    private int columnPosition;

    public String getName() { return name; }
    public void setName(String value) { name = value; }
    public String getDbName() { return dbName; }
    public void setDbName(String value) { dbName = value; }
    public String getType() { return type; }
    public void setType(String value) { type = value; }
    public String getDbType() { return dbType; }
    public void setDbType(String value) { dbType = value; }
    public int getDbTypeId() { return dbTypeId; }
    public void setDbTypeId(int value) { dbTypeId = value; }

    /** Historical API: length holds JDBC precision (total number of digits). */
    public int getLength() { return length; }
    public void setLength(int value) { length = value; }

    /** Historical API: precision holds JDBC scale (digits after the decimal point). */
    public int getPrecision() { return precision; }
    public void setPrecision(int value) { precision = value; }
    public String getFormat() { return format; }
    public void setFormat(String value) { format = value; }
    public boolean isNullable() { return nullable; }
    public void setNullable(boolean value) { nullable = value; }
    public boolean isKey() { return key; }
    public void setKey(boolean value) { key = value; }
    public sourceTypes getSourceType() { return sourceType; }
    public void setSourceType(sourceTypes value) { sourceType = value; }

    /** Absolute JDBC ordinal, starting at one, including any static prefix. */
    public int getColumnPosition() { return columnPosition; }
    public void setColumnPosition(int value) { columnPosition = value; }

    @Override
    public DynamicMetadata clone() {
        try {
            return (DynamicMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DynamicMetadata)) {
            return false;
        }
        DynamicMetadata value = (DynamicMetadata) other;
        return Objects.equals(name, value.name) && Objects.equals(dbName, value.dbName)
                && Objects.equals(type, value.type) && Objects.equals(dbType, value.dbType)
                && dbTypeId == value.dbTypeId && length == value.length && precision == value.precision
                && nullable == value.nullable && key == value.key && sourceType == value.sourceType
                && columnPosition == value.columnPosition && Objects.equals(format, value.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dbName, type, dbType, dbTypeId, length, precision, nullable, key,
                sourceType, columnPosition, format);
    }
}
