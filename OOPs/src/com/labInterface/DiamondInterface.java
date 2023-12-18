package com.labInterface;

interface Mother
{
	void loan();
}
interface Father
{
	void loan();
}
class M implements Mother
{

	public void loan()
	{
		System.out.println("loan is taken by mother");
		
	}
	
}
class F implements Father
{

	public void loan()
	{
		System.out.println("loan is taken by Father");
		
	}
	
}
class Son implements Mother,Father
{
	Mother m=new M();
	Father f=new F();
	public void loan()
	{
		m.loan();
		f.loan();
	
		System.out.println("loan of mother and father is repay by son");
		
	}
	
}
public class DiamondInterface {

	public static void main(String[] args) {
		Son s=new Son();
		s.loan();	
	}

}
