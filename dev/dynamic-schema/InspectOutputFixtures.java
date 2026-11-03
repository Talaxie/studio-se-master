import java.sql.*;

/** Diagnostic/cleanup helper restricted to this test suite's table namespace. */
public class InspectOutputFixtures {
    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(System.getenv("TALAXIE_TEST_JDBC_URL"),
                System.getenv("TALAXIE_TEST_JDBC_USER"), System.getenv("TALAXIE_TEST_JDBC_PASSWORD"));
                Statement statement = connection.createStatement()) {
            if (args.length == 2 && "--cleanup".equals(args[0])) {
                if (!args[1].matches("TALAXIE_DYNAMIC_OUTPUT_[a-f0-9]{32}")) {
                    throw new IllegalArgumentException("Not an output fixture table");
                }
                statement.execute("DROP TABLE IF EXISTS [dbo].[" + args[1] + "]");
            }
            try (ResultSet result = statement.executeQuery("SELECT name, create_date FROM sys.tables "
                    + "WHERE name LIKE 'TALAXIE[_]DYNAMIC[_]OUTPUT[_]%'")) {
                while (result.next()) { System.out.println("Fixture: " + result.getString(1) + " " + result.getTimestamp(2)); }
            }
        }
    }
}
