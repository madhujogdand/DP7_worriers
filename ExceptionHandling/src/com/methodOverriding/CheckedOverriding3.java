package com.methodOverriding;

import java.io.IOException;

class Parent3 {
	int data = 70;

	void printData()throws Exception
	{
		System.out.println(data);
	}
}

class Child3 extends Parent3
{
	int val=10;
	void printData()throws ArithmeticException,IOException
	{
		if(val==0)
		{
			throw new ArithmeticException();
		}
		System.out.println(data);
		
		//throw new IOException();
	}
}

public class CheckedOverriding3 {

}
