package com.lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentHashMap
{

	public static void main(String[] args)
	{
	   HashMap<Student,Integer> hm=new HashMap<>();
	   
	   hm.put(new Student(101, "Neha", "Java"), 78);
	   hm.put(new Student(102,"Radha",".net"), 38);
	   hm.put(new Student(103,"Priya","Oracle"), 89);
	   hm.put(new Student(104,"Teju","Python"), 49);
	   hm.put(new Student(105,"Priti","Devops"), 70);
	   hm.put(new Student(106,"Aashu","Devops"), 75);
	   hm.put(new Student(107,"Puja","Java"), 67);
	   hm.put(new Student(108,"Aarya",".net"), 79);
	   
	   	
		   System.out.println(hm);
	    
		System.out.println("======================================================");   
		   
	  ArrayList<Student> pass=new ArrayList<>();
	  ArrayList<Student> fail=new ArrayList<>();
	 
	  for(Map.Entry<Student,Integer> keys:hm.entrySet() )
	  {
		  if(keys.getValue()>50)
		  {
			  pass.add(keys.getKey());
		  }
		  else
		  {
			  fail.add(keys.getKey());
		  }
	  }
	  System.out.println("Pass student details:");
	  for(Student s:pass)
	  {
	    System.out.println(s);
	  }
	  
	  System.out.println("==================================================");
	  System.out.println("Fail student details:");
	  for(Student s:fail)
	  {
	    System.out.println(s);
	  }
	  System.out.println("---------------------------------------------------------------------");
	  
	  HashMap <String, Integer> hm1=new HashMap<>();
		Iterator<Student> itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			int count;
			Student student=itr.next();
			
			if(hm1.containsKey(student.getCourse()))
			{
				count=hm1.get(student.getCourse());
				count++;
			}
			else
			{
				count=1;
			}
			hm1.put(student.getCourse(), count);
		}
		System.out.println(hm1);
	
		
	  
		
	  
	}

}
