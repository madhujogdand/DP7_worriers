package com.exception;

import java.util.Scanner;

public class NestedTry2 {

	public static void main(String[] args) {

		int arr[] = { 4, 0, 9 };
		try {

			for (int i = 0; i <= arr.length; i++) {

				System.out.println("ans:" + (100 / arr[i]));

			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " - Index is greater");
		} catch (ArithmeticException e) {
			System.out.println(e + " - canot divide by zero");
		}

		catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("---------------------------------");

			System.out.println("Task closed");
		}
	}

}
