package com.staticdemo;

class Cake {
	private String flavour;
	private float price;

	Cake() {

	}

	public Cake(String flavour, float price) {
		super();
		this.flavour = flavour;
		this.price = price;
	}
	
	

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cake [flavour=" + flavour + ", price=" + price + "]";
	}

}

class MyBakery
{
    private int bakeryid;
    private String bakeryName;
    Cake cake;
    static int count;
    static float amount;
    
    static
    {
    	count=0;
    	amount=0.0f;
    }

	public MyBakery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyBakery(int bakeryid, String bakeryName) {
		super();
		this.bakeryid = bakeryid;
		this.bakeryName = bakeryName;
		
	}

	public Cake getCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
		count++;
		amount=amount+cake.getPrice();
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MyBakery.count = count;
	}

	public static float getAmount() {
		return amount;
	}

	public static void setAmount(float amount) {
		MyBakery.amount = amount;
	}

	public int getBakeryid() {
		return bakeryid;
	}

	public void setBakeryid(int bakeryid) {
		this.bakeryid = bakeryid;
	}

	public String getBakeryName() {
		return bakeryName;
	}

	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	
	
	
}

public class Bakery {
	
	public static void main(String[] args) {
		
		MyBakery b1 = new MyBakery(101, "CakeStopper");
		
		Cake c1= new Cake("Pineapple", 350);
		Cake c2= new Cake("Chocolate", 400);
		Cake c3= new Cake("Fruit", 250);
		Cake c4= new Cake("Truffle", 550);
		
				
		System.out.println(b1.getBakeryid()+"  "+b1.getBakeryName());
		System.out.println("--------------------------------------");
		System.out.println("Number of cakes:"+b1.getCount());
		System.out.println("Amount :"+b1.getAmount());
		
		b1.setCake(c1);
		System.out.println(b1.getCake());
		b1.setCake(c3);
		System.out.println(b1.getCake());
		b1.setCake(c2);
		System.out.println(b1.getCake());
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Number of cakes:"+b1.getCount());
		System.out.println("Amount :"+b1.getAmount());
		
		
		
	}
	
	

}