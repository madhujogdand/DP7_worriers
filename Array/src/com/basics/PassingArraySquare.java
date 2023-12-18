package com.basics;

import java.util.Arrays;

public class PassingArraySquare {
   static void squareArray(int ar[])
   {
	   for (int i=0;i<ar.length;i++)
	   {
		   ar[i]=ar[i]*ar[i];
	   }
	   System.out.println("After: "+Arrays.toString(ar));
   }
	public static void main(String[] args) {
	    int arr[]={1,6,7,8,3};
	    System.out.println("Before Square:"+Arrays.toString(arr));
	    squareArray(arr);
	}

}
