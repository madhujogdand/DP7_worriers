package com.polymorphism;
//6
class Bank
{
	double getInterestRate()
	{
		return 2.0;
	}
}
class SavingAccount extends Bank
{
	double getInterestRate()
	{
		return 3.0;
	}
}
class CurrentAccount extends Bank
{
	double getInterestRate()
	{
		return 5.0;
	}
}
public class BankAccount {

	public static void main(String[] args) {
	  Bank b=new Bank();
	  System.out.println("General interest rate of bank is:"+b.getInterestRate());
	  System.out.println();
	  SavingAccount s=new SavingAccount();
	  System.out.println("Saving Account interest rate of bank is:"+s.getInterestRate());
	  System.out.println();
	  CurrentAccount c=new CurrentAccount();
	  System.out.println("Current Account rate of bank is:"+c.getInterestRate());

	}

}
