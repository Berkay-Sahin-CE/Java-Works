package Core;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    private static final String url="jdbc:sqlserver://localhost:1433;databaseName=eTicaretDB;user=sa;password=123456;trustServerCertificate=true;";

    public static Connection getConnection() throws SQLException{

        return DriverManager.getConnection(url);
    }

}
