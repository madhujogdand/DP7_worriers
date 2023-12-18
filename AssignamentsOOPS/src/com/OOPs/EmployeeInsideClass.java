package com.OOPs;

public class EmployeeInsideClass {
	int eId;
	String eName;

	EmployeeInsideClass()
	{
		
	}
	EmployeeInsideClass(int eId,String eName)
	{
		this.eId=eId;
		this.eName=eName;
	}
	void display() {
		System.out.println("Emp Id:" + eId + "\nEmp Name:" + eName);
	}

	public static void main(String[] args) {
		EmployeeInsideClass e = new EmployeeInsideClass(10,"Neha");		
		e.display();
		EmployeeInsideClass e1 = new EmployeeInsideClass(11,"Neel");		
		e1.display();
		EmployeeInsideClass e2 = new EmployeeInsideClass(12,"Sneha");		
		e2.display();
		EmployeeInsideClass e3 = new EmployeeInsideClass(13,"Priya");		
		e3.display();
		EmployeeInsideClass e4 = new EmployeeInsideClass(14,"Harshada");		
		e4.display();
		EmployeeInsideClass e5 = new EmployeeInsideClass(15,"Gauri");		
		e5.display();

	}

}
