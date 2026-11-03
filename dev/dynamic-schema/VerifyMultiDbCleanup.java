import java.sql.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;

/** Read-only verification that synthetic TDYN recipe tables were removed. */
public class VerifyMultiDbCleanup extends LiveMultiDbTest {
    public static void main(String[] args) throws Exception {
        try(InputStream in=Files.newInputStream(Paths.get(args[0]))) {config.load(in);}
        for(String db:Arrays.asList("oracle","mysql","postgres")) {
            try(Connection c=connect(db);ResultSet tables=c.getMetaData().getTables(c.getCatalog(),c.getSchema(),"TDYN_%",new String[]{"TABLE"})) {
                List<String> remaining=new ArrayList<>();
                while(tables.next()) {
                    String name=tables.getString("TABLE_NAME");
                    if(name.matches("TDYN_[A-F0-9]{20}") || name.startsWith("TDYN_GUI_")) remaining.add(name);
                }
                require(remaining.isEmpty(),db+" has remaining recipe tables: "+remaining);
                System.out.println("PASS "+db+" cleanup: no synthetic TDYN tables remain");
            }
        }
    }
}
