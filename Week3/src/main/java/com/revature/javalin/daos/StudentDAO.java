package com.revature.javalin.daos;

import java.util.List;

import com.revature.javalin.entity.Student;

public interface StudentDAO {
	//This interface will act as a contract for all of the Data Access Objects implementation classes.
	// CollectionDAO, FileDAO, PostgresDAO
	
	// CREATE 
	
	// READ
	List<Student> getAllStudents();
	
	// UPDATE
	
	// DELETE
}
