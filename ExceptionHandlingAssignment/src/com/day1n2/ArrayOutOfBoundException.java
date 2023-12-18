package com.day1n2;

public class ArrayOutOfBoundException {
	static void checkExcetion(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			ar[i]=ar[i]+ar[i+1];
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		checkExcetion(arr);
	}
}
