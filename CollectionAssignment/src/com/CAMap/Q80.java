package com.CAMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*80. Implement hashcode and equals method to avoid duplicate 
entry of employees in hashmap. */
public class Q80 {

	public static void main(String[] args) {
       
		HashMap<Employee, String> hm=new HashMap<>();
		
		hm.put(new Employee(1,"Neel",45000),"sales");
		hm.put(new Employee(2,"leela",65000),"HR");
		hm.put(new Employee(3,"tara",55000),"IT");
		hm.put(new Employee(3,"tara",55000),"IT");
		hm.put(new Employee(4,"neha",48000),"Finance");
		hm.put(new Employee(5,"radha",46000),"marketing");

	    for(Map.Entry<Employee, String> entry:hm.entrySet())
	    {
	    	System.out.println(entry.getKey()+""+entry.getValue());
	    }

	}

}
