package com.collectionListTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Sort arraylist of String in reverse order of its natural sorting.
public class Q5Integer {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(05);
		System.out.println("before: " + al);
		Collections.sort(al, new ReverseComparator());
//		Collections.sort(al, Collections.reverseOrder());
		System.out.println("after: "+al);
	}

	static class ReverseComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	}
}

