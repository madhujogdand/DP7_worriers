package com.ArrayListHw;

import java.util.ArrayList;

/*1.WAP to use add all elements to ArrayList*/
public class AddAllElements {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(67);
		al.add(56);
		al.add(34);
		al.add(87);

       ArrayList<Integer> al1=new ArrayList<>();
		
		al1.add(23);
		al1.add(57);
		
		al.addAll(al1);
		System.out.println(al);
		
		al.addAll(1,al1);
		System.out.println(al);
		
ArrayList<String> al2=new ArrayList<>();
		
		al2.add("Aashu");
		al2.add("Neha");
		al2.add("Pradnya");
		al2.add("Priti");

       ArrayList<String> al3=new ArrayList<>();
		
		al3.add("Radha");
		al3.add("Sneha");
		
		al2.addAll(al3);
		System.out.println(al2);
		
		al2.addAll(2,al3);
		System.out.println(al2);

	}

}
