package com.labAssignment;
import java.util.Scanner;
public class AutomorphicNum {

 static void checkAutomorphic(int num)
	  {
		  int original=num;
		  int count=0;
		  int pow=1;
		  int square=num*num;
	      while(num!=0)
		  {
			 // int rem=num%10;
			  count++;
			  num/=10;
		  }
	  
         for(int i=1;i<=count;i++)
         {
    	   pow=pow*10;
         }
         
         if(square%pow==original)
         {
        	 System.out.println(original+" is Automorphic number");
         }
         else
         {
        	 System.out.println(original+" is not automorphic number");
         }
	  }   
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	
    checkAutomorphic(num);
	}

}
