package com.ArrayListAdditionl;
/*3.Create aarraylist of string. Add 7 days to list
( Monday , Sunday etc) Remove elements from list for which string length is more than 7
4.Create arraylist of 10 integers. Insert an element at 7th position.*/
import java.util.ArrayList;

public class WeekDays {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Sunday");
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		
		System.out.println(al);
		
		al.add(7,"Beautiful");
		System.out.println(al);
		

	}

}
