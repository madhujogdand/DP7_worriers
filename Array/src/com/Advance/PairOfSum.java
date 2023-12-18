package com.Advance;

public class PairOfSum {

	static void findPairs(int ar[],int s)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>s)
				continue;
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i]+ar[j])==s)
				{
					System.out.println("("+ar[i]+","+ar[j]+")");
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,4,5,6,7,2,3,0};
        int sum=7;
        findPairs(arr,sum);
	}

}
