package com.CAQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*89. How do you remove first occurrence and last occurance of 
given element in linked list which implements queue.
92. How do you remove elements from linked list.
*/
public class Q89 {

	public static void main(String[] args) {
	
		Queue<String> q = new LinkedList<>();

		q.add("One");
		q.add("Two");
		q.add("Three");

		System.out.println(q);
		
		q.remove("One");
		System.out.println(q);
		
		q.remove(1);
		System.out.println(q);
		

		
	    
		
	}

}
