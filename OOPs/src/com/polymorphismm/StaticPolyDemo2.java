package com.polymorphismm;
class Shape1
{
	
   static void area(int side)
   {
	   System.out.println("Area of square is :"+(side*side));
   }
   
   static void area(int len, int br)
   {
	   System.out.println("Area of rectangle is :"+(len*br));
   }
   
   static void area(float radius)
   {
	   float pi=3.14f;
	   System.out.println("Area of circle:"+(pi*radius*radius));
   }


}

public class StaticPolyDemo2 {
public static void main(String[] args) {
		
		Shape1.area(8);
		Shape1.area(7f);
		Shape1.area(3, 12);
		
	}

}
