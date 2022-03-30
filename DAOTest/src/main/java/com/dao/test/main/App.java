package com.dao.test.main;

public class App {
public static void main(String[] args) {
	Javalin app=Javalin.create(ctx->{ ctx.enableCorsForAllOrigins();}).start();

	app.get("/hello", ctx-> {
		ctx.result("Hello World!");
		});
	
	app.get("/hello/{name}", ctx -> {
		String name = ctx.pathParam("name");
		ctx.result("Hello " + name.toUpperCase());
	});

	app.get("/hellohandler", HelloController.sayHello);
	
	app.get("/data", HelloController.getData);
	
	app.get("/student", HelloController.getStudent);
	
	app.get("/students", StudentController.getAllStudents);
	
	app.post("/students", StudentController.addStudent);

	app.put("/students/{id}", StudentController.updateStudent);
	
	app.delete("/students/{id}", StudentController.deleteStudent);
	
	
	app.get("/students/{id}", StudentController.getStudentById);
}}


}
