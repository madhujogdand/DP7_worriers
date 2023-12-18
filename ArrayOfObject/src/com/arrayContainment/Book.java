package com.arrayContainment;

public class Book {
	private int id;
	private String name;
	private float price;
	private Author a;

	public Book() {
		super();
		
	}

	public Book(int id, String name, float price, Author a) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.a = a;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Author getA() {
		return a;
	}

	public void setA(Author a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", a=" + a + "]";
	}

	

}
