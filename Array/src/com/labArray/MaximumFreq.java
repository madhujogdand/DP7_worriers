package com.labArray;

import java.util.Arrays;

public class MaximumFreq {

	static void checkMaxFreq(int ar[]) {
		//int newArr[] = new int[ar.length];
		//int num[] = new int[ar.length];
		int count;
		boolean visited;
		int maxFreq = 0;
		int num = 0;
		
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			visited = false;
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
				System.out.println(ar[i] + "--->" + count);
			}
			if (count > maxFreq) {
				maxFreq = count;
				num = ar[i];
			}
		}
		System.out.println("Maximun frequency is:" + num + "--->" + maxFreq);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 2, 1, 3, 4, 4,4 };
		System.out.println("Before:" + Arrays.toString(arr));
		checkMaxFreq(arr);
	}
}
 