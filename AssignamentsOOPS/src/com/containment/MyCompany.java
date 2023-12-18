package com.containment;


class Department {
    private int id;
    private String dname;
    
    Department()
    {
    	
    }
    Department(int id,String dname)
    {
    	this.id=id;
    	this.dname=dname;
    }
    
    public int getId()
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
    public String getDname()
    {
    	return dname;
    }
    public void setName(String dname)
    {
    	this.dname=dname;
    }
    public String toString()
    {
    	return "\nDepartment details:"+"\nDepartment id:"+id+"\nDepartment name:"+dname;
    }
}
class Employee {
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

public class MyCompany {

	public static void main(String[] args) {
		
			Department d1=new Department(1,"Hr");
		    Department d2=new Department(2,"Finance");
		    Department d3=new Department(3,"Marketing");
		    Department d4=new Department(4,"IT");
			   
		   Employee e1=new Employee(101,"Shivansh",d1);
		   Employee e2=new Employee(102,"Dhruti",d2);
		   Employee e3=new Employee(103,"Aarya",d3);
		   Employee e4=new Employee(104,"Dhara",d4);
		  
		   
		   System.out.println(e1);
		   System.out.println("-----------------------");
		   
		   System.out.println(e2);
		   System.out.println("-----------------------");
		   
		   System.out.println(e3);
		   System.out.println("-----------------------");
		   
		   System.out.println(e4);
		   System.out.println("-----------------------");
		   
		   
		   
		}

	}


