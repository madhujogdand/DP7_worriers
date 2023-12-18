package com.CAQueue;

import java.util.LinkedList;
import java.util.Queue;

/*87. Implement queue interface using linked list.*/
public class Q87 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();

		q.add("One");
		q.add("Two");
		q.add("Three");

		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.peek());
		System.out.println(q);
		
		
	}

}
