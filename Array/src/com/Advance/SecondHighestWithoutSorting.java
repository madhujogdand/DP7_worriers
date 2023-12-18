package com.Advance;

public class SecondHighestWithoutSorting {

	static void secondHigh(int ar[])
	{
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>highest)
			{
				shighest=highest;
				highest=ar[i];
			}
			else if(ar[i]>shighest)
			{
				shighest=ar[i];
			}
			
		}
		System.out.println("Secong highest number is:"+shighest);
	}
	public static void main(String[] args) {
	  int arr[]= {6,7,10,3,4,9,5};
	  secondHigh(arr);
	}

}
