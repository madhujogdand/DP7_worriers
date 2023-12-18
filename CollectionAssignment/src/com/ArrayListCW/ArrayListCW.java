package com.ArrayListCW;

import java.util.ArrayList;

import java.util.Iterator;

/*3.WAP to use add operation of ArrayList
4.WAP to print all elements of ArrayList using iterator
5.WAP to iterate through all elements in an ArrayList using for loop
6.WAP to iterate through all elements in an ArrayList using for each
*/
public class ArrayListCW {

	public static void main(String[] args) {
	   ArrayList<Integer> al=new ArrayList<>();
	   
	   al.add(6);
	   al.add(5);
	   al.add(8);
	   al.add(6);
	   al.add(4);
	   
	   System.out.println(al);
	   //using iterator
	   Iterator<Integer> itr=al.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   System.out.println("--------------------------------------");
	   //using for loop
	   for(int i=0;i<al.size();i++)
	   {
		   System.out.println(al);
	   }
	   System.out.println("--------------------------------------");
	   
	   //enhanced for loop
	   for(Integer i:al)
	   {
		System.out.println(i);   
	   }
	   

	}

}
