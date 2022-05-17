package jm.task.core.jdbc.util;


import java.sql.*;

public class Util {
    public static final String URL = "jdbc:mysql://localhost:3306/pp";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "****";
    private static Connection connection;
    private static Statement statement;
    public static Statement getStatement() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
        }
        return statement;
    }
}
