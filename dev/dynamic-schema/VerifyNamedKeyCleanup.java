import java.sql.*;
import java.util.*;
import java.nio.file.*;
import java.io.*;

/** Recipe-only cleanup. GUI tables are never disposed here: they must be removed by successful jobs. */
public class VerifyNamedKeyCleanup extends LiveDmlOutputSupport {
    protected void execute(ResultSet unused) { }
    public static void main(String[] args)throws Exception {
        try(InputStream in=Files.newInputStream(Paths.get(args[0]))){config.load(in);}
        boolean dispose=args.length>1&&args[1].equals("--dispose-abandoned");
        for(String db:Arrays.asList("mssql","oracle","mysql","postgres"))try(Connection c=connect(db)) {
            List<String> nativeTables=new ArrayList<>(),gui=new ArrayList<>(),typed=new ArrayList<>();
            try(ResultSet tables=c.getMetaData().getTables(c.getCatalog(),c.getSchema(),"TDYN_%",new String[]{"TABLE"})) {
                while(tables.next()) {String n=tables.getString("TABLE_NAME");
                    if(n.matches("TDYN_DML_[A-F0-9]{18}C?"))nativeTables.add(n);
                    if(n.startsWith("TDYN_NK_")||n.startsWith("TDYN_GUI_DML_"))gui.add(n);
                    if(n.matches("TDYN_KEY_[A-F0-9]{18}"))typed.add(n);
                }
            }
            require(gui.isEmpty(),"GUI job did not finish its own cleanup: "+gui);
            require(typed.isEmpty(),"Typed-key recipe did not finish its cleanup: "+typed);
            if(dispose) {
                Collections.sort(nativeTables,(a,b)->Integer.compare(b.length(),a.length()));
                for(String table:nativeTables) {
                    int count=0;try(Statement s=c.createStatement();ResultSet rows=s.executeQuery("SELECT * FROM "+quote(table,db))) {
                        while(rows.next()) {String v=rows.getString(1);require(v==null||Arrays.asList("K1","K2","KEEP").contains(v),"Refusing to dispose unexpected recipe data");require(++count<=10,"Unexpected recipe row count");}
                    }
                    try(Statement ddl=c.createStatement()){ddl.execute("DROP TABLE "+quote(table,db));}
                    System.out.println("Disposed interrupted synthetic fixture "+db+" "+table);
                }
            }else require(nativeTables.isEmpty(),"Native recipe tables remain: "+nativeTables);
            System.out.println("PASS "+db+" cleanup: no named-key recipe tables remain");
        }
    }
}
