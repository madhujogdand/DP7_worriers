package com.labcodes;

class Shape1
{
	void area(int l,int h,int b)
	{
		System.out.println("area of rectangle is:"+l*b*h);
	}
	
	void area(int r)
	{
		System.out.println("area of circle is:"+3.14*r*r);
	}
	void area(float s )
	{
		System.out.println("area of circle is:"+s*s);
	}

}


public class ShapeVolums {

	public static void main(String[] args) {
		Shape1 s=new Shape1();
		s.area(3,6,4);
		s.area(7f);
		s.area(4);

	}

}
