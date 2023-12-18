package com.lablooseCoupling;

interface A
{
	void display();
}
class XYZ implements A
{
    int id;
    String name;
    
	public XYZ(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
    
	
	public String toString() {
		return "XYZ [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void display()
	{
		System.out.println("XYZ are not tightly coupled on A ");
		
	}
	
}
class ABC implements A
{

	@Override
	public void display() {
		System.out.println("ABC are not tightly coupled on A ");
		
		
	}
	
}
public class LooseCoupling {

	public static void main(String[] args) {
	
	A a1;
	a1=new XYZ(1,"Priya");
	System.out.println(a1);
	a1.display();
	System.out.println("---------------");
	a1=new ABC();
	a1.display();
	
	}

}
