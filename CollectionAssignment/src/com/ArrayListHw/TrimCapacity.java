package com.ArrayListHw;

import java.util.ArrayList;
import java.util.Collections;

/*13.WAP to trim the capacity of an ArrayList the current list size
 * 15.	WAP to update specific array element by given element
 * 16.	WAP to remove the third element from an ArrayList
 * 17.	WAP to shuffle elements in an ArrayList*/
public class TrimCapacity {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(67);
		al.add(34);
		al.add(45);
		al.add(86);
		al.add(46);

		System.out.println(al);
		al.trimToSize();

		System.out.println(al);
		al.set(2, 33);
		System.out.println("After update:" + al);
		al.remove(3);
		System.out.println("After removing 3rd element:" + al);
        Collections.shuffle(al);
        System.out.println("After shuffle:" + al);
        
	}

}
