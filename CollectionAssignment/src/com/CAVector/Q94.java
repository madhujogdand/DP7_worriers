package com.CAVector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*94. Create a vector of 5 string objects. Add 5 strings to it.
 * 95. Iterate through vector using iterator.
 * 96. Iterate through vector using enumerator.
 * 97. Show in example that enumerator is fail safe.
 * 98. Show in program that iterator is fail fast.*/
public class Q94 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Apple");
		v.add("Orange");
		v.add("Banana");
		v.add("Kiwi");
		v.add("Grapes");
		
		System.out.println(v);
		
		System.out.println("=============================");
		//Q95
		Iterator<String> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//v.add("Pear");//Q98
		}
		
		System.out.println(v);
		System.out.println("=============================");
		//Q96
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("=============================");
		//Q97
		v.add("Guava");
		System.out.println(v);
		
		System.out.println("=============================");
		
	}

}
