package com.varags;

//we cannot override a method with varargs as argument
class Parent
{
	static void display(int ...ar)
	{
		for(int i:ar)
		{
			System.out.println(i);
		}
	}
		
}

class Child extends Parent
{
//	@Override
//	static void display(int ...ar)
//	{
//		int sum=0;
//		for(int i:ar)
//		{
//			sum+=i;
//		}
//	}

}

public class VaragsOverriding {

	public static void main(String[] args) {
		

	}

}
