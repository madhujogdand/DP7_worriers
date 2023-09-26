package com.polymorphismm;

public class TypeProAmbiguity {

	static void add(int n1, double n2)
	{
		System.out.println("In method 1");
		System.out.println(n1+n2);
	}
	
	static void add(long n1, float n2)
	{
		System.out.println("In method 1");
		System.out.println(n1+n2);
	}
	
	public static void main(String[] args) {

          //add(9, 7.8f);
		//9; int: asking 7.8f to convert to double
		//7.8f; int: asking 9 to convert to long
	}

}
