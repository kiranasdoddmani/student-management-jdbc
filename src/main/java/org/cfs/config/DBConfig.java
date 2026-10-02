package org.cfs.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConfig {
    static String url= "jdbc:mysql://localhost:3306/jdbc-project01";
    static String username="root";
    static String password=".......";

    public static Connection getInstance(){
        try {
            Connection connection= DriverManager.getConnection(url,username,password);
             return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
