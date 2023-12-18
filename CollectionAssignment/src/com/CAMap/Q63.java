package com.CAMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*63. Create hashmap<String, int>. Add 10 elements to hashmap 
and iterate map using for each loop and using iterator
70. Show use of putifabsent method of map.*/
public class Q63 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);
		hm.put("six", 6);
		hm.put("seven", 7);
		hm.put("eight", 8);
		hm.put("nine", 9);
		hm.put("ten", 10);
		
		System.out.println(hm);
		System.out.println("=============================================");
		hm.putIfAbsent("Eleven", 11);//Q70
		System.out.println(hm);
		System.out.println("=============================================");
		
		hm.putIfAbsent("five", 5);
		System.out.println(hm);
		System.out.println("=============================================");
		
		//using for each loop
		System.out.println("using for each loop");
        for(Map.Entry<String, Integer> entry:hm.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("============================================");
        //using Iterator
        System.out.println("using iterator");
        Iterator<Map.Entry<String, Integer>> itr=hm.entrySet().iterator();
        while(itr.hasNext())
        {
        	Map.Entry<String, Integer> entry=itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
	}

}
