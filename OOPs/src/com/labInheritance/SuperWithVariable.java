package com.labInheritance;

class Parent
{
	int x=20;
	int y=30;
	int z=100;

	void display()
	{
		System.out.println("Prent value"+(x+y));
	}
}
class Child extends Parent
{
	int x=30;

	void display()
	{
		System.out.println("Prent value of X"+super.x);
		System.out.println("Child value of X:"+x);
		System.out.println(super.x+x);
		System.out.println(x+super.x+y);
		System.out.println("value of z:"+z);
		super.display();
	}
	void show()
	{
		System.out.println("show method");
		
	}

}
public class SuperWithVariable {
	public static void main(String[] args) {
	
		
		Child c=new Child();
		c.display();
		
	}

}
