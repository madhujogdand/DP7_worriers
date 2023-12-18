package com.CAMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*73. Create a hashmap <int,String> where key is integers 1 to 
10 and string is number in words. Remove entry for which 
number is divisible by 3 */
public class Q73 {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm = new HashMap<>();

	     hm.put(1, "one");
	     hm.put(2, "two");
	     hm.put(3, "three");
	     hm.put(4, "four");
	     hm.put(5, "five");
	     hm.put(6, "six");
	     hm.put(7, "seven");
	     hm.put(8, "eight");
	     hm.put(9, "nine");
	     hm.put(10, "ten");
		
		System.out.println(hm);
		System.out.println("=================================================================");
		 Iterator<Map.Entry<Integer, String>> itr=hm.entrySet().iterator();
	        while(itr.hasNext())
	        {
	        	Map.Entry<Integer,String> entry=itr.next();
	        	if(entry.getKey()%3==0)
	        	{
	        		itr.remove();
	        	}
	            System.out.println(entry.getKey()+" "+entry.getValue());
	        }
		

	}

}
