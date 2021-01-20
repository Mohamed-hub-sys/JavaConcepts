package com.java.program;

public class ReversingString1 {
	public static void main(String[] args) {
		String s = "Welcome";
		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);

		}
		System.out.print(reverse);
	}
}
