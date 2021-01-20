package com.java.program;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int n, a, i, j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		n = sc.nextInt();
		a = n;
		while (a > 0) {
			i = a % 10;
			j = j + i;
			a = a / 10;

		}

		System.out.println("sum of your given value is " + j);
	}
}
