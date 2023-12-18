package com.collectionTest;

import java.util.HashSet;
import java.util.Iterator;

/*11. Hashset contains string of 7 days of week. Iterate through 
hashset , remove ‘Saturday’ and ‘Sunday’ from set.*/
public class Q11 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		hs.add("Sunday");
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wednesday");
		hs.add("Thursday");
		hs.add("Friday");
		hs.add("Saturday");

		System.out.println(hs);

		hs.remove("Saturday");
		hs.remove("Sunday");
		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			if(value.equals("Saturday") || value.equals("Sunday")) {
				itr.remove();
			}
		}
		System.out.println(hs);
	}

}
