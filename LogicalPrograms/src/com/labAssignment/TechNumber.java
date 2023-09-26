package com.labAssignment;

import java.util.Scanner;

public class TechNumber {

	static void checkTechNo(int num)
	{
		int original = num;
		int count = 0;
		int pow=1;
		while (num != 0)
		{
			count++;
			num /= 10;

		}
		System.out.println("Count is:" + count);
		for(int i=1;i<=count/2;i++)
		{
			pow=pow*10;
		}
        if(count%2==0)
        {
        	int num1=original/pow;
        	
        	int num2=original%pow;
        	int sum=num1+num2;
        	System.out.println("Sum is"+sum);
        	int square=sum*sum;
        	System.out.println("square is"+square);
        	if(square==original)
        	{
        		System.out.println(original+" is a tech number");
        	}
        	else
        	{
        		System.out.println(original+"is not a tech number");
        	}
        }
        else
        {
        	System.out.println(original+"is not tech number");
        }
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();

		checkTechNo(num);

	}

}
