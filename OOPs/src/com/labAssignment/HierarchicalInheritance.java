package com.labAssignment;

class ElectronicsDEvice
{
	int id;
	String name;

	ElectronicsDEvice()
	{
		
	}
	ElectronicsDEvice(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "Electronic Details: \nId:"+id+"\nName:"+name;
	}

}
class Mobile extends ElectronicsDEvice
{
	String mname;
	int price;
	
	Mobile()
	{
		super();
	}
	Mobile(int id,String name,String mname,int price)
	{
		super(id,name);
		this.mname=mname;
		this.price=price;
		
	}
	public String toString()
	{
		return super.toString()+"\nMobile Details: \nMobile name:"+mname+"\nPrice:"+price;
	}
   
}
class Laptop extends ElectronicsDEvice
{
	String lname;
	String processor;
	
	Laptop()
	{
		super();
	}
	Laptop(int id,String name,String lname,String processor)
	{
		super(id,name);
		this.lname=lname;
		this.processor=processor;
	}
    public String toString()
    {
    	return super.toString()+"\nlaptop Details: \nLaptop Name:"+lname+"\nProcessor:"+processor;
    }
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Mobile m=new Mobile(101,"Mobile","Realme",20000);
		System.out.println(m);

		System.out.println();
		
		Laptop l=new Laptop(101,"Laptop","HP","intel core i3");
	    System.out.println(l);
				
	}

}
