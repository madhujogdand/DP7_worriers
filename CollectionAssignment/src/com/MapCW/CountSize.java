package com.MapCW;

import java.util.HashMap;

import java.util.Map;

/*4.WAP to create a map using Wrapper class as key
 and value same as keys’ data type WAP to count 
 the number of key-value (size) mappings in a map.
6.WAP to get only the Keys from a HashMap
7.WAP to get only the Values from a HashMap*/
public class CountSize {

	public static void main(String[] args) {
        HashMap<Integer,Integer>hm=new HashMap<>();

        hm.put(1, 100);
        hm.put(2, 200);
        hm.put(3, 300);
        hm.put(4, 400);
        System.out.println(hm);
        int size=hm.size();
        System.out.println("Size:"+size);
        System.out.println("===================================");
        HashMap<String,String>hm1=new HashMap<>();

        hm1.put("Java","J");
        hm1.put("Oracle","O");
        hm1.put("Devops","D");
       
        System.out.println(hm1);
        int size1=hm1.size();
        System.out.println("Size:"+size1);
        
        System.out.println("===================================");
        System.out.println("Get only keys");
        for(Map.Entry<Integer, Integer> e:hm.entrySet())
        {
        	System.out.println(e.getKey());
        }
        
        System.out.println("===================================");
        System.out.println("Get only values");
        for(Map.Entry<Integer, Integer> e:hm.entrySet())
        {
        	System.out.println(e.getValue());
        }
	}

}
