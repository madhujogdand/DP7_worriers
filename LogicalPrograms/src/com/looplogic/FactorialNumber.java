package com.looplogic;

public class FactorialNumber {

	static void factNumber(int n)//formal/local/dumm argument
	{
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
			}
		
		System.out.println("The factorial of "+n+"is:"+fact);
	    
		//n=n+5;
		//system.out.println(n);
	
	}
	public static void main (String args[]) {
		
		//ctrl+7: to comment
		
//		int num;
//		num=7;
//		factNumber(num);//actual argument
//		
		factNumber(7);
		factNumber(9);
		factNumber(4);
		factNumber(5);
		//System.out.println(num);
		
		
	}




}
