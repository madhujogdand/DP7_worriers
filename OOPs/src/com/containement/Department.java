package com.containement;

public class Department {
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
