package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {
	public static void main(String[] args) {

		List<Object> li = new ArrayList<Object>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add("java");
		li.add('f');
		li.add("sun");

		System.out.println(li);
		
		Object object = li.get(4);
		System.out.println(object);
		
		boolean contains = li.contains("java");
		System.out.println(contains);
		
		boolean equals = li.equals(li);
		System.out.println(equals);
		
		int hashCode = li.hashCode();
		System.out.println(hashCode);
		
		int indexOf = li.indexOf("java");
		System.out.println(indexOf);
		
		Object set = li.set(2, 60);
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
	}
}
