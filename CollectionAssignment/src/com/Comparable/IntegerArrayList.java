package com.Comparable;

import java.util.ArrayList;
import java.util.Collections;

/*2. WAP to sort the elements of List that contains Integer objects.Print ArrayList.Sort using 
Collections.sort(list) method.Print ArrayList.
Note: In the above 2 assignments, sorting is achieved automatically as String as well as Wrapper 
class Integer implements Comparable interface method compareTo.*/
public class IntegerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(89);
		al.add(49);
		al.add(99);
		al.add(69);
		al.add(69);

		System.out.println(al);

		System.out.println("===================================");
		
		Collections.sort(al);

		System.out.println(al);
	}

}
