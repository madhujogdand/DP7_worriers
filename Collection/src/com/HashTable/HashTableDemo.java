package com.HashTable;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht=new Hashtable();
		
		//ht.put(1, null);
		System.out.println(ht.put(1, "Neha"));
		System.out.println(ht.put(1, "Madhu"));
		System.out.println(ht.put(2, "Radha"));
		System.out.println(ht.put(2, "Pradnya"));
		ht.put(3, "Priya");
		ht.put(4, "Aashu");
		ht.put(5, "Priti");
		//ht.put(null, "Anonymus");
		
		System.out.println(ht);

	}

}
