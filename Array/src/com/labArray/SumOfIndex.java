package com.labArray;

public class SumOfIndex {

	static void checkSum(int ar[])
      {
		int sum=0;
		for(int i=0;i<ar.length/2;i++)
		{
		
			sum=ar[i]+ar[ar.length-i-1];
			 System.out.println("Sum:"+sum);
			
		}
	   
      }

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 4, 4, 6 };
		checkSum(arr);
	}

}
