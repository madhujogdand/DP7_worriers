package com.lab2DArray;
/*28. WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, 
{34, 42, 2}} output is: 12, 5, 2.*/
public class ColumnMin {

	static void checkMin(int ar[][])
	{
		for(int j=0;j<3;j++)
		{
			int min=Integer.MAX_VALUE;
			for(int i=0;i<3;i++)
			{
				if(ar[i][j]<min)
				{
					min=ar[i][j];
				}
			}
			System.out.println("Maximum column:"+min);
		}
			
	}
	public static void main(String[] args) {
		int arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
		checkMin(arr);
	}

}
