package com.MapHw;

import java.util.HashMap;
import java.util.Map.Entry;

/*12.WAP to create a Map which stores another Map as a value.
13.WAP to iterate the elements in the Map stored in the above Map*/
public class MapStoresAnthrMap {

	public static void main(String[] args) {
    
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		hm.put("Madhu", 78);
		hm.put("Neha", 70);
		hm.put("Priti", 98);
		
		for(Entry<String,Integer> e1:hm.entrySet())//13
		{
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
		
		System.out.println("====================================================");
		
		HashMap<Integer, HashMap<String, Integer>> hm1=new HashMap<>();
       
		hm1.put(1, hm);
		hm1.put(2, hm);
		hm1.put(3, hm);
		
		for(Entry<Integer, HashMap<String, Integer>> entry:hm1.entrySet())//12
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
	}

}
