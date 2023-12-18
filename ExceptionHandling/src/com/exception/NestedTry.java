package com.exception;

import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 4, 0, 9 };

		try {

			for (int i = 0; i <= arr.length; i++) {
				try {
					System.out.println("ans:" + (100 / arr[i]));
				} catch (ArithmeticException e) {
					System.out.println(e + " - canot divide by zero");
				}
			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " - Index is greater");
		}

		catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("---------------------------------");
			sc.close();
			System.out.println("Scanner closed");
		}
	}

}
