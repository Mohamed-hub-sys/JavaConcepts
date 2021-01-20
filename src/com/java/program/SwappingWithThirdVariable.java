package com.java.program;

import java.util.Scanner;

public class SwappingWithThirdVariable {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers ");
	a=sc.nextInt();
	b=sc.nextInt();
	
	c=a;
	a=b;
	b=c;
	
	System.out.println("The Swapping numbers are");
	
	System.out.println(a);
	System.out.println(b);  
	
}
}
