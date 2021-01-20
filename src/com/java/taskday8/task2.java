package com.java.taskday8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
public static void main(String[] args) {
	List<Object> l = new ArrayList<Object>();
	
	l.add("empid");
	l.add("empName");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Emp ID");
	int empid = sc.nextInt();
	System.out.println("your Emp id is "+empid);
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter your Emp Name");
	String empName = sc1.next();
	System.out.println("your name is "+empName);
	
}
	
	
}
