package com.loopassignment;

import java.util.Scanner;

public class Factors {
	public static void main(String args[]) {
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter any number:");
		  int num=sc.nextInt();
		  
		  for(int i=1;i<=num;i++)
		  {
			if(num%i==0)
				System.out.println(i+" is factor of "+num);
				//System.out.println(i);

		  }
		  sc.close();
}
}