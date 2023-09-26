package com.labcodes;

class Book {
	private int bId;
	private String bName;
	private String aName;
	private String pDate;
	private float price;
	private char category;

	Book()
	{

	}

	Book(int bId, String bName, String aName, String pDate, float price, char category) {
		this.bId = bId;
		this.bName = bName;
		this.aName = aName;
		this.pDate = pDate;
		this.price = price;
		this.category = category;
	}

	public int getBId() {
		return bId;
	}

	public void setBId(int bId) {
		this.bId = bId;
	}

	public String getBName() {
		return bName;
	}

	public void setBName(String bName) {
		this.bName = bName;
	}

	public String getAName() {
		return aName;
	}

	public void setAName(String aName) {
		this.aName = aName;
	}

	public String getPDate() {
		return pDate;
	}

	public void setPDate(String pDate) {
		this.pDate = pDate;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		return bId + " " + bName + " " +aName+" "+pDate+" "+ price;
	}

}

public class BookDetails {
	static void getDiscount(Book b)
	{
		if(b.getCategory()=='s')
			{
			 float discount=b.getPrice();
			 discount=(discount-(0.3f*discount));
			 b.setPrice(discount);
			}	
     }

	public static void main(String[] args) {

		Book b1=new Book(1,"c","Yashwant","12/10/1989",300f,'s');
		Book b2=new Book(2,"c++","Balguru","13/12/1990",400f,'o');

		System.out.println(b1);
		System.out.println(b2);
		
		getDiscount(b1);
		getDiscount(b2);
		
		System.out.println("-------After Discount-------");
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		
	}

}
