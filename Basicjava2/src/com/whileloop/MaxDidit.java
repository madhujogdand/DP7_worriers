package com.whileloop;
import java.util.Scanner;
public class MaxDidit {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int num=sc.nextInt();
	 
	 int digit=0;
	 while(num!=0)
	 {
		 int rem=num%10;
		 if(rem>digit)
		 {
			 digit=rem;
		 }
		 num/=10;
	 }
	 System.out.println("Max digit of number: "+digit);
	 
	 sc.close();
 }
}
