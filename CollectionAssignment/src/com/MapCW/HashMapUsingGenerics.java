package com.MapCW;

import java.util.HashMap;
import java.util.Map;

/*3.WAP to add elements to a HashMap using generics
 *  with Integer as Key and String as value.
 *   And 4 key-value Map.Entry*/
public class HashMapUsingGenerics {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(1, "Java");
		hm.put(2, "C++");
		hm.put(3, "Oracle");
		hm.put(4, ".net");
		
//		for(Map.Entry<Integer, String> entry:hm.entrySet())
//		{
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		System.out.println(hm.entrySet());
	}

}
