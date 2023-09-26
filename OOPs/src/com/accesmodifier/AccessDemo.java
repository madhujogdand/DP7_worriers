package com.accesmodifier;

public class AccessDemo {
  private int a;
  int b;//default
  protected int c;// used in inheritance
  public int d;
  
  private void show()
  {
	  System.out.println("Hello");
  }
  
  void display()
  {
	  System.out.println("Welcome");
  }
  protected void printMe()
  {
	  System.out.println("Hi");
  }
  
  public void test()
  {
	  System.out.println("Test");
  }
  
  public static void main(String args[]) {
	  //inside the class everything is accesible
	  AccessDemo obj=new AccessDemo();
	  obj.a=89;
      obj.b=67;
      obj.c=89;
      obj.d=56;
      
      obj.show();
      obj.display();
      obj.printMe();
      obj.test();
      
  }
	  
  }

