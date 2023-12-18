package com.LogicalArray;
/*11. WAP to calculate average of all elements in an Array except max and min element 
(Means don’t include the highest and lowest number of your array in your average).*/ 
import java.util.Arrays;
import java.util.Scanner;

public class AverageElelements {

	static void checkMaxMInElements(float ar[])
	{
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					float temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}
		
		
		float avrg=0.0f;
		float sum=0.0f;
		int k=0;
		for( k=k+1;k<ar.length-1;k++)
			
			sum=sum+ar[k];
		
		System.out.println("sum:"+sum);
	

		avrg=sum/ar.length;
		System.out.println("Average of all elemnts:"+avrg);
	
	
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		float arr[]=new float[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the values:");
			arr[i]=sc.nextFloat();
		}
		System.out.println("Before:"+Arrays.toString(arr));
		checkMaxMInElements(arr);
		System.out.println("After:"+Arrays.toString(arr));
	}

}
