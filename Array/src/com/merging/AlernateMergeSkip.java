package com.merging;

import java.util.Arrays;

public class AlernateMergeSkip {

	static int[] mergeArraySkip(int ar1[], int ar2[]) {
		int maxLength = Math.max(ar1.length, ar2.length);
		int mar[] = new int[maxLength];

		int index = 0;
		int i = 0;
		while (index < maxLength) {
			if (i < ar1.length) {
				mar[index++] = ar1[i++];
				//index++;
				//i++;
			}
			if (i < ar2.length) {
				mar[index++] = ar2[i++];
			}
		}

		return mar;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 11, 12, 13 };

		int m[] = mergeArraySkip(arr1, arr2);

		System.out.println(Arrays.toString(m));

	}

}
