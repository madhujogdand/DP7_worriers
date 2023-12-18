package com.staticFinal;

//17.	WAP to override the static method.

class Parent
{
  static void staticMethod()
  {
      System.out.println("Static method in Parent class");
  }
}

class Child extends Parent
{
 
  static void staticMethod()
  {
      System.out.println("Static method in Child class");
  }
}
public class StaticOverride
{
	 public static void main(String[] args)
	 {
	        
	        Parent.staticMethod(); 
	        Child.staticMethod();   
	        System.out.println("--------------------------------------");
	        Parent p1 = new Child();
	        p1.staticMethod();   
	        System.out.println("--------------------------------------");
	        Child p2 = new Child();
	        p2.staticMethod();
	        System.out.println("--------------------------------------");
	    }
	

}