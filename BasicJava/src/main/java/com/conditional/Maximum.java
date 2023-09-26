//Write a Java program to find maximum between three numbers


package com.conditional;

import java.util.Scanner;

public class Maximum {
	public static void main(String args[]) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1:");
	    int num1=sc.nextInt();
	    System.out.println("Enter the num2:");
	    int num2=sc.nextInt();
	    System.out.println("Enter the num3:");
	    int num3=sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
			System.out.println(num1+"is greater");
			}
			else
			{
				System.out.println(num3+"is greater");
			}
		}
		else 
		{ 
			if(num2>num3)
		    {
			System.out.println(num2+" is greater");
		    }
		    else 
		    {
			System.out.println(num3+"is greater");
		    }
		}
		sc.close();
	
	}
}
