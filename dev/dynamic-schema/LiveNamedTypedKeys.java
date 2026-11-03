import java.sql.*;
import java.util.*;
import java.math.BigDecimal;
import java.nio.file.*;
import java.io.*;
import routines.system.*;

/** Exact decimal/NULL runtime keys and batch rollback against isolated synthetic tables. */
public class LiveNamedTypedKeys extends LiveDmlOutputSupport {
    protected void execute(ResultSet unused) { }
    static Dynamic readSchema(ResultSet rs,String db)throws SQLException {
        return db.equals("mssql")?DynamicUtils.createMssqlDynamic(rs.getMetaData(),0):DynamicJdbc.create(rs.getMetaData(),0,id(db));
    }
    static void read(Dynamic d,ResultSet rs,String db)throws SQLException {
        if(db.equals("mssql"))DynamicUtils.readColumnsFromDatabase_Mssql(d,rs,0,null,false);else DynamicJdbc.read(d,rs,0,false);
    }
    static DynamicDml writer(Connection c,String db,String table,Dynamic schema,String action,boolean batch,String...keys)throws Exception {
        return new DynamicDml(c,id(db),null,db.equals("oracle")?table.toLowerCase(Locale.ROOT):table,action,new DynamicMetadata[0],schema,keys,true,false,false,batch,2,0);
    }
    static void test(String db)throws Exception {
        String table="TDYN_KEY_"+UUID.randomUUID().toString().replace("-","").substring(0,18).toUpperCase(Locale.ROOT), qt=quote(table,db), key=quote("ID",db), payload=quote("PAYLOAD",db);
        BigDecimal huge=new BigDecimal("1234567890123456789012345678.1234567890");
        try(Connection c=connect(db)) {
            boolean created=false;
            try {
                try(Statement ddl=c.createStatement()) {ddl.execute("CREATE TABLE "+qt+" ("+key+" DECIMAL(38,10), "+payload+(db.equals("oracle")?" VARCHAR2(50)":" VARCHAR(50)")+", UNIQUE ("+key+"), CHECK ("+payload+" <> 'bad'))");created=true;}
                try(PreparedStatement seed=c.prepareStatement("INSERT INTO "+qt+" VALUES (?,?)")) {
                    for(BigDecimal number:new BigDecimal[]{BigDecimal.ZERO,huge,null,BigDecimal.ONE}) {
                        seed.setBigDecimal(1,number);seed.setString(2,BigDecimal.ONE.equals(number)?"keep":"legacy");seed.executeUpdate();
                    }
                }
                Dynamic metadata;List<Dynamic> rows=new ArrayList<>();
                try(Statement s=c.createStatement();ResultSet rs=s.executeQuery("SELECT * FROM "+qt+" WHERE "+payload+"='legacy'")) {
                    metadata=readSchema(rs,db);while(rs.next()){read(metadata,rs,db);rows.add(metadata.copy());}
                }
                require(rows.size()==3,"Decimal fixture row count");c.setAutoCommit(false);
                for(String[] keys:new String[][]{{"ABSENT"},{"ID","ID"}}) {
                    try(DynamicDml w=writer(c,db,table,metadata,"UPDATE",false,keys)){w.tableAction("DROP_IF_EXISTS_AND_CREATE");throw new AssertionError("Invalid names accepted");}
                    catch(SQLException expected){require("42000".equals(expected.getSQLState()),"Unexpected config SQLState");}
                }
                try(DynamicDml w=writer(c,db,table,metadata,"UPDATE",true,"ID")) {
                    for(Dynamic row:rows){row.setColumnValue(1,"updated €");w.write(new Object[0],row);}w.finish();c.commit();require(w.updated==3,"Typed UPDATE count");
                }
                try(Statement s=c.createStatement();ResultSet rs=s.executeQuery("SELECT * FROM "+qt)) {
                    int count=0;while(rs.next()){count++;require((BigDecimal.ONE.compareTo(rs.getBigDecimal(1)==null?BigDecimal.TEN:rs.getBigDecimal(1))==0?"keep":"updated €").equals(rs.getString(2)),"Typed UPDATE changed an unrelated row");}require(count==4,"Typed keys were lost");
                }
                try(DynamicDml w=writer(c,db,table,metadata,"DELETE",true,"ID")) {
                    for(Dynamic row:rows)if(row.getColumnValue(0)==null||((BigDecimal)row.getColumnValue(0)).signum()==0)w.write(new Object[0],row);
                    w.finish();c.commit();require(w.deleted==2,"NULL/zero DELETE count");
                }
                for(String action:new String[]{"INSERT_OR_UPDATE","UPDATE_OR_INSERT"})try(DynamicDml w=writer(c,db,table,metadata,action,false,"ID")) {
                    for(Dynamic row:rows){row.setColumnValue(1,"upsert €");w.write(new Object[0],row);w.write(new Object[0],row);}w.finish();c.commit();
                }
                try(Statement s=c.createStatement();ResultSet rs=s.executeQuery("SELECT COUNT(*) FROM "+qt+" WHERE "+key+" IS NULL")){require(rs.next()&&rs.getInt(1)==1,"Upsert duplicated NULL key");}
                try(PreparedStatement p=c.prepareStatement("SELECT "+payload+" FROM "+qt+" WHERE "+key+"=?")){p.setBigDecimal(1,huge);try(ResultSet rs=p.executeQuery()){require(rs.next()&&"upsert €".equals(rs.getString(1)),"High precision correspondence key changed");}}
                Dynamic good=rows.get(0).copy(),bad=rows.get(1).copy();good.setColumnValue(1,"uncommitted");bad.setColumnValue(1,"bad");
                try(DynamicDml w=writer(c,db,table,metadata,"UPDATE",true,"ID")) {
                    w.write(new Object[0],good);w.write(new Object[0],bad);w.finish();throw new AssertionError("Batch constraint failure ignored");
                }catch(SQLException expected){/* Writer rolls back every write in the current transaction. */}
                try(Statement s=c.createStatement();ResultSet rs=s.executeQuery("SELECT COUNT(*) FROM "+qt+" WHERE "+payload+"='uncommitted'")){require(rs.next()&&rs.getInt(1)==0,"Failed batch partially persisted");}
                c.commit();System.out.println("PASS "+db+" decimal/NULL/zero named keys, both upserts, invalid-name no-DDL and batch rollback");
            } finally {if(created){c.setAutoCommit(true);try(Statement ddl=c.createStatement()){ddl.execute("DROP TABLE "+qt);}}}
        }
    }
    public static void main(String[]args)throws Exception {
        try(InputStream in=Files.newInputStream(Paths.get(args[0]))){config.load(in);}
        for(String db:Arrays.asList("mssql","oracle","mysql","postgres"))test(db);
    }
}
