package com.BookDemo;

public class Book {
	
	private int bId;
	private String name;
	private int price;
	private String aName;
	public Book()
	{
		super();
		
	}
	public Book(int bId, String name, int price, String aName) {
		super();
		this.bId = bId;
		this.name = name;
		this.price = price;
		this.aName = aName;
	}
	public int getBId() {
		return bId;
	}
	public void setBId(int nId) {
		this.bId = bId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	@Override
	public String toString() {
		return "Book [nId=" + bId + ", name=" + name + ", price=" + price + ", aName=" + aName + "]";
	}
	
	
	

}
