package com.java.program;

import java.util.Scanner;

public class CountofGivenNumber {
	public static void main(String[] args) {
		int count;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		count = sc.nextInt();
		while (count > 0) {
			count = count / 10;
			n++;

		}
		System.out.println("Number of count in given digit is " + n);

	}

}
