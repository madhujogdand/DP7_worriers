package com.enumassignment;

/*1.	Create enum seasons { SPRING , SUMMER, AUTUMN } .
In main method create enum variable for any of above enum constant and display its value.
5.	Create two objects of type enum and compare them.
6.	Use enums in switch statement*/

enum Seaso{SPRING,SUMMER,AUTUMN}
public class Seasons{

	private String description;
	
	Seasons(String descriString)
	{
		this.description=description;
	}
	
	
	public String getDescription()
	{
		return description;
	}


	public static void main(String[] args) {
		Seaso s=Seaso.SUMMER;
		Seaso s3=Seaso.SUMMER;
		if(s==s3)
			System.out.println("Equals");
		if(s.equals(s3))
			System.out.println("Equals");
		//Season s1=Season.SPRING;
		//Season s2=Season.AUTUMN;
		switch(s)
		{
		case SPRING:System.out.println("Flowers bloom");
		            break;
		case SUMMER :System.out.println("Hot and sunny");
                    break;
		case AUTUMN:System.out.println("Falling leaves");
                    break;
        default:System.out.println("Error");
		}

	}

}
