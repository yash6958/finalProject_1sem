package lk.ijse.citroessentional.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;
    private final Connection connection;

    private DbConnection() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/oilmart_new",
                "root",
                "mysql"
        );
    }
    public static DbConnection getInstance() throws SQLException {
        return (dbConnection == null) ? dbConnection = new DbConnection() : dbConnection;
    }
    public Connection getConnection() {
        return connection;
    }
}
