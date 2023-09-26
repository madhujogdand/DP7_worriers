package com.labOverriding;

class Covarient
{
	Object show()
	{
		return new Object();
	}
}

class SubCovarient extends Covarient
{
	Integer show()
	{
		return 10;
	}
}
class SubCovarient1 extends Covarient
{
	String show()
	{
		return "MNOP";
	}
}
public class CovarientDemo {

	public static void main(String[] args) {
		Covarient c1;
		c1=new SubCovarient();
		System.out.println(c1.show());
		
		c1=new SubCovarient1();
		System.out.println(c1.show());
		
		Covarient c2=new Covarient();
		Integer a=(Integer) c2.show();
		System.out.println(a);
	}
}
