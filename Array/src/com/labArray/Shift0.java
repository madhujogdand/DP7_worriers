package com.labArray;

import java.util.Arrays;

public class Shift0 {

	static int[] check0(int ar[])
	{
		int newArr[]=new int[ar.length];
		int count=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				newArr[count]=ar[i];
				count++;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				newArr[count]=ar[i];
				count++;
			}
		}
		return newArr;
	}
	static int[] check0Right(int ar[])
	{
		int newArr[]=new int[ar.length];
		int count=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				newArr[count]=ar[i];
				count++;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				newArr[count]=ar[i];
				count++;
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		int arr[]= {1,0,12,3,0,4};
		System.out.println("Before:"+Arrays.toString(arr));
		System.out.println("After:"+Arrays.toString(check0(arr)));
		System.out.println("After:"+Arrays.toString(check0Right(arr)));
	}

}
