package com.revature.emp.main;

import com.revature.emp.ContractualEmployee;
import com.revature.emp.SalariedEmployee;

public class EmployeeManager {
public static void main(String[] args) {
	SalariedEmployee se = new SalariedEmployee(); //creating an object thru the default constructor 
	se.setId(101);
	se.setName("Kiersten"); //instead of hard coding the values	
	se.setDept("IT - Training"); //we can use cl - argues or scanner class for input
	se.setDaysPresent(21);
	
System.out.println("Id   = " + se.getId() + "\nName = " + se.getName() + 
		"\nDept = " + se.getDept() + "\nDays present = " + 
		se.getDaysPresent() );

SalariedEmployee se1 = new SalariedEmployee(102, "Jaunzel", "Training", 30); //parameterized constructor
System.out.println("\nId   = " + se1.getId() + "\nName = " 
+ se1.getName() + "\nDept = " + se1.getDept() +  "\nDays present = " + 
		se.getDaysPresent() );

ContractualEmployee ce = new ContractualEmployee(); 
ce.setId(131);
ce.setName("Eliza"); 
ce.setDept("Training");
ce.setHoursLogged(40);

System.out.println("\nId   = " + ce.getId() + "\nName = " + ce.getName() + "\nDept = " + ce.getDept() + "\nHours = " + ce.getHoursLogged());

ContractualEmployee ce1 = new ContractualEmployee(321, "Mitchell", "Training", 44); //parameterized constructor
System.out.println("\nId   = " + ce1.getId() + "\nName = " + ce1.getName() + "\nDept = " + ce1.getDept() + "\nHours = " + ce1.getHoursLogged());


}
}
