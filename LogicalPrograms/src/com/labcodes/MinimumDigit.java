package com.labcodes;

public class MinimumDigit {
	static void checkMinimum(int num)
	{
		int digit=9;
		while(num!=0)
		{
			int rem=num%10;
			if(rem<digit)
			{
				digit=rem;
			}
			num/=10;
		}
	     System.out.println(digit+"is a minimum number");
	   }
	public static void main(String args[])
	{
	    int num=4567998;
	    checkMinimum(num);
	    }


}
