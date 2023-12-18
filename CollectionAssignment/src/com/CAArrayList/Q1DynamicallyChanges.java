package com.CAArrayList;

import java.util.ArrayList;

/* Show in program, that size of an arraylist dynamically changes */
public class Q1DynamicallyChanges {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println(al);
		System.out.println("Size of arrayList:"+al.size());

		al.remove(1);
		
		System.out.println(al);
		
		System.out.println("Size of arrayList after deleting Elemrnt:"+al.size());
		
		al.add(3);
		al.add(4);
		al.add(1);
		
		System.out.println(al);
		System.out.println("Size of arrayList after adding elements:"+al.size());

		
		
	}

}
