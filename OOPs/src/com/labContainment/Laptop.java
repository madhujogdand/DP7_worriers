package com.labContainment;

public class Laptop {
	
	private String config;
	private int price;
	private Printer printer;
	
	Laptop()
	{
		
	}
	
	Laptop(String config,int price, Printer printer)
	{
		this.config=config;
		this.price=price;
		this.printer=printer;
	}
	
	public String getConfig()
	{
		return config;
	}
	public void setConfig(String config)
	{
		this.config=config;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public Printer getPrinter()
	{
		return printer;
	}
	public void setPrinter(Printer printer)
	{
		this.printer=printer;
	}
	
	public String toString()
	{
		return "\nLaptop Configuration:"+config+"\nLaptop Price:"+price+"\nPrinter"+printer;
	}
}
