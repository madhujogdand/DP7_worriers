package com.basics;

import java.util.Scanner;

public class FindNumber2 {
	static void checkNum(int ar[], int n) {
		boolean isPresent = false;
		for (int i = 0; i < ar.length; i++)
		{

			if (n == ar[i])
			{
				isPresent = true;
				break;

			}
		}
		if (isPresent)
		{
			System.out.println("Its present");
		}
		else 
		{
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 6, 7, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find:");
		int n = sc.nextInt();
		checkNum(arr, n);
		sc.close();
	}

}
