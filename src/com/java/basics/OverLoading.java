package com.java.basics;

public class OverLoading {
	public void employee(int id) {
		System.out.println("Employee Id is " + id);
	}

	public void employee(String Name) {
		System.out.println("Employee Name is " + Name);
	}

	public static void main(String[] args) {
		OverLoading em = new OverLoading();
		em.employee(1);
		em.employee("Shanthi");
	}
}
