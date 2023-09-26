package com.encapsulation;

public class Employee {
	    private int empId;	
	    private String empName;
	    private String designation;
	    private float salary;
	    
	    
	    //getters and setters:public
	    
	    public void setEmpId(int empId)
	    {
	    	this.empId=empId;
	    }
	    public int getEmpId()
	    {
	    	return empId;//can write this.bookId
	    }
	    public void setEmpName(String empName)
	    {
	    	this.empName=empName;
	    }
	    public String getEmpName()
	    {
	    	return empName;
	    }
	    public void setDesignation(String designation)
	    {
	    	this.designation=designation;
	    }
	    public String getDesignation()
	    {
	    	return designation;
	    }
		public void setSalary(float salary)
		{
			this.salary=salary;
		}
		public float getSalary()
		{
			return salary;
		}
		 public String toString()
		    {
		    	return "Employee Id: "+empId+" Employee Name: "+empName+" Employee Designation: "+designation+" Salary:"+salary;
		    }	

		
}
