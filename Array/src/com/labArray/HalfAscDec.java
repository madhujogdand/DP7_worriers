package com.labArray;
import java.util.Arrays;
public class HalfAscDec {

	static void checkHalfAsc(int ar[]) {
		int newArr[] = new int[ar.length];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length / 2; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length / 2; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 6, 7, 9 };
		System.out.println("Before:" + Arrays.toString(arr));
		checkHalfAsc(arr);
		System.out.println("After sorting:" + Arrays.toString(arr));
	}
}
