package com.exception1;

public class UncheckedExceptionPropogation {
	void method1()
	{
		
		int data=50/0;
	}
	void method2()
	{
		method1();
	}
	void method3()
	{
		method2();
	}
	public static void main(String[] args) {
		UncheckedExceptionPropogation obj1=new UncheckedExceptionPropogation();
		obj1.method3();

	}

}
