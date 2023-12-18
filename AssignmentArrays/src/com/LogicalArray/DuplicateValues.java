package com.LogicalArray;

import java.util.Arrays;

/*6) Write a Java program to find the duplicate values of an array of integer values. 
Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78.*/
public class DuplicateValues {

	static void checkDuplicate(int ar[]) {
		int count;
		boolean visited;
		for (int i = 0; i < ar.length; i++) {
			count=1;
			visited=false;
			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;
					}
				}

				if (count > 1) {
					System.out.println(ar[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 10, 90, 78, 56, 10, 78, 34, 61 };
		System.out.println("Before:" + Arrays.toString(arr));
		checkDuplicate(arr);
		System.out.println("After:" + Arrays.toString(arr));
	}

}
