package com.java.program;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array");
		int n = sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter all the numbers");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			for (int j = 0; j<n; j++) {
				if (a[i]>a[j]) {
					int temp;
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
//for (int i = 0; i < a.length; i++) {
//	System.out.println(a[i]);
//}
//		int a[] = { 5, 75, 20, 100, 54, 65 };
//
//		int temp = 0;
//
//		for (int i = 0; i < a.length; i++) {
//
//			for (int j = i + 1; j < a.length; j++) {
//
//				if (a[i] > a[j]) {
//
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//
//				}
//			}
//
//		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
			
		}
	}
}
