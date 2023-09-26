package com.labInheritance;


	
	class Bunglow
	{
		private int bNo;
		private String name;
		
		
		public Bunglow()
		{
			
		}

	    public Bunglow(int bNo,String name)
	    {
	    	this.bNo=bNo;
	    	this.name=name;
	    }
	    
	    public int getBNo()
	    {
	    	return bNo;
	    }
	    public void setId(int bNo)
	    {
	    	this.bNo=bNo;
	    }
	    public String getName()
	    {
	    	return name;
	    }
	    public void setName(String name)
	    {
	    	this.name=name;
	    }

	    public String toString()
	    {
	    	return "\nBunglow No:"+bNo+"\nBunglow Name:"+name;
	    }
	}

	class House extends Bunglow
	{
		private int rooms;   
		private int windows ; 

	    House()
	    {
	    	super();
	    }
	    
	    House(int bNo, String name,int rooms,int windows)
	    {
	    	super(bNo,name);
	    	this.rooms=rooms;
	    	this.windows=windows;
	    }
	    public int getRooms()
	    {
	    	return rooms;
	    }
	    public void setRooms(int rooms)
	    {
	    	this.rooms=rooms;
	    }
	    public int getWindows()
	    {
	    	return windows;
	    }
	    public void setWindows(int windows)
	    {
	    	this.windows=windows;
	    }
	    public String toString()
	    {
	    	return super.toString()+"\nNo.of Rooms:"+rooms+"\nNo.of windows:"+windows;
	    }
	}
	public class SingleLevel {
  public static void main(String[] args) {
		House h1=new House(101,"Vrundavan",10,20);
		System.out.println(h1);

	}

}
