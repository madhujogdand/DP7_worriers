package com.polymorphism;
//4
class Shape
{
	void draw()
	{
		System.out.println("Draw Shapes");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw Circle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Draw Square");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Draw Rectangle");
	}
}
public class Shapes {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.draw();
		Rectangle r=new Rectangle();
          r.draw();
        Square sq=new Square();
          s.draw();
        Circle c=new Circle();
          c.draw();
	}

}
