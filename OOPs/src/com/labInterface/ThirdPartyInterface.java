package com.labInterface;

interface Fold
{
	void foldable();
}
class Mobile
{
	int Price;
	String mName;
	
	Mobile(int price,String mName)
	{
		this.Price=price;
		this.mName=mName;
	}

	public String toString()
	{
		return "Mobile Details:\nPrice=" + Price + "\nMobile Name=" + mName;
	}
	
}
class Vivo extends Mobile implements Fold
{
	String configuration;
	
	Vivo(int price,String mName,String configuration)
	{
		super(price,mName);
		this.configuration=configuration;
	}
	
	public void foldable()
	{
		System.out.println(mName+" is foldable mobile");
	}
	public String toString()
	{
		return super.toString()+"\nConfiguration:"+configuration;
	}
}


public class ThirdPartyInterface {

	public static void main(String[] args) {
		Vivo v=new Vivo(20000,"Vivo","mnbok");
		System.out.println(v);
		v.foldable();
		

	}

}
