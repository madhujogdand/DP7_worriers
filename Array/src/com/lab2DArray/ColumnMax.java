package com.lab2DArray;
/*27. WAP to print maximum in columns. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, 
{34, 42, 2}} output is: 34, 42, and 16. */
public class ColumnMax {

	static void checkMax(int ar[][])
	{
		for(int j=0;j<3;j++)
		{
			int max=Integer.MIN_VALUE;
			for(int i=0;i<3;i++)
			{
				if(ar[i][j]>max)
				{
					max=ar[i][j];
				}
			}
			System.out.println("Maximum column:"+max);
		}
			
	}
	public static void main(String[] args) {
		int arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
		checkMax(arr);
	}


}
