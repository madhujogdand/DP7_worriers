package com.labcodes;

class Book1
{

	private int id;
	private String name;
	private int price;
	private float rating;
	
	Book1()
	{
		
	}
	Book1(int id,String name,int price,float rating)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.rating=rating;
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public float getRating()
	{
		return rating;
	}
	public void setRating(float rating)
	{
		this.rating = rating;
	}
	
	public String toString()
	{
		return "Book1 id:" + id + "\nBook name:" + name + "\nBook price:" + price + "\n Book rating:" + rating;
	}
	
	void showBookName()
	{
		if(getRating()>7)
		{
			System.out.println(getName());
		}
	}

	
}

public class BookDetails1 {
		
	public static void main(String[] args) {
		Book1 b1=new Book1(1,"Harry Potter",500,8);
		Book1 b2=new Book1(2,"Ikigai",800,9);
		Book1 b3=new Book1(3,"Shyam Chi Aai",400,6);
		
		
		b1.showBookName();
     	b2.showBookName();
		b3.showBookName();

	}

}
