import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.time.*;
import java.util.*;

/** Small live SQL Server tests. Only a connection-local temporary table is written. */
public class BatchOrderChecks {
    static final String TABLE="#RS_BATCH_ORDER";
    static Connection c;
    static List<String> output=new ArrayList<>();
    static void require(boolean ok,String message) { if(!ok)throw new AssertionError(message); }
    static void sql(String text) throws SQLException {try(Statement s=c.createStatement()){s.setQueryTimeout(30);s.execute(text);}}
    static String state() throws SQLException {
        List<String> values=new ArrayList<>();
        try(Statement s=c.createStatement(); ResultSet r=s.executeQuery("SELECT actor_id,actor_name FROM "+TABLE+" ORDER BY actor_id")){
            while(r.next())values.add(r.getInt(1)+":"+r.getString(2));
        }
        return String.join(",",values);
    }
    static int xactState() throws SQLException {try(Statement s=c.createStatement();ResultSet r=s.executeQuery("SELECT XACT_STATE()")){r.next();return r.getInt(1);}}
    static void reset() throws SQLException {c.rollback();sql("SET XACT_ABORT OFF");require(state().isEmpty(),"Temporary table not empty at start");}
    static void emit(String name,String kind,String observed,String details) {
        String line=String.join(";",name,"PASS",kind,observed,details.replace(';',','));
        output.add(line);System.out.println(line);
    }
    static void rollbackCheck() throws SQLException {c.rollback();require(state().isEmpty(),"Rollback did not restore the empty baseline");}
    static void good(String name,int max,List<Op> ops,String seed,String expected) throws Exception {
        reset();if(!seed.isEmpty())sql(seed);
        List<String> flushes;
        try(OrderedWriter w=new OrderedWriter(max)){
            for(Op op:ops)w.accept(op);
            w.flush();flushes=new ArrayList<>(w.flushes);
            require(!c.getAutoCommit(),"Writer changed autocommit");
            require(expected.equals(state()),"Unexpected final state: "+state());
        }
        rollbackCheck();emit(name,"ordered_batches",expected,"flushes="+flushes+", rollback=empty, autocommit=false");
    }
    record Op(String type,int id,String name) {}
    static Op op(String type,int id,String name){return new Op(type,id,name);}
    static class OrderedWriter implements AutoCloseable {
        PreparedStatement insert,update,delete;String pending=null;int count=0,max;List<String> flushes=new ArrayList<>();
        OrderedWriter(int max) throws SQLException {
            this.max=max;
            insert=c.prepareStatement("INSERT INTO "+TABLE+"(actor_id,actor_name) VALUES (?,?)");
            update=c.prepareStatement("UPDATE "+TABLE+" SET actor_name=? WHERE actor_id=?");
            delete=c.prepareStatement("DELETE FROM "+TABLE+" WHERE actor_id=?");
            for(PreparedStatement p:List.of(insert,update,delete))p.setQueryTimeout(30);
        }
        PreparedStatement statement(String action){return switch(action){case "INSERT"->insert;case "UPDATE"->update;case "DELETE"->delete;default->throw new IllegalArgumentException(action);};}
        void bind(Op o) throws SQLException {
            switch(o.type){
                case "INSERT"->{insert.setInt(1,o.id);insert.setNString(2,o.name);}
                case "UPDATE","UPSERT"->{update.setNString(1,o.name);update.setInt(2,o.id);}
                case "DELETE"->delete.setInt(1,o.id);
            }
        }
        void accept(Op o) throws SQLException {
            if(o.type.equals("UPSERT")){
                flush();bind(o);int n=update.executeUpdate();flushes.add("UPSERT_UPDATE:"+n);
                if(n==0){bind(op("INSERT",o.id,o.name));insert.executeUpdate();flushes.add("UPSERT_INSERT:1");}
                return;
            }
            if(pending!=null&&!pending.equals(o.type))flush();
            pending=o.type;bind(o);statement(pending).addBatch();count++;
            if(count>=max)flush();
        }
        void flush() throws SQLException {
            if(count==0)return;
            PreparedStatement p=statement(pending);int[] counts=p.executeBatch();p.clearBatch();
            flushes.add(pending+":"+count+":"+Arrays.toString(counts));pending=null;count=0;
        }
        public void close() throws SQLException {insert.close();update.close();delete.close();}
    }
    static void reorderedInsertUpdate() throws Exception {
        reset();
        try(OrderedWriter w=new OrderedWriter(50000)){
            w.bind(op("INSERT",42,"Alice"));w.insert.addBatch();
            w.bind(op("UPDATE",42,"Bob"));int updated=w.update.executeUpdate();
            w.insert.executeBatch();require(updated==0&&state().equals("42:Alice"),"Expected ordering hazard was not reproduced");
        }
        rollbackCheck();emit("reordered_insert_update","hazard_reproduced","42:Alice","expected sequential=42:Bob, same transaction, rollback=empty");
    }
    static void naiveBatchedUpsert() throws Exception {
        reset();int[] updates;String exception="none";
        try(OrderedWriter w=new OrderedWriter(50000)){
            for(String name:List.of("Alice","Bob")){w.bind(op("UPDATE",42,name));w.update.addBatch();}
            updates=w.update.executeBatch();require(Arrays.equals(updates,new int[]{0,0}),"Expected both updates to miss");
            for(String name:List.of("Alice","Bob")){w.bind(op("INSERT",42,name));w.insert.addBatch();}
            try{w.insert.executeBatch();throw new AssertionError("Expected duplicate-key error");}
            catch(BatchUpdateException e){exception="error="+e.getErrorCode()+", update_counts="+Arrays.toString(updates);}
        }
        rollbackCheck();emit("naive_two_phase_upsert","hazard_reproduced","duplicate_key",exception+", rollback=empty");
    }
    static void rollbackExistingRow() throws Exception {
        reset();sql("INSERT INTO "+TABLE+" VALUES(42,N'Old')");c.commit();
        try(OrderedWriter w=new OrderedWriter(50000)){
            w.accept(op("UPDATE",42,"Changed"));w.accept(op("INSERT",43,"Extra"));w.flush();
            require(state().equals("42:Changed,43:Extra"),"Writes were not applied before rollback");
        }
        c.rollback();require(state().equals("42:Old"),"Rollback did not preserve the pre-existing committed row");
        sql("DELETE FROM "+TABLE);c.commit();
        emit("rollback_preserves_existing_row","rollback","42:Old","committed seed only in local temp table, UPDATE and INSERT undone");
    }
    static void reorderedUniqueDependency() throws Exception {
        reset();sql("INSERT INTO "+TABLE+" VALUES(1,N'A'),(2,N'B')");int code=0;
        try(OrderedWriter w=new OrderedWriter(50000)){
            w.bind(op("DELETE",2,null));w.delete.addBatch();
            w.bind(op("UPDATE",1,"B"));
            try{w.update.executeUpdate();throw new AssertionError("Expected a unique-constraint error before the buffered DELETE");}
            catch(SQLException e){code=e.getErrorCode();require(code==2627||code==2601,"Unexpected constraint error: "+code);}
        }
        rollbackCheck();emit("reordered_different_keys_unique_dependency","hazard_reproduced","unique_violation","different actor_id keys, UPDATE before buffered DELETE, error="+code+", rollback=empty");
    }
    static void batchError(boolean xactAbort) throws Exception {
        reset();sql("SET XACT_ABORT "+(xactAbort?"ON":"OFF"));
        String counts="",observed="",error="";int xs=0;
        try(OrderedWriter w=new OrderedWriter(50000)){
            for(Op o:List.of(op("INSERT",1,"A"),op("INSERT",1,"B"),op("INSERT",2,"C"))){w.bind(o);w.insert.addBatch();}
            try{w.insert.executeBatch();throw new AssertionError("Expected duplicate-key error");}
            catch(SQLException e){counts=e instanceof BatchUpdateException ? Arrays.toString(((BatchUpdateException)e).getUpdateCounts()) : "unavailable";error="type="+e.getClass().getSimpleName()+", error="+e.getErrorCode()+", SQLState="+e.getSQLState();}
            xs=xactState();
            try{observed=state();}catch(SQLException e){observed="query_error_"+e.getErrorCode();}
            if(!xactAbort)require(observed.contains("1:A")&&observed.contains("2:C"),"Expected partial execution with XACT_ABORT OFF: "+observed);
        }
        rollbackCheck();sql("SET XACT_ABORT OFF");
        emit("error_and_rollback_xact_abort_"+(xactAbort?"on":"off"),"rollback",observed,"counts="+counts+", XACT_STATE="+xs+", "+error+", after rollback=empty");
    }
    public static void main(String[] args) throws Exception {
        // Connection details arrive on stdin; neither credentials nor their ciphertext are logged or stored here.
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in,java.nio.charset.StandardCharsets.UTF_8));
        String url=input.readLine(),user=input.readLine(),cipher=input.readLine();
        String password=routines.system.PasswordEncryptUtil.decryptPassword(cipher);
        DriverManager.setLoginTimeout(15);Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        try(Connection connection=DriverManager.getConnection(url,user,password)){
            c=connection;password=null;
            System.out.println("SQL Server="+c.getMetaData().getDatabaseProductVersion()+", JDBC="+c.getMetaData().getDriverVersion());
            // Committed DDL only creates a session-local temporary table, automatically removed on close.
            sql("CREATE TABLE "+TABLE+" (actor_id INT NOT NULL PRIMARY KEY,actor_name NVARCHAR(50) NOT NULL UNIQUE)");
            c.setAutoCommit(false);
            good("insert_then_update",50000,List.of(op("INSERT",42,"Alice"),op("UPDATE",42,"Bob")),"","42:Bob");
            good("delete_then_insert",50000,List.of(op("DELETE",42,null),op("INSERT",42,"New")),"INSERT INTO "+TABLE+" VALUES(42,N'Old')","42:New");
            good("same_key_updates_in_one_batch",50000,List.of(op("UPDATE",42,"First"),op("UPDATE",42,"Last")),"INSERT INTO "+TABLE+" VALUES(42,N'Old')","42:Last");
            good("two_upserts_same_absent_key",50000,List.of(op("UPSERT",42,"Alice"),op("UPSERT",42,"Bob")),"","42:Bob");
            List<Op> mixed=List.of(op("INSERT",1,"A"),op("INSERT",2,"B"),op("UPDATE",1,"C"),op("DELETE",2,null),op("INSERT",2,"D"),op("UPSERT",3,"E"),op("UPSERT",3,"F"),op("UPDATE",2,"G"));
            good("mixed_flush_on_action_change",50000,mixed,"","1:C,2:G,3:F");
            good("mixed_flush_on_size_limit",2,mixed,"","1:C,2:G,3:F");
            good("different_keys_unique_dependency",50000,List.of(op("DELETE",2,null),op("UPDATE",1,"B")),"INSERT INTO "+TABLE+" VALUES(1,N'A'),(2,N'B')","1:B");
            reorderedInsertUpdate();reorderedUniqueDependency();naiveBatchedUpsert();batchError(false);batchError(true);rollbackExistingRow();
            c.rollback();
        }
        Path report=Path.of(args[0]);Files.createDirectories(report.getParent());
        Files.writeString(report,"test;status;kind;observed;details\n"+String.join("\n",output)+"\n");
        System.out.println("PASS: "+output.size()+" live SQL Server checks. Connection closed; local temporary table removed.");
    }
}
