package com.ifelse;
import java.util.Scanner;

public class Voting {

	public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You Can Vote..");
			
		}
		else
		{
			System.out.println("You Can Not Vote...");
		
		}
		
		System.out.println("Rest of code..");
		
		sc.close();
	}
}
