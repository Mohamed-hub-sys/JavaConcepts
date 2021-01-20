package com.java.basics;

public abstract class EmployeeInterface implements EmployeeDetailsInterface {
	
	public void empId() {
		System.out.println("EmpID is 254");
	}

	@Override
	public void empName() {
		System.out.println("EmpName is Mohamed");
	}

	public static void main(String[] args) {
		EmployeeInterface ss = new EmployeeInterface() {
		};
		ss.empId();
		ss.empName();
	}

}
