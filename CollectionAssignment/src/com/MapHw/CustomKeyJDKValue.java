package com.MapHw;

import java.util.HashMap;

/*8.WAP to create a map using Custom class as key and any other JDK provided object as value*/
public class CustomKeyJDKValue {

	public static void main(String[] args) {
		HashMap<Employee,Integer> hm=new HashMap<>();
			
		hm.put(new Employee(1,"Neha"), 45000);
		hm.put(new Employee(1,"Neha"), 45000);
		hm.put(new Employee(2,"Radha"), 34000);
		hm.put(new Employee(3,"Shraddha"),37000);
		hm.put(new Employee(4,"Spruha"), 56000);
		hm.put(new Employee(5,"Palak"), 55000);
		
		System.out.println(hm);

	}

}
