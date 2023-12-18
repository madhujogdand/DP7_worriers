package com.Advance;

import java.util.Arrays;

public class LeftRotate {

	static void rotateOnce(int ar[])
	{
		int first=ar[0];
		for(int i=0; i<ar.length-1;i++)
		{
			ar[i]=ar[i+1];
		}
		ar[5]=first;
		System.out.println("Shifting:"+Arrays.toString(ar));
	}
	public static void main(String[] args) {
		int arr[]= {3,1,2,5,6,4};
		System.out.println("Before:"+Arrays.toString(arr));
		int n=3;
		for(int i=0;i<n;i++)
		{
		rotateOnce(arr);
		}
		System.out.println("After:"+Arrays.toString(arr));
	}

}
