package com.labArray;

import java.util.Arrays;

public class EvenLeftSide {

	static int[] checkEven(int ar[])
    {
		int newArr[]=new int[ar.length];
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				newArr[count]=ar[i];
				count++;
			}
		}	
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]%2!=0)
			{
				newArr[count]=ar[j];
				count++;
			}
		}	
		return newArr;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,1,4,6,7,8,11};	
		System.out.println("Before:"+Arrays.toString(arr));
		checkEven(arr);
	
		System.out.println("After:"+Arrays.toString(checkEven(arr)));
	}

}
