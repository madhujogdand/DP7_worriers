package com.interfacedemo;

interface TaxPay {
	String cname = "India";

	void taxamount();

}

class Celebrity implements TaxPay {
	String celebrity;
	float income;

	public Celebrity() {
       super();
	}

	public Celebrity(String Celebrity, float income) {
		super();
		this.celebrity = celebrity;
		this.income = income;
	}

	public void taxamount() {
		// 20%
		System.out.println("Amount of tax:" + (0.2 * income));
	}
}

class Employee implements TaxPay {
	String employee;
	float salary;

	public Employee() {
		super();
	}

	public Employee(String employee, float salary) {
		super();
		this.employee = employee;
		this.salary = salary;
	}

	public void taxamount()
	{
		if(salary>500000)
		{
			System.out.println("Employee amount of tax"+(0.1*salary));
		}
		else
		{
			System.out.println("Your salary is tax free");
		}
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
      Celebrity c=new Celebrity("Amitabh",200000);
      c.taxamount();
      
      Employee e=new Employee("Madhu",550000);
      e.taxamount();
	}

}
