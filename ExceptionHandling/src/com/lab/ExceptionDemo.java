package com.lab;

import java.util.Scanner;

public class ExceptionDemo {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterb number:");
		int num=sc.nextInt();
		
		try
		{
			if(num>99999)
			{
				throw new OutOfRangeException("Number is out of range");
			}
			System.out.println(num+" is within range");
		}
         catch(OutOfRangeException e)
		{
        	 
        	 System.out.println(e.getMessage());
		}

	}

}
