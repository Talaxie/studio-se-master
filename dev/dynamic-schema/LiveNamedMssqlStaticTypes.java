import java.sql.*;
import java.util.*;
import java.nio.file.*;
import java.io.*;
import routines.system.*;

/** Mixed static Timestamp key, static binary payload and named Dynamic string key. */
public class LiveNamedMssqlStaticTypes extends LiveDmlOutputSupport {
    protected void execute(ResultSet unused) { }
    public static void main(String[] args)throws Exception {
        try(InputStream in=Files.newInputStream(Paths.get(args[0]))){config.load(in);}
        String table="TDYN_KEY_"+UUID.randomUUID().toString().replace("-","").substring(0,18).toUpperCase(Locale.ROOT);
        try(Connection c=connect("mssql")) {
            Dynamic d=new Dynamic();d.setDbmsId("id_MSSQL");DynamicMetadata k=DynamicDml.column("KEY","id_String","VARCHAR",20,0,true,false);k.setDbTypeId(Types.VARCHAR);d.metadatas.add(k);d.addColumnValue("K1");
            boolean created=false;
            try(DynamicDml w=new DynamicDml(c,"id_MSSQL",null,table,"UPDATE_OR_INSERT",
                    new DynamicMetadata[]{DynamicDml.column("DT","id_Date","DATETIME2",0,7,true,true),DynamicDml.column("BIN","id_byte[]","VARBINARY",50,0,true,false)},d,new String[]{"KEY"},true,false,false,false,2,0)) {
                w.tableAction("CREATE");created=true;Timestamp time=Timestamp.valueOf("2026-11-03 12:34:56.1234567");
                w.write(new Object[]{time,new byte[]{0,(byte)255,1}},d);
                try(Statement s=c.createStatement();ResultSet rows=s.executeQuery("SELECT * FROM "+quote(table,"mssql"))) {
                    require(rows.next()&&time.equals(rows.getTimestamp(1))&&Arrays.equals(new byte[]{0,(byte)255,1},rows.getBytes(2)),"Static Timestamp/binary DDL lost precision or values");
                }
                w.write(new Object[]{time,null},d);w.finish();
                try(Statement s=c.createStatement();ResultSet rows=s.executeQuery("SELECT * FROM "+quote(table,"mssql"))) {
                    require(rows.next()&&time.equals(rows.getTimestamp(1))&&rows.getBytes(2)==null&&!rows.next(),"Mixed correspondence keys duplicated or binary NULL changed");
                }
                System.out.println("PASS mssql static DATETIME2(7)/VARBINARY DDL, composite named key upsert and NULL payload");
            }finally{if(created)try(Statement s=c.createStatement()){s.execute("DROP TABLE "+quote(table,"mssql"));}}
        }
    }
}
