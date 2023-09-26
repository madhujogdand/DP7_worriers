package com.constructor;

class MyClass 
{
    int a;
    int b;
    
    MyClass()
    {
    	this(10,20);//2) constr chaining
    }
    
    MyClass(int a,int b)//1)differentiate between argument and instance variable
    {
    	this.a=a;
    	this.b=b;
    }
    void display()
    {
    	int a;
    	a=99;
    	System.out.println("Local:"+a);//99:local variable
    	System.out.println("Instance:"+this.a);
    	addition(this); //4)to call one method from another method
 	   // addition(this);
 	   
 	   MyClass obj= new MyClass(4,5);
 	   this.addition(obj);
 	   // this.addition(obj);
 	   
    }
    // instance method
    void addition(MyClass c) // 3) to pass one object to another
    {
 	   this.a= this.a+c.a; // here this.a id for c1.a
 	   this.b=this.b+c.b;
 	   
    }
    
    MyClass displayValues() //5) to return the current object
    {
 	   a=a+10;
 	   b=b+10;
 	   return this;
    }

}

public class ThisDemo {

	public static void main(String[] args) {
          MyClass c1=new MyClass();
  		MyClass c2= new MyClass(30,40);
		
  		//	c2.display();
  			
  			System.out.println("Before c1:");
  			System.out.println(c1.a+ " " +c1.b);
  			
  			c1.addition(c2);
  			
  			System.out.println("After c1:");
  			System.out.println(c1.a+ " " +c1.b);
  			
  			System.out.println("----------------------------");
  			
  			MyClass c3 = new MyClass(100,200);
  			System.out.println("Before c3:");
  			System.out.println(c3.a+ " " +c3.b);
  			
  			c3.display();
  			
  			System.out.println("After c3:");
  			System.out.println(c3.a+ " " +c3.b);
  			
  			
  			System.out.println("----------------------------");
  			
  			MyClass c5;
  			
  			MyClass c4 = new MyClass(1,2);
  			System.out.println("Before c4:");
  			System.out.println(c4.a+ " " +c4.b);
  			c5=c4.displayValues();
  			System.out.println("After c5:");
  			System.out.println(c5.a+ " " +c5.b);
  			
  			
		
	}

}
