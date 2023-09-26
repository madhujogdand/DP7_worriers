package com.labcodes;
 
class Employee {
      private  int id;
      private String name;
      private String designation;
      private int salary;
      
      Employee()
      {
    	  
      }
      
      Employee(int id, String name, String designation, int salary )
      {
    	  this.id=id;
          this.name=name;
          this.designation=designation;
          this.salary=salary;
    	  
      }
      
      void Print()
      {
    	 System.out.println("Employee Id: "+id+" Employee Name: "+name+" Employee Designation: "+designation+" Salary: "+salary); 
      }
      
     public int getSalary( )
      {
    	  return salary;
      }
     
    
	
}
