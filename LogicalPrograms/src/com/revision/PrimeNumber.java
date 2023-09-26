package com.revision;

public class PrimeNumber {
	static boolean checkPrime(int num)
	{
		boolean status=true;
		
		// 0 and 1 > not prime
		if((num==0)||(num==1))
		{
			status=false;
			
		}
		// every num is divisible by 0 and 1 >> i=2
		// num is divisible b y itself <num
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0) // num is divisible by i
			{
			   status=false;
			   break;
			}
		}
		
		return status;
	}
	
	
	public static void main(String[] args) {
		
		// for single number
		
		int num=13;
		
		//boolean s= checkPrime(num);
		
		if(checkPrime(num)) // s==true  ... if(s) // checkPrime(num)== true
			
			// checkPrime== false   ....  if(!checkPrime(num))
		{
			System.out.println(num+ " is a prime number");
		}
		else
		{
			System.out.println(num+ " is not a prime number");
		}
		
		// range of number 1 to 50
		
		System.out.println("Prime numbers from 1 to 50 are:");
		
		for(int i=1;i<=50;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i);
			}
		}
		
        System.out.println("Non Prime numbers from 1 to 50 are:");
		
		for(int i=1;i<=50;i++)
		{
			if(!checkPrime(i))
			{
				System.out.println(i);
			}
		}
	}

}
