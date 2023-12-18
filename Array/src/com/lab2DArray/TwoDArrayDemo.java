package com.lab2DArray;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		int arr[][]=new int[3][3];
		//for row
		for(int i=0;i<3;i++)
		{
			//for column
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
       
	}

}
