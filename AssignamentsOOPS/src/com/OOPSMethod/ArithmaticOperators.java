package com.OOPSMethod;
//8

public class ArithmaticOperators {
	int a;
	int b;
 void addition()
 {
	 System.out.println("Addition is:"+(a+b));
 }
 void subtraction()
 {
	 System.out.println("Subtraction is:"+(a-b));
 }
 void Multiplication()
 {
	 System.out.println("Multiplication is:"+(a*b));
 }
 void Division()
 {
	 System.out.println("Diviaion is:"+(a/b));
 }
 void Modulus()
 {
	 System.out.println("Modulus is:"+(a%b));
 }
	public static void main(String[] args) {
		ArithmaticOperators a=new ArithmaticOperators ();
		a.a=60;
		a.b=50;
		
		a.addition();
		a.subtraction();
		a.Multiplication();
		a.Division();
		a.Modulus();

	}

}
