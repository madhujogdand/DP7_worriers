package com.staticFinal;

//11.	WAP to show ways to access static variable
public class AccessStaticVariable
{
	public static int staticVar = 42;

  public static void main(String[] args)
  {     
      int var1 = AccessStaticVariable.staticVar;
      AccessStaticVariable s1 = new AccessStaticVariable();
      int var2 = s1.staticVar;

      System.out.println("Accessed using class name: " + var1);
      System.out.println("Accessed using object: " + var2);
  }
}