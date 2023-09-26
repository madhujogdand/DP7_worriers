package com.containement;

public class Employee {
    private int empid;
    private String ename;
    private Department dept;
    
    Employee()
    {
    	
    }
    
    Employee(int empid,String ename,Department dept)
    {
    	this.empid=empid;
    	this.ename=ename;
    	this.dept=dept;
    }
    
    public int getEmpid()
    {
  	  return empid;
    }
    public void setEmpid(int empid)
    {
  	  this.empid=empid;
    }
    public String getEname()
    {
  	  return ename;
    }
    public void setEname(String ename)
    {
  	  this.ename=ename;
    } 
    public Department getDept()
    {
  	  return dept;
    }
    public void setDept(Department dept)
    {
  	  this.dept=dept;
    } 
  	  
  	public String toString()
  	{
  	  return "Employee Details:"+"\nEmployee Id:"+empid+"\nEmployee name:"+ename+"\nDepartment:"+dept;	
  	}
    
}
