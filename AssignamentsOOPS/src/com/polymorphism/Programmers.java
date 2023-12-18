package com.polymorphism;
//5     
class Programmer
{
	void workingHours()
	{
		System.out.println("Programmer works 8hrs per day");
	}
}
class Employee extends Programmer
{
	protected void workingHours()
	{
		System.out.println("Employee works 10hrs per day");
	}
}
public class Programmers {

	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.workingHours();
        System.out.println();
        Employee e=new Employee();
        e.workingHours();
        
	}

}
