package com.switchst;
import java.util.Scanner;
public class NumberOfDays {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the month name(lowercase):");
		String mname=sc.next();
		
		switch(mname)
		{
		case"january":
		case"march":
		case"may":
		case"july":
		case"august":
		case"october":
		case"december":
		
		System.out.println("31 days");
		     break;
		     
		case"april":     
		case"june":
		case"sepetember":
		case"november":
		
		System.out.println("30 days");
		
		case"february":
		
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if((year%400==0)||(year%4!=0)||(year%100==0))
		{
			System.out.println("29 days");
			
		}
		else
		{
			System.out.println("28 days");
		}
		break;
		default:System.out.println("error in input");
		}
		
		sc.close();
	}
}
