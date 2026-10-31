import java.nio.file.*;
import java.sql.*;
import java.util.*;
/** Read-only verification through a fresh connection after the native job committed. */
public class CommittedStateCheck {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        try (var input = Files.newInputStream(Path.of(args[1]))) { p.load(input); }
        boolean mysql = args[0].equals("MySQL");
        boolean postgres = args[0].equals("PostgreSQL");
        if (!mysql && !postgres && !args[0].equals("Oracle")) throw new IllegalArgumentException("Unknown database");
        String url = postgres ? "jdbc:postgresql://"+p.getProperty("dbHost")+":"+p.getProperty("dbPort")+"/"+p.getProperty("dbName") : mysql ? "jdbc:mysql://"+p.getProperty("dbHost")+":"+p.getProperty("dbPort")+"/"+p.getProperty("dbName") : "jdbc:oracle:thin:@//"+p.getProperty("dbHost")+":"+p.getProperty("dbPort")+"/"+p.getProperty("dbName");
        String password = routines.system.PasswordEncryptUtil.decryptPassword(p.getProperty("dbPassword"));
        String table = postgres ? "public.actors_strategy_test" : mysql ? "`actors_strategy_test`" : "SAKILA.ACTORS_STRATEGY_TEST";
        List<String> expected = Files.readAllLines(Path.of(p.getProperty("expectedFile")));
        try (Connection c = DriverManager.getConnection(url,p.getProperty("dbUser"),password);
             Statement s = c.createStatement();
             ResultSet r = s.executeQuery("SELECT actor_id,first_name,last_name,last_update FROM "+table+" ORDER BY actor_id")) {
            int count=0;
            while (r.next()) {
                String actual=r.getBigDecimal(1).toPlainString()+";"+r.getString(2)+";"+r.getString(3)+";"+r.getTimestamp(4).toLocalDateTime().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                if (++count>=expected.size() || !actual.equals(expected.get(count))) throw new AssertionError("Committed row mismatch: "+actual);
                System.out.println(actual);
            }
            if (count!=3 || count!=expected.size()-1) throw new AssertionError("Committed row count: "+count);
            System.out.println(args[0]+": PASS, 3 committed rows verified through a fresh connection.");
        }
        if (mysql) try (Connection c=DriverManager.getConnection(url,p.getProperty("dbUser"),password); Statement s=c.createStatement(); ResultSet r=s.executeQuery("SELECT ENGINE FROM information_schema.TABLES WHERE TABLE_SCHEMA='sakila' AND TABLE_NAME='actors_strategy_test'")) {
            if (!r.next() || !"InnoDB".equalsIgnoreCase(r.getString(1))) throw new AssertionError("Expected InnoDB");
            System.out.println("MySQL table engine: InnoDB.");
        }
    }
}
