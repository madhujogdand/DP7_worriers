package com.CASet;

import java.util.ArrayList;
import java.util.Collections;
/*57. How to sort hashset of 10 integers.*/
import java.util.HashSet;

public class Q57 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();

		hs.add(7);
		hs.add(3);
		hs.add(9);
		hs.add(2);
		hs.add(6);
		hs.add(1);
		hs.add(8);
		hs.add(4);
		hs.add(10);
		hs.add(5);
		
		for (Integer i : hs)
		{
			System.out.println(i);
		}
		
		System.out.println("==================================");
		
		ArrayList<Integer> al=new ArrayList<Integer>(hs);
		
		Collections.sort(al);
		
		for (Integer i : hs)
		{
			System.out.println(i);
		}
	}

}
