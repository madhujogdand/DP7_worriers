package com.labcodes;

class Building
{
	int flatNo;
	int floor;
	int noOfMembers;
	char wing;
	static String bName="Royal Building pvt ltd.";
	
	static 
	{
		bName=bName+"\nChanged Name:Samruddhi";
	}
	
	Building(int flatNo,int floor, int noOfMembers,char wing)
	{
		this.flatNo=flatNo;
		this.floor=floor;
		this.noOfMembers=noOfMembers;
		this.wing=wing;
		
	}
	
	static void playArea()
	{
		System.out.println("Play area belongs to "+bName);
	}
	
	static void swimmingPool()
	{
		System.out.println("Swimming pool belongs to"+bName);
	}
	
	public String toString()
	{
		return "\nFlat no:"+flatNo+"\nFloor:"+floor+"\nNo of Members:"+noOfMembers+"\nWing:"+wing+"\nBuilding Name:"+bName;
	}
	
}
public class BuildingInfo {

	public static void main(String[] args) {
		Building.playArea();
		Building.swimmingPool();
		
		Building b1=new Building(101,2,5,'B');
		System.out.println(b1);
		
		Building b2=new Building(102,3,5,'c');
		System.out.println(b1);
		
	}

}
