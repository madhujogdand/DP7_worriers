 package com.frequency;

import java.util.Arrays;

public class UniqueArrayWC {

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
				if(count==1)
				{
					System.out.println(ar[i]);
				}
			
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,4,5,1,3,2,1,2,0,-1};
		System.out.println("Before:"+Arrays.toString(arr));
		findFreq(arr);
		
	}

}
