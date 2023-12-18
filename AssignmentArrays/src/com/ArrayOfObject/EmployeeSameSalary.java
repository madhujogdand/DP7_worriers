package com.ArrayOfObject;
/*19. WAP to print the employees from Employee[] array who has same salary (Create 
Employee class which has 3 attributes id, name, salary and add employee objects to 
your array) */

    
	public class EmployeeSameSalary
	{
		static void checkSameSalary(Employee e[])
		{
	      for(int i=0;i<e.length;i++)
	      {
	    	  for(int j=i+1;j<e.length;j++)
	    	  {
	    		  if(e[i].getSalary()==e[j].getSalary())
	    		  {
	    			  System.out.println("Employee name with same salary:"+e[i]);
	    			  System.out.println("Employee name with same salary:"+e[j]);
	    		  }
	    	  }
	      }
		}
	
		public static void main (String args[])
		{
			Employee emp[]=new Employee[3];
			Employee e1=new Employee(1,"Radha",35000);
			Employee e2=new Employee(2,"Neha",55000);
			Employee e3=new Employee(3,"Seema",35000);
			
			checkSameSalary(emp);
			
			
		}
		
	}
