package com.revature.javalin;

import java.util.ArrayList;

import com.revature.javalin.entity.Student;

import io.javalin.http.Handler;

public class HelloController {
	 public static Handler sayHello=ctx->{
	        ctx.result("Hello From Handler");
	    };
	    
	    public static Handler getData=ctx->{
	    	ctx.json("Hello World.");
	    };
	    
	    public static Handler getStudent = ctx -> {
	    	Student s1 = new Student(1, "Kiersten");
	    	Student s2 = new Student(2, "Eric");
	    	ArrayList<Student> studentlist= new ArrayList<Student>();
			studentlist.add(s1);
			studentlist.add(s2);
	    	ctx.json(studentlist);
	    };
}
