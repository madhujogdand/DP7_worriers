package com.ArrayListCW;

import java.util.ArrayList;
import java.util.List;

/*WAP to add elements to arraylist without using generics 
  (no <>) and print content of it where Integer is used.
   In second arraylist String is used.*/
public class NonGenerics {

	public static void main(String[] args) {
		List list1=new ArrayList<>();
		
		list1.add(12);
		list1.add("Madhu");
		list1.add(56.2f);
		list1.add('M');
		
		System.out.println(list1);
		
		
		
		

	}

}
