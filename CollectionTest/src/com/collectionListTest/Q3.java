package com.collectionListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*3.	Write a code that shows Iterator is fail fast. [1M]*/
public class Q3 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		
		System.err.println(al);
		
		Iterator<String> itr=al.iterator();
		al.add("six");
		while(itr.hasNext())
		{
			itr.next();
			itr.remove();
		}
	    System.out.println(al);
	}

}
