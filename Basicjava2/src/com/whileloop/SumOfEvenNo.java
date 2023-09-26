package com.whileloop;
import java.util.Scanner;
public class SumOfEvenNo {
	
public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				sum+=rem;
			}	
			num/=10;
		}
		System.out.println("Sum of even no."+sum);
		sc.close();
}
}