package com.basics;

public class SumOfEvenNo2 {

	static int findSum(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				sum+=ar[i];
			}
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {4,5,10,2,9,45};

		System.out.println("Sum of even number:"+findSum(arr));

	}

}
