import java.nio.file.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import routines.system.*;

/** Exports only synthetic target DDL metadata, never connection credentials. */
public class ExportMultiDbRejectFixtures extends LiveMultiDbTest {
    public static void main(String[] args) throws Exception {
        try (InputStream in=Files.newInputStream(Paths.get(args[0]))) { config.load(in); }
        Properties queries=new Properties();
        try (InputStream in=Files.newInputStream(Paths.get(args[1]))) { queries.loadFromXML(in); }
        for (String db:Arrays.asList("oracle","mysql","postgres")) {
            try (Connection c=connect(db);Statement s=c.createStatement();ResultSet r=s.executeQuery(query(db,false))) {
                queries.setProperty(db+".reject_columns",DynamicUtils.getCreateTableSQL(DynamicJdbc.create(r.getMetaData(),0,id(db)),id(db)));
            }
        }
        try(OutputStream out=Files.newOutputStream(Paths.get(args[1]))) {queries.storeToXML(out,"Synthetic recipe queries and DDL metadata","UTF-8");}
    }
}
