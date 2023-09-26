package com.finalKeyword;

final class Developer
{
	String ename;
	final String cname;
	final static int noOfHours;
	final float salary;
	
	static
	{
		noOfHours=8;
	}
	{
		//noOfHours=10;
		cname="HCL";
		//noOfHours=8;
		
	}
	public Developer()
	{
		salary=10000.0f;
	}
	public Developer(String ename,float salary)
	{
		this.ename=ename;
		this.salary=salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	void skills()//we can not override the method
	{
		System.out.println("HTML,CSS,C,C++,Java");
	}
		
}

//class FullStackDEveloper extends Developer (can not inherit the final class)
//{
//	void skill()
//	{
//	System.out.println("Angular,React,SpringBoot");
//	}
//}
public class FinalDemo {
	public static void main(String[] args) {
		
		Developer d=new Developer();
		System.out.println(d.cname+" "+d.ename+" "+d.salary);
	
		d.setEname("Madhu");
		
		System.out.println(d.cname+" "+d.ename+" "+d.salary);
		
		Developer d1=new Developer("Aarya",25000f);
		
		System.out.println(d1.cname+" "+d1.ename+" "+d1.salary);
			
		//d1.salary=67000;
	}

}
