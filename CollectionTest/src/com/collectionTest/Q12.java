package com.collectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*12. Create a hashmap <int,String> where key is integers 1 to 10 
and string is number in words. Remove entry for which number is 
divisible by 3. [1M]*/
public class Q12 {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<>();

		hs.put(1, "One");
		hs.put(2, "Two");
		hs.put(3, "Three");
		hs.put(4, "Four");
		hs.put(5, "Five");
		hs.put(6, "Six");
		hs.put(7, "Seven");
		hs.put(8, "Eight");
		hs.put(9, "Nine");
		hs.put(10, "Ten");

		System.out.println(hs);
		
//		for (Map.Entry<Integer, String> e:hs.entrySet())
//		{
//			if (e.getKey() % 3 == 0)
//			{
//				hs.remove(e.getKey());
//				System.out.println(e.getKey()+" "+e.getValue());
//			}
//		}
		Iterator<Entry<Integer, String>> iterator = hs.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			if(entry.getKey()%3==0) {
				iterator.remove();
			}
		}
		System.out.println(hs);
	}

}
