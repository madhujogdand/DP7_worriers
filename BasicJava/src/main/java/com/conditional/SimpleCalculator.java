package com.conditional;
import java.util.Scanner;
public class SimpleCalculator {
	
	public static void main(String args[]) {
	
		char ch;
	    do
		{
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the num1:");
		  int num1=sc.nextInt();
		  System.out.println("Enter the num2:");
		  int num2=sc.nextInt();
					
		 System.out.println("Enter which operation you want to perform:\n1.Add\n2.Subtract\n3.Multiply\n4.Division\n5.Modulus");
		 int operation=sc.nextInt();
		
		switch(operation)
		{
		case 1:
		       System.out.println("Addition of two no:"+(num1+num2));
		       break;
		case 2:      
		      System.out.println("Subtraction of two no:"+(num1-num2));
		      break;
		case 3:
		       System.out.println("Multiplication of two no:"+(num1*num2));
		       break;
		case 4:       
		       System.out.println("Division of two no:"+(num1/num2));
		       break;
		case 5:       
		       System.out.println("Modulus of two no:"+(num1%num2));
	           break;
	    default:System.out.println("Invalid Number");
		}
		
		System.out.println("Do you want to continue.... press y or n.. ");
		ch=sc.next().charAt(0);
      }while(ch!='n');
   }
}
