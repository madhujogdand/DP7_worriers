package com.SuperThisConstructorChaining;
//1,2,3
public class Cycle {//1
	int accNo;
	int noOfWheels;

	Cycle()//2
	{
		System.out.println("I am in default constructor");
	}
	Cycle(int accNo,int noOfWheels)//3
	{
		this();
		this.accNo=accNo;
		this.noOfWheels=noOfWheels;
		System.out.println("I am parameterised constructor");
	}
	public static void main(String[] args) {
        Cycle c=new Cycle();//4
       // System.out.println(c);
        Cycle c1=new Cycle(12345,2);//5
        //System.out.println(c1);
	}

}
