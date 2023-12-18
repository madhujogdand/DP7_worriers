package com.basics;

import java.util.Arrays;

public class SecondHightstNum {
	static void checkSecondHightst(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] >ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 5, 1 };

		System.out.println("Before:" + Arrays.toString(arr));
		checkSecondHightst(arr);
		System.out.println("After:" + Arrays.toString(arr));
		System.out.println("Second highest number is:" + arr[arr.length - 2]);
	}

}
