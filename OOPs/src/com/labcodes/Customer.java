package com.labcodes;
public class Customer {
	    private int c_Id;	
	    private String c_name;
	    private int acc_no;
	    private double balance;
	    
	    public void setC_Id(int c_Id)
	    {
	    	this.c_Id=c_Id;
	    }
	    public int getC_Id()
	    {
	    	return c_Id;
	    }
	    public void setC_name(String c_name)
	    {
	    	this.c_name=c_name;
	    }
	    public String getC_name()
	    {
	    	return c_name;
	    }
	    public void setAcc_no(int acc_no)
	    {
	    	this.acc_no=acc_no;
	    }
	    public int getAcc_no()
	    {
	    	return acc_no;
	    }
		public void setBalance(double balance)
		{
			this.balance=balance;
		}
		public double getBalance()
		{
			return balance;
		}
	    public String toString()
	    {
	    	return "customer Id: "+c_Id+"\n"+"Customer Name: "+c_name+"\n"+"Account number: "+acc_no+"\n"+ "Balance:"+balance;
	    }	

}
