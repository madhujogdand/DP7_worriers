package com.day1n2;

public class ShowIndexOutOfBoundException {
	public static void main(String[] args) {
		try {
			String s1 = "hello";
			String s2 = s1.substring(6);
			System.out.println(s2);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("in StringIndexOutOfBoundsException");
		}
		try {
			int arr[] = { 1, 2, 3, 4 };
			System.out.println(arr[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("in ArrayIndexOutOfBoundsException");
		}
	}

}
