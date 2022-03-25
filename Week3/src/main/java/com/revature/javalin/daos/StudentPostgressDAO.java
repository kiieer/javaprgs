package com.revature.javalin.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.javalin.entity.Student;
import com.revature.javalin.utilities.ConnUtil;

public class StudentPostgressDAO implements StudentDAO {

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		// Write logic to access your database here.
		Connection conn = ConnUtil.createConnection();
		String selectClients = "select * from student";
		ArrayList<Student> sList = new ArrayList<Student>();
		Student s;
		try { 
		PreparedStatement ptsmt = conn.prepareStatement(selectClients);
		ResultSet rs;
		rs = ptsmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			s = new Student(id, name);
			sList.add(s);
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sList;
	}
	//This class will have methods that perform CRUD operations on Student.
	//Using the Postgres or any other database.
	
	// CREATE A STUDENT
	
	// READ A STUDENT
	
	// UPDATE A STUDENT
	
	// DELETE A STUDENT
	
}
