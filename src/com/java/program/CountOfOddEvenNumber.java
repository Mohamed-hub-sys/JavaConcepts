package com.java.program;

import java.util.Iterator;

public class CountOfOddEvenNumber {
	public static void main(String[] args) {
		int countEVEN = 0;
		int countODD = 0;
		for (int i = 1; i <= 101; i++) {
			if (i % 2 == 0) {
				countEVEN++;
			} else {
				countODD++;
			}

		}
		System.out.println("count of EVEN number is " + countEVEN);
		System.out.println("count of ODD number is " + countODD);
	}
}
