import java.sql.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;

/** Read-only final check; never removes objects found on a database. */
public class VerifyDmlCleanup extends LiveDmlOutputSupport {
    protected void execute(ResultSet unused) { }
    public static void main(String[] args) throws Exception {
        try(InputStream in=Files.newInputStream(Paths.get(args[0]))) {config.load(in);}
        for(String db:Arrays.asList("mssql","oracle","mysql","postgres")) {
            try(Connection c=connect(db);ResultSet tables=c.getMetaData().getTables(c.getCatalog(),c.getSchema(),"TDYN_%",new String[]{"TABLE"})) {
                List<String> remaining=new ArrayList<>();
                while(tables.next()) {
                    String name=tables.getString("TABLE_NAME");
                    if(name.startsWith("TDYN_DML_")||name.startsWith("TDYN_GUI_DML_"))remaining.add(name);
                }
                require(remaining.isEmpty(),db+" has remaining recipe tables: "+remaining);
                System.out.println("PASS "+db+" cleanup: no Dynamic DML recipe tables remain");
            }
        }
    }
}
