package com.accesmodifier;

public class Demo {

	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
		
		//obj.a=89;//private is not accessible outside the class
		obj.b=67;
		obj.c=34;
		obj.d=56;
		
       // obj.show();
        obj.display();
        obj.test();
        obj.printMe();
	}

}
