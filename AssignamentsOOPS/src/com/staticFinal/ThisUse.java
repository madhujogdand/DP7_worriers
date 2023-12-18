package com.staticFinal;
//6.	WAP to show all the use of ‘this’ keyword
class Person 
{
    private String name;
    private int age;
    Person ()
    {
    	
    }
     Person(String name, int age)
     {
        // Use 'this' to differentiate between instance variables and constructor parameters
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void displayInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class ThisUse
{
	public static void main(String[] args)
	{
        Person person1 = new Person("Ritu", 30);
        Person person2 = new Person("Nitu", 25);
        
        person1.displayInfo();
        person2.displayInfo();
    }

}
