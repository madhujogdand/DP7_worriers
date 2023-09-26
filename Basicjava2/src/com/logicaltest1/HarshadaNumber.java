package com.logicaltest1;
import java.util.Scanner;
public class HarshadaNumber {

	static void checkHarshada(int num)
	{   
		int sum=0;
		int original=num;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println("sum="+sum); 
		if(original%sum==0)
		{
			System.out.println("Harshada number");
		}
		else
		{
			System.out.println("not Harshada number");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
        int num=sc.nextInt();
        checkHarshada(num);
        
        sc.close();
	}
    
}
