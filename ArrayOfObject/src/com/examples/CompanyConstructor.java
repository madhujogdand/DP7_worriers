package com.examples;

public class CompanyConstructor {

	public static void main(String[] args) {
		Employee emp[] = new Employee[3];

		emp[0] = new Employee(1, "Radha", 35000f);
		emp[1] = new Employee(2, "Priya", 55000f);
		emp[2] = new Employee(3, "Aashu", 47000f);

		for (Employee e : emp) {
			System.out.println(e);
		}
		System.out.println("------------------------------------------------");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
	}

}
