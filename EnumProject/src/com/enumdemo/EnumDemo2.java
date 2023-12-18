package com.enumdemo;

enum Season{SUMMER,WINTER,MONSOON}
public class EnumDemo2 {

	public static void main(String[] args) {
		Season s=Season.SUMMER;
		//Season s1=Season.WINTER;
		
		switch(s)
		{
		case SUMMER:System.out.println("Wear cotton clothes");
		            break;
		case WINTER:System.out.println("Wear wollen clothes");
                    break;
		case MONSOON:System.out.println("Carry umbrella");
                    break;
        default:System.out.println("Error");
		}

	}

}
