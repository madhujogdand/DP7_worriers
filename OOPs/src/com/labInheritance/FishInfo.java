package com.labInheritance;

class Fish
{
	String name;
	int noOfGills;
	String breed;
	
	Fish()
	{
		System.out.println("Parent class constructor");
	}
	
	Fish(String name,int noOfGills,String breed)
	{
		this.name=name;
		this.noOfGills=noOfGills;
		this.breed=breed;
	}

	public String toString() {
		return "\nFish Details: \nname=" + name + "\nnoOfGills=" + noOfGills + "\nbreed=" + breed;
	}
	
}
class GoldFish extends Fish
{
	String livingType;
	String type;
	
	
	GoldFish(String name,int noOfGills,String breed,String livingType,String type)
	{
		super(name,noOfGills,breed);
		this.livingType=livingType;
		this.type=type;
	}
	
	
	public String toString() {
		return super.toString()+"GoldFish Details \nlivingType=" + livingType + "\ntype=" + type;
	}
}

class Whale extends Fish
{
	String wname;
	int size;
    
	Whale(String name,int noOfGills,String breed,String wname,int size)
	{
		super(name,noOfGills,breed);
		this.wname=wname;
		this.size=size;
	}


	public String toString() {
		return super.toString()+"Whale Details:\nname:" + wname + "\nsize:" + size;
	}
	

}

public class FishInfo {

	public static void main(String[] args) {
		GoldFish g=new GoldFish("GoldFish",6, "hfjd","Water","jwkw");
		System.out.println(g);
		
		Whale w=new Whale("Whale",6, "hfjd","Aquaries",50);
		System.out.println(g);
		

	}

}
