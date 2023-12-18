package com.day1n2;

public class ShowThrowException {
	public static void main(String[] args) {
		int a = 10, b = 2, c;
		try {
			if (b == 0) {
				throw new ArithmeticException();
			} else {
				c = a / b;
				System.out.println(c);
			}
		} finally {
			System.out.println("in finally block");
		}
	}

}
