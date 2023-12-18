package com.lab2DArray;
/*25. WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
output is: 31 and 25.*/
public class RowMaxValue {

	static void checkMax(int ar[][])
	{
		
		for(int i=0;i<2;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=0;j<3;j++)
			{
				if(ar[i][j]>max)
				{
					max=ar[i][j];
				}
			}
			System.out.println("Maximum number is:"+max);
		}
	}
	public static void main(String[] args) {
		int arr[][] = {{22, 31, 9}, {12, 25, 16}};
		checkMax(arr);
	}

}
