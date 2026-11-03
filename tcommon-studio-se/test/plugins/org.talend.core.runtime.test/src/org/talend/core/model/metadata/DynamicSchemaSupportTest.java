package org.talend.core.model.metadata;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

import org.junit.Test;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;

public class DynamicSchemaSupportTest {

    private static INode node(String componentName, String framework, String driver, boolean csv) {
        return node(componentName, framework, driver, csv, Collections.emptyMap());
    }

    private static INode node(String componentName, String framework, String driver, boolean csv, Map<String, Object> overrides) {
        ClassLoader loader = DynamicSchemaSupportTest.class.getClassLoader();
        IComponent component = (IComponent) Proxy.newProxyInstance(loader, new Class<?>[] { IComponent.class },
                (p, method, args) -> "getName".equals(method.getName()) ? componentName : null);
        IProcess process = (IProcess) Proxy.newProxyInstance(loader, new Class<?>[] { IProcess.class },
                (p, method, args) -> "getComponentsType".equals(method.getName()) ? framework : null);
        return (INode) Proxy.newProxyInstance(loader, new Class<?>[] { INode.class }, (p, method, args) -> {
            switch (method.getName()) {
            case "getComponent": return component;
            case "getProcess": return process;
            case "getElementParameter":
                String name = (String) args[0];
                Object value = "DRIVER".equals(name) ? driver : "CSV_OPTION".equals(name) ? csv : false;
                Object parameterValue = overrides.getOrDefault(name, value);
                return Proxy.newProxyInstance(loader, new Class<?>[] { IElementParameter.class },
                        (parameter, getter, a) -> "getValue".equals(getter.getName()) ? parameterValue : null);
            default: return null;
            }
        });
    }

    @Test
    public void outputOnlyEnablesQualifiedInsertOptions() {
        Map<String, Object> options = new HashMap<>();
        options.put("DATA_ACTION", "INSERT");
        options.put("TABLE_ACTION", "DROP_IF_EXISTS_AND_CREATE");
        assertTrue(DynamicSchemaSupport.supports(node("tMSSqlOutput", "DI", "MSSQL_PROP", false, options)));
        assertFalse(DynamicSchemaSupport.supports(node("tMSSqlOutput", "DI", "JTDS", false, options)));
        options.put("DATA_ACTION", "UPDATE");
        assertTrue(DynamicSchemaSupport.supports(node("tMSSqlOutput", "DI", "MSSQL_PROP", false, options)));
        options.put("DATA_ACTION", "INSERT");
        options.put("ADD_COLS", Arrays.asList("computed column"));
        assertFalse(DynamicSchemaSupport.supports(node("tMSSqlOutput", "DI", "MSSQL_PROP", false, options)));
        options.remove("ADD_COLS");
        options.put("USE_EXISTING_CONNECTION", true);
        assertFalse(DynamicSchemaSupport.supports(node("tMSSqlOutput", "DI", "MSSQL_PROP", false, options)));
    }

    @Test
    public void rejectDiagnosticsMayFollowTheDynamicColumnOnlyOnSqlOutput() {
        MetadataColumn dynamic = column("SQL", "id_Dynamic");
        MetadataColumn code = column("errorCode", "id_String");
        MetadataColumn message = column("errorMessage", "id_String");
        MetadataTable reject = new MetadataTable();
        reject.setAttachedConnector("REJECT");
        reject.getListColumns().addAll(Arrays.asList(dynamic, code, message));
        INode output = node("tMSSqlOutput", "DI", "MSSQL_PROP", false);
        assertTrue(DynamicSchemaSupport.isValidDynamicSchema(output, reject));
        assertFalse(DynamicSchemaSupport.isValidDynamicSchema(node("tMap", "DI", null, false), reject));
        reject.setAttachedConnector("FLOW");
        assertFalse(DynamicSchemaSupport.isValidDynamicSchema(output, reject));
        reject.setAttachedConnector("REJECT");
        code.setLabel("anythingElse");
        assertFalse(DynamicSchemaSupport.isValidDynamicSchema(output, reject));
    }

    private static MetadataColumn column(String name, String type) {
        MetadataColumn column = new MetadataColumn();
        column.setLabel(name);
        column.setTalendType(type);
        return column;
    }

    @Test
    public void onlyQualifiedComponentsAndFrameworksAreEnabled() {
        assertTrue(DynamicSchemaSupport.supports(node("tMSSqlInput", "DI", "MSSQL_PROP", false)));
        assertTrue(DynamicSchemaSupport.supports(node("tMap", "DI", null, false)));
        assertTrue(DynamicSchemaSupport.supports(node("tLogRow", "DI", null, false)));
        assertTrue(DynamicSchemaSupport.supports(node("tFileOutputDelimited", "DI", null, false)));
        assertFalse(DynamicSchemaSupport.supports(node("tMSSqlInput", "DI", "JTDS", false)));
        assertTrue(DynamicSchemaSupport.supports(node("tOracleInput", "DI", null, false)));
        assertTrue(DynamicSchemaSupport.supports(node("tFileInputDelimited", "DI", null, false)));
        assertFalse(DynamicSchemaSupport.supports(node("tMap", "SPARK", null, false)));
        assertTrue(DynamicSchemaSupport.supports(node("tFileOutputDelimited", "DI", null, true)));
    }

    @Test
    public void dynamicMustBeUniqueAndFinalAfterAnyStaticPrefix() {
        MetadataColumn fixed = new MetadataColumn();
        fixed.setTalendType("id_String");
        MetadataColumn dynamic = new MetadataColumn();
        dynamic.setTalendType("id_Dynamic");
        assertTrue(DynamicSchemaSupport.isDynamicLast(Arrays.<IMetadataColumn>asList(dynamic)));
        assertTrue(DynamicSchemaSupport.isDynamicLast(Arrays.<IMetadataColumn>asList(fixed, fixed, dynamic)));
        assertTrue(DynamicSchemaSupport.isDynamicLast(Arrays.<IMetadataColumn>asList(fixed, fixed)));
        assertFalse(DynamicSchemaSupport.isDynamicLast(Arrays.<IMetadataColumn>asList(dynamic, fixed)));
        assertFalse(DynamicSchemaSupport.isDynamicLast(Arrays.<IMetadataColumn>asList(dynamic, dynamic)));
    }
    private static MetadataTable schema(IMetadataColumn... columns) {
        MetadataTable table = new MetadataTable();
        table.getListColumns().addAll(Arrays.asList(columns));
        return table;
    }

    private static INode flow(String component, MetadataTable input, MetadataTable output, Map<String, Object> options) {
        INode base = node(component, "DI", null, false, options);
        ClassLoader loader = DynamicSchemaSupportTest.class.getClassLoader();
        org.talend.core.model.process.IConnection connection = (org.talend.core.model.process.IConnection)
                Proxy.newProxyInstance(loader, new Class<?>[] { org.talend.core.model.process.IConnection.class },
                        (p, m, a) -> "getMetadataTable".equals(m.getName()) ? input
                                : "getLineStyle".equals(m.getName()) ? org.talend.core.model.process.EConnectionType.FLOW_MAIN : null);
        return (INode) Proxy.newProxyInstance(loader, new Class<?>[] { INode.class }, (p, m, a) -> {
            if ("getMetadataList".equals(m.getName())) return Collections.singletonList(output);
            if ("getIncomingConnections".equals(m.getName())) return Collections.singletonList(connection);
            return m.invoke(base, a);
        });
    }

    @Test
    public void processingComponentsAreStandardOnly() {
        for (String component : Arrays.asList("tReplicate", "tFilterRow", "tFilterColumns")) {
            assertTrue(DynamicSchemaSupport.supports(node(component, "DI", null, false)));
            assertFalse(DynamicSchemaSupport.supports(node(component, "SPARK", null, false)));
        }
    }

    @Test
    public void projectionCanReorderOrDropStaticColumnsAndKeepOrDropTheContainer() {
        MetadataTable input = schema(column("AGENCE", "id_String"), column("MOIS", "id_String"), column("SQL", "id_Dynamic"));
        for (MetadataTable output : Arrays.asList(schema(column("MOIS", "id_String"), column("SQL", "id_Dynamic")),
                schema(column("SQL", "id_Dynamic")), schema(column("AGENCE", "id_String")))) {
            assertTrue(DynamicSchemaSupport.validateFlow(flow("tFilterColumns", input, output, Collections.emptyMap())).isEmpty());
        }
    }

    @Test
    public void projectionCannotInventRenameOrChangeTheDynamicContainerType() {
        MetadataTable input = schema(column("SQL", "id_Dynamic"));
        for (MetadataTable output : Arrays.asList(schema(column("OTHER", "id_Dynamic")), schema(column("SQL", "id_String")))) {
            assertFalse(DynamicSchemaSupport.validateFlow(flow("tFilterColumns", input, output, Collections.emptyMap())).isEmpty());
        }
        assertFalse(DynamicSchemaSupport.validateFlow(flow("tFilterColumns", schema(column("SQL", "id_String")),
                input, Collections.emptyMap())).isEmpty());
    }

    @Test
    public void replicateAndFilterMustKeepTheInputColumns() {
        MetadataTable input = schema(column("AGENCE", "id_String"), column("SQL", "id_Dynamic"));
        for (String component : Arrays.asList("tReplicate", "tFilterRow")) {
            assertTrue(DynamicSchemaSupport.validateFlow(flow(component, input, input, Collections.emptyMap())).isEmpty());
            assertFalse(DynamicSchemaSupport.validateFlow(flow(component, input, schema(column("SQL", "id_Dynamic")), Collections.emptyMap())).isEmpty());
        }
    }

    @Test
    public void filterConditionsUseStaticColumnsAndRejectAddsOneDiagnostic() {
        MetadataTable input = schema(column("AGENCE", "id_String"), column("SQL", "id_Dynamic"));
        MetadataTable reject = schema(column("AGENCE", "id_String"), column("SQL", "id_Dynamic"), column("errorMessage", "id_String"));
        reject.setAttachedConnector("REJECT");
        Map<String,Object> options = new HashMap<>();
        options.put("CONDITIONS", Arrays.asList(Collections.singletonMap("INPUT_COLUMN", "AGENCE")));
        INode filter = flow("tFilterRow", input, reject, options);
        assertTrue(DynamicSchemaSupport.validateFlow(filter).isEmpty());
        assertTrue(DynamicSchemaSupport.isValidDynamicSchema(filter, reject));
        assertTrue(DynamicSchemaSupport.isValidDynamicSchema(node("tLogRow", "DI", null, false), reject));
        assertFalse(DynamicSchemaSupport.isValidDynamicSchema(node("tReplicate", "DI", null, false), reject));
        options.put("CONDITIONS", Arrays.asList(Collections.singletonMap("INPUT_COLUMN", "SQL")));
        assertFalse(DynamicSchemaSupport.validateFlow(filter).isEmpty());
        reject.setAttachedConnector("FILTER");
        assertFalse(DynamicSchemaSupport.isValidDynamicSchema(filter, reject));
    }

    @Test
    public void priorityTwoCapabilitiesRemainStandardAndRespectNativeChildResultModes() {
        for (String component : Arrays.asList("tFileInputDelimited", "tFileOutputDelimited", "tExtractDynamicFields",
                "tWriteDynamicFields", "tRunJob", "tBufferOutput", "tHashInput", "tHashOutput")) {
            assertTrue(component, DynamicSchemaSupport.supports(node(component, "DI", null, false)));
            assertFalse(component, DynamicSchemaSupport.supports(node(component, "SPARK", null, false)));
        }
        assertFalse(DynamicSchemaSupport.supports(node("tRunJob", "DI", null, false,
                Collections.singletonMap("USE_INDEPENDENT_PROCESS", true))));
        assertFalse(DynamicSchemaSupport.supports(node("tFileInputDelimited", "DI", null, false,
                Collections.singletonMap("USE_EXISTING_DYNAMIC", true))));
    }

    @Test
    public void fieldConstructionRequiresADynamicOutputAndMatchingStaticPrefix() {
        MetadataTable input = schema(column("AGENCE", "id_String"), column("MOIS", "id_String"));
        assertTrue(DynamicSchemaSupport.validateFlow(flow("tWriteDynamicFields", input,
                schema(column("AGENCE", "id_String"), column("SQL", "id_Dynamic")), Collections.emptyMap())).isEmpty());
        assertFalse(DynamicSchemaSupport.validateFlow(flow("tWriteDynamicFields", input,
                schema(column("AGENCE", "id_String")), Collections.emptyMap())).isEmpty());
        assertFalse(DynamicSchemaSupport.validateFlow(flow("tWriteDynamicFields", input,
                schema(column("unknown", "id_String"), column("SQL", "id_Dynamic")), Collections.emptyMap())).isEmpty());
    }

    @Test
    public void namedExtractionAcceptsNewStaticColumnsButNeedsAnInputContainer() {
        MetadataTable input = schema(column("AGENCE", "id_String"), column("SQL", "id_Dynamic"));
        MetadataTable output = schema(column("MONTANT", "id_BigDecimal"), column("SQL", "id_Dynamic"));
        assertTrue(DynamicSchemaSupport.validateFlow(flow("tExtractDynamicFields", input, output, Collections.emptyMap())).isEmpty());
        assertFalse(DynamicSchemaSupport.validateFlow(flow("tExtractDynamicFields", schema(column("AGENCE", "id_String")),
                output, Collections.emptyMap())).isEmpty());
    }

    @Test
    public void fileInputRejectSchemaKeepsBothDiagnosticsAfterDynamic() {
        MetadataTable reject = schema(column("SQL", "id_Dynamic"), column("errorCode", "id_String"), column("errorMessage", "id_String"));
        reject.setAttachedConnector("REJECT");
        assertTrue(DynamicSchemaSupport.isValidDynamicSchema(node("tFileInputDelimited", "DI", null, true), reject));
        reject.getListColumns().get(1).setTalendType("id_Integer");
        assertFalse(DynamicSchemaSupport.isValidDynamicSchema(node("tFileInputDelimited", "DI", null, true), reject));
    }


    @Test
    public void threeAdditionalJdbcProvidersEnableOnlyQualifiedOptions() {
        for (String provider : Arrays.asList("Oracle", "Mysql", "Postgresql")) {
            assertTrue(DynamicSchemaSupport.supports(node("t"+provider+"Input","DI",null,false)));
            assertFalse(DynamicSchemaSupport.supports(node("t"+provider+"Input","SPARK",null,false)));
            Map<String,Object> options=new HashMap<>(); options.put("DATA_ACTION","INSERT"); options.put("TABLE_ACTION","CREATE");
            assertTrue(DynamicSchemaSupport.supports(node("t"+provider+"Output","DI",null,false,options)));
            options.put("DATA_ACTION","UPDATE");
            assertTrue(DynamicSchemaSupport.supports(node("t"+provider+"Output","DI",null,false,options)));
            options.put("DATA_ACTION","INSERT"); options.put("EXTENDINSERT",true);
            assertFalse(DynamicSchemaSupport.supports(node("t"+provider+"Output","DI",null,false,options)));
        }
    }
    @Test
    public void dmlActionsRequireConcreteCorrespondenceKeys() {
        for (String component : Arrays.asList("tMSSqlOutput", "tOracleOutput", "tMysqlOutput", "tPostgresqlOutput")) {
            for (String action : Arrays.asList("UPDATE", "DELETE", "INSERT_OR_UPDATE", "UPDATE_OR_INSERT")) {
                Map<String,Object> options = new HashMap<>(); options.put("DATA_ACTION", action); options.put("TABLE_ACTION", "NONE");
                assertTrue(DynamicSchemaSupport.supports(node(component, "DI", "MSSQL_PROP", false, options)));
                MetadataColumn key = column("ID", "id_String"); MetadataColumn payload = column("SQL", "id_Dynamic");
                MetadataTable table = schema(key, payload);
                assertFalse(DynamicSchemaSupport.validateFlow(flow(component, table, table, options)).isEmpty());
                key.setKey(true);
                assertTrue(DynamicSchemaSupport.validateFlow(flow(component, table, table, options)).isEmpty());
                key.setKey(false); payload.setKey(true);
                assertFalse(DynamicSchemaSupport.validateFlow(flow(component, table, table, options)).isEmpty());
            }
        }
    }
    @Test
    public void namedDynamicKeysAllowEntirelyDynamicAndMixedSchemas() {
        for (String component:Arrays.asList("tMSSqlOutput","tOracleOutput","tMysqlOutput","tPostgresqlOutput")) {
            Map<String,Object> options=new HashMap<>();options.put("DATA_ACTION","UPDATE");options.put("TABLE_ACTION","NONE");options.put("USE_DYNAMIC_KEYS",true);
            options.put("DYNAMIC_KEY_COLUMNS",Arrays.asList(Collections.singletonMap("NAME","physical ID")));
            MetadataTable all=schema(column("SQL","id_Dynamic"));
            assertTrue(DynamicSchemaSupport.validateFlow(flow(component,all,all,options)).isEmpty());
            MetadataColumn key=column("STATIC","id_Integer");key.setKey(true);MetadataTable mixed=schema(key,column("SQL","id_Dynamic"));
            assertTrue(DynamicSchemaSupport.validateFlow(flow(component,mixed,mixed,options)).isEmpty());
        }
    }
    @Test
    public void invalidNamedKeyConfigurationIsReportedBeforeGeneration() {
        MetadataTable all=schema(column("SQL","id_Dynamic"));Map<String,Object> options=new HashMap<>();options.put("DATA_ACTION","UPDATE");options.put("USE_DYNAMIC_KEYS",true);
        for(Object keys:Arrays.asList(Collections.emptyList(),Arrays.asList(Collections.singletonMap("NAME","")),
                Arrays.asList(Collections.singletonMap("NAME","ID"),Collections.singletonMap("NAME","ID")))) {
            options.put("DYNAMIC_KEY_COLUMNS",keys);
            assertFalse(DynamicSchemaSupport.validateFlow(flow("tMSSqlOutput",all,all,options)).isEmpty());
        }
        options.put("DYNAMIC_KEY_COLUMNS",Arrays.asList(Collections.singletonMap("NAME","ID")));
        MetadataTable statics=schema(column("ID","id_String"));
        assertFalse(DynamicSchemaSupport.validateFlow(flow("tMSSqlOutput",statics,statics,options)).isEmpty());
    }
}
