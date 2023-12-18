package com.exception1;

public class CheckedExceptionPropogation3 {

	void method1()throws ClassNotFoundException
	{
			throw new ClassNotFoundException("class error");
		
	}
	void method2()throws ClassNotFoundException
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
			System.out.println(e);
		}
	}
	public static void main(String[] args)throws ClassNotFoundException {
		CheckedExceptionPropogation3 obj1=new CheckedExceptionPropogation3();
		obj1.method3();

	}

}
