package com.revature.javalin.service;

import java.util.List;

import com.revature.javalin.daos.StudentDAO;
import com.revature.javalin.daos.StudentPostgressDAO;
import com.revature.javalin.entity.Student;

public class StudentPostgresService implements StudentService {

	static StudentDAO dao = new StudentPostgressDAO();

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.getAllStudents();
	}

}
