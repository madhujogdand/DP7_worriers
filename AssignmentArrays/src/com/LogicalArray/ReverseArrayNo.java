package com.LogicalArray;

import java.util.Arrays;

/*3)WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
output must be 78, 37, 29, 45, 90, 3*/
public class ReverseArrayNo {
	static void checkReverse(int ar[]
			) {
		
		for (int i = ar.length - 1; i >= 0; i--)
		{

			System.out.print(ar[i] + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 90, 45, 29, 37, 78 };
		System.out.println("Before:" + Arrays.toString(arr));

		checkReverse(arr);
		
	}

}
