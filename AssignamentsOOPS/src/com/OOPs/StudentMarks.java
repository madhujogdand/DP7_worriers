package com.OOPs;

import java.util.Scanner;

class Marks
{
	String name;
	int sub1;
	int sub2;
	int sub3;
	
	Marks(String name,int sub1,int sub2,int sub3)
	{
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	void calPercentage()
	{
		int total=sub1+sub2+sub3;
		int percentage=total/3;
		System.out.println("Percentage :"+percentage+"%");
       
	      if(percentage>=75)
		   {
			   System.out.println("1st class");
		   }
		   else if(percentage>=55)
		   {
			   System.out.println("2nd class"); 
		   }
		   else if(percentage>=35)
		   {
			   System.out.println("3rd class");
		   }
		   else
		   {
			   System.out.println("fail"); 
		   }
	   }
}
public class StudentMarks {
   
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=5;i++)
	{
		System.out.println("Enter Student name:"+i);
		String name=sc.next();
		System.out.println("Enter sub1 Marks:"+i);
		int sub1=sc.nextInt();
		System.out.println("Enter sub2 Marks:"+i);
		int sub2=sc.nextInt();
		System.out.println("Enter sub3Marks:"+i);
		int sub3=sc.nextInt();
		
		Marks m=new Marks(name,sub1,sub2,sub3);
		m.calPercentage();
		
	}
    sc.close();
	}

}
