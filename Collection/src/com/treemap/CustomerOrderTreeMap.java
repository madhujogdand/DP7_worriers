package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String[] args) {
		TreeMap<Customer, Order> tmap=new TreeMap<>(new MnoComparator());

		tmap.put(new Customer(1,"Anuj",927654321) , new Order(101,"Laptop",45000));
		tmap.put(new Customer(1,"Anuj",927654321) , new Order(102,"Pendrive",1000));
		tmap.put(new Customer(2,"Nilam",187654851) , new Order(103,"Hardisk",6300));
		tmap.put(new Customer(3,"Pratiksha",787453321) , new Order(104,"MobilePhone",23000));
		tmap.put(new Customer(4,"Neha",287653561) , new Order(105,"Charger",670));
		tmap.put(new Customer(5,"Dipti",587659821) , new Order(106,"HeadPhones",7200));
	  
		for(Map.Entry<Customer, Order> e:tmap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------------------");
			
			
		}
	
	
	
	}

}
