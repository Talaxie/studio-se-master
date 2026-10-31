import java.nio.file.*;
import java.util.*;
import javax.tools.ToolProvider;
import org.talend.core.model.process.*;
import org.talend.core.model.metadata.*;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class MultiDbStrategyChecks {
    static String emit(String component,String phase,INode node,boolean baseline) throws Exception {
        CodeGeneratorArgument arg=new CodeGeneratorArgument();arg.setNode(node);
        Class<?> emitter=Class.forName((baseline?"Baseline_":"")+component+"_"+phase);
        return (String)emitter.getMethod("generate",Object.class).invoke(emitter.getConstructor().newInstance(),arg);
    }
    public static void main(String[] args) throws Exception {
        Path out=Path.of(args[0]);
        var loader=new org.talend.core.model.metadata.MappingFileLoader();
        Path mappings=Path.of(args[1]);
        for(String file:List.of("mapping_Mysql.xml","mapping_Oracle.xml","mapping_Postgres.xml"))loader.load(mappings.resolve(file).toFile());
        var columns=List.of(StrategyChecks.column("id","id_Integer",true),StrategyChecks.column("name","id_String",false),StrategyChecks.column("relationalStrategy","id_String",false));
        for(String db:List.of("Postgresql","Mysql","Oracle")) {
            String component="t"+db+"Output";
            String mapping=db.equals("Postgresql")?"postgres_id":db.equals("Mysql")?"mysql_id":"oracle_id";
            for(int variant=0;variant<3;variant++) {
                boolean batches=variant==1, rejects=variant==2;
                INode node=StrategyChecks.node(Map.of("MAPPING",mapping,"DIE_ON_ERROR",String.valueOf(!rejects),"NO_OUTPUT",!rejects,"DB_VERSION",db.equals("Mysql")?"MYSQL_8":"ORACLE_12","SUPPORT_NULL_WHERE","false","USE_BATCH_SIZE",String.valueOf(batches || rejects),"RELATIONAL_STRATEGY_BATCH_SIZE","2"),columns,rejects);
                String begin=emit(component,"begin",node,false),main=emit(component,"main",node,false),end=emit(component,"end",node,false),cleanup=emit(component,"finally",node,false);
                StrategyChecks.check(!begin.contains("[relationalStrategy]") && !begin.contains("`relationalStrategy`") && !begin.contains("\\\"relationalStrategy\\\""),"Technical column in SQL");
                String name="Generated"+db+(rejects?"Reject":batches?"Batch":"Row");
                String runtime=runtime(db);
                String code="import java.util.*; import java.sql.*; public class "+name+" {\n"+runtime
                    +"public void run() throws Exception { row1Struct row1=null; acceptedStruct accepted=null; rejectedStruct rejected=null; try {\n"+begin
                    +"for(row1Struct row: inputs) { row1=row; if(abort && row.id==99)throw new RuntimeException("+"\"upstream\""+");\n"+main+"if(rejected!=null)rejectedRows.add(rejected); }\n"+end+"}finally{\n"+cleanup+"}}}";
                Path file=out.resolve(name+".java");Files.writeString(file,code);
                int status=ToolProvider.getSystemJavaCompiler().run(null,null,null,"-proc:none","-cp",System.getProperty("java.class.path"),"-d",out.toString(),file.toString());
                StrategyChecks.check(status==0,"Generated "+db+" job compile");
                Class<?> generated=Class.forName(name);
                generated.getMethod("multi",boolean.class,boolean.class).invoke(generated.getConstructor().newInstance(),batches,rejects);
            }
            List<String> actions=new ArrayList<>(List.of("INSERT","UPDATE","DELETE","UPDATE_OR_INSERT","INSERT_OR_UPDATE"));
            if(db.equals("Postgresql"))actions.add("UPSERT");
            if(db.equals("Mysql"))actions.addAll(List.of("REPLACE","INSERT_ON_DUPLICATE_KEY_UPDATE","INSERT_IGNORE"));
            for(String action:actions) {
                INode node=StrategyChecks.node(Map.of("MAPPING",mapping,"DATA_ACTION",action,"USE_BATCH_SIZE","false","USE_FIELD_OPTIONS","false","DB_VERSION",db.equals("Mysql")?"MYSQL_8":"ORACLE_12"),columns,false);
                for(String phase:List.of("begin","main","end","finally")) {
                    String before=emit(component,phase,node,true).replaceAll("\\s+","");
                    String after=emit(component,phase,node,false).replaceAll("\\s+","");
                    StrategyChecks.check(before.equals(after),"Static regression: "+db+"/"+action+"/"+phase);
                }
            }
            // Owned connections: stub acquisition only; retain generated commit/rollback/cleanup.
            for(int every:new int[]{0,2}) {
                INode n=StrategyChecks.node(Map.of("MAPPING",mapping,"DIE_ON_ERROR","true","NO_OUTPUT",true,
                        "USE_EXISTING_CONNECTION","false","COMMIT_EVERY",String.valueOf(every),"DB_VERSION",db.equals("Mysql")?"MYSQL_8":"ORACLE_12",
                        "USE_BATCH_SIZE","true","RELATIONAL_STRATEGY_BATCH_SIZE","2","SCHEMA_DB","\"\"","TABLESCHEMA","\"\""),columns,false);
                String begin=emit(component,"begin",n,false);
                int start=begin.indexOf("java.sql.Connection conn_tMSSqlOutput_1 = null;");
                int stop=begin.indexOf("resourceMap.put(\"conn_tMSSqlOutput_1\"",start);
                StrategyChecks.check(start>=0 && stop>start,"Owned acquisition stub "+db);
                String retained="java.sql.Connection conn_tMSSqlOutput_1 = connection();\n";
                for(String variable:List.of("dbschema","tableName")) {
                    String declaration="String "+variable+"_tMSSqlOutput_1 = null;";
                    if(begin.substring(start,stop).contains(declaration))retained+=declaration+"\n";
                }
                begin=begin.substring(0,start)+retained+begin.substring(stop);
                String name="Owned"+db+every;
                Class<?> generated=compile(out,name,runtime(db),begin,emit(component,"main",n,false),emit(component,"end",n,false),emit(component,"finally",n,false));
                generated.getMethod("owned",int.class).invoke(generated.getConstructor().newInstance(),every);
            }
            // Bind complex/composite schemas using each native manager, with null-safe keys and case options.
            List<IMetadataColumn> complex=new ArrayList<>(columns);
            complex.add(StrategyChecks.column("tenant","id_Integer",true));
            complex.add(StrategyChecks.proxy(IMetadataColumn.class,Map.of("getName","changedAt","getLabel","changedAt","getOriginalDbColumnName","changedAt",
                    "getTalendType","id_Date","getType","TIMESTAMP","getPattern","\"yyyy-MM-dd\"","isNullable",true)));
            complex.add(StrategyChecks.column("amount","id_BigDecimal",false));
            for(String label:List.of("secondName","thirdName"))complex.add(StrategyChecks.proxy(IMetadataColumn.class,Map.of("getName",label,"getLabel",label,
                    "getOriginalDbColumnName",label,"getTalendType","id_String","getType",db.equals("Oracle")?"NVARCHAR2":"VARCHAR","isNullable",true)));
            if(db.equals("Postgresql"))complex.add(sqlColumn("uuidText","id_String","UUID"));
            if(db.equals("Oracle")) {
                complex.add(sqlColumn("clobText","id_String","CLOB"));
                complex.add(sqlColumn("blobData","id_byte[]","BLOB"));
                complex.add(sqlColumn("rawData","id_byte[]","RAW"));
                complex.add(sqlColumn("xmlData","id_Object","XMLTYPE"));
                complex.add(sqlColumn("clobData","id_Object","CLOB"));
                complex.add(sqlColumn("blobObject","id_Object","BLOB"));
                complex.add(sqlColumn("changedAtTZ","id_Date","TIMESTAMP WITH TIME ZONE"));
            }
            INode types=StrategyChecks.node(Map.of("MAPPING",mapping,"DIE_ON_ERROR","true","NO_OUTPUT",true,"DB_VERSION",db.equals("Mysql")?"MYSQL_8":"ORACLE_12",
                    "SUPPORT_NULL_WHERE","true","USE_BATCH_SIZE","true","RELATIONAL_STRATEGY_BATCH_SIZE","context.batchSize",
                    "CONVERT_COLUMN_TABLE_TO_LOWERCASE","true","CONVERT_COLUMN_TABLE_TO_UPPERCASE","true"),complex,false);
            compile(out,"Complex"+db,runtime(db),emit(component,"begin",types,false),emit(component,"main",types,false),emit(component,"end",types,false),emit(component,"finally",types,false));
            INode invalidLimit=StrategyChecks.node(Map.of("MAPPING",mapping,"DIE_ON_ERROR","true","NO_OUTPUT",true,"DB_VERSION",db.equals("Mysql")?"MYSQL_8":"ORACLE_12",
                    "USE_BATCH_SIZE","true","RELATIONAL_STRATEGY_BATCH_SIZE","0"),columns,false);
            String invalidBegin=emit(component,"begin",invalidLimit,false);
            StrategyChecks.check(invalidBegin.indexOf("int relationalBatchLimit_") < invalidBegin.indexOf("java.sql.Connection conn_"),"Limit validated after connection");
            Class<?> zero=compile(out,"ZeroLimit"+db,runtime(db),invalidBegin,emit(component,"main",invalidLimit,false),emit(component,"end",invalidLimit,false),emit(component,"finally",invalidLimit,false));
            zero.getMethod("zeroLimit").invoke(zero.getConstructor().newInstance());
            if(!db.equals("Postgresql")) {
                List<String> tableActions=new ArrayList<>(List.of("NONE","CLEAR","CREATE","CREATE_IF_NOT_EXISTS","DROP_CREATE","DROP_IF_EXISTS_AND_CREATE","TRUNCATE"));
                if(db.equals("Oracle"))tableActions.add("TRUNCATE_REUSE_STORAGE");
                for(String action:tableActions) {
                    INode n=StrategyChecks.node(Map.of("MAPPING",mapping,"DIE_ON_ERROR","true","NO_OUTPUT",true,"DB_VERSION",db.equals("Mysql")?"MYSQL_8":"ORACLE_12",
                            "USE_BATCH_SIZE","true","RELATIONAL_STRATEGY_BATCH_SIZE","2","TABLE_ACTION",action),columns,false);
                    String begin=emit(component,"begin",n,false);
                    boolean ddl=!List.of("NONE","CLEAR").contains(action);
                    StrategyChecks.check(begin.contains("Warning: this table action may implicitly commit")==ddl,"DDL warning visibility "+db+"/"+action);
                    StrategyChecks.check(!begin.contains("requires table action NONE"),"Shared table action blocked");
                    if(action.startsWith("TRUNCATE"))StrategyChecks.check(begin.contains("TRUNCATE TABLE"),"Native truncate missing "+db+"/"+action);
                    emit(component,"main",n,false);emit(component,"end",n,false);
                }
                System.out.println("PASS: "+db+" all shared-connection table actions generate; DDL warns; NONE/CLEAR do not warn");
            }
            // Configuration guard checks must reject early, before any connection/write.
            for(var override:List.of(Map.<String,Object>of("PARALLELIZE","true"),Map.<String,Object>of("USE_SPATIAL_OPTIONS","true"))) {
                var settings=new HashMap<String,Object>(override);settings.put("MAPPING",mapping);
                try{emit(component,"begin",StrategyChecks.node(settings,columns,false),false);throw new AssertionError("Invalid configuration accepted");}
                catch(java.lang.reflect.InvocationTargetException expected){StrategyChecks.check(expected.getCause() instanceof IllegalArgumentException,"Wrong configuration error");}
            }
            System.out.println("PASS: "+db+" actual JET emitters, generated row/batch job compilation and original static actions");
        }
    }
    static IMetadataColumn sqlColumn(String label,String talend,String sql) {
        return StrategyChecks.proxy(IMetadataColumn.class,Map.of("getName",label,"getLabel",label,"getOriginalDbColumnName",label,
                "getTalendType",talend,"getType",sql,"isNullable",true,"getPattern","\"yyyy-MM-dd\""));
    }
    static Class<?> compile(Path out,String name,String runtime,String begin,String main,String end,String cleanup) throws Exception {
        String code="import java.util.*; import java.sql.*; public class "+name+" {\n"+runtime
                +"public void run() throws Exception { row1Struct row1=null; acceptedStruct accepted=null; rejectedStruct rejected=null;try {\n"+begin
                +"for(row1Struct row:inputs){row1=row;\n"+main+"}\n"+end+"}finally{\n"+cleanup+"}}}";
        Path file=out.resolve(name+".java");Files.writeString(file,code);
        StrategyChecks.check(ToolProvider.getSystemJavaCompiler().run(null,null,null,"-proc:none","-cp",System.getProperty("java.class.path"),"-d",out.toString(),file.toString())==0,"Generated "+name+" compile");
        return Class.forName(name);
    }
    static String runtime(String db) {
        String r=BatchStrategyChecks.RUNTIME;
        r=r.replace("if(unknown)results[i]=Statement.SUCCESS_NO_INFO;","if(invalidCounts)results[i]=-1; else if(unknown)results[i]=Statement.SUCCESS_NO_INFO;");
        r=r.replace("Integer id; String name,relationalStrategy;", "Integer id,tenant; String name,relationalStrategy,secondName,thirdName; java.util.Date changedAt; java.math.BigDecimal amount; String uuidText,clobText; byte[] blobData,rawData; Object xmlData,clobData,blobObject; java.util.Date changedAtTZ;");
        r=r.replace("if(method.equals(\"close\")){closed++;return null;}","if(method.equals(\"close\")){if(!sql.startsWith(\"SELECT\"))closed++;return null;}");
        r=r.replace("Connection liveConnection;", "String database=\""+db+"\"; boolean affectedOnly, pgAborted, invalidCounts; int savepoints, releases, pointRollbacks; String engine=\"InnoDB\"; Connection liveConnection;");
        r=r.replace("String op=sql.split(\" \")[0]; operations.add(op);", "if(pgAborted)throw new SQLException(\"aborted transaction\"); String op=sql.split(\" \")[0]; operations.add(op);");
        r=r.replace("if(data.containsKey(id))throw new SQLException(\"duplicate\");", "if(data.containsKey(id)){if(database.equals(\"Postgresql\"))pgAborted=true;throw new SQLException(\"duplicate\");}");
        r=r.replace("if(op.equals(\"UPDATE\"))data.put", "if(op.equals(\"UPDATE\") && affectedOnly && Objects.equals(data.get(id),params.get(1)))return 0; if(op.equals(\"UPDATE\"))data.put");
        r=r.replace("if(method.equals(\"executeUpdate\"))", """
            if(method.equals("executeQuery")) {
                boolean found=sql.contains("information_schema") || data.containsKey((Integer)params.get(1));
                boolean[] first={true};
                return java.lang.reflect.Proxy.newProxyInstance(getClass().getClassLoader(),new Class<?>[]{ResultSet.class},(rs,rm,ra)-> {
                    if(rm.getName().equals("next")){boolean result=first[0] && found;first[0]=false;return result;}
                    if(rm.getName().equals("getString"))return engine;
                    return null;
                });
            }
            if(method.equals("executeUpdate"))
            """);
        r=r.replace("if(m.getName().equals(\"rollback\")){", """
            if(m.getName().equals("setSavepoint")) {
                if(pgAborted)throw new SQLException("aborted transaction");
                savepoints++; snapshots.put(savepoints,new HashMap<>(data));final int number=savepoints;
                return new Savepoint(){public int getSavepointId(){return number;}public String getSavepointName(){return "row"+number;}};
            }
            if(m.getName().equals("releaseSavepoint")){releases++;return null;}
            if(m.getName().equals("rollback") && a!=null && a.length==1) {
                pointRollbacks++;pgAborted=false;data.clear();data.putAll(snapshots.get(((Savepoint)a[0]).getSavepointId()));return null;
            }
            if(m.getName().equals("rollback")){pgAborted=false;
            """);
        return r+EXTRA;
    }
    static final String EXTRA="""
        static class TalendTimestampWithTZ extends java.util.Date {
            public java.sql.Timestamp getTimestamp(){return new java.sql.Timestamp(getTime());}
            public java.util.Calendar getCalendar(){return java.util.Calendar.getInstance();}
        }
        static class Context { int batchSize=2; } Context context=new Context();
        Map<Integer,Map<Integer,String>> snapshots=new HashMap<>();
        static class acceptedStruct extends row1Struct { acceptedStruct(){super(0,null,null);} }
        static class rejectedStruct extends row1Struct { String errorCode,errorMessage; rejectedStruct(){super(0,null,null);} }
        List<rejectedStruct> rejectedRows=new ArrayList<>();
        public void multi(boolean batches,boolean rejects) throws Exception {
            setup();
            if(rejects) {
                row(1,"A","INSERT");row(1,"duplicate","INSERT");row(2,"B","INSERT");run();
                require(data.equals(Map.of(1,"A",2,"B")) && rejectedRows.size()==1,"PG reject continuation "+data);
                if(database.equals("Postgresql"))require(savepoints==3 && pointRollbacks==1 && releases==3 && !pgAborted,"PG savepoint recovery");
                else require(savepoints==0 && pointRollbacks==0,"Unexpected savepoint");
                require(globalMap.get("tMSSqlOutput_1_NB_LINE_INSERTED").equals(2),"PG reject counter");return;
            }
            row(1,"A","INSERT");row(2,"B","INSERT");row(3,"C","INSERT");
            row(1,"D","UPDATE");row(1,"E","UPDATE");row(2,null,"DELETE");
            row(1,"F","UPSERT");row(4,"G","UPSERT");row(4,"H","UPDATE_OR_INSERT");row(5,"I","INSERT");run();
            require(data.equals(Map.of(1,"F",3,"C",4,"H",5,"I")),"mixed final state "+data);
            require(globalMap.get("tMSSqlOutput_1_NB_LINE_INSERTED").equals(5),"insert count");
            require(globalMap.get("tMSSqlOutput_1_NB_LINE_UPDATED").equals(4),"update count");
            require(globalMap.get("tMSSqlOutput_1_NB_LINE_DELETED").equals(1),"delete count");
            require(!connectionClosed && commits==0 && rollbacks==0,"shared ownership");
            require(batchSizes.equals(batches?List.of(2,1,2,1,1):List.of()),"ordered batch sizes "+batchSizes);
            if(database.equals("Mysql")) {
                Object x=getClass().getConstructor().newInstance();getClass().getMethod("unchangedUpsert").invoke(x);
                if(batches){x=getClass().getConstructor().newInstance();getClass().getMethod("nonTransactional").invoke(x);}
            }
            if(batches) {
                for(boolean generic:new boolean[]{false,true}) {
                    Object x=getClass().getConstructor().newInstance();getClass().getMethod("batchFailure",boolean.class).invoke(x,generic);
                }
                Object x=getClass().getConstructor().newInstance();getClass().getMethod("interrupted").invoke(x);
                x=getClass().getConstructor().newInstance();getClass().getMethod("unknownCounts").invoke(x);
                x=getClass().getConstructor().newInstance();getClass().getMethod("invalidBatchCounts").invoke(x);
            }
        }
        public void zeroLimit() throws Exception {
            setup();row(1,"A","INSERT");
            try{run();throw new AssertionError("zero limit accepted");}catch(IllegalArgumentException expected){}
            require(data.isEmpty() && operations.isEmpty() && batchSizes.isEmpty() && closed==0,"zero limit performed SQL");
        }
        public void invalidBatchCounts() throws Exception {
            setup();invalidCounts=true;row(1,"A","INSERT");
            try{run();throw new AssertionError("invalid update count accepted");}catch(SQLException expected){}
            require(data.isEmpty() && rollbacks==1,"invalid count rollback");
        }
        public void unchangedUpsert() throws Exception {
            setup();data.put(1,"A");affectedOnly=true;row(1,"A","UPSERT");row(2,"B","UPSERT");run();
            require(data.equals(Map.of(1,"A",2,"B")),"MySQL unchanged row inserted again");
            require(globalMap.get("tMSSqlOutput_1_NB_LINE_INSERTED").equals(1),"MySQL unchanged insert count");
        }
        public void nonTransactional() throws Exception {
            setup();engine="MyISAM";row(1,"A","INSERT");
            try{run();throw new AssertionError("MyISAM accepted for batches");}catch(SQLException expected){}
            require(data.isEmpty(),"MyISAM guard after writes");
        }
        public void batchFailure(boolean generic) throws Exception {
            setup();genericFailure=generic;row(1,"A","INSERT");row(generic?3:1,"B","INSERT");
            try{run();throw new AssertionError("batch failure accepted");}catch(SQLException expected){}
            require(data.isEmpty() && rollbacks==1 && batchSizes.size()==1,"batch rollback/no replay");
        }
        """;
}
