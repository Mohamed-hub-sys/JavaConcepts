package com.java.program;

public class MaximumValue {
	public static void main(String[] args) {
		int a[] = { 5, 75, 20, 100, 54, 65 };
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("Maximum Value = " + max);
	}
}
