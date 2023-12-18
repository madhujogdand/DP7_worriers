package com.InterfaceAdvance;

interface Calculations
{
	float pi=3.14f;
	void area();
    default void volume()
    {
    	System.out.println("in volume method");
    	show();
    }
    static void info()
    {
    	System.out.println("Geometry shape");
    	display();
    
    }
    private void show()
    {
    	System.out.println("Made by:Radha");
    	
    	
    }
    private static void display()
    {
    	System.out.println("pan no:HJFH67H");
    	
    }
    
}
//old class
class Square implements Calculations
{
	int side;
	
	public Square()
	{
		super();
	}

	public Square(int side) {
		super();
		this.side = side;
	}
	
    public void area()
    {
    	System.out.println("Area of square is:"+(side*side));
    }

}
class Cube implements Calculations
{
	int side;
	
	public Cube()
	{
		super();
	}

	public Cube(int side) {
		super();
		this.side = side;
	}
	
    public void area()
    {
    	System.out.println("Area of cube is:"+(6*side*side));
    }

    public void volume()
    {
    	System.out.println("Volume of cube is:"+(side*side*side));
    }
}


public class DefaultMethodDemo {

	public static void main(String[] args) {
		Calculations c;
		c=new Square(6);
		c.area();
		c.volume();

		c=new Cube(10);
		c.area();
		c.volume();
		
		Calculations.info();
	}

}
