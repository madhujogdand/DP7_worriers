package com.labcodes;
import java.util.Scanner;
public class AdditionTill0 {
	static void addition(int num) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
    	num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			

			sum=sum+num;
			
		}
		System.out.println("Addition is: "+sum);
	}
	public static void main(String args[]) {
			addition(2);
		
	}
	
}
