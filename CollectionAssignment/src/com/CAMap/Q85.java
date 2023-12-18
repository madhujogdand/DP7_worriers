package com.CAMap;

import java.util.ArrayList;
import java.util.HashMap;

/*85. Hashmap hmap contains integer keys and string values. 
Create two array lists, one will contain all keys and other will 
contain all values.*/
public class Q85 {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "one");
		hmap.put(2, "two");
		hmap.put(3, "three");
		hmap.put(4, "four");
		hmap.put(5, "five");
		
		System.out.println(hmap);
		
		ArrayList<Integer> keyal=new ArrayList<>(hmap.keySet());
		ArrayList<String> valueal=new ArrayList<>(hmap.values());
		
		System.out.println(keyal);
		System.out.println(valueal);
		
		
		

	}

}
