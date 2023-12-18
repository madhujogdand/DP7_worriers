package com.polymorphism;
//8
class Person
{
	void readScript()
	{
		System.out.println("im a perosn who is reading Script");
	}
}
class Actor extends Person
{
	public void readScript()
	{
		System.out.println("im a Actor who is reading Script");
	}
}
public class PersonDetails {

	public static void main(String[] args) {
	  Person p=new Person();
	  p.readScript();
	  Actor a=new Actor();
	  a.readScript();

	}

}
