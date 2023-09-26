package com.labcodes;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer c1=new Customer();
		char ch;
		c1.setC_Id(101);
	    c1.setC_name("Madhu");
	    c1.setAcc_no(112345678);
	    c1.setBalance(10000);
	    System.out.println(c1);
	    
	    System.out.println("Which operation do you want...c or d");
	    ch=sc.next().charAt(0);
	    System.out.println("Enter the amount: ");
	    double amount=sc.nextDouble();
	   
	    if(ch=='c')
	    {
	    	double balance=c1.getBalance();
	    	balance=balance+amount;
	    	System.out.println(amount+"Credited");
	        System.out.println("Available balance is: "+balance);
	    }
	    
	    if(ch=='d')
	    {
	    	double balance=c1.getBalance();
	    	balance=balance-amount;
	        System.out.println(amount+"debited");
	        System.out.println("Available balance is: "+balance);
	    	
	    }
	    sc.close();
    }


}

