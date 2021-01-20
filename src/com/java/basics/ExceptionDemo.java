package com.java.basics;

public class ExceptionDemo {

//	public static void main(String[] args) {
//		System.out.println("Arthimetic Exception");
//		try {
//			System.out.println(10 / 0);
//		} catch (Exception e) {
//			System.out.println("can not divide by zero");
//			e.printStackTrace();
//
//		}
//		
//	}

	
	public static void vote(int age) throws Exception {
if (age>=18) {
	System.out.println("Eligible for voting");
}
throw new Exception("Age should be greater than 18");

	}
	public static void main(String[] args) throws Exception {
		vote(19);
	}
}

