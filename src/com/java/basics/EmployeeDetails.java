package com.java.basics;

public class EmployeeDetails {
	public void employee() {
		int id = 52;
		String Name = "Mohamed";
		System.out.println("Employee ID is " + id);
		System.out.println("Employee Name is " + Name);
	}

	public static void main(String[] args) {
		EmployeeDetails em = new EmployeeDetails();
		em.employee();
	}

}
