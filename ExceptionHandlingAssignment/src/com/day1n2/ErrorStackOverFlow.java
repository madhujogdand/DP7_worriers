package com.day1n2;

public class ErrorStackOverFlow {
	static int stackOverFlowErrorMethod() {
		int sum = 0;
		int a = 15, b = 5;
		sum = a + b;
		return sum + stackOverFlowErrorMethod() + 2;
	}

	public static void main(String[] args) {
		stackOverFlowErrorMethod();
	}
}
