package com.MapCW;
/*1.WAP to add elements to a HashMap without 

  using generics (ie do not use <>) and print 
  content of it. Use Integer as Key and String
  as Value. In second HashMap add elements of
  String type as Key and Integer as Value.
2.WAP add elements to HashMap without using 
generics, 0th location use String as key and 
Integer as value, on 1st location use String as
 key String and Integer as value.*/
import java.util.HashMap;

public class HashMapGenerics {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		
		hm.put(1, "Neha");
		hm.put(2, 27);
		hm.put(3, 'C');
		hm.put(4, 67.3f);
		hm.put("Radha",67);
		hm.put("java",78);		
		
		System.out.println(hm);
		
		HashMap<String,Integer> hm1=new HashMap();
		
		hm1.put("Radha", 32);
		hm1.put("Priti", 46);
		hm1.put("Siya", 98);
		hm1.put("Shraddha", 78);
		hm1.put("Shraddha", 38);
		
		System.out.println(hm1);

	}

}
