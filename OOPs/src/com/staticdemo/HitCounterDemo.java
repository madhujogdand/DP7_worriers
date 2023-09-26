package com.staticdemo;

class Counter
{
	static int count = 0;
	int x;

   // instance block: common code on creation of object
    {
    	//System.out.println("in instance block");
    	count++;
    }
    
    Counter()
    {
    	//System.out.println("Default constructor");
    	int x=0;
    	//count++;
    }
    
    Counter(int x)
    {
    	//this();
    	this.x=x;
    }
}
public class HitCounterDemo {

	public static void main(String[] args) {
		
		Counter c1=new Counter();
		//System.out.println(Counter.count);
		
		Counter c2=new Counter();
		//System.out.println(Counter.count);
		
		Counter c3=new Counter();
		System.out.println(Counter.count);
		
		Counter c4=new Counter(80);
		System.out.println(Counter.count);
		
		

	}

}
