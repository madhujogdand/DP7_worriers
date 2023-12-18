package com.LogicalArray;
/*9. Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 
32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 
Here both arrays are equal */
public class EqualityOfArray {

	static void checkEquality(int ar1[],int ar2[])
	{
		int length1=ar1.length;
		int length2=ar2.length;
		if(length1==length2)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
	}
	public static void main(String[] args) {
	int	arr1[] = {12, 22, 32, 42, 52, 62};
	int arr2[] = {52, 22, 62, 12, 42, 22};
	checkEquality(arr1,arr2);
	}

}
