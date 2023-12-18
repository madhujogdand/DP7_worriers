package com.OOPSMethod;
//10

public class ArithmaticOperatorsPPara {
	
	
 int addition(int a,int b)
 {
	
	 return (a+b);
 }
 int subtraction(int a,int b)
 {
	
	 return (a-b) ;
 }
 int multiplication(int a,int b)
 {
	
	 return (a*b) ;
 }
 int division(int a,int b)
 {

	 return (a/b);
 }
 int modulus(int a,int b)
 {
	
     return (a%b);
 }
	public static void main(String[] args) {
		ArithmaticOperatorsPPara a=new ArithmaticOperatorsPPara ();
		int add=a.addition(80,60);
		System.out.println("Addition is:"+add);
		int sub=a.subtraction(90,50);
		 System.out.println("Subtraction is:"+sub);
		int mult=a.multiplication(50,40);
		 System.out.println("Multiplication is:"+mult);
		int div=a.division(90,40);
		 System.out.println("Diviaion is:"+div);
		int mod=a.modulus(80,90);
		 System.out.println("Modulus is:"+mod);

	}

}
