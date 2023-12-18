package com.CAArrayList;

import java.util.ArrayList;
import java.util.List;

/*36. How to get sublist from an arraylist.*/
public class Q36 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Red");
		al.add("Yellow");
		al.add("Green");
		al.add("White");
		al.add("Purple");
		al.add("Blue");
		
		System.out.println(al);
		
		List<String> sublist=al.subList(1,4);
		
		  System.out.println(sublist);

	}

}
