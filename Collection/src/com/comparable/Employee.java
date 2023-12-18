package com.comparable;

public class Employee implements Comparable<Employee>
{
    private int id;
    private String name;
    private int salary;
	
    public Employee()
    {
		super();
		
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
    
	public int compareTo(Employee e)
	{
		if(this.salary==e.salary)
			return this.name.compareTo(e.name);
		else
			if(this.salary>e.salary)
				return -1;
			else
				return 1;
	}
    
	
}
