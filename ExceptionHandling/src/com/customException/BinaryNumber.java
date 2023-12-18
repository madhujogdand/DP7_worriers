package com.customException;

import java.util.Scanner;

public class BinaryNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Binary number:");
	int num = sc.nextInt();


	try 
	{
		if (num==0 && num==1)
		{
			throw new InvalidBinaryNoException("Entered Invalid binary number");
		}
		System.out.println(num+" is binary number");
	}
	catch (InvalidBinaryNoException e)
	{
		System.out.println(e);
	}
	
	sc.close();
}
}