package com.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Car implements Comparable<Car> {
	private int modelNo;
	private String color;
	private double price;
	private Engine e;

	public Car()
	{
		

	}

	public Car(int modelNo, String color, double price, Engine e) {
		super();
		this.modelNo = modelNo;
		this.color = color;
		this.price = price;
		this.e = e;
	}
    
	
	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", color=" + color + ", price=" + price + ", e=" + e + "]";
	}

	//according to engine type sort list
	@Override
//	public int compareTo(Car c)
//	{
//	   
//	  return this.e.engineType.compareTo(c.e.engineType);
//		
//	}
//	
	//engine type is same sort it on price
	public int compareTo(Car c)
	{
	  if(this.getE().getEngineType().compareTo(c.getE().getEngineType())==0) {
		  if(this.getPrice()==c.getPrice())
			  return 0;
		  else if (this.getPrice()>c.getPrice())
			  return-1;
		  else
			  return 1;
	  }
	return this.getE().getEngineType().compareTo(c.getE().getEngineType()) ;
	  
	}
	
}

public class CarDetails {

	public static void main(String[] args) {

		ArrayList<Car> al=new ArrayList<>();
		al.add(new Car(101,"Red",800000,(new Engine(1,"auto"))));
		al.add(new Car(102,"Green",1500000,(new Engine(2,"auto"))));
		al.add(new Car(103,"White",1200000,(new Engine(3,"manual"))));
		al.add(new Car(104,"Blue",1000000,(new Engine(4,"manual"))));
		al.add(new Car(105,"Orange",1800000,(new Engine(5,"auto"))));
		al.add(new Car(106,"Gray",1400000,(new Engine(6,"manual"))));
		
		for(Car c:al)
		{
		   System.out.println(c);
		}
		
		System.out.println("==================================================");
		
		//after sort on basis of engine type
		System.out.println("sort on basis of engine type");
		Collections.sort(al);
		for(Car c:al)
		{
		   System.out.println(c);
		}
		System.out.println("==================================================");
		
		System.out.println("sort on basis of price");
		Collections.sort(al);
		for(Car c:al)
		{
		   System.out.println(c);
		}
		System.out.println("==================================================");
		
		System.out.println("sort on basis of colour");
		Collections.sort(al, new ColourComparator());;
		for(Car c:al)
		{
		   System.out.println(c);
		}
		System.out.println("===============================================");
		
		ArrayList<Car> auto=new ArrayList<>();
		ArrayList<Car> manual=new ArrayList<>();
		
		for(int i=0;i<al.size();i++)
		{
		   if(al.get(i).getE().getEngineType().equals("auto"))
		   {
			   auto.add(al.get(i));
		   }
		   else
		   {
			   manual.add(al.get(i));
		   }
		}
		for(Car c1:auto)
        {
		   System.out.println(c1);
        }
		System.out.println("===============================================");
		for(Car c2:manual)
        {
		   System.out.println(c2);
        }
		System.out.println("===============================================");
		
		//give discount
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getPrice()>1000000)
			{
				double discount=al.get(i).getPrice()-6000;
				al.get(i).setPrice(discount);
				System.out.println("After discount:"+discount);
			}
			
		}
		System.out.println("After discount:");
		for(Car c:al)
		{
		   System.out.println(c);
		}
		
		System.out.println("==================================================");
		
		//remove all mannual engine
		
//		for(int i=0;i<al.size();i++)
//		{
//			if(al.get(i).e.engineType.equals("manual"))
//			{
//				System.out.println(al.get(i).color);
//				al.remove(i);
//				
//			}
//		}
		Iterator<Car> itr=al.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getE().getEngineType().equals("manual"))
			{
				itr.remove();
			}
		}
		for(Car c:al)
		{
		   System.out.println(c);
		}
		System.out.println("==================================================");
		
		
	}

}
