package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrays:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("Enter the value");
             arr[i]=sc.nextInt();
             
        }
        System.out.println(arr);//print hashcode
        System.out.println(Arrays.toString(arr));
	sc.close();
	}

}
