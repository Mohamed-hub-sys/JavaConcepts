package com.java.basics;

public class Array {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
	int b[]= {10,20,100,40};
	System.out.println(b[2]);

		System.out.println(a[1]);
		int length = a.length;
		System.out.println(length);

		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			
		}
	}
}
