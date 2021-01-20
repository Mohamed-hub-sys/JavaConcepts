package com.java.basics;

public class OverRidingSample1 extends OverRidingSample {
	public void girlname() {
		super.girlname();
		System.out.println("Ramya");
	}
public static void main(String[] args) {
	OverRidingSample1 s = new OverRidingSample1();
	s.girlname();
}
}
