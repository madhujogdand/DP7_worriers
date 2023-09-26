package com.ifelse;
import java.util.Date;
import java.util.Scanner;
public class MovieTicket {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome....  Book movie ticket ");
	    Date d=new Date();
		System.out.print("Enter Movie Name:");
		String name=sc.next();
		
		System.out.print("Enter Rating:");
		float rating=sc.nextFloat();
		
		System.out.print("Enter the price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter the coupon code:");
		int coupon=sc.nextInt();
		
		
		if(coupon==0)
		{
			System.out.println("You got Rs.50 off");
			double discount=(price-50);
			System.out.println("Your final ticket price is:"+discount);
		}
		else if(coupon==1)
		    {
			System.out.println("You got Rs.100 off");
			double discount=(price-100);
			System.out.println("Your final final ticket price is:"+discount);
		    }
		    else
		    {
		    	System.out.println("No discount...Your ticket price is:"+price);
		    }
		System.out.println("Welcome... on "+d+" "+" You have booked ticket for "+name+" "+"Whose rating is "+rating+" "+"Enjoy the movie....");
     	
		
		
		
		
		
		sc.close();
		
	}

}
