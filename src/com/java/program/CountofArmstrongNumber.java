package com.java.program;

public class CountofArmstrongNumber {
	public void CountArmstrong() {
		int c = 0;
		for (int n = 1; n <= 1000000000; n++) {
			int a, i, j = 0; 
			a = n;
			while (a > 0) {
				i = a % 10;
				j = j + (i * i * i);
				a = a / 10;

			}
			if (j == n) {
				System.out.println("Armstrong Number is " + j);
				c++;

			}
			
		}
		System.out.println("Count of Armstrong Number is " + c);
	}

	public static void main(String[] args) {

		CountofArmstrongNumber s = new CountofArmstrongNumber();
		s.CountArmstrong();

	}
}
