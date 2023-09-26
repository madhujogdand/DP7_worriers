package com.polymorphismm;

class Calculate
{
	void square(int sqr )
	{
		System.out.println("Square is:"+(sqr*sqr));
	}
	void addition(int a,int b)
	   {
		   System.out.println("Addition is:"+(a+b));
	   }
	   
	   void multiply(float n1, float n2)
	   {
		   System.out.println("Multiplication is:"+(n1*n2));
	   }
}

public class Calculator {

	public static void main(String[] args) {
		Calculate square=new Calculate();
        square.square(6);
        
        Calculate addition=new Calculate();
        addition.addition(5,4);
        
        Calculate multiply=new Calculate();
        multiply.multiply(4.5f,3.5f);

	}

}
