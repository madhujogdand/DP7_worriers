package com.CAArrayList;

import java.util.ArrayList;

/*. Create a arraylist of integers. Add first 50 odd numbers to 
arraylist. */
public class Q2AddOddNo {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
				al.add(i);
			}
		}
		System.out.println(al);
	}

}
