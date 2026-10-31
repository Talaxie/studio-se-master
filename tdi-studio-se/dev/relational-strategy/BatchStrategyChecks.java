import java.nio.file.*;
import java.util.*;
import javax.tools.ToolProvider;
import org.talend.core.model.process.INode;

/** Executes the emitted writer, including JDBC batch failure and cleanup paths. */
public class BatchStrategyChecks {
    public static void main(String[] args) throws Exception {
        Path out=Path.of(args[0]);
        java.sql.Connection live=null;
        if (System.getenv("RS_SQLSERVER_TESTS")!=null) {
            var reader=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            String url=reader.readLine(), user=reader.readLine(), cipher=reader.readLine();
            String password=(String)Class.forName("routines.system.PasswordEncryptUtil").getMethod("decryptPassword",String.class).invoke(null,cipher);
            live=java.sql.DriverManager.getConnection(url,user,password);
            try(var statement=live.createStatement()){statement.execute("CREATE TABLE #RS_GENERATED (id int PRIMARY KEY, name varchar(50) UNIQUE)");}
            live.setAutoCommit(false);
        }
        var columns=List.of(StrategyChecks.column("id","id_Integer",true),
                StrategyChecks.column("name","id_String",false),StrategyChecks.column("relationalStrategy","id_String",false));
        for (int limit: new int[]{2,50000,0}) {
            INode node=StrategyChecks.node(Map.of("DIE_ON_ERROR","true","NO_OUTPUT",true,
                    "RELATIONAL_STRATEGY_BATCH_SIZE",String.valueOf(limit),"TABLE",live==null?"\"target\"":"\"#RS_GENERATED\""),columns,false);
            String name="GeneratedBatches"+limit;
            String source="import java.util.*; import java.sql.*; public class "+name+" {\n"+RUNTIME
                +"public void run() throws Exception { row1Struct row1=null; try {\n"+StrategyChecks.emit("begin",node)
                +"for(row1Struct row: inputs) { row1=row; if (abort && row.id==99) throw new RuntimeException(\"upstream\");\n"
                +StrategyChecks.emit("main",node)+"}\n"+StrategyChecks.emit("end",node)
                +"}finally{\n"+StrategyChecks.emit("finally",node)+"}}}";
            Path file=out.resolve(name+".java");Files.writeString(file,source);
            StrategyChecks.check(ToolProvider.getSystemJavaCompiler().run(null,null,null,"-proc:none","-d",out.toString(),file.toString())==0,"Batch generated code compile");
            Class.forName(name).getMethod("verify",int.class).invoke(null,limit);
            if (live!=null && limit>0) Class.forName(name).getMethod("live",java.sql.Connection.class).invoke(Class.forName(name).getConstructor().newInstance(),live);
        }
        // Stub connection acquisition only; execute the actual generated owned transaction lifecycle.
        for(int every:new int[]{0,2}) {
            INode node=StrategyChecks.node(Map.of("DIE_ON_ERROR","true","NO_OUTPUT",true,
                    "RELATIONAL_STRATEGY_BATCH_SIZE","50000","USE_EXISTING_CONNECTION","false",
                    "COMMIT_EVERY",String.valueOf(every)),columns,false);
            String begin=StrategyChecks.emit("begin",node);
            int start=begin.indexOf("java.sql.Connection conn_tMSSqlOutput_1 = null;");
            int stop=begin.indexOf("resourceMap.put(\"conn_tMSSqlOutput_1\"",start);
            StrategyChecks.check(start>=0 && stop>start,"Owned connection acquisition stub");
            begin=begin.substring(0,start)+"java.sql.Connection conn_tMSSqlOutput_1 = connection();\n"+begin.substring(stop);
            String name="GeneratedOwned"+every;
            String source="import java.util.*; import java.sql.*; public class "+name+" {\n"+RUNTIME
                +"public void run() throws Exception { row1Struct row1=null; try {\n"+begin
                +"for(row1Struct row: inputs) { row1=row;\n"+StrategyChecks.emit("main",node)+"}\n"+StrategyChecks.emit("end",node)
                +"}finally{\n"+StrategyChecks.emit("finally",node)+"}}}";
            Path file=out.resolve(name+".java");Files.writeString(file,source);
            StrategyChecks.check(ToolProvider.getSystemJavaCompiler().run(null,null,null,"-proc:none","-d",out.toString(),file.toString())==0,"Owned generated code compile");
            Class.forName(name).getMethod("owned",int.class).invoke(Class.forName(name).getConstructor().newInstance(),every);
        }
        if(live!=null)live.close();
        System.out.println("PASS: emitted batches: configurable limits, tail flush, action order, upsert barrier, rollback, no replay, upstream abort, shared transaction, unknown counts and autocommit guard");
    }
    static final String RUNTIME="""
        static class TalendDate { static java.util.Date parseDate(String p,String v) throws Exception { return new java.text.SimpleDateFormat(p).parse(v); } }
        static class row1Struct { Integer id; String name,relationalStrategy;
            row1Struct(int i,String n,String s){id=i;name=n;relationalStrategy=s;} }
        Map<String,Object> globalMap=new HashMap<>(),resourceMap=new HashMap<>();
        Map<Integer,String> data=new HashMap<>(), committedData=new HashMap<>();
        List<row1Struct> inputs=new ArrayList<>(); List<String> operations=new ArrayList<>();
        List<Integer> batchSizes=new ArrayList<>();
        Connection liveConnection;
        int closed,rollbacks,commits; boolean abort,unknown,auto,connectionClosed,genericFailure;
        void row(int id,String value,String action){inputs.add(new row1Struct(id,value,action));}
        Object execute(String sql,Map<Integer,Object> params) throws SQLException {
            String op=sql.split(" ")[0]; operations.add(op);
            int id=(Integer)params.get(op.equals("UPDATE")?2:1);
            if (genericFailure && id==3) throw new SQLException("generic driver batch failure");
            if(op.equals("INSERT")) {
                if(data.containsKey(id))throw new SQLException("duplicate");
                data.put(id,(String)params.get(2)); return 1;
            }
            if(!data.containsKey(id))return 0;
            if(op.equals("UPDATE"))data.put(id,(String)params.get(1));else data.remove(id);
            return 1;
        }
        Connection connection() {
            if(liveConnection!=null)return liveConnection;
            return (Connection)java.lang.reflect.Proxy.newProxyInstance(getClass().getClassLoader(),new Class<?>[]{Connection.class},(p,m,a)-> {
                if(m.getName().equals("prepareStatement")) {
                    String sql=(String)a[0]; Map<Integer,Object> params=new HashMap<>();
                    List<Map<Integer,Object>> batch=new ArrayList<>();
                    return java.lang.reflect.Proxy.newProxyInstance(getClass().getClassLoader(),new Class<?>[]{PreparedStatement.class},(ps,pm,pa)-> {
                        String method=pm.getName();
                        if(method.startsWith("set") && pa.length>1 && pa[0] instanceof Integer) {
                            params.put((Integer)pa[0],method.equals("setNull")?null:pa[1]);return null;
                        }
                        if(method.equals("addBatch")){batch.add(new HashMap<>(params));return null;}
                        if(method.equals("clearBatch")){batch.clear();return null;}
                        if(method.equals("executeBatch")) {
                            batchSizes.add(batch.size()); int[] results=new int[batch.size()];
                            for(int i=0;i<results.length;i++) {
                                try {results[i]=(Integer)execute(sql,batch.get(i));}
                                catch(SQLException error){if(genericFailure)throw error;throw new BatchUpdateException("duplicate",new int[]{1,-3,1});}
                                if(unknown)results[i]=Statement.SUCCESS_NO_INFO;
                            }
                            return results;
                        }
                        if(method.equals("executeUpdate"))return execute(sql,params);
                        if(method.equals("close")){closed++;return null;}
                        return null;
                    });
                }
                if(m.getName().equals("getAutoCommit"))return auto;
                if(m.getName().equals("rollback")){rollbacks++;data.clear();data.putAll(committedData);return null;}
                if(m.getName().equals("commit")){commits++;committedData.clear();committedData.putAll(data);return null;}
                if(m.getName().equals("close")){connectionClosed=true;return null;}
                if(m.getName().equals("isClosed"))return connectionClosed;
                return null;
            });
        }
        void setup(){globalMap.put("conn_source",connection());globalMap.put("dbschema_source","");}
        static void require(boolean b,String message){if(!b)throw new AssertionError(message);}
        public static void verify(int limit) throws Exception {
            Class<?> cls=java.lang.invoke.MethodHandles.lookup().lookupClass();
            Object instance=cls.getConstructor().newInstance();cls.getMethod("exercise",int.class).invoke(instance,limit);
        }
        public void exercise(int limit) throws Exception {
            setup();
            if(limit==0){try{run();throw new AssertionError("zero accepted");}catch(IllegalArgumentException expected){}return;}
            row(1,"A","INSERT");row(2,"B","INSERT");row(3,"C","INSERT");
            row(1,"D","UPDATE");row(1,"E","UPDATE");row(2,null,"DELETE");
            row(1,"F","UPSERT");row(4,"G","UPSERT");row(4,"H","UPSERT");row(5,"I","INSERT");
            run();require(data.equals(Map.of(1,"F",3,"C",4,"H",5,"I")),"ordered final state "+data);
            require(operations.equals(List.of("INSERT","INSERT","INSERT","UPDATE","UPDATE","DELETE","UPDATE","UPDATE","INSERT","UPDATE","INSERT")),"order "+operations);
            require(batchSizes.equals(limit==2?List.of(2,1,2,1,1):List.of(3,2,1,1)),"limits "+batchSizes);
            require(globalMap.get("tMSSqlOutput_1_NB_LINE_INSERTED").equals(5),"insert count");
            require(globalMap.get("tMSSqlOutput_1_NB_LINE_UPDATED").equals(4),"update count");
            require(closed==3 && !connectionClosed && commits==0 && rollbacks==0,"shared ownership");
            // A failed flush is never retried from finally; both JDBC exception classes roll back.
            for(boolean generic:new boolean[]{false,true}) {
                Object x=getClass().getConstructor().newInstance();getClass().getMethod("failure",boolean.class).invoke(x,generic);
            }
            Object x=getClass().getConstructor().newInstance();getClass().getMethod("interrupted").invoke(x);
            x=getClass().getConstructor().newInstance();getClass().getMethod("unknownCounts").invoke(x);
            x=getClass().getConstructor().newInstance();getClass().getMethod("autocommit").invoke(x);
        }
        public void failure(boolean generic) throws Exception {
            setup();genericFailure=generic;row(1,"A","INSERT");row(generic?3:1,"B","INSERT");
            try{run();throw new AssertionError("failure not thrown");}catch(SQLException expected){}
            require(data.isEmpty() && rollbacks==1 && closed==3 && batchSizes.size()==1,"rollback and no replay");
        }
        public void interrupted() throws Exception {
            setup();abort=true;row(1,"A","INSERT");row(2,"B","INSERT");row(99,"abort","INSERT");
            try{run();throw new AssertionError("abort not thrown");}catch(RuntimeException expected){}
            require(data.isEmpty() && rollbacks==1 && closed==3,"upstream interruption rollback");
        }
        public void unknownCounts() throws Exception {
            setup();unknown=true;row(1,"A","INSERT");run();
            require(globalMap.get("tMSSqlOutput_1_NB_LINE_BATCH_UNKNOWN").equals(1),"unknown counts");
            require(globalMap.get("tMSSqlOutput_1_NB_LINE_INSERTED").equals(0),"unknown invented rows");
        }
        public void owned(int every) throws Exception {
            setup();row(1,"A","INSERT");row(2,"B","INSERT");row(3,"C","INSERT");
            run();require(data.size()==3 && commits==(every==0?1:2) && rollbacks==0 && connectionClosed,"owned commits");
            Object x=getClass().getConstructor().newInstance();getClass().getMethod("ownedFailure",int.class).invoke(x,every);
            System.out.println("PASS: owned generated writer: commitEvery="+every+", flush before commit, final commit and rollback since last commit");
        }
        public void ownedFailure(int every) throws Exception {
            setup();row(1,"A","INSERT");row(2,"B","INSERT");row(3,"C","INSERT");row(3,"D","INSERT");
            try{run();throw new AssertionError("owned failure accepted");}catch(SQLException expected){}
            require(data.equals(every==0?Map.of():Map.of(1,"A",2,"B")) && rollbacks==1 && connectionClosed,"owned rollback boundary "+data);
        }
        public void live(Connection c) throws Exception {
            liveConnection=c; setup();
            row(1,"A","INSERT");row(2,"B","INSERT");row(1,"C","UPDATE");row(1,"D","UPDATE");
            row(2,null,"DELETE");row(1,"E","UPSERT");row(3,"F","UPSERT");row(3,"G","UPSERT");
            run();
            try(var st=c.createStatement();var rs=st.executeQuery("SELECT id,name FROM #RS_GENERATED ORDER BY id")) {
                require(rs.next() && rs.getInt(1)==1 && rs.getString(2).equals("E"),"live first row");
                require(rs.next() && rs.getInt(1)==3 && rs.getString(2).equals("G") && !rs.next(),"live upsert order");
            }
            c.rollback();
            try(var st=c.createStatement()){st.execute("INSERT INTO #RS_GENERATED VALUES (1,'A'),(2,'B')");}
            inputs.clear();resourceMap.clear();row(2,null,"DELETE");row(1,"B","UPDATE");run();
            try(var st=c.createStatement();var rs=st.executeQuery("SELECT id,name FROM #RS_GENERATED")) {
                require(rs.next() && rs.getInt(1)==1 && rs.getString(2).equals("B") && !rs.next(),"live different-key unique dependency");
            }
            c.rollback();
            for(String setting:List.of("OFF","ON")) {
                try(var st=c.createStatement()){st.execute("SET XACT_ABORT "+setting);}
                inputs.clear();resourceMap.clear(); row(1,"A","INSERT");row(1,"B","INSERT");row(2,"C","INSERT");
                try{run();throw new AssertionError("live duplicate accepted");}catch(SQLException expected){}
                try(var st=c.createStatement();var rs=st.executeQuery("SELECT COUNT(*) FROM #RS_GENERATED")) {
                    rs.next();require(rs.getInt(1)==0,"live partial batch rollback "+setting);
                }
                c.rollback();
            }
            System.out.println("PASS: live SQL Server generated writer: mixed actions, repeated-key UPSERT, different-key unique dependency, batch errors XACT_ABORT OFF/ON and full rollback");
        }
        public void autocommit() throws Exception {
            setup();auto=true;row(1,"A","INSERT");
            try{run();throw new AssertionError("autocommit accepted");}catch(SQLException expected){}
            require(data.isEmpty() && batchSizes.isEmpty() && !connectionClosed,"autocommit guard before writes");
        }
        """;
}
