package com.operators;

public class TyepeCastingDemo {

	public static void main(String Args[]) {
	//-128 to 127	
	byte num1=78;
	byte num2=50;
	
	//all math opr always return min int
	// casting
	
	byte sum=(byte)(num1+num2);
	
	short s1=78;
	short s2=56;
	
	short r=(short)(s1+s2);
	
	System.out.println(r);
	System.out.println(sum);
	
	float n1=(float)78.5;
	float n2=67.3f;
	
	int result=(int)(n1+n2);
	System.out.println(result);
	
	int a=90;
	int b=45;
	
	float ans=a+b;
	
	System.out.println(ans);
	
	
	
	
	
	
	
	
	}
	

	
	
}
