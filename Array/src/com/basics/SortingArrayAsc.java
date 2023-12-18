package com.basics;

import java.util.Arrays;

public class SortingArrayAsc {
static void sortAr(int ar[])
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			//Swapping
			if(ar[i]>ar[j])//ascending
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}

}
	public static void main(String[] args) {
		int arr[]= {3,4,1,7,8,2};
		System.out.println("Before:"+Arrays.toString(arr));
		sortAr(arr);
		System.out.println("Before:"+Arrays.toString(arr));
	}

}
