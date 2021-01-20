package com.java.taskday7;

public class Task2 {
	
	//calculate the average value of array elements
	
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		float average=0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			average = sum / a.length;

		}
		System.out.println("Sum of array is " + sum);
		System.out.println("Average of array is " +average);
	}

}
