package com.lab;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
	
		HashMap<String,Integer> hm=new HashMap<>();

		hm.put("Jan", 31);
		hm.put("Feb", 28);
		hm.put("March", 31);
		hm.put("April", 30);
		hm.put("May", 31);
		hm.put("June", 30);
		hm.put("July", 31);
		
		System.out.println(hm);
		System.out.println("-----------------------------------------");
		
		HashMap<Integer,Integer> newMap=new HashMap<>();
		Iterator<String> itr=hm.keySet().iterator();
		
		while(itr.hasNext())
		{
			int count;
			String month=itr.next();
			int days=hm.get(month);
			if(newMap.containsKey(days))
			{
				count=newMap.get(days);
				count++;
			}
			else
			{
				count=1;
			}
			newMap.put(days, count);
		}
		System.out.println(newMap);
	
	
	}

}
