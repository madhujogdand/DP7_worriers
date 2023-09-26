package com.ifelse;
import java.util.Scanner;
public class BloodDonation {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter weight:");
		int weight=sc.nextInt();
		
	
		if(age>=18)
		{
			if(weight>=70)
			{
			  System.out.println("Eligible to donate blood");	
			}
			else
			{
			  System.out.println("you are underweight");
			}
		}
	    
		else
		{
			System.out.println("Your age does not match");
		}
		
		sc.close();
			
	}

}
