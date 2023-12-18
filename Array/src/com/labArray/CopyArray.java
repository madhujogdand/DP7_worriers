package com.labArray;

import java.util.Arrays;

public class CopyArray {

	static int[] copy(int ar[])
	{
		int new_arr[]=new int[ar.length];

		for(int i=0;i<ar.length;i++)
		{
			
			new_arr[i]=ar[i];
			
		}
		return new_arr;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,1,4,6,7,8,11};
		System.out.println("Before:"+Arrays.toString(arr));
		copy(arr);
		System.out.println(Arrays.toString(copy(arr)));
	}

}
