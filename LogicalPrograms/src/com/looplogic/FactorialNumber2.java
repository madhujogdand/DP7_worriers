package com.looplogic;

public class FactorialNumber2{

	static long factNumber(int n)//formal/local/dumm argument
		{
			long fact=1;
			for(int i=1;i<=n;i++)
			{
				fact*=i;
			}
			
			return fact;//last argument
		
		
		}
		public static void main (String args[]) {
			
			//long ans;
		
			long ans=factNumber(7);
			System.out.println("The factorial of 7 is:"+ans);
			
			ans=factNumber(9);
			System.out.println("The factorial of 9 is:"+ans);
			
			System.out.println("The factorial of 5 is:"+factNumber(5));
			
			
			
		}




	}

	
	

