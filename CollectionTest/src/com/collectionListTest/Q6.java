package com.collectionListTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/*6.Traverse linked list in reverse direction using listIterator. [1M]*/
public class Q6 {

	public static void main(String[] args) {
	
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(2);
		list.add(6);
		list.add(3);
		list.add(8);
		list.add(2);
		
		System.out.println(list);
		
		ListIterator<Integer> litr=list.listIterator(list.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	

	}

}
