package com.collectionListTest;

import java.util.ArrayList;
import java.util.Collections;

/*5.Sort arraylist of String in reverse order of its
 *  natural sorting. [1M]*/
public class Q5 {

	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<>();
		
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Pink");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println(al);
		
		
	}

}
