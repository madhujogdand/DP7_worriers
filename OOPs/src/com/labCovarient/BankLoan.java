package com.labCovarient;

class Loan
{
	Loan giveloan()
	{
		System.out.println("You applied for loan");
		return this;
	}
	
	class HomeLoan extends Loan
	{
		HomeLoan giveLoan()
		{
			System.out.println("You applied for homeloan");
			return this;
		}
	}
	class CarLoan extends Loan
	{
		CarLoan giveLoan()
		{
			System.out.println("You applied for Carloan");
			return this;
		}
	}
	class EducationLoan extends Loan
	{
		EducationLoan giveLoan()
		{
			System.out.println("You applied for Educationloan");
			return this;
		}
	}
}
class Bank
{
	Bank provideLoan()
	{
		
		System.out.println("You applied for bankloan");
		return this;
	}
	
}
class HDFC extends Bank
{
	HDFC provideLoan()
	{
		float per=0.4f;
		System.out.println("HDFC bank provide carLoan:"+per);
		return this;
	}
}

class ICICI extends Bank
{
	ICICI provideLoan()
	{
		float per=0.3f;
		System.out.println("ICICI bank provide HomeLoan:"+per);
		return this;
	}
}

public class BankLoan {

	public static void main(String[] args) {
		Loan l;
		l=new Loan();
		l.giveloan();
		
		Bank b=new Bank();
		b=new HDFC();
        b.provideLoan();

        b=new ICICI();
        b.provideLoan();
		
		
		
	}

}
 