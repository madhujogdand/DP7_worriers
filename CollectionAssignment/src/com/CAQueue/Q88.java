package com.CAQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q88 {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();

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
