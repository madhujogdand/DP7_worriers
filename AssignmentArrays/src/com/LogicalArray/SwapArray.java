package com.LogicalArray;

import java.util.Arrays;

/*8. WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 
0, 2, 4]*/
public class SwapArray {

	static void swap(int ar[])
	{
		int last=ar[ar.length-1];
		
		for(int i=ar.length-1;i>0;i--)
		{
			ar[i]=ar[i-1];
		}
		ar[0]=last;
		System.out.println("Shifting:"+Arrays.toString(ar));
	}
	public static void main(String[] args) {
		int arr[] = { 2, 4, 9, 0 };
		System.out.println("Before:"+Arrays.toString(arr));
		int n=2;
		for(int i=0;i<n;i++)
		{
			swap(arr);
		}
		System.out.println("After:"+Arrays.toString(arr));

	}

}
