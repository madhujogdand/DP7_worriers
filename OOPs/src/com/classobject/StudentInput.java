package com.classobject;
import java.util.Scanner;
public class StudentInput{


		int stid;
		String name;
		float marks1;
		float marks2;
		float marks3;
		float per;
		char grade;
		
		void calPercentage()
		{
			per=((marks1+marks2+marks3)/300)*100;
		}
		
		void calGrade()

		{
			if(per>=90)
			   grade='A';
			else if(per>=75)
				grade='B';
			else if(per>=60)
				grade='C';
			else if(per>=40)
				grade='D';		
			else
				grade='F';
		}
		
		void display()
		{
			System.out.println("Id: "+stid+"Name: "+name+"Percentage: "+per+"%");
		    if(grade=='F')
		    	System.out.println("You have failed.... Try hard next time");
		    else
		    	System.out.println("Congratulations!! You have passed with grade: "+grade);
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			StudentInput s1= new StudentInput();
			System.out.println("Enter student id");
			s1.stid=sc.nextInt();
			
			System.out.println("Enter Name");
			s1.name=sc.next();
			
			System.out.println("Enter marks of sub1: ");
			s1.marks1=sc.nextInt();
			
			System.out.println("Enter marks of sub2: ");
			s1.marks2=sc.nextInt();
			
			System.out.println("Enter marks of sub3: ");
			s1.marks3=sc.nextInt();
			
			s1.calPercentage();
			s1.calGrade();
	       System.out.println();
	       
	       System.out.println("-------------------------------");
			s1.display();
		



	}

}
