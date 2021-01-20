package com.java.taskday8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
	
	//duplicate count in List
	
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(50);
		li.add(10);
		li.add(10);
		
		int b[]= {};
		
		System.out.println(li);
		int len = li.size();
		System.out.println(len);
		
		Set<Integer> se = new HashSet<Integer>();
		se.add(10);
		se.add(20);
		se.add(30);
		se.add(10);
		se.add(50);
		se.add(10);	
		
		int s= se.size();
		System.out.println(s);
		boolean equals = se.equals(li);
		System.out.println(equals);
		
		int f = len-s;
		System.out.println(f);
	}
	}
		
		
		
		
	


