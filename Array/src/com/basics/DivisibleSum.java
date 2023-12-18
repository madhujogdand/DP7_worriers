package com.basics;

public class DivisibleSum {
	public static void main(String[] args) {
		int arr[] = { 9, 10, 15, 14, 18, 30 };
		int sum = 0;
		for (int i : arr) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}

		}
		System.out.println("Sum of elements divisible by 3 and 5 are:" + sum);
	}

}
