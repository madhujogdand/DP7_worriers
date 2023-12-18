package com.MapHw;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class GreaterKey {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");

		System.out.println(hm);

		int key = 3;

		Set<Entry<Integer, String>> entr = hm.entrySet();
		for (Entry<Integer, String> e : entr)
		{
			if (e.getKey() > key)
				System.out.println(e.getKey()+" "+e.getValue());
		
		}

	}

}
