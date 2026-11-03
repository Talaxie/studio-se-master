package org.talend.core.model.metadata;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;

/** Capabilities of the Standard dynamic-schema implementation shipped with Studio. */
public final class DynamicSchemaSupport {

    public static final String TYPE = "id_Dynamic";

    private DynamicSchemaSupport() {
    }

    public static boolean supports(INode node) {
        if (node == null || node.getComponent() == null) {
            return false;
        }
        if (node.getProcess() != null) {
            String framework = node.getProcess().getComponentsType();
            if (framework != null && !framework.isEmpty() && !"DI".equals(framework)) {
                return false;
            }
        }
        String component = node.getComponent().getName();
        if ("tMSSqlInput".equals(component)) {
            return "MSSQL_PROP".equals(parameter(node, "DRIVER"))
                    && !"true".equals(parameter(node, "USE_EXISTING_CONNECTION"));
        }
        if ("tOracleInput".equals(component) || "tMysqlInput".equals(component) || "tPostgresqlInput".equals(component)) {
            return !"true".equals(parameter(node, "USE_EXISTING_CONNECTION"));
        }
        if ("tOracleOutput".equals(component) || "tMysqlOutput".equals(component) || "tPostgresqlOutput".equals(component)) {
            String action = parameter(node, "TABLE_ACTION");
            return supportsDataAction(component, parameter(node, "DATA_ACTION"))
                    && ("NONE".equals(action) || "CREATE".equals(action) || "DROP_CREATE".equals(action)
                        || "CREATE_IF_NOT_EXISTS".equals(action) || "DROP_IF_EXISTS_AND_CREATE".equals(action))
                    && !"true".equals(parameter(node, "USE_EXISTING_CONNECTION"))
                    && !"true".equals(parameter(node, "PARALLELIZE"))
                    && !"true".equals(parameter(node, "USE_FIELD_OPTIONS"))
                    && !"true".equals(parameter(node, "ENABLE_DEBUG_MODE"))
                    && !"true".equals(parameter(node, "EXTENDINSERT"))
                    && !"true".equals(parameter(node, "ON_DUPLICATE_KEY_UPDATE"))
                    && !"true".equals(parameter(node, "USE_SPATIAL_OPTIONS"))
                    && !hasRows(node, "ADD_COLS");
        }
        if ("tMSSqlOutput".equals(component)) {
            String action = parameter(node, "TABLE_ACTION");
            return "MSSQL_PROP".equals(parameter(node, "DRIVER"))
                    && supportsDataAction(component, parameter(node, "DATA_ACTION"))
                    && ("NONE".equals(action) || "CREATE".equals(action) || "DROP_CREATE".equals(action)
                            || "CREATE_IF_NOT_EXISTS".equals(action) || "DROP_IF_EXISTS_AND_CREATE".equals(action))
                    && !"true".equals(parameter(node, "USE_EXISTING_CONNECTION"))
                    && !"true".equals(parameter(node, "PARALLELIZE"))
                    && !"true".equals(parameter(node, "USE_FIELD_OPTIONS"))
                    && !"true".equals(parameter(node, "SPECIFY_IDENTITY_FIELD"))
                    && !"true".equals(parameter(node, "IDENTITY_INSERT"))
                    && !"true".equals(parameter(node, "ENABLE_DEBUG_MODE"))
                    && !hasRows(node, "ADD_COLS");
        }
        if ("tFileOutputDelimited".equals(component)) {
            return !"true".equals(parameter(node, "ROW_MODE"))
                    && !"true".equals(parameter(node, "PARALLELIZE"));
        }
        if ("tFileInputDelimited".equals(component)) {
            return !"true".equals(parameter(node, "USE_EXISTING_DYNAMIC"));
        }
        if ("tRunJob".equals(component)) {
            // The native child-result contract is available for referenced jobs in this JVM.
            return !"true".equals(parameter(node, "USE_DYNAMIC_JOB"))
                    && !"true".equals(parameter(node, "USE_INDEPENDENT_PROCESS"));
        }
        return "tExtractDynamicFields".equals(component) || "tWriteDynamicFields".equals(component)
                || "tBufferOutput".equals(component)
                || "tHashInput".equals(component) || "tHashOutput".equals(component)
                || "tMap".equals(component) || "tLogRow".equals(component)
                || "tReplicate".equals(component) || "tFilterRow".equals(component)
                || "tFilterColumns".equals(component);
    }

    private static boolean supportsDataAction(String component, String action) {
        return "INSERT".equals(action) || "UPDATE".equals(action) || "DELETE".equals(action)
                || "INSERT_OR_UPDATE".equals(action) || "UPDATE_OR_INSERT".equals(action)
                || ("tPostgresqlOutput".equals(component) && "UPSERT".equals(action))
                || ("tMysqlOutput".equals(component) && "INSERT_ON_DUPLICATE_KEY_UPDATE".equals(action))
                || ("tMSSqlOutput".equals(component) && "INSERT_IF_NOT_EXIST".equals(action));
    }

    public static boolean hasDynamicColumns(INode node) {
        if (node != null && node.getMetadataList() != null) {
            for (IMetadataTable table : node.getMetadataList()) {
                for (IMetadataColumn column : table.getListColumns()) {
                    if (TYPE.equals(column.getTalendType())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /** Checks the name-based projection and unchanged row contracts before code generation. */
    public static List<String> validateFlow(INode node) {
        List<String> problems = new ArrayList<String>();
        if (node == null || node.getComponent() == null) {
            return problems;
        }
        String component = node.getComponent().getName();
        if ("tMSSqlOutput".equals(component) || "tOracleOutput".equals(component)
                || "tMysqlOutput".equals(component) || "tPostgresqlOutput".equals(component)) {
            boolean named = "true".equals(parameter(node, "USE_DYNAMIC_KEYS"));
            if (named && !hasDynamicColumns(node)) problems.add("Named dynamic keys require a Dynamic schema.");
            if (hasDynamicColumns(node) && (named || !"INSERT".equals(parameter(node, "DATA_ACTION")))) {
                boolean key = false;
                for (IMetadataColumn column : node.getMetadataList().get(0).getListColumns()) {
                    if (column.isKey() && !TYPE.equals(column.getTalendType())) key = true;
                    if (column.isKey() && TYPE.equals(column.getTalendType()))
                        problems.add("Select physical dynamic key names, not the whole Dynamic container.");
                }
                if (named) {
                    IElementParameter selected = node.getElementParameter("DYNAMIC_KEY_COLUMNS");
                    Object rows = selected == null ? null : selected.getValue();
                    java.util.Set<String> names = new java.util.HashSet<String>();
                    if (rows instanceof List) for (Object row : (List<?>) rows) {
                        Object name = row instanceof Map ? ((Map<?,?>) row).get("NAME") : null;
                        if (!(name instanceof String) || ((String) name).trim().isEmpty() || ((String) name).indexOf('\0') >= 0)
                            problems.add("Enter a non-empty physical dynamic key name.");
                        else if (!names.add((String) name)) problems.add("Duplicate dynamic key name: " + name);
                    }
                    if (names.isEmpty()) problems.add("Select at least one physical dynamic key name.");
                } else if (!key) problems.add("Define a static correspondence key or enable dynamic keys by name.");
            }
            return problems;
        }
        if (!"tReplicate".equals(component) && !"tFilterRow".equals(component)
                && !"tFilterColumns".equals(component) && !"tExtractDynamicFields".equals(component)
                && !"tWriteDynamicFields".equals(component)) {
            return problems;
        }
        IMetadataTable input = null;
        if (node.getIncomingConnections() != null) {
            for (IConnection connection : node.getIncomingConnections()) {
                if (connection.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
                    input = connection.getMetadataTable();
                    break;
                }
            }
        }
        if (input == null) {
            return problems;
        }
        if ("tExtractDynamicFields".equals(component) || "tWriteDynamicFields".equals(component)) {
            if ("tExtractDynamicFields".equals(component) && !input.isDynamicSchema()) {
                problems.add("tExtractDynamicFields requires a Dynamic input column.");
            }
            if ("tWriteDynamicFields".equals(component) && node.getMetadataList() != null) {
                for (IMetadataTable output : node.getMetadataList()) {
                    if (!output.isDynamicSchema()) problems.add("tWriteDynamicFields requires a Dynamic output column.");
                    for (IMetadataColumn column : output.getListColumns()) {
                        if (TYPE.equals(column.getTalendType())) continue;
                        IMetadataColumn source = input.getColumn(column.getLabel());
                        if (source == null || !column.getTalendType().equals(source.getTalendType())) {
                            problems.add("tWriteDynamicFields: static output must match an input field: " + column.getLabel());
                        }
                    }
                }
            }
            return problems;
        }
        if (!input.isDynamicSchema() && !hasDynamicColumns(node)) return problems;
        if ("tFilterRow".equals(component)) {
            IElementParameter conditions = node.getElementParameter("CONDITIONS");
            Object value = conditions == null ? null : conditions.getValue();
            if (value instanceof List) {
                for (Object condition : (List<?>) value) {
                    if (condition instanceof Map) {
                        Object label = ((Map<?, ?>) condition).get("INPUT_COLUMN");
                        IMetadataColumn column = input.getColumn(String.valueOf(label));
                        if (column != null && TYPE.equals(column.getTalendType())) {
                            problems.add("tFilterRow: select a static column in Conditions; the Dynamic column is a container.");
                        }
                    }
                }
            }
        }
        if (node.getMetadataList() == null) {
            return problems;
        }
        for (IMetadataTable output : node.getMetadataList()) {
            for (IMetadataColumn column : output.getListColumns()) {
                IMetadataColumn source = input.getColumn(column.getLabel());
                if ((TYPE.equals(column.getTalendType()) || source != null && TYPE.equals(source.getTalendType()))
                        && (source == null || !column.getTalendType().equals(source.getTalendType()))) {
                    problems.add(component + ": the Dynamic column must keep its input name and type: " + column.getLabel());
                }
            }
            if (!"tFilterColumns".equals(component)) {
                List<IMetadataColumn> columns = output.getListColumns();
                int size = columns.size();
                if ("tFilterRow".equals(component) && "REJECT".equals(output.getAttachedConnector())
                        && size > 0 && "errorMessage".equals(columns.get(size - 1).getLabel())
                        && "id_String".equals(columns.get(size - 1).getTalendType())) {
                    size--;
                }
                boolean same = size == input.getListColumns().size();
                for (int i = 0; same && i < size; i++) {
                    IMetadataColumn source = input.getListColumns().get(i);
                    IMetadataColumn target = columns.get(i);
                    same = source.getLabel().equals(target.getLabel()) && source.getTalendType().equals(target.getTalendType());
                }
                if (!same) {
                    problems.add(component + ": synchronize the output schema with the input schema.");
                }
            }
        }
        return problems;
    }

    /** A schema may have a static prefix and exactly one dynamic suffix. */
    public static boolean isDynamicLast(List<IMetadataColumn> columns) {
        for (int i = 0; i < columns.size() - 1; i++) {
            if (TYPE.equals(columns.get(i).getTalendType())) {
                return false;
            }
        }
        return true;
    }

    /** Technical reject schemas append generated diagnostics to the source row. */
    public static boolean isValidDynamicSchema(INode node, IMetadataTable table) {
        // Technical reject rows can be displayed directly. Their diagnostics are
        // generated static fields, not part of the unknown source suffix.
        if (node != null && node.getComponent() != null
                && "tLogRow".equals(node.getComponent().getName())) {
            List<IMetadataColumn> columns = table.getListColumns();
            int count = columns.size();
            if (count >= 2 && "errorMessage".equals(columns.get(count - 1).getLabel())
                    && "id_String".equals(columns.get(count - 1).getTalendType())) {
                int diagnostics = count >= 3 && "errorCode".equals(columns.get(count - 2).getLabel())
                        && "id_String".equals(columns.get(count - 2).getTalendType()) ? 2 : 1;
                return isDynamicLast(columns.subList(0, count - diagnostics));
            }
        }
        if (node != null && node.getComponent() != null
                && "tFilterRow".equals(node.getComponent().getName())
                && "REJECT".equals(table.getAttachedConnector())) {
            List<IMetadataColumn> columns = table.getListColumns();
            int count = columns.size();
            return count >= 2 && "errorMessage".equals(columns.get(count - 1).getLabel())
                    && "id_String".equals(columns.get(count - 1).getTalendType())
                    && isDynamicLast(columns.subList(0, count - 1));
        }
        if (node != null && node.getComponent() != null
                && ("tMSSqlOutput".equals(node.getComponent().getName())
                        || "tOracleOutput".equals(node.getComponent().getName())
                        || "tMysqlOutput".equals(node.getComponent().getName())
                        || "tPostgresqlOutput".equals(node.getComponent().getName())
                        || "tFileInputDelimited".equals(node.getComponent().getName()))
                && "REJECT".equals(table.getAttachedConnector())) {
            List<IMetadataColumn> columns = table.getListColumns();
            int count = columns.size();
            return count >= 3 && "errorCode".equals(columns.get(count - 2).getLabel())
                    && "id_String".equals(columns.get(count - 2).getTalendType())
                    && "errorMessage".equals(columns.get(count - 1).getLabel())
                    && "id_String".equals(columns.get(count - 1).getTalendType())
                    && isDynamicLast(columns.subList(0, count - 2));
        }
        return isDynamicLast(table.getListColumns());
    }

    private static String parameter(INode node, String name) {
        IElementParameter parameter = node.getElementParameter(name);
        return parameter == null ? null : String.valueOf(parameter.getValue());
    }

    private static boolean hasRows(INode node, String name) {
        IElementParameter parameter = node.getElementParameter(name);
        Object value = parameter == null ? null : parameter.getValue();
        return value instanceof List && !((List<?>) value).isEmpty();
    }
}
