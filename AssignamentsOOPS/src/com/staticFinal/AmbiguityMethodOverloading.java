package com.staticFinal;

//15.	WAP to show ambiguity in method overloading
public class AmbiguityMethodOverloading
{ 
	public int add(int a, int b)
	{
  return a + b;
  }
  public double add(double a, double b)
 {
  return a + b;
 }

public static void main(String[] args)
{
	AmbiguityMethodOverloading e1 = new AmbiguityMethodOverloading();

  int sum1 = e1.add(5, 10);
  System.out.println("Sum of two integers: " + sum1);

  double sum2 = e1.add(3.5, 2.5);
  System.out.println("Sum of two doubles: " + sum2);

}

}

