package com.java.program;

public class MinimumValue {
	public static void main(String[] args) {
		int a[] = { 5, 75, 20, 100, 54, 65 };
		int min= a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println("Minimum Value = " + min);
	}
}
