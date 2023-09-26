package com.labCodes;

public class PatternHalfDiamond {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			 for(int j=i;j<=2*i-1;j++)
		    {
		System.out.print("*");
		    }
		   System.out.println();
	    }

	}

}
