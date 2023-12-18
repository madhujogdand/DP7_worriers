package com.treeSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIterator {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();

		ts.add("Java");
		ts.add("python");
		ts.add("angular");
		ts.add("springboot");
		ts.add("html");
		
		System.out.println(ts);
		
		System.out.println("====================================");
		
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("====================================");
		for(String s:ts)
		{
			System.out.println(s);
		}
		System.out.println("====================================");
		Iterator<String>itr1=ts.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("====================================");
	    NavigableSet<String> nm=ts.descendingSet();
	    for(String s:nm)
	    {
	    	System.out.println(s);
	    }
	    Set<String>
	    sysnchts=Collections.synchronizedSet(ts);
	}

}
