package com.java.basics;

import java.util.Scanner;

public class StudentDetails {
	int a =100;
	public static void main(String[] args) {
		
		int Average;
		
		Scanner se = new Scanner(System.in);
		
		System.out.println("Enter your ID ");
		int Id = se.nextInt();
		System.out.println("Your ID "+Id);
		
		System.out.println("Enter your Name");
		String name = se.next();
		System.out.println("Your name is "+name);
		
		System.out.println("Enter your Tamil Mark");
		int Tamil = se.nextInt();
		System.out.println("Your Tamil Mark is "+Tamil);
		
		System.out.println("Enter your English Mark");
		int English = se.nextInt();
		System.out.println("Your English Mark is "+English);
		
		System.out.println("Enter your Maths Mark");
		int Maths= se.nextInt();
		System.out.println("Your Maths Mark is "+Maths);
		
		Average=(Tamil+English+Maths)/3;
		
		System.out.println("Your Average Mark is "+Average);
		
		se.close();
		
	}

}
