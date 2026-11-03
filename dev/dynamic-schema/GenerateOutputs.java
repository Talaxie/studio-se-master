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

/** Emits the ordinary Microsoft SQL Server output templates, without connecting to a server. */
public class GenerateOutputs {
    public static void main(String[] args) throws Exception {
        JavaTypesManager.addJavaType(new JavaType(routines.system.Dynamic.class, false, true));
        new MappingFileLoader().load(Path.of(args[1]).toFile());
        for (String variant : new String[] { "0", "1", "2", "empty", "reject", "zero", "create", "create_if", "large" }) {
            int fixed = "empty".equals(variant) || "reject".equals(variant) || "large".equals(variant) ? 2
                    : variant.matches("[012]") ? Integer.parseInt(variant) : 0;
            boolean reject = "reject".equals(variant);
            DataNode node = GenerateRows.node(fixed, "tMSSqlOutput");
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
                IConnection connection = (IConnection) Proxy.newProxyInstance(GenerateOutputs.class.getClassLoader(),
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
            for (String[] pair : new String[][] { { "TABLE", "context.TEST_TABLE" },
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
                parameters.add((IElementParameter) Proxy.newProxyInstance(GenerateOutputs.class.getClassLoader(),
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
                Class<?> emitter = Class.forName("DynamicTemplate" + (5 + part));
                String code = (String) emitter.getMethod("generate", Object.class)
                        .invoke(emitter.getConstructor().newInstance(), argument);
                Files.writeString(Path.of(args[0], "sql-output-" + part + "-" + variant + ".java.fragment"), code);
            }
        }
    }
}
