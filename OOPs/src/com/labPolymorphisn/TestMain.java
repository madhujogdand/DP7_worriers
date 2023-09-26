package com.labPolymorphisn;

import java.util.Scanner;

class CalVolume {

	double calVolume(double radius, double height)
	{
		return 3.14 * radius * radius * height;
	}

	double calVolume(int length, int breadth, int height)
	{
		return length * breadth * height;
	}

}

public class TestMain
{

	public static void main(String[] args)
	{
		CalVolume v1=new CalVolume();
		System.out.println("Enter the choice:");
		System.out.println("1.Find volume for cylinder");
		System.out.println("2.Find volume for cuboid");
	    Scanner sc=new Scanner(System.in);
	    int choice=sc.nextInt();
	    if(choice==1)
	    {
	    	System.out.println("Enter the radius:");
	    	double radius=sc.nextDouble();
	    	System.out.println("Enter the height:");
	    	double height=sc.nextDouble();
	    	double output=v1.calVolume(radius,height);
	    	System.out.println("Volume of the cylinder is:"+output);
	    }
	    else if(choice==2)
	    {
	    	System.out.println("Enter the length:");
	    	int length=sc.nextInt();
	    	System.out.println("Enter the breadth:");
	    	int breadth=sc.nextInt();
	    	System.out.println("Enter the height:");
	    	int height=sc.nextInt();
	    	double output=v1.calVolume(length,breadth,height);
	    	System.out.println("Volume of the cuboid is:"+output);
	    	
	    }
	sc.close();
	}   

}
