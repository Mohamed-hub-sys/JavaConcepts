package com.java.program;

import java.util.Scanner;

public class FindingOddEvenNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	if (n%2==0) {
		System.out.println("It is a Even Number");
	}else {
		System.out.println("It is a odd Number");
	}
}
}
