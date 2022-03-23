package com.revature.project.zero.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.project.zero.utilities.ConnUtil;

import io.javalin.Javalin;

public class Main {
	public static void main(String[] args) {
		Javalin app = Javalin.create().start();
		Connection conn = ConnUtil.createConnection();
		
		// By completion, this one should not only create a new client but return a 201 status code on PostMan.
		// http://localhost:8080/clients
		app.post("/clients", ctx -> {	
		    ctx.status(201);
		    });
		
		
		//By completion, this one should not only bring a list of all of the clients but return a 201 status code on Postman.
		// http://localhost:8080/clients
		app.get("/clients", ctx -> {
			String selectClients="select * from client";	
			PreparedStatement ptsmt = conn.prepareStatement(selectClients);
			ResultSet rs = ptsmt.executeQuery();
			ArrayList arrList = new ArrayList();
			try {
				while(rs.next()) {
				arrList.add(rs.getInt("id") +  "  " + rs.getString("full_name"));
			}
			
			} catch (SQLException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
			ctx.result(arrList.toString());
		    ctx.status(200);
		    });
		
		
	//
	//	GET /clients/10 => get client with id of 10
	//		return 404 if no such client exist
		app.get("/clients/", ctx -> {
			String selectClients="select * from client";	
			PreparedStatement ptsmt = conn.prepareStatement(selectClients);
			ResultSet rs = ptsmt.executeQuery();
			try {
				
			while(rs.next()) {
				ctx.result(rs.getInt("client_id") +  "  " + rs.getString("f_name") + "\r\n");
			}
			} catch (SQLException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
			
		    ctx.status(200);
		    });
	//
	//	PUT /clients/12 => updates client with id of 12	
	//		return 404 if no such client exist
	//
	//	DELETE /clients/15 => deletes client with the id of 15
	//		return 404 if no such client exist
	//		return 205 if success
	//
	//	POST /clients/5/accounts =>creates a new account for client with the id of 5
	//		return a 201 status code
	//
	//	GET /clients/7/accounts => get all accounts for client 7
	//		return 404 if no client exists
	//
	//	(Optional)
	//	GET /accounts?amountLessThan=2000&amountGreaterThan400 => get all accounts for between 400 and 200
	//
	//	GET /accounts/4 => get account with id 4 
	//		return 404 if no account or client exists
	//
	//	PUT /accounts/3 => update account with the id 3
	//		return 404 if no account or client exists
	//
	//	DELETE /accounts/6 => delete account 6 
	//		return 404 if no account or client exists
	//
	//
	//	PATCH /accounts/12/deposit => deposit given amount (Body {"amount":500} )
	//		return 404 if no account exists
	//
	//	PATCH /accounts/12/withdraw => deposit given amount (Body {"amount":500} )
	//		return 404 if no account exists
	//		return 422 if insufficient funds
	}
}
