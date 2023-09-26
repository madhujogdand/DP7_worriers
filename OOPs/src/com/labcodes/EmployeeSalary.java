package com.labcodes;

public class EmployeeSalary {

	public static void main(String[] args) {
	  Employee e1=new Employee(111,"Madhu","Developer",35000);
      e1.Print();
	  int sal= e1.getSalary();
      int total=(int)(sal+(sal*0.1));
      System.out.println("Bonus salary is:"+total);
	}

}
