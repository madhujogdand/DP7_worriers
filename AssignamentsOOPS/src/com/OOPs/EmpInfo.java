package com.OOPs;
//12
class Emp
{
	int eid;
	String name;
	
	Emp()
	{
		
	}
	Emp(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	void display()
	{
		System.out.println("Emp id:"+eid);	
		System.out.println("Emp name:"+name);	
	}
	void copy(Emp e)
	{
		this.eid=e.eid;
		this.name=e.name;
	}
}
public class EmpInfo {

	public static void main(String[] args) {
		Emp e1=new Emp(1,"pro");
		e1.display();
        System.out.println();
        Emp e2=new Emp(2,"Rto");
		e2.copy(e1);
        e2.display();
	}

}
