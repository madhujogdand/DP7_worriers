package com.interfacedemo;

interface Showable
{
	void display();
	
}
interface PrintMe
{
	void display();
}

class Demo implements Showable,PrintMe
{
	public void display()
	{
		System.out.println("Welcome");
	}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
      Demo d=new Demo();
      d.display();

	}

}
