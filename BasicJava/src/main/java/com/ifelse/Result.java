package com.ifelse;
import java.util.Scanner;
public class Result {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=sc.next();
		System.out.println("Enter the marks of sub1:");
		int sub1=sc.nextInt();
		System.out.println("Enter the marks of sub2:");
		int sub2=sc.nextInt();
		System.out.println("Enter the marks of sub3:");
		int sub3=sc.nextInt();
	    System.out.println("Enter the marks of sub4:");
	    int sub4=sc.nextInt();
	    System.out.println("Enter the marks of sub5:");
	    int sub5=sc.nextInt();
	    
	    int total=sub1+sub2+sub3+sub4+sub5;
	    double per=(total*100/500);
	    
	   if(per>=35)
	    {
	       System.out.println(name+"has scored"+per+"%"+"Congratulations!! Passed and Promoted");
	    }
	    else
	    {
	    	System.out.println(name+"has scored"+per+"%"+"You have Failed!! Try hard next time");
	    	
	    }
	    
	    
		sc.close();

	    				
		
	}

}
