package com.staticAssignment;


class Person1
{
	void display()
	{
		System.out.println("I am a person");
	}

}

class Employee1 extends Person1
{
	
	void display()
	{
	
		System.out.println("I am an employee");
	}
}

class Celebrity1 extends Person1
{
	
	void display()
	{
		
		System.out.println("I am a celebrity");
	}
}

public class HW5{

	public static void main(String[] args) {
     Person1 p1=new Person1();
     p1.display();
     
     Employee1 e1=new Employee1();
     e1.display();
     
     Celebrity1 c1=new Celebrity1();
     c1.display();
		
		
		
	}

}

 


