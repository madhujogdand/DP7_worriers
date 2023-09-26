package com.labContainment;

public class Date1 {
	private int mm;
	private int dd;
	private int yy;
	
	Date1()
	{
		
	}

	Date1(int mm, int dd, int yy)
	{
		this.mm=mm;
		this.dd=dd;
		this.yy=yy;
	}
	
   public int getMm()
	{
		return mm;
	}
   public void setMm(int mm)
    {
	this.mm=mm;
	}
   public int getDd()
  	{
  		return dd;
  	}
    public void setDd( int dd)
     {
  	this.dd=dd;
  	}
     public int getYy()
 	{
 		return yy;
 	}
    public void setYy(int yy)
     {
 	this.yy=yy;
 	}
    public String toString()
    {
    	return "\nMonth:"+mm+"\nDay:"+dd+"\nYear:"+yy;
    }
   
}
