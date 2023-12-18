package com.loosecoupling;

abstract class Student
{
	int id;
	String name;
	
//	Student(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}	
	
	abstract void display();
}

class SchStudent extends Student
{
	//error if we dont add it
	//Student(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
	void display()
	{
		System.out.println("I am school Student");
	}
}
class ClgStudent extends Student
{
	void display()
	{
		System.out.println("I am college Student");
	}
}
public class AbstractClassLoose {
	void displayDetails(Student s)
	{
		s.display();
	}

	public static void main(String[] args) {
	AbstractClassLoose obj=new AbstractClassLoose();

	}

}
