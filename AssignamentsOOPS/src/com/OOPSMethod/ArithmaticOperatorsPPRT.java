package com.OOPSMethod;
//9

public class ArithmaticOperatorsPPRT {
	
	
 void addition(int a,int b)
 {
	 System.out.println("Addition is:"+(a+b));
 }
 void subtraction(int a,int b)
 {
	 System.out.println("Subtraction is:"+(a-b));
 }
 void Multiplication(int a,int b)
 {
	 System.out.println("Multiplication is:"+(a*b));
 }
 void Division(int a,int b)
 {
	 System.out.println("Diviaion is:"+(a/b));
 }
 void Modulus(int a,int b)
 {
	 System.out.println("Modulus is:"+(a%b));
 }
	public static void main(String[] args) {
		ArithmaticOperatorsPPRT a=new ArithmaticOperatorsPPRT ();
		
		
		a.addition(80,60);
		a.subtraction(90,50);
		a.Multiplication(50,40);
		a.Division(90,40);
		a.Modulus(80,90);

	}

}
