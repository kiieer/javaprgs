package com.revature.javalin.handler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.revature.javalin.entity.Student;
import com.revature.javalin.utilities.ConnUtil;

import io.javalin.http.Handler;

public class StudentController {
	public static Handler getAllStudents = ctx -> {
		Connection conn = ConnUtil.createConnection();
		String selectClients = "select * from student";
		PreparedStatement ptsmt = conn.prepareStatement(selectClients);
		ResultSet rs = ptsmt.executeQuery();
		ArrayList<Student> sList = new ArrayList<Student>();
		Student s;
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			s = new Student(id, name);
			sList.add(s);
		}

		ctx.json(sList);
		rs.close();
		ptsmt.close();
	};

	public static Handler addStudent = ctx -> {
		Student student = ctx.bodyAsClass(Student.class);
		Connection conn = ConnUtil.createConnection();
		PreparedStatement ptsmt = conn.prepareStatement("insert into student values(?, ?)");
		ptsmt.setInt(1, student.getId());
		ptsmt.setString(2, student.getName());
		ptsmt.execute();
		ctx.status(201);
		ptsmt.close();
	};
	
	public static Handler updateStudent = ctx -> {
		int p = Integer.parseInt(ctx.pathParam("id"));
		Student s1 = ctx.bodyAsClass(Student.class);
		Connection conn = ConnUtil.createConnection();
		PreparedStatement ptsmt = conn.prepareStatement("update student set name = ? where id = ?");
		ptsmt.setString(1, s1.getName());
		ptsmt.setInt(2, p);
		ptsmt.execute();
		ctx.status(200);
		ptsmt.close();
	};
	
	public static Handler deleteStudent = ctx ->{
		int p = Integer.parseInt(ctx.pathParam("id"));
		Connection conn = ConnUtil.createConnection();
		PreparedStatement ptsmt = conn.prepareStatement("delete from student where id = ?");
		ptsmt.setInt(1, p);
		ptsmt.execute();
		ctx.status(200);
		
};

public static Handler getStudentById = ctx -> {
	int p = Integer.parseInt(ctx.pathParam("id"));
	Connection conn = ConnUtil.createConnection();
	String selectClients = "select * from student where id=?";
	PreparedStatement ptsmt = conn.prepareStatement(selectClients);
	ptsmt.setInt(1, p);
	ResultSet rs = ptsmt.executeQuery();
	ArrayList<Student> sList = new ArrayList<Student>();
	Student s;
	while (rs.next()) {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		s = new Student(id, name);
		sList.add(s);
	}

	ctx.json(sList);
	rs.close();
	ptsmt.close();
};
}
