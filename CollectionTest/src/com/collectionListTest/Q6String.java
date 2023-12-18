package com.collectionListTest;


import java.util.LinkedList;
import java.util.ListIterator;

//6.Traverse linked list in reverse direction using listIterator. 
public class Q6String {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("black");
		list.add("green");
		
		ListIterator<String> litr = list.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("----------------------------");
		ListIterator<String> litr1 = list.listIterator(list.size());
		while(litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
	}
}