package com.java.program;

public class CountofLetterString {
	public static void main(String[] args) {
		String s = "WelcoMe tO $jAVa7";

		int small = 0;
		int cap = 0;
		int num = 0;
		int spl = 0;
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && 'z' >= s.charAt(i)) {
				small++;

			}
			else if ('A' <= s.charAt(i) && 'Z' >= s.charAt(i)) {
				cap++;

			} else if ('1' <= s.charAt(i) && '9' >= s.charAt(i)) {
				num++;

			} else {
				spl++;

			}

		}
	System.out.println(small);
	System.out.println(cap);
	System.out.println(num);
	System.out.println(spl);
	
	
	}

}
