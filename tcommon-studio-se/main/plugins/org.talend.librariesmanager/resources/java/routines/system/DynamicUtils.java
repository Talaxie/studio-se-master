package routines.system;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Types;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/** Runtime operations for qualified Standard JDBC inputs/outputs and delimited files. */
public final class DynamicUtils {

    private DynamicUtils() {
    }

    private static void requireMssql(String database) throws SQLException {
        if (!"id_MSSQL".equalsIgnoreCase(database)) {
            throw new SQLException("Dynamic database output is not supported for " + database, "0A000");
        }
    }

    /** Labels are destination column names; the source dbName may differ for SQL aliases. */
    private static String quotedColumn(DynamicMetadata column) throws SQLException {
        String name = column.getName();
        if (name == null || name.isEmpty() || name.length() > 128 || name.indexOf('\0') >= 0) {
            throw new SQLException("Invalid SQL Server dynamic column name", "42000");
        }
        return "[" + name.replace("]", "]]") + "]";
    }

    private static String sqlType(DynamicMetadata column) throws SQLException {
        String type = column.getDbType() == null ? "" : column.getDbType().trim().toUpperCase(Locale.ROOT);
        int args = type.indexOf('(');
        if (args >= 0) { type = type.substring(0, args).trim(); }
        switch (type) {
        case "VARCHAR": case "NVARCHAR": case "CHAR": case "NCHAR":
            int max = type.startsWith("N") ? 4000 : 8000;
            int length = column.getLength();
            if (length > 0 && length <= max) { return type + "(" + length + ")"; }
            if (type.endsWith("VARCHAR")) { return type + "(MAX)"; }
            break;
        case "DECIMAL": case "NUMERIC":
            int precision = column.getLength();
            int scale = column.getPrecision();
            if (precision >= 1 && precision <= 38 && scale >= 0 && scale <= precision) {
                return type + "(" + precision + "," + scale + ")";
            }
            break;
        case "TEXT": case "NTEXT": case "MONEY": case "SMALLMONEY": case "TINYINT":
        case "SMALLINT": case "INT": case "BIGINT": case "BIT": case "REAL": case "FLOAT":
            return type;
        case "INTEGER": return "INT";
        case "DOUBLE": case "DOUBLE PRECISION": return "FLOAT";
        default: break;
        }
        throw new SQLException("Unsupported SQL Server dynamic column " + column.getName() + ": "
                + column.getDbType() + " (precision/length " + column.getLength() + ", scale "
                + column.getPrecision() + ")", "0A000");
    }

    public static String getCreateTableSQL(Dynamic dynamic, String database) throws SQLException {
        if (!"id_MSSQL".equalsIgnoreCase(database)) return DynamicJdbc.createColumns(dynamic, database);
        StringBuilder sql = new StringBuilder();
        Set<String> names = new HashSet<>();
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            DynamicMetadata column = dynamic.getColumnMetadata(i);
            String name = quotedColumn(column);
            if (!names.add(column.getName().toLowerCase(Locale.ROOT))) {
                throw new SQLException("Duplicate SQL Server dynamic output column: " + column.getName(), "42701");
            }
            if (i > 0) { sql.append(", "); }
            sql.append(name).append(' ').append(sqlType(column))
                    .append(column.isNullable() ? " NULL" : " NOT NULL");
        }
        return sql.toString();
    }

    /** Completes the existing generator's CREATE prefix, including an empty dynamic suffix. */
    public static String completeMssqlCreateTableSQL(String template, Dynamic dynamic) throws SQLException {
        String token = "{TALEND_DYNAMIC_COLUMN}";
        int position = template.indexOf(token);
        if (position < 0) { throw new SQLException("Missing dynamic CREATE placeholder", "42000"); }
        String prefix = template.substring(0, position).trim();
        String columns = getCreateTableSQL(dynamic, "id_MSSQL");
        if (columns.isEmpty()) {
            if (prefix.endsWith(",")) { prefix = prefix.substring(0, prefix.length() - 1); }
            if (prefix.endsWith("(")) { throw new SQLException("SQL Server output has no physical columns", "42000"); }
        }
        return prefix + (columns.isEmpty() ? "" : " " + columns) + template.substring(position + token.length());
    }

    public static String getInsertIntoStmtColumnsList(Dynamic dynamic, String database) throws SQLException {
        StringBuilder sql = new StringBuilder();
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            if (i > 0) { sql.append(", "); }
            sql.append("id_MSSQL".equalsIgnoreCase(database) ? quotedColumn(dynamic.getColumnMetadata(i))
                    : DynamicJdbc.quote(dynamic.getColumnMetadata(i).getName(), database));
        }
        return sql.toString();
    }

    public static String getInsertIntoStmtValuesList(Dynamic dynamic) {
        StringBuilder sql = new StringBuilder();
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            if (i > 0) { sql.append(", "); }
            sql.append('?');
        }
        return sql.toString();
    }

    public static String getMssqlInsertSQL(String table, String fixedColumns, String fixedValues, Dynamic dynamic)
            throws SQLException {
        String columns = joinSql(fixedColumns, getInsertIntoStmtColumnsList(dynamic, "id_MSSQL"));
        String values = joinSql(fixedValues, getInsertIntoStmtValuesList(dynamic));
        if (columns.isEmpty()) { throw new SQLException("SQL Server output has no physical columns", "42000"); }
        return "INSERT INTO " + table + " (" + columns + ") VALUES (" + values + ")";
    }

    public static String getInsertSQL(String table, String fixedColumns, String fixedValues, Dynamic dynamic,
            String database) throws SQLException {
        String columns = joinSql(fixedColumns, getInsertIntoStmtColumnsList(dynamic, database));
        String values = joinSql(fixedValues, getInsertIntoStmtValuesList(dynamic));
        if (columns.isEmpty()) throw new SQLException("Dynamic output has no physical columns", "42000");
        return "INSERT INTO " + table + " (" + columns + ") VALUES (" + values + ")";
    }

    public static String completeCreateTableSQL(String template, Dynamic dynamic, String database) throws SQLException {
        if ("id_MSSQL".equalsIgnoreCase(database)) return completeMssqlCreateTableSQL(template, dynamic);
        String token = "{TALEND_DYNAMIC_COLUMN}";
        int position = template.indexOf(token);
        if (position < 0) throw new SQLException("Missing dynamic CREATE placeholder", "42000");
        String prefix = template.substring(0, position).trim();
        String columns = getCreateTableSQL(dynamic, database);
        if (columns.isEmpty()) {
            if (prefix.endsWith(",")) prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.endsWith("(")) throw new SQLException("Dynamic output has no physical columns", "42000");
        }
        return prefix + (columns.isEmpty() ? "" : " " + columns) + template.substring(position + token.length());
    }

    public static void readColumnsFromDatabase(Dynamic dynamic, ResultSet result, int fixed, boolean trim)
            throws SQLException {
        DynamicJdbc.read(dynamic, result, fixed, trim);
    }

    private static String joinSql(String prefix, String suffix) {
        return prefix.isEmpty() ? suffix : suffix.isEmpty() ? prefix : prefix + ", " + suffix;
    }

    /** Dynamic payload fields are updated after the fixed non-key parameters. */
    public static String getUpdateSet(Dynamic dynamic, String database) throws SQLException {
        StringBuilder sql = new StringBuilder();
        for (int i = 0; i < columnCount(dynamic); i++) {
            DynamicMetadata column = dynamic.getColumnMetadata(i);
            if (column.isKey()) continue;
            if (sql.length() > 0) sql.append(", ");
            sql.append(quoteColumn(column.getName(), database)).append(" = ?");
        }
        return sql.toString();
    }

    private static String quoteColumn(String name, String database) throws SQLException {
        if (!"id_MSSQL".equalsIgnoreCase(database)) return DynamicJdbc.quote(name, database);
        DynamicMetadata column = new DynamicMetadata(); column.setName(name);
        return quotedColumn(column);
    }

    public static String getUpdateSet(Dynamic dynamic, String database, StringBuilder fixed) throws SQLException {
        return joinSql(fixed.toString(), getUpdateSet(dynamic, database));
    }

    public static String getUpsertUpdateSet(Dynamic dynamic, String database, String fixed, String fallbackKey)
            throws SQLException {
        String sql = joinSql(fixed, getUpdateSet(dynamic, database));
        String key = quoteColumn(fallbackKey, database);
        return sql.isEmpty() ? key + " = " + key : sql;
    }

    public static String getUpdateWhere(Dynamic dynamic, String database, StringBuilder fixed, boolean nullSafe)
            throws SQLException {
        StringBuilder sql = new StringBuilder(fixed.toString());
        for (int i = 0; i < columnCount(dynamic); i++) {
            DynamicMetadata column = dynamic.getColumnMetadata(i);
            if (!column.isKey()) continue;
            if (sql.length() > 0) sql.append(" AND ");
            String name = quoteColumn(column.getName(), database);
            sql.append(nullSafe && column.isNullable() ? "(" + name + " = ? OR (" + name + " IS NULL AND ? = 1))" : name + " = ?");
        }
        if (sql.length() == 0) throw new SQLException("Dynamic UPDATE/DELETE/upsert requires a correspondence key", "42000");
        return sql.toString();
    }

    /** Handles an empty dynamic suffix without a trailing comma or a key-only invalid SET. */
    public static String getUpdateSQL(String table, String fixedSet, String fixedWhere, String fallbackKey,
            Dynamic dynamic, String database) throws SQLException {
        String set = joinSql(fixedSet, getUpdateSet(dynamic, database));
        if (fixedWhere.isEmpty()) throw new SQLException("Dynamic UPDATE/upsert requires a static correspondence key", "42000");
        if (set.isEmpty()) {
            String key = quoteColumn(fallbackKey, database);
            set = key + " = " + key;
        }
        return "UPDATE " + table + " SET " + set + " WHERE " + fixedWhere;
    }

    /** A MySQL UPDATE reporting zero changed rows may still have matched an unchanged row. */
    public static boolean mysqlRowExists(java.sql.Connection connection, String table, String[] keys,
            Object[] values, boolean nullSafe) throws SQLException {
        if (keys.length == 0 || keys.length != values.length) throw new SQLException("Missing correspondence keys", "42000");
        StringBuilder where = new StringBuilder();
        for (String key : keys) {
            if (where.length() > 0) where.append(" AND ");
            where.append(quoteColumn(key, "mysql_id")).append(nullSafe ? " <=> ?" : " = ?");
        }
        try (PreparedStatement query = connection.prepareStatement("SELECT 1 FROM " + table + " WHERE " + where)) {
            for (int i = 0; i < values.length; i++) {
                Object value = values[i];
                if (value instanceof java.util.Date && !(value instanceof java.sql.Date)
                        && !(value instanceof java.sql.Time) && !(value instanceof java.sql.Timestamp))
                    value = new java.sql.Timestamp(((java.util.Date) value).getTime());
                query.setObject(i + 1, value);
            }
            try (ResultSet result = query.executeQuery()) { return result.next(); }
        }
    }

    /** PostgreSQL ON CONFLICT uses the same parameter list as INSERT. */
    public static String getPostgresConflictClause(String[] fixedNames, boolean[] fixedKeys, Dynamic dynamic)
            throws SQLException {
        StringBuilder keys = new StringBuilder(), updates = new StringBuilder();
        for (int i = 0; i < fixedNames.length + columnCount(dynamic); i++) {
            String name = i < fixedNames.length ? fixedNames[i] : dynamic.getColumnMetadata(i-fixedNames.length).getName();
            boolean key = i < fixedNames.length ? fixedKeys[i] : dynamic.getColumnMetadata(i-fixedNames.length).isKey();
            String quoted = quoteColumn(name, "postgres_id");
            StringBuilder target = key ? keys : updates;
            if (target.length() > 0) target.append(", ");
            target.append(quoted);
            if (!key) target.append(" = EXCLUDED.").append(quoted);
        }
        if (keys.length() == 0) throw new SQLException("PostgreSQL UPSERT requires a correspondence key", "42000");
        return " ON CONFLICT (" + keys + ") DO " + (updates.length() == 0 ? "NOTHING" : "UPDATE SET " + updates);
    }

    public static int writeColumnsToDatabse(Dynamic dynamic, PreparedStatement statement, int offset,
            String database, boolean nonKeysOnly) throws SQLException {
        if (!nonKeysOnly) return writeColumnsToDatabse(dynamic, statement, offset, database);
        Dynamic selected = dynamic.copyMetadata(); selected.metadatas.clear();
        for (int i = 0; i < dynamic.getColumnCount(); i++) if (!dynamic.getColumnMetadata(i).isKey()) {
            selected.metadatas.add(dynamic.getColumnMetadata(i)); selected.addColumnValue(dynamic.getColumnValue(i));
        }
        return writeColumnsToDatabse(selected, statement, offset, database);
    }

    /** Position is one-based, as used by the native MySQL key binding generator. */
    public static void insertKeyInWhereClause(Dynamic dynamic, PreparedStatement statement, int position,
            String database, boolean nullSafe) throws SQLException {
        for (int i = 0; i < columnCount(dynamic); i++) if (dynamic.getColumnMetadata(i).isKey()) {
            Dynamic selected = dynamic.copyMetadata(); selected.metadatas.clear();
            selected.metadatas.add(dynamic.getColumnMetadata(i)); selected.addColumnValue(dynamic.getColumnValue(i));
            writeColumnsToDatabse(selected, statement, position++ - 1, database);
            if (nullSafe && dynamic.getColumnMetadata(i).isNullable()) statement.setInt(position++, dynamic.getColumnValue(i) == null ? 1 : 0);
        }
    }

    /** Existing templates use this spelling. Offset counts the static parameters, not source ordinals. */
    public static int writeColumnsToDatabse(Dynamic dynamic, PreparedStatement statement, int offset, String database)
            throws SQLException {
        if (!"id_MSSQL".equalsIgnoreCase(database)) return DynamicJdbc.bind(dynamic, statement, offset, database);
        if (offset < 0) { throw new SQLException("Negative dynamic output parameter offset", "07009"); }
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            DynamicMetadata column = dynamic.getColumnMetadata(i);
            sqlType(column); // Refuse unsupported types rather than relying on driver's implicit conversion.
            Object value = dynamic.getColumnValue(i);
            int position = offset + i + 1;
            if (value == null) {
                statement.setNull(position, column.getDbTypeId());
            } else {
                switch (column.getType()) {
                case "id_String":
                    if (column.getDbTypeId() == Types.NVARCHAR || column.getDbTypeId() == Types.NCHAR
                            || column.getDbTypeId() == Types.LONGNVARCHAR) {
                        statement.setNString(position, (String) value);
                    } else { statement.setString(position, (String) value); }
                    break;
                case "id_BigDecimal": statement.setBigDecimal(position, (BigDecimal) value); break;
                case "id_Short": statement.setShort(position, ((Number) value).shortValue()); break;
                case "id_Integer": statement.setInt(position, ((Number) value).intValue()); break;
                case "id_Long": statement.setLong(position, ((Number) value).longValue()); break;
                case "id_Boolean": statement.setBoolean(position, (Boolean) value); break;
                case "id_Float": statement.setFloat(position, ((Number) value).floatValue()); break;
                case "id_Double": statement.setDouble(position, ((Number) value).doubleValue()); break;
                default: throw new SQLException("Unsupported dynamic output type: " + column.getType(), "0A000");
                }
            }
        }
        return dynamic.getColumnCount();
    }

    /** Creates the suffix description once, before the first row is read. */
    public static Dynamic createMssqlDynamic(ResultSetMetaData result, int fixedColumnCount) throws SQLException {
        int count = result.getColumnCount();
        if (fixedColumnCount < 0 || count < fixedColumnCount) {
            throw new SQLException("SQL Server result has " + count + " columns; expected at least "
                    + fixedColumnCount + " static columns.", "07009");
        }
        Dynamic dynamic = new Dynamic();
        dynamic.setDbmsId("id_MSSQL");
        for (int position = fixedColumnCount + 1; position <= count; position++) {
            DynamicMetadata column = new DynamicMetadata();
            String name = result.getColumnLabel(position);
            if (name == null || name.isEmpty()) {
                name = result.getColumnName(position);
            }
            column.setName(name == null || name.isEmpty() ? "Column" + position : name);
            column.setDbName(result.getColumnName(position));
            column.setDbType(result.getColumnTypeName(position));
            column.setDbTypeId(result.getColumnType(position));
            column.setLength(result.getPrecision(position));
            column.setPrecision(result.getScale(position));
            try {
                column.setType(Dynamic.getTalendTypeFromDBType("id_MSSQL", column.getDbType(),
                        column.getLength(), column.getPrecision()));
            } catch (IllegalArgumentException e) {
                throw new SQLException("Unsupported SQL Server dynamic column " + position + " ("
                        + column.getName() + "): " + column.getDbType(), "0A000", e);
            }
            column.setNullable(result.isNullable(position) != ResultSetMetaData.columnNoNulls);
            column.setSourceType(DynamicMetadata.sourceTypes.database);
            column.setColumnPosition(position);
            dynamic.metadatas.add(column);
        }
        return dynamic;
    }

    /** The ordinal stored in metadata already includes the static prefix. */
    public static void readColumnsFromDatabase_Mssql(Dynamic dynamic, ResultSet result, int fixedColumnCount,
            List<String> ntextValues, boolean trim) throws SQLException {
        dynamic.clearColumnValues();
        for (int index = 0; index < dynamic.getColumnCount(); index++) {
            DynamicMetadata column = dynamic.getColumnMetadata(index);
            int position = column.getColumnPosition() > 0 ? column.getColumnPosition() : fixedColumnCount + index + 1;
            Object value;
            switch (column.getType()) {
            case "id_String":
                String text = result.getString(position);
                value = trim && text != null ? text.trim() : text;
                break;
            case "id_BigDecimal": value = result.getBigDecimal(position); break;
            case "id_Short": value = result.getShort(position); break;
            case "id_Integer": value = result.getInt(position); break;
            case "id_Long": value = result.getLong(position); break;
            case "id_Boolean": value = result.getBoolean(position); break;
            case "id_Float": value = result.getFloat(position); break;
            case "id_Double": value = result.getDouble(position); break;
            default:
                throw new SQLException("Unsupported dynamic column " + position + " (" + column.getName()
                        + "): " + column.getType(), "0A000");
            }
            dynamic.addColumnValue(result.wasNull() ? null : value);
        }
    }

    public static void writeHeaderToDelimitedFile(Dynamic dynamic, Writer output, String separator) throws IOException {
        if (dynamic == null) return;
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            if (i > 0) {
                output.write(separator);
            }
            output.write(dynamic.getColumnMetadata(i).getName());
        }
    }

    public static void writeValuesToStringBuilder(Dynamic dynamic, Appendable output, String separator) throws IOException {
        writeValuesToStringBuilder(dynamic, output, separator, Charset.defaultCharset());
    }

    public static void writeValuesToStringBuilder(Dynamic dynamic, Appendable output, String separator, Charset charset)
            throws IOException {
        writeValuesToStringBuilder(dynamic, output, separator, null, null, charset);
    }

    public static void writeValuesToStringBuilder(Dynamic dynamic, Appendable output, String separator,
            Character thousands, Character decimal) throws IOException {
        writeValuesToStringBuilder(dynamic, output, separator, thousands, decimal, Charset.defaultCharset());
    }

    public static void writeValuesToStringBuilder(Dynamic dynamic, Appendable output, String separator,
            Character thousands, Character decimal, Charset charset) throws IOException {
        if (dynamic == null) return;
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            if (i > 0) {
                output.append(separator);
            }
            Object value = dynamic.getColumnValue(i);
            if (value != null) {
                String text = value instanceof BigDecimal ? ((BigDecimal) value).toPlainString()
                        : value instanceof byte[] ? new String((byte[]) value, charset) : value.toString();
                if (value instanceof Number && (thousands != null || decimal != null)) {
                    text = formatNumber(text, thousands, decimal);
                }
                output.append(text);
            }
        }
    }

    public static int columnCount(Dynamic dynamic) {
        return dynamic == null ? 0 : dynamic.getColumnCount();
    }

    /** CSV quoting and escaping remain the responsibility of the component's CSV writer. */
    public static void writeValuesToStringArrayEnhance(Dynamic dynamic, String[] row, int offset,
            String nullValue, Charset charset) {
        for (int i = 0; i < columnCount(dynamic); i++) {
            Object value = dynamic.getColumnValue(i);
            row[offset + i] = value == null ? nullValue : value instanceof byte[] ? new String((byte[]) value, charset)
                    : value instanceof BigDecimal ? ((BigDecimal) value).toPlainString() : String.valueOf(value);
        }
    }

    public static void writeValuesToStringArrayEnhance(Dynamic dynamic, String[] row, int offset, String nullValue) {
        writeValuesToStringArrayEnhance(dynamic, row, offset, nullValue, Charset.defaultCharset());
    }

    private static String formatNumber(String text, Character thousands, Character decimal) {
        int point = text.indexOf('.');
        String integer = point < 0 ? text : text.substring(0, point);
        if (thousands != null) {
            StringBuilder grouped = new StringBuilder(integer);
            int sign = integer.startsWith("-") || integer.startsWith("+") ? 1 : 0;
            for (int i = integer.length() - 3; i > sign; i -= 3) {
                grouped.insert(i, thousands.charValue());
            }
            integer = grouped.toString();
        }
        return point < 0 ? integer : integer + (decimal == null ? '.' : decimal.charValue()) + text.substring(point + 1);
    }
}
