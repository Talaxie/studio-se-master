import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.talend.core.model.metadata.MappingFileLoader;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.metadata.types.JavaType;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IElementParameter;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.designer.core.model.process.DataNode;

/** Emits native SQL Server, Oracle, MySQL and PostgreSQL output templates for real JDBC recipes. */
public class GenerateDmlOutputs {
    public static void main(String[] args) throws Exception {
        JavaTypesManager.addJavaType(new JavaType(routines.system.Dynamic.class, false, true));
        for (String[] provider : new String[][] {{"mssql", "tMSSqlOutput", "id_MSSQL", "5", "mapping_MSSQL.xml"}, {"oracle", "tOracleOutput", "oracle_id", "44", "mapping_Oracle.xml"},
                {"mysql", "tMysqlOutput", "mysql_id", "47", "mapping_Mysql.xml"},
                {"postgres", "tPostgresqlOutput", "postgres_id", "50", "mapping_Postgres.xml"}}) {
        new MappingFileLoader().load(Path.of(args[1], provider[4]).toFile());
        for (String action : new String[]{"UPDATE","DELETE","INSERT_OR_UPDATE","UPDATE_OR_INSERT","UPSERT","INSERT_ON_DUPLICATE_KEY_UPDATE","INSERT_IF_NOT_EXIST"}) {
        if (action.equals("UPSERT") && !provider[0].equals("postgres")) continue;
        if (action.equals("INSERT_ON_DUPLICATE_KEY_UPDATE") && !provider[0].equals("mysql")) continue;
        if (action.equals("INSERT_IF_NOT_EXIST") && !provider[0].equals("mssql")) continue;
        for (String variant : new String[] {"mixed","empty","reject","nullable","composite","keyonly","zero","sequential","nochange","create","create_empty"}) {
            if (variant.equals("nullable") && (action.equals("UPSERT") || action.equals("INSERT_ON_DUPLICATE_KEY_UPDATE"))) continue;
            if (variant.equals("nochange") && !provider[0].equals("mysql")) continue;
            if (variant.startsWith("create") && !java.util.Arrays.asList("UPDATE_OR_INSERT","UPSERT","INSERT_ON_DUPLICATE_KEY_UPDATE").contains(action)) continue;
            int fixed = 2;
            boolean reject = "reject".equals(variant);
            DataNode node = GenerateRows.node(fixed, provider[1]);
            node.setOutgoingConnections(Collections.emptyList());
            node.getMetadataList().get(0).getListColumns().get(0).setKey(true);
            if (variant.equals("composite") || variant.equals("keyonly")) node.getMetadataList().get(0).getListColumns().get(1).setKey(true);
            if (reject) {
                IMetadataTable metadata = new MetadataTable();
                metadata.setTableName("REJECT");
                metadata.setAttachedConnector("REJECT");
                metadata.getListColumns().addAll(node.getMetadataList().get(0).getListColumns());
                for (String name : new String[] { "errorCode", "errorMessage" }) {
                    MetadataColumn column = new MetadataColumn();
                    column.setLabel(name); column.setTalendType("id_String"); column.setNullable(true);
                    metadata.getListColumns().add(column);
                }
                node.setMetadataList(java.util.Arrays.asList(node.getMetadataList().get(0), metadata));
                IConnection connection = (IConnection) Proxy.newProxyInstance(GenerateDmlOutputs.class.getClassLoader(),
                        new Class<?>[] { IConnection.class }, (p, method, a) -> {
                            switch (method.getName()) {
                            case "getName": return "rejected";
                            case "getConnectorName": return "REJECT";
                            case "getLineStyle": return EConnectionType.REJECT;
                            case "getMetadataTable": return metadata;
                            case "getSource": case "getTarget": return node;
                            default: return null;
                            }
                        });
                node.setOutgoingConnections(Collections.singletonList(connection));
            }
            List<IElementParameter> parameters = new ArrayList<>(node.getElementParameters());
            parameters.removeIf(p -> java.util.Arrays.asList("MAPPING", "DB_SCHEMA", "HOST", "PORT", "DBNAME", "USER", "PASS", "PROPERTIES").contains(p.getName()));
            for (String[] pair : new String[][] { { "MAPPING", provider[2] }, { "CONNECTION_TYPE", "ORACLE_SERVICE_NAME" },
                    { "DB_VERSION", provider[0].equals("oracle") ? "ORACLE_18" : provider[0].equals("postgres") ? "V9_X" : "MYSQL_8" },
                    { "SCHEMA_DB", "context.DB_SCHEMA" }, { "TABLESCHEMA", "context.DB_SCHEMA" },
                    { "TABLE", "context.TEST_TABLE" },
                    { "DATA_ACTION", action }, { "TABLE_ACTION", variant.startsWith("create") ? "CREATE" : "NONE" },
                    { "START_VALUE", "1" }, { "STEP", "1" }, { "COMMIT_EVERY", "3" },
                    { "USE_BATCH_SIZE", variant.equals("sequential") ? "false" : "true" }, { "SUPPORT_NULL_WHERE", "true" }, { "BATCH_SIZE", "2" },
                    { "DIE_ON_ERROR", reject ? "false" : "true" },
                    { "HOST", "context.DB_HOST" }, { "PORT", "context.DB_PORT" },
                    { "DBNAME", "context.DB_NAME" }, { "DB_SCHEMA", "context.DB_SCHEMA" },
                    { "USER", "context.DB_USER" }, { "PASS", "context.DB_PASSWORD" },
                    { "PROPERTIES", "context.DB_PROPERTIES" }, { "DRIVER", "MSSQL_PROP" } }) {
                parameters.removeIf(p -> pair[0].equals(p.getName()));
                parameters.add((IElementParameter) Proxy.newProxyInstance(GenerateDmlOutputs.class.getClassLoader(),
                        new Class<?>[] { IElementParameter.class }, (p, method, a) -> {
                            switch (method.getName()) {
                            case "getName": return pair[0];
                            case "getVariableName": return "__" + pair[0] + "__";
                            case "getValue": return pair[1];
                            case "getFieldType": return EParameterFieldType.TEXT;
                            default: return null;
                            }
                        }));
            }
            node.setElementParameters(parameters);
            CodeGeneratorArgument argument = new CodeGeneratorArgument();
            argument.setNode(node);
            for (int part = 0; part <= 2; part++) {
                Class<?> emitter = Class.forName("DynamicTemplate" + (Integer.parseInt(provider[3]) + part));
                String code = (String) emitter.getMethod("generate", Object.class)
                        .invoke(emitter.getConstructor().newInstance(), argument);
                Files.writeString(Path.of(args[0], "dml-" + provider[0] + "-" + part + "-" + action + "-" + variant + ".java.fragment"), code);
            }
        }
        }
        }
    }
}
