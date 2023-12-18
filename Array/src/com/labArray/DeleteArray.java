package com.labArray;

public class DeleteArray {

	static void delete(int ar[],int pos,int size)
	{
		size=ar.length-1;
		for(int i=pos;i<size;i++)
		{
			ar[i]=ar[i+1];
		}
		size--;
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		delete(arr,3,4);

	}

}
