package com.AbstractInterface;

abstract class Equipment
{
	void fill()
	{
		System.out.println("This is concrete method");
		System.out.println("this is filling equipment");
	}
	abstract void mix();

}
class CementMixer extends Equipment
{

	@Override
	void mix()
	{
		System.out.println("This is cement mixer");
	}
	void pour()
	{
		System.out.println("This is pouring equipment");
	}
	
}
public class ACEquipment {

	public static void main(String[] args) {
		CementMixer c=new CementMixer();
		c.fill();
		c.mix();
		c.pour();
		System.out.println("-----------------------------------------");
		Equipment e=new CementMixer();
		e.fill();
		e.mix();
		//e.pour();

	}

}
