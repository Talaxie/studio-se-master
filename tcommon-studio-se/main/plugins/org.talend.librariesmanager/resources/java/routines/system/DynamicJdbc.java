package routines.system;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Locale;

/** Shared JDBC metadata/value handling; SQL dialect differences stay explicit. */
public final class DynamicJdbc {
    private DynamicJdbc() { }

    public static String dialect(String database) {
        if ("mysql_id".equalsIgnoreCase(database)) return "mysql";
        if ("postgres_id".equalsIgnoreCase(database)) return "postgres";
        if ("oracle_id".equalsIgnoreCase(database)) return "oracle";
        throw new IllegalArgumentException("Unsupported dynamic database: " + database);
    }

    private static String outputDialect(String database) throws SQLException {
        try { return dialect(database); }
        catch (IllegalArgumentException e) { throw new SQLException(e.getMessage(), "0A000", e); }
    }

    private static String base(String type) {
        return type == null ? "" : type.toUpperCase(Locale.ROOT).replaceAll("\\([0-9 ,+-]+\\)", "").trim();
    }

    public static String type(String database, String sql, int length, int scale) {
        String db = dialect(database), t = base(sql);
        if ("oracle".equals(db)) {
            if (t.matches("NUMBER|NUMERIC|DECIMAL|DEC|INTEGER|INT|SMALLINT|FLOAT")) return "id_BigDecimal";
            if (t.equals("BINARY_FLOAT")) return "id_Float";
            if (t.equals("BINARY_DOUBLE")) return "id_Double";
            if (t.matches("VARCHAR2?|NVARCHAR2|N?CHAR|N?CLOB|LONG")) return "id_String";
            if (t.matches("RAW|LONG RAW|BLOB")) return "id_byte[]";
            if (t.equals("DATE") || t.equals("TIMESTAMP")) return "id_Date";
            if (t.equals("TIMESTAMP WITH TIME ZONE")) return "id_Object";
        } else if ("mysql".equals(db)) {
            if (t.equals("BIGINT UNSIGNED")) return "id_BigDecimal";
            if (t.matches("DECIMAL( UNSIGNED)?|NUMERIC( UNSIGNED)?")) return "id_BigDecimal";
            if (t.equals("BIGINT") || t.matches("(INT|INTEGER|MEDIUMINT) UNSIGNED")) return "id_Long";
            if (t.matches("TINYINT|SMALLINT|MEDIUMINT|INT|INTEGER|TINYINT UNSIGNED|SMALLINT UNSIGNED|YEAR")) return "id_Integer";
            if (t.matches("BOOLEAN|BOOL")) return "id_Boolean";
            if (t.equals("BIT")) return length > 1 ? "id_byte[]" : "id_Boolean";
            if (t.matches("FLOAT( UNSIGNED)?")) return "id_Float";
            if (t.matches("DOUBLE( UNSIGNED)?|REAL")) return "id_Double";
            if (t.matches("VARCHAR|CHAR|TINYTEXT|MEDIUMTEXT|LONGTEXT|TEXT|JSON|ENUM|SET")) return "id_String";
            if (t.matches("BINARY|VARBINARY|TINYBLOB|MEDIUMBLOB|LONGBLOB|BLOB")) return "id_byte[]";
            if (t.equals("TIME")) return "id_String"; // MySQL TIME also represents durations beyond 24 hours.
            if (t.matches("DATE|DATETIME|TIMESTAMP")) return "id_Date";
        } else {
            if (t.matches("NUMERIC|DECIMAL|MONEY")) return "id_BigDecimal";
            if (t.matches("INT2|SMALLINT|SMALLSERIAL")) return "id_Short";
            if (t.matches("INT4|INT|INTEGER|SERIAL")) return "id_Integer";
            if (t.matches("INT8|BIGINT|BIGSERIAL")) return "id_Long";
            if (t.matches("BOOL|BOOLEAN")) return "id_Boolean";
            if (t.matches("FLOAT4|REAL")) return "id_Float";
            if (t.matches("FLOAT8|DOUBLE PRECISION")) return "id_Double";
            if (t.matches("VARCHAR|CHARACTER VARYING|CHAR|BPCHAR|TEXT|NAME|UUID|JSONB?|XML")) return "id_String";
            if (t.equals("BYTEA")) return "id_byte[]";
            if (t.matches("TIME|TIME WITHOUT TIME ZONE")) return "id_Object";
            if (t.matches("DATE|TIMESTAMP|TIMESTAMP WITHOUT TIME ZONE")) return "id_Date";
            if (t.matches("TIMESTAMPTZ|TIMETZ|TIMESTAMP WITH TIME ZONE|TIME WITH TIME ZONE")) return "id_Object";
        }
        throw new IllegalArgumentException("Unsupported " + database + " dynamic SQL type: " + sql);
    }

    public static Dynamic create(ResultSetMetaData result, int fixed, String database) throws SQLException {
        outputDialect(database);
        if (fixed < 0 || fixed > result.getColumnCount()) throw new SQLException("Result has fewer columns than the static prefix", "07009");
        Dynamic dynamic = new Dynamic();
        dynamic.setDbmsId(database);
        for (int i = fixed + 1; i <= result.getColumnCount(); i++) {
            DynamicMetadata c = new DynamicMetadata();
            String label = result.getColumnLabel(i);
            if (label == null || label.isEmpty()) label = result.getColumnName(i);
            c.setName(label == null || label.isEmpty() ? "Column" + i : label);
            c.setDbName(result.getColumnName(i)); c.setDbType(result.getColumnTypeName(i));
            c.setDbTypeId(result.getColumnType(i)); c.setLength(result.getPrecision(i)); c.setPrecision(result.getScale(i));
            if ("mysql".equals(dialect(database)) && base(c.getDbType()).matches("TIME|DATETIME|TIMESTAMP")) {
                // Connector/J reports scale=0 for temporal expressions; display size includes fractional digits.
                int width = result.getColumnDisplaySize(i), whole = base(c.getDbType()).equals("TIME") ? 8 : 19;
                if (width > whole) c.setPrecision(Math.max(c.getPrecision(), Math.min(6, width - whole - 1)));
            }
            try { c.setType(type(database, c.getDbType(), c.getLength(), c.getPrecision())); }
            catch (IllegalArgumentException e) { throw new SQLException("Dynamic column " + i + " (" + c.getName() + "): " + e.getMessage(), "0A000", e); }
            c.setNullable(result.isNullable(i) != ResultSetMetaData.columnNoNulls);
            c.setSourceType(DynamicMetadata.sourceTypes.database); c.setColumnPosition(i);
            dynamic.metadatas.add(c);
        }
        return dynamic;
    }

    public static void read(Dynamic dynamic, ResultSet result, int fixed, boolean trim) throws SQLException {
        String db = outputDialect(dynamic.getDbmsId());
        dynamic.clearColumnValues();
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            DynamicMetadata c = dynamic.getColumnMetadata(i);
            int p = c.getColumnPosition() > 0 ? c.getColumnPosition() : fixed + i + 1;
            Object value;
            switch (c.getType()) {
            case "id_String": String text = result.getString(p); value = trim && text != null ? text.trim() : text; break;
            case "id_BigDecimal": value = result.getBigDecimal(p); break;
            case "id_Short": value = result.getShort(p); break;
            case "id_Integer": value = result.getInt(p); break;
            case "id_Long": value = result.getLong(p); break;
            case "id_Boolean": value = result.getBoolean(p); break;
            case "id_Float": value = result.getFloat(p); break;
            case "id_Double": value = result.getDouble(p); break;
            case "id_byte[]": value = result.getBytes(p); break;
            case "id_Date":
                // Oracle DATE contains a time component; getDate would discard it.
                if (c.getDbTypeId() == Types.DATE && !db.equals("oracle")) value = result.getDate(p);
                else if (c.getDbTypeId() == Types.TIME) value = result.getTime(p);
                else value = result.getTimestamp(p);
                break;
            case "id_Object":
                if (base(c.getDbType()).matches("TIME|TIME WITHOUT TIME ZONE")) value = result.getObject(p, java.time.LocalTime.class);
                else value = base(c.getDbType()).contains("TIME") && !base(c.getDbType()).contains("STAMP")
                        ? result.getObject(p, java.time.OffsetTime.class) : result.getObject(p, java.time.OffsetDateTime.class);
                break;
            default: throw new SQLException("Unsupported dynamic JDBC value type: " + c.getType(), "0A000");
            }
            if (result.wasNull()) value = null;
            dynamic.addColumnValue(value);
        }
    }

    public static String quote(String name, String database) throws SQLException {
        String db = outputDialect(database);
        if (name == null || name.isEmpty() || name.indexOf('\0') >= 0) throw new SQLException("Invalid dynamic column name", "42000");
        String q = db.equals("mysql") ? "`" : "\"";
        return q + name.replace(q, q + q) + q;
    }

    /** DDL uses source native types only for the same engine; cross-engine flows use logical types. */
    public static String sqlType(Dynamic dynamic, DynamicMetadata c, String database) throws SQLException {
        String db = outputDialect(database), t;
        if (dynamic.getDbmsId() != null && dynamic.getDbmsId().equalsIgnoreCase(database)) {
            t = base(c.getDbType());
            try { type(database, t, c.getLength(), c.getPrecision()); }
            catch (IllegalArgumentException e) { throw new SQLException(e.getMessage(), "0A000", e); }
        } else {
            switch (c.getType()) {
            case "id_String": t = db.equals("oracle") ? "CLOB" : db.equals("mysql") ? "LONGTEXT" : "TEXT"; break;
            case "id_BigDecimal": t = db.equals("oracle") ? "NUMBER" : "NUMERIC"; break;
            case "id_Short": case "id_Integer": t = db.equals("oracle") ? "NUMBER" : "INTEGER"; break;
            case "id_Long": t = db.equals("oracle") ? "NUMBER" : "BIGINT"; break;
            case "id_Float": t = db.equals("oracle") ? "BINARY_FLOAT" : "REAL"; break;
            case "id_Double": t = db.equals("oracle") ? "BINARY_DOUBLE" : "DOUBLE PRECISION"; break;
            case "id_Boolean": t = db.equals("oracle") ? "NUMBER" : "BOOLEAN"; break;
            case "id_byte[]": t = db.equals("oracle") ? "BLOB" : db.equals("mysql") ? "LONGBLOB" : "BYTEA"; break;
            case "id_Date": t = "TIMESTAMP"; break;
            case "id_Object":
                if (base(c.getDbType()).matches("TIME|TIME WITHOUT TIME ZONE|TIMETZ|TIME WITH TIME ZONE")) {
                    if (db.equals("oracle")) throw new SQLException("Oracle requires a date for time-only values", "0A000");
                    t = base(c.getDbType()).contains("TZ") || base(c.getDbType()).equals("TIME WITH TIME ZONE") ? "TIME WITH TIME ZONE" : "TIME";
                } else t = "TIMESTAMP WITH TIME ZONE";
                break;
            default: throw new SQLException("Unsupported dynamic target type: " + c.getType(), "0A000");
            }
        }
        // Driver aliases must not turn sequences/identity into new auto-generated columns.
        if (db.equals("postgres")) {
            if (t.matches("INT2|SMALLSERIAL")) t = "SMALLINT";
            if (t.matches("INT4|SERIAL")) t = "INTEGER";
            if (t.matches("INT8|BIGSERIAL")) t = "BIGINT";
            if (t.equals("FLOAT4")) t = "REAL";
            if (t.equals("FLOAT8")) t = "DOUBLE PRECISION";
            if (t.equals("BPCHAR")) t = "CHAR";
            if (t.equals("NAME")) t = "TEXT";
        }
        boolean unsignedDecimal = t.matches("DECIMAL UNSIGNED|NUMERIC UNSIGNED");
        if (unsignedDecimal) t = t.replace(" UNSIGNED", "");
        int p = c.getLength(), s = c.getPrecision();
        if (t.matches("NUMBER|NUMERIC|DECIMAL|DEC")) {
            if (!"id_BigDecimal".equals(c.getType())) return db.equals("oracle") ? "NUMBER(19,0)" : t;
            if (p <= 0) {
                if (db.equals("mysql")) throw new SQLException("Unconstrained numeric requires explicit precision for MySQL", "22003");
                return t; // Oracle NUMBER and PostgreSQL unconstrained NUMERIC.
            }
            int max = db.equals("oracle") ? 38 : db.equals("mysql") ? 65 : 1000;
            if (p > max || (db.equals("mysql") && (s < 0 || s > 30 || s > p))) throw new SQLException("Numeric precision/scale cannot be represented in " + database, "22003");
            return t + "(" + p + "," + s + ")" + (unsignedDecimal ? " UNSIGNED" : "");
        }
        if (t.matches("CHAR|NCHAR|VARCHAR|VARCHAR2|NVARCHAR2|BINARY|VARBINARY")) {
            if (p <= 0) throw new SQLException("Missing dynamic column length: " + c.getName(), "42000");
            return t + "(" + p + ")";
        }
        if (db.equals("mysql") && t.equals("BIT")) return "BIT(" + Math.max(1, p) + ")";
        if (db.equals("mysql") && (t.equals("ENUM") || t.equals("SET"))) return "LONGTEXT";
        if (db.equals("oracle") && t.equals("RAW")) return p > 0 ? "RAW(" + p + ")" : "BLOB";
        if (db.equals("mysql") && t.equals("TIMESTAMP")) t = "DATETIME"; // no implicit timestamp initialization/range restriction
        if (t.matches("TIMESTAMP|DATETIME|TIME") && !db.equals("oracle")) return t + "(" + Math.max(0, Math.min(6, s)) + ")";
        if (db.equals("oracle") && t.equals("TIMESTAMP")) return "TIMESTAMP(" + Math.max(0, Math.min(9, s)) + ")";
        return t;
    }

    public static String createColumns(Dynamic dynamic, String database) throws SQLException {
        StringBuilder sql = new StringBuilder();
        java.util.Set<String> names = new java.util.HashSet<String>();
        for (DynamicMetadata c : dynamic.metadatas) {
            String name = quote(c.getName(), database);
            String identity = outputDialect(database).equals("mysql") ? c.getName().toLowerCase(Locale.ROOT) : c.getName();
            if (!names.add(identity)) throw new SQLException("Duplicate dynamic output column: " + c.getName(), "42701");
            if (sql.length() > 0) sql.append(", ");
            sql.append(name).append(' ').append(sqlType(dynamic, c, database));
            if (!c.isNullable()) sql.append(" NOT NULL");
        }
        return sql.toString();
    }

    public static int bind(Dynamic dynamic, PreparedStatement statement, int offset, String database) throws SQLException {
        String db = outputDialect(database);
        if (offset < 0) throw new SQLException("Negative dynamic parameter offset", "07009");
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            DynamicMetadata c = dynamic.getColumnMetadata(i); Object v = dynamic.getColumnValue(i); int p = offset + i + 1;
            if (v == null) {
                int jdbc = c.getDbTypeId();
                if (dynamic.getDbmsId() == null || !dynamic.getDbmsId().equalsIgnoreCase(database)) {
                    switch (c.getType()) {
                    case "id_String": jdbc = Types.VARCHAR; break;
                    case "id_BigDecimal": jdbc = Types.DECIMAL; break;
                    case "id_Short": case "id_Integer": case "id_Long": jdbc = Types.NUMERIC; break;
                    case "id_Float": case "id_Double": jdbc = Types.DOUBLE; break;
                    case "id_Boolean": jdbc = db.equals("oracle") ? Types.NUMERIC : Types.BOOLEAN; break;
                    case "id_byte[]": jdbc = db.equals("oracle") ? Types.BLOB : Types.VARBINARY; break;
                    case "id_Date": jdbc = Types.TIMESTAMP; break;
                    }
                }
                statement.setNull(p, jdbc); continue;
            }
            switch (c.getType()) {
            case "id_String":
                if (db.equals("postgres") && base(c.getDbType()).matches("UUID|JSONB?|XML")) statement.setObject(p, v, Types.OTHER);
                else if (db.equals("oracle") && base(c.getDbType()).matches("NVARCHAR2|NCHAR|NCLOB")) statement.setNString(p, (String) v);
                else statement.setString(p, (String) v);
                break;
            case "id_BigDecimal": statement.setBigDecimal(p, (BigDecimal) v); break;
            case "id_Short": statement.setShort(p, ((Number) v).shortValue()); break;
            case "id_Integer": statement.setInt(p, ((Number) v).intValue()); break;
            case "id_Long": statement.setLong(p, ((Number) v).longValue()); break;
            case "id_Boolean": if (db.equals("oracle")) statement.setInt(p, (Boolean) v ? 1 : 0); else statement.setBoolean(p, (Boolean) v); break;
            case "id_Float": statement.setFloat(p, ((Number) v).floatValue()); break;
            case "id_Double": statement.setDouble(p, ((Number) v).doubleValue()); break;
            case "id_byte[]": statement.setBytes(p, (byte[]) v); break;
            case "id_Date":
                if (v instanceof java.sql.Date && !db.equals("oracle")) statement.setDate(p, (java.sql.Date) v);
                else if (v instanceof java.sql.Time) statement.setTime(p, (java.sql.Time) v);
                else statement.setTimestamp(p, v instanceof Timestamp ? (Timestamp) v : new Timestamp(((java.util.Date) v).getTime()));
                break;
            case "id_Object": statement.setObject(p, v); break;
            default: throw new SQLException("Unsupported dynamic JDBC value type: " + c.getType(), "0A000");
            }
        }
        return dynamic.getColumnCount();
    }
}
