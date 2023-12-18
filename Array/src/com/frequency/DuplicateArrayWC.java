package com.frequency;

import java.util.Arrays;

public class DuplicateArrayWC {

	static void findFreq(int ar[])
	{
		int count;
		boolean visited;
		//checking if the element compared
		for(int i=0;i<ar.length;i++)
		{
			count=1;
			visited=false;
			//checking if the element compared:not a new element
			for(int j=i-1;j>=0;j--)
			{
				if(ar[i]==ar[j])
				{
					visited=true;
					break;
				}
			}
			if(visited==false)
			{
				for(int k=i+1;k<ar.length;k++)
				{
					if(ar[i]==ar[k])
					{
					count++;
					}
				}
				
				if(count>1)
				{
					System.out.println(ar[i]);
				}
			
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,5,2,1,1};
		System.out.println("Before:"+Arrays.toString(arr));
		findFreq(arr);
		System.out.println("After:"+Arrays.toString(arr));
	}

}
