package com.treemap;

public class Order
{
	private int orderId;
	private String pname;
	private double price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String pname, double price) {
		super();
		this.orderId = orderId;
		this.pname = pname;
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
}
