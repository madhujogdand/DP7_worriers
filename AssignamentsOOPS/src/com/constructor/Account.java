package com.constructor;

//1,2,3,4,5,6,7,8
public class Account // 1
{
	long accNo;
	String cName;

//	Account()// 3&8
//	{
//		accNo = 1233567;
//		cName = "Santosh";
//		System.out.println("I am in default constructor");
//	}

	Account(long accNo, String cName)// 5
	{
		this.accNo = accNo;
		this.cName = cName;
		System.out.println("I am in parameterizes constructor");
	}

	public static void main(String[] args) {
//		Account a = new Account();// 2
//		System.out.println("Account no:" + a.accNo);
//		System.out.println("Customer name:" + a.cName);
//		Account a1 = new Account();// 4
//		System.out.println("Account no:" + a1.accNo);
//		System.out.println("Customer name:" + a1.cName);
		Account a2 = new Account(12345678,"Radha");// 6
		System.out.println("Account no:" + a2.accNo);
		System.out.println("Customer name:" + a2.cName);
		 Account a3=new Account(5674838,"Neha");//7
	      System.out.println("Account no:"+a3.accNo);	  
			System.out.println("Customer name:"+a3.cName);
			 Account a4=new Account(738465738,"Supriya");//7
		      System.out.println("Account no:"+a4.accNo);	  
				System.out.println("Customer name:"+a4.cName);	  
	}

}
