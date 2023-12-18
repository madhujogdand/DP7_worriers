package com.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*13. Hashmap hmap contains integer keys and string values. 
Create two array lists, one will contain all keys and other will 
contain all values.[1M]*/
public class Q13 {

	public static void main(String[] args) {
		HashMap<Integer, String> hs=new HashMap<Integer, String>();
		
		hs.put(1, "One");
		hs.put(2, "Two");
		hs.put(3, "Three");
		hs.put(4, "Four");
		hs.put(5, "Five");
		
		System.out.println(hs);
		
		ArrayList<Integer> al=new ArrayList<>(hs.keySet());
		ArrayList<String> al1=new ArrayList<>(hs.values());
		
		System.out.println(al);
		System.out.println(al1);
		
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "black");
		hmap.put(2, "white");
		hmap.put(3, "yellow");
		hmap.put(4, "red");
		
		ArrayList<Integer> als = new ArrayList<>();
		ArrayList<String> al2=new ArrayList<>();
		for(Map.Entry<Integer, String> e: hmap.entrySet()) {
			als.add(e.getKey());
			al2.add(e.getValue());
		}
		System.out.println(als);
		System.out.println(al2);
	}

}
