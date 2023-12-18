package com.labCovarient;



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
class SubCovarient2 extends Covarient
{
	Float show()
	{
		return 8.5f;
	}
}
class SubCovarient3 extends Covarient
{
	Character show()
	{
		return 'M';
	}
}
public class CovarientDemo {

	public static void main(String[] args) {
		Covarient c1;
		c1=new SubCovarient();
		System.out.println(c1.show());
		
		c1=new SubCovarient1();
		System.out.println(c1.show());
		
		c1=new SubCovarient2();
		System.out.println(c1.show());
		
		c1=new SubCovarient3();
		System.out.println(c1.show());
		
//		Integer i=(Integer) c1.show();
//		System.out.println(i);
//		
//		char ch='a';
//		int x=ch;
//		
//		
		
	}
}
