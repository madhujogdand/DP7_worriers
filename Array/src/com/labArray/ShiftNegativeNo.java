package com.labArray;

import java.util.Arrays;

public class ShiftNegativeNo {

	static int[] checkNegative(int ar[])
	{
		int newArr[]=new int[ar.length];
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				newArr[count]=ar[i];
				count++;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				newArr[count]=ar[i];
				count++;
			}
		}
		
	return newArr;
	}
	static int[] shiftRight(int ar[])
	{
		int newArr[]=new int[ar.length];
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				newArr[count]=ar[i];
				count++;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				newArr[count]=ar[i];
				count++;
			}
		}
		
	return newArr;
	}
	public static void main(String[] args) {
		int arr[]= {2,5,-1,4,-4,3,-6};
		System.out.println("Before:"+Arrays.toString(arr));
		System.out.println("Left shift:"+Arrays.toString(checkNegative(arr)));
		System.out.println("Right shift:"+Arrays.toString(shiftRight(arr)));
	}

}
