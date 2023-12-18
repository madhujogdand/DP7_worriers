package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentHashMap2 {

	public static void main(String[] args) {
	
		HashMap<Student,String> shm=new HashMap<>();

		shm.put(new Student(101,"Anuj",90),"Java");
		shm.put(new Student(105,"Neha",88),"Python");
		shm.put(new Student(107,"shraddha",78),"Java");
		shm.put(new Student(104,"Radha",90),".net");
		System.out.println("Old:"+shm.put(new Student(104,"Radha",90),"Java"));
		System.out.println("==============================================");
		shm.put(new Student(106,"Shivani",76),"Python");
	
	    for(Entry<Student, String> e: shm.entrySet())
	    {
	    	System.out.println("Id:"+e.getKey());
	    	System.out.println("Details:"+e.getValue());
	    	System.out.println("-------------------------------------");
	    }
		
		
	}

}
