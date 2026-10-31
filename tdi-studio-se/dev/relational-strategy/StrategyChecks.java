import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;
import javax.tools.ToolProvider;
import org.talend.core.model.process.*;
import org.talend.core.model.metadata.*;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

/** Exercises the real emitters and compiles/executes their output against a JDBC double. */
public class StrategyChecks {
    static Object defaultValue(Class<?> type) {
        if (type == boolean.class) return false;
        if (type == int.class) return 0;
        if (type == long.class) return 0L;
        if (List.class.isAssignableFrom(type)) return Collections.emptyList();
        if (Map.class.isAssignableFrom(type)) return Collections.emptyMap();
        return null;
    }
    @SuppressWarnings("unchecked")
    static <T> T proxy(Class<T> type, Map<String,Object> values) {
        return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class<?>[]{type}, (o,m,a) ->
                values.containsKey(m.getName()) ? values.get(m.getName()) : defaultValue(m.getReturnType()));
    }
    static IMetadataColumn column(String name, String type, boolean key) {
        return proxy(IMetadataColumn.class, Map.of("getName",name,"getLabel",name,
                "getOriginalDbColumnName",name,"getTalendType",type,"isKey",key,
                "isNullable",true,"getType",type.equals("id_Integer")?"INT":"VARCHAR"));
    }
    static INode node(Map<String,Object> overrides, List<IMetadataColumn> columns, boolean reject) {
        Map<String,Object> settings = new LinkedHashMap<>();
        settings.put("DATA_ACTION","RELATIONAL_STRATEGY");
        settings.put("RELATIONAL_STRATEGY_COLUMN","relationalStrategy");
        settings.put("START_VALUE","1"); settings.put("STEP","1");
        settings.put("MAPPING","id_MSSQL"); settings.put("TABLE","\"target\"");
        settings.put("TABLE_ACTION","NONE"); settings.put("USE_EXISTING_CONNECTION","true");
        settings.put("CONNECTION","source"); settings.put("COMMIT_EVERY","2");
        settings.put("DIE_ON_ERROR","false"); settings.put("SUPPORT_NULL_WHERE","false");
        // Stale advanced options must not override the common schema keys.
        settings.put("USE_FIELD_OPTIONS","true"); settings.put("USE_BATCH_SIZE","true");
        settings.put("DRIVER","MSSQL_PROP");
        settings.putAll(overrides);
        List<IElementParameter> params = new ArrayList<>();
        settings.forEach((k,v) -> params.add(proxy(IElementParameter.class,Map.of(
                "getVariableName","__"+k+"__","getName",k,"getValue",v,"getFieldType",EParameterFieldType.TEXT))));
        IMetadataTable schema = proxy(IMetadataTable.class, Map.of("getListColumns",columns));
        IConnection input = proxy(IConnection.class,Map.of("getName","row1","getLineStyle",EConnectionType.FLOW_MAIN));
        IConnection output = proxy(IConnection.class,Map.of("getName","accepted","getLineStyle",EConnectionType.FLOW_MAIN));
        IConnection rejected = proxy(IConnection.class,Map.of("getName","rejected","getLineStyle",EConnectionType.FLOW_MAIN));
        IProcess process = proxy(IProcess.class,Map.of());
        Map<String,Object> values = new HashMap<>(Map.of("getUniqueName","tMSSqlOutput_1",
                "getMetadataList",List.of(schema),"getElementParametersWithChildrens",params,
                "getIncomingConnections",List.of(input),"getProcess",process,
                "getOutgoingSortedConnections",Boolean.TRUE.equals(overrides.get("NO_OUTPUT"))?List.of():reject?List.of(output,rejected):List.of(output),
                "getMetadataFromConnector",schema));
        return (INode) Proxy.newProxyInstance(INode.class.getClassLoader(),new Class<?>[]{INode.class},(o,m,a)-> {
            if (m.getName().equals("getOutgoingConnections")) return reject?List.of(rejected):List.of();
            return values.containsKey(m.getName())?values.get(m.getName()):defaultValue(m.getReturnType());
        });
    }
    static String emit(String phase, INode node) {
        CodeGeneratorArgument arg = new CodeGeneratorArgument(); arg.setNode(node);
        return switch(phase) {
            case "begin" -> new tMSSqlOutput_begin().generate(arg);
            case "main" -> new tMSSqlOutput_main().generate(arg);
            case "end" -> new tMSSqlOutput_end().generate(arg);
            default -> new tMSSqlOutput_finally().generate(arg);
        };
    }
    static void check(boolean ok, String message) { if(!ok) throw new AssertionError(message); }
    static void invalid(Map<String,Object> overrides, List<IMetadataColumn> columns) {
        try { emit("begin",node(overrides,columns,false)); throw new AssertionError("Expected configuration rejection"); }
        catch(IllegalArgumentException expected) { }
    }
    public static void main(String[] args) throws Exception {
        Path out = Path.of(args[0]);
        List<IMetadataColumn> cols = List.of(column("id","id_Integer",true),
                column("name","id_String",false),column("relationalStrategy","id_String",false));
        invalid(Map.of(),cols.subList(0,2));
        invalid(Map.of(),List.of(column("id","id_Integer",false),cols.get(1),cols.get(2)));
        invalid(Map.of(),List.of(cols.get(0),cols.get(2)));
        invalid(Map.of(),List.of(cols.get(0),cols.get(1),column("relationalStrategy","id_Integer",false)));
        invalid(Map.of(),List.of(cols.get(0),cols.get(1),column("relationalStrategy","id_String",true)));
        invalid(Map.of("PARALLELIZE","true"),cols);
        invalid(Map.of("IDENTITY_INSERT","true"),cols);
        invalid(Map.of(),List.of(cols.get(0),column("dynamic","id_Dynamic",false),cols.get(2)));
        for(int variant=0;variant<6;variant++) {
            boolean reject=variant!=0;
            boolean die=variant==2;
            boolean nullable=variant==3;
            List<IMetadataColumn> variantCols=cols;
            if (variant >= 4) {
                List<IMetadataColumn> expanded=new ArrayList<>(cols);
                expanded.add(column("tenant","id_Integer",true));
                expanded.add(column("secondName","id_String",false));
                expanded.add(column("thirdName","id_String",false));
                expanded.add(proxy(IMetadataColumn.class,Map.of("getName","changedAt","getLabel","changedAt",
                        "getOriginalDbColumnName","changedAt","getTalendType","id_Date","getType","DATETIME2",
                        "getPattern","\"yyyy-MM-dd\"","isNullable",true)));
                // Multiple national character columns exercise JDBC binding scopes.
                for(int i=3;i<5;i++) {
                    String label=i==3?"secondName":"thirdName";
                    expanded.set(i+1,proxy(IMetadataColumn.class,Map.of("getName",label,"getLabel",label,
                            "getOriginalDbColumnName",label,"getTalendType","id_String","getType","NVARCHAR","isNullable",true)));
                }
                variantCols=expanded;
            }
            INode node=node(Map.of("DIE_ON_ERROR",String.valueOf(die),
                    "SUPPORT_NULL_WHERE",String.valueOf(nullable)),variantCols,reject);
            String begin=emit("begin",node), main=emit("main",node), end=emit("end",node), cleanup=emit("finally",node);
            check(!begin.contains("[relationalStrategy]"),"Strategy leaked into SQL");
            check(begin.contains("WHERE ") && begin.contains("[id]"),"Missing shared key");
            check(!main.contains("addBatch"),"Batching must be disabled");
            check(main.contains("rejected.relationalStrategy = row1.relationalStrategy") || !reject || die,"Strategy missing in rejects");
            String name="GeneratedStrategy"+variant;
            String code="import java.util.*; import java.sql.*; public class "+name+" {\n"+RUNTIME
                +" public void run() throws Exception { acceptedStruct accepted=null; rejectedStruct rejected=null; row1Struct row1=null;\n"
                +"try {\n"+begin+"\nfor(row1Struct incoming: inputs) { row1=incoming;\n"+main
                +"\nif(rejected!=null) rejects.add(rejected); if(accepted!=null) acceptedRows.add(accepted); }\n"+end
                +"\n} finally {\n"+cleanup+"\n} } }";
            Path source=out.resolve(name+".java");Files.writeString(source,code);
            int status=ToolProvider.getSystemJavaCompiler().run(null,null,null,"-proc:none","-d",out.toString(),source.toString());
            check(status==0,"Generated job did not compile");
            Class<?> job=Class.forName(name);
            if(variant<4) job.getMethod("verify",boolean.class,boolean.class).invoke(null,die,nullable);
        }
        // Static actions still generate their original single-action paths.
        for(String action:List.of("INSERT","UPDATE","DELETE","UPDATE_OR_INSERT","INSERT_OR_UPDATE","SINGLE_INSERT","INSERT_IF_NOT_EXIST")) {
            INode n=node(Map.of("DATA_ACTION",action,"USE_FIELD_OPTIONS","false","USE_BATCH_SIZE","false"),cols,false);
            check(!emit("main",n).contains("Invalid relationalStrategy"),"Static mode changed");
            for(String phase:List.of("begin","main","end","finally")) {
                Class<?> baseline=Class.forName("Baseline_tMSSqlOutput_"+phase);
                CodeGeneratorArgument arg=new CodeGeneratorArgument(); arg.setNode(n);
                String before=(String)baseline.getMethod("generate",Object.class).invoke(baseline.getConstructor().newInstance(),arg);
                check(before.replaceAll("\\s+", "").equals(emit(phase,n).replaceAll("\\s+", "")),"Static mode regression: "+action+"/"+phase);
            }
        }
        System.out.println("PASS: configuration guards, actual generated jobs, dispatch/order, upsert, rejects, counters, nullable keys, cleanup and static modes");
    }
    static final String RUNTIME="""
        static class row1Struct { Integer id; Integer tenant; String name; String secondName; String thirdName; java.util.Date changedAt; String relationalStrategy;
            row1Struct(Integer i,String n,String s){id=i;name=n;relationalStrategy=s;} }
        static class acceptedStruct { Integer id; Integer tenant; String name; String secondName; String thirdName; java.util.Date changedAt; String relationalStrategy; }
        static class rejectedStruct { Integer id; Integer tenant; String name; String secondName; String thirdName; java.util.Date changedAt; String relationalStrategy; String errorCode; String errorMessage; }
        static class TalendDate { static java.util.Date parseDate(String p,String v) throws Exception {
            return new java.text.SimpleDateFormat(p).parse(v); } }
        Map<String,Object> globalMap=new HashMap<>();
        Map<String,Object> resourceMap=new HashMap<>();
        Map<Integer,String> data=new HashMap<>();
        List<String> operations=new ArrayList<>();
        List<row1Struct> inputs=new ArrayList<>();
        List<rejectedStruct> rejects=new ArrayList<>();
        List<acceptedStruct> acceptedRows=new ArrayList<>();
        int prepared=0,closed=0;
        public GeneratedStrategyPLACEHOLDER() { }
        java.sql.Connection connection() {
            return (java.sql.Connection)java.lang.reflect.Proxy.newProxyInstance(getClass().getClassLoader(),new Class<?>[]{java.sql.Connection.class},(p,m,a)-> {
                if(m.getName().equals("prepareStatement")) {
                    prepared++; String sql=(String)a[0]; Map<Integer,Object> params=new HashMap<>();
                    return java.lang.reflect.Proxy.newProxyInstance(getClass().getClassLoader(),new Class<?>[]{java.sql.PreparedStatement.class},(ps,pm,pa)-> {
                        if(pm.getName().startsWith("set") && pa.length>1 && pa[0] instanceof Integer) {
                            if(!pm.getName().equals("setQueryTimeout")) params.put((Integer)pa[0],pm.getName().equals("setNull")?null:pa[1]); return null;
                        }
                        if(pm.getName().equals("close")){closed++;return null;}
                        if(pm.getName().equals("executeUpdate")) {
                            String op=sql.split(" ")[0]; operations.add(op);
                            Integer id=(Integer)params.get(sql.contains("0x1")?(op.equals("UPDATE")?3:2):(op.equals("UPDATE")?2:1));
                            if(op.equals("INSERT")) {
                                id=(Integer)params.get(1);
                                if(data.containsKey(id))throw new SQLException("Duplicate key","23000");
                                data.put(id,(String)params.get(2));return 1;
                            }
                            if(!data.containsKey(id))return 0;
                            if(op.equals("UPDATE")) data.put(id,(String)params.get(1)); else data.remove(id);
                            return 1;
                        }
                        return null;
                    });
                }
                if(m.getName().equals("getAutoCommit"))return true;
                if(m.getName().equals("isClosed"))return false;
                return null;
            });
        }
        public static void verify(boolean die,boolean nullable) throws Exception {
            Class<?> cls=java.lang.invoke.MethodHandles.lookup().lookupClass();
            Object instance=cls.getConstructor().newInstance();
            cls.getMethod("exercise",boolean.class,boolean.class).invoke(instance,die,nullable);
        }
        public void exercise(boolean die,boolean nullable) throws Exception {
            globalMap.put("conn_source",connection());
            globalMap.put("dbschema_source","dbo");
            inputs.add(new row1Struct(1,"A","INSERT"));
            inputs.add(new row1Struct(1,"B","UPDATE"));
            inputs.add(new row1Struct(1,"C","UPSERT"));
            inputs.add(new row1Struct(2,"D","UPDATE_OR_INSERT"));
            inputs.add(new row1Struct(1,null,"DELETE"));
            inputs.add(new row1Struct(9,"missing","UPDATE"));
            inputs.add(new row1Struct(9,null,"DELETE"));
            if(nullable) {
                inputs.add(new row1Struct(null,"null key","INSERT"));
                inputs.add(new row1Struct(null,"null changed","UPDATE"));
                inputs.add(new row1Struct(null,null,"DELETE"));
            }
            inputs.add(new row1Struct(3,"invalid","bad"));
            if(!die) {
                inputs.add(new row1Struct(3,"invalid",null));
                inputs.add(new row1Struct(3,"invalid","  "));
                inputs.add(new row1Struct(2,"duplicate","INSERT"));
                inputs.add(new row1Struct(4,"E"," insert "));
            }
            boolean thrown=false;
            try{run();}catch(SQLException expected){thrown=true;if(!"RS001".equals(expected.getSQLState()))throw expected;}
            if(thrown!=die)throw new AssertionError("Die on error");
            if(prepared!=3 || closed!=3)throw new AssertionError("Prepared statement lifecycle: "+prepared+"/"+closed);
            if(data.containsKey(1) || !"D".equals(data.get(2)) || (!die && !"E".equals(data.get(4))))throw new AssertionError("Final rows: "+data);
            if(!operations.subList(0,6).equals(List.of("INSERT","UPDATE","UPDATE","UPDATE","INSERT","DELETE")))throw new AssertionError("Order: "+operations);
            if(!die) {
                if(!globalMap.get("tMSSqlOutput_1_NB_LINE_INSERTED").equals(nullable?4:3))throw new AssertionError("Insert counter");
                if(!globalMap.get("tMSSqlOutput_1_NB_LINE_UPDATED").equals(nullable?3:2))throw new AssertionError("Update counter");
                if(!globalMap.get("tMSSqlOutput_1_NB_LINE_DELETED").equals(nullable?2:1))throw new AssertionError("Delete counter");
                if(!globalMap.get("tMSSqlOutput_1_NB_LINE_REJECTED").equals(4))throw new AssertionError("Reject counter");
                if(!rejects.isEmpty() && (rejects.size()!=4 || !"bad".equals(rejects.get(0).relationalStrategy)))throw new AssertionError("Reject schema");
            }
        }
        """.replace("public GeneratedStrategyPLACEHOLDER() { }", "");
}
