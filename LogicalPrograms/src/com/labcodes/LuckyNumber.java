package com.labcodes;
import java.util.Scanner;
public class LuckyNumber {
	
	static void findDigit(String name,int car_num,int lucky_num)
	{
		int count=0;
		while(car_num>0)
		{
			int rem=car_num%10;
			if(rem==lucky_num)
			{
			count++;
			}
			car_num=car_num/10;
		}
		System.out.println("lucky number count is: "+count);
		System.out.println(name+ " car number is "+car_num+" and lucky number is "+lucky_num+" and the lucky number count is "+count);
		
	}
	
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter name: ");
	 String name=sc.next();
	 System.out.println("Enter car_num: ");
	 int car_num=sc.nextInt();
	 System.out.println("enter lucky_num: ");
	 int lucky_num=sc.nextInt();
	 findDigit(name,car_num,lucky_num);
 
 
 sc.close();
 }
}
