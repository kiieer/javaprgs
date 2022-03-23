package com.kiersten.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {
public static void main(String[] args) {
	PreparedStatement ptsmt;
	ResultSet rs;
	
	Connection conn = ConnectionUtils.createConnection();
	
	try {
		String selectFruits="select * from fruits";	
		ptsmt = conn.prepareStatement(selectFruits);
		rs = ptsmt.executeQuery();
		
		while(rs.next()) {
			//System.out.println(rs.getInt("id") +  "  " + rs.getString("name"));
			System.out.println(rs.getInt(1) +  "  " + rs.getString("name"));
		}
		
		rs.close();
		ptsmt.close();
		
		System.out.println("===================================");
		String selectOneFruit = "select * from fruits where id = ?";
		ptsmt = conn.prepareStatement(selectOneFruit);
		ptsmt.setInt(1, 4);
		rs = ptsmt.executeQuery();
		
		while(rs.next()) {
			//System.out.println(rs.getInt("id") +  "  " + rs.getString("name"));
			System.out.println(rs.getInt(1) +  "  " + rs.getString("name"));
		}
		
		rs.close();
		ptsmt.close();
		
		System.out.println("========== Insert Data to Table ========");
		String insertFruit= "Insert into fruits values (?, ?)";
		ptsmt = conn.prepareStatement(insertFruit);
		ptsmt.setInt(1, 9);
		ptsmt.setString(2, "Cantaloupe");
		//ptsmt.execute();
		
		rs.close();
		ptsmt.close();
		
		System.out.println("========== Update Data In Table ========");
		String updateFruit= "update fruits set name = ? where id = ?";
		ptsmt = conn.prepareStatement(updateFruit);
		ptsmt.setString(1, "Honeydew");
		ptsmt.setInt(2, 4);
		ptsmt.execute();
				
		rs.close();
		ptsmt.close();
		
		System.out.println("========== Update Data In Table ========");
		String deleteFruit = "delete from fruits where id = ?";
		ptsmt = conn.prepareStatement(deleteFruit);
		ptsmt.setInt(1, 9);
		ptsmt.execute();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
