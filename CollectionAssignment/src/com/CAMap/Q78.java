package com.CAMap;

import java.util.LinkedHashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/*78. Show use of firstkey , lastkey , headmap , tailmap , submap 
methods.*/
public class Q78 {

	public static void main(String[] args) {
		
		NavigableMap<Integer,String> nm = new TreeMap<Integer, String>();

	     nm.put(1, "one");
	     nm.put(4, "four");
	     nm.put(5, "five");
	     nm.put(2, "two");
	     nm.put(3, "three");
	     
	     System.out.println(nm);
	     
	     System.out.println(nm.firstKey());
	     System.out.println(nm.lastKey());
	     System.out.println(nm.headMap(2));
	     System.out.println(nm.headMap(2,false));
	     System.out.println(nm.tailMap(4));
	     System.out.println(nm.tailMap(4,false));
	     System.out.println(nm.subMap(2,5));
	     System.out.println(nm.subMap(2,false,5,true));
	}

}
