package com.CAArrayList;

import java.util.ArrayList;

/*7. Replace an element at particular position by given element.*/
public class Q7ReplaceElement {

	public static void main(String[] args) {
		
      ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println(al);
		
		al.set(2, 8);
		
		System.out.println(al);
	}

}
