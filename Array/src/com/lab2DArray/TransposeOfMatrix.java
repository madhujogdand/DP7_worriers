package com.lab2DArray;

public class TransposeOfMatrix {

	static void checkTranspose(int ar[][])
	{
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<2;i++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println("");
		}
			
	}
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6}};
		checkTranspose(arr);
	}

}
