package com.CAArrayList;

import java.util.ArrayList;

/*4. Create arraylist of 10 integers. Insert an element at 7th position.*/
public class Q4InsertEleme7thPos {

	public static void main(String[] args) {
		
ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<=10;i++)
		{
		   al.add(i);
		}
		System.out.println(al);
		System.out.println("==================================");
		al.add(6, 11);
		
		System.out.println(al);

	}

}
