package com.loosecoupling;

interface Payment {
	public void doTransaction(double amount);
}

class CreditCard implements Payment {

	private  int cardNo;
	private int cvv;
	private double limit;

	public CreditCard() {
		super();
	}

	public CreditCard(int cardNo, int cvv, double limit) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.limit = limit;
	}

public void doTransaction(double amount)
{
	if((this.limit-amount)>0)
	{
		System.out.println("Credit card id debited by:"+amount);
	    this.limit=amount;
	}
	else
	{
		System.out.println("Insufficient Balance:"+this.limit);
	}
}

public int getCardNo() {
	return cardNo;
}

public void setCardNo(int cardNo) {
	this.cardNo = cardNo;
}

public int getCvv() {
	return cvv;
}

public void setCvv(int cvv) {
	this.cvv = cvv;
}

public double getLimit() {
	return limit;
}

public void setLimit(double limit) {
	this.limit = limit;
}

}
class DebitCard implements Payment
{
	int cardNumber;
	double balance;
	
	public DebitCard()
	{
		super();
		
	}

	public DebitCard(int cardNumber, double balance) {
		super();
		this.cardNumber = cardNumber;
		this.balance = balance;
	}
	
	public void doTransaction (double amount)
	{
		if((this.balance-amount)>=1000)
		{
			System.out.println("Debit card is debited by:"+amount);
		this.balance=amount;
		}
		else
		{
			System.out.println("Insufficient balance:"+this.balance);
		}
	}

}
public class OnlineShopping {

	String name;
	long mno;
	
	public OnlineShopping()
	{
		super();
	}	

   public OnlineShopping(String name, long mno)
   {
		super();
		this.name = name;
		this.mno = mno;
	}
    
//   public void payBill(CreditCard c,float amt)//thight coupling
//   {
//	   c.doTransaction(amt);
//   }

   public void payBill(Payment p,float amt)//loosecoupling
   {
	   p.doTransaction(amt);
   }
   public void payBill(Payment p,float amt,float discount)//loosecoupling
   {
	   amt=amt-((discount/100));
	   System.out.println("Discount is:"+amt);
	   p.doTransaction(amt);
   }



	public static void main(String[] args) {
     OnlineShopping customer1=new OnlineShopping("Aashu",897647357);
	   CreditCard c1=new CreditCard(23456,233,5000);
		customer1.payBill(c1, 45000);
		
		DebitCard d1=new DebitCard(90992,80000);
		customer1.payBill(d1,30000,10);
	}

}
