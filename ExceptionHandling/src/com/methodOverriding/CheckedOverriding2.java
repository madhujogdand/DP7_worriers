package com.methodOverriding;

import java.io.IOException;

class Parent2 {
	int data = 70;

	void printData()throws Exception
	{
		System.out.println(data);
	}
}

class Child2 extends Parent2
{
	int val=10;
	void printData()throws ArithmeticException,IOException//,ExceptionUncheckedOverridind1.java
	{
		if(val==0)
		{
			throw new ArithmeticException();
		}
		System.out.println(data);
		
		//throw new IOException();
	}
}

public class CheckedOverriding2 {

}
