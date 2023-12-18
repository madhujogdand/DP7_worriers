package com.Comparable;
/*3. WAP to create a class Employee with (name, designation and age).Now create and add Employee 
objects elements to Arraylist. Print ArrayList.
4. Now modify Employee class so that it implements Comparable interface’s compareTo 
method.Sorting should be done based on id in which use < , > & == technique.
5. Now do sorting on id but based on inbuilt compareTo method. Ensure to check 3 null conditions
6. Now do descending sort of Employee.id in Employee arraylist using < , > & == technique.
7. Now do descending sort of Employee.id in Employee arraylist using inbuilt compareTo technique.
8. Create and add 4 more Employee objects in ArrayList. Print ArrayList. Sort ArrayList using 
Collections.sort(list) based on name. If name are same then sort on id. Print arrayList.
9. Add Profile(state,country) object in Employee object. Do sorting of employees on the country basis*/
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {

	public static void main(String[] args) {
	
		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(1,"Neha","HR",29,new Profile("Maharashta","India")));
		al.add(new Employee(2,"Radha","TL",28,new Profile("USA","Newyork")));
		al.add(new Employee(3,"Nilam","APM",29,new Profile("Shrilanka","Colombo")));
		al.add(new Employee(2,"Neha","JD",29,new Profile("Shrilanka","Colombo")));
		al.add(new Employee(5,"Nabha","Finance",20,new Profile("UK","London")));
		al.add(new Employee(6,"Stavya","Maketing",27,new Profile("Delhi","India")));
	

		for(Employee e:al)//3
		{
		System.out.println(e);
		}
		System.out.println("=============================================================");
	    Collections.sort(al);//4,5,6,7,8,9
	    for(Employee e:al)
		{
		System.out.println(e);
		}
		
		
	}

}
