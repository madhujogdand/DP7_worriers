/*Write a Java program to input electricity consumption unit and 
 calculate total electricity bill according to the given condition: 
 For first 50 units Rs. 0.50/unit 
 For next 100 units Rs. 0.75/unit 
 For next 100 units Rs. 1.20/unit
 For unit above 250 Rs. 1.50/unit 
 An additional surcharge of 20% is added to the bill*/

package com.ifelse;
import java.util.Scanner;
public class ElectricityCons {
	
	public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter electricity consumption unit:");
	int unit=sc.nextInt();
	double total;
	if(unit<50)
	{
		total=unit*0.5;
		System.out.println("Your total bill amount is:"+total);
	}	
	else if(unit<150)
	     {
		    total=50*0.5+(unit-50)*0.75;
		    System.out.println("Your total bill amount is:"+total);
		   
	     }
	     else if(unit<=250)
	          {
	    	    total=50*0.5+100*0.75+(unit-150)*1.20;
	 		    System.out.println("Your total bill amount is:"+total);
	          }
	     
    else
    {
    	total=50*0.5+100*0.75+100*1.20+(unit-250)*1.5;
		System.out.println("Your total bill amount is:"+total);
    }	
	
	total=total+total*0.2;
	System.out.println("Your final bill is:"+total);	
   sc.close();	
	}
	
  }
