package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetConcepts {

	public static void main(String[] args) {

		Set<Object> s = new HashSet<>();

		s.add(10);
		s.add(20);
		s.add("java");
		s.add("sun");
		s.add('a');

		boolean contains = s.contains('a');
		System.out.println(contains);

		int size = s.size();
		System.out.println(size);

		boolean containsAll = s.containsAll(s);
		System.out.println(containsAll);

		boolean equals = s.equals(100);
		System.out.println(equals);

		System.out.println(s); // prints in Random Order

	}

}
