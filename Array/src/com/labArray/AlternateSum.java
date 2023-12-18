package com.labArray;

public class AlternateSum {

	static void checkAlternate(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)// (check index position 1,3,5)
			//(i%2!=0)(check index position 2,4,6)
			{
				sum=sum+ar[i];
			}
		}
		System.out.println("sum of alternate numbers:"+sum);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		checkAlternate(arr);
       
	}

}
