package com.logicaltest1;

public class Out_1
{
	
		public static void main(String[] args)
		{
			Car bmw = new Car("red");
			Car wagonR = new Car("blue");
			System.out.println(bmw.wheels);
			System.out.println(bmw.color);
		}
}

	class Car
	{
		static int wheels;
		static
		{
			m1();
		}

		{
			System.out.println(++wheels);
		}

		Car(String color)
		{
			this.color = color ;
		}

		static void m1()
		{	
			System.out.println(color);
		}

		static String color = "Red";

		static
		{
			m1();
		}

		{
			++wheels;
		}
	}


