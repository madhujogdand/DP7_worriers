package com.classobject;

import com.accesmodifier.AccessDemo;
//import com.accesmodifier.*;// all class will be imported
public class Demo1 {

	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
		// default is accesible within the package
		//obj.a=67;
		//obj.b=78;
		obj.d=56;
		
		//obj.show();
		//obj.display();
		obj.test();
	}
}
