package com.lab2DArray;
/*26. WAP to print minimum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
output is: 9 and 12.*/
public class RowMinValue {

	static void checkMin(int ar[][])
	{
		System.out.println(ar.length);
		for(int i=0;i<2;i++)
		{
			int min=Integer.MAX_VALUE;
			
			for(int j=0;j<3;j++)
			{
				
				if(ar[i][j]<min)
				{
					min=ar[i][j];
				}
			}
			System.out.println("Minimum number is:"+min);
		}
	}
	public static void main(String[] args) {
		int arr[][] = {{22, 31, 9}, {12, 25, 16}};
		checkMin(arr);
	}

}
