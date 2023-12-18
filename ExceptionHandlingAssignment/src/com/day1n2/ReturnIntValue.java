package com.day1n2;

public class ReturnIntValue {
	static int checkInt() {
		try {
			System.out.println("in try block");
			return 1;
		} finally {
			System.out.println("in finally block");
			return 2;
		}
	}

	public static void main(String[] args) {
		int ret = checkInt();
		System.out.println(ret);
	}

}
