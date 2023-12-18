package com.LogicalArray;

import java.util.Arrays;

//2)WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23] 
public class SecondMinimumNum {

	static void checkSecondMin(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {-20, 0, -25, 15, 19, 37, 23};
		System.out.println("Before:"+Arrays.toString(arr));
		checkSecondMin(arr);
		System.out.println("After:"+Arrays.toString(arr));
		System.out.println("Second highest number is:"+arr[arr.length-2]);

	}

}
