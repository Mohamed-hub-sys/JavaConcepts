package com.java.program;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int n, a;
		int i = 0;
		int j = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number ");
		n = input.nextInt();
		a=n;
		System.out.println("you have entered " + n);
		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}
		if (n == j) {
			System.out.println("You have entered Armstrong Number");
		} else {
			System.out.println("You entered number is not Armstrong Number");
		}
		
		input.close();

	}
}
