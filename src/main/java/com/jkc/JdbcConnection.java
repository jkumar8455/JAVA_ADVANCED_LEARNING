package com.jkc;

import java.sql.*;

public class JdbcConnection {
    private static Connection connection;
    private static final String dbUrl="jdbc:postgresql://localhost:5432/jdbc";

    public static Connection getConnection() {
        try {
            if(connection!=null && !connection.isClosed()) return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        synchronized (JdbcConnection.class){
            try {
                if(connection!=null && !connection.isClosed()) return connection;
                return connection=DriverManager.getConnection(dbUrl);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
