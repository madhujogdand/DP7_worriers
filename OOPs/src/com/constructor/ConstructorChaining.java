package com.constructor;



	class Demo
	{
		int a;
		int b;
		String name;
		
//		Demo()
//		{
//			a=10;
//			b=20;
//			name="Unknown";
//		}
//		Demo(int a, int b)
//		{
//			this.a=a;
//			this.b=b;
//			name="Unknown";
//		}
		
		Demo()
		{
			this(10,20); //Always has to first statement
			System.out.println("Default constructor");
		}
		Demo(int a,int b)
		{
			System.out.println("param Constructor");
             this.a=a;
             this.b=b;
             this.name="unknown";
		}
		Demo(int a, int b, String name)
		{
			System.out.println("param constructor 2");
			this.a=a;
			this.b=b;
			this.name=name;
		}
		public String toString()
		{
			return a+" "+b+" "+name;
		}
		
    }
	public class ConstructorChaining {
	public static void main(String[] args) {
		System.out.println("-----------");
		Demo d1=new Demo();
		System.out.println(d1);
		
		System.out.println("--------------");
		Demo d2=new Demo(30,40);
		System.out.println(d2);
		
		System.out.println("----------");
		Demo d3=new Demo(100,200,"Madhu");
		System.out.println(d3);
	

	}

}
