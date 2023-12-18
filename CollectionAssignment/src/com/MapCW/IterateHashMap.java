package com.MapCW;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*5.WAP to get all the entries from a HashMap. 
Iterate the entries and print the Key&Value values*/
public class IterateHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(1, "radha");
		hm.put(2, "neha");
		hm.put(3, "priya");
		hm.put(4, "priti");
		hm.put(5, "aashu");
		//1st way
		System.out.println(hm);
		//2nd way by using enhanced for loop
		Set<Integer> keys=hm.keySet();
		for(Integer i:keys)
		{
			System.out.println(i+"--->"+hm.get(i));
		}
		System.out.println("===================================");
		//3rd way by Iterator
		Iterator<Integer> itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			System.out.println(i+"--->"+hm.get(i));
		}
		System.out.println("===================================");
		//4th way by using Collection
		Collection<String> id=hm.values();
		for(String c:id)
		{
			System.out.println(c);
		}
		System.out.println("===================================");
		//5th way by using Set
		Set<Entry<Integer,String>>entries=hm.entrySet();
		for(Entry<Integer,String>e:entries)
		{
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		System.out.println("===================================");
		//6th way by Map:Shortcut
		for(Map.Entry<Integer, String> entries1:hm.entrySet())
		{
			System.out.println(entries1.getKey()+" "+entries1.getValue());
		}
	}

}
