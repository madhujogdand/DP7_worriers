package com.labCodes;

public class PatternHalfPyramid {

	public static void main(String[] args) {
		int n=3;
		//for rows
		for(int i=1;i<=n;i++)
		{
			//for spaces
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("  ");
			}
			//for numbers
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++)
//		{
//		
//			for(int j=n-i;j<=1;j++)
//			{
//				System.out.print("  ");
//			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
