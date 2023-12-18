package com.CAArrayList;
/*12. Sort arraylist of employees on employee names using 
comparable interface. 
28. Sort arraylist of employees in ascending order of their 
salaries. If salary is same , list should be in descending order of 
name. */
public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;
	private Department dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
//	@Override//Q12
//	public int compareTo(Employee o) {
//		return this.getName().compareTo(o.getName());
//	
//	}
	@Override//Q28
	public int compareTo(Employee o) {
		if (this.salary == o.salary)
			return 1;
		else  
			return this.name.compareTo(o.name);
		
		
	}
	
	
}
