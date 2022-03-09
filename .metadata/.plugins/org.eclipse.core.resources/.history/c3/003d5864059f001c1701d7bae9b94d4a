package com.revature.emp;

public class ContractualEmployee extends Employee {
	private int hoursLogged;

	public ContractualEmployee() {
		super();
	}

	public ContractualEmployee(int id, String name, String dept, int hoursLogged) {
		super(id, name, dept);
		this.hoursLogged = hoursLogged;
	}

	public int getHoursLogged() {
		return hoursLogged;
	}

	public void setHoursLogged(int hoursLogged) {
		this.hoursLogged = hoursLogged;
	}

	@Override
	public double calculateSalary(int x) {
		// TODO Auto-generated method stub
		return this.getHoursLogged()*15;
	}
	
	public void whoAmI() {
		System.out.println("I am the Contractual Employee Class!");
	}
}
