package com.OOPSMethod;

class Account
{
	int acNo;
	String name;
	float amount;
	
	void insert()
	{
		System.out.println("To insert account data");
	}
	void display()
	{
		System.out.println("To display account information");
	}
	void deposit()
	{
		System.out.println("To deposit amount");
	}
	void withdraw()
	{
		System.out.println("To withdraw ammount");
	}
	void checkbalance()
	{
		System.out.println("To check balance");
	}
}

public class AccountDetails {

	public static void main(String[] args) {
        Account a=new Account();
        	a.insert();
        	a.display();
        	a.deposit();
        	a.withdraw();
        	a.checkbalance();
	}

}
