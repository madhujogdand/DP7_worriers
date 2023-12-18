package com.exception1;

public class UncheckedExceptionPropogation2 {
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
		try
		{
		method2();
		}
		catch(Exception e)
		{
			System.out.println("in method 3:"+e);
		}
	}
	public static void main(String[] args) {
		UncheckedExceptionPropogation2 obj1=new UncheckedExceptionPropogation2();
		obj1.method3();

	}

}
