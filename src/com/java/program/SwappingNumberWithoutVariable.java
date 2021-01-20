package com.java.program;

import java.util.Scanner;

public class SwappingNumberWithoutVariable {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		a = sc.nextInt();
		b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Swapped number are");

		System.out.println(a);
		System.out.println(b);
	}
}
