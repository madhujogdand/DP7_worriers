package com.staticFinal;
/*4.	Check following variations:
a.	Static variable and Non-Static (Instance Variable) – Just declare and print it.
b.	See if you can access static variable in static method
c.	non static variable in static method
d.	then static variable in non-static method
e.	non static variable in non-static method Note: non static means instance variable
*/
public class Q4Variations {
	
	//a
	private static int totalCarSoldStatic=0;//static variables
	private int totalCarSoldInstance=0;//non static variables
	
	Q4Variations()
	{
		totalCarSoldStatic++;
		totalCarSoldInstance++;
	}
	
	//b
	public void nonstaticMethod()
	{
		System.out.println("Accessing static variable in static method: "+totalCarSoldStatic);//b
		System.out.println("Accessing non-static variable in non-static method: "+totalCarSoldInstance);//c
	
	}
	
	//b&c
	public static void staticMethod()
	{
		System.out.println("Accessing static variable in static method: "+totalCarSoldStatic);//b
		//System.out.println("Accessing non-static variable in non-static method: "+totalCarSoldInstance);//c
	
	}
	
	public static void main(String[] args) {
		//declare and print static variable
		System.out.println("Static variable: "+totalCarSoldStatic);
		
		//declare and print non-static variable
		Q4Variations car1=new Q4Variations();
		System.out.println("Non static variables: "+car1.totalCarSoldInstance);
	
		//access static variable in static method
		staticMethod();
		
		
		//access nonstatic variable in non-static method
		car1.nonstaticMethod();
				
	
	}

}
