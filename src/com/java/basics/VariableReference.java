package com.java.basics;

public class VariableReference extends StudentDetails{
	int a = 1;
	public void sample() {
int a=10;
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
	}
public static void main(String[] args) {
	VariableReference s = new VariableReference();
	s.sample();
}
}
