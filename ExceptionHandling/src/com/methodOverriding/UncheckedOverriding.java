package com.methodOverriding;


class parent1
{
	int data=70;
	
	void printData()throws ArithmeticException
	{
		System.out.println(data);
	}

}

class Child1 extends parent1
{
	int val=0;
	
	void printData()throws ArithmeticException, ArrayIndexOutOfBoundsException//IOException
	
	{
		if (val==0)
		{
			throw new ArithmeticException();
		}
		System.out.println(data);
	}
    // throw new IOException();
}
public class UncheckedOverriding {

}
