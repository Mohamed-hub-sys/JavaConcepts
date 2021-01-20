package com.java.taskday7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
	
	//Replace the 10 into 100 in List
	
	
	
	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(50);
		li.add(10);
		
		Integer set = li.set(0, 100);
		li.set(3, 100);
		li.set(5, 100);
		System.out.println(li);
				
		
		
		};

}

