package com.switchassignment;
import java.util.Scanner;
public class NumPrint {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
					
			System.out.println("Enter the number:");
			int num=sc.nextInt();
			
			switch(num)
			{
			case 1:System.out.println("1");
			     
			case 2:System.out.println("2");
		       
			case 3:System.out.println("3");
		       
			case 4:System.out.println("4");
		       
			case 5:System.out.println("5");
		       break;
		    default:System.out.println("default");
		    }
			sc.close();
		
	}
}
