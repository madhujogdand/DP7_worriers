package com.alphabet;

import java.util.Scanner;

public class Pyramidab {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("  ");//2 spaces
			}
			//for alphabet
		
		   for(int j=1;j<=(2*i-1);j++)
			
			{
				System.out.print("ab");
			}
			System.out.println();
		}
		sc.close();
}
}