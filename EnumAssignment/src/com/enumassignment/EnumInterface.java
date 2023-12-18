package com.enumassignment;

public interface EnumInterface {
	int calculate(int a, int b);
}

enum Maths implements EnumInterface {
	ADD {

		@Override
		public int calculate(int a, int b) {
			return a+b;
		}
	},
	SUBTRACT{

		@Override
		public int calculate(int a, int b) {
			return a-b;
		}
	}
}