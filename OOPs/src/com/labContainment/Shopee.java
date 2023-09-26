package com.labContainment;

public class Shopee {
	
	static void showLaptop(Laptop l)
	{
		if(l.getPrinter().getPrice()>15000)
		{
			System.out.println("Laptop Name:"+l.getConfig());
		}
	}

	public static void main(String[] args) {
		Printer p=new Printer(1,15000,"MNOP");
		Printer p1=new Printer(2,35000,"DEFH");
		Printer p2=new Printer(3,45000,"STR");
		
		Laptop l1=new Laptop("HP",67000,p);
		Laptop l2=new Laptop("Dell",57000,p1);
		Laptop l3=new Laptop("Lenovo",48000,p2);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		//using getterSetter
		Laptop l4=new Laptop();
		l4.setConfig("Intel");
		l4.setPrice(55000);
		l4.setPrinter(new Printer());
		l4.getPrinter().setPid(4);
		l4.getPrinter().setPrice(65000);
		l4.getPrinter().setPname("PQRS");
		
		System.out.println(l4);
		
		System.out.println();
		
		System.out.println(l4.getConfig());
		System.out.println(l4.getPrice());
		System.out.println(l4.getPrinter().getPid());
		System.out.println(l4.getPrinter().getPrice());
		System.out.println(l4.getPrinter().getPname());
		
		System.out.println();
		
		System.out.println(l3.getConfig());
		System.out.println(l3.getPrice());
		System.out.println(l3.getPrinter().getPid());
		System.out.println(l3.getPrinter().getPrice());
		System.out.println(l3.getPrinter().getPname());
		
		System.out.println();
		
		showLaptop(l2);
	}
	
	

}
