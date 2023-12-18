package com.LogicalArray;

import java.util.Arrays;

/*10. Write a Java program to find a missing number in an array. Means e.g. array has 1 
to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 
5*/
public class MissingNo {

	static void checkMissing(int ar[])
	{
		int count=0;
		System.out.println("Missing number is:");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				count++;
			}
			if(ar[i]!=count)
			{
				System.out.println(count);
				count++;
			}
			
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,8};
		System.out.println("Before:"+Arrays.toString(arr));
		checkMissing(arr);

	}

}
