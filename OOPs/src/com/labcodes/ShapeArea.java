package com.labcodes;

class Shape
{
	void display()
	{
		System.out.println("Area of Shape");
	}
}

class Circle extends Shape
{
	void display()
	{
		int r=12;
		float pi=3.14f;
		System.out.println("Area of circleis:"+3.14*r*r);
	}
}
public class ShapeArea {

	public static void main(String[] args) {
		Circle c=new Circle();
			c.display();	

	}

}
