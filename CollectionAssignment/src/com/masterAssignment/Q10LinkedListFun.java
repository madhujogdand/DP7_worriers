package com.masterAssignment;

/*10. What is the output of the program*/

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q10LinkedListFun {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Jan");
		ll.add("Feb");
		ll.add("Apr");
		ll.add("Jan");
		Collections.sort(ll);
		ListIterator itr = ll.listIterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ll.add(2, "August");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

/*o/p--->
Apr
Feb
Jan
Jan
Exception in thread "main" java.util.ConcurrentModificationException*/