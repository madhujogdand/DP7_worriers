package com.lab2DArray;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column=sc.nextInt();
        
        int arr[][]=new int[row][column];
        //for use input
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<column;j++)
        	{
        		System.out.println("Enter values:");
        		arr[i][j]=sc.nextInt();
        	}
        	
        }
        //for printing
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<column;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println("");
        }
        sc.close();
	}

}
