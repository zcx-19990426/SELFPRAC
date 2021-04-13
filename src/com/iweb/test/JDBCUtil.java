package com.iweb.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    private String url="jdbc:mysql://127.0.0.1:3306/test?characterEncoding=UTF-8";
    private String username="root";
    private String password="admin";

    public JDBCUtil(){
        try {
            Class.forName("com.jdbc.mysql.driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConn(){
        try {
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
