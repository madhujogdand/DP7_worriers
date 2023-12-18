package com.labArray;
import java.util.Scanner;
public class AverageRainfall {

	static void checkAverage(float ar[])
	{
		float sum=0.0f;
		float avrg=0.0f;
		for(int i=0;i<ar.length;i++)
		 {
			sum=sum+ar[i];
		 }
		System.out.println("Sum is:"+sum);
		avrg=sum/ar.length;
		System.out.println("Average rainfall of one week:"+avrg);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        float arr[]=new float[size];
        for(int j=0;j<size;j++)
        {
        	System.out.println("Enter the value:");
        	arr[j]=sc.nextFloat();
        }
        checkAverage(arr);
        sc.close();
	}

}
