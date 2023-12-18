package com.ArrayListCW;

import java.util.ArrayList;

/*16.	WAP to retrieve an element (at a specified index) 
 * from a given ArrayList*/
public class RetriveElement {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(120);
		al.add(80);
		al.add(100);
		al.add(320);
		al.add(250);
		
		System.out.println(al);
		
		int index=2;
		if(index>0 && index< al.size())
		{
			System.out.println(al.get(2));
		}
			

	}

}
