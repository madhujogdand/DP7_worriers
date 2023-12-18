package com.collectionListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*Write a code to remove duplicate elements from above list. 
         Final arraylist should contain ( Sun, Mon, Sat); [1M]
*/
public class Q1RemoveDuplicates {

	public static void main(String[] args) {
		
	ArrayList<String> al = new ArrayList<String>();
        al.add("Sun");
        al.add("Mon");
        al.add("Sat");
        al.add("Sun ");
        al.add("Mon ");
        al.add("Sat ");
        al.add("Sun ");
        al.add("Sat ");
        al.add("Sun ");
        al.add("Mon ");

        System.out.println(al);
        
        ArrayList<String> al2 = new ArrayList<>();

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			if (!al2.contains(value)) {
				al2.add(value);
			}
		}
		System.out.println(al2);

		// 2nd way
		LinkedHashSet<String> lhs = new LinkedHashSet<>(al);
		System.out.println(lhs);
       
	}

}
