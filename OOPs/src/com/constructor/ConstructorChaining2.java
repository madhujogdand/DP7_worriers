package com.constructor;

class Test
{
	int a;
	int b;
	String name;
	
	Test()
	{
		System.out.println("Default constructor");
		this.a=10;
		this.b=20;
		this.name="Unknown";
		System.out.println("Task has to be done everytime");
	}
	
	Test(int a,int b)
	{
		this();		
		System.out.println("Param constructor");
		this.a=a;
		this.b=b;
	}
	
	Test(int a, int b,String name)
	{
		this();
		System.out.println("param constructor");
		this.a=a;
		this.b=b;
		this.name=name;
		
	}
	
	public String toString()
	{
		return "a: "+a+"\nb: "+b+"\nname: "+name;
	}
	
}

public class ConstructorChaining2 {

	public static void main(String[] args) {
		System.out.println("-----------");
		Test d1=new Test();
		System.out.println(d1);
		
		System.out.println("--------------");
		Test d2=new Test(30,40);
		System.out.println(d2);
		
		System.out.println("----------");
		Test d3=new Test(100,200,"Madhu");
		System.out.println(d3);
	

	}

}
