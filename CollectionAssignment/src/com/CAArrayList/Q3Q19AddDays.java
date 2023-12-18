package com.CAArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*3. Create a arraylist of string. Add 7 days to list ( Monday , Sunday 
etc) Remove elements from list for which string length is more 
than 7 
*19.Show use of retainall method of arraylist */
public class Q3Q19AddDays {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Sunday");
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");

		for (String s : al)
		{
			System.out.println(s);
		}
		
		System.out.println("=================================");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			String days=itr.next();
			if(days.length()>7)
				itr.remove();
		}
		
		for (String s : al)
		{
			System.out.println(s);
		}
		System.out.println("=================================");
		
		ArrayList<String> al1 = new ArrayList<>();//Q19

		al1.add("Monday");
		al1.add("Tuesday");
		al1.add("Banana");
		
		System.out.println(al1);
		System.out.println("=================================");
		
		al.retainAll(al1);
		
		System.out.println(al);
		
	}

}
