package com.labContainment;

public class Shop {
	static void showSupplier(Supplier s)
	{
		if(s.getItem().getPrice()==50)
		{
			System.out.println("Supplier Name:"+s.getName());
		}
	}

	public static void main(String[] args) {
		Item i=new Item(1,"soap",50);
		Item i1=new Item(2,"Maggie",80);
	    Item i2=new Item(3,"Biscuits",50);
		
//		i.setId(1);
//		i.setName("Soap");
//		i.setPrice(50);
//		
		Supplier s=new Supplier(1,"MrX",i);
		Supplier s1=new Supplier(2,"MrY",i2);
		Supplier s2=new Supplier(3,"MrZ",i1);
		
//		System.out.println(s);
//		System.out.println();
//		System.out.println(s1);
//		System.out.println();
//		System.out.println(s2);
//		System.out.println();
//		s.setSId(1);
//		s.setName("MrX");
		
		System.out.println(s.getSId());
		System.out.println(s.getName());
		System.out.println(s.getItem().getId());
		System.out.println(s.getItem().getName());
		System.out.println(s.getItem().getPrice());
		
		System.out.println();
		
		System.out.println(s1.getSId());
		System.out.println(s1.getName());
		System.out.println(s1.getItem().getId());
		System.out.println(s1.getItem().getName());
		System.out.println(s1.getItem().getPrice());
		
		System.out.println();
		
		System.out.println(s2.getSId());
		System.out.println(s2.getName());
		System.out.println(s2.getItem().getId());
		System.out.println(s2.getItem().getName());
		System.out.println(s2.getItem().getPrice());
		
		System.out.println();
		
		showSupplier(s1);
		showSupplier(s2);
		showSupplier(s);
		

	}

}
