package com.OOPSMethod;
//11
public class SquareCalulation {
   int a;
	void calSquare()// using no return type
	{
		System.out.println("Square using no return type is:"+(a*a));
	}
	int calSquare1()//with return type
	{
		return (a*a);
	}
	void calSquare2(int a)//with parameter passing
	{
		System.out.println("Square with parameter passing is"+(a*a));
	}

	int calSquare3(int a)// with parameter and return type
	{
		return (a*a);
	}
	public static void main(String[] args) {
		SquareCalulation s=new SquareCalulation();
		s.a=8;
		s.calSquare();
		int square=s.calSquare1();
		System.out.println("Square with return type is"+square);
		s.calSquare2(6);
		int square2=s.calSquare3(7);
		System.out.println("Square with parameter and return type is"+square2);
	}

}
