package com.revature.emp;

public class ContractualEmployee {
	private int id;
	private String name;
	private String dept;
	private int hoursLogged;
	
	
	public ContractualEmployee() {
		super();
	}
	public ContractualEmployee(int id, String name, String dept, int hoursLogged) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.hoursLogged = hoursLogged;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getHoursLogged() {
		return hoursLogged;
	}
	public void setHoursLogged(int hoursLogged) {
		this.hoursLogged = hoursLogged;
	}
	
	
}
