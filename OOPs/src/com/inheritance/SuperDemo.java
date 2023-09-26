package com.inheritance;


class Parent
{
	int value;
	{
      value=10;
	}
	void display()
	{
		System.out.println("Welcome"); 
	}
}

class Child extends Parent
{
	//shadowing
	int value;
	{
		value=100;
	}
    void printValue()
    {
    	System.out.println("parent value:"+super.value);
    	System.out.println("Child Value:"+super.value);
        super.display();
    }
    
    void display()
    {
    	//super.display();
    	System.out.println("Hi");
    }

}


public class SuperDemo {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.printValue();
		//c1.display();
				

	}

}
