package com.LogicalArray;

import java.util.Arrays;

//1)WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
public class SecondMaximumNum {

	static void checkSecondMax(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {20, 0, 31, 45, 100, 1, 105, 90};
		System.out.println("Before:"+Arrays.toString(arr));
		checkSecondMax(arr);
		System.out.println("After:"+Arrays.toString(arr));
		System.out.println("Second highest number is:"+arr[arr.length-2]);

	}

}
