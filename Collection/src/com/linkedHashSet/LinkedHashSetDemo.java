package com.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();

		lhs.add("Red");
		lhs.add("Green");
		lhs.add("Blue");
		System.out.println(lhs.add("Blue"));
		lhs.add(null);
		lhs.add("Purple");
		
		System.out.println(lhs);
		
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
