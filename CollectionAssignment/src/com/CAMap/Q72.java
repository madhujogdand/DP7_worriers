package com.CAMap;

import java.util.HashMap;
import java.util.Map;

/*72. Create map within map. Iterate both.*/
public class Q72 {

	public static void main(String[] args) {
	
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);
		
		for(Map.Entry<String, Integer> entry:hm.entrySet())
		{
			System.err.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("===================================");
		
		HashMap<String,HashMap<String,Integer>> hm1 = new HashMap<>();

		hm1.put("num1", hm);
		hm1.put("num2", hm);
		hm1.put("num3", hm);
		hm1.put("num4", hm);
		hm1.put("num5", hm);
		
		for(Map.Entry<String, HashMap<String, Integer>> entry1:hm1.entrySet())
		{
			System.out.println(entry1.getKey()+" "+entry1.getValue());
		}
		
	}

}
