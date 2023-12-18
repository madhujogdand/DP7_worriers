package com.lab;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BikeDetails {

	public static void main(String[] args) {
	
		LinkedList<Bike> blist=new LinkedList<>();
		
		blist.add(new Bike(1,"Unicorn",80000,2010));
		blist.add(new Bike(2,"Pulser",85000,2015));
		blist.add(new Bike(3,"FZ",100000,2010));
		blist.add(new Bike(4,"Shine",95000,2010));
		blist.addFirst(new Bike(5,"Honda",97000,2018));
		blist.addFirst(new Bike(6,"Splendor",87000,2019));
		blist.addLast(new Bike(7,"Apache",110000,2020));
		blist.add(5,new Bike(8,"Shine",95000,2010));
		
		for(Bike b:blist)
		{
			System.out.println(b);
		}
		
		System.out.println("============================================================");
		
		Collections.sort(blist);
		
		for(Bike b:blist)
		{
			System.out.println(b);
		}
		
		System.out.println("============================================================");
		
		//delete bikes of the model year less than 2010
		Iterator<Bike> itr=blist.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getModYr()<=2010)
				itr.remove();
		}
		for(Bike b:blist)
		{
			System.out.println(b);
		}
			
	}

}
