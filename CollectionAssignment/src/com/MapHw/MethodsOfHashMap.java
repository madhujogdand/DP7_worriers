package com.MapHw;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Set;

/*1.WAP to copy all of the mappings from the specified
 HashMap to another map
2.WAP to test a HashMap is empty or not
3.WAP to test if a HashMap contains a mapping for the specified key
4.WAP to search for an element from HashMap using key
5.WAP to test if a HashMap contains a mapping for the specified value
6.WAP to remove an element from HashMap using key
7.WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
*/
public class MethodsOfHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		System.out.println("HashMap is empty or not");
		System.out.println(hm.isEmpty());// 2

		hm.put(1, "Neha");
		hm.put(2, "Radha");
		hm.put(3, "Manisha");
		hm.put(4, "Shivansh");

		System.out.println(hm);
		System.out.println(hm.isEmpty());
		System.out.println("=======================");

		HashMap<Integer, String> hm1 = new HashMap<>();
		System.out.println("Copy HashMap to another Hashmap");
		hm1.putAll(hm); // 1
		System.out.println(hm1);

		System.out.println("=======================");

		System.out.println("Contains key");
		System.out.println(hm.containsKey(5));// 3

		System.out.println("=======================");

		System.out.println("Serach Element using key");
		System.out.println(hm.get(4));// 4
		System.out.println(hm.get(5));
		//System.out.println(hm.containsKey(4));

		System.out.println("=======================");

		System.out.println("Contains value");
		System.out.println(hm.containsValue("Radha"));// 5
		System.out.println(hm.containsValue("Priti"));

		System.out.println("=======================");

		System.out.println("Remove an element using key");
		hm.remove(1);// 6
		System.out.println(hm);
		System.out.println(hm.remove(5));

		System.out.println("=======================");

		System.out.println("Empty Map using iterator");
		System.out.println("Before empty:" + hm);
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			itr.next();
			itr.remove();
		}
		System.out.println("After empty:" + hm);

	}

}
