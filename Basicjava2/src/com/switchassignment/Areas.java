package com.switchassignment;

import java.util.Scanner;

public class Areas {
	public static void main (String args[]) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter radius:");
		 double radius=sc.nextDouble();
		 System.out.println("Enter side:");
		 double side=sc.nextDouble();
		 System.out.println("Enter base:");
		 double base=sc.nextDouble();
		 System.out.println("Enter height:");
		 double height=sc.nextDouble();
		 System.out.println("Enter breadth:");
		 double breadth=sc.nextDouble();
		 
		 double pi=3.14;
		 System.out.println("1 Area of circle");
	     System.out.println("2 Area of square");
		 System.out.println("3 Area of right angled triangle");
		 System.out.println("4 Area of rectangle");
		 System.out.println("5 Circumference of circle");    
		 System.out.println("6 Perimeter of square ");
		  
		 System.out.println("Enter choice:");
		  int choice=sc.nextInt();
		  
		 switch(choice)
		 {
		 case 1:System.out.println("Area of circle is: "+(pi*radius*radius));
		       break;
		 case 2:System.out.println("Area of square is: "+(side*side));
		       break;
		 case 3:System.out.println("Area of right angled triangle"+(base*height)/2);
		       break;
		 case 4:System.out.println("Area of rectangle: "+2*(breadth+height));
		       break;
		 case 5:System.out.println("Circumference of circle"+2*pi*radius);
		       break;
		 case 6:System.out.println("Perimeter of square: "+4*side);
		       break;
		 default:System.out.println("invalid choice");
        }
		 sc.close();
	}
}