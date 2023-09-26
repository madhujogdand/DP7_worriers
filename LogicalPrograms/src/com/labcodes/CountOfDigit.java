package com.labcodes;
import java.util.Scanner;
public class CountOfDigit {
	static void countdigit(int num)
	{
		int count=0;
		while(num>0)
		{
			//int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println("Count is: "+count);
		//System.out.println("factorial of digit: "+num);
		
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number: ");
    int num=sc.nextInt();
    countdigit(num);
    sc.close();
}
}
