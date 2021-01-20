package com.java.taskday6;

import java.util.Scanner;

public class task2 {

	// string is Palindrome or not.

	public static void main(String[] args) {

		String reverse = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter here");
		String s = input.next();

		for (int i = s.length() - 1; i >= 0; i--) {
reverse=reverse + s.charAt(i);
			
			
			}
		System.out.println(reverse);
		if (s.equals(reverse)) {
			System.out.println("This is Palindrome");
		} else {
			System.out.println("This is Not a Palindrome");

		}

	}

}
