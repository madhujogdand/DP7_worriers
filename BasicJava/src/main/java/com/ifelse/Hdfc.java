package com.ifelse;
import java.util.Scanner;
public class Hdfc {
public static void main(String args[]) 
{
	Scanner sc=new Scanner(System.in);
	
	int balance=10000;
	int pin=1234;
	
	System.out.println("Enter pin:");
	int ATMpin=sc.nextInt();
	
	
	if(ATMpin==pin)
	{
	   System.out.println("1 Deposit");
	   System.out.println("2 withdraw");
	   System.out.println("3 Check balance");
	   System.out.println("4 Exit");
	      
	 
	  System.out.println("Enter choice:");
	  int choice=sc.nextInt();
	  
	  switch(choice)
	  {
	  case 1:System.out.println("Enter amount to deposite"); 
		 int depamount=sc.nextInt();
		 balance+=depamount; //shortHand
		 System.out.println("After deposite amount:"+balance);
	     break;
	  
	  case 2: System.out.println("Enter amount to withdraw"); 
			 int wdamount=sc.nextInt();
			 balance-=wdamount;//shorthand
			 System.out.println("After withdraw amount:"+balance);
			 break;
			 
	  case 3: System.out.println("Check balance:"+balance);
		    break;
			 
	  case 4: System.out.println("Exit");
	        break;
		default:  System.out.println("Invalid Choice");
	  }
	}
	  else
	   {
		  System.out.println("please enter correct pin");
	   }
	sc.close();
	
}
}
