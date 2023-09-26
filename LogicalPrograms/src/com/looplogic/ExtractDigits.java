package com.looplogic;
import java.util.Scanner;
public class ExtractDigits {

	 static void extract(int num)
	 {
		System.out.println("The digits in the number"+num+"are: "); 
		while(num!=0)
		{
			System.out.println(num%10);
			num=num/10;
		}
		 
	 }
	 static void reverseNum(int num)
	 {
	
		System.out.println("reverse is : ");
		 int rev=0;
		 
		 while(num!=0)
		 {
			 int r=(num%10);
			 rev=rev*10+r;
			 num=num/10;
		 } 
	     System.out.println(rev);
	 }
	 
	 static void checkpalin(int num)
	 {
		int original=num;
		System.out.println("Check Palindrome : ");
		 int rev=0;
		 
		 while(num!=0)
		 {
			 int r=(num%10);
			 rev=rev*10+r;
			 num=num/10;
		 } 
		if(original==rev)	
			
		{
			System.out.println("Palindrome");
		}	
		else
		{
			System.out.println("Not a Palindrome");
		}
		 
	 }
	 public static void main (String args[]) { 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter any num: ");
		 int num=sc.nextInt();
	 extract(num);
	 reverseNum(num);
	 checkpalin(num);
	
	sc.close(); 
 }
	
	}

