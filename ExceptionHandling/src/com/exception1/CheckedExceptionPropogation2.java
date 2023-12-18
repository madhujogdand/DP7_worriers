package com.exception1;

public class CheckedExceptionPropogation2 {

	void method1()
	{
		try
		{
			throw new ClassNotFoundException("class error");
		}
		catch(Exception e)
		{
			System.out.println("in method1:"+e);
		}
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
		CheckedExceptionPropogation2 obj1=new CheckedExceptionPropogation2();
		obj1.method3();

	}

}
