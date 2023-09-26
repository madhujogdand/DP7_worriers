package com.labOverriding;

class Student
{
	void display()
	{
		System.out.println("i am student");
	}
	
	void show()
	{
		System.out.println("Im showing details");
	}
	void test()
	{
		System.out.println("i am testing");
	}
}
class SchoolStudent extends Student
{
//	private void show()
//	{
//		super.show();
//		System.out.println("");
//	}
	 protected void display()
	{
		super.display();
		System.out.println("i am school student");
	}
	 
	public void test()
		{
		super.test();
			System.out.println("i am testing");
		}
}



public class AccessModifierRules {

	public static void main(String[] args) {
	 
	  
	  SchoolStudent s2= new SchoolStudent();
	  s2.display();
	  s2.test();
	  s2.show();

	}

}
