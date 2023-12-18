package com.frequency;

import java.util.Arrays;

public class FindFreqElement {

	static void findFreq(int ar[])
	{
		int count;
		boolean visited;
		
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
				for(int k=i;k<ar.length;k++)
				{
					if(ar[i]==ar[k])
					{
					count++;
					}
				}
				//all elements
			  System.out.println(ar[i]+"---->"+count);
			
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,4,5,1,3,2,1,2};
		System.out.println("Before:"+Arrays.toString(arr));
		findFreq(arr);
		System.out.println("After:"+Arrays.toString(arr));
	}

}
