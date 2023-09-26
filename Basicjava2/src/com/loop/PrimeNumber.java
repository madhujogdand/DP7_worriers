package com.loop;
import java.util.Scanner; 
public class PrimeNumber {
	
	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter number: ");
		    int num=sc.nextInt();
		    boolean flag=false;
		    //int count=0; 
		    for(int i=2;i<num;i++)// for(int i=2;i<=num/2;i++)
		    {
			  if(num%i==0) 
			  {
			   flag=true;
				  //count=1;
				  break;
			  }
			  
		    }
		    if(flag==false)//(count==0)
		    {
		    	System.out.println(num+"is Prime no.");
		    }
		    else
		    {
		    	System.out.println(num+"is Not a prime number");
		    }
		    sc.close();
	}
	}

