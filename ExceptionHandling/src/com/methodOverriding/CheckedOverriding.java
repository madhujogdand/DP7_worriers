package com.methodOverriding;

class parent {
	int data = 70;

	void printData() {
		System.out.println(data);
	}
}

class child extends parent {
	int val = 10;

	void printData() throws ArithmeticException {
		if (val == 0)
		{
            throw new ArithmeticException();
			
		}
		System.out.println(data / val);
	}

}

public class CheckedOverriding {

}
