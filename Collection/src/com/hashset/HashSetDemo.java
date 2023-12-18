package com.hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();

		hs.add("java");
		hs.add("C++");
		hs.add("C#");
		// System.out.println(hs.add("Go"));
		hs.add("SQL");
		hs.add("Python");
		hs.add("Angular");
		hs.add("Go");
		//hs.add(".net");
		// System.out.println(hs.add("Go"));
		hs.add(null);

		System.out.println(hs);

		//Mathematical Operations
		HashSet<String> hs2 = new HashSet<>();

		hs2.add("java");
		hs2.add("C++");
		hs2.add(".net");
		System.out.println(hs2);
		
		//Mathematical Operations
		//union
		//hs.addAll(hs2);
		//System.out.println(hs);
		
		//difference
		
		//hs.removeAll(hs2)
		//System.out.println(hs2);
		
		//Intersection
		hs.retainAll(hs2);
		System.out.println(hs);
	}

}
