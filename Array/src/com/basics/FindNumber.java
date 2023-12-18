package com.basics;

import java.util.Scanner;

public class FindNumber {
	static void checkNum(int ar[], int n) {
		boolean isPresent = false;
		for (int i = 0; i < ar.length; i++) {

			if (n == ar[i]) {
				isPresent = true;
				System.out.println(n + " Is present in array at position:" + (i + 1));

			}
		}
		if (!isPresent)

			System.out.println(n + " is not present in array");
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 2, 6, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find:");
		int n = sc.nextInt();
		checkNum(arr, n);
		sc.close();
	}

}
