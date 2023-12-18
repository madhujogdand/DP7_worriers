package com.labInterface;

interface Bakery
{
	String name="Swiss Bakery";
	
//	Bakery()//constructor
//	{
//		
//	}
	abstract void Bake();
	
	default void Juice()
	{
		System.out.println("This is default method");
		System.out.println("We provied juice along with them");
	}
	static void price()
	{
		System.out.println("Prices of our products");
	}
	
}
interface Flavour
{
	void display();
}  

class Cake implements Bakery,Flavour
{
	void show()
	{
		System.out.println("Bakery Name:"+name);
	}
	public void Bake()
	{
		this.show();
		System.out.println("We bake cakes");
	}
	public void display()
	{
		System.out.println("We bake flavoured cakes like Butterscotch,Chocochips,Vanila");
	}
   
}

class Biscuit implements Bakery,Flavour
{
	public void Bake()
	{
		System.out.println("We bake biscuits");
	}
	public void display()
	{
		System.out.println("We bake flavoured Biscuits like Almond,Cashew");
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
       Bakery b;
     
       b=new Cake();
//       Cake c=new Cake();
//       c.show();
       b.Bake();
       b.Juice();
       Flavour f;
       f=new Cake();
       f.display();
       
       System.out.println();
       b=new Biscuit();
       b.Bake();
       f=new Biscuit();
       f.display();
       Bakery.price();
     
      
      
       
           
	}

}
