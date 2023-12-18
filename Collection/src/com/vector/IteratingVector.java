package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector {

	public static void main(String[] args) {

		Vector<String> lang = new Vector<>();

		lang.add("C");
		lang.add("Java");
		lang.add("Python");
		lang.add("Angular");
		lang.add(".net");
		
		//1st way
		System.out.println(lang);
		System.out.println("--------------------------------");
		//2nd way
		for(int i=0;i<lang.size();i++)
		{
			System.out.println(lang.get(i));
		}
		
		System.out.println("--------------------------------");
		
		//3rd way
		for(String str:lang)
		{
			System.out.println(str);
		}
		
		//4th way
		
		Iterator <String> itr=lang.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		//5th way
		ListIterator<String>litr=lang.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("==============================");
		
		//6th way:traverse backward
		ListIterator<String>litr1=lang.listIterator(lang.size());
		while(litr1.hasPrevious())
		{
			System.out.println(litr1.previous());
		}
		System.out.println("==============================");
		
		//7th Enumeration
       Enumeration<String> en= lang.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
