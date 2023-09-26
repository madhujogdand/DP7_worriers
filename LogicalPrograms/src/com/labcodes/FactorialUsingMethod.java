package com.labcodes;

import java.util.Scanner;

public class FactorialUsingMethod {
	
	static void show(int num)
	{
		long fact=1;
		for(int i=1;i<=num;i++)
		  {
			fact*=i;
		  }
		System.out.println("Factorial of "+num+"is: "+fact);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter any number:");
		  int num=sc.nextInt();
		  show(num);
		  
      sc.close();
	}

}
