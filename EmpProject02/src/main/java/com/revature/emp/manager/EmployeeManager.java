package com.revature.emp.manager;

import com.revature.emp.ContractualEmployee;
///import com.revature.emp.Employee;
import com.revature.emp.SalariedEmployee;

public class EmployeeManager {
public static void main(String[] args) {
	/// cannot instaniate object of employee class bc abstract
	/// Employee e = new Employee(001, "Some Name", "Some Dept");
	
	 SalariedEmployee se1 = new SalariedEmployee(101, "Jack", "Training", 20);
	 System.out.println(se1);
	 System.out.println("Salary of Salaried Employee: " + se1.calculateSalary(se1.getDaysPresent()));
	 se1.calculateTax();
	 ContractualEmployee ce1 = new ContractualEmployee(532, "Chris", "Training", 160);
	 System.out.println(ce1);
	 System.out.println("Salary of Contractual Employee: " + ce1.calculateSalary(ce1.getHoursLogged()));

}
}
