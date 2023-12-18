package com.lab;

public class GetEmployeeType {

	public Employee getEmployee(String type)
	{
		if(type==null)
			return null;
		else if(type.equalsIgnoreCase("fullTime"))
			return new FullTimeEmployee() ;
		else if(type.equalsIgnoreCase("contract"))
			return new ContractBasisEmployee();
		
		
		return null;
	}
}
