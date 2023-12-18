package com.ArrayListCW;

import java.util.ArrayList;
import java.util.Arrays;

/*20.WAP to check if collection is empty
 *21.WAP to convert collection into array*/
public class CollectionToArray {

	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<>();
		
		System.out.println(al.isEmpty());
		al.add("Banana");
		al.add("Kiwi");
		al.add("Apple");
		al.add("Grapes");
		al.add("Mango");
		
		System.out.println(al);
		
		System.out.println("===========================");
		String str[]=al.toArray(new String[0]);
		
		for(String s:str)
		{
			System.out.println(s);
		}
		System.out.println("===========================");
		
        ArrayList <Integer> al2=new ArrayList<>();
				
		al2.add(120);
		al2.add(25);
		al2.add(30);
		al2.add(35);
		al2.add(40);
		
		System.out.println(al2);
		
		System.out.println("===========================");
		

	}

}

