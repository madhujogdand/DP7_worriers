package com.examples;

public class CompanyStaticMethod {
	static void highestPaid(Employee emp[])
	{
		float maxSalary=Float.MIN_VALUE;
		Employee em=new Employee();
		
		for(Employee e:emp)
		{
			if(e.getSalary()>maxSalary)
			{
				em=e;
			}
		}
		System.out.println(em);
	}
	static void sortSalary(Employee emp[])
	{
		Employee em=new Employee();
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i+1;j<emp.length;j++)
			{
			   if(emp[i].getSalary()<emp[j].getSalary())
			   {
				   em=emp[i];
				   emp[i]=emp[j];
				   emp[j]=em;
			   }
			}
		}
	}
	public static void main(String[] args) {
		Employee emp[]=new Employee[3];
		
		emp[0]=new Employee(1,"Radha",35000f);
		emp[1]=new Employee(2,"Priya",55000f);
		emp[2]=new Employee(3,"Aashu",47000f);
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}

		System.out.println("------------------------------------------------");
		System.out.println("Highest paid employee:");
		highestPaid(emp);
		System.out.println("------------------------------------------------");
		sortSalary(emp);
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}

}
