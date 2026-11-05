package routines.system;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Proxy;
import java.sql.*;
import java.math.BigDecimal;
import java.util.*;

public class DynamicDmlTest {
    private static class Jdbc {
        String sql; int executions, commits, rollbacks, closes, queued; boolean transactional, failBatch;
        final Map<Integer,Object> parameters = new TreeMap<Integer,Object>();
        Connection connection() {
            return (Connection) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Connection.class}, (p,m,a) -> {
                switch(m.getName()) {
                case "prepareStatement": sql=(String)a[0]; return statement();
                case "createStatement": return Proxy.newProxyInstance(getClass().getClassLoader(),new Class[]{Statement.class},(x,y,z)->{if(y.getName().equals("execute")){sql=(String)z[0];return false;}return zero(y.getReturnType());});
                case "getAutoCommit": return !transactional;
                case "commit": commits++; return null;
                case "rollback": rollbacks++; return null;
                case "setSavepoint": return Proxy.newProxyInstance(getClass().getClassLoader(),new Class[]{Savepoint.class},(x,y,z)->null);
                default: return zero(m.getReturnType());
                }
            });
        }
        PreparedStatement statement() {
            return (PreparedStatement) Proxy.newProxyInstance(getClass().getClassLoader(),new Class[]{PreparedStatement.class},(p,m,a)->{
                switch(m.getName()) {
                case "clearParameters": parameters.clear(); return null;
                case "addBatch": queued++; return null;
                case "executeBatch": if(failBatch)throw new BatchUpdateException("fixture failure",new int[]{1});int[] counts=new int[queued];Arrays.fill(counts,1);queued=0;return counts;
                case "executeUpdate": executions++; return 1;
                case "close": closes++;return null;
                default:
                    if(m.getName().startsWith("set") && a!=null&&a.length>=2)parameters.put((Integer)a[0],m.getName().equals("setNull")?null:a[1]);
                    return zero(m.getReturnType());
                }
            });
        }
        Object zero(Class<?> t) { return t==boolean.class?false:t==int.class?0:null; }
    }
    private Dynamic data(String db) {
        Dynamic d=new Dynamic();d.setDbmsId(db);
        DynamicMetadata amount=DynamicDml.column("VALUE","id_BigDecimal","DECIMAL",38,10,true,false);amount.setDbTypeId(Types.DECIMAL);
        DynamicMetadata key=DynamicDml.column("KEY","id_String","VARCHAR",20,0,true,false);key.setDbTypeId(Types.VARCHAR);
        d.metadatas.add(amount);d.metadatas.add(key);d.addColumnValue(new BigDecimal("123456789012345678.1234567890"));d.addColumnValue("K1");return d;
    }
    private DynamicDml writer(Jdbc jdbc,String db,String action,Dynamic d,String... keys)throws Exception {
        return new DynamicDml(jdbc.connection(),db,null,"target",action,new DynamicMetadata[0],d,keys,true,false,false,false,2,0);
    }
    @Test public void fourDialectsBindPayloadBeforePhysicalKeysWithoutMutatingInput()throws Exception {
        for(String db:Arrays.asList("id_MSSQL","oracle_id","mysql_id","postgres_id")) {
            Jdbc jdbc=new Jdbc();Dynamic d=data(db);try(DynamicDml w=writer(jdbc,db,"UPDATE",d,"KEY")) {
                w.write(new Object[0],d);assertEquals(1,w.updated);assertEquals(1,w.inputs);
                assertTrue(jdbc.sql.startsWith("UPDATE "));assertTrue(jdbc.sql.contains(" IS NULL AND ? = 1"));
                assertEquals(d.getColumnValue(0),jdbc.parameters.get(1));assertEquals("K1",jdbc.parameters.get(2));assertEquals(0,jdbc.parameters.get(3));
                assertFalse(d.getColumnMetadata(1).isKey());assertEquals("KEY",d.getColumnMetadata(1).getName());
            }
        }
    }
    @Test public void compositeStaticAndDynamicKeysKeepNullFlagOffsets()throws Exception {
        Jdbc jdbc=new Jdbc();Dynamic d=data("postgres_id");d.setColumnValue(1,null);
        try(DynamicDml w=new DynamicDml(jdbc.connection(),"postgres_id","public","target","UPDATE",
                new DynamicMetadata[]{DynamicDml.column("STATIC","id_Integer","INTEGER",10,0,true,true)},d,new String[]{"KEY"},true,false,false,false,2,0)) {
            w.write(new Object[]{7},d);assertEquals(7,jdbc.parameters.get(2));assertEquals(0,jdbc.parameters.get(3));assertNull(jdbc.parameters.get(4));assertEquals(1,jdbc.parameters.get(5));
            assertTrue(jdbc.sql.contains("\"STATIC\" = ?"));assertTrue(jdbc.sql.contains("\"KEY\" = ?"));
        }
    }
    @Test public void invalidNamesAndCollisionsFailBeforeAnySql()throws Exception {
        for(String[] keys:new String[][]{ {},{"missing"},{"KEY","KEY"},{""},{"key"} }) {
            Jdbc jdbc=new Jdbc();try{writer(jdbc,"postgres_id","DELETE",data("postgres_id"),keys);fail("Invalid key accepted");}
            catch(SQLException expected){assertEquals("42000",expected.getSQLState());}assertNull(jdbc.sql);assertEquals(0,jdbc.executions);
        }
        Jdbc jdbc=new Jdbc();Dynamic d=data("postgres_id");d.getColumnMetadata(0).setName("KEY");
        try{writer(jdbc,"postgres_id","DELETE",d,"KEY");fail("Ambiguous name accepted");}catch(SQLException expected){assertNull(jdbc.sql);}
    }
    @Test public void identifiersAreQuotedAndMetadataChangesCannotUseStaleParameters()throws Exception {
        Jdbc jdbc=new Jdbc();Dynamic d=data("id_MSSQL");d.getColumnMetadata(1).setName("a]b");
        try(DynamicDml w=writer(jdbc,"id_MSSQL","DELETE",d,"a]b")) {
            w.write(new Object[0],d);assertTrue(jdbc.sql.contains("[a]]b]"));
            d.getColumnMetadata(1).setName("changed");try{w.write(new Object[0],d);fail("Schema drift accepted");}catch(SQLException expected){assertEquals(1,jdbc.executions);}
        }
    }
    @Test public void keyOnlyUpdateUsesNoPayloadParameters()throws Exception {
        Jdbc jdbc=new Jdbc();Dynamic d=data("postgres_id");d.metadatas.remove(0);d.clearColumnValues();d.addColumnValue("K1");
        try(DynamicDml w=writer(jdbc,"postgres_id","UPDATE",d,"KEY")) {w.write(new Object[0],d);assertTrue(jdbc.sql.contains("SET \"KEY\" = \"KEY\""));assertEquals("K1",jdbc.parameters.get(1));assertEquals(0,jdbc.parameters.get(2));}
    }
    @Test public void batchFlushesAtCommitAndRollbackClosesStatementsOnFailure()throws Exception {
        Jdbc jdbc=new Jdbc();jdbc.transactional=true;Dynamic d=data("postgres_id");
        DynamicDml w=new DynamicDml(jdbc.connection(),"postgres_id",null,"target","UPDATE",new DynamicMetadata[0],d,new String[]{"KEY"},true,false,false,true,10,0);
        w.write(new Object[0],d);assertEquals(0,w.updated);w.commitEvery(1);assertEquals(1,w.updated);assertEquals(1,jdbc.commits);
        jdbc.failBatch=true;w.write(new Object[0],d);try{w.finish();fail("Batch error ignored");}catch(SQLException expected){assertEquals(1,jdbc.rollbacks);assertEquals(1,jdbc.closes);}
    }
    @Test public void oracleKeepsNativeUnquotedIdentifierFoldingAndExplicitQuotedNames()throws Exception {
        Jdbc jdbc=new Jdbc();Dynamic d=data("oracle_id");
        try(DynamicDml w=new DynamicDml(jdbc.connection(),"oracle_id","sakila","lower_table","DELETE",new DynamicMetadata[0],d,new String[]{"KEY"},false,false,false,false,2,0)) {
            w.write(new Object[0],d);assertTrue(jdbc.sql.contains("\"SAKILA\".\"LOWER_TABLE\""));
        }
        try(DynamicDml w=new DynamicDml(jdbc.connection(),"oracle_id","\"Mixed\"","\"lower_table\"","DELETE",new DynamicMetadata[0],d,new String[]{"KEY"},false,false,false,false,2,0)) {
            w.write(new Object[0],d);assertTrue(jdbc.sql.contains("\"Mixed\".\"lower_table\""));
        }
    }
    @Test public void sqlServerStaticDateAndBinaryKeepTheirDeclaredDdlWithNamedKeys()throws Exception {
        Jdbc jdbc=new Jdbc();Dynamic d=data("id_MSSQL");
        try(DynamicDml w=new DynamicDml(jdbc.connection(),"id_MSSQL",null,"target","UPDATE_OR_INSERT",
                new DynamicMetadata[]{DynamicDml.column("DT","id_Date","DATETIME2",0,7,true,true),DynamicDml.column("BIN","id_byte[]","VARBINARY",50,0,true,false)},
                d,new String[]{"KEY"},true,false,false,false,2,0)) {
            w.tableAction("CREATE");assertTrue(jdbc.sql.contains("[DT] DATETIME2(7) NOT NULL"));assertTrue(jdbc.sql.contains("[BIN] VARBINARY(50) NULL"));assertTrue(jdbc.sql.contains("PRIMARY KEY ([DT], [KEY])"));
        }
    }
}
