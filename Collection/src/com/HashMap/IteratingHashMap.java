package com.HashMap;


import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) {
		HashMap<String, Double> hm=new HashMap<>();
		
		hm.put("Radha", 89.6);
		hm.put("Neha", 89.6);
		hm.put("Aashu", 90.4);
		hm.put("Priti", 99.3);
		hm.put("Pradnya", 84.5);
		
		//1st way
		System.out.println(hm);
		
		System.out.println("===========================");
		
		//2nd way--->using enhanced for
		Set<String> keys=hm.keySet();
        for(String s:keys)
        {
        	System.out.println(s+"--->"+hm.get(s));
        }
        System.out.println("===========================");
		
        //3rd way--->using iterator First we need to set the value then iterate
        
        Iterator<String> itr=keys.iterator();//here keys reference is used
        while(itr.hasNext())
        {
        	String k=itr.next();
        	System.out.println(k+"--->"+hm.get(k));
        }
        
        System.out.println("===========================");
		
        //4th way--->using collection
        Collection<Double> marks=hm.values();
        for(Double m:marks)
        {
        	System.out.println(m);
        }
        System.out.println("===========================");
	
        //5th way---> using setEntry
        Set<Entry<String,Double>> entries=hm.entrySet();
        for(Entry<String,Double> e:entries)
        {
        	System.out.println(e.getKey()+"=="+e.getValue());
        }
        System.out.println("===========================");
		
        //6th way----> shortcut of Entry
        for(Map.Entry<String, Double> e:hm.entrySet())
        {
        	System.out.println(e.getKey()+"--->"+e.getValue());
        }
	}

}
