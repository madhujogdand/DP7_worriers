package com.labAbstractClass;

abstract class Card
{
	String shopName;
	String shopAddress;
	
	Card()
	{
		System.out.println("This is default constructor of card");
	}
	
	Card(String shopName,String shopAddress)
	{
		this.shopName=shopName;
		this.shopAddress=shopAddress;
	}
	void show()
	{
		System.out.println("This is card");
	}
	abstract void showCard();
}
class Birthday extends Card
{
	
	Birthday(String shopName,String shopAddress)
	{
		super(shopName,shopAddress);
	}
	void show()
	{
		System.out.println("Happy Birthday");
	}
	void showCard()
	{
		this.show();
		System.out.println("This is Birthday card");
		
	}
	public String toString()
	{
		return "Shop name:"+shopName+"Shop Address:"+shopAddress;
	}
}
class Wedding extends Card
{
	
	Wedding(String shopName,String shopAddress)
	{
		super(shopName,shopAddress);
	}
	void show()
	{
		System.out.println("Happy Wedding");
	}
	void showCard()
	{
		this.show();
		System.out.println("This is Wedding card");
	}
	public String toString()
	{
		return "Shop name:"+shopName+"Shop Address:"+shopAddress;
	}
}
public class CardShop {

	public static void main(String[] args) {
		Card c;
		c=new Birthday("Patrika","NalStop");
		System.out.println(c);
		c.showCard();
		System.out.println();
        c=new Wedding("Patrika","NalStop");
        System.out.println(c);
        c.showCard();
       
	}

}
