package com.labcodes;

class Restaurant
{
	int id;
	String name;
	Menu m;
	static int count=0;
	
	Restaurant()
	{
		
	}
	Restaurant(int id, String name,Menu m)
	{
		this.id=id;
		this.name=name;
		this.m=m;
	}
	
	public String toString() {
		return "Restaurant details:\nId:" + id + "\nName:" + name + m;
	}
	static void check(Restaurant r)
	{
		if(r.m.type.equals("Chinese"))
		{
			count++;
		}
	}
	
}
public class RestaurantDetails {

	public static void main(String[] args) {
		Menu m1=new Menu("Chinese");
		Menu m2=new Menu("Maharashtrian");
		Menu m3=new Menu("Italian");
		Menu m4=new Menu("Punjabi");
		
		Restaurant r1=new Restaurant(101,"Atithi",m1);
		Restaurant r2=new Restaurant(102,"Visawa",m1);
		Restaurant r3=new Restaurant(103,"Bramha",m2);
		Restaurant r4=new Restaurant(104,"Nisarg",m3);	
		Restaurant r5=new Restaurant(105,"Atmosphere",m4);
		Restaurant r6=new Restaurant(106,"Up n Above",m1);
	
	    System.out.println(r1);
	    System.out.println();
	    System.out.println(r2);
	    System.out.println();
	    System.out.println(r3);
	    System.out.println();
	    System.out.println(r4);
	    System.out.println();
	    System.out.println(r5);
	    System.out.println();
	    System.out.println(r6);
	    System.out.println();
	    
	    r1.check(r1);
	    r2.check(r2);
	    r3.check(r3);
	    r4.check(r4);
	    r5.check(r5);
	    r6.check(r6);
	    
	   System.out.println("Count of Chinese menu is:"+Restaurant.count);
	}

}
