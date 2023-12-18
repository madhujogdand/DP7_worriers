package com.ArrayListHw;

import java.util.ArrayList;

/*12.WAP to empty an ArrayList*/
public class EmptyArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<>();

		al.add(45);
		al.add(37);
		al.add(45);
		al.add(98);
		al.add(43);
		System.out.println(al);
		for(int i=al.size()-1;i>=0;i--)
		{
			al.remove(i);
		}
		System.out.println(al);
		
		ArrayList <String> al1=new ArrayList<>();

		al1.add("Neha");
		al1.add("Radha");
		al1.add("Geeta");
		al1.add("Purva");
		al1.add("Shreya");
		System.out.println(al1);
		for(int i=al1.size()-1;i>=0;i--)
		{
			al1.remove(i);
		}
		System.out.println(al1);
	}

}
