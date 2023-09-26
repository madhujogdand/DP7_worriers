package com.stars;
import java.util.Scanner;
public class DiamondPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n=sc.nextInt();		
		for(int i=1;i<=n;i++)
		{
			//for spaces
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			//for numbers
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
     for(int i=n-1;i>=1;i--)
     {
	//for spaces
	for(int j=1;j<=(n-i);j++)
	{
		System.out.print(" ");
	}
	//for numbers
	for(int j=1;j<=i;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
}

sc.close();
	}

}
