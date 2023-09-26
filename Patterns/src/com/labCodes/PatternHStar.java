package com.labCodes;

public class PatternHStar {

	public static void main(String[] args) {
		//for row
		for(int i=1;i<=5;i++)
		{
			//for *
			for(int j=1;j<=5;j++)
			{
				//column
				if(j==1||j==5||i==3)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
