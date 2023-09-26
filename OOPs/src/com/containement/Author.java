package com.containement;

public class Author {
	private int id;
	private String aname;
	
	Author()
	{
		
	}
	Author(int id,String aname)
	{
		this.id=id;
		this.aname=aname;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getAname()
	{
		return aname;
	}
	public void setAname(String aname)
	{
		this.aname=aname;
	}
	public String toString()
	{
		return "Author Details"+"\nAuthor Id:"+id+"\nAuthor Name:"+aname;
	}

}
