package com.java.program;

public class ButterFlyShuffle {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		int len=a.length/2;
		int arraylength = a.length;
		System.out.println("Array Length is "+arraylength);
		System.out.println(len);
		
		for (int i = len-1; i >=0; i--) {
			System.out.println(i);
		}
		for (int i = a.length-1; i>=len; i--) {
			System.out.println(i);
		}
	}

}
