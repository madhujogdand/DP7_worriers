package com.arrayContainment;

public class Employee {

	private int eid;
	private String eName;
	private float salary;
	private Department department;
	
	
	public Employee() {
		super();
		
	}
	public Employee(int eid, String eName, float salary, Department department) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
		this.department = department;
	}
	
   public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return department;
	}
	public void setDept(Department dept) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", salary=" + salary + ", dept=" + department + "]";
	}
	

}
