package com.kiersten.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBC {
public static void main(String[] args) {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	try {
		// Step 1 = Load the Driver -- Optional from Java 6 onward
		Class.forName("org.postgresql.Driver");
		
		// Step 2 = Obtain a Connection
		String url = System.getenv("MY_CONN");
		conn  = DriverManager.getConnection(url);
		
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
		
		// Step 6 = Close the resources
		conn.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
