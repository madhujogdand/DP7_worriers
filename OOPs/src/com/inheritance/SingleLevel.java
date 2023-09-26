package com.inheritance;
class Employee {
	private int id;
	private String name;
	private float salary;

	public Employee() {

	}

	public Employee(int id, String name, float salary) {
	
		System.out.println("Parent class constr");
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary ;
	}
	
	
}
class Manager extends Employee
{
	private int exp;
	private String role;
	
	Manager()
	{
		super();//calls the base class constructor
	}
	Manager(int id, String name, float salary, int exp,String role)
	{
		super(id,name,salary); // constr chaining
		this.exp=exp;
		this.role=role;
		
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String toString() {
		return  super.toString()+ " Exp: "+exp+" Role:"+role;
	}
	
}
public class SingleLevel {

	public static void main(String[] args) {
		Manager m1= new Manager(101,"Shuruti",34000f,5,"Development");
		System.out.println(m1);		

	}

}
