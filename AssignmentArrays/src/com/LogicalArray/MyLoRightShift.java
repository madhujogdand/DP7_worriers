package com.LogicalArray;

import java.util.Arrays;


public class MyLoRightShift {
   static void rightShift(int ar[])
   {   
	   int rev=0;
	   for(int i=0;i<ar.length;i++)
	   {
		  rev=ar[i];
		  ar[i]=ar[ar.length-1];
		  ar[ar.length-1]=rev;
	   }
	   System.out.println("Reverse array:"+Arrays.toString(ar));
   }
	public static void main(String[] args) {
		int arr[]= {3, 90, 45, 29, 37, 78};
		System.out.println("Before:"+Arrays.toString(arr));
		int n=3;
		for(int i=0;i<n;i++)
		{
		rightShift(arr);
		}
		
	}

}
