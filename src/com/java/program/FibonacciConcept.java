package com.java.program;

public class FibonacciConcept {
public static void main(String[] args) {
	int a =0;
	int b=1;
	int c;
	for (int i = 1; i <=10; i++) {
		c=a+b;
		if (c<=100) {
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
}
