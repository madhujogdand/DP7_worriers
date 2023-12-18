package com.CASet;

import java.util.HashSet;
import java.util.Iterator;

/*51. Create hashset of strings. Add 10 elements to the set. 
Iterate through hashset using iterator and for each loop. */
public class Q51 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("red");
		hs.add("blue");
		hs.add("black");
		hs.add("pink");
		hs.add("green");
		hs.add("orange");
		hs.add("white");
		hs.add("gray");
		hs.add("peach");
		hs.add("yellow");

		// using for each loop
		for (String s : hs) {
			System.out.println(s);
		}
		System.out.println("==========================================");
		// using iterator

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
