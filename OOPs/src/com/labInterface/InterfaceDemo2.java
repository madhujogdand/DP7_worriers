package com.labInterface;

interface A
{
	void show();
}
interface B
{
	void show();
}
class Simple implements A,B
{
	public void show()
	{
		System.out.println("Sowing Details");
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		A a;
		a=new Simple();
		a.show();
		
		B b;
		b=new Simple();
		b.show();

	}

}
