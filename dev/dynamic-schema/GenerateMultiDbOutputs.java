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

/** Emits native Oracle, MySQL and PostgreSQL output templates for real JDBC recipes. */
public class GenerateMultiDbOutputs {
    public static void main(String[] args) throws Exception {
        JavaTypesManager.addJavaType(new JavaType(routines.system.Dynamic.class, false, true));
        for (String[] provider : new String[][] {{"oracle", "tOracleOutput", "oracle_id", "44", "mapping_Oracle.xml"},
                {"mysql", "tMysqlOutput", "mysql_id", "47", "mapping_Mysql.xml"},
                {"postgres", "tPostgresqlOutput", "postgres_id", "50", "mapping_Postgres.xml"}}) {
        new MappingFileLoader().load(Path.of(args[1], provider[4]).toFile());
        for (String variant : new String[] { "0", "2", "empty", "reject", "create", "create_if", "extra", "zero" }) {
            int fixed = "empty".equals(variant) || "reject".equals(variant) || "large".equals(variant) ? 2
                    : variant.matches("[012]") ? Integer.parseInt(variant) : 0;
            boolean reject = "reject".equals(variant);
            DataNode node = GenerateRows.node(fixed, provider[1]);
            node.setOutgoingConnections(Collections.emptyList());
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
                IConnection connection = (IConnection) Proxy.newProxyInstance(GenerateMultiDbOutputs.class.getClassLoader(),
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
                    { "DB_VERSION", provider[0].equals("oracle") ? "ORACLE_18" : "MYSQL_8" },
                    { "SCHEMA_DB", "context.DB_SCHEMA" }, { "TABLESCHEMA", "context.DB_SCHEMA" },
                    { "TABLE", "context.TEST_TABLE" },
                    { "DATA_ACTION", "INSERT" }, { "TABLE_ACTION", reject ? "NONE"
                            : "create".equals(variant) ? "CREATE" : "create_if".equals(variant) ? "CREATE_IF_NOT_EXISTS"
                            : "DROP_IF_EXISTS_AND_CREATE" },
                    { "START_VALUE", "1" }, { "STEP", "1" }, { "COMMIT_EVERY", "large".equals(variant) ? "10000" : "3" },
                    { "USE_BATCH_SIZE", "true" }, { "BATCH_SIZE", "large".equals(variant) ? "10000" : "2" },
                    { "DIE_ON_ERROR", reject ? "false" : "true" },
                    { "HOST", "context.DB_HOST" }, { "PORT", "context.DB_PORT" },
                    { "DBNAME", "context.DB_NAME" }, { "DB_SCHEMA", "context.DB_SCHEMA" },
                    { "USER", "context.DB_USER" }, { "PASS", "context.DB_PASSWORD" },
                    { "PROPERTIES", "context.DB_PROPERTIES" } }) {
                parameters.removeIf(p -> pair[0].equals(p.getName()));
                parameters.add((IElementParameter) Proxy.newProxyInstance(GenerateMultiDbOutputs.class.getClassLoader(),
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
                Files.writeString(Path.of(args[0], "multi-" + provider[0] + "-" + part + "-" + variant + ".java.fragment"), code);
            }
        }
        }
    }
}
