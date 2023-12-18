package com.ArrayListCW;

import java.util.ArrayList;

/*7.WAP to create a new ArrayList, add some colors (string) and
 print the collection.*/
public class ColorArrayList {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	
	al.add("Red");
	al.add("Blue");
	al.add("Green");
	al.add("White");
	al.add("Purple");
	
	System.out.println(al);

	}

}
