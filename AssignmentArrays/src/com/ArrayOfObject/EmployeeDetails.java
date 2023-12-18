package com.ArrayOfObject;


class Employee1
{
	private int emp_id;
	private String emp_name;
	private int salary;
	private MyDate date;
	private Department dept;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int emp_id, String emp_name, int salary, MyDate date, Department dept) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.date = date;
		this.dept = dept;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public MyDate getDate() {
		return date;
	}
	public void setDate(MyDate date) {
		this.date = date;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "employee1 [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", date=" + date
				+ ", dept=" + dept + "]";
	}
	
	
}
public class EmployeeDetails {

	static void checkJoining(Employee1 em[])
	{
		
	}
	
	static void checkDept(Employee1 em[])
	{
		
	}
	public static void main(String[] args) {
//		MyDate date[]=new MyDate[2];
//		date[0]=new MyDate(8,"Aug",2000);
//		date[1]=new MyDate(9,"Jan",2005);
//		
//		Department dept[]=new Department[2];
//		dept[0]=new Department(101,"IT");
//		dept[1]=new Department(101,"Finance");
//		
		Employee1 emp[]=new Employee1[4];
		
		emp[0]=new Employee1(1,"Radha",35000,new MyDate(8,"Aug",2000),new Department(101,"IT"));	
		
		emp[1]=new Employee1(2,"Neha",45000,new MyDate(8,"Aug",2000),new Department(102,"Finance"));		
       
        emp[2]=new Employee1(3,"Pradnya",38000,new MyDate(9,"Jan",2005),new Department(103,"IT"));	
	
		emp[3]=new Employee1(4,"Aashu",33000,new MyDate(10,"Nov",2006),new Department(104,"Marketing"));		
   
		for(Employee1 e:emp)
		{
			System.out.println(e);
		}
        System.out.println("========================================================================================");
       System.out.println("Employee name whose joining date is same:");
        checkJoining(emp);
        System.out.println("========================================================================================");
        System.out.println("Employee name whose Department is same:");
        checkDept(emp);
	}

}
