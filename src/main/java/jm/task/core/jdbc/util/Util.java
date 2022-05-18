package jm.task.core.jdbc.util;


import java.sql.*;

public class Util {
    public static final String URL = "jdbc:mysql://localhost:3306/pp";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "***1";
    private static Connection connection;
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return connection;
    }
}
