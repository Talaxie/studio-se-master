package routines.system;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;

/** JDBC writer for explicitly named runtime keys. Does not mutate incoming rows or metadata. */
public final class DynamicDml implements AutoCloseable {
    private final Connection connection;
    private final String database, table, action;
    private final Dynamic fixed, dynamic;
    private final List<DynamicMetadata> columns = new ArrayList<DynamicMetadata>();
    private final List<Integer> keys = new ArrayList<Integer>(), payload = new ArrayList<Integer>();
    private final Map<String, PreparedStatement> statements = new LinkedHashMap<String, PreparedStatement>();
    private final boolean nullSafe, lower, upper, batch;
    private final int batchSize, timeout;
    private final String schemaName, tableName;
    private int pending, sinceCommit;
    private Object[] values;
    public int inputs, inserted, updated, deleted, rejected;

    public static DynamicMetadata column(String name, String type, String nativeType, int length, int scale,
            boolean nullable, boolean key) {
        DynamicMetadata c = new DynamicMetadata(); c.setName(name); c.setDbName(name); c.setType(type);
        c.setDbType(nativeType); c.setLength(length); c.setPrecision(scale); c.setNullable(nullable); c.setKey(key);
        return c;
    }

    public DynamicDml(Connection connection, String database, String schema, String tableName, String action,
            DynamicMetadata[] fixedColumns, Dynamic source, String[] namedKeys, boolean nullSafe,
            boolean lower, boolean upper, boolean batch, int batchSize, int timeout) throws SQLException {
        this.connection = connection; this.database = database; this.action = action;
        this.nullSafe = nullSafe; this.lower = lower; this.upper = upper;
        this.batch = batch && (action.equals("UPDATE") || action.equals("DELETE") || action.equals("INSERT"));
        if (this.batch && batchSize < 1) throw error("Batch size must be positive");
        this.batchSize = batchSize; this.timeout = timeout;
        this.schemaName = schema == null || schema.isEmpty() ? null : tableIdentifier(schema, false);
        this.tableName = tableIdentifier(tableName, true);
        this.table = (schemaName == null ? "" : quote(schemaName) + ".") + quote(this.tableName);
        if (!Arrays.asList("INSERT", "UPDATE", "DELETE", "INSERT_OR_UPDATE", "UPDATE_OR_INSERT", "UPSERT",
                "INSERT_ON_DUPLICATE_KEY_UPDATE", "INSERT_IF_NOT_EXIST").contains(action)) throw error("Unsupported dynamic action: " + action);
        if (action.equals("UPSERT") && !database.equals("postgres_id")) throw error("Native UPSERT requires PostgreSQL");
        if (action.equals("INSERT_ON_DUPLICATE_KEY_UPDATE") && !database.equals("mysql_id")) throw error("Native duplicate-key action requires MySQL");
        if (source == null) throw error("Dynamic key selection requires a non-null Dynamic container");
        this.fixed = new Dynamic(); fixed.setDbmsId(database);
        this.dynamic = source.copyMetadata();
        Set<String> all = new HashSet<String>();
        for (DynamicMetadata c : fixedColumns) {
            DynamicMetadata copy = c.clone(); copy.setName(normalize(copy.getName()));
            fixed.metadatas.add(copy); add(copy, all);
        }
        Set<String> selected = new HashSet<String>();
        if (namedKeys == null || namedKeys.length == 0) throw error("Select at least one dynamic key name");
        for (String name : namedKeys) {
            if (name == null || name.trim().isEmpty() || name.indexOf('\0') >= 0) throw error("Empty or invalid dynamic key name");
            if (!selected.add(name)) throw error("Duplicate dynamic key name: " + name);
            int matches = 0;
            for (DynamicMetadata c : source.metadatas) if (name.equals(c.getName())) matches++;
            if (matches != 1) throw error("Dynamic key must match exactly one physical column: " + name + " (matches: " + matches + ")");
        }
        for (int i = 0; i < dynamic.getColumnCount(); i++) {
            DynamicMetadata c = dynamic.getColumnMetadata(i);
            c.setKey(selected.contains(source.getColumnMetadata(i).getName())); c.setName(normalize(c.getName())); add(c, all);
        }
        for (int i = 0; i < columns.size(); i++) (columns.get(i).isKey() ? keys : payload).add(i);
        if (keys.isEmpty()) throw error("UPDATE/DELETE/upsert requires a correspondence key");
    }

    private SQLException error(String message) { return new SQLException(message, "42000"); }
    private String normalize(String name) {
        return name == null ? null : lower ? name.toLowerCase(Locale.ROOT) : upper ? name.toUpperCase(Locale.ROOT) : name;
    }
    private String tableIdentifier(String value, boolean convert) {
        if (value == null) return null;
        if (database.equals("oracle_id")) {
            boolean delimited = value.length() >= 2 && value.startsWith("\"") && value.endsWith("\"");
            value = delimited ? value.substring(1, value.length()-1).replace("\"\"", "\"") : value.toUpperCase(Locale.ROOT);
        }
        return convert ? normalize(value) : value;
    }
    private String identity(String name) {
        return database.equals("id_MSSQL") || database.equals("mysql_id") ? name.toLowerCase(Locale.ROOT) : name;
    }
    private void add(DynamicMetadata c, Set<String> names) throws SQLException {
        quote(c.getName());
        if (!names.add(identity(c.getName()))) throw error("Ambiguous destination column name: " + c.getName());
        columns.add(c);
    }
    private String quote(String name) throws SQLException {
        if (name == null || name.isEmpty() || name.indexOf('\0') >= 0) throw error("Invalid SQL identifier");
        if (database.equals("id_MSSQL")) return "[" + name.replace("]", "]]") + "]";
        return DynamicJdbc.quote(name, database);
    }
    private String name(int index) throws SQLException { return quote(columns.get(index).getName()); }
    private String names(List<Integer> indices) throws SQLException {
        StringBuilder s = new StringBuilder();
        for (Integer i : indices) { if (s.length() > 0) s.append(", "); s.append(name(i)); }
        return s.toString();
    }
    private List<Integer> all() {
        List<Integer> result = new ArrayList<Integer>(); for (int i = 0; i < columns.size(); i++) result.add(i); return result;
    }
    private String where() throws SQLException {
        StringBuilder s = new StringBuilder();
        for (Integer i : keys) {
            if (s.length() > 0) s.append(" AND ");
            String n = name(i);
            s.append(nullSafe ? "(" + n + " = ? OR (" + n + " IS NULL AND ? = 1))" : n + " = ?");
        }
        return s.toString();
    }
    private String assignments(boolean excluded) throws SQLException {
        if (payload.isEmpty()) return name(keys.get(0)) + " = " + name(keys.get(0));
        StringBuilder s = new StringBuilder();
        for (Integer i : payload) {
            if (s.length() > 0) s.append(", ");
            s.append(name(i)).append(" = ").append(excluded ? "EXCLUDED." + name(i) : "?");
        }
        return s.toString();
    }
    private String sql(String operation) throws SQLException {
        if (operation.equals("EXISTS")) return "SELECT 1 FROM " + table + " WHERE " + where();
        if (operation.equals("DELETE")) return "DELETE FROM " + table + " WHERE " + where();
        if (operation.equals("UPDATE")) return "UPDATE " + table + " SET " + assignments(false) + " WHERE " + where();
        StringBuilder placeholders = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) { if (i > 0) placeholders.append(", "); placeholders.append('?'); }
        String insert = "INSERT INTO " + table + " (" + names(all()) + ") VALUES (" + placeholders + ")";
        if (operation.equals("UPSERT")) return insert + " ON CONFLICT (" + names(keys) + ") DO "
                + (payload.isEmpty() ? "NOTHING" : "UPDATE SET " + assignments(true));
        if (operation.equals("INSERT_ON_DUPLICATE_KEY_UPDATE")) return insert + " ON DUPLICATE KEY UPDATE " + assignments(false);
        return insert;
    }
    private PreparedStatement statement(String operation) throws SQLException {
        PreparedStatement ps = statements.get(operation);
        if (ps == null) {
            ps = connection.prepareStatement(sql(operation)); if (timeout > 0) ps.setQueryTimeout(timeout);
            statements.put(operation, ps);
        }
        return ps;
    }
    private int bind(PreparedStatement ps, List<Integer> indices, int position, boolean predicate) throws SQLException {
        for (Integer index : indices) {
            DynamicMetadata c = columns.get(index); Object value = values[index];
            if (index >= fixed.getColumnCount()) {
                Dynamic one = new Dynamic(); one.setDbmsId(dynamic.getDbmsId()); one.metadatas.add(c); one.addColumnValue(value);
                DynamicUtils.writeColumnsToDatabse(one, ps, position++ - 1, database);
            } else {
                bindStatic(ps, position++, c, value);
            }
            if (predicate && nullSafe) ps.setInt(position++, value == null ? 1 : 0);
        }
        return position;
    }
    private void bindStatic(PreparedStatement ps, int p, DynamicMetadata c, Object value) throws SQLException {
        if (value == null) {
            String t = c.getType();
            int jdbc = t.equals("id_String") || t.equals("id_Character") ? Types.VARCHAR
                    : t.equals("id_Date") ? Types.TIMESTAMP : t.equals("id_byte[]") ? Types.VARBINARY
                    : t.equals("id_Boolean") ? (database.equals("oracle_id") ? Types.NUMERIC : Types.BOOLEAN)
                    : t.equals("id_Object") ? Types.OTHER : Types.NUMERIC;
            ps.setNull(p, jdbc); return;
        }
        switch (c.getType()) {
        case "id_String":
            String nativeType = c.getDbType() == null ? "" : c.getDbType().toUpperCase(Locale.ROOT);
            if ((database.equals("id_MSSQL") || database.equals("oracle_id")) && nativeType.startsWith("N")) ps.setNString(p, (String)value);
            else if (database.equals("postgres_id") && nativeType.matches("UUID|JSONB?|XML")) ps.setObject(p, value, Types.OTHER);
            else ps.setString(p, (String)value); break;
        case "id_Character": ps.setString(p, String.valueOf(value)); break;
        case "id_BigDecimal": ps.setBigDecimal(p, (BigDecimal)value); break;
        case "id_Byte": case "id_Short": case "id_Integer": ps.setInt(p, ((Number)value).intValue()); break;
        case "id_Long": ps.setLong(p, ((Number)value).longValue()); break;
        case "id_Float": ps.setFloat(p, ((Number)value).floatValue()); break;
        case "id_Double": ps.setDouble(p, ((Number)value).doubleValue()); break;
        case "id_Boolean": if(database.equals("oracle_id")) ps.setInt(p,(Boolean)value?1:0); else ps.setBoolean(p,(Boolean)value); break;
        case "id_byte[]": ps.setBytes(p, (byte[])value); break;
        case "id_Date":
            if (value instanceof java.sql.Date && !database.equals("oracle_id")) ps.setDate(p,(java.sql.Date)value);
            else if (value instanceof java.sql.Time) ps.setTime(p,(java.sql.Time)value);
            else ps.setTimestamp(p, value instanceof Timestamp ? (Timestamp)value : new Timestamp(((java.util.Date)value).getTime()));
            break;
        default: ps.setObject(p,value);
        }
    }
    private PreparedStatement bind(String operation) throws SQLException {
        PreparedStatement ps = statement(operation); ps.clearParameters(); int position = 1;
        if (operation.equals("UPDATE")) position = bind(ps, payload, position, false);
        if (operation.equals("UPDATE") || operation.equals("DELETE") || operation.equals("EXISTS")) bind(ps, keys, position, true);
        else { position = bind(ps, all(), position, false); if (operation.equals("INSERT_ON_DUPLICATE_KEY_UPDATE")) bind(ps, payload, position, false); }
        return ps;
    }
    private boolean exists() throws SQLException {
        try (ResultSet result = bind("EXISTS").executeQuery()) { return result.next(); }
    }
    private int execute(String operation) throws SQLException { return bind(operation).executeUpdate(); }
    private boolean duplicate(SQLException e) {
        return database.equals("postgres_id") ? "23505".equals(e.getSQLState()) : database.equals("oracle_id") ? e.getErrorCode() == 1
                : database.equals("mysql_id") ? e.getErrorCode() == 1062 : e.getErrorCode() == 2601 || e.getErrorCode() == 2627;
    }
    private void insertOrRetry() throws SQLException {
        Savepoint point = connection.getAutoCommit() ? null : connection.setSavepoint();
        try { inserted += execute("INSERT"); }
        catch (SQLException error) {
            if (point != null) connection.rollback(point);
            if (!duplicate(error) || !exists()) throw error;
            updated += execute("UPDATE");
        } finally { release(point); }
    }
    private void release(Savepoint point) throws SQLException {
        // SQL Server has no RELEASE SAVEPOINT; rollback-to remains supported.
        if (point != null && !database.equals("id_MSSQL") && !database.equals("oracle_id")) connection.releaseSavepoint(point);
    }
    private void row(Object[] fixedValues, Dynamic row) throws SQLException {
        if (row == null || fixedValues.length != fixed.getColumnCount() || row.getColumnCount() != dynamic.getColumnCount())
            throw error("Dynamic output schema changed during execution");
        for (int i = 0; i < row.getColumnCount(); i++) {
            DynamicMetadata actual = row.getColumnMetadata(i).clone();
            actual.setName(normalize(actual.getName())); actual.setKey(dynamic.getColumnMetadata(i).isKey());
            if (!actual.equals(dynamic.getColumnMetadata(i))) throw error("Dynamic output schema changed at column " + i);
        }
        values = new Object[columns.size()];
        for (int i = 0; i < fixedValues.length; i++) values[i] = Dynamic.copyValue(fixedValues[i]);
        for (int i = 0; i < row.getColumnCount(); i++) values[fixedValues.length + i] = Dynamic.copyValue(row.getColumnValue(i));
    }
    public void write(Object[] fixedValues, Dynamic row) throws SQLException {
        inputs++; sinceCommit++; row(fixedValues,row);
        if (batch) {
            bind(action).addBatch(); pending++; if (pending >= batchSize) flush(); return;
        }
        Savepoint point = connection.getAutoCommit() ? null : connection.setSavepoint();
        int beforeInserted = inserted, beforeUpdated = updated, beforeDeleted = deleted;
        try {
            if (action.equals("INSERT")) inserted += execute("INSERT");
            else if (action.equals("UPDATE")) updated += execute("UPDATE");
            else if (action.equals("DELETE")) deleted += execute("DELETE");
            else if (action.equals("INSERT_IF_NOT_EXIST")) { if (!exists()) inserted += execute("INSERT"); }
            else if (action.equals("INSERT_OR_UPDATE")) { if (exists()) updated += execute("UPDATE"); else insertOrRetry(); }
            else if (action.equals("UPDATE_OR_INSERT")) {
                int count = execute("UPDATE"); updated += count;
                if (count == 0 && !exists()) insertOrRetry();
            } else {
                boolean existed = exists(); int count = execute(action);
                if (count > 0) { if (existed) updated += action.equals("UPSERT") ? count : 1; else inserted++; }
            }
            release(point);
        } catch (SQLException error) {
            inserted = beforeInserted; updated = beforeUpdated; deleted = beforeDeleted;
            if (point != null) try { connection.rollback(point); release(point); } catch (SQLException rollback) { error.addSuppressed(rollback); }
            throw error;
        }
    }
    public void flush() throws SQLException {
        if (pending == 0) return;
        try {
            int sum = 0;
            for (int count : statement(action).executeBatch()) {
                if (count == Statement.EXECUTE_FAILED) throw new BatchUpdateException("Dynamic DML batch failed", new int[0]);
                sum += count == Statement.SUCCESS_NO_INFO ? 1 : count;
            }
            if (action.equals("UPDATE")) updated += sum; else if (action.equals("DELETE")) deleted += sum; else inserted += sum;
            pending = 0;
        } catch (SQLException error) { abort(error); throw error; }
    }
    public void commitEvery(int count) throws SQLException {
        if (count > 0 && sinceCommit >= count) {
            flush(); if (!connection.getAutoCommit()) connection.commit(); sinceCommit = 0;
        }
    }
    public void abort(SQLException error) {
        try { if (!connection.getAutoCommit()) connection.rollback(); } catch (SQLException rollback) { error.addSuppressed(rollback); }
        try { close(); } catch (SQLException closing) { error.addSuppressed(closing); }
    }
    public void finish() throws SQLException { flush(); close(); }
    @Override public void close() throws SQLException {
        SQLException failure = null;
        for (PreparedStatement statement : statements.values()) try { statement.close(); }
        catch (SQLException e) { if (failure == null) failure = e; else failure.addSuppressed(e); }
        statements.clear(); if (failure != null) throw failure;
    }

    private String fixedDeclarations(Dynamic declared) throws SQLException {
        StringBuilder result = new StringBuilder();
        for (DynamicMetadata c : declared.metadatas) {
            String type = null;
            if (database.equals("id_MSSQL")) {
                String nativeType = c.getDbType() == null ? "" : c.getDbType().toUpperCase(Locale.ROOT);
                if ("id_Date".equals(c.getType())) {
                    if (nativeType.matches("DATE|DATETIME|SMALLDATETIME")) type = nativeType;
                    else if (nativeType.matches("DATETIME2|DATETIMEOFFSET|TIME")) type = nativeType + "(" + Math.max(0,Math.min(7,c.getPrecision())) + ")";
                } else if ("id_byte[]".equals(c.getType())) {
                    if (nativeType.equals("IMAGE")) type = nativeType;
                    else if (nativeType.matches("BINARY|VARBINARY")) type = nativeType + "(" + (c.getLength()>0 && c.getLength()<=8000 ? c.getLength() : nativeType.equals("VARBINARY") ? "MAX" : "1") + ")";
                }
            }
            if (result.length() > 0) result.append(", ");
            if (type != null) result.append(quote(c.getName())).append(' ').append(type).append(c.isNullable()?" NULL":" NOT NULL");
            else {
                Dynamic one = new Dynamic(); one.setDbmsId(database); one.metadatas.add(c);
                result.append(DynamicUtils.getCreateTableSQL(one,database));
            }
        }
        return result.toString();
    }

    /** Validate all column declarations before applying any destructive table action. */
    public void tableAction(String action) throws SQLException {
        if (action.equals("NONE")) return;
        if (!Arrays.asList("CREATE","DROP_CREATE","CREATE_IF_NOT_EXISTS","DROP_IF_EXISTS_AND_CREATE").contains(action)) throw error("Unsupported dynamic table action: " + action);
        Dynamic declaredFixed = fixed.copyMetadata(), declaredDynamic = dynamic.copyMetadata();
        for (DynamicMetadata c : declaredFixed.metadatas) if (c.isKey()) c.setNullable(false);
        for (DynamicMetadata c : declaredDynamic.metadatas) if (c.isKey()) c.setNullable(false);
        String a = fixedDeclarations(declaredFixed), b = DynamicUtils.getCreateTableSQL(declaredDynamic,database);
        String declarations = a.isEmpty() ? b : b.isEmpty() ? a : a + ", " + b;
        String create = "CREATE TABLE " + table + " (" + declarations + ", PRIMARY KEY (" + names(keys) + "))";
        boolean present = false;
        if (!action.equals("CREATE") && !action.equals("DROP_CREATE")) {
            String schema = schemaName == null ? connection.getSchema() : schemaName;
            String escape = connection.getMetaData().getSearchStringEscape();
            String pattern = escape == null || escape.isEmpty() ? tableName : tableName.replace(escape,escape+escape).replace("_",escape+"_").replace("%",escape+"%");
            try (ResultSet tables = connection.getMetaData().getTables(connection.getCatalog(),schema,pattern,new String[]{"TABLE"})) {
                while (tables.next()) if (identity(tableName).equals(identity(tables.getString("TABLE_NAME")))) present = true;
            }
        }
        if (action.equals("CREATE_IF_NOT_EXISTS") && present) return;
        try (Statement ddl = connection.createStatement()) {
            if (timeout > 0) ddl.setQueryTimeout(timeout);
            if (action.equals("DROP_CREATE") || action.equals("DROP_IF_EXISTS_AND_CREATE") && present) ddl.execute("DROP TABLE " + table);
            ddl.execute(create);
        }
    }
}
