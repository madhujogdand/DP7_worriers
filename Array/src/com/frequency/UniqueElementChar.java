package com.frequency;

import java.util.Arrays;

public class UniqueElementChar {

	static void findUnique(char ar[])
	{
		int count;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]=='\0')
				continue;
			count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]='\0';
				}
				
			}
			if(count==1)
			{
				System.out.println(ar[i]);
			}
		}
	}
	public static void main(String[] args) {
	  char arr[]= {'a','b','a','e','f','a','b','a'};
		System.out.println("Before:"+Arrays.toString(arr));
		findUnique(arr);
		System.out.println("After:"+Arrays.toString(arr));
		char ch='\0';
		System.out.println("Null:"+ch);

	}

}
