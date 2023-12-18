package com.OOPs;

class Box
{
	float length;
	float width;
	float height;
	
	void calVolume()
	{
	  System.out.println("Volume of Box:"+(length*width*height));	
	}
	
}
public class VolumeOfBox {

	public static void main(String[] args) {
		Box b=new Box();
		b.height=5.3f;
		b.length=3.0f;
		b.width=4.0f;
		b.calVolume();

	}

}
