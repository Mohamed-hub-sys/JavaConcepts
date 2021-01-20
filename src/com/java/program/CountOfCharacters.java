package com.java.program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfCharacters {
	public static void main(String[] args) {
		String s = "aabbbcccddff";
		HashMap<Character, Integer> emp = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (s.charAt(i) == ch[j]) {
					count = count + 1;
				}
			}
			emp.put(s.charAt(i), count);
		}
		System.out.println(emp);
		Set<Entry<Character, Integer>> entrySet = emp.entrySet();
		System.out.println(entrySet);
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
			System.out.println();
			

		}
	}

}
