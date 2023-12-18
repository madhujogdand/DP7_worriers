package com.ArrayListHw;
/*9.WAP to compare two ArrayLists print if equal?*/
import java.util.ArrayList;

public class CompareIfEqual {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(67);
		al.add(56);
		al.add(87);
		al.add(34);
		al.add(65);

		System.out.println(al);
		ArrayList<Integer> al1 = new ArrayList<>();

		al1.add(67);
		al1.add(65);
		al1.add(77);
		al1.add(90);

		System.out.println(al1);
		for(int i=0;i<al.size();i++)
		{
		  if(al.equals(al1))
			System.out.println(al);
		  else
			  System.out.println();
		}
	}

}
