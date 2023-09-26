package com.operators;

import java.util.Scanner;

public class StudentInfo {
	
	public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	
      System.out.println("Enter Your Name:");
      String name=sc.next();
     System.out.println("Enter your age:");
     int age=sc.nextInt();
      System.out.println("Enter your height:");
      float height=sc.nextFloat();
      System.out.println("Enter your gender:");
       char gender=sc.next().charAt(0);

       System.out.println("Name:"+name+"age:"+age+"height:"+height+"gender:"+gender);
       
       sc.close();
	}
}