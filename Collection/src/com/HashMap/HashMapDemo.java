package com.HashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	   
		HashMap<String, Double> hm=new HashMap<>();
		
		hm.put("Kailash", 89.6);
		hm.put(null, 0.0);
		System.out.println(hm.put(null, 100.00));//replaced 0 with 100
		hm.put("Neha", 89.6);
		hm.put("Radha", 90.4);
		hm.put("Aashu", 99.3);
		hm.put("Priti", 84.5);

		System.out.println(hm);
		
		System.out.println("Size:"+hm.size());
		
		//get
		System.out.println("Marks of Radha:"+hm.get("Radha"));
		
		//contains
		System.out.println("Aarya:"+hm.containsKey("Aarya"));
		System.out.println("Aashu:"+hm.containsKey("Aashu"));

		System.out.println("89.6"+hm.containsValue(89.6));
		
		//putIfAbsent
		
		System.out.println(hm.putIfAbsent("Neha", 65.3));
		System.out.println(hm);
		
		System.out.println(hm.putIfAbsent("Aarya", 65.3));
		System.out.println(hm);
		
		
	}

}
