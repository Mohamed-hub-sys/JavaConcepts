package com.java.basics;

public class Employee {
	
public Employee() {
System.out.println("Non Paramaterized");
}
public Employee(int id) {
	System.out.println("Paramaterized ");
	}
public void EmployeeId() {
System.out.println("Employee Id is 100");

}
public static void main(String[] args) {
	Employee em=new Employee();
	Employee em1=new Employee(100);
	em.EmployeeId();
	
}
}
