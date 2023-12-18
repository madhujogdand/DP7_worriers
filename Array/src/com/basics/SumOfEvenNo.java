package com.basics;

public class SumOfEvenNo {

	static void findSum(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				sum+=ar[i];
			}
			
		}
		System.out.println("Sum of even number:"+sum);
	}
	public static void main(String[] args) {
		int arr[]= {2,5,6,8,9};

		findSum(arr);

	}

}
