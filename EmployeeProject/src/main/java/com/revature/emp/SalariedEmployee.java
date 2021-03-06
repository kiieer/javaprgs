package com.revature.emp;

public class SalariedEmployee {
		private int id;
		private String name;
		private String dept;
		private int daysPresent;
		
		public SalariedEmployee() {
			super();
		}
		public SalariedEmployee(int id, String name, String dept, int daysPresent) {
			super();
			this.id = id;
			this.name = name;
			this.dept = dept;
			this.daysPresent = daysPresent;
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
		
		public int getDaysPresent() {
			return daysPresent;
		}
		public void setDaysPresent(int daysPresent) {
			this.daysPresent = daysPresent;
		}

}
