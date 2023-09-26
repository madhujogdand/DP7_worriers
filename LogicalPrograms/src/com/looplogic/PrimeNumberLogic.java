package com.looplogic;

public class PrimeNumberLogic {
	static boolean checkprime(int n)
	{
		boolean status=true;
		if((n==0)||(n==1))
		    status=false;
		else
		{
			for(int i=2;i<n;i++)//(i<=n/2)(i<n)
			{
				if(n%i==0)
				{
					status=false;
					break;
				}
			}	
		}
		return status;
		
	}
	public static void main(String args[]) {
		//System.out.println(checkPrime(23));
		//series print prime numbers from 1-50
		
		System.out.println("Prime numbers from 1-50");
		System.out.println();
		for(int i=1;i<=50;i++)
		{
			if(checkprime(i))//if (checkPrime(i)==true)
			{
				System.out.print(i+" ");
			}
		}
			
	}

}
