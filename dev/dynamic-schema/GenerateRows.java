import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.metadata.types.JavaType;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.IProcess;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.designer.core.model.process.DataNode;

/** Emits real component code with lightweight model objects, without a client connection. */
public class GenerateRows {
    public static void main(String[] args) throws Exception {
        JavaTypesManager.addJavaType(new JavaType(routines.system.Dynamic.class, false, true));
        for (int fixed = 0; fixed <= 2; fixed++) {
            DataNode node = node(fixed, "tFileOutputDelimited");
            CodeGeneratorArgument argument = new CodeGeneratorArgument();
            argument.setNode(node);
            String code = (String) Class.forName("DynamicTemplate3").getMethod("generate", Object.class)
                    .invoke(Class.forName("DynamicTemplate3").getConstructor().newInstance(), argument);
            Files.writeString(Path.of(args[0], "output-main-" + fixed + ".java.fragment"), code);
            argument.setNode(node(fixed, "tMSSqlInput"));
            for (int part = 0; part <= 1; part++) {
                Class<?> emitter = Class.forName("DynamicTemplate" + part);
                code = (String) emitter.getMethod("generate", Object.class)
                        .invoke(emitter.getConstructor().newInstance(), argument);
                Files.writeString(Path.of(args[0], "input-" + part + "-" + fixed + ".java.fragment"), code);
            }
        }
        DataNode output = node(2, "tFileOutputDelimited");
        output.getMetadataList().get(0).getListColumns().get(2).setTalendType("id_String");
        CodeGeneratorArgument argument = new CodeGeneratorArgument();
        argument.setNode(output);
        Class<?> emitter = Class.forName("DynamicTemplate3");
        Files.writeString(Path.of(args[0], "output-main-static.java.fragment"),
                (String) emitter.getMethod("generate", Object.class).invoke(emitter.getConstructor().newInstance(), argument));
        DataNode input = node(2, "tMSSqlInput");
        input.getMetadataList().get(0).getListColumns().get(2).setTalendType("id_String");
        argument.setNode(input);
        for (int part = 0; part <= 1; part++) {
            emitter = Class.forName("DynamicTemplate" + part);
            String code = (String) emitter.getMethod("generate", Object.class)
                    .invoke(emitter.getConstructor().newInstance(), argument);
            if (code.contains("createMssqlDynamic")) {
                throw new AssertionError("Static SQL input must retain its original path");
            }
            Files.writeString(Path.of(args[0], "input-" + part + "-static.java.fragment"), code);
        }
    }

    static DataNode node(int fixed, String componentName) {
        DataNode node = new DataNode();
        node.setUniqueName(componentName + "_1");
        IComponent component = (IComponent) Proxy.newProxyInstance(GenerateRows.class.getClassLoader(),
                new Class<?>[] { IComponent.class }, (p, method, a) -> "getName".equals(method.getName())
                        ? componentName : defaultValue(method.getReturnType()));
        node.setComponent(component);
        IMetadataTable metadata = new MetadataTable();
        metadata.setTableName("row");
        for (int i = 0; i < fixed; i++) {
            MetadataColumn column = new MetadataColumn();
            column.setLabel(i == 0 ? "AGENCE" : "MOIS");
            column.setOriginalDbColumnName(column.getLabel());
            column.setTalendType("id_String");
            column.setNullable(true);
            column.setType("VARCHAR");
            column.setLength(20);
            metadata.getListColumns().add(column);
        }
        MetadataColumn dynamic = new MetadataColumn();
        dynamic.setLabel("SQL");
        dynamic.setOriginalDbColumnName("SQL");
        dynamic.setTalendType("id_Dynamic");
        dynamic.setNullable(true);
        metadata.getListColumns().add(dynamic);
        node.setMetadataList(Collections.singletonList(metadata));
        IConnection connection = (IConnection) Proxy.newProxyInstance(GenerateRows.class.getClassLoader(),
                new Class<?>[] { IConnection.class }, (p, method, a) -> {
                    switch (method.getName()) {
                    case "getName": return "row";
                    case "getConnectorName": return "FLOW";
                    case "getLineStyle": return EConnectionType.FLOW_MAIN;
                    case "getMetadataTable": return metadata;
                    case "getSource": case "getTarget": return node;
                    default: return defaultValue(method.getReturnType());
                    }
                });
        node.setIncomingConnections(Collections.singletonList(connection));
        node.setOutgoingConnections(Collections.singletonList(connection));
        List<IElementParameter> parameters = new ArrayList<IElementParameter>();
        for (String[] pair : new String[][] { { "CSV_OPTION", "false" }, { "INCLUDEHEADER", "true" },
                { "FIELDSEPARATOR", "\";\"" }, { "ROWSEPARATOR", "\"\\n\"" },
                { "ENCODING", "\"ISO-8859-15\"" }, { "SCHEMA_OPT_NUM", "100" },
                { "TYPE", "MSSQL" }, { "DRIVER", "MSSQL_PROP" }, { "USE_EXISTING_CONNECTION", "false" },
                { "HOST", "\"localhost\"" }, { "PORT", "\"1433\"" }, { "DBNAME", "\"synthetic\"" },
                { "USER", "\"test\"" }, { "PASS", "\"\"" }, { "PROPERTIES", "\"\"" },
                { "DB_SCHEMA", "\"dbo\"" }, { "MAPPING", "id_MSSQL" },
                { "QUERY", "\"DECLARE @q nvarchar(max); EXEC(@q);\"" } }) {
            parameters.add((IElementParameter) Proxy.newProxyInstance(GenerateRows.class.getClassLoader(),
                    new Class<?>[] { IElementParameter.class }, (p, method, a) -> {
                        switch (method.getName()) {
                        case "getName": return pair[0];
                        case "getVariableName": return "__" + pair[0] + "__";
                        case "getValue": return pair[1];
                        case "getFieldType": return EParameterFieldType.TEXT;
                        default: return defaultValue(method.getReturnType());
                        }
                    }));
        }
        node.setElementParameters(parameters);
        node.setProcess((IProcess) Proxy.newProxyInstance(GenerateRows.class.getClassLoader(),
                new Class<?>[] { IProcess.class }, (p, method, a) -> {
                    switch (method.getName()) {
                    case "getComponentsType": return "DI";
                    case "getElementParametersWithChildrens": case "getNodes": case "getGeneratingNodes": return Collections.emptyList();
                    default: return defaultValue(method.getReturnType());
                    }
                }));
        return node;
    }

    private static Object defaultValue(Class<?> type) {
        if (type == boolean.class) { return false; }
        if (type == int.class) { return 0; }
        return null;
    }
}
