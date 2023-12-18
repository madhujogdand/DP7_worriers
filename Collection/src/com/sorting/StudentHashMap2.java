package com.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.HashMap.Student;

public class StudentHashMap2
{
	public static void sortByMarks(HashMap<Student,String>hm)
	{
		TreeMap<Student,String> tm=new TreeMap<>(new MarksComparator());
        tm.putAll(hm);
        
        for(Map.Entry<Student, String> e:tm.entrySet())
        {
        	System.out.println(e.getKey()+"--->"+e.getValue());
        }
		
		
		
	}
	public static void main(String[] args) {
		
		HashMap<Student,String> shm=new HashMap<>();

		shm.put(new Student(101,"Anuj",90),"Java");
		shm.put(new Student(105,"Neha",98),"Python");
		shm.put(new Student(107,"shraddha",67),"Java");
		shm.put(new Student(104,"Radha",90),".net");
		shm.put(new Student(104,"Radha",90),"Java");
		shm.put(new Student(106,"Shivani",76),"Python");
	
	    for(Map.Entry<Student, String> e: shm.entrySet())
	    {
	    	System.out.println("Id:"+e.getKey());
	    	System.out.println("Details:"+e.getValue());
	    	System.out.println("-------------------------------------");
	    }
		System.out.println("===================================");
		sortByMarks(shm);
		
		
	}
}
