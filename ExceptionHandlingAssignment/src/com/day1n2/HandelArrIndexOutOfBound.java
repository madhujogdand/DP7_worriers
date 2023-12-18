package com.day1n2;

public class HandelArrIndexOutOfBound {
	static void handelExcetion(int ar[]) {
		try {
		for (int i = 0; i < ar.length; i++) {
			ar[i]=ar[i]+ar[i+1];
			System.out.println(ar[i]);
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("in ArrayIndexOutOfBound exception");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		handelExcetion(arr);
	}

}
