package com.basics;

public class MaximumNum {

	static void checkMax(int ar[])
	{
		int maxNum=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>maxNum)
			{
				maxNum=ar[i];
			}
			
		}
		System.out.println("Maximum number is:"+maxNum);
	}
	public static void main(String[] args) {
		int arr[]= {5,4,7,9,10,3,2};
		
		checkMax(arr);
	}

}
