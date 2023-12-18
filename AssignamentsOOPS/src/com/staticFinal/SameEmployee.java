package com.staticFinal;
/*//3.	Write another same Employee class to implement auto-generation of employee_id.*/

//Q3HW

public class SameEmployee {
	private int employeeId;
    private String name;
    private double salary;
    private static int nextEmployeeId = 1; // Auto-generated employee ID
    private static int totalEmployees = 0;
    
    SameEmployee()
    {
    	
    }

    public SameEmployee(String name, double salary)
    {
        this.employeeId = nextEmployeeId++;
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

    public static void main(String[] args) {
    	SameEmployee emp1 = new SameEmployee("Jiya", 50000);
    	SameEmployee emp2 = new SameEmployee("Smita", 60000);
    	SameEmployee emp3 = new SameEmployee("Babita", 55000);
    	SameEmployee emp4 = new SameEmployee("Alisha", 65000);
    	SameEmployee emp5 = new SameEmployee("Elvish", 70000);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        emp4.displayInfo();
        emp5.displayInfo();

        System.out.println("Total Number of Employees: " + SameEmployee.totalEmp());
    }
}
