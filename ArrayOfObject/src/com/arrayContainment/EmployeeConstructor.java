package com.arrayContainment;

public class EmployeeConstructor {

	static void countEmpDeptWise(Employee emp[],Department dept[])
	{
		int count;
		for(Department d:dept)
		{
			count=0;
			for(Employee e:emp)
			{
				if(e.getDept().equals(d))
				{
					count++;
				}
			}
			System.out.println(d+": "+count);
		}
		
	}
	
    static void showEmpName(Employee emp[] )
    {
    	for(Employee e:emp)
    	{
    		System.out.println(e.geteName());
    	}
    }
	public static void main(String[] args) {
		Department dept[]=new Department[3];
		dept[0]=new Department(101,"HR");
		dept[1]=new Department(102,"Finance");
		dept[2]=new Department(103,"IT");
		
		Employee emp[]=new Employee[6];
		emp[0]=new Employee(1,"Radha",35000,dept[0]);
		emp[1]=new Employee(2,"Neha",38000,dept[1]);
		emp[2]=new Employee(3,"Priti",45000,dept[2]);
		emp[3]=new Employee(4,"Shraddha",65000,dept[0]);
		emp[4]=new Employee(5,"Aashu",58000,dept[0]);
		emp[5]=new Employee(6,"Rani",47000,dept[1]);
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		
		countEmpDeptWise(emp,dept);
		System.out.println("=============================================");
		showEmpName(emp);
	}

}
