package com.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDEmo {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> pq=new PriorityQueue<>();

//		pq.add(12);
//		pq.add(67);
//		pq.add(199);
//		pq.add(34);
//		pq.add(32);
//		pq.add(67);
		
//		System.out.println(pq);
		
		pq.add(45);
		pq.add(23);
		pq.add(12);
		pq.add(10);
		//pq.add(null);
		pq.add(10);
		
		System.out.println(pq);
	}

}
