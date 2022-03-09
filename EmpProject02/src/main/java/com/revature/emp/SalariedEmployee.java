package com.revature.emp;

public class SalariedEmployee extends Employee implements Tax {
	private int daysPresent;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(int id, String name, String dept, int daysPresent) {
		super(id, name, dept);
		this.daysPresent = daysPresent;
	}

	public int getDaysPresent() {
		return daysPresent;
	}

	public void setDaysPresent(int daysPresent) {
		this.daysPresent = daysPresent;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [daysPresent=" + daysPresent + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calculateSalary(int x) {
		// TODO Auto-generated method stub
		return this.getDaysPresent()*200;
	}
	
	public void whoAmI() {
		System.out.println("I am the Salaried Employee Class!");
	}

	@Override
	public void calculateTax() {
		System.out.println("Calculate tax of salaried employee class.");
		
	}
}
