package com.labArray;
import java.util.Arrays;
import java.util.Scanner;
public class InsertElement {

	static void addNum(int ar[],int index,int num)
	{
		for(int i=ar.length-1;i>index;i--)
		{
		 ar[i]=ar[i-1];
		}
		ar[index]=num;
		
	}

	public static void main(String[] args) {
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before:"+Arrays.toString(arr));
		
		System.out.println("Enter index position to insert num:");
		int index=sc.nextInt();
		System.out.println("Enter num number to insert in array :");
		int num=sc.nextInt();
		addNum(arr,index,num);
		System.out.println("After:"+Arrays.toString(arr));
		//insertElement(arr,2,100,size);
		sc.close();
	}

}
