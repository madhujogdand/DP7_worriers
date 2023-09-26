package com.loop;
import java.util.Scanner;
public class HBD {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Name: ");
	    String name=sc.next();
	    System.out.println("Enter year: ");
	    int year=sc.nextInt();
	    int result=0;
	    for(int i=1;i<year;i++)
	    {
	    	result=year*year*year;
	    }
	    System.out.println("On 5th birthday"+" "+name+" "+"got"+" "+result+" "+"coins");
	    
	    
	    sc.close();
	}    
}
