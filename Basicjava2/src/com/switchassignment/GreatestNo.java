package com.switchassignment;
import java.util.Scanner;
public class GreatestNo {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter Num1:");
	   int num1=sc.nextInt();
	   System.out.println("Enter Num2:");
	   int num2=sc.nextInt();
	   int status;
	   
	   status=(num1>num2)?num1:num2;
	   System.out.println(status+"is greaterst");
	   
	   sc.close();
	   
	   
	   
   }
}
