package com.collectionTest;

import java.util.PriorityQueue;

/*1. What will be output of following code. [1M]*/
public class Output1 {
 public static void main(String[] args)
 {
 PriorityQueue<Integer> queue = new PriorityQueue<>();
 queue.add(11);
 queue.add(10);
 queue.add(22);
 queue.add(5);
 queue.add(12);
 queue.add(2);
 while (queue.isEmpty() == false)
 System.out.printf("%d ", queue.remove());
 System.out.println("\n");
 }
}

//o/p-2 5 10 11 12 22 