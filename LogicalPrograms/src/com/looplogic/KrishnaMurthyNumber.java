package com.looplogic;
import java.util.Scanner;
public class KrishnaMurthyNumber {
	
	static void checkKrishnam(int num)
	{
		int original=num;
		long sum=0;
		long fact=1;
		
	while(num!=0)
	{
        int r=num%10;
        //factorial of r
        fact=1;
		for(int i=1;i<=r;i++)
		{
			fact*=i;
		}
		sum+=fact;
		num/=10;
	}
	if(original==sum)
	{
		System.out.println(original+"is Krishamurthy number");
	}
	else
	{
		System.out.println(original+"is not Krishmurthy number");
	}
	}	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		checkKrishnam(n);
		
		
		sc.close();
		
		
	}
}
