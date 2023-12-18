package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterate {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("Angular");
		list.add("SpringBoot");
		
		System.out.println(list);
		
		System.out.println("-----------------------------------");
		
		//Normal for loop
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list);
        }
        System.out.println("-----------------------------------");
		
		//Enhanced for loop
        for(String s:list)
        {
        	System.out.println(s);
        }
        System.out.println("-----------------------------------");
		
		//Iterator
        Iterator<String> itr=list.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
        System.out.println("-----------------------------------");
		
		//List Iterator:forward
        ListIterator<String> litr=list.listIterator();
        while(litr.hasNext())
        {
        	System.out.println(litr.next());
        }
        System.out.println("-----------------------------------");
		
		//List Iterator:Backward
        ListIterator<String> litr1=list.listIterator(list.size());
        while(litr1.hasPrevious())
        {
        	System.out.println(litr1.previous());
        }
        System.out.println("-----------------------------------");
		
		//Iterator Descending iterator
        
	}

}
