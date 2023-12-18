package com.LogicalArray;

import java.util.Arrays;

/*4)&5) WAP to reverse the array itself, don’t print array in reverse – I want current array 
reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
37, 29, 45, 90, 3] by using temporary array.*/
public class ReverseArray {

	static int[] checkReverse(int ar[])
	{
		int newArr[]=new int[ar.length];
		for(int i=0; i<ar.length;i++)
		{
			newArr[i]=ar[ar.length-1-i];
		}
		return newArr;
	}
	public static void main(String[] args) {
		int arr[] = {3, 90, 45, 29, 37, 78};
		System.out.println("Before:"+Arrays.toString(arr));
		
		System.out.println("After:"+Arrays.toString(checkReverse(arr)));
	}

}
