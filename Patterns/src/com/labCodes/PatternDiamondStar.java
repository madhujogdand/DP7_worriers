package com.labCodes;
import java.util.Scanner;
public class PatternDiamondStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");   //rows=n;
		int n = sc.nextInt();
		
		//for rows
		for(int i=1;i<=n;i++)
		{
			//for spaces
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			//for numbers
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 || j==2*i-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		//for rows
     for(int i=n-1;i>=1;i--)
     {
	    //for spaces
	   for(int j=n-1;j>=i;j--)
	   {
		System.out.print(" ");
	   }
	     //for numbers
	    for(int j=1;j<=2*i-1;j++)
	    {
		    if(j==1 || j==2*i-1)
		    {
		     System.out.print("*");
		    }
		    else
		    {
			System.out.print(" ");
		    }
	    }
	   
	   System.out.println("");
     }
	sc.close();
     }	
   }
	

