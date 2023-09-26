package com.labContainment;

public class Printer {
    
	private int pid;
	private int price;
	private String pname;
	
	Printer()
	{
		
	}
	
	Printer(int pid, int price,String pname)
	{
		this.pid=pid;
		this.price=price;
		this.pname=pname;
	}
	
	public int getPid()
	{
		return pid;
	}
	public void setPid(int pid)
	{
		this.pid=pid;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String getPname()
	{
		return pname;
	}
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	
	public String toString()
	{
		return "Printer Id:"+pid+"\nPrinter price"+price+"\nPrinter name:"+pname;
	}
	
}
