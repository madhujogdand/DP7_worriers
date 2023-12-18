package com.CAQueue;

import java.util.LinkedList;
import java.util.Queue;

/*86. Create queue using all constructors.*/
public class Q86 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();

		q.add("One");
		q.add("Two");
		q.add("Three");

		System.out.println(q);

		Queue<String> q1 = new LinkedList<String>(q);

		q1.add("Four");
		q1.add("Five");
		q1.add("Six");

		System.out.println(q1);
		

	}

}
