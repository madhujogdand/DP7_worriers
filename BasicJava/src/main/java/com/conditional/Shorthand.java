package com.conditional;

public class Shorthand {
	
	public static void main(String args[]) {
		
	byte b1=70;
	byte b2=12;
	
	b1=(byte)(b1+b2);
	
	System.out.println(b1);
	
	byte num1=23;
	byte num2=10;
	
	//num1=num1+num2;
	
	num1+=num2;//remove type casting issues
	
	System.out.println(num1);
	
	short S1=67;
	short S2=2;
	
	//S1=S1*S2
	
	short pro;
	
	//pro=S1*S2; ... cannot perform short hand here
	
	S1*=S2;
	
	
	
	
	
	

	}
	

}
