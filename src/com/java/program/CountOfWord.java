package com.java.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfWord {

	public static void main(String[] args) {
		String s="Welcome java to java";
		String[] s1 = s.split(" ");
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String split : s1) {
			if (m.containsKey(split)) {
				Integer x = m.get(split);
				m.put(split, x+1);
			}
			else {
				m.put(split, 1);
			}
		}
		System.out.println(m);
		
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
	}
	
}
