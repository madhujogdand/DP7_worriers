package com.labInterface;

interface A1
{
	default void print()
	{
      System.out.println("This is default method of A");
	}

}

interface B1 extends A1
{
	default void print()
	{
		System.out.println("This is default method of B");
	}
}

interface C extends A1
{
	default void print()
	{
		System.out.println("This is default method of c");
	}
}

class Simple1 implements B1, C ,Cloneable
{

	public void print()
	{
	
		B1.super.print();
		C.super.print();
		System.out.println("Simple implements B");
		System.out.println("Simple implements C");
	}
	
	
	
}

public class DiamondProblemWithoutClass {

	public static void main(String[] args) {
          Simple1 s=new Simple1();
               s.print();
	}

}
