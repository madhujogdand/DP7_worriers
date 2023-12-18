package com.exception1;

import java.util.Scanner;

public class ThrowWithTryCatch {

	static Scanner sc = new Scanner(System.in);

	static void enterDetails()
	{
	System.out.println("Enter name:");
	String name=sc.next();
	System.out.println("Enter marks:");
	try {
	int marks=sc.nextInt();
	if(marks<0)
	{
		throw new RuntimeException("Marks should be greater than 0");
	}
	else
	{
		if(marks>=40)
		{
			System.out.println(name+" has cleared the exam");
		}
		else
		{
			System.out.println(name+" has failed.......");
		}
	} 
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}

	public static void main(String[] args) {
		enterDetails();

	}

}
