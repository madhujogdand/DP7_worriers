package com.CAArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*10. Sort arraylist of Strings.*/
public class Q10 {

	public static void main(String[] args) {
		
	     ArrayList<String> al = new ArrayList<>();
	
	     al.add("Apple");
	     al.add("Banana");
	     al.add("Orange");
	     al.add("Papaya");
	     al.add("Mango");
	     
	     System.out.println(al);
	     
	     Collections.sort(al);
	     
	     System.out.println(al);
	
	}

}
