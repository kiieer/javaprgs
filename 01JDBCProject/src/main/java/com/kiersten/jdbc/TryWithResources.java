package com.kiersten.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResources {
public static void main(String[] args) {
    
    Statement stmt;
    ResultSet rs;
    String url=System.getenv("MY_CONN");
    try( Connection conn=DriverManager.getConnection(url)){
    			// Step 3 = Create a Statement Object
    			stmt = conn.createStatement();
    			
    			// Step 4 = Execute the Query
    			String selectFruits="select * from fruits";
    			rs = stmt.executeQuery(selectFruits);
    			
    			// Step 5 = Iterate / process the ResultSet
    			while(rs.next()) {
    				//System.out.println(rs.getInt("id") +  "  " + rs.getString("name"));
    				System.out.println(rs.getInt(1) +  "  " + rs.getString("name"));
    			}
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
