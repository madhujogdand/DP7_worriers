package com.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque <Float> adq=new ArrayDeque<>();

		//adq.addLast(null);//add//not allows null
		adq.add(89.4f);
		adq.offerLast(96.3f);
		adq.addFirst(34.4f);
		
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.pollLast());
		System.out.println(adq.removeFirst());
		
		adq.push(80.3f);//addFist()
		
		System.out.println(adq);
		
		adq.push(67.4f);
		System.out.println(adq);
		System.out.println(adq.pop());//removeFirst
	}

}
