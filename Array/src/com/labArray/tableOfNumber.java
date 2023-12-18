package com.labArray;
/*20. Accept number from user and add table
  of number in array and display*/
import java.util.Scanner;

public class tableOfNumber {

	static void table(int ar[],int n)
	{
		int i;
		int newArr[]=new int[ar.length];
		for(i=0;i<ar.length;i++)
		{
			newArr[i]=n*(i+1);
		}
		
		System.out.println("Table of"+n+":");
		//System.out.println(n+"X"+(i+1)+"="+newArr[i]);
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(n+"X"+(i+1)+"="+newArr[i]);
		}
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter length of array");
	    int length=sc.nextInt();
	    System.out.println("Enter number:");
	    int num=sc.nextInt();
	    int arr[]=new int[num];
	    table(arr,num);
	    
	}

}
