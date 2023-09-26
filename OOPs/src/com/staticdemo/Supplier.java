package com.staticdemo;

class Item
{
	private int itemId;
	private String name;
	private float cost;
	
	private static String brandName;
	static int icount;
	
	static
	{
		brandName="Nestle";
		icount=0;
	}
	{
		icount++;
	}
	
	static void changeName(String bname)
	{
		brandName=bname;
	}
    Item()
    {
    	
    }
    Item(int id,String name,float cost)
    {
    	this.itemId=itemId;
    	this.name=name;
    	this.cost=cost;
    }
    public void setItemId(int itemId)
	{
		this.itemId=itemId;
	}
	
	public int getItemId()
	{
		return itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	public static String getBrandName()
	{
		return brandName;
	}
	public static void setBrandName(String brandName)
	{
		Item.brandName=brandName;
	}    
	 public String toString()
	    {
	    	return itemId+" "+name+" "+cost+" "+brandName;
	    }

}
public class Supplier {

	public static void main(String[] args) {
		System.out.println("Brand name:"+Item.getBrandName());
		System.out.println("Number of items:"+Item.icount);
		
		Item i1 = new Item(101,"Chocolates",450);
		Item i2= new Item(102,"Maggi",20);
		Item i3= new Item(103,"Coffee",100);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
			
		
		System.out.println("Number of items:"+Item.icount);
		
		Item.changeName("Tata");
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		

	}

}
