package com.OOPs;

class Area
{
	float length;
	float width;
	
	void calArea()
	{
		 System.out.println("area of rectangle:"+(length*width));	
		
	}
}
public class AreaOfRectangle {

	public static void main(String[] args) {
		Area a=new Area();
		a.length=5f;
		a.width=6f;
		a.calArea();

	}

}
