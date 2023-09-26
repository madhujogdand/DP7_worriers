package com.labAssignment;

import java.util.Scanner;

public class IncDecBouncy {
	static boolean checkIncrease(int num)
	{
	    int rem1=num%10;
	    num/=10;
	    boolean status=true;
	     while(num!=0)
	    {
	    	int rem2=num%10;
	    	if(rem1>rem2)
	    	{
	    		rem1=rem2;
	    	}
	    	else
	    	{
	    	status=false;
	    	break;
	        }
           num/=10;
	    }
	    return status;
	}
	
	static boolean checkDecrease(int num2)
	{
	    int rem1=num2%10;
	    num2/=10;
	    boolean status=true;
	    while(num2!=0)
	    {
	    	int rem2=num2%10;
	    	if(rem1<rem2)
	    	{
	    		rem1=rem2;
	    	}
	    	else
	    	{
	    	status=false;
	    	break;
	        }
           num2/=10;
	    }
	    return status;
	}
      
	
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter number: ");
    	int num=sc.nextInt();
    	//int num1=13689; 
    	//int num2=875321;
    	//int num3=123742;
    	
    	boolean increasing=checkIncrease(num);
    	boolean decreasing=checkDecrease(num);
    	
    	if(increasing==true)
    	{
    		System.out.println("no is in increasing order");
    	}
    	else if(decreasing==true)
    	{
    		System.out.println("no is in decreasing order");
    	}
    	else 
    	{
    		System.out.println("no is in Bouncy order");
    	}
    	sc.close();
     }
 }
      
      
      

