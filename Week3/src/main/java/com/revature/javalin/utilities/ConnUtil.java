package com.revature.javalin.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtil {
    public static Connection createConnection() {
        String url = System.getenv("MY_CONN");
        try {
            // A factory - pass in string details for any type of database.
            // The DriverManager factory will give you back a connection
            // implementation specifically for Postgres.
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}