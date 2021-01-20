package com.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcepts {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "java");
		m.put(2, "c++");
		m.put(3, "python");
		
		System.out.println(m);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);

		Set<Entry<Integer,String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		boolean containsKey = m.containsKey(1);
		System.out.println(containsKey);
		
		int size = m.size();
		System.out.println(size);
		
		
		
	
		
	
	
	}

}
