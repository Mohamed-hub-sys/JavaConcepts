package com.java.basics;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name ");
		String name = sc.next();
		System.out.println("Your Name is " + name);

		System.out.println("Enter your ID");
		int ID = sc.nextInt();
		System.out.println("Your ID is " + ID);

		sc.close();
	}

}
