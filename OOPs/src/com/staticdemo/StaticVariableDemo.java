package com.staticdemo;

public class StaticVariableDemo {
	int x=10;
	static int y=20;
	
	//we can use any variable in instance method
	void instanceMethod()
	{
		System.out.println(x);
		System.out.println(y);
	}
	//
	static void staticMethod()
	{
		//System.out.println(x);compile error
		System.out.println("y:"+y);
		
	}

	public static void main(String[] args) {
		StaticVariableDemo s1=new StaticVariableDemo();
       s1.instanceMethod();
       
       staticMethod();
	}

}
