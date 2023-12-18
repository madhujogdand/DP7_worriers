package com.treeSet;

public class Book implements Comparable<Book> {

	private int id;
	private String bname;
	private float price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bname, float price) {
		super();
		this.id = id;
		this.bname = bname;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		
		return (int) (this.price-o.price);
	}
	
	
}
