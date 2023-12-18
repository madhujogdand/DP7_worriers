package com.customException;

class Account {

	private int accId;
	private String name;
	private double balance;

	public Account() {
		super();

	}

	public Account(int accId, String name, double balance) {
		super();
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "Account [accId=" + accId + ", name=" + name + ", balance=" + balance + "]";
	}
	
	void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("amount deposited:"+amount);
		System.out.println("New Balance:"+balance);
	}
	void withdraw(double amount)
	{
		try
		{
			if((this.balance-amount)<0)
			{
				throw new InsufficientBalanceException("Your balance is low");
			}
			this.balance-=amount;
			System.out.println("Amount withdraw:"+amount);
			System.out.println("New balance:"+balance);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e);
		}
	}

}

public class Bank {
	public static void main(String[] args) {

		Account a1=new Account();
		a1.setAccId(101);
		a1.setName("Madhu");
		a1.setBalance(5000);
		
		a1.deposit(2000);
		a1.withdraw(8000);
		a1.withdraw(1000);
	}

}