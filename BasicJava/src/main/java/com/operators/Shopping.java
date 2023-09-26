package com.operators;
import java.util.Scanner;
public class Shopping {


	public static void main(String args[])
	  {
	    
	    
	    Scanner sc=new Scanner(System.in);

	    System.out.println("Enter the prize of pizza:");
	    float prize=sc.nextFloat();
	    
	    System.out.println("Enter the no. of pizzas bought:");
	    int pizzas=sc.nextInt();
	    

	    System.out.println("Total:"+(prize*pizzas));
	    
	    sc.close();
	    
	  }
}
