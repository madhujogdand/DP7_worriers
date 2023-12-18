package com.AbstractInterface;

abstract class Employees {
	int id;
	String name;
	int hoursOfWorking;

	Employees(int id, String name, int hoursOfWorking)
	{
		this.id = id;
		this.name = name;
		this.hoursOfWorking = hoursOfWorking;
	}

	abstract double calSalary();

}

class PartTime extends Employees {
	PartTime(int id, String name, int hoursOfWorking)
	{
		super(id, name, hoursOfWorking);
	}

	@Override
	double calSalary()
	{
        return (hoursOfWorking*200);
	}
	public String toString()
	{
		return "Part Time Employee Details:\nId:"+id+"\nName:"+name+"\nWorking Hours:"+hoursOfWorking;
		
	}

}

class FullTime extends Employees {

	FullTime(int id, String name, int hoursOfWorking)
	{
		super(id, name, hoursOfWorking);
	}

	@Override
	double calSalary()
	{
        return (hoursOfWorking*500);
	}
	public String toString()
	{
		return "Full Time Employee Details:\nId:"+id+"\nName:"+name+"\nWorking Hours:"+hoursOfWorking;
		
	}
}

public class ACEmployees {

	public static void main(String[] args) {
           Employees e=new PartTime(1,"Radha",15);
           System.out.println(e);
           double salary=e.calSalary();
           System.out.println("part Time employee calculated salary is:"+salary+"Rs");
           System.out.println("------------------------------------------------");
           e=new FullTime(2,"priya",20);
           System.out.println(e);
           double salary2=e.calSalary();
           System.out.println("Full Time employee calculated salary is:"+salary2+"Rs");
	
	}

}
