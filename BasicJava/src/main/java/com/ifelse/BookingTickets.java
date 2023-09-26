package com.ifelse;
import java.util.Scanner;

public class BookingTickets {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Airlines");
		
		System.out.print("Enter your Airline Name:");
		String name=sc.next();
		
		System.out.print("Enter your depart place:");
		String depart=sc.next();
		
		System.out.print("Enter your destination place:");
		String desti=sc.next();
		
		System.out.print("Enter the price:");
		double price=sc.nextDouble();
		
		
		
		System.out.println("Enter the coupon code if you have:");
		int coupon=sc.nextInt();
		
		
		if(coupon==34567)
		{
			
			System.out.println("We are providing you 10% discount on your ticket");
			double discount=price*0.1;
			System.out.println("Your Discount is:"+discount);
			price=(price-discount);
			System.out.println("your final price is:"+price);
			System.out.println("Welcome to Airlines..."+name+" "+ "Your ticket is booked from"+" "+depart+" "+ "to"+" "+desti+" "+ "with 10% discount:"+price+" Enjoy THE JOURNEY...");
		}
		
		else
		{
			System.out.println("No such coupone code available...."+"Rs."+price+"is your final price. ENJOY THE JOURNEY....");
			
		}
		
		
	
		
		sc.close();
		
		}
	
	
}
