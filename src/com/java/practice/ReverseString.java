package com.java.practice;

public class ReverseString {
	public static void main(String[] args) {
		String s ="Welcome";
		System.out.println(s);
		
		StringBuilder se = new StringBuilder();
		se.append(s);
		StringBuilder reverse = se.reverse();
		System.out.println(reverse);
		
		for (int i = 3; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
