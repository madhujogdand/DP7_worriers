package com.MapHw;
/*9.WAP to create a map using Custom class as key and any other Custom class as value*/
import java.util.HashMap;

public class CustomKeyCustomValue {

	public static void main(String[] args) {
		HashMap<Employee,Department> hm=new HashMap<>();
		
		hm.put(new Employee(1,"Neha"),new Department(101,"HR"));
		hm.put(new Employee(1,"Neha"),new Department(101,"HR") );
		hm.put(new Employee(2,"Radha"),new Department(102,"Marketing"));
		hm.put(new Employee(3,"Shraddha"),new Department(103,"Finance"));
		hm.put(new Employee(4,"Spruha"),new Department(104,"IT"));
		hm.put(new Employee(5,"Palak"),new Department(105,"Marketing") );
		
		System.out.println(hm);

	}

}
