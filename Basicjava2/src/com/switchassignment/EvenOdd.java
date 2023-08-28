package com.switchassignment;

import java.util.Scanner;

public class EvenOdd {

	public static void main (String args[]) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter number:");
		int num=sc.nextInt();
		
		 switch(num%2)
		 {
		 case 0:
			  System.out.println("This is even no"); 
		       break;
		 case 1:
		      System.out.println("This is 0dd no");
		      break;
		 }   
		 sc.close();
		 }
}
