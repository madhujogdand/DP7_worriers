package com.labcodes;
import java.util.Scanner;
public class ArmstrongNumber {
	static void armstrong(int num)
	{
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			int cube=rem*rem*rem;
			sum=sum+cube;
			num=num/10;
		}
	  if(temp==sum)
	   {
		System.out.println(sum+" is a Armstrong number");
	   }
	 else
	   {
		System.out.println(sum+" is not a armstrong number");
	   }
	}
	
	public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number: ");
	 int num=sc.nextInt();
	 armstrong(num);
	 sc.close();
  
	 
	 
 }
}
