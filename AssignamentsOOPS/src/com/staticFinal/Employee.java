package com.staticFinal;
/*
2.	Write Employee Class with attributes like employee_id, name, and salary. 
Create parameterized constructor to initialize this 3 attributes, and write a method to display 
this information of 5 objects, display total no of employees using static method,
totalEmp(), which will return total no of employees.
 */

//Q2Hw
public class Employee {

	private int employeeId;
    private String name;
    private double salary;
    private static int totalEmployees = 0;
    Employee()
    {
    	
    }
     Employee(int employeeId, String name, double salary)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    public void displayInfo()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("----------------------");
    }

    public static int totalEmp()
    {
        return totalEmployees;
    }

    public static void main(String[] args)
    {
        Employee emp1 = new Employee(1, "Shradha Sarode", 50000);
        Employee emp2 = new Employee(2, "Prashant Narwade", 60000);
        Employee emp3 = new Employee(3, "Arati Runjkar", 55000);
        Employee emp4 = new Employee(4, "Siddhant Sarode", 65000);
        Employee emp5 = new Employee(5, "Shreya Sarode", 70000);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        emp4.displayInfo();
        emp5.displayInfo();

        System.out.println("Total Number of Employees: " + Employee.totalEmp());
    }
}
