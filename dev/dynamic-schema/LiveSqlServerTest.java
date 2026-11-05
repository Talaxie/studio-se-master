import java.io.StringWriter;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import routines.system.Dynamic;
import routines.system.DynamicUtils;

/** Read-only synthetic SQL tests. Connection credentials are supplied through the environment. */
public class LiveSqlServerTest {
    public static void main(String[] args) throws Exception {
        String query = Files.readString(Path.of(args[0]));
        Path output = Path.of(args[1]);
        Files.createDirectories(output);
        try (Connection connection = DriverManager.getConnection(System.getenv("TALAXIE_TEST_JDBC_URL"),
                System.getenv("TALAXIE_TEST_JDBC_USER"), System.getenv("TALAXIE_TEST_JDBC_PASSWORD"))) {
            System.out.println("Microsoft JDBC driver " + connection.getMetaData().getDriverVersion());
            String reference = null;
            for (int fixed = 0; fixed <= 2; fixed++) {
                try (Statement statement = connection.createStatement(); ResultSet result = statement.executeQuery(query)) {
                    Dynamic dynamic = DynamicUtils.createMssqlDynamic(result.getMetaData(), fixed);
                    StringWriter text = new StringWriter();
                    for (int i = 1; i <= fixed; i++) {
                        text.write(result.getMetaData().getColumnLabel(i));
                        text.write(';');
                    }
                    DynamicUtils.writeHeaderToDelimitedFile(dynamic, text, ";");
                    text.write('\n');
                    int rows = 0;
                    while (result.next()) {
                        StringBuilder line = new StringBuilder();
                        for (int i = 1; i <= fixed; i++) { line.append(result.getString(i)).append(';'); }
                        DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, result, fixed, null, false);
                        DynamicUtils.writeValuesToStringBuilder(dynamic, line, ";", Charset.forName("ISO-8859-15"));
                        text.write(line.toString());
                        text.write('\n');
                        if (rows == 0 && !new BigDecimal("1234567890123456789012345678.1234567890")
                                .equals(dynamic.getColumnValue(2 - fixed))) {
                            throw new AssertionError("Decimal precision or scale changed");
                        }
                        rows++;
                    }
                    if (rows != 2) { throw new AssertionError("Expected two synthetic rows"); }
                    if (reference == null) { reference = text.toString(); }
                    if (!reference.equals(text.toString())) { throw new AssertionError("Mixed schema differs from dynamic schema"); }
                    Files.write(output.resolve("fixed-" + fixed + ".csv"), text.toString().getBytes("ISO-8859-15"));
                    System.out.println("EXEC with " + fixed + " static columns passed; two rows and five physical columns.");
                }
            }
            try (Statement statement = connection.createStatement(); ResultSet result = statement.executeQuery(
                    "SELECT CAST('0007' AS varchar(10)) AS AGENCE, CAST('202601' AS nvarchar(6)) AS MOIS")) {
                Dynamic dynamic = DynamicUtils.createMssqlDynamic(result.getMetaData(), 2);
                if (!result.next()) { throw new AssertionError("Missing synthetic row"); }
                DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, result, 2, null, false);
                if (dynamic.getColumnCount() != 0) { throw new AssertionError("Suffix must be empty"); }
                System.out.println("Empty dynamic suffix passed.");
            }
            try (Statement statement = connection.createStatement(); ResultSet result = statement.executeQuery(
                    "SELECT CAST('0007' AS varchar(10)) AS AGENCE, CAST(1 AS int) AS AGENCE")) {
                Dynamic dynamic = DynamicUtils.createMssqlDynamic(result.getMetaData(), 1);
                if (!result.next()) { throw new AssertionError("Missing synthetic row"); }
                DynamicUtils.readColumnsFromDatabase_Mssql(dynamic, result, 1, null, false);
                if (dynamic.getColumnCount() != 1 || !Integer.valueOf(1).equals(dynamic.getColumnValue(0))) {
                    throw new AssertionError("Duplicate label lost a physical column");
                }
                System.out.println("Duplicate label across static/dynamic boundary passed.");
            }
        }
    }
}
