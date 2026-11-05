import java.lang.reflect.Proxy;
import java.nio.file.*;
import java.util.*;
import org.talend.core.model.metadata.*;
import org.talend.core.model.process.*;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

/** Runs the real begin/main/end JET emitters against a minimal component model. */
public class GenerateLdap {
    static Object fallback(Class<?> type) {
        if (type == boolean.class) return false;
        if (type == int.class) return 0;
        return null;
    }
    static IElementParameter parameter(String name, Object value) {
        return (IElementParameter) Proxy.newProxyInstance(GenerateLdap.class.getClassLoader(), new Class<?>[]{IElementParameter.class}, (p,m,a) -> {
            switch(m.getName()) {
            case "getName": return name;
            case "getVariableName": return "__" + name + "__";
            case "getValue": return value;
            case "getListItemsDisplayCodeName": return value instanceof List ? ((Map<?,?>)((List<?>)value).get(0)).keySet().toArray(new String[0]) : new String[0];
            case "getFieldType": return value instanceof List ? EParameterFieldType.TABLE : EParameterFieldType.TEXT;
            default: return fallback(m.getReturnType());
            }
        });
    }
    static IConnection connection(String name, String connector) {
        return (IConnection) Proxy.newProxyInstance(GenerateLdap.class.getClassLoader(), new Class<?>[]{IConnection.class}, (p,m,a) -> {
            switch(m.getName()) {
            case "getName": return name;
            case "getConnectorName": return connector;
            case "getLineStyle": return connector.equals("REJECT") ? EConnectionType.FLOW_REF : EConnectionType.FLOW_MAIN;
            default: return fallback(m.getReturnType());
            }
        });
    }
    static INode node(String mode, boolean decode, int policy, boolean bytes) {
        IMetadataTable schema = new MetadataTable();
        for (String label : new String[]{"dn", "manager"}) {
            MetadataColumn c = new MetadataColumn();
            c.setLabel(label); c.setOriginalDbColumnName(label);
            c.setTalendType(bytes && label.equals("manager") ? "id_byte[]" : "id_String");
            c.setNullable(true);
            schema.getListColumns().add(c);
        }
        Map<String,Object> params = new LinkedHashMap<>();
        params.put("USE_EXISTING_CONNECTION", "true"); params.put("CONNECTION", "tLDAPConnection_1");
        params.put("INSERT_MODE", mode); params.put("DIE_ON_ERROR", String.valueOf(policy == 0));
        params.put("DN_COLUMN_NAME", "dn"); params.put("MULTI_VALUE_SEPARATOR", "\";\"");
        params.put("USE_FIELD_OPTIONS", "true"); params.put("USE_ATTRIBUTE_OPTIONS", "true");
        params.put("FIELD_OPTIONS", Collections.singletonList(Map.of("SCHEMA_COLUMN", "manager", "BASE64", String.valueOf(decode))));
        params.put("ATTRIBUTE_OPTIONS", Collections.singletonList(Map.of("ATTRIBUTE_NAME", "manager", "ATTRIBUTE_OPTION", "REPLACE", "UPDATEBASE64", String.valueOf(decode))));
        List<IElementParameter> parameters = new ArrayList<>();
        params.forEach((k,v) -> parameters.add(parameter(k,v)));
        IProcess process = (IProcess) Proxy.newProxyInstance(GenerateLdap.class.getClassLoader(), new Class<?>[]{IProcess.class}, (p,m,a) -> m.getName().equals("getElementParametersWithChildrens") ? Collections.emptyList() : fallback(m.getReturnType()));
        List<IConnection> outputs = new ArrayList<>();
        outputs.add(connection("accepted", "FLOW"));
        if (policy == 1) outputs.add(connection("rejected", "REJECT"));
        return (INode) Proxy.newProxyInstance(GenerateLdap.class.getClassLoader(), new Class<?>[]{INode.class}, (p,m,a) -> {
            switch(m.getName()) {
            case "getUniqueName": return "tLDAPOutput_1";
            case "getProcess": return process;
            case "getElementParametersWithChildrens": case "getElementParameters": return parameters;
            case "getMetadataList": return Collections.singletonList(schema);
            case "getMetadataFromConnector": return policy == 1 && "REJECT".equals(a[0]) ? schema : null;
            case "getIncomingConnections": return Collections.singletonList(connection("row", "FLOW"));
            case "getOutgoingSortedConnections": return outputs;
            case "getOutgoingConnections": return a == null || a.length == 0 ? outputs : policy == 1 && "REJECT".equals(a[0]) ? Collections.singletonList(outputs.get(1)) : Collections.emptyList();
            default: return fallback(m.getReturnType());
            }
        });
    }
    static String emit(INode node, String part) throws Exception {
        CodeGeneratorArgument argument = new CodeGeneratorArgument(); argument.setNode(node);
        Class<?> emitter = Class.forName("Ldap" + part);
        return (String)emitter.getMethod("generate", Object.class).invoke(emitter.getConstructor().newInstance(), argument);
    }
    public static void main(String[] args) throws Exception {
        Path out = Path.of(args[0]);
        INode unit = node("UPDATA", true, 0, false);
        Files.writeString(out.resolve("GeneratedHelpers.java"), "import java.util.*; public class GeneratedHelpers { public static void main(String[] args) throws Exception { Map<String,Object> globalMap = new HashMap<>();\n" + emit(unit,"begin") + "\nBase64Cases.run(base64_tLDAPOutput_1); }}");
        for (String mode : new String[]{"INSERT", "ADD", "UPDATA", "INSERT_UPDATA"})
        for (boolean decode : new boolean[]{true,false})
        for (boolean bytes : new boolean[]{false,true})
        for (int policy = 0; policy < 3; policy++) {
            String name = "GeneratedLdap" + mode + decode + bytes + policy;
            INode n = node(mode,decode,policy,bytes);
            String type = bytes ? "byte[]" : "String";
            String code = "import java.util.*; public class " + name + " { static class Row {String dn=\"cn=test\"; " + type + " manager; } static class acceptedStruct extends Row {} static class rejectedStruct extends Row {String errorMessage;}\n"
                + "static void run(String value, boolean invalid) throws Exception { Row row = new Row(); row.manager=" + (bytes ? "value.getBytes(java.nio.charset.StandardCharsets.US_ASCII)" : "value") + "; acceptedStruct accepted=null; rejectedStruct rejected=null; int tos_count_tLDAPOutput_1=1; Map<String,Object> globalMap=new HashMap<>(); RecordingContext ctx=new RecordingContext(); globalMap.put(\"conn_tLDAPConnection_1\",ctx);\n"
                + emit(n,"begin") + "\nboolean thrown=false; try {\n" + emit(n,"main") + "\n} catch(IllegalArgumentException e) { thrown=true; }\n" + emit(n,"end")
                + "\nboolean failed=invalid && " + decode + "; if(thrown != (failed && " + (policy==0) + ")) throw new AssertionError(\"DIE_ON_ERROR\");"
                + "if(ctx.writes != (failed?0:1) || nb_line_tLDAPOutput_1 != (failed?0:1) || nb_line_rejected_tLDAPOutput_1 != (failed && " + (policy==1) + "?1:0)) throw new AssertionError(\"Counters or LDAP write\");"
                + "if(failed) { if(!whetherReject_tLDAPOutput_1 || accepted!=null || !(globalMap.get(\"tLDAPOutput_1_ERROR_MESSAGE\") instanceof String)) throw new AssertionError(\"Error routing\");"
                + (policy==1 ? "if(rejected==null || rejected.manager != row.manager || !rejected.errorMessage.contains(\"Line: 1\")) throw new AssertionError(\"Reject contents\");" : "")
                + "} else { if(accepted==null || accepted.manager != row.manager || rejected!=null) throw new AssertionError(\"Forwarding\");"
                + "String[] parts=" + (bytes ? "new String[]{value}" : "value.split(\";\")") + "; if(ctx.manager.size()!=parts.length) throw new AssertionError(\"Multiple values\"); for(int i=0;i<parts.length;i++) {Object expected=" + (decode ? "java.util.Base64.getDecoder().decode(parts[i])" : bytes ? "row.manager" : "parts[i]") + "; Base64Cases.equal(expected,ctx.manager.get(i)); }} }\n"
                + "public static void main(String[] args) throws Exception {run(\"" + (bytes ? "AAH+/4A=" : "TQ==;TWE=") + "\",false); run(\"$$==\",true); System.out.println(\"PASS " + name + "\"); }}";
            Files.writeString(out.resolve(name + ".java"),code);
        }
    }
}
