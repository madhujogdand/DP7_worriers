package com.overriding;

class Person
{
	void display()
	{
		System.out.println("I am a person");
	}

}

class Employee extends Person
{
	@Override
	void display()//protected, public but not default or private
	{
		//super.display();
		System.out.println("I am an employee");
	}
}

class Celebrity extends Person
{
	@Override
	void display()
	{
		//super.display();
		System.out.println("I am a celebrity");
	}
}

public class MethodOverRidingDemo {

	public static void main(String[] args) {
     Person p1=new Person();
     p1.display();
     
     Employee e1=new Employee();
     e1.display();
     
     Celebrity c1=new Celebrity();
     c1.display();
		
		
		
	}

}
