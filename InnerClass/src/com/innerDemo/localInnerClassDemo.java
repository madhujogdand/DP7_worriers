package com.innerDemo;

class Outer
{
	private static int data = 10;

	void display()
	{
		class Inner
		{
			private int value = 90;

			static void show()
			{
				System.out.println(data);
			}

			void show1()
			{
				System.out.println(value);
			}
		}
		// object inside the method
		Inner i1 = new Inner();
		i1.show1();
		Inner.show();

	}
}

public class localInnerClassDemo {

	public static void main(String[] args) {
		Outer o1 = new Outer();
		o1.display();
     
	}

}
