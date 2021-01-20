package com.java.taskday6;

import java.util.Scanner;

public class Task1 {
//Reverse the given String
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter here");
		String input = sc.next();
		
		for (int i=input.length()-1; i>=0; i--) {
			char charat = input.charAt(i);
			System.out.print(charat);
		}
		
	}

}
