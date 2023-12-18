package com.masterAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*2. Complete following code to sort above employee object by name. Employee object 
is from same earlier program.*/
public class Q2EmpNameComparator implements Comparator<Employee>{
// write function to compare here
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

public static void main(String[] args) {
ArrayList<Employee> alEmp = new ArrayList<Employee>();
Employee e1 = new Employee(3, "Ajit");
Employee e2 = new Employee(4,"Suman") ;
alEmp.add(e1);
alEmp.add(e2);
// code to call sort function here
System.out.println(alEmp);
System.out.println("==========================================");
Collections.sort(alEmp,new Q2EmpNameComparator());
System.out.println(alEmp);
}
}
