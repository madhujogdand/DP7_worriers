package com.CAMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*76. Iterate through map using iterator.*/
public class Q76 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

	     lhm.put(1, "one");
	     lhm.put(2, "two");
	     lhm.put(3, "three");
	     lhm.put(4, "four");
	     lhm.put(5, "five");
	     
	     System.out.println(lhm);
	     
	     System.out.println("=======================================");
	     
	     Iterator<Map.Entry<Integer, String>> itr=lhm.entrySet().iterator();
          while(itr.hasNext())
          {
        	  Map.Entry<Integer, String> entry=itr.next();
        	  System.out.println(entry.getKey()+" "+entry.getValue());
          }
	}

}
