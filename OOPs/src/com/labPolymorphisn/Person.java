package com.labPolymorphisn;

public class Person
{

	void activity(int salary)
	{
		int annualSalary = salary * 12;
		System.out.println("Persons Annual salary is:" + annualSalary);
	}

	void activity(String name, String role)
	{
		System.out.println("Name of person is:" + name);
		System.out.println("Role at home is:" + role);
	}

	String activity(String gname)
	{
		return "The person is with his friend and he is playing:" + gname;
		
	}

  public static void main(String args[]) {
    	Person p1=new Person();
    	p1.activity(45000);
    	p1.activity("Neha", "Mother");
    	System.out.println(p1.activity("Badminton"));
    } 
}