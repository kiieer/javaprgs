package com.revature.javalin.service;

import java.util.List;

import com.revature.javalin.entity.Student;

public interface StudentService {
	// Will provide service to access the DAO layer.
	
	// READ
	List<Student> getAllStudents();

}
