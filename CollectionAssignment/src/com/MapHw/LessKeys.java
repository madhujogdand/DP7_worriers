package com.MapHw;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*14.	WAP to get the portion of a HashMap whose keys are strictly less than a given key
 * 15.	WAP to get the portion of this HashMap whose keys are less than (or equal to, if inclusive is true) a given key*/
public class LessKeys {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");

		System.out.println(hm);

		int key = 5;

		Set<Entry<Integer, String>> entr = hm.entrySet();
		for (Entry<Integer, String> e : entr)
		{
			if (e.getKey() < key)
				System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("====================================");
		
		Set<Entry<Integer, String>> entr1 = hm.entrySet();
		for (Entry<Integer, String> e : entr)
		{
			if (e.getKey() <= key)
				System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
	}

}
