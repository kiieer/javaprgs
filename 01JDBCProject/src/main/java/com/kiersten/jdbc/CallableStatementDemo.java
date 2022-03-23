package com.kiersten.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementDemo {
public static void main(String[] args) {
    CallableStatement cstmt;
    
    Connection conn=ConnectionUtils.createConnection();
    try {
        cstmt=conn.prepareCall("call fruits_insert_data(?,?)");
        cstmt.setInt(1, 16);
        cstmt.setString(2, "Dragonfruit");
        cstmt.execute();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
}
}