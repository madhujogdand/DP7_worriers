package com.constructor;

class Account {
	private int id;
	private String name;
	float balance;
	String status;

	Account()
	{

	}

	Account(int id, String name, float balance, String status)
	{
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.status = status;

	}

	public float getBalance()
	{
		return balance;
	}

	public void setBalance(float balance)
	{
		this.balance = balance;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String toString()
	{
		return id + " " + name + " " + balance+" "+status;
	}

}

public class Bank
{
	static void allocateStatus(Account a)
	{
		if(a.getBalance()<0)
		{
			a.setStatus("Deactivate");
		}
		else
		{
			a.setStatus("Active");
		}
		
	}

	public static void main(String[] args) 
	{
		Account a1=new Account(101,"Shivansh",-100f,"Unknown");
		Account a2=new Account(102,"Priyanka",0f,"Unknown");
		Account a3=new Account(103,"Madhur",30000f,"Unknown");
		Account a4=new Account(104,"Sushma",27000f,"Unknown");
		Account a5=new Account(105,"Anjali",39000f,"Unknown");
		
		System.out.println("--------------------------------------");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		allocateStatus(a1);
		allocateStatus(a2);
		allocateStatus(a3);
		allocateStatus(a4);
        allocateStatus(a5);

        System.out.println("--------------------------------------");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
	}
	

}
