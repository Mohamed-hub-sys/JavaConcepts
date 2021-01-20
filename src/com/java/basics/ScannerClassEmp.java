package com.java.basics;

import java.util.Scanner;

public class ScannerClassEmp {

	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);

		String em1 = "Arun";
		String em2 = "Kumar";

		System.out.println("Please enter your Emp ID");
		int EmpId = se.nextInt();
		System.out.println("Your ID is " + EmpId);

		if (EmpId == 101) {
			System.out.println("Your Name is " + em1);

		} else if (EmpId == 102) {
			System.out.println("Your Name is " + em2);
		} else {
			System.out.println("EmpID id Invalid");
		}
		se.close();
	}

}
