package com.staticFinal;

//9.	WAP to use this and super in an instance method
class Parent1
{
    String parentField;
    Parent1()
    {
    	
    }
    Parent1(String value)
    {
        this.parentField = value;
    }

    void display()
    {
        System.out.println("Parent class: " + parentField);
    }
}

class Child1 extends Parent1
{
    String childField;
    Child1()
    {
    	
    }
    Child1(String parentValue, String childValue)
    {
        super(parentValue); 
        this.childField = childValue;
    }

    void display()
    {
        super.display(); 
        System.out.println("Child class: " + childField);
    }

    void displayBothFields()
    {
        System.out.println("Using 'this' in Child class: " + this.parentField);
        System.out.println("Using 'super' in Child class: " + super.parentField);
    }
}
public class SuperThis
{
	public static void main(String[] args)
	{
        Child1 child = new Child1("Father", "Son");
        child.display();
        child.displayBothFields();
    }
}
/*
 Parent class: Father
Child class: Son
Using 'this' in Child class: Father
Using 'super' in Child class: Father
 */
